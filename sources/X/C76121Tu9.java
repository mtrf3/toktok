package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import kotlin.jvm.internal.AqS160S0200000_13;

/* renamed from: X.Tu9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76121Tu9 {
    public final /* synthetic */ C76120Tu8 LIZ;

    public C76121Tu9(C76120Tu8 c76120Tu8) {
        this.LIZ = c76120Tu8;
    }

    public static final boolean LIZ(SeiAppData seiAppData) {
        SeiDsl seiDsl = seiAppData.dsl;
        if (seiDsl == null || seiDsl.scene != 4 || seiAppData.version != 16) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(C28272B7s c28272B7s) {
        boolean z;
        MultiGuestV3VideoSeiEndSetting multiGuestV3VideoSeiEndSetting = MultiGuestV3VideoSeiEndSetting.INSTANCE;
        if (multiGuestV3VideoSeiEndSetting.enableNoParseSeiEndLayout() && System.currentTimeMillis() - this.LIZ.LJLLI > 5000) {
            z = true;
        } else {
            z = false;
        }
        if ((multiGuestV3VideoSeiEndSetting.enableVideoSeiEndLayout() && C75806Tp4.LJIIIIZZ(c28272B7s)) || z) {
            C76120Tu8 c76120Tu8 = this.LIZ;
            c76120Tu8.LJLJJI.LJIIZILJ(null, c76120Tu8.LJLJL);
            C76120Tu8 c76120Tu82 = this.LIZ;
            if (c76120Tu82.LJIILIIL() == 4 || c76120Tu82.LJLLILLLL == 2) {
                c76120Tu82.LJIIL();
            }
        }
    }

    public final void LIZJ(SeiAppData seiAppData) {
        C76120Tu8 c76120Tu8 = this.LIZ;
        c76120Tu8.LJIILL(new AqS160S0200000_13(c76120Tu8, seiAppData, 110));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r6.LIZ.LJLIL = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if ((false | r1) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r0.scene == 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        r0 = r5.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0.release();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.android.livesdk.sei.SeiAppData r7) {
        /*
            r6 = this;
            X.Tu8 r2 = r6.LIZ
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJLLI = r0
            X.Tu8 r5 = r6.LIZ
            int r0 = r5.LJLLILLLL
            r4 = 2
            r1 = 1
            r3 = 0
            r2 = 4
            if (r0 != r2) goto L3e
            com.bytedance.android.livesdk.sei.SeiDsl r0 = r7.dsl
            if (r0 == 0) goto L26
            int r0 = r0.scene
            if (r0 != r4) goto L26
        L1a:
            X.TuD r0 = r5.LJLIL
            if (r0 == 0) goto L21
            r0.release()
        L21:
            X.Tu8 r1 = r6.LIZ
            r0 = 0
            r1.LJLIL = r0
        L26:
            X.Tu8 r1 = r6.LIZ
            com.bytedance.android.livesdk.sei.SeiDsl r0 = r7.dsl
            if (r0 == 0) goto L2e
            int r3 = r0.scene
        L2e:
            r1.LJLLILLLL = r3
            int r0 = r7.version
            if (r0 != r4) goto L3d
            int r0 = r1.LJIILIIL()
            if (r0 != r2) goto L3d
            r1.LJIIL()
        L3d:
            return
        L3e:
            if (r0 != r4) goto L4d
            com.bytedance.android.livesdk.sei.SeiDsl r0 = r7.dsl
            if (r0 == 0) goto L4d
            int r0 = r0.scene
            if (r0 != r2) goto L4d
        L48:
            r0 = r3 | r1
            if (r0 == 0) goto L26
            goto L1a
        L4d:
            r1 = 0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76121Tu9.LIZLLL(com.bytedance.android.livesdk.sei.SeiAppData):void");
    }
}
