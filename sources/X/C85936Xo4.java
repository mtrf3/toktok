package X;

import Y.ACListenerS35S0100000_15;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xo4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85936Xo4 extends C25849ACn {
    public final String LJLJJL;
    public final String LJLJJLL;
    public final InterfaceC58304MuS LJLJL;

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        boolean z;
        String str = this.LJLJJL;
        String str2 = this.LJLJJLL;
        InterfaceC58304MuS interfaceC58304MuS = this.LJLJL;
        if (interfaceC58304MuS != null) {
            z = interfaceC58304MuS.LIZJ();
        } else {
            z = false;
        }
        return new C25848ACm(z, str, new ACListenerS35S0100000_15(this, 213), false, null, null, null, str2, false, false, false, null, 64504);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85936Xo4(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        String string = fragment.getString(R.string.p8d);
        o.LJIIIIZZ(string, "fragment.getString(R.str…art_network_dialog_title)");
        this.LJLJJL = string;
        String string2 = fragment.getString(R.string.p8b);
        o.LJIIIIZZ(string2, "fragment.getString(R.str…t_network_dialog_content)");
        this.LJLJJLL = string2;
        this.LJLJL = C58604MzI.LIZIZ.getSmartNetworkService();
    }
}
