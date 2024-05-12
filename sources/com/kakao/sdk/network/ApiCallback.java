package com.kakao.sdk.network;

import X.C64653PYz;
import X.InterfaceC64642PYo;
import X.InterfaceC65079PgR;
import X.PVM;
import X.PZF;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class ApiCallback<T> implements InterfaceC64642PYo<T> {
    public static final Companion Companion = new Companion();

    public abstract void onComplete(T t, Throwable th);

    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Throwable translateError(Throwable t) {
            PVM pvm;
            o.LJIIIZ(t, "t");
            try {
                if (t instanceof PZF) {
                    C64653PYz<?> response = ((PZF) t).response();
                    String str = null;
                    if (response != null && (pvm = response.LIZJ) != null) {
                        str = pvm.string();
                    }
                    KakaoJson kakaoJson = KakaoJson.INSTANCE;
                    o.LJI(str);
                    ApiErrorResponse apiErrorResponse = (ApiErrorResponse) kakaoJson.fromJson(str, ApiErrorResponse.class);
                    ApiErrorCause apiErrorCause = (ApiErrorCause) kakaoJson.fromJson(String.valueOf(apiErrorResponse.getCode()), ApiErrorCause.class);
                    if (apiErrorCause == null) {
                        apiErrorCause = ApiErrorCause.Unknown;
                    }
                    return new ApiError(((PZF) t).code(), apiErrorCause, apiErrorResponse);
                }
                return t;
            } catch (Throwable th) {
                return th;
            }
        }
    }

    @Override // X.InterfaceC64642PYo
    public void onFailure(InterfaceC65079PgR<T> call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        Throwable origin = ExceptionWrapperKt.getOrigin(t);
        SdkLog.Companion.e(origin);
        onComplete(null, origin);
    }

    @Override // X.InterfaceC64642PYo
    public void onResponse(InterfaceC65079PgR<T> call, C64653PYz<T> response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        T t = response.LIZIZ;
        if (t != null) {
            SdkLog.Companion.i(t);
            onComplete(t, null);
        } else {
            onFailure(call, Companion.translateError(new PZF(response)));
        }
    }
}
