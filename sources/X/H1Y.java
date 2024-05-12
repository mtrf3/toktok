package X;

import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1Y extends AbstractC43396H1k {
    public final GUU LIZJ;
    public final String LIZLLL;
    public final InterfaceC43387H1b LJ;
    public volatile C87614Ya2 LJFF;
    public GUX LJI;
    public final C62822Ol8 LJII;
    public final C43403H1r LJIIIIZZ;
    public volatile boolean LJIIIZ;

    public final void LJI() {
        this.LJIIIZ = false;
        C87612Ya0 c87612Ya0 = new C87612Ya0(H1U.COMPILE, new AqS157S0100000_7(this, 602));
        C87612Ya0 c87612Ya02 = new C87612Ya0(H1U.SAVE_LOCAL, C41751Ga3.LJLIL);
        H6E h6e = new H6E("TTEPWavePublisher", (C87612Ya0[]) Arrays.copyOf(new C87612Ya0[]{c87612Ya0}, 1));
        ArrayList arrayList = (ArrayList) h6e.LIZ;
        arrayList.add(this.LJIIIIZZ);
        arrayList.add(new C43404H1s(this.LIZJ.LIZ));
        arrayList.add(new C43397H1l(this.LIZJ.LIZIZ));
        if (!H7R.LJJJJL(this.LJIIIIZZ.LIZ)) {
            arrayList.add(new XFL(this.LJIIIIZZ.LIZ.mParallelUploadOutputFile, this.LIZLLL));
        }
        arrayList.add(this.LJ);
        arrayList.add(this.LJII.getValue());
        this.LJ.LIZLLL();
        h6e.LIZJ = new C43400H1o(C75806Tp4.LJFF(this.LIZJ));
        this.LJ.LIZLLL();
        h6e.LIZLLL = new C43400H1o(C75806Tp4.LJI());
        this.LJ.LIZLLL();
        h6e.LJ = new C43400H1o(C75806Tp4.LJ());
        this.LJFF = h6e.LIZ();
        if (this.LIZJ.LIZ.isEditSave) {
            C87614Ya2 c87614Ya2 = this.LJFF;
            if (c87614Ya2 != null) {
                c87614Ya2.LIZ(new C41734GZm());
                C87614Ya2 c87614Ya22 = this.LJFF;
                if (c87614Ya22 != null) {
                    c87614Ya22.LIZ(new C43482H4s(new AqS157S0100000_7(this, 601)));
                    C87614Ya2 c87614Ya23 = this.LJFF;
                    if (c87614Ya23 != null) {
                        c87614Ya23.LIZ(new C42978Gtq("TTEPWavePublisher"));
                    } else {
                        o.LJIJI("net");
                        throw null;
                    }
                } else {
                    o.LJIJI("net");
                    throw null;
                }
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
        C87614Ya2 c87614Ya24 = this.LJFF;
        if (c87614Ya24 != null) {
            c87614Ya24.LIZ(new C43398H1m(new AqS173S0100000_7(this, 332)));
            if (this.LIZJ.LIZ.isEditSave && H7R.LJJJJL(this.LJIIIIZZ.LIZ) && C40980G6m.LIZ()) {
                C87612Ya0 c87612Ya03 = new C87612Ya0(H1U.UPDATE_AIGC_INFO_BEFORE_SAVE_LOCAL, C41752Ga4.LJLIL);
                c87612Ya03.LIZ(c87612Ya0);
                c87612Ya02.LIZ(c87612Ya03);
                return;
            }
            c87612Ya02.LIZ(c87612Ya0);
            return;
        }
        o.LJIJI("net");
        throw null;
    }

    @Override // X.GUG
    public final void LIZJ() {
        C87614Ya2 c87614Ya2 = this.LJFF;
        if (c87614Ya2 != null) {
            if (c87614Ya2.LIZJ() instanceof YZU) {
                LJI();
            }
            ((C43458H3u) this.LJII.getValue()).LIZLLL();
            C87614Ya2 c87614Ya22 = this.LJFF;
            if (c87614Ya22 != null) {
                c87614Ya22.LJIIIIZZ();
                return;
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
        o.LJIJI("net");
        throw null;
    }

    @Override // X.GUG
    public final void resume() {
        C87614Ya2 c87614Ya2 = this.LJFF;
        if (c87614Ya2 != null) {
            C87614Ya2.LJ(c87614Ya2);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    @Override // X.GUG
    public final boolean LIZLLL() {
        return this.LJIIIZ;
    }

    @Override // X.GUG
    public final void LIZIZ(GUX gux) {
        this.LJI = gux;
        if (this.LIZJ.LJI != null || !C19N.LJ("ttep_crash_switch", true)) {
            LJI();
            ((C43458H3u) this.LJII.getValue()).LIZLLL();
            C87614Ya2 c87614Ya2 = this.LJFF;
            if (c87614Ya2 != null) {
                c87614Ya2.LJIIIIZZ();
                return;
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
        C78983UzD.LJIJ(new Throwable(), "TTEP record task is null");
    }

    @Override // X.GUG
    public final void LJ(C41359GLb cancelCause) {
        o.LJIIIZ(cancelCause, "cancelCause");
        if (this.LJFF != null) {
            C87614Ya2 c87614Ya2 = this.LJFF;
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
        this.LJ.LJIIIIZZ();
        C41813Gb3.LIZJ("TTEPWavePublisher", "WavePublish | net pause");
        if (this.LJFF != null) {
            C87614Ya2 c87614Ya2 = this.LJFF;
            if (c87614Ya2 != null) {
                C87614Ya2.LIZLLL(c87614Ya2);
                return true;
            }
            o.LJIJI("net");
            throw null;
        }
        C41816Gb6.LIZIZ(-111111, "pause on not init net", null);
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1Y(GUU record, String publishId, C43478H4o c43478H4o) {
        super(c43478H4o);
        o.LJIIIZ(record, "record");
        o.LJIIIZ(publishId, "publishId");
        this.LIZJ = record;
        this.LIZLLL = publishId;
        this.LJ = c43478H4o;
        this.LJII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 603));
        BaseShortVideoContext baseShortVideoContext = record.LIZ.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        this.LJIIIIZZ = new C43403H1r((VideoPublishEditModel) baseShortVideoContext);
    }
}
