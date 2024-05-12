package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.I8n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC46129I8n implements View.OnClickListener {
    public final /* synthetic */ C46127I8l LJLIL;
    public final /* synthetic */ C164106cI LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public ViewOnClickListenerC46129I8n(C46127I8l c46127I8l, C164106cI c164106cI, boolean z) {
        this.LJLIL = c46127I8l;
        this.LJLILLLLZI = c164106cI;
        this.LJLJI = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        V92 hierarchy;
        I0N i0n = this.LJLIL.LJLIL;
        if (i0n != null) {
            C82398WVm.LIZ(i0n);
        }
        if (C53558L0g.LIZ()) {
            I0N i0n2 = this.LJLIL.LJLIL;
            if (i0n2 == null || C82398WVm.LIZJ(i0n2) == null) {
                C164106cI c164106cI = this.LJLILLLLZI;
                if (c164106cI != null) {
                    c164106cI.setActualImageResource(R.drawable.b49);
                }
                C164106cI c164106cI2 = this.LJLILLLLZI;
                if (c164106cI2 != null && (hierarchy = c164106cI2.getHierarchy()) != null) {
                    hierarchy.LJIJ(R.drawable.b49);
                }
                I0N i0n3 = this.LJLIL.LJLIL;
                if (i0n3 != null) {
                    i0n3.Sl(false, false);
                }
            } else {
                this.LJLIL.LJLIL.Sl(true, false);
            }
        } else {
            I0N i0n4 = this.LJLIL.LJLIL;
            if (i0n4 != null) {
                i0n4.Sl(false, false);
            }
        }
        if (this.LJLJI) {
            this.LJLIL.LJLILLLLZI.invoke(new C46032I4u("click_delete_prop", "special_icon", 12));
            return;
        }
        C46127I8l c46127I8l = this.LJLIL;
        if (c46127I8l.LJLJL) {
            c46127I8l.LJLILLLLZI.invoke(new C46032I4u("click_delete_prop", "music_recommend", c46127I8l.LJLL, c46127I8l.LJLJLLL));
            return;
        }
        if (c46127I8l.LJLJLJ) {
            InterfaceC46131I8p interfaceC46131I8p = (InterfaceC46131I8p) c46127I8l.LJLJJI.LJIIIIZZ(null, InterfaceC46131I8p.class);
            if (interfaceC46131I8p == null) {
                return;
            }
            interfaceC46131I8p.ZW();
            return;
        }
        c46127I8l.LJLILLLLZI.invoke(new C46032I4u("click_delete_prop", null, 14));
    }
}
