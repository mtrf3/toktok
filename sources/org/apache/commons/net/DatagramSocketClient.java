package org.apache.commons.net;

import java.net.DatagramSocket;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public abstract class DatagramSocketClient {
    public static final DatagramSocketFactory __DEFAULT_SOCKET_FACTORY = new DefaultDatagramSocketFactory();
    public Charset charset = Charset.defaultCharset();
    public DatagramSocket _socket_ = null;
    public int _timeout_ = 0;
    public boolean _isOpen_ = false;
    public DatagramSocketFactory _socketFactory_ = __DEFAULT_SOCKET_FACTORY;

    public void open() {
        DatagramSocket createDatagramSocket = this._socketFactory_.createDatagramSocket();
        this._socket_ = createDatagramSocket;
        createDatagramSocket.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public boolean isOpen() {
        return this._isOpen_;
    }

    public void setDefaultTimeout(int i) {
        this._timeout_ = i;
    }
}
