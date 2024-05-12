package com.ss.android.ugc.aweme.music.vm;

import X.C188727au;
import X.C198517qh;
import X.C1DD;
import X.C1I1;
import X.C207668Da;
import X.C240369c0;
import X.C240639cR;
import X.C240719cZ;
import X.C240839cl;
import X.C241809eK;
import X.C241839eN;
import X.C2NU;
import X.C39061g6;
import X.C47704Ins;
import X.C55749LuL;
import X.C5S1;
import X.C61200O0e;
import X.C65352Pkq;
import X.C78450Uqc;
import X.C78451Uqd;
import X.C7Y9;
import X.C8VC;
import X.EF7;
import X.EnumC240399c3;
import X.EnumC241749eE;
import X.FMX;
import X.HG3;
import X.InterfaceC241869eQ;
import X.InterfaceC65895Ptb;
import X.QD3;
import X.RBX;
import X.X1D;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class MusicPlayViewModel extends AssemViewModel<C240839cl> implements Observer<C207668Da> {
    public MusicDownloadPlayHelper LJLILLLLZI;
    public DataCenter LJLJI;
    public MusicModel LJLJJI;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, OriginMusicArg.class, null), true);
    public EnumC241749eE LJLJJL = EnumC241749eE.DEFAULT;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C240839cl defaultState() {
        return new C240839cl(0);
    }

    public final boolean hv0() {
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null) {
            return c240369c0.LJ;
        }
        return false;
    }

    public final String iv0() {
        OriginMusicArg originMusicArg = (OriginMusicArg) this.LJLIL.getValue();
        if (originMusicArg != null) {
            return originMusicArg.getPreviousPage();
        }
        return null;
    }

    public final String jv0() {
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null) {
            return c240369c0.LIZ;
        }
        return null;
    }

    public final boolean mv0() {
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null) {
            return c240369c0.LIZJ;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public static void kv0(MusicModel musicModel) {
        if (musicModel != null) {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                o.LJIIIIZZ(offlineDesc, "model.music.offlineDesc");
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = C1DD.LIZLLL(R.string.iia, "getApplicationContext().…string.music_issue_toast)");
                }
                C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                c5s1.LIZLLL(offlineDesc);
                c5s1.LJ();
                return;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            c188727au.LJIIIZ("group_id", "");
            c188727au.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au.LIZLLL(0, "status");
            FMX.LJIIL("click_feature_video_button", c188727au.LIZ);
            SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//music/artist/awemelist");
            buildRoute.withParam("artist_music_id", String.valueOf(musicModel.getId()));
            buildRoute.withParam("artist_music_name", musicModel.getName());
            buildRoute.withParam("artist_music_data", musicModel.convertToMusic());
            buildRoute.withParam("artist_music_from_profile", true);
            buildRoute.withParam("enter_method", "music_tab");
            buildRoute.open();
        }
    }

    public final void nv0(boolean z) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LJLILLLLZI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJIIIIZZ();
        }
        if (z) {
            withState(new AqS170S0100000_4(this, 1445));
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.LJLILLLLZI;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.LJIIIIZZ();
            }
            MusicDownloadPlayHelper musicDownloadPlayHelper3 = this.LJLILLLLZI;
            if (musicDownloadPlayHelper3 != null) {
                musicDownloadPlayHelper3.LJLLLL = true;
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str = c207668Da2.LIZ;
        if (str.hashCode() != 2022349644 || !str.equals("music_status")) {
            return;
        }
        withState(new AqS170S0100000_4(this, 1444));
    }

    @QD3
    public final void onEvent(C241839eN c241839eN) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LJLILLLLZI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJIIIIZZ();
        }
    }

    public final void gv0(C240719cZ item, int i) {
        int i2;
        String jv0;
        Object obj;
        String str;
        o.LJIIIZ(item, "item");
        MusicModel musicModel = item.LJLIL;
        C240639cR c240639cR = item.LJLILLLLZI;
        if (c240639cR.LJLIL == EnumC240399c3.PINNED) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        boolean z = c240639cR.LJLILLLLZI;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || !MusicService.LJJLIIIJJI().LJJIL(musicModel, topActivity, true)) {
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin() && AVExternalServiceImpl.LIZ().configService().avsettingsConfig().needLoginBeforeRecord()) {
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = topActivity;
            LJIIIIZZ.showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("login_notify");
            obtain.setLabelName("click_music_shoot");
            FMX.onEvent(obtain);
            return;
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LJLILLLLZI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJLLILLLL = "popular_song";
            musicDownloadPlayHelper.LJLLL = i;
            musicDownloadPlayHelper.LIZIZ(7, musicModel, true, false);
        }
        if (mv0()) {
            jv0 = "";
        } else {
            jv0 = jv0();
        }
        MobClick LIZLLL = C1I1.LIZLLL("shoot", "single_song");
        LIZLLL.setValue(musicModel.getMusicId());
        C198517qh c198517qh = new C198517qh();
        String str2 = "personal_homepage";
        if (TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), jv0())) {
            obj = "personal_homepage";
        } else {
            obj = "others_homepage";
        }
        c198517qh.LIZ.put("enter_from", obj);
        LIZLLL.setJsonObject(c198517qh.LJ());
        FMX.onEvent(LIZLLL);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "artist_music");
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
        if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("music_new_flag", str);
        if (!o.LJ(((RBX) HG3.LJIILL()).getCurUserId(), jv0())) {
            str2 = "others_homepage";
        }
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LIZLLL(z ? 1 : 0, "highlight");
        if (!mv0()) {
            c188727au.LJIIIZ("shoot_from", "others_homepage");
            c188727au.LJIIIZ("enter_method", "others_homepage");
            c188727au.LJIIIZ("to_user_id", jv0);
            c188727au.LIZLLL(i, "pos");
            c188727au.LIZLLL(i2, "is_pin_to_top");
        }
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    public final void ov0(C240719cZ item, int i) {
        boolean z;
        o.LJIIIZ(item, "item");
        MusicModel musicModel = item.LJLIL;
        C240639cR c240639cR = item.LJLILLLLZI;
        boolean z2 = false;
        if (c240639cR.LJLIL == EnumC240399c3.PINNED) {
            z = true;
        } else {
            z = false;
        }
        withState(new C241809eK(this, z, musicModel, i, c240639cR.LJLILLLLZI));
        EF7.LIZIZ();
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (!z2) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        withState(new AqS108S0300000_4(musicModel, this, item, 16));
    }

    public final void lv0(C240719cZ item, int i, boolean z) {
        int i2;
        String str;
        String jv0;
        boolean z2;
        String str2;
        boolean z3;
        o.LJIIIZ(item, "item");
        MusicModel musicModel = item.LJLIL;
        C240639cR c240639cR = item.LJLILLLLZI;
        if (c240639cR.LJLIL == EnumC240399c3.PINNED) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        boolean z4 = c240639cR.LJLILLLLZI;
        if (musicModel != null) {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = EF7.LIZIZ().getString(R.string.iia);
                }
                C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                c5s1.LIZLLL(offlineDesc);
                c5s1.LJ();
                return;
            }
            if (!mv0()) {
                str = "others_homepage";
            } else {
                str = "personal_homepage";
            }
            if (mv0()) {
                jv0 = "";
            } else {
                jv0 = jv0();
            }
            MobClick LIZLLL = C1I1.LIZLLL("song_cover", "personal_homepage_list");
            LIZLLL.setValue(musicModel.getMusicId());
            FMX.onEvent(LIZLLL);
            String uuid = UUID.randomUUID().toString();
            o.LJIIIIZZ(uuid, "randomUUID().toString()");
            if (hv0()) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "personal_homepage");
                c188727au.LJIIIZ("button_type", "enter_music_detail");
                c188727au.LJIIIZ("search_result_id", musicModel.getMusicId());
                c188727au.LIZLLL(i, "rank");
                FMX.LJIIL("search_result_click", c188727au.LIZ);
            } else {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", str);
                c188727au2.LJIIIZ("group_id", "");
                c188727au2.LJIIIZ("music_id", musicModel.getMusicId());
                c188727au2.LJIIIZ("previous_page", iv0());
                c188727au2.LJIIIZ("process_id", uuid);
                c188727au2.LJIIIZ("to_user_id", jv0);
                c188727au2.LIZLLL(i, "pos");
                c188727au2.LIZLLL(i2, "is_pin_to_top");
                MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
                if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str3 = "1";
                if (z2) {
                    str2 = "1";
                } else {
                    str2 = "1";
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au2.LJIIIZ("music_new_flag", str3);
                if (!C7Y9.LIZ()) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au2.LJIIIZ("music_new_show", str2);
                c188727au2.LIZLLL(z4 ? 1 : 0, "highlight");
                if (z4) {
                    c188727au2.LJI("enter_method", "music_highlight");
                } else {
                    c188727au2.LJI("enter_method", "personal_list");
                }
                FMX.LJIIL("enter_music_detail", c188727au2.LIZ);
            }
            if (z) {
                C188727au c188727au3 = new C188727au();
                c188727au3.LJIIIZ("enter_from", "personal_homepage");
                c188727au3.LJIIIZ("group_id", "");
                c188727au3.LJIIIZ("music_id", musicModel.getMusicId());
                z3 = true;
                c188727au3.LIZLLL(1, "status");
                FMX.LJIIL("click_feature_video_button", c188727au3.LIZ);
            } else {
                z3 = true;
            }
            if (!MusicService.LJJLIIIJJI().LJJIL(musicModel, ActivityStack.getTopActivity(), z3)) {
                if (hv0()) {
                    C188727au c188727au4 = new C188727au();
                    c188727au4.LJIIIZ("enter_from", "personal_homepage");
                    c188727au4.LJIIIZ("button_type", "enter_music_detail");
                    c188727au4.LJIIIZ("search_result_id", musicModel.getMusicId());
                    c188727au4.LIZLLL(i, "rank");
                    FMX.LJIIL("search_result_click", c188727au4.LIZ);
                    return;
                }
                C188727au c188727au5 = new C188727au();
                c188727au5.LJIIIZ("group_id", "");
                c188727au5.LJIIIZ("author_id", "");
                c188727au5.LJIIIZ("music_id", musicModel.getMusicId());
                c188727au5.LJIIIZ("enter_from", str);
                c188727au5.LJIIIZ("to_user_id", jv0);
                c188727au5.LIZLLL(i, "pos");
                c188727au5.LIZLLL(i2, "is_pin_to_top");
                FMX.LJIIL("enter_music_detail_failed", c188727au5.LIZ);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (!mv0()) {
                jSONObject.put("shoot_from", "others_homepage");
                jSONObject.put("to_user_id", jv0());
                jSONObject.put("pos", i);
                jSONObject.put("is_pin_to_top", i2);
            }
            C61200O0e LIZLLL2 = C61200O0e.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://music/detail/");
            LIZ.append(musicModel.getMusicId());
            C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
            c39061g6.LIZIZ("process_id", uuid);
            c39061g6.LIZIZ("extra_track_info", jSONObject.toString());
            c39061g6.LIZ(z ? 1 : 0, "open_edit_sheet");
            c39061g6.LIZ(2, "extra_enter_from");
            LIZLLL2.LJII(c39061g6.LIZJ());
        }
    }
}
