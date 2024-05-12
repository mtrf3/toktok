package X;

import android.view.View;

/* renamed from: X.Se1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC72573Se1 implements View.OnClickListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C72571Sdz LJLILLLLZI;
    public final /* synthetic */ InterfaceC72575Se3 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public ViewOnClickListenerC72573Se1(boolean z, C72571Sdz c72571Sdz, InterfaceC72575Se3 interfaceC72575Se3, int i, int i2) {
        this.LJLIL = z;
        this.LJLILLLLZI = c72571Sdz;
        this.LJLJI = interfaceC72575Se3;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLIL) {
            this.LJLILLLLZI.LJLJJL.LJLIL(this.LJLJI, this.LJLJJI);
            return;
        }
        C72571Sdz c72571Sdz = this.LJLILLLLZI;
        c72571Sdz.notifyItemChanged(c72571Sdz.LJLJL.invoke(this.LJLJI).intValue());
        this.LJLILLLLZI.LJLJJL.LJJL(this.LJLJI);
        this.LJLILLLLZI.notifyItemChanged(this.LJLJJL);
    }
}
