package X;

import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.27K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27K extends AbstractC65781Prl implements InterfaceC88472Yns<C24590xr, InterfaceC24580xq> {
    public final /* synthetic */ C36541c2 LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C25780zm LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ EnumC23500w6 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27K(C36541c2 c36541c2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C25780zm c25780zm, String str, EnumC23500w6 enumC23500w6) {
        super(1);
        this.LJLIL = c36541c2;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = c25780zm;
        this.LJLJJI = str;
        this.LJLJJL = enumC23500w6;
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC24580xq invoke(C24590xr DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        C36541c2 c36541c2 = this.LJLIL;
        WindowManager windowManager = c36541c2.LJLLJ;
        WindowManager.LayoutParams layoutParams = c36541c2.LJLLL;
        C51639KOl.LIZ(new Object[]{c36541c2, layoutParams});
        windowManager.addView(c36541c2, layoutParams);
        this.LJLIL.LJIIJJI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        final C36541c2 c36541c22 = this.LJLIL;
        return new InterfaceC24580xq() { // from class: X.1by
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                C36541c2.this.LIZLLL();
                C36541c2 c36541c23 = C36541c2.this;
                c36541c23.getClass();
                ViewTreeLifecycleOwner.set(c36541c23, null);
                c36541c23.LJLLJ.removeViewImmediate(c36541c23);
            }
        };
    }
}
