package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.adU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94220adU extends F9E {
    public final long LJLIL;
    public String LJLILLLLZI;
    public final String LJLJI;
    public final EnumC93711aVH LJLJJI;
    public final String LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final List<EnumC93710aVG> LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Boolean.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL), this.LJLJLJ};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C94220adU(long j, String str, String str2, EnumC93711aVH type, String str3, boolean z, boolean z2, List<? extends EnumC93710aVG> list) {
        o.LJIIIZ(type, "type");
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = type;
        this.LJLJJL = str3;
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJLJ = list;
    }
}
