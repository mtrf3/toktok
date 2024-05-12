package X;

import kotlin.jvm.internal.o;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;

/* loaded from: classes14.dex */
public final class UEL extends AbstractC65781Prl implements InterfaceC88472Yns<RealtimeLiveCenterLayoutTab, Boolean> {
    public static final UEL LJLIL = new UEL();

    public UEL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab) {
        RealtimeLiveCenterLayoutTab tab = realtimeLiveCenterLayoutTab;
        o.LJIIIZ(tab, "tab");
        return Boolean.valueOf(o.LJ(tab.layoutName, "punish_records"));
    }
}
