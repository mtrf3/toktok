package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4xS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126264xS extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final EnumC123874tb LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Integer.valueOf(this.LJLJJL), this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL};
    }

    public C126264xS(boolean z, String resourceFile, EnumC123874tb resourceType, String str, int i, String str2, String str3, String str4, String samiSnrFilePath) {
        o.LJIIIZ(resourceFile, "resourceFile");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(samiSnrFilePath, "samiSnrFilePath");
        this.LJLIL = z;
        this.LJLILLLLZI = resourceFile;
        this.LJLJI = resourceType;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = "";
        this.LJLJL = str2;
        this.LJLJLJ = str3;
        this.LJLJLLL = str4;
        this.LJLL = samiSnrFilePath;
    }
}
