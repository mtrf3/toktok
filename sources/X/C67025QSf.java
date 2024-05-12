package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import defpackage.a1;

/* renamed from: X.QSf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67025QSf implements InterfaceC67026QSg {
    public final Context LIZ;
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public final String LIZJ;

    @Override // X.InterfaceC67026QSg
    public final void LIZ(C67022QSc c67022QSc) {
        if (c67022QSc.LJFF != 0) {
            ARunnableS30S0200000_11 aRunnableS30S0200000_11 = new ARunnableS30S0200000_11(this, c67022QSc, 55);
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                aRunnableS30S0200000_11.run();
            } else {
                this.LIZIZ.post(new ARunnableS47S0100000_11(aRunnableS30S0200000_11, LiveTryModeCountDownThresholdSetting.DEFAULT));
            }
        }
    }

    public C67025QSf(Context context, String str) {
        this.LIZ = context;
        this.LIZJ = a1.LJ("[UGCloud ", str, "]");
    }
}
