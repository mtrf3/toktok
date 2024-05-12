package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XV6 implements WGL {
    public final /* synthetic */ XV5 LIZ;

    @Override // X.WGL
    public final void LIZ() {
        int min;
        XVG xvg;
        int i;
        String str;
        MutableLiveData<XVG> gv0;
        XV5 xv5 = this.LIZ;
        MusicModel musicModel = xv5.LJIIJ;
        if (musicModel != null) {
            CutMusicRepeartPlayer cutMusicRepeartPlayer = xv5.LIZLLL;
            if (cutMusicRepeartPlayer != null) {
                cutMusicRepeartPlayer.LIZIZ();
            }
            MusicModel m159clone = musicModel.m159clone();
            o.LJIIIIZZ(m159clone, "it.clone()");
            m159clone.setMusicStartFromCut(xv5.LJIIJJI);
            int i2 = xv5.LJIIJJI;
            int LIZIZ = (int) XU0.LIZIZ(xv5.LJIILJJIL);
            int i3 = xv5.LJIIIIZZ;
            int i4 = xv5.LJIIIZ;
            if (i3 > 0) {
                min = Math.min(LIZIZ, i3);
            } else {
                min = Math.min(LIZIZ, i4);
            }
            m159clone.setMusicEndFromCut(i2 + min);
            if (xv5.LJIIJJI != 0) {
                m159clone.setEditFrom(xv5.LJIILL.LJI);
            }
            ChooseMusicCutViewModel chooseMusicCutViewModel = xv5.LJ;
            if (chooseMusicCutViewModel != null && (gv0 = chooseMusicCutViewModel.gv0()) != null) {
                xvg = gv0.getValue();
            } else {
                xvg = null;
            }
            XY4 xy4 = xv5.LIZJ;
            if (xy4 != null) {
                xy4.y8(m159clone);
            }
            if (xvg != null && (str = xvg.LJIILL) != null) {
                i = CastIntegerProtector.parseInt(str);
            } else {
                i = -1;
            }
            XVF.LJIILL(xvg, m159clone, i, m159clone.getLogPb());
            xv5.LIZ();
        }
        XV5 xv52 = this.LIZ;
        XVC.LJII(xv52.LJIILL, xv52.LJIIL, xv52.LJIILIIL, 1.0f, null, true, false);
    }

    @Override // X.WGL
    public final void LIZIZ() {
        this.LIZ.LIZ();
        CutMusicRepeartPlayer cutMusicRepeartPlayer = this.LIZ.LIZLLL;
        if (cutMusicRepeartPlayer != null) {
            cutMusicRepeartPlayer.LIZIZ();
        }
        XV5 xv5 = this.LIZ;
        xv5.LJII = false;
        XVC.LJI(xv5.LJIILL, Integer.valueOf(xv5.LJIIL));
    }

    public XV6(XV5 xv5) {
        this.LIZ = xv5;
    }

    @Override // X.WGL
    public final int LIZJ(float f) {
        return (int) (f * this.LIZ.LJIIL);
    }

    @Override // X.WGL
    public final void LIZLLL(float f) {
        String str;
        XV5 xv5 = this.LIZ;
        int i = (int) (f * xv5.LJIIL);
        if (i > xv5.LJIIJJI) {
            str = "right";
        } else {
            str = "left";
        }
        xv5.LJIIJJI = i;
        CutMusicRepeartPlayer cutMusicRepeartPlayer = xv5.LIZLLL;
        if (cutMusicRepeartPlayer != null) {
            cutMusicRepeartPlayer.LIZ(i);
        }
        XV5 xv52 = this.LIZ;
        XVC.LJ(xv52.LJIILL, xv52.LJIIL, xv52.LJIIJJI, str);
    }
}
