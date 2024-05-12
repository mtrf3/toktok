package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.jniwrapper.CallCallbackInNative;
import com.bytedance.pitaya.log.PitayaLogger;

/* renamed from: X.aOU, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93290aOU implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public RunnableC93290aOU(String str, String str2, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
    }

    public final void LIZ() {
        boolean z;
        PTYError pTYError = null;
        try {
            C93321aOz.LIZ(this.LJLIL, this.LJLILLLLZI);
            z = true;
        } catch (Throwable th) {
            PitayaLogger.LJ(th, null, 6);
            PTYErrorCode pTYErrorCode = PTYErrorCode.UNZIP_ERROR;
            pTYError = new PTYError("DefaultAdapter.unzip()", pTYErrorCode.getCode(), pTYErrorCode.getCode(), th.toString(), null);
            z = false;
        }
        CallCallbackInNative.LIZ.LIZ(this.LJLJI, z, pTYError, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
