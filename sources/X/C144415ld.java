package X;

import Y.ACListenerS22S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144415ld extends AbstractC56012Ht<C144315lT, C144365lY> {
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5lc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C144315lT) obj).LJLILLLLZI);
            }
        }, null, new AqS168S0100000_2(this, 215), 2, null);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 47), requireViewById(R.id.aes));
        C16880lQ.LJIIJ(new AbstractViewOnClickListenerC81978WFi() { // from class: X.5le
            {
                super(0, 3);
            }

            @Override // X.AbstractViewOnClickListenerC81978WFi
            public final void LIZ(View v) {
                o.LJIIIZ(v, "v");
                C144415ld.this.getUiActions().LJLILLLLZI.invoke();
            }
        }, requireViewById(R.id.h0v));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.iv, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
