package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6HT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HT extends AbstractC56012Ht<C6HP, C6HL> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 312));

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, (int) C74275TDb.LIZ(64), 0, (int) C74275TDb.LIZ(279));
        getUiActions().LJLILLLLZI.invoke(new C6P6() { // from class: X.6HU
            @Override // X.C6P6, X.C6V2
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return false;
                }
                if (C6HT.this.getSceneContext() == null) {
                    return true;
                }
                float y = motionEvent.getY();
                float LIZ = C74275TDb.LIZ(64);
                o.LJIIIIZZ(C6HT.this.requireSceneContext(), "requireSceneContext()");
                if (y <= LIZ + C63081OpJ.LJJJJLI(r1) || motionEvent.getY() >= C60996Nwm.LJ(C6HT.this.requireSceneContext()) - C74275TDb.LIZ(279)) {
                    return false;
                }
                C6HT.this.getUiActions().LJLIL.invoke();
                return true;
            }
        });
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6HS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C6HP) obj).LJLIL);
            }
        }, null, new AqS168S0100000_2(this, 217), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.iw, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
