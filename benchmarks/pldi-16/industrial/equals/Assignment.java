/* ./apache-storm-44e9aaf/storm-core/src/jvm/backtype/storm/generated/Assignment.java */
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-5")
public class Assignment implements org.apache.thrift.TBase<Assignment, Assignment._Fields>, java.io.Serializable, Cloneable, Comparable<Assignment> {
  boolean is_set_master_code_dir();
  boolean is_set_node_host();
  boolean is_set_executor_node_port();
  boolean is_set_executor_start_time_secs();
  Directory master_code_dir;
  Host node_host;
  Port executor_node_port;
  Seconds executor_start_time_secs;

  public boolean equals(Assignment o1, Assignment o2) {
    boolean this_present_master_code_dir = true && o1.is_set_master_code_dir();
    boolean that_present_master_code_dir = true && o2.is_set_master_code_dir();
    if (this_present_master_code_dir || that_present_master_code_dir) {
      if (!(this_present_master_code_dir && that_present_master_code_dir)) {
        return false;
      }
      if (equals(o1.master_code_dir, o2.master_code_dir) == 0) {
        return false;
      }
    }

    boolean this_present_node_host = true && o1.is_set_node_host();
    boolean that_present_node_host = true && o2.is_set_node_host();
    if (this_present_node_host || that_present_node_host) {
      if (!(this_present_node_host && that_present_node_host)) {
        return false;
      }
      if (equals(o1.node_host, o2.node_host) == 0) {
        return false;
      }
    }

    boolean this_present_executor_node_port = true && o1.is_set_executor_node_port();
    boolean that_present_executor_node_port = true && o2.is_set_executor_node_port();
    if (this_present_executor_node_port || that_present_executor_node_port) {
      if (!(this_present_executor_node_port && that_present_executor_node_port)) {
        return false;
      }
      if (equals(o1.executor_node_port, o2.executor_node_port) == 0) {
        return false;
      }
    }

    boolean this_present_executor_start_time_secs = true && o1.is_set_executor_start_time_secs();
    boolean that_present_executor_start_time_secs = true && o2.is_set_executor_start_time_secs();
    if (this_present_executor_start_time_secs || that_present_executor_start_time_secs) {
      if (!(this_present_executor_start_time_secs && that_present_executor_start_time_secs)) {
        return false;
      }
      if (equals(o1.executor_start_time_secs, o2.executor_start_time_secs) == 0) {
        return false;
      }
    }

    return true;
  }


}

