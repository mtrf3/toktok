package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EWa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36548EWa extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC65350Pko<? extends XBaseModel> LJLJI;
    public final InterfaceC65350Pko<? extends Object> LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final C36561EWn LJLJL;
    public final Class<?> LJLJLJ;
    public final List<String> LJLJLLL;
    public final List<Integer> LJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL};
    }

    public C36548EWa(boolean z, String keyPath, C65776Prg c65776Prg, C65776Prg c65776Prg2, boolean z2, boolean z3, C36561EWn c36561EWn, Class cls, List stringEnum, List intEnum) {
        o.LJIIJ(keyPath, "keyPath");
        o.LJIIJ(stringEnum, "stringEnum");
        o.LJIIJ(intEnum, "intEnum");
        this.LJLIL = z;
        this.LJLILLLLZI = keyPath;
        this.LJLJI = c65776Prg;
        this.LJLJJI = c65776Prg2;
        this.LJLJJL = z2;
        this.LJLJJLL = z3;
        this.LJLJL = c36561EWn;
        this.LJLJLJ = cls;
        this.LJLJLLL = stringEnum;
        this.LJLL = intEnum;
    }
}
