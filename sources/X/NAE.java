package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NAE implements NAT {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJI;
    public final NAJ LIZ;
    public final NAO LIZIZ;
    public final NAO LIZJ;
    public final NAO LIZLLL;
    public final NAO LJ;
    public final C62822Ol8 LJFF;

    static {
        TBT tbt = new TBT(NAE.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NAE.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0, c65351Pkp), C61845OOz.LIZJ(NAE.class, "lifecycleOwner", "getLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0, c65351Pkp), C61845OOz.LIZJ(NAE.class, "viewModelV2", "getViewModelV2()Lcom/ss/android/ugc/aweme/commercialize/media/impl/viewmodel/RecommendMusicV2ViewModel;", 0, c65351Pkp)};
    }

    public final void LIZ() {
        ScopedMusicPlayer scopedMusicPlayer = (ScopedMusicPlayer) ((RecommendMusicV2ViewModel) this.LJ.LIZ(LJI[3])).LJLJI.getValue();
        if (scopedMusicPlayer != null) {
            scopedMusicPlayer.pause();
        }
    }

    @Override // X.NAT
    public final NAJ LIZIZ() {
        return this.LIZ;
    }

    public NAE(NAJ injectContainer) {
        o.LJIIIZ(injectContainer, "injectContainer");
        this.LIZ = injectContainer;
        this.LIZIZ = new NAO(injectContainer, Activity.class);
        this.LIZJ = new NAO(injectContainer, MusicDetail.class);
        this.LIZLLL = new NAO(injectContainer, LifecycleOwner.class);
        this.LJ = new NAO(injectContainer, RecommendMusicV2ViewModel.class);
        this.LJFF = C221108m2.LIZIZ(new AqS160S0100000_10(this, 568));
    }
}
