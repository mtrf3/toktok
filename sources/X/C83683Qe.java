package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.lang.reflect.Type;

/* renamed from: X.3Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83683Qe {
    public final Type LIZ;
    public final String LIZIZ;
    public int LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;

    public final String LIZ() {
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ.toString());
            LIZ.append("(");
            return JBR.LJFF(LIZ, this.LIZIZ, ")", LIZ);
        }
        return this.LIZ.toString();
    }

    public final int hashCode() {
        int hashCode;
        if (this.LIZJ == Integer.MIN_VALUE) {
            int hashCode2 = this.LIZ.hashCode();
            String str = this.LIZIZ;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.LIZJ = hashCode2 ^ hashCode;
        }
        return this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ServiceKey{");
        LIZ.append(String.valueOf(this.LIZ));
        LIZ.append(" ");
        return JBR.LJFF(LIZ, this.LIZIZ, "}", LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C83683Qe)) {
            return false;
        }
        C83683Qe c83683Qe = (C83683Qe) obj;
        Type type = c83683Qe.LIZ;
        Type type2 = this.LIZ;
        if (type != type2 && (type == null || !type.equals(type2))) {
            return false;
        }
        String str = c83683Qe.LIZIZ;
        String str2 = this.LIZIZ;
        if (str != str2 && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    public C83683Qe(String str, Type type) {
        this.LIZ = type;
        this.LIZIZ = str;
    }
}
