package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ArE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27528ArE extends F9E {
    public final List<SaleProp> LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C27528ArE(String str, List props) {
        o.LJIIIZ(props, "props");
        this.LJLIL = props;
        this.LJLILLLLZI = str;
        this.LJLJI = false;
    }
}
