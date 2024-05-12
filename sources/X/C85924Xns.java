package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Xns, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85924Xns extends AbstractC85929Xnx {
    public final PushItem LJLJJLL;
    public DialogC81627W1v LJLJL;
    public boolean LJLJLJ;

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        return new C25859ACx(this.LJLJJLL.display.title, LJIILJJIL(), new ACListenerS34S0100000_14(this, 78), null, false, null, null, null, false, false, null, this.LJLJJLL.display.description, LJIILL(), false, null, null, null, 8376312);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85924Xns(PushItem pushItem) {
        super(pushItem);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJJLL = pushItem;
    }

    @Override // X.AbstractC85929Xnx, X.InterfaceC85949XoH
    public final void LJ(Context context) {
        if (this.LJLJLJ) {
            this.LJLJLJ = false;
            if (!TextUtils.isEmpty(((RBX) HG3.LJIILL()).getCurUser().getEmail())) {
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://webview");
                buildRoute.withParam(UriProtector.parse(C78997UzR.LIZ()));
                buildRoute.open();
            }
        }
    }
}
