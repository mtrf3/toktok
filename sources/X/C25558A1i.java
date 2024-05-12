package X;

import com.ss.android.ugc.aweme.compliance.business.hideaccount.HideAccountViewModel;
import kotlin.jvm.internal.AqS5S0002000_4;

/* renamed from: X.A1i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25558A1i<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ HideAccountViewModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C25558A1i(boolean z, HideAccountViewModel hideAccountViewModel, int i) {
        this.LJLIL = z;
        this.LJLILLLLZI = hideAccountViewModel;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        int value;
        if (this.LJLIL) {
            value = EnumC25557A1h.NOT_HIDE.getValue();
        } else {
            value = EnumC25557A1h.HIDE.getValue();
        }
        this.LJLILLLLZI.setState(new AqS5S0002000_4(this.LJLJI, value, 1));
    }
}
