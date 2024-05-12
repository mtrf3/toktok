package X;

import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UzV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79001UzV {
    public final InterfaceC82086WJm LIZ;
    public final C82622Wbi LIZIZ;
    public final I3X LIZJ;
    public final ShortVideoContext LIZLLL;
    public final C0IB<Long> LJ;
    public final C0IB<Boolean> LJFF;
    public final C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> LJI;
    public final C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJII;
    public final C0IB<Integer> LJIIIIZZ;
    public final C0IB<RetakeVideoContext> LJIIIZ;
    public final C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> LJIIJ;
    public final C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJIIJJI;
    public final C0IB<Boolean> LJIIL;
    public final C0IB<Boolean> LJIILIIL;
    public final C0IB<Boolean> LJIILJJIL;
    public final C0IB<ScaleGestureDetector> LJIILL;
    public final C0IB<WXG> LJIILLIIL;
    public final C29901Fi<C76800UCe> LJIIZILJ;
    public final C29901Fi<C76800UCe> LJIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79001UzV)) {
            return false;
        }
        C79001UzV c79001UzV = (C79001UzV) obj;
        return o.LJ(this.LIZ, c79001UzV.LIZ) && o.LJ(this.LIZIZ, c79001UzV.LIZIZ) && o.LJ(this.LIZJ, c79001UzV.LIZJ) && o.LJ(this.LIZLLL, c79001UzV.LIZLLL) && o.LJ(this.LJ, c79001UzV.LJ) && o.LJ(this.LJFF, c79001UzV.LJFF) && o.LJ(this.LJI, c79001UzV.LJI) && o.LJ(this.LJII, c79001UzV.LJII) && o.LJ(this.LJIIIIZZ, c79001UzV.LJIIIIZZ) && o.LJ(this.LJIIIZ, c79001UzV.LJIIIZ) && o.LJ(this.LJIIJ, c79001UzV.LJIIJ) && o.LJ(this.LJIIJJI, c79001UzV.LJIIJJI) && o.LJ(this.LJIIL, c79001UzV.LJIIL) && o.LJ(this.LJIILIIL, c79001UzV.LJIILIIL) && o.LJ(this.LJIILJJIL, c79001UzV.LJIILJJIL) && o.LJ(this.LJIILL, c79001UzV.LJIILL) && o.LJ(this.LJIILLIIL, c79001UzV.LJIILLIIL) && o.LJ(this.LJIIZILJ, c79001UzV.LJIIZILJ) && o.LJ(this.LJIJ, c79001UzV.LJIJ);
    }

    public final int hashCode() {
        int hashCode = (this.LJIIL.hashCode() + ((this.LJIIJJI.hashCode() + ((this.LJIIJ.hashCode() + ((this.LJIIIZ.hashCode() + ((this.LJIIIIZZ.hashCode() + ((this.LJII.hashCode() + ((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        C0IB<Boolean> c0ib = this.LJIILIIL;
        int hashCode2 = (hashCode + (c0ib == null ? 0 : c0ib.hashCode())) * 31;
        C0IB<Boolean> c0ib2 = this.LJIILJJIL;
        int hashCode3 = (hashCode2 + (c0ib2 == null ? 0 : c0ib2.hashCode())) * 31;
        C0IB<ScaleGestureDetector> c0ib3 = this.LJIILL;
        int hashCode4 = (hashCode3 + (c0ib3 == null ? 0 : c0ib3.hashCode())) * 31;
        C0IB<WXG> c0ib4 = this.LJIILLIIL;
        return this.LJIJ.hashCode() + ((this.LJIIZILJ.hashCode() + ((hashCode4 + (c0ib4 != null ? c0ib4.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "RecordControlProgressSceneFactoryBuildParam(cameraApiComponent=" + this.LIZ + ", diContainer=" + this.LIZIZ + ", recordControlApi=" + this.LIZJ + ", shortVideoContext=" + this.LIZLLL + ", progressMaxDuration=" + this.LJ + ", progressNeedDrawAnchor=" + this.LJFF + ", progressClipAnchors=" + this.LJI + ", progressClipWithStitch=" + this.LJII + ", retakeState=" + this.LJIIIIZZ + ", retakeVideoContext=" + this.LJIIIZ + ", retakeProgressClipAnchors=" + this.LJIIJ + ", retakeProgressClipWithStitch=" + this.LJIIJJI + ", progressSegmentVisible=" + this.LJIIL + ", enableTopMarginEvent=" + this.LJIILIIL + ", relayoutEvent=" + this.LJIILJJIL + ", scaleGestureDetector=" + this.LJIILL + ", onGestureListener=" + this.LJIILLIIL + ", goNextEvent=" + this.LJIIZILJ + ", deleteLibraryClipEvent=" + this.LJIJ + ')';
    }

    public C79001UzV(InterfaceC82086WJm cameraApiComponent, C82622Wbi diContainer, InterfaceC45967I2h recordControlApi, ShortVideoContext shortVideoContext, C40871j1 c40871j1, C40871j1 c40871j12, C40871j1 c40871j13, C40871j1 c40871j14, C40871j1 c40871j15, C40871j1 c40871j16, C40871j1 c40871j17, C40871j1 c40871j18, C40871j1 c40871j19, C0IB c0ib, C0IB c0ib2, C0IB c0ib3, C0IB c0ib4, C29901Fi c29901Fi, C29901Fi c29901Fi2) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = cameraApiComponent;
        this.LIZIZ = diContainer;
        this.LIZJ = recordControlApi;
        this.LIZLLL = shortVideoContext;
        this.LJ = c40871j1;
        this.LJFF = c40871j12;
        this.LJI = c40871j13;
        this.LJII = c40871j14;
        this.LJIIIIZZ = c40871j15;
        this.LJIIIZ = c40871j16;
        this.LJIIJ = c40871j17;
        this.LJIIJJI = c40871j18;
        this.LJIIL = c40871j19;
        this.LJIILIIL = c0ib;
        this.LJIILJJIL = c0ib2;
        this.LJIILL = c0ib3;
        this.LJIILLIIL = c0ib4;
        this.LJIIZILJ = c29901Fi;
        this.LJIJ = c29901Fi2;
    }
}
