package com.ss.android.ugc.aweme.ttsvoice.repo;

import X.AnonymousClass114;
import X.C221108m2;
import X.C26045AKb;
import X.C44010HPa;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C80413Dp;
import X.C84913XUf;
import X.HG3;
import X.HWG;
import X.HWH;
import X.HWK;
import X.OVD;
import X.OVE;
import X.OVG;
import X.OVH;
import X.OVI;
import X.RBX;
import X.V1B;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TTSVoiceRecordService implements IVoiceReuseService {
    public HWH LIZ;
    public HWH LIZIZ;
    public boolean LIZLLL;
    public C84913XUf LJ;
    public SafeHandler LJFF;
    public boolean LIZJ = true;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(OVD.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(OVH.LJLIL);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(OVI.LJLIL);
    public final TTSVoiceRecordService$destroyObserver$1 LJIIIZ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService$destroyObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            TTSVoiceRecordService tTSVoiceRecordService = TTSVoiceRecordService.this;
            tTSVoiceRecordService.LIZJ = false;
            C84913XUf c84913XUf = tTSVoiceRecordService.LJ;
            if (c84913XUf != null) {
                c84913XUf.LIZIZ();
            }
        }
    };

    public static IVoiceReuseService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IVoiceReuseService.class, false);
        if (LIZ != null) {
            return (IVoiceReuseService) LIZ;
        }
        return new TTSVoiceRecordService();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService
    public final boolean LIZ() {
        return e1.LIZ(31744, "enable_tts_voice_anchor_display", true, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService
    public final void LIZJ() {
        C80413Dp.LIZ.evictAll();
    }

    public final void LJ(String str, String str2, String str3, MusicModel musicModel, Activity activity, boolean z) {
        ((IExternalService) this.LJIIIIZZ.getValue()).asyncService(str, new C44010HPa(str2, str3, musicModel, z, activity));
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, Activity activity, Music music, MusicModel musicModel, String voiceName, String voiceId, String str) {
        int i;
        String ownerBanShowInfo;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(voiceName, "voiceName");
        o.LJIIIZ(voiceId, "voiceId");
        boolean downloadEffectOrMusicAfterEnterCamera = ((IConfigService) this.LJI.getValue()).avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        boolean isRecording = ((IConfigService) this.LJI.getValue()).shortVideoConfig().isRecording();
        if (((RBX) HG3.LJIILL()).getCurUser().isLive()) {
            AnonymousClass114.LIZ(activity, R.string.hjl);
            return;
        }
        if (!((IAVPublishService) this.LJII.getValue()).checkIsAlreadyPublished(activity)) {
            return;
        }
        if (musicModel != null && !MusicService.LJJLIIIJJI().LJJIL(musicModel, activity, true)) {
            return;
        }
        if (music != null && (ownerBanShowInfo = music.getOwnerBanShowInfo()) != null && ownerBanShowInfo.length() > 0) {
            if (downloadEffectOrMusicAfterEnterCamera) {
                this.LIZLLL = false;
                HWH hwh = this.LIZIZ;
                if (hwh != null) {
                    V1B.LJLILLLLZI(hwh);
                }
                this.LIZIZ = null;
            }
            HWH hwh2 = this.LIZ;
            if (hwh2 != null) {
                hwh2.dismiss();
            }
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIZ(music.getOwnerBanShowInfo());
            c26045AKb.LJIIJ();
            return;
        }
        this.LJ = new C84913XUf(activity, new OVE(activity, str, this, downloadEffectOrMusicAfterEnterCamera, isRecording, voiceId, voiceName), true);
        lifecycleOwner.getLifecycle().addObserver(this.LJIIIZ);
        if (e1.LIZ(31744, "reuse_sound_shooting_from_tts_voice_detail_page", true, false) && musicModel != null) {
            this.LIZ = HWG.LIZIZ(activity, HWK.VISIBLE_AFTER_5S, new OVG(this, musicModel));
            C84913XUf c84913XUf = this.LJ;
            if (c84913XUf != null) {
                if (music != null) {
                    i = music.getVideoDuration();
                } else {
                    i = 0;
                }
                c84913XUf.LIZLLL(musicModel, null, true, i, downloadEffectOrMusicAfterEnterCamera, false);
                return;
            }
            return;
        }
        LJ(str, voiceId, voiceName, null, activity, false);
    }
}
