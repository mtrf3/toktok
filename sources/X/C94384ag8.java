package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ag8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94384ag8 extends F9E {
    public final String LJLIL;
    public final EnumC94003aZz LJLILLLLZI;
    public final List<C94383ag7> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C94384ag8(String category, EnumC94003aZz type, List<C94383ag7> list) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(type, "type");
        this.LJLIL = category;
        this.LJLILLLLZI = type;
        this.LJLJI = list;
    }
}
