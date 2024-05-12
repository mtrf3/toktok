package com.ss.android.ugc.aweme.music.v2.assem;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C01H;
import X.C0NU;
import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C227768wm;
import X.C2K0;
import X.C32151Nz;
import X.C38816FLg;
import X.C3A5;
import X.C47130Iec;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5S1;
import X.C61998OUw;
import X.C61999OUx;
import X.C62000OUy;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78939UyV;
import X.C78983UzD;
import X.C84913XUf;
import X.C9BE;
import X.EV9;
import X.ExecutorC142245i8;
import X.FMX;
import X.HG3;
import X.HT5;
import X.HWH;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.InterfaceC84927XUt;
import X.J9P;
import X.O6R;
import X.OGV;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.TBT;
import X.V1B;
import X.Z9N;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS43S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS1S0300000_10;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS49S1200000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class MusicShootAssem extends ShootAssem implements ShootAbility, ShootContainerProviderAbility, InterfaceC84927XUt {
    public final C214298b3 LJLLLLLL;
    public HWH LJLZ;
    public HWH LJZ;
    public ActivityC45651qj LJZI;
    public Fragment LJZL;
    public Music LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public final String LLFFF;
    public long LLFII;
    public boolean LLFZ;
    public final boolean LLI;
    public C84913XUf LLIFFJFJJ;
    public MusicDetail LLII;
    public final ICommerceMusicLogger LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;
    public final C62822Ol8 LLIIZ;
    public final C62822Ol8 LLIL;
    public final C62822Ol8 LLILII;
    public final C62822Ol8 LLILIL;
    public final C62822Ol8 LLILL;
    public final C62822Ol8 LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public final C62822Ol8 LLILLL;
    public final C62822Ol8 LLILZ;
    public final C62822Ol8 LLILZIL;
    public final C62822Ol8 LLILZLL;
    public final C62822Ol8 LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;

    public MusicShootAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 291), C62000OUy.INSTANCE, null);
        this.LLFFF = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LLI = AVExternalServiceImpl.LIZ().storyService().enableMusicShareStory();
        this.LLIIII = CommerceMusicLogger.LJJII();
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 273));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 276));
        this.LLIIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 289));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 285));
        this.LLIIJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 271));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 283));
        this.LLIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, BuildConfig.VERSION_CODE));
        this.LLIILII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 282));
        this.LLIILZL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 287));
        this.LLIIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 272));
        this.LLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 278));
        this.LLILII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 274));
        this.LLILIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 280));
        this.LLILL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 284));
        this.LLILLIZIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 286));
        this.LLILLJJLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 288));
        this.LLILLL = C221108m2.LIZIZ(new C61999OUx(this));
        this.LLILZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 275));
        this.LLILZIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 277));
        this.LLILZLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 279));
        this.LLIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 281));
        this.LLIZLLLIL = -1L;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void ZJ() {
        this.LLJ = true;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        FMX.LJIIL("share_to_story_click", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "single_song");
        c188727au2.LJIIIZ("shoot_way", "share_to_story");
        c188727au2.LJIIIZ("content_type", "share");
        c188727au2.LJIIIZ("creation_id", this.LLFFF);
        c188727au2.LJIIIZ("music_selected_from", "music_share");
        FMX.LJIIL("shoot", c188727au2.LIZ);
        withState((AssemViewModel) this.LJLLLLLL.getValue(), new AqS176S0100000_10(this, 57));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void te0() {
        /*
            r4 = this;
            r0 = 0
            r4.LLJ = r0
            long r0 = java.lang.System.currentTimeMillis()
            r4.LLIZLLLIL = r0
            X.OGV r0 = r4.VQ()
            if (r0 == 0) goto L16
            r0.LJ()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L33
        L16:
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r0 = com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.LIZJ()
            boolean r0 = r0.LJIIZILJ()
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger r3 = r4.LLIIII
            X.N4C r0 = X.N4C.LIZ
            r0.getClass()
            X.MIu r2 = X.N4C.LJFF
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 58
            r1.<init>(r4, r0)
            r3.LJIILJJIL(r2, r1)
        L33:
            X.8b3 r0 = r4.LJLLLLLL
            java.lang.Object r2 = r0.getValue()
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r2
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 59
            r1.<init>(r4, r0)
            r4.withState(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem.te0():void");
    }

    public final String U3() {
        return (String) this.LLIIIILZ.getValue();
    }

    public final String X3() {
        return (String) this.LLIIIL.getValue();
    }

    public final String Y3() {
        if (!TextUtils.isEmpty((String) this.LLILII.getValue())) {
            try {
                return JSONObjectProtectorUtils.getString(new JSONObject((String) this.LLILII.getValue()), "shoot_from");
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String Z3() {
        return (String) this.LLIIJI.getValue();
    }

    public final int a4() {
        return ((Number) this.LLIIJLIL.getValue()).intValue();
    }

    public final void c4() {
        Music music;
        String str;
        String str2;
        String str3;
        boolean z;
        MusicCommerceRecommendViewModel musicCommerceRecommendViewModel = (MusicCommerceRecommendViewModel) ViewModelProviders.of(getFragment()).get(MusicCommerceRecommendViewModel.class);
        boolean z2 = musicCommerceRecommendViewModel.LJLILLLLZI;
        this.LLF = z2;
        if (z2) {
            music = musicCommerceRecommendViewModel.LJLJI;
        } else {
            music = this.LL;
        }
        if (music == null) {
            return;
        }
        if (MSAdaptionService.LJIIL().LJI(getActivity())) {
            C16880lQ.LLZILL(Toast.makeText(getActivity(), getActivity().getString(R.string.f1i), 0));
            return;
        }
        MusicModel convertToMusicModel = music.convertToMusicModel();
        this.LLFII = System.currentTimeMillis();
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        boolean isRecording = AVExternalServiceImpl.LIZ().configService().shortVideoConfig().isRecording();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "single_song");
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJ(AVExternalServiceImpl.LIZ().infoService().getDurationSinceAppForeground(this.LLFFF), "time_elapsed_since_launch_app");
        c188727au.LJIIIZ("music_id", music.getMid());
        c188727au.LJIIIZ("group_id", U3());
        c188727au.LJFF(Boolean.TRUE, "is_ui_shoot");
        String str4 = "1";
        if (music.isNewRelease()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("music_new_flag", str);
        if (!TextUtils.isEmpty((String) this.LLIL.getValue())) {
            c188727au.LJI("from_banner_id", (String) this.LLIL.getValue());
        }
        if ("homepage_hot".equals(getFrom())) {
            c188727au.LJI("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIILLIIL(0, U3())));
        }
        if (this.LLF) {
            c188727au.LJI("music_rec_way", "music_detail_page_rec");
        }
        String Y3 = Y3();
        if (!TextUtils.isEmpty(Y3)) {
            O3(c188727au);
        }
        P3(c188727au);
        if (convertToMusicModel != null) {
            convertToMusicModel.setFromSection(CommerceMediaServiceImpl.LIZJ().LJIIJ(convertToMusicModel, false));
            float LIZ = C47130Iec.LIZ(convertToMusicModel.getMusicVolumeInfo());
            if (C47130Iec.LIZJ(Float.valueOf(LIZ))) {
                c188727au.LIZIZ(LIZ, "bgm_volume_difference_with_feed_db");
            }
        }
        c188727au.LJI("shoot_enter_from", (String) this.LLIIL.getValue());
        c188727au.LJI("is_original_and_added_sound", (String) this.LLIILII.getValue());
        c188727au.LJI("original_sound_volume", (String) this.LLIILZL.getValue());
        c188727au.LJI("added_sound_volume", (String) this.LLIIZ.getValue());
        c188727au.LIZLLL(((Number) this.LLILIL.getValue()).intValue(), "is_bundled");
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("shoot", c188727au.LIZ);
        String str5 = "search_result";
        if (!MusicService.LJJLIIIJJI().LJJIL(music.convertToMusicModel(), getContext(), true)) {
            C188727au c188727au2 = new C188727au();
            if (!TextUtils.equals("general_search", getFrom())) {
                str5 = getFrom();
            }
            c188727au2.LJIIIZ("previous_page", str5);
            c188727au2.LJIIIZ("action_type", "shoot");
            c188727au2.LJIIIZ("music_id", music.getMid());
            c188727au2.LJIIIZ("enter_from", getFrom());
            if (!TextUtils.isEmpty(Y3)) {
                O3(c188727au2);
            }
            FMX.LJIIL("user_music_failed", c188727au2.LIZ);
            return;
        }
        C01H.LIZIZ(C0NU.TT_TAB_PUBLISH_LOAD, 3000);
        if (((RBX) HG3.LJIILL()).getCurUser().isLive()) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.hjl);
            c5s1.LJ();
            return;
        }
        if (!TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
            C5S1 c5s12 = new C5S1(getContext());
            c5s12.LIZLLL(music.getOwnerBanShowInfo());
            c5s12.LJ();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("route", "1");
            jSONObject.put("group_id", U3());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C78939UyV.LJLJI = "click_music_publish";
        Map<String, String> LLLLIILL = SearchServiceImpl.LLLZI().LLLLIILL();
        c188727au.LJIIIZ("creation_id", this.LLFFF);
        c188727au.LJIIIZ("shoot_way", "single_song");
        String str6 = "share_from_resso";
        if (!o.LJ("share_from_resso", getFrom())) {
            str6 = "single_song";
        }
        c188727au.LJIIIZ("enter_from", str6);
        c188727au.LJIIIZ("music_id", music.getMid());
        c188727au.LJIIIZ("process_id", X3());
        c188727au.LJ(AVExternalServiceImpl.LIZ().infoService().getDurationSinceAppForeground(this.LLFFF), "time_elapsed_since_launch_app");
        c188727au.LJFF(Boolean.FALSE, "is_ui_shoot");
        c188727au.LJIIIZ("group_id", U3());
        c188727au.LJIIIZ("previous_page_position", (String) this.LLILLJJLI.getValue());
        c188727au.LJIIIZ("search_type", LLLLIILL.get("searchType"));
        c188727au.LJIIIZ("shoot_enter_from", (String) this.LLIIL.getValue());
        c188727au.LIZLLL(((Number) this.LLILIL.getValue()).intValue(), "is_bundled");
        String str7 = C78939UyV.LJLJI;
        if (!TextUtils.isEmpty(str7)) {
            c188727au.LJI("enter_method", str7);
        }
        if (o.LJ("general_search", getFrom()) || o.LJ("search_result", getFrom())) {
            C50652JuK.Companion.getClass();
            C50321Joz LIZIZ = C50651JuJ.LIZIZ();
            if (LIZIZ != null) {
                c188727au.LJI("search_id", LIZIZ.getSearchId());
            }
        }
        P3(c188727au);
        if (!TextUtils.isEmpty(Y3)) {
            O3(c188727au);
        }
        c188727au.LIZLLL(HT5.LIZ(), "favorite_scene");
        C78983UzD.LJII(c188727au, Z9N.LIZIZ.LLJLLIL(getFrom(), ""));
        c188727au.LIZLLL(0, "after_consumption ");
        if (music.isFollowerTagVisible) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("is_following_tag ", str2);
        if (!music.isFriendTagVisible) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("is_friend_tag", str4);
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("shoot", c188727au.LIZ);
        if (TextUtils.equals("search_result", getFrom()) || TextUtils.equals("general_search", getFrom()) || TextUtils.equals("search_for_you_list", getFrom())) {
            C188727au c188727au3 = new C188727au();
            c188727au3.LJIIIZ("creation_id", this.LLFFF);
            c188727au3.LJIIIZ("shoot_way", "single_song");
            c188727au3.LJIIIZ("music_id", music.getMid());
            if (TextUtils.equals("general_search", getFrom())) {
                str3 = "general";
            } else {
                str3 = "music";
            }
            c188727au3.LJIIIZ("search_type", str3);
            if (!TextUtils.equals("general_search", getFrom())) {
                str5 = getFrom();
            }
            c188727au3.LJIIIZ("previous_page", str5);
            FMX.LJIIL("search_shoot", c188727au3.LIZ);
        }
        if (!MusicService.LJJLIIIJJI().LJJIL(music.convertToMusicModel(), getContext(), true)) {
            FMX.LJIILL("music_detail_trace", new OSZ("check_valid", "stage"));
            return;
        }
        C84913XUf c84913XUf = this.LLIFFJFJJ;
        if (c84913XUf != null) {
            String W3 = W3();
            int a4 = a4();
            if (downloadEffectOrMusicAfterEnterCamera && !isRecording) {
                z = true;
            } else {
                z = false;
            }
            c84913XUf.LIZLLL(convertToMusicModel, W3, false, a4, z, this.LLF);
        }
    }

    public final ActivityC45651qj getActivity() {
        ActivityC45651qj activityC45651qj = this.LJZI;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        o.LJIJI("activity");
        throw null;
    }

    public final Fragment getFragment() {
        Fragment fragment = this.LJZL;
        if (fragment != null) {
            return fragment;
        }
        o.LJIJI("fragment");
        throw null;
    }

    public final String getFrom() {
        return (String) this.LLIIIJ.getValue();
    }

    @Override // X.InterfaceC84927XUt
    public final boolean LJLIL() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null || !LIZLLL.isAdded()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJJJJ() {
        J9P.LIZJ(C212428Vi.LIZLLL(this), "single_song", "click_music_shoot", null, null);
    }

    public final OGV VQ() {
        CommerceRecommendAbility commerceRecommendAbility = (CommerceRecommendAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(getFragment(), null), CommerceRecommendAbility.class, null);
        if (commerceRecommendAbility == null) {
            return null;
        }
        return commerceRecommendAbility.VQ();
    }

    public final String W3() {
        if (!TextUtils.isEmpty(Z3())) {
            ArrayList<String> Q3 = Q3(Z3());
            if (!Q3.isEmpty()) {
                return (String) ListProtector.get(Q3, 0);
            }
            return null;
        }
        return null;
    }

    public final void e4() {
        Music music;
        MusicCommerceRecommendViewModel musicCommerceRecommendViewModel = (MusicCommerceRecommendViewModel) ViewModelProviders.of(getFragment()).get(MusicCommerceRecommendViewModel.class);
        boolean z = musicCommerceRecommendViewModel.LJLILLLLZI;
        this.LLF = z;
        if (z) {
            music = musicCommerceRecommendViewModel.LJLJI;
        } else {
            music = this.LL;
        }
        if (music == null) {
            return;
        }
        MusicModel convertToMusicModel = music.convertToMusicModel();
        C84913XUf c84913XUf = this.LLIFFJFJJ;
        if (c84913XUf != null) {
            c84913XUf.LIZLLL(convertToMusicModel, null, false, a4(), false, this.LLF);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C84913XUf c84913XUf = this.LLIFFJFJJ;
        if (c84913XUf != null) {
            c84913XUf.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility
    public final View qD() {
        return x3();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility
    public final View vd0() {
        return M3();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem
    public final boolean L3() {
        return this.LLI;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void mj() {
        c4();
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJJLIIIJLLLLLLLZ(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("enter_method", "click_shoot");
        FMX.LJIIL("download_music", c188727au.LIZ);
    }

    public final void O3(C188727au c188727au) {
        if (TextUtils.isEmpty((String) this.LLILII.getValue())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) this.LLILII.getValue());
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "trackJSon.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                c188727au.LJFF(jSONObject.opt(next), next);
            }
        } catch (JSONException unused) {
        }
    }

    public final void P3(C188727au c188727au) {
        if (!TextUtils.isEmpty(Z3())) {
            ArrayList<String> Q3 = Q3(Z3());
            if (!Q3.isEmpty()) {
                c188727au.LJI("prop_id", (String) ListProtector.get(Q3, 0));
            }
        }
    }

    public final ArrayList<String> Q3(String str) {
        Set set;
        if (str != null) {
            set = ORZ.LLJJ(s.LJLJJL(str, new String[]{","}, 0, 6));
        } else {
            set = null;
        }
        return new ArrayList<>(set);
    }

    public final void R3(boolean z) {
        if (this.LLJ) {
            return;
        }
        if (z) {
            this.LLD = false;
            HWH hwh = this.LJLZ;
            if (hwh != null) {
                V1B.LJLILLLLZI(hwh);
            }
            this.LJLZ = null;
        }
        HWH hwh2 = this.LJZ;
        if (hwh2 != null && hwh2.isShowing()) {
            HWH hwh3 = this.LJZ;
            if ((hwh3 instanceof Dialog) && hwh3 != null) {
                V1B.LJLILLLLZI(hwh3);
            }
            this.LJZ = null;
        }
    }

    public final void b4(String str) {
        String str2;
        String str3;
        Music music;
        MusicDetail musicDetail = this.LLII;
        if (musicDetail != null && !musicDetail.isFromCache) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", U3());
            MusicDetail musicDetail2 = this.LLII;
            String str4 = null;
            if (musicDetail2 != null && (music = musicDetail2.music) != null) {
                str2 = music.getMid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("music_id", str2);
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                str3 = C16880lQ.LLJJIJIIJIL(intent, "aweme_type");
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("aweme_type", str3);
            c188727au.LJIIIZ("enter_from", (String) this.LLIIL.getValue());
            Intent intent2 = getActivity().getIntent();
            if (intent2 != null) {
                str4 = C16880lQ.LLJJIJIIJIL(intent2, "enter_method");
            }
            c188727au.LJIIIZ("enter_method", str4);
            c188727au.LJIIIZ("not_available_reason", str);
            FMX.LJIIL("enter_music_detail_unused", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        Resources resources;
        o.LJIIIZ(view, "view");
        Map<String, Object> map = getConfig().LJ;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.r8s)) == null) {
            str = "";
        }
        map.put("text", str);
        super.onViewCreated(view);
        view.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        x3().setVisibility(8);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        this.LJZI = LIZ;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            return;
        }
        this.LJZL = LIZLLL;
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(getFragment(), null);
        C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ, ShootAbility.class, null);
        if (LIZ2 == null) {
            C55096Ljo.LJIIJJI(LIZJ, this, ShootAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ2);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ2);
                Object newProxyInstance = Proxy.newProxyInstance(ShootAbility.class.getClassLoader(), new Class[]{ShootAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, ShootAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(getFragment(), null);
        C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ2, ShootContainerProviderAbility.class, null);
        if (LIZ3 == null) {
            C55096Ljo.LJIIJJI(LIZJ2, this, ShootContainerProviderAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ3);
                if (invocationHandler2 instanceof EV9) {
                    ((EV9) invocationHandler2).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused2) {
                EV9 ev92 = new EV9();
                ev92.LIZ.add(this);
                ev92.LIZ.add(LIZ3);
                Object newProxyInstance2 = Proxy.newProxyInstance(ShootContainerProviderAbility.class.getClassLoader(), new Class[]{ShootContainerProviderAbility.class}, ev92);
                if (newProxyInstance2 != null) {
                    C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, ShootContainerProviderAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility");
                }
            }
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLLLLL.getValue(), new TBT() { // from class: X.OGY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS176S0100000_10(this, 56), 14, null);
    }

    @Override // X.InterfaceC84927XUt
    public final void LLILZ(MusicModel musicModel, boolean z) {
        o.LJIIIZ(musicModel, "musicModel");
        if (z) {
            this.LLD = true;
            new SafeHandler(this).postDelayed(new ARunnableS29S0200000_10(this, musicModel, 21), 300L);
            return;
        }
        AqS157S0200000_10 aqS157S0200000_10 = new AqS157S0200000_10(this, musicModel, 13);
        this.LLFZ = true;
        if (e1.LIZ(31744, "studio_music_detail_record_lazy_loading", true, false)) {
            ExecutorC142245i8.LJLILLLLZI.LIZ(300L, new ARunnableS29S0200000_10(this, aqS157S0200000_10, 22));
        } else {
            aqS157S0200000_10.invoke();
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLLLLLLL(int i, boolean z) {
        HWH hwh;
        if (!z && (hwh = this.LJZ) != null) {
            hwh.setProgress(i);
            if (i >= 98 && this.LJZ != null) {
                hwh.setCancelable(true);
            }
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLZLL(boolean z, boolean z2) {
        if (z) {
            R3(true);
        } else {
            C38816FLg.LIZJ(new ARunnableS43S0100000_7(this, 21));
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLZZIL(Effect effect, MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        FMX.LJIILL("music_detail_trace", new OSZ("skip_to_video_progress", "stage"));
        R3(true);
        AVExternalServiceImpl.LIZ().asyncService("MusicDetailFragment", new IDLCallbackS1S0300000_10(this, effect, musicModel, 1));
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJILLL(String musicFile, MusicModel musicModel, int i) {
        String str;
        o.LJIIIZ(musicFile, "musicFile");
        if (this.LLJ) {
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLLLLL.getValue(), new TBT() { // from class: X.OGZ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C187447Xg) obj).LJLIL;
                }
            }, null, null, null, new AqS49S1200000_7(this, musicFile, musicModel, 4), 14, null);
            return;
        }
        FMX.LJIILL("music_detail_trace", new OSZ("to_video_progress", "stage"));
        boolean isRecording = AVExternalServiceImpl.LIZ().configService().shortVideoConfig().isRecording();
        long currentTimeMillis = System.currentTimeMillis() - this.LLFII;
        if (isRecording) {
            AVExternalServiceImpl.LIZ().publishService().addMusic(musicModel, 0);
            Intent intent = new Intent();
            if (TextUtils.equals(getFrom(), "choose_music_with_banner") && ((Number) this.LLIIIZ.getValue()).intValue() == 2) {
                str = "shoot_page_banner";
            } else if (TextUtils.equals(getFrom(), "choose_music_with_banner") && ((Number) this.LLIIIZ.getValue()).intValue() == 0) {
                str = "edit_page_banner";
            } else {
                str = "";
            }
            intent.putExtra("path", musicFile);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str);
            getActivity().setResult(-1, intent);
            getActivity().finish();
            if (TextUtils.equals(getFrom(), "choose_music_with_banner")) {
                getActivity().overridePendingTransition(0, R.anim.ag);
                return;
            }
            return;
        }
        AVExternalServiceImpl.LIZ().asyncService("MusicDetailFragment", new C61998OUw(this, currentTimeMillis, musicModel, musicFile));
    }
}
