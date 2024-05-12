package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.filter.component.cell.FilterContentRootComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.92L, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C92L extends AbstractC65781Prl implements InterfaceC88471Ynr<FilterContentRootComponent, C43I<? extends String>, C76800UCe> {
    public static final C92L LJLIL = new C92L();

    public C92L() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FilterContentRootComponent filterContentRootComponent, C43I<? extends String> c43i) {
        Object obj;
        DataCenter dataCenter;
        FilterContentRootComponent selectSubscribe = filterContentRootComponent;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
        if (c43i2 != null) {
            obj = c43i2.LIZ;
        } else {
            obj = null;
        }
        if (o.LJ(aid, obj) && (dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).dataCenter) != null) {
            dataCenter.jv0("", "title_view_click");
        }
        return C76800UCe.LIZ;
    }
}
