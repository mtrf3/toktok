package com.ss.android.ugc.aweme.commerce.tools.mission.service;

import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.C145995oB;
import X.C163316b1;
import X.C16880lQ;
import X.C44172HVg;
import X.C44261HYr;
import X.C58096Mr6;
import X.C5L7;
import X.C78764Uvg;
import X.C78915Uy7;
import X.C78920UyC;
import X.C82622Wbi;
import X.FMX;
import X.H9C;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionImageSticker;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionUser;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes3.dex */
public final class CommerceToolsMissionService implements ICommerceToolsMissionService {
    public static ICommerceToolsMissionService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsMissionService.class, false);
        if (LIZ != null) {
            return (ICommerceToolsMissionService) LIZ;
        }
        if (C58096Mr6.LLLI == null) {
            synchronized (ICommerceToolsMissionService.class) {
                if (C58096Mr6.LLLI == null) {
                    C58096Mr6.LLLI = new CommerceToolsMissionService();
                }
            }
        }
        return C58096Mr6.LLLI;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final C44261HYr LIZJ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        return new C44261HYr(diContainer);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, ShortVideoContext shortVideoContext) {
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String stickerId;
        Long l;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (creativeModel == null || (commerceToolsModel = creativeModel.commerceModel) == null || (mission = commerceToolsModel.getMission()) == null) {
            return;
        }
        String musicId = mission.getMusicId();
        if ((musicId == null || musicId.length() == 0) && ((stickerId = mission.getStickerId()) == null || stickerId.length() == 0)) {
            return;
        }
        String stickerId2 = mission.getStickerId();
        if (stickerId2 != null && stickerId2.length() != 0 && mission.getUserEverChoseDifferentSticker()) {
            return;
        }
        String musicId2 = mission.getMusicId();
        if (musicId2 != null && musicId2.length() != 0 && mission.isMusicToasted()) {
            return;
        }
        if (!mission.isMusicToasted()) {
            String musicId3 = mission.getMusicId();
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
            if (extractAVMusic != null) {
                l = Long.valueOf(extractAVMusic.id);
            } else {
                l = null;
            }
            if (!TextUtils.equals(musicId3, String.valueOf(l))) {
                mission.setMusicToasted(true);
                return;
            }
        }
        C78920UyC.LIZLLL(R.string.i62, activityC45651qj, 3034);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LIZLLL(ActivityC45651qj activityC45651qj, ShortVideoContext shortVideoContext) {
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String stickerId;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (creativeModel == null || (commerceToolsModel = creativeModel.commerceModel) == null || (mission = commerceToolsModel.getMission()) == null) {
            return;
        }
        String musicId = mission.getMusicId();
        if ((musicId == null || musicId.length() == 0 || mission.getUserEverChoseDifferentSticker()) && ((stickerId = mission.getStickerId()) == null || stickerId.length() == 0 || mission.isMusicToasted())) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
        creativeToastBuilder.iconColorRes(R.attr.dj);
        creativeToastBuilder.duration(5000L);
        creativeToastBuilder.messageRes(R.string.i67);
        C78915Uy7.LJJIIZI(activityC45651qj, 3032, creativeToastBuilder);
        new H9C().LJIILJJIL(mission, 6);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJ(Activity activity, ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String musicId;
        String str;
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (commerceToolsModel = creativeModel.commerceModel) == null || (mission = commerceToolsModel.getMission()) == null || (musicId = mission.getMusicId()) == null || musicId.length() == 0) {
            return;
        }
        if (!mission.isMusicToasted()) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
            if (extractAVMusic != null) {
                str = extractAVMusic.getMid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, mission.getMusicId())) {
                mission.setMusicToasted(true);
                shortVideoContext.creativeModel.commerceModel.setMission(mission);
            }
        }
        if (mission.isMusicToasted() || activity == null) {
            return;
        }
        new H9C().LJIILJJIL(mission, 1);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJI(VideoPublishEditModel videoPublishEditModel, String stickerId) {
        Mission mission;
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        if (!TextUtils.equals(stickerId, "mission_logo") || (mission = videoPublishEditModel.creativeModel.commerceModel.getMission()) == null || !mission.getEnableImageSticker() || mission.getImageSticker() == null) {
            return;
        }
        new H9C().LJIIL(mission, 1, 1);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJII(ActivityC45651qj activity, ShortVideoContext shortVideoContext) {
        String stickerId;
        Long l;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        Mission mission = shortVideoContext.creativeModel.commerceModel.getMission();
        if (mission == null) {
            return;
        }
        String musicId = mission.getMusicId();
        if ((musicId == null || musicId.length() == 0) && ((stickerId = mission.getStickerId()) == null || stickerId.length() == 0)) {
            return;
        }
        String stickerId2 = mission.getStickerId();
        if (stickerId2 != null && stickerId2.length() != 0) {
            return;
        }
        String musicId2 = mission.getMusicId();
        if (musicId2 != null && musicId2.length() != 0 && mission.isMusicToasted()) {
            return;
        }
        if (!mission.isMusicToasted()) {
            String musicId3 = mission.getMusicId();
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
            if (extractAVMusic != null) {
                l = Long.valueOf(extractAVMusic.id);
            } else {
                l = null;
            }
            if (!TextUtils.equals(musicId3, String.valueOf(l))) {
                mission.setMusicToasted(true);
                return;
            }
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
        creativeToastBuilder.iconColorRes(R.attr.dj);
        creativeToastBuilder.duration(5000L);
        creativeToastBuilder.messageRes(R.string.i69);
        C78915Uy7.LJJIIZI(activity, 3033, creativeToastBuilder);
        new H9C().LJIILJJIL(mission, 4);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIIIZ(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        String musicId;
        String str;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (commerceToolsModel = creativeModel.commerceModel) == null || (mission = commerceToolsModel.getMission()) == null || (musicId = mission.getMusicId()) == null || musicId.length() == 0) {
            return;
        }
        if (!mission.isMusicToasted()) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
            if (extractAVMusic != null) {
                str = extractAVMusic.getMid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, mission.getMusicId())) {
                mission.setMusicToasted(true);
                videoPublishEditModel.creativeModel.commerceModel.setMission(mission);
            }
        }
        if (mission.isMusicToasted() || activity == null) {
            return;
        }
        new H9C().LJIILJJIL(mission, 1);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LIZ(Intent intent, Intent intent2, String str, String str2) {
        String str3;
        MissionImageSticker imageSticker;
        String str4;
        if (intent != null) {
            str3 = C16880lQ.LLJJIJIIJIL(intent, "mission_data");
        } else {
            str3 = null;
        }
        if (!TextUtils.equals(str, "mission") || TextUtils.isEmpty(str3)) {
            return;
        }
        Mission mission = (Mission) GsonProtectorUtils.fromJson(new Gson(), str3, Mission.class);
        if (!TextUtils.isEmpty(mission.getStickerId())) {
            mission.setUserEverChoseDifferentSticker(false);
        }
        if (!TextUtils.isEmpty(mission.getMusicId())) {
            mission.setMusicToasted(false);
        }
        List<String> challengeNames = mission.getChallengeNames();
        if (challengeNames != null && !challengeNames.isEmpty()) {
            mission.setChallengeToasted(false);
        }
        List<MissionUser> mentionedUsers = mission.getMentionedUsers();
        if (mentionedUsers != null && !mentionedUsers.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<MissionUser> mentionedUsers2 = mission.getMentionedUsers();
            if (mentionedUsers2 != null) {
                for (MissionUser missionUser : mentionedUsers2) {
                    String nickname = missionUser.getNickname();
                    if (nickname != null) {
                        str4 = AnonymousClass028.LIZJ("getDefault()", nickname, "this as java.lang.String).toLowerCase(locale)");
                    } else {
                        str4 = null;
                    }
                    missionUser.setNickname(str4);
                    arrayList.add(missionUser);
                }
            }
            mission.setMentionedUsers(arrayList);
            mission.setUserToasted(false);
        }
        if (mission.getEnableImageSticker() && mission.getImageSticker() != null && (imageSticker = mission.getImageSticker()) != null) {
            C78764Uvg.LJIILL(imageSticker.getLogoImageUrl());
        }
        intent2.putExtra("mission", (Parcelable) mission);
        C44172HVg.LJIJ.getCurrentUser();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", str2);
        c145995oB.LJI("shoot_way", str);
        H9C h9c = new H9C();
        h9c.LJIIIIZZ(mission);
        c145995oB.LJFF(h9c.LJFF("mission_id", "page_source", "creator_followers", "creator_type"));
        FMX.LJIIL("shoot", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJFF(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str, String currentText) {
        List<MissionUser> mentionedUsers;
        List<MissionUser> mentionedUsers2;
        List<String> challengeNames;
        List<String> challengeNames2;
        o.LJIIIZ(currentText, "currentText");
        if (videoPublishEditModel == null) {
            return;
        }
        String LIZIZ = C163316b1.LIZIZ(str, currentText);
        if (i >= i2 || i < 0 || i2 > LIZIZ.length() || TextUtils.isEmpty(LIZIZ) || LIZIZ.length() == 0) {
            return;
        }
        C44172HVg.LJIJ.getCurrentUser();
        String substring = LIZIZ.substring(i, i2);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
        if (mission == null) {
            return;
        }
        if (!mission.isChallengeToasted() && (challengeNames = mission.getChallengeNames()) != null && !challengeNames.isEmpty() && (challengeNames2 = mission.getChallengeNames()) != null) {
            boolean z = false;
            for (String str2 : challengeNames2) {
                if (substring.length() > 1 && TextUtils.equals(String.valueOf(substring.charAt(substring.length() - 1)), C16880lQ.LLLLL(C5L7.LIZ()).getString(R.string.rhe))) {
                    String substring2 = LIZIZ.substring(0, i2 - 1);
                    o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    String LIZ = C163316b1.LIZ(substring2);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('#');
                    LIZ2.append(str2);
                    z = TextUtils.equals(LIZ, X1D.LIZIZ(LIZ2));
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append('#');
                LIZ3.append(str2);
                if (TextUtils.equals(substring, X1D.LIZIZ(LIZ3)) && !z) {
                    mission.setChallengeToasted(true);
                    new H9C().LJIIJJI(mission, 3);
                    videoPublishEditModel.creativeModel.commerceModel.setMission(mission);
                    return;
                }
            }
        }
        if (mission.isUserToasted() || (mentionedUsers = mission.getMentionedUsers()) == null || mentionedUsers.isEmpty() || (mentionedUsers2 = mission.getMentionedUsers()) == null) {
            return;
        }
        for (MissionUser missionUser : mentionedUsers2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append('@');
            LIZ4.append(missionUser.getNickname());
            if (TextUtils.equals(substring, X1D.LIZIZ(LIZ4))) {
                mission.setUserToasted(true);
                new H9C().LJIIJJI(mission, 2);
                videoPublishEditModel.creativeModel.commerceModel.setMission(mission);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService
    public final void LJIIIIZZ(String selectedString, int i, VideoPublishEditModel videoPublishEditModel, String str, String currentText, ActivityC45651qj activityC45651qj) {
        List<MissionUser> mentionedUsers;
        List<MissionUser> mentionedUsers2;
        List<String> challengeNames;
        List<String> challengeNames2;
        o.LJIIIZ(selectedString, "selectedString");
        o.LJIIIZ(currentText, "currentText");
        if (videoPublishEditModel == null) {
            return;
        }
        C44172HVg.LJIJ.getCurrentUser();
        Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
        if (mission == null) {
            return;
        }
        int i2 = 1;
        if (!mission.isChallengeToasted() && (challengeNames = mission.getChallengeNames()) != null && !challengeNames.isEmpty() && (challengeNames2 = mission.getChallengeNames()) != null) {
            boolean z = false;
            for (String str2 : challengeNames2) {
                if (selectedString.length() > i2 && TextUtils.equals(String.valueOf(selectedString.charAt(selectedString.length() - i2)), C5L7.LIZ().getString(R.string.rhe))) {
                    String substring = C163316b1.LIZIZ(str, currentText).substring(0, i - 1);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String LIZ = C163316b1.LIZ(substring);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('#');
                    LIZ2.append(str2);
                    z = TextUtils.equals(LIZ, X1D.LIZIZ(LIZ2));
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append('#');
                LIZ3.append(str2);
                if (!TextUtils.equals(selectedString, X1D.LIZIZ(LIZ3)) && !z) {
                    i2 = 1;
                } else {
                    if (activityC45651qj != null) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
                        creativeToastBuilder.iconColorRes(R.attr.dj);
                        creativeToastBuilder.duration(5000L);
                        creativeToastBuilder.messageRes(R.string.i61);
                        C78915Uy7.LJJIIZI(activityC45651qj, 2038, creativeToastBuilder);
                    }
                    new H9C().LJIILJJIL(mission, 3);
                    return;
                }
            }
        }
        if (mission.isUserToasted() || (mentionedUsers = mission.getMentionedUsers()) == null || mentionedUsers.isEmpty() || (mentionedUsers2 = mission.getMentionedUsers()) == null) {
            return;
        }
        Iterator<MissionUser> it = mentionedUsers2.iterator();
        while (it.hasNext()) {
            String nickname = it.next().getNickname();
            if (nickname != null && s.LJJJLZIJ(selectedString, nickname, false)) {
                if (activityC45651qj != null) {
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.icon(R.raw.icon_exclamation_mark_circle_fill);
                    creativeToastBuilder2.iconColorRes(R.attr.dj);
                    creativeToastBuilder2.duration(5000L);
                    creativeToastBuilder2.messageRes(R.string.i5x);
                    C78915Uy7.LJJIIZI(activityC45651qj, 2038, creativeToastBuilder2);
                }
                new H9C().LJIILJJIL(mission, 2);
                return;
            }
        }
    }
}
