package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5EQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EQ extends AbstractC56012Ht<C5EA, C5E8> {
    public static final int LJLJJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(30));
    public C59V LJLIL;
    public C5EW LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 591));

    public final float LLJILJIL() {
        return ((Number) this.LJLJI.getValue()).floatValue();
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C1280450u.LIZ()) {
            return;
        }
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5ES
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C5EA) obj).LIZ);
            }
        }, null, new AqS168S0100000_2(this, 344), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5ET
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C5EA) obj).LIZJ;
            }
        }, null, new AqS168S0100000_2(this, 345), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5EU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C5EA) obj).LIZLLL;
            }
        }, null, new AqS168S0100000_2(this, 346), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (!C1280450u.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ash, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        this.LJLIL = (C59V) viewGroup.findViewById(R.id.lj6);
        this.LJLILLLLZI = (C5EW) viewGroup.findViewById(R.id.lj4);
        C59V c59v = this.LJLIL;
        if (c59v != null) {
            c59v.setFrameFetcher(new AqS184S0100000_2(this, 51));
            c59v.LIZLLL(LLJILJIL());
            int i = LJLJJI;
            c59v.setThumbWidth(i);
            c59v.setThumbHeight(i);
            c59v.setHalfDivideWidth(0.0f);
            c59v.setRound(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        }
        C5EW c5ew = this.LJLILLLLZI;
        if (c5ew != null) {
            c5ew.setMinStartMargin(0);
            c5ew.setMaxStartMargin((int) LLJILJIL());
            c5ew.setOnProgressChangedListener(new C5EV() { // from class: X.5ER
                @Override // X.C5EV
                public final void LIZIZ(float f) {
                    C5EQ.this.getUiActions().LIZ.invoke(Long.valueOf(f * ((float) C5EQ.this.getUiStates().LJ.LIZIZ)));
                }
            });
        }
        return viewGroup;
    }
}
