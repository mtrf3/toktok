package X;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import kotlin.jvm.internal.o;

/* renamed from: X.aA7, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92399aA7 extends AbstractC65781Prl implements InterfaceC88472Yns<NavBackStackEntry, C76800UCe> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ C91706Zyw LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ ORV<NavBackStackEntryState> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92399aA7(C34K c34k, C34K c34k2, C91706Zyw c91706Zyw, boolean z, ORV<NavBackStackEntryState> orv) {
        super(1);
        this.LJLIL = c34k;
        this.LJLILLLLZI = c34k2;
        this.LJLJI = c91706Zyw;
        this.LJLJJI = z;
        this.LJLJJL = orv;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(NavBackStackEntry navBackStackEntry) {
        NavBackStackEntry entry = navBackStackEntry;
        o.LJIIIZ(entry, "entry");
        this.LJLIL.element = true;
        this.LJLILLLLZI.element = true;
        this.LJLJI.LJIIZILJ(entry, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
