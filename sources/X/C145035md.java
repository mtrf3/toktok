package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145035md extends AbstractC56012Ht<C144955mV, C144985mY> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 304));

    public final C145045me LLJILJIL() {
        return (C145045me) this.LJLIL.getValue();
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5mZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C144955mV) obj).LIZIZ;
            }
        }, null, new AqS168S0100000_2(this, 209), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5ma
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C144955mV) obj).LIZJ;
            }
        }, null, new AqS168S0100000_2(this, 210), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5mb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C144955mV) obj).LIZLLL;
            }
        }, null, new AqS168S0100000_2(this, 211), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBV() { // from class: X.5mc
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C144955mV) obj).LJ;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C144955mV) obj).LJ = (OSZ) obj2;
            }
        }, null, new AqS168S0100000_2(this, 212), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.iu, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
