package X;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aAA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92402aAA extends AbstractC65781Prl implements InterfaceC88472Yns<NavBackStackEntry, C76800UCe> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ List<NavBackStackEntry> LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C91706Zyw LJLJJI;
    public final /* synthetic */ Bundle LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92402aAA(C34K c34k, List<NavBackStackEntry> list, C76732zl c76732zl, C91706Zyw c91706Zyw, Bundle bundle) {
        super(1);
        this.LJLIL = c34k;
        this.LJLILLLLZI = list;
        this.LJLJI = c76732zl;
        this.LJLJJI = c91706Zyw;
        this.LJLJJL = bundle;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(NavBackStackEntry navBackStackEntry) {
        List<NavBackStackEntry> list;
        NavBackStackEntry entry = navBackStackEntry;
        o.LJIIIZ(entry, "entry");
        this.LJLIL.element = true;
        int indexOf = this.LJLILLLLZI.indexOf(entry);
        if (indexOf != -1) {
            int i = indexOf + 1;
            list = this.LJLILLLLZI.subList(this.LJLJI.element, i);
            this.LJLJI.element = i;
        } else {
            list = C61878OQg.INSTANCE;
        }
        this.LJLJJI.LIZ(entry.LJLILLLLZI, this.LJLJJL, entry, list);
        return C76800UCe.LIZ;
    }
}
