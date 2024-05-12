package X;

import com.ss.android.ugc.aweme.search.widget.ISearchWidgetService;
import com.ss.android.ugc.aweme.search.widget.core.communicate.SearchWidgetServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.LsX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55637LsX extends AbstractC65781Prl implements InterfaceC88472Yns<C8V6, C76800UCe> {
    public static final C55637LsX LJLIL = new C55637LsX();

    public C55637LsX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V6 c8v6) {
        ISearchWidgetService iSearchWidgetService;
        C8V6 assem = c8v6;
        o.LJIIIZ(assem, "$this$assem");
        Object LIZ = C58096Mr6.LIZ(ISearchWidgetService.class, false);
        if (LIZ != null) {
            iSearchWidgetService = (ISearchWidgetService) LIZ;
        } else {
            if (C58096Mr6.L4 == null) {
                synchronized (ISearchWidgetService.class) {
                    if (C58096Mr6.L4 == null) {
                        C58096Mr6.L4 = new SearchWidgetServiceImpl();
                    }
                }
            }
            iSearchWidgetService = C58096Mr6.L4;
        }
        assem.LJFF = iSearchWidgetService.LIZ();
        return C76800UCe.LIZ;
    }
}
