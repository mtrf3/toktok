package com.ss.android.ugc.aweme.voiceconversion.repo;

import X.AnonymousClass114;
import X.C05040Hs;
import X.C221108m2;
import X.C26045AKb;
import X.C44452HcW;
import X.C44454HcY;
import X.C44455HcZ;
import X.C44456Hca;
import X.C44457Hcb;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C82609WbV;
import X.C84913XUf;
import X.DialogC25756A8y;
import X.HG3;
import X.HPY;
import X.HTH;
import X.HWH;
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
import com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VoiceConversionRecordService implements IVoiceConversionReuseService {
    public HWH LIZ;
    public boolean LIZJ;
    public C84913XUf LIZLLL;
    public SafeHandler LJ;
    public DialogC25756A8y LJFF;
    public boolean LIZIZ = true;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C44455HcZ.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C44454HcY.LJLIL);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C44456Hca.LJLIL);
    public final VoiceConversionRecordService$destroyObserver$1 LJIIIZ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService$destroyObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            VoiceConversionRecordService voiceConversionRecordService = VoiceConversionRecordService.this;
            voiceConversionRecordService.LIZIZ = false;
            C84913XUf c84913XUf = voiceConversionRecordService.LIZLLL;
            if (c84913XUf != null) {
                c84913XUf.LIZIZ();
            }
        }
    };

    public static IVoiceConversionReuseService LJ() {
        Object LIZ = C58096Mr6.LIZ(IVoiceConversionReuseService.class, false);
        if (LIZ != null) {
            return (IVoiceConversionReuseService) LIZ;
        }
        return new VoiceConversionRecordService();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final boolean LIZ() {
        return e1.LIZ(31744, "enable_vc_filter_anchor_display", true, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final boolean LIZJ() {
        return e1.LIZ(31744, "enable_vc_filter_anchor_display_publish", true, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final void LIZLLL() {
        C44457Hcb.LIZ.evictAll();
    }

    public final void LJFF(String str, String str2, String str3, MusicModel musicModel, Activity activity, boolean z) {
        ((IExternalService) this.LJIIIIZZ.getValue()).asyncService(str, new HPY(str2, str3, C05040Hs.LIZIZ(str2), musicModel, z, activity));
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, Activity activity, Music music, MusicModel musicModel, String voiceName, String voiceId, String str) {
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
                this.LIZJ = false;
                HWH hwh = this.LIZ;
                if (hwh != null) {
                    V1B.LJLILLLLZI(hwh);
                }
                this.LIZ = null;
            }
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIZ(music.getOwnerBanShowInfo());
            c26045AKb.LJIIJ();
            return;
        }
        this.LIZLLL = new C84913XUf(activity, new C44452HcW(activity, str, this, downloadEffectOrMusicAfterEnterCamera, isRecording, voiceId, voiceName), true);
        ((C82609WbV) C82609WbV.LIZJ.getValue()).LIZ(new HTH(this, str, voiceId, voiceName, activity));
        lifecycleOwner.getLifecycle().addObserver(this.LJIIIZ);
    }
}
