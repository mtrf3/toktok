package X;

import Y.IDObjectS175S0100000_2;
import android.content.Context;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OB extends C6O6 {
    public final ViewGroup LIZIZ;
    public final C6OA LIZJ;
    public final C159366Ng LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OB(ViewGroup viewGroup, C6OA abilityContainer) {
        super(abilityContainer);
        TextWatcher LJIIIZ;
        o.LJIIIZ(abilityContainer, "abilityContainer");
        this.LIZIZ = viewGroup;
        this.LIZJ = abilityContainer;
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parentView.context");
        C159366Ng c159366Ng = new C159366Ng(context);
        c159366Ng.LJIIIZ(abilityContainer.LIZJ, abilityContainer.LIZIZ, abilityContainer.LJFF, new AqS168S0100000_2(this, 438));
        C6OE c6oe = abilityContainer.LIZLLL;
        if (c6oe != null && (LJIIIZ = c6oe.LJIIIZ()) != null) {
            c159366Ng.addTextChangedListener(LJIIIZ);
        }
        this.LIZLLL = c159366Ng;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 729));
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 728));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c159366Ng.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
        viewGroup.addView(c159366Ng, 0, layoutParams);
        C26338AVi.LJI(c159366Ng, 0, Integer.valueOf(((Number) C88517Yob.LJ.getValue()).intValue()), 0, 0, false, 16);
        c159366Ng.addTextChangedListener(new IDObjectS175S0100000_2(this, 9));
        abilityContainer.LIZJ.LIZ(new TBT() { // from class: X.6Nx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getAlign());
            }
        }).LJIIIIZZ(abilityContainer.LIZIZ, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 440));
    }
}
