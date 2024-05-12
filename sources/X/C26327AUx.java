package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.mob.AvatarTrackerBaseParams;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AUx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26327AUx implements InterfaceC26319AUp {
    public final HashMap<String, String> LIZ;
    public final AvatarTrackerBaseParams LIZIZ;

    @Override // X.InterfaceC26319AUp
    public final void LIZ() {
    }

    @Override // X.InterfaceC26319AUp
    public final void LIZIZ(EnumC26324AUu actionType, Object any) {
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(any, "any");
    }

    @Override // X.InterfaceC26319AUp
    public final void LJFF(EnumC26325AUv choiceType, HashMap<String, String> hashMap) {
        o.LJIIIZ(choiceType, "choiceType");
    }

    @Override // X.InterfaceC26319AUp
    public final void LIZLLL() {
        FMX.LJIIL("set_avatar_success", C17N.LJJII(this.LIZ).LIZ);
    }

    public C26327AUx(HashMap<String, String> hashMap) {
        this.LIZ = hashMap;
        this.LIZIZ = new AvatarTrackerBaseParams(hashMap);
    }

    public static int LJIIIIZZ(Throwable th) {
        BaseResponse baseResponse;
        if (th instanceof C64799Pbv) {
            return -1;
        }
        if (th instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) th;
            Object rawResponse = c38333F2r.getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (baseResponse = (BaseResponse) rawResponse) != null) {
                return baseResponse.status_code;
            }
            return c38333F2r.getErrorCode();
        }
        return MS5.LIZJ(th);
    }

    public static String LJIIIZ(Throwable th) {
        BaseResponse baseResponse;
        String str;
        if (th instanceof C64799Pbv) {
            return "CronetIOException";
        }
        if (th instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) th;
            Object rawResponse = c38333F2r.getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (baseResponse = (BaseResponse) rawResponse) != null && (str = baseResponse.status_msg) != null) {
                return str;
            }
            String errorMsg = c38333F2r.getErrorMsg();
            if (errorMsg != null) {
                return errorMsg;
            }
        }
        return "";
    }

    public static String LJIIJ(Throwable th) {
        String str;
        UserResponse userResponse;
        LogPbBean logPbBean;
        String imprId;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (!(th instanceof C64799Pbv) && (th instanceof C38333F2r)) {
            Object rawResponse = ((C38333F2r) th).getRawResponse();
            if ((!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null || (serverTimeExtra = baseResponse.extra) == null || (imprId = serverTimeExtra.logid) == null) && (!(rawResponse instanceof UserResponse) || (userResponse = (UserResponse) rawResponse) == null || (logPbBean = userResponse.logPb) == null || (imprId = logPbBean.getImprId()) == null)) {
                if ((rawResponse instanceof String) && (str = (String) rawResponse) != null) {
                    return str;
                }
            } else {
                return imprId;
            }
        }
        return "";
    }

    @Override // X.InterfaceC26319AUp
    public final void LIZJ(Throwable e) {
        o.LJIIIZ(e, "e");
        C35936E8m LJJII = C17N.LJJII(this.LIZ);
        LJJII.LIZLLL("error_api", "upload");
        LJJII.LIZLLL("error_message", LJIIIZ(e));
        LJJII.LIZ(LJIIIIZZ(e), "error_code");
        LJJII.LIZLLL("erorr_log_id", LJIIJ(e));
        FMX.LJIIL("set_avatar_fail", LJJII.LIZ);
    }

    @Override // X.InterfaceC26319AUp
    public final void LJ(Throwable e) {
        o.LJIIIZ(e, "e");
        C35936E8m LJJII = C17N.LJJII(this.LIZ);
        LJJII.LIZLLL("error_api", "commit");
        LJJII.LIZLLL("error_message", LJIIIZ(e));
        LJJII.LIZ(LJIIIIZZ(e), "error_code");
        LJJII.LIZLLL("erorr_log_id", LJIIJ(e));
        FMX.LJIIL("set_avatar_fail", LJJII.LIZ);
    }

    @Override // X.InterfaceC26319AUp
    public final void LJII(EnumC26325AUv choiceType) {
        String str;
        o.LJIIIZ(choiceType, "choiceType");
        C35936E8m LJJII = C17N.LJJII(this.LIZ);
        int i = C26326AUw.LIZ[choiceType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "photo";
            } else {
                throw new C162476Zf();
            }
        } else {
            str = "camera";
        }
        LJJII.LIZLLL("type", str);
        FMX.LJIIL("set_avatar_auth_request", LJJII.LIZ);
    }

    @Override // X.InterfaceC26319AUp
    public final void LJI(EnumC26325AUv choiceType, boolean z) {
        String str;
        String str2;
        o.LJIIIZ(choiceType, "choiceType");
        C35936E8m LJJII = C17N.LJJII(this.LIZ);
        int i = C26326AUw.LIZ[choiceType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "photo";
            } else {
                throw new C162476Zf();
            }
        } else {
            str = "camera";
        }
        LJJII.LIZLLL("type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJII.LIZLLL("is_permit", str2);
        FMX.LJIIL("set_avatar_auth_result", LJJII.LIZ);
    }
}
