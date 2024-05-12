package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6wT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176616wT {
    public long LIZJ;
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public String LIZLLL = "";

    public final void LIZ() {
        this.LIZIZ.put("duration", String.valueOf(System.currentTimeMillis() - this.LIZJ));
    }

    public final void LJ() {
        this.LIZ.clear();
        this.LIZIZ.clear();
        this.LIZJ = 0L;
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZJ = currentTimeMillis;
        this.LIZIZ.put("time_stamp", String.valueOf(currentTimeMillis));
    }

    public final void LJFF() {
        if (!C19N.LJ("comment_sli_monitor", true)) {
            return;
        }
        if (this.LIZJ > 0 && !this.LIZIZ.containsKey("duration")) {
            LIZ();
        }
        if (!this.LIZIZ.containsKey("uid") && ((RBX) HG3.LJIILL()).isLogin()) {
            ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZIZ;
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            concurrentHashMap.put("uid", curUserId);
        }
        if (!this.LIZIZ.containsKey("did")) {
            ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZIZ;
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
            concurrentHashMap2.put("did", com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        }
        try {
            if (this.LIZLLL.length() > 0) {
                C09900aA.LJI(this.LIZLLL, new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(this.LIZ)), null, new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(this.LIZIZ)));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL(BaseResponse baseResponse) {
        Integer num;
        LogPbBean logPbBean;
        String imprId;
        if ((baseResponse instanceof BaseCommentResponse) && (logPbBean = ((BaseCommentResponse) baseResponse).logPd) != null && (imprId = logPbBean.getImprId()) != null) {
            this.LIZIZ.put("log_id", imprId);
        }
        if (baseResponse == null || baseResponse.status_code != 0) {
            this.LIZ.put("status", CardStruct.IStatusCode.DEFAULT);
        } else {
            this.LIZ.put("status", "1");
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZ;
        Integer num2 = null;
        if (baseResponse != null) {
            num = Integer.valueOf(baseResponse.status_code);
        } else {
            num = null;
        }
        concurrentHashMap.put("status_code", String.valueOf(num));
        ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZ;
        if (baseResponse != null) {
            num2 = Integer.valueOf(baseResponse.error_code);
        }
        concurrentHashMap2.put("error_code", String.valueOf(num2));
    }

    public final void LJI(int i) {
        this.LIZ.put("status", CardStruct.IStatusCode.DEFAULT);
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            this.LIZ.put("error_code", valueOf);
        }
        this.LIZ.put("status_code", "-1");
        LJFF();
    }

    public final void LIZIZ(Object obj, String str) {
        if (obj != null) {
            this.LIZ.put(str, obj);
        }
    }

    public final void LIZJ(Object obj, String str) {
        if (obj != null) {
            this.LIZIZ.put(str, obj);
        }
    }
}
