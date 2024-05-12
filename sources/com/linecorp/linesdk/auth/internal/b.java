package com.linecorp.linesdk.auth.internal;

import X.C16880lQ;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.StringTokenizer;

/* loaded from: classes12.dex */
public final class b {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public static b LIZ(LineAuthenticationActivity lineAuthenticationActivity) {
        try {
            String str = C16880lQ.LLLLLLZ(lineAuthenticationActivity.getPackageManager(), "jp.naver.line.android", 128).versionName;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            return new b(CastIntegerProtector.parseInt(stringTokenizer.nextToken()), CastIntegerProtector.parseInt(stringTokenizer.nextToken()), CastIntegerProtector.parseInt(stringTokenizer.nextToken()));
        } catch (PackageManager.NameNotFoundException | NullPointerException | NumberFormatException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.LIZ == bVar.LIZ && this.LIZIZ == bVar.LIZIZ && this.LIZJ == bVar.LIZJ) {
            return true;
        }
        return false;
    }

    public b(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
