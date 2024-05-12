package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.ASq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26268ASq extends ASB {
    public final InterfaceC62486Ofi LJLJJI;
    public final AS3 LJLJJL;
    public final InterfaceC26269ASr LJLJJLL;

    @Override // X.ASG
    public final void LIZ(View v) {
        AS3 as3;
        Context context;
        o.LJIIIZ(v, "v");
        if (this.LJLJJI.LJIILLIIL() == EnumC26273ASv.DISLIKEMORE2) {
            InterfaceC26269ASr interfaceC26269ASr = this.LJLJJLL;
            if (interfaceC26269ASr instanceof C26270ASs) {
                ((C26270ASs) interfaceC26269ASr).LJLJI = true;
                AS3 as32 = this.LJLJJL;
                if (as32 != null) {
                    as32.LJI(true);
                }
                as3 = this.LJLJJL;
                if (as3 == null && (context = as3.getContext()) != null) {
                    this.LJLJJI.LJJ(context, this.LJLJJLL.LJ());
                    return;
                }
            }
        }
        AS3 as33 = this.LJLJJL;
        if (as33 != null) {
            as33.dismiss();
        }
        as3 = this.LJLJJL;
        if (as3 == null) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26268ASq(InterfaceC62486Ofi interfaceC62486Ofi, AS3 as3, InterfaceC26269ASr longPressActionsManager) {
        super(longPressActionsManager, as3);
        o.LJIIIZ(longPressActionsManager, "longPressActionsManager");
        this.LJLJJI = interfaceC62486Ofi;
        this.LJLJJL = as3;
        this.LJLJJLL = longPressActionsManager;
    }
}
