package X;

import Y.ARunnableS21S0300000_10;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OVE implements InterfaceC84927XUt {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ TTSVoiceRecordService LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    @Override // X.InterfaceC84927XUt
    public final void LLJJLIIIJLLLLLLLZ(MusicModel musicModel) {
    }

    @Override // X.InterfaceC84927XUt
    public final boolean LJLIL() {
        return this.LJLJI.LIZJ;
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJJJJ() {
        Activity activity = this.LJLIL;
        String str = this.LJLILLLLZI;
        J9P.LIZIZ(activity, str, str, null, null);
    }

    @Override // X.InterfaceC84927XUt
    public final void LLILZ(MusicModel musicModel, boolean z) {
        if (z && (this.LJLIL instanceof LifecycleOwner)) {
            TTSVoiceRecordService tTSVoiceRecordService = this.LJLJI;
            tTSVoiceRecordService.LIZLLL = true;
            ComponentCallbacks2 componentCallbacks2 = this.LJLIL;
            o.LJII(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            tTSVoiceRecordService.LJFF = new SafeHandler((LifecycleOwner) componentCallbacks2);
            TTSVoiceRecordService tTSVoiceRecordService2 = this.LJLJI;
            SafeHandler safeHandler = tTSVoiceRecordService2.LJFF;
            if (safeHandler != null) {
                safeHandler.postDelayed(new ARunnableS21S0300000_10(tTSVoiceRecordService2, this.LJLIL, musicModel, 6), 300L);
            }
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLLLLLLL(int i, boolean z) {
        TTSVoiceRecordService tTSVoiceRecordService;
        HWH hwh;
        HWH hwh2;
        if (!this.LJLJJI && (hwh = (tTSVoiceRecordService = this.LJLJI).LIZ) != null) {
            hwh.setProgress(i);
            if (i >= 98 && (hwh2 = tTSVoiceRecordService.LIZ) != null) {
                hwh2.setCancelable(true);
            }
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLZLL(boolean z, boolean z2) {
        if (z) {
            TTSVoiceRecordService tTSVoiceRecordService = this.LJLJI;
            tTSVoiceRecordService.LIZLLL = false;
            HWH hwh = tTSVoiceRecordService.LIZIZ;
            if (hwh != null) {
                V1B.LJLILLLLZI(hwh);
            }
            tTSVoiceRecordService.LIZIZ = null;
            HWH hwh2 = tTSVoiceRecordService.LIZ;
            if (hwh2 != null) {
                hwh2.dismiss();
                return;
            }
            return;
        }
        HWH hwh3 = this.LJLJI.LIZ;
        if (hwh3 != null) {
            hwh3.dismiss();
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLZZIL(Effect effect, MusicModel musicModel) {
        TTSVoiceRecordService tTSVoiceRecordService = this.LJLJI;
        tTSVoiceRecordService.LIZLLL = false;
        HWH hwh = tTSVoiceRecordService.LIZIZ;
        if (hwh != null) {
            V1B.LJLILLLLZI(hwh);
        }
        tTSVoiceRecordService.LIZIZ = null;
        HWH hwh2 = tTSVoiceRecordService.LIZ;
        if (hwh2 != null) {
            hwh2.dismiss();
        }
        this.LJLJI.LJ(this.LJLILLLLZI, this.LJLJJLL, this.LJLJL, musicModel, this.LJLIL, true);
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJILLL(String musicFile, MusicModel musicModel, int i) {
        o.LJIIIZ(musicFile, "musicFile");
        boolean z = this.LJLJJI;
        TTSVoiceRecordService tTSVoiceRecordService = this.LJLJI;
        if (z) {
            tTSVoiceRecordService.LIZLLL = false;
            HWH hwh = tTSVoiceRecordService.LIZIZ;
            if (hwh != null) {
                V1B.LJLILLLLZI(hwh);
            }
            tTSVoiceRecordService.LIZIZ = null;
        }
        HWH hwh2 = tTSVoiceRecordService.LIZ;
        if (hwh2 != null) {
            hwh2.dismiss();
        }
        HWH hwh3 = this.LJLJI.LIZ;
        if (hwh3 != null) {
            hwh3.dismiss();
        }
        if (this.LJLJJL) {
            ((IAVPublishService) this.LJLJI.LJII.getValue()).addMusic(musicModel, 0);
            Intent intent = new Intent();
            intent.putExtra("path", musicFile);
            intent.putExtra("music_model", musicModel);
            this.LJLIL.setResult(-1, intent);
            this.LJLIL.finish();
            return;
        }
        TTSVoiceRecordService tTSVoiceRecordService2 = this.LJLJI;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJJLL;
        String str3 = this.LJLJL;
        musicModel.setLocalPath(musicFile);
        tTSVoiceRecordService2.LJ(str, str2, str3, musicModel, this.LJLIL, true);
    }

    public OVE(Activity activity, String str, TTSVoiceRecordService tTSVoiceRecordService, boolean z, boolean z2, String str2, String str3) {
        this.LJLIL = activity;
        this.LJLILLLLZI = str;
        this.LJLJI = tTSVoiceRecordService;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
    }
}
