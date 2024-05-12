package X;

import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1X implements GUG {
    public final GUU LIZ;
    public final C41594GUc LIZIZ;
    public final InterfaceC43387H1b LIZJ;
    public volatile C87614Ya2 LIZLLL;
    public final C43404H1s LJ;
    public final C43403H1r LJFF;
    public Runnable LJI;
    public GUX LJII;
    public long LJIIIIZZ;

    @Override // X.GUG
    public final void LIZ() {
    }

    @Override // X.GUG
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.GUG
    public final void LIZJ() {
        C87614Ya2 c87614Ya2 = this.LIZLLL;
        if (c87614Ya2 != null) {
            c87614Ya2.LJIIIIZZ();
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    @Override // X.GUG
    public final void resume() {
        C87614Ya2 c87614Ya2 = this.LIZLLL;
        if (c87614Ya2 != null) {
            C87614Ya2.LJ(c87614Ya2);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    @Override // X.GUG
    public final void LIZIZ(GUX gux) {
        EnumC117974k5 enumC117974k5;
        boolean z;
        boolean z2;
        boolean z3;
        C87612Ya0 c87612Ya0;
        C87612Ya0 c87612Ya02;
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LJII = gux;
        DMMediaModel dMMediaModel = this.LJFF.LIZ.creativeModel.dmMediaModel;
        if (dMMediaModel != null && dMMediaModel.type == 4) {
            enumC117974k5 = EnumC117974k5.STICKER;
        } else {
            enumC117974k5 = EnumC117974k5.PHOTO;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZJ();
        C42131GgB LIZ = C42115Gfv.LIZ.LIZ(this.LJ.LIZ.creationId);
        DMMediaModel dMMediaModel2 = this.LJFF.LIZ.creativeModel.dmMediaModel;
        if (dMMediaModel2 != null && dMMediaModel2.type == 2) {
            z = true;
        } else {
            z = false;
        }
        LIZ.LJI(z);
        DMMediaModel dMMediaModel3 = this.LJFF.LIZ.creativeModel.dmMediaModel;
        if (dMMediaModel3 != null) {
            z2 = dMMediaModel3.isSynthesised;
        } else {
            z2 = false;
        }
        LIZ.LJIIJJI(z2);
        LIZ.LJIIIIZZ(enumC117974k5);
        DMMediaModel dMMediaModel4 = this.LJFF.LIZ.creativeModel.dmMediaModel;
        if (dMMediaModel4 != null && dMMediaModel4.type == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            c87612Ya0 = new C87612Ya0(H1U.COVER_EXTRACT, H2B.LJLIL);
        } else {
            c87612Ya0 = null;
        }
        C87612Ya0 c87612Ya03 = new C87612Ya0(H1U.COMPILE, H2A.LJLIL);
        C87612Ya0 c87612Ya04 = new C87612Ya0(H1U.AUTH_KEY, H28.LJLIL);
        C87612Ya0 c87612Ya05 = new C87612Ya0(H1U.UPLOAD, H2C.LJLIL);
        C87612Ya0[] c87612Ya0Arr = new C87612Ya0[2];
        if (c87612Ya0 == null) {
            c87612Ya02 = c87612Ya03;
        } else {
            c87612Ya02 = c87612Ya0;
        }
        c87612Ya0Arr[0] = c87612Ya02;
        c87612Ya0Arr[1] = c87612Ya04;
        H6E h6e = new H6E("DMVideoWavePublisher", (C87612Ya0[]) Arrays.copyOf(c87612Ya0Arr, 2));
        ArrayList arrayList = (ArrayList) h6e.LIZ;
        arrayList.add(this.LJ);
        arrayList.add(this.LJFF);
        arrayList.add(new C43397H1l(this.LIZ.LIZIZ));
        arrayList.add(this.LIZIZ);
        arrayList.add(this.LIZJ);
        arrayList.add(new C118004k8(EnumC118014k9.PHOTO, null, new H4F(null, null)));
        this.LIZJ.LIZLLL();
        h6e.LIZJ = new C43400H1o(C75806Tp4.LJFF(this.LIZ));
        this.LIZJ.LIZLLL();
        h6e.LIZLLL = new C43400H1o(C75806Tp4.LJI());
        this.LIZJ.LIZLLL();
        h6e.LJ = new C43400H1o(C75806Tp4.LJ());
        this.LIZLLL = h6e.LIZ();
        if (c87612Ya0 != null) {
            c87612Ya03.LIZ(c87612Ya0);
        }
        c87612Ya05.LIZ(c87612Ya03, c87612Ya04);
        C87614Ya2 c87614Ya2 = this.LIZLLL;
        if (c87614Ya2 != null) {
            C87614Ya2 c87614Ya22 = this.LIZLLL;
            if (c87614Ya22 != null) {
                String str = c87614Ya22.LJII;
                C87614Ya2 c87614Ya23 = this.LIZLLL;
                if (c87614Ya23 != null) {
                    String str2 = c87614Ya23.LJII;
                    GUX gux2 = this.LJII;
                    if (gux2 != null) {
                        c87614Ya2.LIZ(new C87631YaJ(str, new C41774GaQ(str2, gux2, this.LJIIIIZZ), this.LIZJ.LIZLLL().LIZLLL()));
                        C87614Ya2 c87614Ya24 = this.LIZLLL;
                        if (c87614Ya24 != null) {
                            GUX gux3 = this.LJII;
                            if (gux3 != null) {
                                c87614Ya24.LIZ(new C87631YaJ(null, new C41770GaM(gux3), this.LIZJ.LIZLLL().LIZLLL()));
                                C87614Ya2 c87614Ya25 = this.LIZLLL;
                                if (c87614Ya25 != null) {
                                    c87614Ya25.LIZ(new C43510H5u(C42981Gtt.LIZ(true, false), this.LIZJ, new AqS189S0100000_7(this, 79)));
                                    C87614Ya2 c87614Ya26 = this.LIZLLL;
                                    if (c87614Ya26 != null) {
                                        c87614Ya26.LJIIIIZZ();
                                        return;
                                    } else {
                                        o.LJIJI("net");
                                        throw null;
                                    }
                                }
                                o.LJIJI("net");
                                throw null;
                            }
                            o.LJIJI("callback");
                            throw null;
                        }
                        o.LJIJI("net");
                        throw null;
                    }
                    o.LJIJI("callback");
                    throw null;
                }
                o.LJIJI("net");
                throw null;
            }
            o.LJIJI("net");
            throw null;
        }
        o.LJIJI("net");
        throw null;
    }

    @Override // X.GUG
    public final void LJ(C41359GLb cancelCause) {
        o.LJIIIZ(cancelCause, "cancelCause");
        if (this.LIZLLL != null) {
            C87614Ya2 c87614Ya2 = this.LIZLLL;
            if (c87614Ya2 != null) {
                c87614Ya2.LIZIZ(cancelCause);
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
    }

    @Override // X.GUG
    public final boolean LJFF(ARunnableS43S0100000_7 compileSuccessAfterPauseCallback) {
        o.LJIIIZ(compileSuccessAfterPauseCallback, "compileSuccessAfterPauseCallback");
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel taskPause id=");
            LIZ.append(this.LIZ.LIZIZ);
            LIZ.append(" pause net");
            H78.LJI(X1D.LIZIZ(LIZ));
            this.LJI = compileSuccessAfterPauseCallback;
            C87614Ya2 c87614Ya2 = this.LIZLLL;
            if (c87614Ya2 != null) {
                C87614Ya2.LIZLLL(c87614Ya2);
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
        return true;
    }

    public H1X(GUU record, String publishId, C41594GUc flag, C43478H4o c43478H4o) {
        o.LJIIIZ(record, "record");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(flag, "flag");
        this.LIZ = record;
        this.LIZIZ = flag;
        this.LIZJ = c43478H4o;
        this.LJ = new C43404H1s(record.LIZ);
        BaseShortVideoContext baseShortVideoContext = record.LIZ.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        this.LJFF = new C43403H1r((VideoPublishEditModel) baseShortVideoContext);
        this.LJIIIIZZ = System.currentTimeMillis();
    }
}
