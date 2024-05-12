package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.Ilv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47583Ilv implements InterfaceC47584Ilw {
    public final /* synthetic */ C47752Ioe LIZ;

    public C47583Ilv(C47752Ioe c47752Ioe) {
        this.LIZ = c47752Ioe;
    }

    @Override // X.InterfaceC47584Ilw
    public final void LIZ(int i, int i2, int i3) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LIZ.getClass();
            String LIZ = C47752Ioe.LIZ(i2);
            String LIZ2 = C47752Ioe.LIZ(i3);
            TTVideoEngineLog.d("VideoEventBase", C16880lQ.LLLZ("receive signal strength changed, from:%s to:%s", new Object[]{LIZ, LIZ2}));
            C47752Ioe.LJLIIIL = LIZ2;
            return;
        }
        this.LIZ.getClass();
        String LIZIZ = C47752Ioe.LIZIZ(i2);
        String LIZIZ2 = C47752Ioe.LIZIZ(i3);
        TTVideoEngineLog.d("VideoEventBase", C16880lQ.LLLZ("receive network type changed, from:%s to:%s", new Object[]{LIZIZ, LIZIZ2}));
        C47752Ioe.LJLI = LIZIZ2;
    }
}
