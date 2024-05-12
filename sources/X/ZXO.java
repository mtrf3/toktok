package X;

import android.view.View;

/* loaded from: classes29.dex */
public final class ZXO implements View.OnClickListener {
    public final /* synthetic */ ZY4 LJLIL;
    public final /* synthetic */ C90583Zgp LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogC90860ZlI dialogC90860ZlI = this.LJLILLLLZI.LJLJJL.LJLJL;
        ZY4 zy4 = this.LJLIL;
        dialogC90860ZlI.LJLLI = zy4;
        zy4.LJIIJJI();
        this.LJLILLLLZI.LJLILLLLZI.setVisibility(4);
        this.LJLILLLLZI.LJLJI.setVisibility(0);
    }

    public ZXO(C90583Zgp c90583Zgp, ZY4 zy4) {
        this.LJLILLLLZI = c90583Zgp;
        this.LJLIL = zy4;
    }
}
