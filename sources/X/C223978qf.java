package X;

import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.8qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223978qf {
    public static void LIZ(AddYourRecordParam addYourRecordParam, boolean z, long j, String str, String str2) {
        String str3;
        String str4;
        String str5;
        Object obj;
        C188727au c188727au = new C188727au();
        String enterFrom = addYourRecordParam.getEnterFrom();
        String str6 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        c188727au.LJIIIZ("enter_from", enterFrom);
        String str7 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("result", str3);
        c188727au.LJIIIZ("preload", CardStruct.IStatusCode.DEFAULT);
        c188727au.LJIIIZ("effect_id", str2);
        c188727au.LJ(j, "duration");
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("shoot_way", "add_yours");
        String addYoursEnterMethod = addYourRecordParam.getAddYoursEnterMethod();
        if (addYoursEnterMethod == null) {
            addYoursEnterMethod = "";
        }
        c188727au.LJIIIZ("add_yours_enter_method", addYoursEnterMethod);
        c188727au.LJIIIZ("is_add_yours", "1");
        if (!addYourRecordParam.isFollowAY()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_initiator", str4);
        AddYoursStickerStruct addYoursStickerStruct = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct != null && o.LJ(addYoursStickerStruct.getViewerInvited(), Boolean.TRUE)) {
            str7 = "1";
        }
        c188727au.LJIIIZ("is_invited", str7);
        AddYoursStickerStruct addYoursStickerStruct2 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct2 == null || (str5 = addYoursStickerStruct2.getText()) == null) {
            str5 = "";
        }
        c188727au.LJIIIZ("add_yours_title", str5);
        String fromGroupId = addYourRecordParam.getFromGroupId();
        if (fromGroupId == null) {
            fromGroupId = "";
        }
        c188727au.LJIIIZ("from_group_id", fromGroupId);
        AddYoursStickerStruct addYoursStickerStruct3 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct3 == null || (obj = addYoursStickerStruct3.getTopicId()) == null) {
            obj = "";
        }
        c188727au.LJFF(obj, "add_yours_id");
        String followStatus = addYourRecordParam.getFollowStatus();
        if (followStatus != null) {
            str6 = followStatus;
        }
        c188727au.LJIIIZ("follow_status", str6);
        c188727au.LJIIIZ("music_selected_from", "add_yours");
        c188727au.LJFF(addYourRecordParam.isOperationSet(), "is_operation_set");
        FMX.LJIIL("tool_performance_add_yours_resource_download", c188727au.LIZ);
    }
}
