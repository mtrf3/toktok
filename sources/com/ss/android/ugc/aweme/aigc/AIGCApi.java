package com.ss.android.ugc.aweme.aigc;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C47261Igj;
import X.C62822Ol8;
import X.C72160STs;
import X.C72164STw;
import X.C73995T2h;
import X.E4Q;
import X.E8M;
import X.EnumC72154STm;
import X.EnumC72156STo;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public final class AIGCApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C73995T2h.LJLIL);

    /* loaded from: classes13.dex */
    public interface Api {
        @InterfaceC195787mI
        @E8M("/tiktok/v1/aigc_avatar/tasks/discard")
        InterfaceC37276Ek4<ResponseDiscard> discard(@InterfaceC64987Pex("task_id") String str);

        @InterfaceC195787mI
        @E8M("/tiktok/v1/aigc_avatar/regenerate")
        AbstractC73672Svk<ResponseQuickGenerate> generateMore(@InterfaceC64987Pex("task_id") String str);

        @E4Q("/tiktok/v1/aigc_avatar/avatars")
        InterfaceC37276Ek4<ResponseGetAvatars> getAIGCAvatars(@InterfaceC64989Pez("task_id") String str, @InterfaceC64989Pez("start_index") int i, @InterfaceC64989Pez("count") Integer num);

        @E4Q("/tiktok/v1/aigc_avatar/quota")
        InterfaceC37276Ek4<ResponseAIGCQuotas> getAIGCQuotas();

        @E4Q("/tiktok/v1/aigc_avatar/styles")
        InterfaceC37276Ek4<ResponseAIGCStyles> getAIGCStyles();

        @E4Q("/tiktok/v1/aigc_avatar/tasks")
        InterfaceC37276Ek4<ResponseAIGCTaskStatus> getAIGCTask(@InterfaceC64989Pez("task_ids") ArrayList<String> arrayList, @InterfaceC64989Pez("filter_status") ArrayList<Integer> arrayList2, @InterfaceC64989Pez("start_index") int i, @InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("need_detail") int i2);

        @InterfaceC195787mI
        @E8M("/tiktok/v1/aigc_avatar/quick_generate")
        AbstractC73672Svk<ResponseQuickGenerate> quickGenerate(@InterfaceC64987Pex("image_infos") JSONArray jSONArray);

        @InterfaceC195787mI
        @E8M("/tiktok/v1/aigc_avatar/slow_generate")
        InterfaceC37276Ek4<ResponseSlowGenerate> slowGenerate(@InterfaceC64987Pex("image_infos") JSONArray jSONArray, @InterfaceC64987Pex("aigc_styles") JSONArray jSONArray2);
    }

    public static ResponseDiscard LIZ(String taskId) {
        o.LJIIIZ(taskId, "taskId");
        EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_DISCARD;
        C72164STw.LIZ(enumC72154STm, EnumC72156STo.START, null, null, null, null, 60);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ResponseDiscard responseDiscard = C72160STs.LIZ().discard(taskId).execute().LIZIZ;
        if (responseDiscard.status_code != 0) {
            C72164STw.LIZ(enumC72154STm, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, String.valueOf(responseDiscard.status_code), responseDiscard.status_msg, 8);
        } else {
            C72164STw.LIZ(enumC72154STm, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, null, null, 56);
        }
        return responseDiscard;
    }

    public static ResponseGetAvatars LIZIZ(String taskId) {
        String message;
        ResponseGetAvatars responseGetAvatars;
        String str;
        o.LJIIIZ(taskId, "taskId");
        Integer num = null;
        C72164STw.LIZ(EnumC72154STm.AIGC_NET_GET_AVATAR, EnumC72156STo.START, null, null, null, null, 60);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            responseGetAvatars = C72160STs.LIZ().getAIGCAvatars(taskId, 0, null).execute().LIZIZ;
            message = null;
        } catch (Exception e) {
            message = e.getMessage();
            responseGetAvatars = null;
        }
        if (responseGetAvatars != null && responseGetAvatars.status_code == 0) {
            if (responseGetAvatars.avatarUrls.isEmpty()) {
                C72164STw.LIZ(EnumC72154STm.AIGC_NET_GET_AVATAR, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, String.valueOf(responseGetAvatars.status_code), "Avatars is empty", 8);
            } else {
                C72164STw.LIZ(EnumC72154STm.AIGC_NET_GET_AVATAR, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, null, null, 56);
            }
            return responseGetAvatars;
        }
        EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_GET_AVATAR;
        EnumC72156STo enumC72156STo = EnumC72156STo.FAIL;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        if (responseGetAvatars != null) {
            num = Integer.valueOf(responseGetAvatars.status_code);
        }
        String valueOf2 = String.valueOf(num);
        if (responseGetAvatars != null && (str = responseGetAvatars.status_msg) != null) {
            message = str;
        }
        C72164STw.LIZ(enumC72154STm, enumC72156STo, valueOf, null, valueOf2, message, 8);
        return responseGetAvatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ResponseAIGCTaskStatus LIZJ(String str) {
        InterfaceC37276Ek4 aIGCTask;
        ResponseAIGCTaskStatus responseAIGCTaskStatus;
        InterfaceC37276Ek4 aIGCTask2;
        EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_GET_TASK;
        C72164STw.LIZ(enumC72154STm, EnumC72156STo.START, null, null, null, null, 60);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (str == null) {
            aIGCTask2 = C72160STs.LIZ().getAIGCTask(null, null, 0, null, 1);
            responseAIGCTaskStatus = (ResponseAIGCTaskStatus) aIGCTask2.execute().LIZIZ;
        } else {
            aIGCTask = C72160STs.LIZ().getAIGCTask(C47261Igj.LJII(str), null, 0, null, 1);
            responseAIGCTaskStatus = (ResponseAIGCTaskStatus) aIGCTask.execute().LIZIZ;
        }
        if (responseAIGCTaskStatus.status_code != 0) {
            C72164STw.LIZ(enumC72154STm, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, String.valueOf(responseAIGCTaskStatus.status_code), responseAIGCTaskStatus.status_msg, 8);
        } else {
            C72164STw.LIZ(enumC72154STm, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, null, null, 56);
        }
        return responseAIGCTaskStatus;
    }
}
