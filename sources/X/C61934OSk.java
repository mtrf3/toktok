package X;

import Y.AfS6S0100100_10;
import com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel;
import com.ss.android.ugc.aweme.kids.discovery.list.DiscoveryFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.OSk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61934OSk implements InterfaceC61937OSn {
    public final /* synthetic */ DiscoveryFragment LIZ;

    @Override // X.InterfaceC61937OSn
    public final void LJJIJIL() {
        DiscoverViewModel discoverViewModel = this.LIZ.LJLIL;
        if (discoverViewModel != null) {
            long currentTimeMillis = System.currentTimeMillis();
            discoverViewModel.LJLILLLLZI.getCategoryV2List(discoverViewModel.LJLJL, 10, 0).LJJL(T16.LIZ()).LJJJLIIL(new AfS6S0100100_10(discoverViewModel, currentTimeMillis, 0), new AfS6S0100100_10(discoverViewModel, currentTimeMillis, 1));
        } else {
            o.LJIJI("mDiscoverViewModel");
            throw null;
        }
    }

    public C61934OSk(DiscoveryFragment discoveryFragment) {
        this.LIZ = discoveryFragment;
    }
}
