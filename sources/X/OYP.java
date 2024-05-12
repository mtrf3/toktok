package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OYP extends C62224ObU {
    public final String LIZLLL;
    public final String LJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OYP(String url, String str, String str2) {
        super(url, str);
        o.LJIIIZ(url, "url");
        this.LIZLLL = url;
        this.LJ = str2;
    }

    public /* synthetic */ OYP(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }
}
