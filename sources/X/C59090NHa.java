package X;

import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.NHa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59090NHa extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC56220M4q> {
    public static final C59090NHa LJLIL = new C59090NHa();

    public C59090NHa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC56220M4q invoke() {
        InterfaceC56220M4q routerDepend = MainServiceImpl.createIMainServicebyMonsterPlugin(false).routerDepend();
        o.LJI(routerDepend);
        return routerDepend;
    }
}
