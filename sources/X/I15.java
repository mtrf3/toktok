package X;

import Y.AgS124S0100000_7;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I15 {
    public final C82622Wbi LIZ;
    public final ShortVideoContext LIZIZ;
    public final I0N LIZJ;
    public final ActivityC45651qj LIZLLL;
    public final WLB LJ;
    public final C62822Ol8 LJFF;
    public RecordPresetResource LJI;
    public ConcurrentHashMap<String, Integer> LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final String LJIIL;
    public final C62822Ol8 LJIILIIL;
    public I19 LJIILJJIL;
    public I19 LJIILL;
    public long LJIILLIIL;
    public C10K<Integer> LJIIZILJ;

    public final void LIZJ() {
        if (!this.LJIIJ) {
            return;
        }
        H7B.LIZ("ShootSameToRecordPage cancel load");
        this.LJIIJJI = true;
        RecordPresetResource recordPresetResource = this.LJI;
        if (recordPresetResource != null) {
            LJIIL(recordPresetResource);
            I19 i19 = this.LJIILJJIL;
            i19.LIZLLL = true;
            i19.LJ = true;
            IAnotherMusicService iAnotherMusicService = C44172HVg.LJI;
            RecordPresetResource recordPresetResource2 = this.LJI;
            if (recordPresetResource2 != null) {
                iAnotherMusicService.LJII(recordPresetResource2.getMusicId());
                LJIILIIL();
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.LJIIIIZZ;
                long j2 = currentTimeMillis - this.LJIIIZ;
                RecordPresetResource recordPresetResource3 = this.LJI;
                if (recordPresetResource3 != null) {
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("enter_from", "video_shoot_page");
                    c145995oB.LJI("shoot_way", this.LIZIZ.shootWay);
                    c145995oB.LJI("content_source", this.LIZIZ.LIZLLL().getContentSource());
                    c145995oB.LJI("content_type", this.LIZIZ.LIZLLL().getContentType());
                    c145995oB.LJI("creation_id", this.LIZIZ.LJI());
                    c145995oB.LJI("group_id", C78983UzD.LJJIJL());
                    c145995oB.LJI("music_id", LJI(recordPresetResource3));
                    c145995oB.LJI("effect_id", LJFF(recordPresetResource3));
                    c145995oB.LIZIZ(j2, "loading_effect_time");
                    c145995oB.LIZIZ(j, "loading_music_time");
                    FMX.LJIIL("record_preset_resource_click_cancel", c145995oB.LIZ);
                    return;
                }
                o.LJIJI("recordPresetResource");
                throw null;
            }
            o.LJIJI("recordPresetResource");
            throw null;
        }
        o.LJIJI("recordPresetResource");
        throw null;
    }

    public final java.util.Map<String, String> LIZLLL() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = this.LIZIZ.creativeModel.recordEffectModel.stickerFrom;
        if (str2 != null && str2.length() > 0) {
            hashMap.put(WM7.SCENE_SERVICE, str2);
        }
        Object LJLLLLLL = ORZ.LJLLLLLL(0, (List) this.LIZ.LJ(ArrayList.class, "gradleKey"));
        if ((LJLLLLLL instanceof String) && (str = (String) LJLLLLLL) != null && str.length() > 0) {
            hashMap.put("grade_key", str);
        }
        return hashMap;
    }

    public final boolean LJIIJ() {
        return this.LJII.containsKey("effect");
    }

    public final boolean LJIIJJI() {
        return this.LJII.containsKey("music");
    }

    public final void LJIILJJIL() {
        ActivityC45651qj activityC45651qj;
        if (!this.LJIIJJI) {
            if (ORZ.LJLJJI(this.LIZIZ.shootWay, C47261Igj.LJJIJIIJI("prop_page", "prop_reuse", "anchor_combine_prop", "scan")) && (activityC45651qj = this.LIZLLL) != null) {
                C78920UyC.LIZLLL(R.string.dwk, activityC45651qj, 3005);
            }
        }
    }

    public final void LJIILL() {
        ActivityC45651qj activityC45651qj;
        if (!this.LJIIJJI) {
            if (ORZ.LJLJJI(this.LIZIZ.shootWay, C47261Igj.LJJIJIIJI("single_song", "collection_music", "draft_again")) && (activityC45651qj = this.LIZLLL) != null) {
                C78920UyC.LIZLLL(R.string.dwl, activityC45651qj, 3005);
            }
        }
    }

    public final void LJIILIIL() {
        if (!LJIIJ() || this.LJIILJJIL.LJ) {
            if (LJIIJJI() && !this.LJIILJJIL.LIZLLL) {
                return;
            }
            C10K.LJIJJ(C47261Igj.LJJIJ(this.LJIIZILJ)).LIZLLL(new AgS124S0100000_7(this, 28));
        }
    }

    public static String LJFF(RecordPresetResource recordPresetResource) {
        String str;
        String effectId = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (TextUtils.isEmpty(effectId)) {
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (effect == null) {
                    return null;
                }
                return effect.getEffectId();
            }
            return effectId;
        }
        return effectId;
    }

    public static String LJI(RecordPresetResource recordPresetResource) {
        String str;
        String musicId = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (TextUtils.isEmpty(musicId)) {
            if (musicModel != null) {
                str = musicModel.getMusicId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (musicModel == null) {
                    return null;
                }
                return musicModel.getMusicId();
            }
            return musicId;
        }
        return musicId;
    }

    public final void LIZ(Effect effect) {
        Bundle bundle;
        Boolean bool = this.LIZIZ.showCancelAfterPinProp;
        o.LJIIIIZZ(bool, "shortVideoContext.showCancelAfterPinProp");
        if (bool.booleanValue()) {
            this.LIZJ.Sl(true, true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        I0N i0n = this.LIZJ;
        List LJJIJ = C47261Igj.LJJIJ(effect);
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = this.LIZIZ.greenScreenKitConfig;
        if (oPSDK$GreenScreenKitConfig != null) {
            bundle = oPSDK$GreenScreenKitConfig.toBundle();
        } else {
            bundle = null;
        }
        C82398WVm.LJ(i0n, LJJIJ, true, true, null, false, bundle, 0, 15352);
    }

    public final void LJIIL(RecordPresetResource recordPresetResource) {
        Effect effect = recordPresetResource.getEffect();
        String effectId = recordPresetResource.getEffectId();
        if (effect != null) {
            C82398WVm.LJ(this.LIZJ, C47261Igj.LJJIJ(effect), true, false, null, false, null, 0, 16376);
        } else {
            if (effectId == null) {
                return;
            }
            C82398WVm.LIZIZ(this.LIZJ, C47261Igj.LJJIJ(effectId), LIZLLL(), new I13(this));
        }
    }

    public final void LIZIZ(AVMusic aVMusic, String str) {
        I27 LIZ = this.LJ.cE().LIZ();
        if (LIZ != null) {
            LIZ.onChooseMusicDone(false, "", aVMusic, str);
        }
        I27 LIZ2 = this.LJ.cE().LIZ();
        if (LIZ2 != null) {
            LIZ2.handleChooseMusic(C145385nC.LIZ(Boolean.FALSE, "", aVMusic, str, null, 0L, 0L, 112));
        }
        I9T.LJI(aVMusic, false, this.LIZIZ.creativeModel.musicBuzModel);
        JediViewModel LIZ3 = ((C165626ek) this.LIZ.LJ(C165626ek.class, null)).LIZ(ChooseMediaViewModel.class);
        o.LJIIIIZZ(LIZ3, "diContainer.get(JediView…class.java,\n            )");
        LIZ3.setState(new AqS60S1100000_7(aVMusic, str, 6));
        long j = this.LJIILLIIL;
        String LJI = this.LIZIZ.LJI();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "long_press");
        c188727au.LJ(System.currentTimeMillis() - j, "duration");
        c188727au.LJIIIZ("creation_id", LJI);
        FMX.LJIIL("video_shoot_page_music_load_time", c188727au.LIZ);
    }

    public final void LJ(Effect effect, I1C i1c) {
        C82398WVm.LJ(this.LIZJ, C47261Igj.LJJIJ(effect), true, true, new I16(i1c, this), true, null, 0, 15592);
    }

    public final void LJII(RecordPresetResource recordPresetResource, I1C i1c) {
        String str;
        String effectId = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (TextUtils.isEmpty(effectId)) {
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                effectId = effect != null ? effect.getEffectId() : null;
            }
        }
        this.LJIIIZ = System.currentTimeMillis();
        if (effect != null) {
            LJ(effect, i1c);
            return;
        }
        if (effectId == null || effectId.length() == 0) {
            I19 i19 = this.LJIILJJIL;
            i19.LJ = true;
            i19.LIZ = null;
            LJIIIZ(0, System.currentTimeMillis() - this.LJIIIZ, "effect");
            LJIILIIL();
            return;
        }
        C82398WVm.LIZIZ(this.LIZJ, C47261Igj.LJJIJ(effectId), LIZLLL(), new I1D(i1c));
    }

    public final void LJIIIIZZ(RecordPresetResource recordPresetResource, I1C i1c) {
        String str;
        String musicId = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (TextUtils.isEmpty(musicId)) {
            if (musicModel != null) {
                str = musicModel.getMusicId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                musicId = musicModel != null ? musicModel.getMusicId() : null;
            }
        }
        this.LJIIIIZZ = System.currentTimeMillis();
        if (musicId == null || musicId.length() == 0) {
            I19 i19 = this.LJIILJJIL;
            i19.LIZLLL = true;
            i19.LIZIZ = null;
            i19.LIZJ = null;
            LJIIIZ(0, System.currentTimeMillis() - this.LJIIIIZZ, "music");
            LJIILIIL();
            return;
        }
        C44172HVg.LJI.requestMusic(musicId, new I1A(i1c, this));
    }

    public final void LJIILLIIL(int i, String str) {
        if (this.LJII.isEmpty()) {
            return;
        }
        if (this.LJII.containsKey(str)) {
            this.LJII.put(str, Integer.valueOf(i));
        }
        for (Integer progress : this.LJII.values()) {
            o.LJIIIIZZ(progress, "progress");
            progress.intValue();
        }
        I1F i1f = (I1F) this.LJFF.getValue();
        this.LJII.size();
        i1f.LIZ();
    }

    public I15(C82622Wbi diContainer, ShortVideoContext shortVideoContext, I0N stickerApiComponent) {
        String str;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        this.LIZ = diContainer;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = stickerApiComponent;
        this.LIZLLL = (ActivityC45651qj) diContainer.LJ(ActivityC45651qj.class, null);
        this.LJ = (WLB) diContainer.LJ(WLB.class, null);
        this.LJFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 552));
        this.LJII = new ConcurrentHashMap<>();
        if (C44810HiI.LIZ() == 1) {
            str = "load_serial";
        } else {
            str = "load_parallel";
        }
        this.LJIIL = str;
        this.LJIILIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 551));
        this.LJIILJJIL = new I19(0);
        this.LJIILL = new I19(0);
        this.LJIILLIIL = -1L;
        this.LJIIZILJ = C10K.LJIIIZ(1);
    }

    public final void LJIIIZ(int i, long j, String str) {
        RecordPresetResource recordPresetResource = this.LJI;
        if (recordPresetResource != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("shoot_way", this.LIZIZ.shootWay);
            c145995oB.LJI("content_source", this.LIZIZ.LIZLLL().getContentSource());
            c145995oB.LJI("content_type", this.LIZIZ.LIZLLL().getContentType());
            c145995oB.LJI("creation_id", this.LIZIZ.LJI());
            c145995oB.LJI("group_id", C78983UzD.LJJIJL());
            c145995oB.LJI("music_id", LJI(recordPresetResource));
            c145995oB.LJI("effect_id", LJFF(recordPresetResource));
            c145995oB.LIZIZ(j, "loading_duration");
            c145995oB.LIZ(i, "loading_status");
            c145995oB.LJI("loading_type", str);
            FMX.LJIIL("record_preset_resource_loading_finish", c145995oB.LIZ);
            return;
        }
        o.LJIJI("recordPresetResource");
        throw null;
    }
}
