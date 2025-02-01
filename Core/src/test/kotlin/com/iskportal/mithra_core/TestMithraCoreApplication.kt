package com.iskportal.mithra_core

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<MithraCoreApplication>().with(TestcontainersConfiguration::class).run(*args)
}
