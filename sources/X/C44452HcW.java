package X;

import Y.ARunnableS18S0300000_7;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HcW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44452HcW implements InterfaceC84927XUt {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ VoiceConversionRecordService LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    @Override // X.InterfaceC84927XUt
    public final void LLJJLIIIJLLLLLLLZ(MusicModel musicModel) {
    }

    @Override // X.InterfaceC84927XUt
    public final boolean LJLIL() {
        return this.LJLJI.LIZIZ;
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
            VoiceConversionRecordService voiceConversionRecordService = this.LJLJI;
            voiceConversionRecordService.LIZJ = true;
            ComponentCallbacks2 componentCallbacks2 = this.LJLIL;
            o.LJII(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            voiceConversionRecordService.LJ = new SafeHandler((LifecycleOwner) componentCallbacks2);
            VoiceConversionRecordService voiceConversionRecordService2 = this.LJLJI;
            SafeHandler safeHandler = voiceConversionRecordService2.LJ;
            if (safeHandler != null) {
                safeHandler.postDelayed(new ARunnableS18S0300000_7(voiceConversionRecordService2, this.LJLIL, musicModel, 4), 300L);
            }
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLLLLLLL(int i, boolean z) {
        if (!this.LJLJJI) {
            this.LJLJI.getClass();
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLZLL(boolean z, boolean z2) {
        if (z) {
            VoiceConversionRecordService voiceConversionRecordService = this.LJLJI;
            voiceConversionRecordService.LIZJ = false;
            HWH hwh = voiceConversionRecordService.LIZ;
            if (hwh != null) {
                V1B.LJLILLLLZI(hwh);
            }
            voiceConversionRecordService.LIZ = null;
            return;
        }
        this.LJLJI.getClass();
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLZZIL(Effect effect, MusicModel musicModel) {
        VoiceConversionRecordService voiceConversionRecordService = this.LJLJI;
        voiceConversionRecordService.LIZJ = false;
        HWH hwh = voiceConversionRecordService.LIZ;
        if (hwh != null) {
            V1B.LJLILLLLZI(hwh);
        }
        voiceConversionRecordService.LIZ = null;
        this.LJLJI.LJFF(this.LJLILLLLZI, this.LJLJJLL, this.LJLJL, musicModel, this.LJLIL, true);
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJILLL(String musicFile, MusicModel musicModel, int i) {
        o.LJIIIZ(musicFile, "musicFile");
        boolean z = this.LJLJJI;
        VoiceConversionRecordService voiceConversionRecordService = this.LJLJI;
        if (z) {
            voiceConversionRecordService.LIZJ = false;
            HWH hwh = voiceConversionRecordService.LIZ;
            if (hwh != null) {
                V1B.LJLILLLLZI(hwh);
            }
            voiceConversionRecordService.LIZ = null;
        } else {
            voiceConversionRecordService.getClass();
        }
        this.LJLJI.getClass();
        if (this.LJLJJL) {
            ((IAVPublishService) this.LJLJI.LJII.getValue()).addMusic(musicModel, 0);
            Intent intent = new Intent();
            intent.putExtra("path", musicFile);
            intent.putExtra("music_model", musicModel);
            this.LJLIL.setResult(-1, intent);
            this.LJLIL.finish();
            return;
        }
        VoiceConversionRecordService voiceConversionRecordService2 = this.LJLJI;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJJLL;
        String str3 = this.LJLJL;
        musicModel.setLocalPath(musicFile);
        voiceConversionRecordService2.LJFF(str, str2, str3, musicModel, this.LJLIL, true);
    }

    public C44452HcW(Activity activity, String str, VoiceConversionRecordService voiceConversionRecordService, boolean z, boolean z2, String str2, String str3) {
        this.LJLIL = activity;
        this.LJLILLLLZI = str;
        this.LJLJI = voiceConversionRecordService;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
    }
}
