package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.U6z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76665U6z {
    public final Context LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final U8M LJFF;
    public final boolean LJI;
    public final EnumC76124TuC LJII;
    public final Drawable LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76665U6z)) {
            return false;
        }
        C76665U6z c76665U6z = (C76665U6z) obj;
        return o.LJ(this.LIZ, c76665U6z.LIZ) && this.LIZIZ == c76665U6z.LIZIZ && this.LIZJ == c76665U6z.LIZJ && o.LJ(this.LIZLLL, c76665U6z.LIZLLL) && this.LJ == c76665U6z.LJ && o.LJ(this.LJFF, c76665U6z.LJFF) && this.LJI == c76665U6z.LJI && this.LJII == c76665U6z.LJII && o.LJ(this.LJIIIIZZ, c76665U6z.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", scene=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", roomId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", liveType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", owner=");
        LIZ.append(this.LJ);
        LIZ.append(", provider=");
        LIZ.append(this.LJFF);
        LIZ.append(", isOnlyCalculatePlayerRange=");
        LIZ.append(this.LJI);
        LIZ.append(", pageType=");
        LIZ.append(this.LJII);
        LIZ.append(", bgDrawable=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJFF.hashCode() + JBR.LIZJ(this.LJ, C79062V1e.LJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31), 31), 31)) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (this.LJII.hashCode() + ((hashCode2 + i) * 31)) * 31;
        Drawable drawable = this.LJIIIIZZ;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return hashCode3 + hashCode;
    }

    public /* synthetic */ C76665U6z(Context context, int i, long j, String str, long j2, U8M u8m, boolean z, EnumC76124TuC enumC76124TuC) {
        this(context, i, j, str, j2, u8m, z, enumC76124TuC, null);
    }

    public C76665U6z(Context context, int i, long j, String str, long j2, U8M provider, boolean z, EnumC76124TuC pageType, Drawable drawable) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(provider, "provider");
        o.LJIIIZ(pageType, "pageType");
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = j2;
        this.LJFF = provider;
        this.LJI = z;
        this.LJII = pageType;
        this.LJIIIIZZ = drawable;
    }
}
