package X;

import kotlin.jvm.internal.o;

/* renamed from: X.S2l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71451S2l {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final S32 LJFF;

    public /* synthetic */ C71451S2l(String str, String str2, String str3, String str4, String str5, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (S32) null);
    }

    public C71451S2l(String str, String str2, String price, String str3, String str4, S32 s32) {
        o.LJIIIZ(price, "price");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = price;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = s32;
    }
}
