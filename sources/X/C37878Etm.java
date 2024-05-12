package X;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.Etm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37878Etm extends F9E {
    public final Pattern LJLIL;
    public final EnumC38003Evn LJLILLLLZI;
    public final List<String> LJLJI;
    public final List<String> LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C37878Etm(Pattern pattern, EnumC38003Evn access, List<String> list, List<String> list2) {
        o.LJIIJ(access, "access");
        this.LJLIL = pattern;
        this.LJLILLLLZI = access;
        this.LJLJI = list;
        this.LJLJJI = list2;
    }
}
