package X;

import android.view.View;

/* renamed from: X.VfE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnClickListenerC80292VfE implements View.OnClickListener {
    public final /* synthetic */ C80290VfC LJLIL;

    public ViewOnClickListenerC80292VfE(C80290VfC c80290VfC) {
        this.LJLIL = c80290VfC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C80286Vf8 c80286Vf8 = (C80286Vf8) view;
        C80288VfA c80288VfA = this.LJLIL.LJLJJL;
        boolean z = true;
        if (c80288VfA != null) {
            c80288VfA.LJLJI = true;
        }
        C281618q itemData = c80286Vf8.getItemData();
        C80290VfC c80290VfC = this.LJLIL;
        boolean LJIILLIIL = c80290VfC.LJLJI.LJIILLIIL(itemData, c80290VfC, 0);
        if (itemData != null && itemData.isCheckable() && LJIILLIIL) {
            this.LJLIL.LJLJJL.LJLZ(itemData);
        } else {
            z = false;
        }
        C80290VfC c80290VfC2 = this.LJLIL;
        C80288VfA c80288VfA2 = c80290VfC2.LJLJJL;
        if (c80288VfA2 != null) {
            c80288VfA2.LJLJI = false;
        }
        if (z) {
            c80290VfC2.LIZJ(false);
        }
    }
}
