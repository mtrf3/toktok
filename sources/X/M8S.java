package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8S extends AbstractC65781Prl implements InterfaceC88472Yns<C4LX<InterfaceC87283bg>, C76800UCe> {
    public final /* synthetic */ TrendingDetailPageFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8S(TrendingDetailPageFragment trendingDetailPageFragment) {
        super(1);
        this.LJLIL = trendingDetailPageFragment;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C4LX<InterfaceC87283bg> c4lx) {
        C4LX<InterfaceC87283bg> hierarchyData = c4lx;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if ((arguments != null && arguments.getBoolean("show_billboard")) || o.LJ(this.LJLIL.LJLJJI.getEnterMethodValue(), "trending_publisher_notification")) {
            z = true;
        }
        hierarchyData.LIZ = new MBK(this.LJLIL.LJLJJI, this.LJLIL.Xl(), z);
        return C76800UCe.LIZ;
    }
}
