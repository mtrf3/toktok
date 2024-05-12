package X;

import android.text.TextUtils;
import defpackage.q;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.56e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1294456e {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C1294456e() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1294456e)) {
            return false;
        }
        C1294456e c1294456e = (C1294456e) obj;
        return o.LJ(this.LIZ, c1294456e.LIZ) && o.LJ(this.LIZIZ, c1294456e.LIZIZ) && o.LJ(this.LIZJ, c1294456e.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String LIZ() {
        String str;
        if (TextUtils.isEmpty(this.LIZ)) {
            return "";
        }
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            LIZ.append(this.LIZIZ);
            LIZ.append(File.separator);
            str = X1D.LIZIZ(LIZ);
        } else {
            str = this.LIZ;
        }
        C44687HgJ.LJI(new File(str));
        return C63144OqK.LIZIZ(new Object[]{str, this.LIZJ}, 2, Locale.getDefault(), "%sIMG_%s.png", "format(locale, format, *args)");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectCapturedPhotoPathGenerator(videoDir=");
        LIZ.append(this.LIZ);
        LIZ.append(", segmentDir=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageFilePath=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C1294456e(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
