package X;

import Y.ARunnableS17S0101000_13;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* renamed from: X.Umd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78203Umd {
    public final J03 LIZ;
    public final Context LIZIZ;
    public final FrameLayout LIZJ;
    public final C78207Umh LIZLLL;
    public final VXG LJ;
    public InterfaceC78204Ume LJFF;
    public final InterfaceC78212Umm LJI;
    public final ARunnableS17S0101000_13 LJII = new ARunnableS17S0101000_13(1, this, 13);
    public boolean LJIIIIZZ = true;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("controller release() called with [");
        LIZ.append(this.LJFF);
        LIZ.append("]");
        C32444CoK.LIZ("GiftCtlManager", X1D.LIZIZ(LIZ));
        C32257ClJ.LIZ.removeCallbacks(this.LJII);
        InterfaceC78204Ume interfaceC78204Ume = this.LJFF;
        if (interfaceC78204Ume != null) {
            interfaceC78204Ume.LJII();
            this.LJFF.LIZIZ();
            this.LJFF.LJIIIIZZ();
            this.LJFF.detachAlphaView(this.LIZJ);
        }
        this.LJFF = null;
        C78169Um5 LIZ2 = C78169Um5.LIZ();
        int hashCode = this.LIZIZ.hashCode();
        LIZ2.getClass();
        SparseArray<InterfaceC78204Ume> sparseArray = C78169Um5.LIZIZ;
        InterfaceC78204Ume interfaceC78204Ume2 = sparseArray.get(hashCode);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("manager release() called with [");
        LIZ3.append(interfaceC78204Ume2);
        LIZ3.append("]");
        C32444CoK.LIZ("GiftCtlManager", X1D.LIZIZ(LIZ3));
        if (interfaceC78204Ume2 == null) {
            return;
        }
        interfaceC78204Ume2.release();
        sparseArray.remove(hashCode);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("release player ");
        LIZ4.append(hashCode);
        C32444CoK.LIZLLL("GiftCtlManager", X1D.LIZIZ(LIZ4));
    }

    public final void LIZIZ() {
        if (C32257ClJ.LIZIZ().LIZJ.enable) {
            Handler handler = C32257ClJ.LIZ;
            handler.removeCallbacks(this.LJII);
            long j = C32257ClJ.LIZIZ().LIZJ.aliveDuration;
            ARunnableS17S0101000_13 aRunnableS17S0101000_13 = this.LJII;
            if (j <= 0) {
                j = LivePlayEnforceIntervalSetting.DEFAULT;
            }
            handler.postDelayed(aRunnableS17S0101000_13, j);
        }
    }

    public C78203Umd(ActivityC45651qj activityC45651qj, C78202Umc c78202Umc, C78201Umb c78201Umb, C78210Umk c78210Umk, C78211Uml c78211Uml, J03 j03) {
        this.LIZIZ = activityC45651qj;
        this.LIZJ = c78202Umc;
        this.LJ = c78211Uml;
        this.LJI = c78210Umk;
        this.LIZ = j03;
        this.LIZLLL = new C78207Umh(this, c78201Umb);
    }
}
