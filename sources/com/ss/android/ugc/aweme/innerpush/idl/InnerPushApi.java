package com.ss.android.ugc.aweme.innerpush.idl;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C78999UzT;
import X.C86478Xwo;
import X.C86496Xx6;
import X.C86528Xxc;
import X.C86534Xxi;
import X.C86536Xxk;
import X.E4Q;
import X.E4T;
import X.EF7;
import X.EnumC86511XxL;
import X.HG3;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.RBX;
import X.T16;
import X.X1D;
import X.XS4;
import Y.AfS64S0200000_15;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.PushHistoryInfo;
import com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InnerPushApi {
    public static final String LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;

    /* loaded from: classes16.dex */
    public interface Api {
        @E4Q("/tiktok/in_app_push/get/v1/")
        AbstractC73672Svk<GetMessageListResponse> getMessages(@InterfaceC64989Pez("protocol") int i, @InterfaceC64989Pez("version") int i2, @InterfaceC64989Pez("last_message_create_time") long j, @InterfaceC64989Pez("scenario") int i3, @InterfaceC64989Pez("freq_strategies_info") String str, @InterfaceC64989Pez("setting_filter_types") String str2);

        @InterfaceC195787mI
        @E4T("/tiktok/in_app_push/status/update/v1/")
        AbstractC73672Svk<BaseResponse> markStatus(@InterfaceC64987Pex("id") long j, @InterfaceC64987Pex("status") int i, @InterfaceC64987Pex("push_history_info") String str);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        LIZ = X1D.LIZIZ(LIZ2);
        LIZIZ = C221108m2.LIZIZ(XS4.LJLIL);
        LIZJ = C221108m2.LIZIZ(C86536Xxk.LJLIL);
    }

    public static void LIZ(InnerPushMessage innerPushMessage, EnumC86511XxL status) {
        EnumC86511XxL enumC86511XxL;
        o.LJIIIZ(status, "status");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("markStatus message:");
        LIZ2.append(innerPushMessage);
        LIZ2.append(", status:");
        LIZ2.append(status);
        C86478Xwo.LIZ("InnerPushApi", X1D.LIZIZ(LIZ2));
        C86496Xx6.LJIIL(innerPushMessage, status);
        String curUid = ((RBX) HG3.LJIILL()).getCurUserId();
        if (!innerPushMessage.isFromPlatform() || !innerPushMessage.getMarkStatus() || curUid == null || curUid.length() == 0) {
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        o.LJIIIIZZ(curUid, "curUid");
        PushHistoryInfo pushHistoryInfo = new PushHistoryInfo(valueOf, CastLongProtector.parseLong(curUid), innerPushMessage.getType());
        Api api = (Api) LIZIZ.getValue();
        long id = innerPushMessage.getId();
        if (status == EnumC86511XxL.DROP_BY_DUPLICATION || status == EnumC86511XxL.DROP_BY_EXPIRATION || status == EnumC86511XxL.DROP_BY_FREQUENCY || status == EnumC86511XxL.DROP_BY_PERMISSION || status == EnumC86511XxL.DROP_BY_NOTICE_READ) {
            if (innerPushMessage.getHasAvoidanceWaited()) {
                enumC86511XxL = EnumC86511XxL.WAIT_TO_DROP;
            } else {
                enumC86511XxL = EnumC86511XxL.DROP;
            }
        } else {
            enumC86511XxL = status;
        }
        int value = enumC86511XxL.getValue();
        String LIZLLL = JsonParseUtils.LIZLLL(pushHistoryInfo);
        o.LJIIIIZZ(LIZLLL, "toJSONString(historyInfo)");
        C78999UzT.LJFF(api.markStatus(id, value, LIZLLL).LJJL(T16.LIZ()).LJJJLL(new AfS64S0200000_15(innerPushMessage, status, 3), C86528Xxc.LJLIL, C86534Xxi.LIZ), (C73318Sq2) LIZJ.getValue());
    }
}
