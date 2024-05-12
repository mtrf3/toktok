package X;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58632Mzk extends AbstractViewOnTouchListenerC59781NdB {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC59781NdB
    public final void LIZ(boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        this.LJLLILLLL.invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58632Mzk(Context context, InterfaceC88472Yns interfaceC88472Yns) {
        super(context);
        this.LJLLILLLL = interfaceC88472Yns;
        o.LJIIIIZZ(context, "context");
    }
}
