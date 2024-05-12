package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WPh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82237WPh extends F9E {
    public final List<C79155V4t> LJLIL;
    public final List<OSZ<EffectCategoryResponse, List<C79155V4t>>> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82237WPh(List<C79155V4t> filters, List<? extends OSZ<EffectCategoryResponse, ? extends List<C79155V4t>>> filterTable) {
        o.LJIIIZ(filters, "filters");
        o.LJIIIZ(filterTable, "filterTable");
        this.LJLIL = filters;
        this.LJLILLLLZI = filterTable;
    }
}
