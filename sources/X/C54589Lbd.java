package X;

import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lbd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54589Lbd extends F9E implements InterfaceC87283bg {
    public final List<PoiCategory> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C54589Lbd(List<PoiCategory> poiCategoryList) {
        o.LJIIIZ(poiCategoryList, "poiCategoryList");
        this.LJLIL = poiCategoryList;
    }
}
