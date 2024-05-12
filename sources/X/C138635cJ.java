package X;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;

/* renamed from: X.5cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C138635cJ {
    public Context LIZ;
    public LifecycleOwner LIZIZ;
    public SurfaceView LIZJ;
    public MutableLiveData LIZLLL;
    public MutableLiveData LJ;
    public MutableLiveData<InfoStickerModel> LJFF;
    public MutableLiveData<InfoStickerModel> LJI;
    public MutableLiveData<StickerNewEngineModel> LJII;
    public VEEditorAutoStartStopArbiter LJIIIIZZ;
    public InterfaceC153045zY LJIIIZ;
    public final MutableLiveData<Integer> LJIIJ = new MutableLiveData<>();
    public boolean LJIIJJI = false;
    public final MutableLiveData<Void> LJIIL = new MutableLiveData<>();
    public final boolean LJIILIIL;
    public final C5MG LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;

    public void LIZ(Context context, LifecycleOwner lifecycleOwner, SurfaceView surfaceView, VideoPublishEditModel videoPublishEditModel) {
    }

    public final void LIZIZ() {
        if (this.LJIIIZ != null) {
            AbstractC73672Svk.LJJIIJZLJL(new CallableC67193QYr(3, this)).LJJL(T16.LIZIZ).LJJJJZ();
        }
    }

    public final void LIZJ() {
        this.LJIIIZ.pause();
    }

    public final void LIZLLL() {
        this.LJIIIZ.play();
    }

    public final void LJ() {
        if (this.LJIILL == 1) {
            this.LJIIIZ.setInfoStickerRestoreMode(this.LJIILLIIL);
        } else {
            this.LJIIIZ.setInfoStickerRestoreMode(1);
        }
    }

    public C138635cJ(int i) {
        this.LJIILIIL = false;
        C135235Sl c135235Sl = new C135235Sl();
        C5MG LIZ = C5K2.LIZ(i, c135235Sl);
        this.LJIILJJIL = LIZ;
        if (i == 13) {
            c135235Sl.LIZLLL = C138645cK.LIZ();
            c135235Sl.LJ = true;
        } else if (i == 2 || i == 3) {
            c135235Sl.LIZLLL = false;
            c135235Sl.LJ = false;
        } else {
            c135235Sl.LIZLLL = C138645cK.LIZ();
            c135235Sl.LJ = C126934yX.LIZ();
        }
        c135235Sl.LJFF = C126234xP.LIZ();
        c135235Sl.LJI = true;
        if (i == 6) {
            this.LJIILIIL = true;
        }
        LIZ.LJIILJJIL = WRY.LIZ(VideoEditContainerScene.LLJILJIL);
    }
}
