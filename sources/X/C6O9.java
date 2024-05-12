package X;

import Y.ACListenerS22S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6O9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6O9 extends C6O6 {
    public final ViewGroup LIZIZ;
    public final C6OA LIZJ;
    public TuxIconView LIZLLL;
    public TuxIconView LJ;
    public TuxIconView LJFF;
    public final C1NS<TextStickerModel> LJI;
    public InterfaceC82683Wch LJII;
    public boolean LJIIIIZZ;

    public final void LIZIZ(boolean z) {
        TuxIconView tuxIconView = this.LIZLLL;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setClickable(true);
        tuxIconView.setAlpha(1.0f);
        this.LJIIIIZZ = z;
        if (z) {
            tuxIconView.setImageResource(R.drawable.b9m);
        } else {
            tuxIconView.setImageResource(R.drawable.b9n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6O9(ViewGroup viewGroup, C6OA abilityContainer) {
        super(abilityContainer);
        TuxIconView tuxIconView;
        o.LJIIIZ(abilityContainer, "abilityContainer");
        this.LIZIZ = viewGroup;
        this.LIZJ = abilityContainer;
        C1NS<TextStickerModel> c1ns = abilityContainer.LIZJ;
        this.LJI = c1ns;
        if (abilityContainer.LJFF.LJ) {
            TuxIconView tuxIconView2 = (TuxIconView) viewGroup.findViewById(R.id.lt0);
            this.LIZLLL = tuxIconView2;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
        }
        View findViewById = viewGroup.findViewById(R.id.l4s);
        o.LJIIIIZZ(findViewById, "viewContainer.findViewById(R.id.text_mode_icon)");
        this.LJ = (TuxIconView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.a0j);
        o.LJIIIIZZ(findViewById2, "viewContainer.findViewById(R.id.align_icon)");
        this.LJFF = (TuxIconView) findViewById2;
        if (abilityContainer.LJFF.LJ && (tuxIconView = this.LIZLLL) != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS22S0100000_2(this, 104));
        }
        TuxIconView tuxIconView3 = this.LJ;
        if (tuxIconView3 != null) {
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS22S0100000_2(this, 105));
            TuxIconView tuxIconView4 = this.LJFF;
            if (tuxIconView4 != null) {
                C16880lQ.LJJJ(tuxIconView4, new ACListenerS22S0100000_2(this, 106));
                c1ns.LIZ(new TBT() { // from class: X.6Nv
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Integer.valueOf(((TextStickerModel) obj).getMode());
                    }
                }).LJIIIIZZ(abilityContainer.LIZIZ, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 435));
                c1ns.LIZ(new TBT() { // from class: X.6Nw
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Integer.valueOf(((TextStickerModel) obj).getAlign());
                    }
                }).LJIIIIZZ(abilityContainer.LIZIZ, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 436));
                return;
            }
            o.LJIJI("textAlignView");
            throw null;
        }
        o.LJIJI("textModeView");
        throw null;
    }
}
