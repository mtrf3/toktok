package X;

import android.media.session.MediaSessionManager;

/* renamed from: X.1Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32731Qf extends C12220du {
    public C32731Qf(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public C32731Qf(String str, int i, int i2) {
        super(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
