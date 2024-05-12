package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.XkM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85706XkM<T> implements InterfaceC64592gB {
    public final /* synthetic */ EmailPopUpFragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C85706XkM(EmailPopUpFragment emailPopUpFragment, boolean z) {
        this.LJLIL = emailPopUpFragment;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(this.LJLIL.getString(R.string.hxt));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
        if (this.LJLILLLLZI) {
            a.LJIILIIL().LJI("email_consent");
        }
        TuxSheet tuxSheet = this.LJLIL.LLIIIJ;
        if (tuxSheet != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(this.LJLIL.LLIIII, true);
            tuxSheet.setArguments(bundle);
            TuxSheet tuxSheet2 = this.LJLIL.LLIIIJ;
            if (tuxSheet2 != null) {
                tuxSheet2.dismiss();
                return;
            } else {
                o.LJIJI("sheet");
                throw null;
            }
        }
        o.LJIJI("sheet");
        throw null;
    }
}
