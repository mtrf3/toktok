package X;

import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1W implements GUG {
    public final GUU LIZ;
    public final String LIZIZ;
    public final C41594GUc LIZJ;
    public final InterfaceC43387H1b LIZLLL;
    public volatile C87614Ya2 LJ;
    public final C62822Ol8 LJFF;
    public final C43404H1s LJI;
    public final C43403H1r LJII;
    public Runnable LJIIIIZZ;
    public GUX LJIIIZ;
    public long LJIIJ;
    public volatile boolean LJIIJJI;

    @Override // X.GUG
    public final void LIZ() {
    }

    @Override // X.GUG
    public final void resume() {
        this.LJIIIIZZ = null;
        C87614Ya2 c87614Ya2 = this.LJ;
        if (c87614Ya2 != null) {
            C87614Ya2.LJ(c87614Ya2);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    @Override // X.GUG
    public final void LIZJ() {
        C87614Ya2 c87614Ya2 = this.LJ;
        if (c87614Ya2 != null) {
            c87614Ya2.LJIIIIZZ();
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    @Override // X.GUG
    public final boolean LIZLLL() {
        return this.LJIIJJI;
    }

    @Override // X.GUG
    public final void LIZIZ(GUX gux) {
        boolean z;
        boolean z2;
        this.LJIIJ = System.currentTimeMillis();
        this.LJIIIZ = gux;
        this.LJIIJJI = false;
        IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZJ();
        C42131GgB LIZ = C42115Gfv.LIZ.LIZ(this.LJI.LIZ.creationId);
        DMMediaModel dMMediaModel = this.LJII.LIZ.creativeModel.dmMediaModel;
        if (dMMediaModel != null && dMMediaModel.type == 3) {
            z = true;
        } else {
            z = false;
        }
        LIZ.LJI(z);
        DMMediaModel dMMediaModel2 = this.LJII.LIZ.creativeModel.dmMediaModel;
        if (dMMediaModel2 != null) {
            z2 = dMMediaModel2.isSynthesised;
        } else {
            z2 = false;
        }
        LIZ.LJIIJJI(z2);
        LIZ.LJIIIIZZ(EnumC117974k5.VIDEO);
        C87612Ya0 c87612Ya0 = new C87612Ya0(H1U.COMPILE, new AqS157S0100000_7(this, 718));
        C87612Ya0 c87612Ya02 = new C87612Ya0(H1U.AUTH_KEY, H29.LJLIL);
        C87612Ya0 c87612Ya03 = new C87612Ya0(H1U.WAIT_UPLOAD_PARAM, H24.LJLIL);
        C87612Ya0 c87612Ya04 = new C87612Ya0(H1U.UPLOAD, H2D.LJLIL);
        C87612Ya0 c87612Ya05 = new C87612Ya0(H1U.SAVE_LOCAL, C41747GZz.LJLIL);
        H6E h6e = new H6E("DMVideoWavePublisher", (C87612Ya0[]) Arrays.copyOf(new C87612Ya0[]{c87612Ya0, c87612Ya02, c87612Ya03}, 3));
        ArrayList arrayList = (ArrayList) h6e.LIZ;
        arrayList.add(this.LJI);
        arrayList.add(this.LJII);
        arrayList.add(this.LJFF.getValue());
        arrayList.add(new C43397H1l(this.LIZ.LIZIZ));
        arrayList.add(new C118004k8(EnumC118014k9.VIDEO, new G0D(3, null, null, null), null));
        arrayList.add(new XFL(this.LJII.LIZ.mParallelUploadOutputFile, this.LIZIZ));
        arrayList.add(this.LIZJ);
        arrayList.add(this.LIZLLL);
        this.LIZLLL.LIZLLL();
        h6e.LIZJ = new C43400H1o(C75806Tp4.LJFF(this.LIZ));
        this.LIZLLL.LIZLLL();
        h6e.LIZLLL = new C43400H1o(C75806Tp4.LJI());
        this.LIZLLL.LIZLLL();
        h6e.LJ = new C43400H1o(C75806Tp4.LJ());
        this.LJ = h6e.LIZ();
        c87612Ya04.LIZ(c87612Ya02);
        c87612Ya04.LIZ(c87612Ya03);
        c87612Ya05.LIZ(c87612Ya0);
        C87614Ya2 c87614Ya2 = this.LJ;
        if (c87614Ya2 != null) {
            C87614Ya2 c87614Ya22 = this.LJ;
            if (c87614Ya22 != null) {
                String str = c87614Ya22.LJII;
                C87614Ya2 c87614Ya23 = this.LJ;
                if (c87614Ya23 != null) {
                    String str2 = c87614Ya23.LJII;
                    GUX gux2 = this.LJIIIZ;
                    if (gux2 != null) {
                        c87614Ya2.LIZ(new C87631YaJ(str, new C41774GaQ(str2, gux2, this.LJIIJ), this.LIZLLL.LIZLLL().LIZLLL()));
                        C87614Ya2 c87614Ya24 = this.LJ;
                        if (c87614Ya24 != null) {
                            GUX gux3 = this.LJIIIZ;
                            if (gux3 != null) {
                                c87614Ya24.LIZ(new C87631YaJ(null, new C41770GaM(gux3), this.LIZLLL.LIZLLL().LIZLLL()));
                                C87614Ya2 c87614Ya25 = this.LJ;
                                if (c87614Ya25 != null) {
                                    c87614Ya25.LIZ(new C43510H5u(C42981Gtt.LIZ(true, false), this.LIZLLL, new AqS189S0100000_7(this, 82)));
                                    ((C43458H3u) this.LJFF.getValue()).LIZLLL();
                                    C87614Ya2 c87614Ya26 = this.LJ;
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
        if (this.LJ != null) {
            C87614Ya2 c87614Ya2 = this.LJ;
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
        if (this.LJIIJJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel taskPause id=");
            H78.LJI(JBR.LJFF(LIZ, this.LIZ.LIZIZ, " can't pause because compile finished", LIZ));
            return false;
        }
        synchronized (this) {
            if (this.LJIIJJI) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PublishParallel taskPause id=");
                LIZ2.append(this.LIZ.LIZIZ);
                LIZ2.append(" can't pause because compile finished");
                H78.LJI(X1D.LIZIZ(LIZ2));
                return false;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PublishParallel taskPause id=");
            LIZ3.append(this.LIZ.LIZIZ);
            LIZ3.append(" pause net");
            H78.LJI(X1D.LIZIZ(LIZ3));
            this.LJIIIIZZ = compileSuccessAfterPauseCallback;
            C87614Ya2 c87614Ya2 = this.LJ;
            if (c87614Ya2 != null) {
                C87614Ya2.LIZLLL(c87614Ya2);
                return true;
            }
            o.LJIJI("net");
            throw null;
        }
    }

    public H1W(GUU record, String publishId, C41594GUc flag, C43478H4o c43478H4o) {
        o.LJIIIZ(record, "record");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(flag, "flag");
        this.LIZ = record;
        this.LIZIZ = publishId;
        this.LIZJ = flag;
        this.LIZLLL = c43478H4o;
        this.LJFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 716));
        this.LJI = new C43404H1s(record.LIZ);
        BaseShortVideoContext baseShortVideoContext = record.LIZ.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        this.LJII = new C43403H1r((VideoPublishEditModel) baseShortVideoContext);
        this.LJIIJ = System.currentTimeMillis();
    }
}
