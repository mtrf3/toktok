package X;

import Y.ARunnableS26S0200000_7;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HWS implements InterfaceC84927XUt {
    public final /* synthetic */ HWR LJLIL;

    @Override // X.InterfaceC84927XUt
    public final boolean LJLIL() {
        return true;
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJJJJ() {
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJJLIIIJLLLLLLLZ(MusicModel musicModel) {
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLLLLLLL(int i, boolean z) {
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLZZIL(Effect effect, MusicModel musicModel) {
    }

    public HWS(HWR hwr) {
        this.LJLIL = hwr;
    }

    public final void LIZ(boolean z) {
        HWH hwh = this.LJLIL.LJI;
        if (hwh != null && hwh.isShowing()) {
            HWH hwh2 = this.LJLIL.LJI;
            if (hwh2 != null) {
                hwh2.dismiss();
            }
            this.LJLIL.LJI = null;
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLILZ(MusicModel musicModel, boolean z) {
        ExecutorC142245i8.LJLILLLLZI.LIZ(300L, new ARunnableS26S0200000_7(this.LJLIL, musicModel, 32));
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLZLL(boolean z, boolean z2) {
        C38816FLg.LIZJ(new HWT(this, z, z2, this.LJLIL));
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJILLL(String musicFile, MusicModel musicModel, int i) {
        o.LJIIIZ(musicFile, "musicFile");
        LIZ(false);
        this.LJLIL.LJ(musicModel, musicFile);
        AddYourRecordParam addYourRecordParam = this.LJLIL.LIZJ;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL.LJII;
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        C223978qf.LIZ(addYourRecordParam, true, currentTimeMillis, musicId, this.LJLIL.LJIIIIZZ);
    }
}
