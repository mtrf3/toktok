package com.kakao.sdk.network;

import X.C39745Fin;
import X.C64597PWv;
import X.C64598PWw;
import X.InterfaceC88471Ynr;
import X.PVM;
import X.PXZ;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.util.KakaoJson;
import kotlin.jvm.internal.o;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class UtilityKt {
    public static final C64598PWw proceedApiError(PXZ pxz, Request request, InterfaceC88471Ynr<? super C64598PWw, ? super ApiError, C64598PWw> errorHandler) {
        String string;
        String str;
        ApiErrorResponse apiErrorResponse;
        ApiErrorCause apiErrorCause;
        o.LJIIIZ(pxz, "<this>");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(errorHandler, "errorHandler");
        C64598PWw LIZ = pxz.LIZ(request);
        PVM pvm = LIZ.LJLJL;
        C39745Fin c39745Fin = null;
        if (pvm == null) {
            string = null;
        } else {
            string = pvm.string();
        }
        C64597PWv c64597PWv = new C64597PWv(LIZ);
        if (pvm != null) {
            c39745Fin = pvm.contentType();
        }
        if (string == null) {
            str = "";
        } else {
            str = string;
        }
        c64597PWv.LJI = PVM.create(c39745Fin, str);
        C64598PWw LIZ2 = c64597PWv.LIZ();
        if (LIZ2.LIZIZ() || string == null || (apiErrorResponse = (ApiErrorResponse) KakaoJson.INSTANCE.fromJson(string, ApiErrorResponse.class)) == null || (apiErrorCause = (ApiErrorCause) KakaoJson.INSTANCE.fromJson(String.valueOf(apiErrorResponse.getCode()), ApiErrorCause.class)) == null) {
            return LIZ2;
        }
        return errorHandler.invoke(LIZ2, new ApiError(LIZ2.LJLJI, apiErrorCause, apiErrorResponse));
    }

    public static final C64598PWw proceedBodyString(PXZ pxz, Request request, InterfaceC88471Ynr<? super C64598PWw, ? super String, C64598PWw> bodyHandler) {
        String string;
        String str;
        o.LJIIIZ(pxz, "<this>");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(bodyHandler, "bodyHandler");
        C64598PWw LIZ = pxz.LIZ(request);
        PVM pvm = LIZ.LJLJL;
        C39745Fin c39745Fin = null;
        if (pvm == null) {
            string = null;
        } else {
            string = pvm.string();
        }
        C64597PWv c64597PWv = new C64597PWv(LIZ);
        if (pvm != null) {
            c39745Fin = pvm.contentType();
        }
        if (string == null) {
            str = "";
        } else {
            str = string;
        }
        c64597PWv.LJI = PVM.create(c39745Fin, str);
        return bodyHandler.invoke(c64597PWv.LIZ(), string);
    }
}
