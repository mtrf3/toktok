package X;

import android.view.View;
import java.util.Locale;
import yq4.a;

/* renamed from: X.XmM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85830XmM implements InterfaceC81219VuB {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C85829XmL LJLILLLLZI;

    @Override // X.InterfaceC81219VuB
    public final void onExit() {
    }

    @Override // X.InterfaceC81219VuB
    public final void onError(String str) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    public C85830XmM(C85829XmL c85829XmL, View view) {
        this.LJLILLLLZI = c85829XmL;
        this.LJLIL = view;
    }

    @Override // X.InterfaceC81219VuB
    public final void onChanged(String str, String str2) {
        C85829XmL c85829XmL = this.LJLILLLLZI;
        if (c85829XmL.LJLJJI != null) {
            String lowerCase = c85829XmL.LJLJJL.toString().toLowerCase(Locale.getDefault());
            String str3 = this.LJLILLLLZI.LJLJJLL[0];
            if (a.LIZIZ().LJFF(1, str, str2, "user_selected") && lowerCase.length() >= str3.length() + 41) {
                this.LJLILLLLZI.LJLJJL.replace(41, str3.length() + 41, (CharSequence) str2);
                C85829XmL c85829XmL2 = this.LJLILLLLZI;
                c85829XmL2.LJLJJI.setText(c85829XmL2.LJLJJL);
                this.LJLILLLLZI.LJLJJLL[0] = str2;
            }
        }
    }
}
