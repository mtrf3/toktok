package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.detail.filter.component.cell.FilterContentMaskComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.9ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242019ef extends AbstractC65781Prl implements InterfaceC88471Ynr<FilterContentMaskComponent, KPB, C76800UCe> {
    public static final C242019ef LJLIL = new C242019ef();

    public C242019ef() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FilterContentMaskComponent filterContentMaskComponent, KPB it) {
        boolean z;
        FilterContentMaskComponent selectSubscribe = filterContentMaskComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        View Y3 = selectSubscribe.Y3();
        if (it == KPB.OPENED) {
            z = true;
        } else {
            z = false;
        }
        Y3.setClickable(z);
        return C76800UCe.LIZ;
    }
}
