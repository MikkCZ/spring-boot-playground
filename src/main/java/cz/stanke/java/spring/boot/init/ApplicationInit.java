/*
 * Copyright 2017 Michal Stanke <michal@stanke.cz>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cz.stanke.java.spring.boot.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application initializer.
 */
@SpringBootApplication
public class ApplicationInit {

    /**
     * Runs the application.
     * @param args from command line, e.g. --spring.profiles.active
     */
    public static void main(final String[] args) {
        SpringApplication.run(ApplicationInit.class, args);
    }
}
