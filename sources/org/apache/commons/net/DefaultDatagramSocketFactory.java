package org.apache.commons.net;

import java.net.DatagramSocket;

/* loaded from: classes11.dex */
public class DefaultDatagramSocketFactory implements DatagramSocketFactory {
    @Override // org.apache.commons.net.DatagramSocketFactory
    public DatagramSocket createDatagramSocket() {
        return new DatagramSocket();
    }
}
