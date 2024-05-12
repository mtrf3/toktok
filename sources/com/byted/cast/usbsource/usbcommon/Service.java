package com.byted.cast.usbsource.usbcommon;

import android.content.Context;
import com.byted.cast.usbsource.usbcommon.Transport;
import java.nio.ByteBuffer;

/* loaded from: classes29.dex */
public abstract class Service implements Transport.Callback {
    public final Context mContext;
    public final int mServiceId;
    public Transport mTransport;

    @Override // com.byted.cast.usbsource.usbcommon.Transport.Callback
    public void onMessageReceived(int i, int i2, ByteBuffer byteBuffer) {
    }

    public Logger getLogger() {
        return this.mTransport.getLogger();
    }

    public void registerService() {
        Transport transport = this.mTransport;
        if (transport != null) {
            transport.registerService(this.mServiceId, this);
        }
    }

    public void unregisterService() {
        Transport transport = this.mTransport;
        if (transport != null) {
            transport.unregisterService(this.mServiceId);
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getServiceId() {
        return this.mServiceId;
    }

    public Transport getTransport() {
        return this.mTransport;
    }

    public void setTransport(Transport transport) {
        this.mTransport = transport;
    }

    public Service(Context context, int i) {
        this.mContext = context;
        this.mServiceId = i;
    }
}
