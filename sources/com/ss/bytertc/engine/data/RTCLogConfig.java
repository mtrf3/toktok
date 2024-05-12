package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class RTCLogConfig {
    public int logFileSize;
    public String logFilenamePrefix;
    public LocalLogLevel logLevel;
    public String logPath;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTCLogConfig{log_level='");
        LIZ.append(this.logLevel);
        LIZ.append('\'');
        LIZ.append(", log_path='");
        LIZ.append(this.logPath);
        LIZ.append('\'');
        LIZ.append(", log_file_size='");
        LIZ.append(this.logFileSize);
        LIZ.append('\'');
        LIZ.append(", log_filename_prefix='");
        LIZ.append(this.logFilenamePrefix);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public RTCLogConfig(LocalLogLevel localLogLevel, String str, int i, String str2) {
        this.logFileSize = 10;
        this.logLevel = localLogLevel;
        this.logPath = str;
        this.logFileSize = i;
        this.logFilenamePrefix = str2;
    }

    public static RTCLogConfig create(LocalLogLevel localLogLevel, String str, int i, String str2) {
        return new RTCLogConfig(localLogLevel, str, i, str2);
    }
}
