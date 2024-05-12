package org.apache.http.conn;

import java.io.InterruptedIOException;

/* loaded from: classes12.dex */
public class ConnectTimeoutException extends InterruptedIOException {
    public static final long serialVersionUID = -4816682903149535989L;

    public ConnectTimeoutException() {
    }

    public ConnectTimeoutException(String str) {
        super(str);
    }
}
