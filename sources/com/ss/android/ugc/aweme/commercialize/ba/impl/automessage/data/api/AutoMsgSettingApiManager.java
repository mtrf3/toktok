package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api;

import X.C65296Pjw;
import X.C69432nz;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.MsgSwitchResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.SuggestedQuestionsResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AutoMsgSettingApiManager {
    public static final AutoMsgSettingApi LIZ;

    /* loaded from: classes16.dex */
    public interface AutoMsgSettingApi {
        public static final C65296Pjw LIZ = C65296Pjw.LIZ;

        @E4Q("/tiktok/v1/ba/auto_reply/get/review_status/")
        C76L<AutoReplyStatusResponse> getAutoReply();

        @E4Q("/tiktok/v1/ba/get/message_switch/")
        C76L<MsgSwitchResponse> getMsgSwitches();

        @E4Q("/aweme/v1/ad/ba/suggested_question/")
        C76L<SuggestedQuestionsResponse> getSuggestedQuestion();

        @E4Q("/tiktok/v1/ba/wel_message/get/review_status/")
        C76L<WelMsgStatusResponse> getWelMsgReviewStatus();

        @InterfaceC195787mI
        @E4T("/tiktok/v1/ba/set/auto_reply/")
        C76L<BaseResponse> setAutoReply(@InterfaceC64987Pex("operation_type") int i, @InterfaceC64987Pex("auto_reply_struct") String str);

        @E4T("/tiktok/v1/ba/set/message_switch/")
        C76L<WelMsgStatusResponse> setMsgSwitch(@InterfaceC64989Pez("message_type") int i, @InterfaceC64989Pez("message_switch") int i2);

        @E4T("/tiktok/v1/ba/set/wel_message/")
        C76L<BaseResponse> setWelMsg(@InterfaceC64989Pez("operation_type") int i, @InterfaceC64989Pez("content") String str, @InterfaceC64989Pez("message_id") Long l);
    }

    public static C76L LIZ() {
        return LIZ.getAutoReply();
    }

    public static C76L LIZIZ() {
        return LIZ.getMsgSwitches();
    }

    public static C76L LIZJ() {
        return LIZ.getSuggestedQuestion();
    }

    public static C76L LIZLLL() {
        return LIZ.getWelMsgReviewStatus();
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        AutoMsgSettingApi.LIZ.getClass();
        LIZ = (AutoMsgSettingApi) LIZLLL.create(C65296Pjw.LIZIZ).create(AutoMsgSettingApi.class);
    }

    public static C76L LJ(int i, AutoReplyStruct autoReplyStruct) {
        AutoMsgSettingApi autoMsgSettingApi = LIZ;
        String json = GsonProtectorUtils.toJson(C69432nz.LIZ(), autoReplyStruct);
        o.LJIIIIZZ(json, "autoReplyStruct.let { Gs…il.getGson().toJson(it) }");
        return autoMsgSettingApi.setAutoReply(i, json);
    }

    public static C76L LJFF(int i, int i2) {
        return LIZ.setMsgSwitch(i, i2);
    }

    public static C76L LJI(int i, String content, Long l) {
        o.LJIIIZ(content, "content");
        return LIZ.setWelMsg(i, content, l);
    }
}
