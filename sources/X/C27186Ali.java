package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ali, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27186Ali extends F9E implements InterfaceC27624Asm {
    public final List<Specification> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.InterfaceC27624Asm
    public final String getStyle() {
        return "specification";
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLILLLLZI;
    }

    public C27186Ali(List<Specification> specifications) {
        o.LJIIIZ(specifications, "specifications");
        this.LJLIL = specifications;
        this.LJLILLLLZI = EnumC27721AuL.DESCRIPTION.getValue();
    }
}
