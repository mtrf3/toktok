package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.ASn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26265ASn extends ASB {
    public final InterfaceC62486Ofi LJLJJI;
    public final C26270ASs LJLJJL;
    public final AS3 LJLJJLL;

    @Override // X.ASG
    public final void LIZ(View v) {
        Context context;
        o.LJIIIZ(v, "v");
        AS3 as3 = this.LJLJJLL;
        if (as3 != null && (context = as3.getContext()) != null) {
            this.LJLJJLL.dismiss();
            C26270ASs c26270ASs = this.LJLJJL;
            c26270ASs.LJLJJI = true;
            this.LJLJJI.LIZLLL(context, c26270ASs.LJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26265ASn(AS3 as3, C26270ASs actionManager, InterfaceC62486Ofi sheetAction) {
        super(actionManager, as3);
        o.LJIIIZ(sheetAction, "sheetAction");
        o.LJIIIZ(actionManager, "actionManager");
        this.LJLJJI = sheetAction;
        this.LJLJJL = actionManager;
        this.LJLJJLL = as3;
    }
}
