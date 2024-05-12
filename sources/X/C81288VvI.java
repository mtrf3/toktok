package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;

/* renamed from: X.VvI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81288VvI extends F9E {
    public final List<C81287VvH> LJLIL;
    public final List<OSZ<EffectCategoryModel, List<C81287VvH>>> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C81288VvI(List<C81287VvH> list, List<? extends OSZ<EffectCategoryModel, ? extends List<C81287VvH>>> list2) {
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
    }
}
