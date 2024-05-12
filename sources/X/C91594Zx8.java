package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Zx8, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91594Zx8 extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ InterfaceC91296ZsK LJLILLLLZI;
    public final /* synthetic */ TabChangeManager LJLJI;
    public final /* synthetic */ LLE LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91594Zx8(Context context, InterfaceC91296ZsK interfaceC91296ZsK, TabChangeManager tabChangeManager, LLE lle) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = interfaceC91296ZsK;
        this.LJLJI = tabChangeManager;
        this.LJLJJI = lle;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf it) {
        o.LJIIIZ(it, "it");
        Context context = this.LJLIL;
        if (context instanceof ActivityC45651qj) {
            C91257Zrh.LIZ((Activity) context, !o.LJ(this.LJLILLLLZI.getEventData().LIZLLL, "my_playlist"));
        }
        TabChangeManager tabChangeManager = this.LJLJI;
        if (tabChangeManager != null) {
            tabChangeManager.qv0(this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
