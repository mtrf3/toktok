package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.AddYoursAvatarHelper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HS3 extends SimpleServiceLoadCallback {
    public final /* synthetic */ C68322mC<String> LIZ;
    public final /* synthetic */ HWR LIZIZ;
    public final /* synthetic */ C68322mC<Effect> LIZJ;
    public final /* synthetic */ MusicModel LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        Long l2;
        Object obj;
        List<AddYoursAvatar> userAvatars;
        AddYoursStickerStruct addYoursStickerStruct;
        List<AddYoursAvatar> userAvatars2;
        String str5;
        Integer isOperationSet;
        o.LJIIIZ(service, "service");
        String str6 = this.LIZ.element;
        AddYourRecordParam addYourRecordParam = this.LIZIZ.LIZJ;
        C188727au c188727au = new C188727au();
        String enterFrom = addYourRecordParam.getEnterFrom();
        String str7 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("shoot_way", "add_yours");
        c188727au.LJIIIZ("creation_id", str6);
        String addYoursEnterMethod = addYourRecordParam.getAddYoursEnterMethod();
        if (addYoursEnterMethod == null) {
            addYoursEnterMethod = "";
        }
        c188727au.LJIIIZ("add_yours_enter_method", addYoursEnterMethod);
        AddYoursStickerStruct addYoursStickerStruct2 = addYourRecordParam.getAddYoursStickerStruct();
        List<AddYoursAvatar> list = null;
        if (addYoursStickerStruct2 != null) {
            l = addYoursStickerStruct2.getTopicId();
        } else {
            l = null;
        }
        String str8 = "1";
        if (l != null) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_add_yours", str);
        AddYoursStickerStruct addYoursStickerStruct3 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct3 == null || addYoursStickerStruct3.getTopicId() == null) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_initiator", str2);
        AddYoursStickerStruct addYoursStickerStruct4 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct4 != null && o.LJ(addYoursStickerStruct4.getViewerInvited(), Boolean.TRUE)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_invited", str3);
        AddYoursStickerStruct addYoursStickerStruct5 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct5 == null || (str4 = addYoursStickerStruct5.getText()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("add_yours_title", str4);
        String fromGroupId = addYourRecordParam.getFromGroupId();
        if (fromGroupId == null) {
            fromGroupId = "";
        }
        c188727au.LJIIIZ("from_group_id", fromGroupId);
        AddYoursStickerStruct addYoursStickerStruct6 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct6 != null) {
            l2 = addYoursStickerStruct6.getTopicId();
        } else {
            l2 = null;
        }
        if (l2 != null || ((isOperationSet = addYourRecordParam.isOperationSet()) != null && isOperationSet.intValue() != 0)) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_first_author", str8);
        AddYoursStickerStruct addYoursStickerStruct7 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct7 == null || (obj = addYoursStickerStruct7.getTopicId()) == null) {
            obj = "";
        }
        c188727au.LJFF(obj, "add_yours_id");
        String followStatus = addYourRecordParam.getFollowStatus();
        if (followStatus != null) {
            str7 = followStatus;
        }
        c188727au.LJIIIZ("follow_status", str7);
        c188727au.LJIIIZ("music_selected_from", "add_yours");
        c188727au.LJFF(addYourRecordParam.isOperationSet(), "is_operation_set");
        FMX.LJIIL("shoot", c188727au.LIZ);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(this.LIZ.element);
        builder.startRecordTime(System.currentTimeMillis());
        builder.decompressTime(j);
        builder.shootWay("add_yours");
        builder.enterMethod("add_yours");
        builder.translationType(HTF.LIZ());
        builder.musicOrigin("add_yours");
        builder.videoLength(Integer.valueOf(this.LIZIZ.LJIIIZ));
        Effect effect = this.LIZJ.element;
        if (effect != null && this.LIZLLL != null) {
            builder.musicWithSticker(effect);
            Aweme aweme = this.LIZIZ.LIZIZ;
            if (aweme != null) {
                str5 = aweme.getStickerIDs();
            } else {
                str5 = null;
            }
            if (!TextUtils.isEmpty(str5)) {
                this.LIZIZ.getClass();
                builder.stickers(HWR.LIZ(str5));
                this.LIZIZ.getClass();
                ArrayList LIZ = HWR.LIZ(str5);
                if (!LIZ.isEmpty()) {
                    builder.musicSticker((String) ListProtector.get(LIZ, 0));
                }
            }
        }
        AddYoursStickerStruct addYoursStickerStruct8 = this.LIZIZ.LIZJ.getAddYoursStickerStruct();
        if (addYoursStickerStruct8 == null || (userAvatars2 = addYoursStickerStruct8.getUserAvatars()) == null || userAvatars2.isEmpty()) {
            this.LIZIZ.LJFF.getClass();
            List<AddYoursAvatar> list2 = AddYoursAvatarHelper.LIZLLL;
            if (list2 != null && !list2.isEmpty() && (addYoursStickerStruct = this.LIZIZ.LIZJ.getAddYoursStickerStruct()) != null) {
                addYoursStickerStruct.setUserAvatars(list2);
            }
            AddYoursStickerStruct addYoursStickerStruct9 = this.LIZIZ.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct9 != null) {
                AddYoursStickerStruct addYoursStickerStruct10 = this.LIZIZ.LIZJ.getAddYoursStickerStruct();
                if (addYoursStickerStruct10 != null && (userAvatars = addYoursStickerStruct10.getUserAvatars()) != null) {
                    list = C44729Hgz.LJJIJIIJI(userAvatars);
                }
                addYoursStickerStruct9.setUserAvatars(list);
            }
        }
        builder.addYoursStickerParam(this.LIZIZ.LIZJ);
        if (this.LIZJ.element != null && AVExternalServiceImpl.LIZ().abilityService().effectService().isEffectControlGame(this.LIZJ.element)) {
            service.uiService().recordService().startRecord(this.LIZIZ.LIZ, builder.build());
            return;
        }
        String str9 = this.LJ;
        if (str9 != null) {
            MusicModel musicModel = this.LIZLLL;
            HWR hwr = this.LIZIZ;
            if (musicModel != null) {
                builder.musicPath(str9);
                Aweme aweme2 = hwr.LIZIZ;
                if (aweme2 != null) {
                    musicModel.setMusicBeginTime(aweme2.getMusicBeginTime());
                }
                Aweme aweme3 = hwr.LIZIZ;
                if (aweme3 != null) {
                    musicModel.setMusicEndTime(aweme3.getMusicEndTime());
                }
                service.uiService().recordService().startRecord(hwr.LIZ, builder.build(), musicModel, true);
            }
        }
        if (this.LIZLLL != null) {
            return;
        }
        service.uiService().recordService().startRecord(this.LIZIZ.LIZ, builder.build());
        HWR hwr2 = this.LIZIZ;
        if (!hwr2.LJIIL) {
            return;
        }
        hwr2.LIZ.finish();
    }

    public HS3(C68322mC<String> c68322mC, HWR hwr, C68322mC<Effect> c68322mC2, MusicModel musicModel, String str) {
        this.LIZ = c68322mC;
        this.LIZIZ = hwr;
        this.LIZJ = c68322mC2;
        this.LIZLLL = musicModel;
        this.LJ = str;
    }
}
