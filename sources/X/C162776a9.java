package X;

import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6a9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162776a9 implements InterfaceC162796aB {
    public final /* synthetic */ InterfaceC162796aB LIZ;
    public final /* synthetic */ C162756a7 LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ C68322mC<C6ZI> LIZLLL;

    @Override // X.InterfaceC162796aB
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC162796aB
    public final void LIZ(float f) {
        this.LIZ.LIZ(f);
    }

    @Override // X.InterfaceC162796aB
    public final void onFinish(boolean z) {
        int i;
        int i2;
        this.LIZ.onFinish(z);
        VideoPublishEditModel editModel = this.LIZIZ.LIZJ;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        if (z) {
            i = 0;
        } else {
            C6ZI c6zi = this.LIZLLL.element;
            if (c6zi != null) {
                i = c6zi.LIZ;
            } else {
                i = -1;
            }
        }
        int i3 = this.LIZIZ.LIZIZ;
        o.LJIIIZ(editModel, "editModel");
        NowsShootModel nowsShootModel = editModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && nowsShootModel.frontImageInLargeWindow) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        C145995oB c145995oB = new C145995oB();
        Q8U.LIZJ(c145995oB, "shoot_way", editModel.mShootWay, editModel, "creation_id");
        c145995oB.LIZIZ(currentTimeMillis, "duration");
        c145995oB.LIZ(z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LIZ(i3, "save_type");
        c145995oB.LIZ(i2, "selfie_display");
        FMX.LJIIL("now_download_status", c145995oB.LIZ);
    }

    public C162776a9(C162786aA c162786aA, C162756a7 c162756a7, long j, C68322mC c68322mC) {
        this.LIZ = c162786aA;
        this.LIZIZ = c162756a7;
        this.LIZJ = j;
        this.LIZLLL = c68322mC;
    }
}
