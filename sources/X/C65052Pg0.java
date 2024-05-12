package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.e;
import com.google.gson.s;
import com.twitter.sdk.android.core.models.ApiError;
import com.twitter.sdk.android.core.models.ApiErrors;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import java.util.ArrayList;

/* renamed from: X.Pg0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65052Pg0 extends C65053Pg1 {
    public final ApiError LJLIL;
    public final C48119IuZ LJLILLLLZI;
    public final int LJLJI;
    public final C64653PYz LJLJJI;

    public int getErrorCode() {
        ApiError apiError = this.LJLIL;
        if (apiError == null) {
            return 0;
        }
        return apiError.code;
    }

    public String getErrorMessage() {
        ApiError apiError = this.LJLIL;
        if (apiError == null) {
            return null;
        }
        return apiError.message;
    }

    public C64653PYz getResponse() {
        return this.LJLJJI;
    }

    public int getStatusCode() {
        return this.LJLJI;
    }

    public C48119IuZ getTwitterRateLimit() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65052Pg0(X.C64653PYz r5) {
        /*
            r4 = this;
            com.twitter.sdk.android.core.models.ApiError r3 = readApiError(r5)
            X.IuZ r2 = readApiRateLimit(r5)
            X.PWw r0 = r5.LIZ
            int r1 = r0.LJLJI
            java.lang.String r0 = "HTTP request failed, Status: "
            java.lang.String r0 = X.KMP.LJ(r0, r1)
            r4.<init>(r0)
            r4.LJLIL = r3
            r4.LJLILLLLZI = r2
            r4.LJLJI = r1
            r4.LJLJJI = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65052Pg0.<init>(X.PYz):void");
    }

    public static ApiError LIZ(String str) {
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new SafeListAdapter());
        ((ArrayList) eVar.LJ).add(new SafeMapAdapter());
        try {
            ApiErrors apiErrors = (ApiErrors) GsonProtectorUtils.fromJson(eVar.LIZ(), str, ApiErrors.class);
            if (!apiErrors.errors.isEmpty()) {
                return (ApiError) ListProtector.get(apiErrors.errors, 0);
            }
            return null;
        } catch (s unused) {
            C44432HcC LIZIZ = C65265PjR.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid json: ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            LIZIZ.getClass();
            return null;
        }
    }

    public static ApiError readApiError(C64653PYz c64653PYz) {
        try {
            String LJIILL = c64653PYz.LIZJ.source().LJJIJ().clone().LJIILL();
            if (!TextUtils.isEmpty(LJIILL)) {
                return LIZ(LJIILL);
            }
            return null;
        } catch (Exception unused) {
            C65265PjR.LIZIZ().getClass();
            return null;
        }
    }

    public static C48119IuZ readApiRateLimit(C64653PYz c64653PYz) {
        return new C48119IuZ(c64653PYz.LIZ.LJLJJLL);
    }
}
