package com.facebook;

import X.C65819PsN;
import X.C65822PsQ;
import X.C65825PsT;
import X.C65830PsY;
import X.C65832Psa;
import X.C65833Psb;
import X.C65834Psc;
import X.EnumC65831PsZ;
import X.Q4W;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class FacebookRequestError implements Parcelable {
    public final Object batchRequestResult;
    public final EnumC65831PsZ category;
    public final HttpURLConnection connection;
    public final int errorCode;
    public final String errorMessage;
    public final String errorRecoveryMessage;
    public final String errorType;
    public final String errorUserMessage;
    public final String errorUserTitle;
    public Q4W exception;
    public final JSONObject requestResult;
    public final JSONObject requestResultBody;
    public final int requestStatusCode;
    public final int subErrorCode;
    public static final C65830PsY Companion = new C65830PsY();
    public static final C65833Psb HTTP_RANGE_SUCCESS = new C65833Psb();
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new IDCreatorS54S0000000_11(16);

    public /* synthetic */ FacebookRequestError() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String LIZ() {
        String str = this.errorMessage;
        if (str == null) {
            Q4W q4w = this.exception;
            if (q4w == null) {
                return null;
            }
            return q4w.getLocalizedMessage();
        }
        return str;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + LIZ() + "}";
        o.LJIIIIZZ(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FacebookRequestError(java.net.HttpURLConnection r15, java.lang.Exception r16) {
        /*
            r14 = this;
            r12 = r16
            r1 = -1
            r4 = 0
            boolean r0 = r12 instanceof X.Q4W
            if (r0 == 0) goto L19
            X.Q4W r12 = (X.Q4W) r12
        La:
            r13 = 0
            r11 = r15
            r0 = r14
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L19:
            X.Q4W r0 = new X.Q4W
            r0.<init>(r12)
            r12 = r0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(LIZ());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, Q4W q4w, boolean z) {
        C65822PsQ c65822PsQ;
        EnumC65831PsZ enumC65831PsZ;
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        String str5;
        this.requestStatusCode = i;
        this.errorCode = i2;
        this.subErrorCode = i3;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (q4w != null) {
            this.exception = q4w;
            enumC65831PsZ = EnumC65831PsZ.OTHER;
        } else {
            this.exception = new C65834Psc(this, LIZ());
            synchronized (Companion) {
                C65825PsT LIZIZ = C65819PsN.LIZIZ(u.LIZLLL());
                if (LIZIZ == null) {
                    c65822PsQ = C65822PsQ.LJI.LIZ();
                } else {
                    c65822PsQ = LIZIZ.LJ;
                }
            }
            if (z) {
                c65822PsQ.getClass();
                enumC65831PsZ = EnumC65831PsZ.TRANSIENT;
            } else {
                Map<Integer, Set<Integer>> map = c65822PsQ.LIZ;
                if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = c65822PsQ.LIZ.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
                    enumC65831PsZ = EnumC65831PsZ.OTHER;
                } else {
                    Map<Integer, Set<Integer>> map2 = c65822PsQ.LIZJ;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = c65822PsQ.LIZJ.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
                        enumC65831PsZ = EnumC65831PsZ.LOGIN_RECOVERABLE;
                    } else {
                        Map<Integer, Set<Integer>> map3 = c65822PsQ.LIZIZ;
                        if (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set = c65822PsQ.LIZIZ.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
                            enumC65831PsZ = EnumC65831PsZ.TRANSIENT;
                        } else {
                            enumC65831PsZ = EnumC65831PsZ.OTHER;
                        }
                    }
                }
            }
        }
        this.category = enumC65831PsZ;
        C65822PsQ LIZ = Companion.LIZ();
        LIZ.getClass();
        if (enumC65831PsZ != null) {
            int i4 = C65832Psa.LIZ[enumC65831PsZ.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        str5 = LIZ.LJ;
                    }
                } else {
                    str5 = LIZ.LJFF;
                }
            } else {
                str5 = LIZ.LIZLLL;
            }
            this.errorRecoveryMessage = str5;
        }
        str5 = null;
        this.errorRecoveryMessage = str5;
    }
}
