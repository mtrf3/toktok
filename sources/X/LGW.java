package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LGW extends AbstractC38911fr {
    public final boolean LJLILLLLZI = true;

    @Override // X.AbstractC38911fr
    public final boolean LJIILLIIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC38911fr
    public final List<AbstractC53895LDf> LJIILJJIL(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(ctx);
        if (LJJIFFI != null) {
            List<InterfaceC54080LKi> pU = HomeTabViewModel.LJLJLLL.LIZ(LJJIFFI).pU();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC54080LKi interfaceC54080LKi : pU) {
                if (interfaceC54080LKi instanceof AbstractC53895LDf) {
                    arrayList.add(interfaceC54080LKi);
                }
            }
            return arrayList;
        }
        "activity is null!".toString();
        throw new IllegalArgumentException("activity is null!");
    }

    @Override // X.AbstractC38911fr
    public final void LJJJ(Context ctx, String tag, Bundle bundle) {
        HomeViewPagerAbility LJJJJIZL;
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(tag, "tag");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(ctx);
        if (LJJIFFI == null) {
            return;
        }
        int qv0 = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).qv0(tag);
        boolean z = bundle.getBoolean("isSmoothScroll", false);
        MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI);
        if (LJJLIIIJJI != null && (LJJJJIZL = C78880UxY.LJJJJIZL(LJJLIIIJJI)) != null) {
            LJJJJIZL.setCurrentItem(qv0, z);
        }
    }
}
