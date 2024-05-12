package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.583, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass583 implements InterfaceC134705Qk {
    public final Context LJLIL;
    public View LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxIconView LJLJJI;
    public C52Q LJLJJL;

    @Override // X.InterfaceC134705Qk
    public final void LLLLLLZZ(float f, boolean z) {
    }

    @Override // X.InterfaceC134705Qk
    public final void onDestroy() {
    }

    @Override // X.InterfaceC134705Qk
    public final void onHide() {
    }

    @Override // X.InterfaceC134705Qk
    public final void onCreate() {
        TuxIconView tuxIconView;
        Object LLILL = C16880lQ.LLILL(this.LJLIL, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        TuxIconView tuxIconView2 = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.asz, (LayoutInflater) LLILL, null);
        this.LJLILLLLZI = LLLZIIL;
        if (LLLZIIL != null) {
            tuxIconView = (TuxIconView) LLLZIIL.findViewById(R.id.f3g);
        } else {
            tuxIconView = null;
        }
        this.LJLJI = tuxIconView;
        View view = this.LJLILLLLZI;
        if (view != null) {
            tuxIconView2 = (TuxIconView) view.findViewById(R.id.f3h);
        }
        this.LJLJJI = tuxIconView2;
        TuxIconView tuxIconView3 = this.LJLJI;
        if (tuxIconView3 != null) {
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS22S0100000_2(this, 127));
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 128), view2);
        }
    }

    @Override // X.InterfaceC134705Qk
    public final View getView() {
        return this.LJLILLLLZI;
    }

    public AnonymousClass583(ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZ(DialogC134805Qu dialogC134805Qu) {
        this.LJLJJL = dialogC134805Qu;
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZIL(Animation animation, boolean z) {
        int i;
        View view = this.LJLILLLLZI;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZL(boolean z, boolean z2) {
        TuxIconView tuxIconView;
        int i;
        if (z2 || (tuxIconView = this.LJLJJI) == null) {
            return;
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        tuxIconView.setVisibility(i);
    }
}
