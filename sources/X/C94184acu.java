package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.acu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94184acu implements InterfaceC93636aU4 {
    public final /* synthetic */ PrefabPanelFragment LIZ;
    public final /* synthetic */ List LIZIZ;

    public C94184acu(PrefabPanelFragment prefabPanelFragment, List list) {
        this.LIZ = prefabPanelFragment;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC93636aU4
    public final void LIZ(C93633aU1 c93633aU1, int i) {
        PrefabPanelFragment prefabPanelFragment = this.LIZ;
        String str = (String) ListProtector.get(this.LIZIZ, i);
        View tabView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(prefabPanelFragment.requireContext()), R.layout.dvs, null, false);
        o.LJIIIIZZ(tabView, "tabView");
        View findViewById = tabView.findViewById(R.id.npj);
        if (findViewById != null) {
            ((TextView) findViewById).setText(str);
            c93633aU1.LIZLLL = tabView;
            C93634aU2 c93634aU2 = c93633aU1.LJI;
            if (c93634aU2 != null) {
                c93634aU2.LIZ();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }
}
