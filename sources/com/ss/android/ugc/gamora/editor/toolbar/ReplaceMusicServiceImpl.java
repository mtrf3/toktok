package com.ss.android.ugc.gamora.editor.toolbar;

import X.ActivityC45651qj;
import X.C00F;
import X.C10K;
import X.C146355ol;
import X.C188727au;
import X.C221108m2;
import X.C42437Gl7;
import X.C42463GlX;
import X.C42622Go6;
import X.C43588H8u;
import X.C58096Mr6;
import X.C5HS;
import X.C60903NvH;
import X.C62822Ol8;
import X.C84763XOl;
import X.C9PK;
import X.DJU;
import X.EnumC42461GlV;
import X.FMX;
import X.H78;
import X.InterfaceC42390GkM;
import X.MEX;
import X.RunnableC42459GlT;
import X.X1D;
import Y.ACallableS110S0100000_7;
import Y.AgS10S1400000_7;
import Y.AgS124S0100000_7;
import Y.AgS27S1300000_7;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.edit.EditMusicStruct;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ReplaceMusicServiceImpl implements IReplaceMusicService {
    public boolean LIZIZ;
    public int LIZLLL;
    public int LJ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C42463GlX.LJLIL);
    public String LIZJ = "";
    public String LJFF = "";
    public ReplaceMusicRequest LJI = new ReplaceMusicRequest();
    public final MutableLiveData<Boolean> LJII = new MutableLiveData<>(Boolean.FALSE);
    public final Map<String, Long> LJIIIIZZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean isInPublish() {
        return true;
    }

    public static IReplaceMusicService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IReplaceMusicService.class, false);
        if (LIZ != null) {
            return (IReplaceMusicService) LIZ;
        }
        if (C58096Mr6.D8 == null) {
            synchronized (IReplaceMusicService.class) {
                if (C58096Mr6.D8 == null) {
                    C58096Mr6.D8 = new ReplaceMusicServiceImpl();
                }
            }
        }
        return C58096Mr6.D8;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean isCopyrightPhase2Enabled() {
        if (C5HS.LIZ() || C146355ol.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean getClickPost() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getCover() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getReplaceMusicContentType() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final ReplaceMusicRequest getReplaceMusicRequest() {
        return this.LJI;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final int getSimilarTag() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final int isLongVideo() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void retryInPromoteScene(PromoteReplaceMusicRequest promteReplaceMusicRequest) {
        o.LJIIIZ(promteReplaceMusicRequest, "promteReplaceMusicRequest");
        if (promteReplaceMusicRequest.getRetryScene() == EnumC42461GlV.CLEAR.getId()) {
            C10K.LIZJ(new ACallableS110S0100000_7(promteReplaceMusicRequest, 17));
        }
        C10K.LIZJ(new ACallableS110S0100000_7(promteReplaceMusicRequest, 18)).LIZLLL(new AgS124S0100000_7(promteReplaceMusicRequest, 16));
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setClickPost(boolean z) {
        this.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setCover(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LIZJ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setLongVideo(int i) {
        this.LJ = i;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceMusicContentType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJFF = str;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest) {
        o.LJIIIZ(replaceMusicRequest, "<set-?>");
        this.LJI = replaceMusicRequest;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setSimilarTag(int i) {
        this.LIZLLL = i;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean shouldShowCopyrightViolationSnackBar(Aweme aweme) {
        boolean z = false;
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
        long LIZ = C00F.LIZ(31744, 10080, "replace_sound_bubble_interval_minutes", true) * 60000;
        System.currentTimeMillis();
        DJU.LIZ().getLong("snack_bar_showed_time", 0L);
        if (aweme != null) {
            aweme.getCreateTime();
        }
        DJU.LIZ().getLong("last_violation_video_showed_time", 0L);
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (MEX.LJI() && aweme != null && System.currentTimeMillis() - DJU.LIZ().getLong("snack_bar_showed_time", 0L) >= LIZ && aweme.getCreateTime() > DJU.LIZ().getLong("last_violation_video_showed_time", 0L)) {
            z = true;
        }
        this.LJII.setValue(Boolean.TRUE);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(JSONObject obj, boolean z) {
        String str;
        String str2;
        int i;
        EditMusicStruct editMusicStruct;
        o.LJIIIZ(obj, "obj");
        try {
            String aid = JSONObjectProtectorUtils.getString(obj, "item_id");
            String string = JSONObjectProtectorUtils.getString(obj, "original_vid");
            String url = JSONObjectProtectorUtils.getString(obj, "cover_url");
            EditMusicStruct musicInfo = (EditMusicStruct) C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson().LJI(JSONObjectProtectorUtils.getString(obj, "new_music_info"), EditMusicStruct.class);
            ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();
            o.LJIIIIZZ(musicInfo, "musicInfo");
            replaceMusicRequest.setEditMusicStruct(musicInfo);
            o.LJIIIIZZ(aid, "aid");
            replaceMusicRequest.setItemID(aid);
            replaceMusicRequest.setOriginalVid(string);
            C188727au c188727au = new C188727au();
            PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
            if (C42622Go6.LJ(aid)) {
                C42622Go6.LJII(z);
                c188727au.LJI("enter_from", "promote");
            } else {
                o.LJIIIIZZ(url, "url");
                showWindow(z, url, replaceMusicRequest);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("long link response ");
            LIZ.append(obj);
            H78.LIZIZ("ReplaceMusicToolbarScene", X1D.LIZIZ(LIZ));
            ReplaceMusicRequest replaceMusicRequest2 = this.LJI;
            String str3 = null;
            if (replaceMusicRequest2 != null) {
                str = replaceMusicRequest2.getItemID();
            } else {
                str = null;
            }
            c188727au.LJI("group_id", str);
            ReplaceMusicRequest replaceMusicRequest3 = this.LJI;
            if (replaceMusicRequest3 != null && (editMusicStruct = replaceMusicRequest3.getEditMusicStruct()) != null) {
                str2 = editMusicStruct.getMusicID();
            } else {
                str2 = null;
            }
            c188727au.LJI("replace_music_id", str2);
            ReplaceMusicRequest replaceMusicRequest4 = this.LJI;
            if (replaceMusicRequest4 != null) {
                str3 = replaceMusicRequest4.getMusicId();
            }
            c188727au.LJI("music_id", str3);
            if (this.LJI.getVoiceVolume() != null) {
                i = 1;
            } else {
                i = 0;
            }
            c188727au.LIZLLL(i, "video_has_original_sound");
            c188727au.LJI("enter_from", "personal_homepage");
            c188727au.LJI("replace_music_content_type", LIZ().getReplaceMusicContentType());
            c188727au.LIZLLL(z ? 1 : 0, "replace_status");
            c188727au.LJI("creation_id", this.LJI.getCreationId());
            c188727au.LIZLLL(LIZ().getSimilarTag(), "is_similar_music");
            c188727au.LIZLLL(LIZ().isLongVideo(), "is_long_video");
            FMX.LJIIL("publish_replace_music_status", c188727au.LIZ);
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doRequest(String coverUrl, ReplaceMusicRequest replaceMusicRequest, ActivityC45651qj activity) {
        o.LJIIIZ(coverUrl, "coverUrl");
        o.LJIIIZ(replaceMusicRequest, "replaceMusicRequest");
        o.LJIIIZ(activity, "activity");
        C10K.LIZJ(new ACallableS110S0100000_7(replaceMusicRequest, 15)).LJ(new AgS27S1300000_7(this, activity, coverUrl, replaceMusicRequest, 0), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showCopyrightViolationSnackBar(ViewGroup view, C9PK scene, Aweme aweme) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(scene, "scene");
        if (aweme == null) {
            return;
        }
        PopupManager.LJIIL(new C42437Gl7(view, scene, aweme, this.LJII));
        DJU.LIZ().storeLong("snack_bar_showed_time", System.currentTimeMillis());
        DJU.LIZ().storeLong("last_violation_video_showed_time", aweme.getCreateTime());
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(boolean z, String coverUrl, ReplaceMusicRequest replaceMusicRequest) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(coverUrl, "coverUrl");
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null || !(LJIIIIZZ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) == null) {
            return;
        }
        LifecycleOwner LIZ = ((InterfaceC42390GkM) this.LIZ.getValue()).LIZ(activityC45651qj);
        new SafeHandler(LIZ).post(new RunnableC42459GlT(activityC45651qj, z, coverUrl, replaceMusicRequest, LIZ));
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doRequest(String coverUrl, ReplaceMusicRequest replaceMusicRequest, ActivityC45651qj activity, PromoteReplaceMusicRequest promoteReplaceMusicRequest) {
        o.LJIIIZ(coverUrl, "coverUrl");
        o.LJIIIZ(replaceMusicRequest, "replaceMusicRequest");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(promoteReplaceMusicRequest, "promoteReplaceMusicRequest");
        C10K.LIZJ(new ACallableS110S0100000_7(promoteReplaceMusicRequest, 16)).LJ(new AgS10S1400000_7(this, activity, replaceMusicRequest, promoteReplaceMusicRequest, coverUrl, 0), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void mobProfileTabClientClick(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        C43588H8u.LIZLLL(str, "enterFrom", str2, "groupId", str4, "replaceMusicContentType", str5, "muteReason");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(i, "is_replace_music");
        c188727au.LIZLLL(i2, "is_mute_icon");
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("music_id", str3);
        c188727au.LJIIIZ("replace_music_content_type", str4);
        c188727au.LJIIIZ("mute_reason", str5);
        FMX.LJIIL("profile_tab_music_mute_click", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void mobProfileTabClientShow(String enterFrom, int i, int i2, String groupId, String str, String replaceMusicContentType, String muteReason) {
        long j;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(replaceMusicContentType, "replaceMusicContentType");
        o.LJIIIZ(muteReason, "muteReason");
        long currentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((LinkedHashMap) this.LJIIIIZZ).get(groupId);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (currentTimeMillis - j > 2500) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LIZLLL(i, "is_replace_music");
            c188727au.LIZLLL(i2, "is_mute_icon");
            c188727au.LJIIIZ("group_id", groupId);
            c188727au.LJIIIZ("music_id", str);
            c188727au.LJIIIZ("replace_music_content_type", replaceMusicContentType);
            c188727au.LJIIIZ("mute_reason", muteReason);
            FMX.LJIIL("profile_tab_music_mute_show", c188727au.LIZ);
            this.LJIIIIZZ.put(groupId, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
