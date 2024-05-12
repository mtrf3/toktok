package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* renamed from: X.B2x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28147B2x implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final Context LJLIL;
    public final ButtonAction LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC88472Yns<FetchInfo, C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<ButtonAction, Boolean> LJLJJL;

    public final boolean LIZ() {
        ButtonActionInfo buttonActionInfo;
        String schema;
        ButtonAction buttonAction = this.LJLILLLLZI;
        if (buttonAction != null && (buttonActionInfo = buttonAction.getButtonActionInfo()) != null && (schema = buttonActionInfo.getSchema()) != null && !o.LJJJJJL(schema)) {
            SmartRouter.buildRoute(this.LJLIL, C26867AgZ.LIZ(schema, C51029K0z.LJJIIZI(new OSZ("trackParams", C27739Aud.LJI(C51029K0z.LJJIIZI(new OSZ("previous_page", "order_submit"))))))).open();
            if (C76800UCe.LIZ != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN eventArgs) {
        InterfaceC88472Yns<ButtonAction, Boolean> interfaceC88472Yns;
        Integer buttonActionType;
        FetchInfo fetchInfo;
        kotlin.jvm.internal.o.LJIIIZ(eventArgs, "eventArgs");
        ButtonAction buttonAction = this.LJLILLLLZI;
        if (buttonAction != null && (((interfaceC88472Yns = this.LJLJJL) == null || !interfaceC88472Yns.invoke(buttonAction).booleanValue()) && (buttonActionType = this.LJLILLLLZI.getButtonActionType()) != null)) {
            if (buttonActionType.intValue() == 1) {
                this.LJLJI.invoke();
            } else if (buttonActionType.intValue() == 2) {
                InterfaceC88472Yns<FetchInfo, C76800UCe> interfaceC88472Yns2 = this.LJLJJI;
                if (interfaceC88472Yns2 != null) {
                    ButtonActionInfo buttonActionInfo = this.LJLILLLLZI.getButtonActionInfo();
                    if (buttonActionInfo != null) {
                        fetchInfo = buttonActionInfo.getFetchInfo();
                    } else {
                        fetchInfo = null;
                    }
                    interfaceC88472Yns2.invoke(fetchInfo);
                }
            } else if (buttonActionType.intValue() == 3) {
                LIZ();
            } else if (buttonActionType.intValue() == 4) {
                if (LIZ()) {
                    this.LJLJI.invoke();
                } else {
                    C5S1 c5s1 = new C5S1(this.LJLIL);
                    c5s1.LIZJ(R.string.r_z);
                    c5s1.LJ();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C28147B2x(Context context, ButtonAction buttonAction, InterfaceC65784Pro<C76800UCe> closePage, InterfaceC88472Yns<? super FetchInfo, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super ButtonAction, Boolean> interfaceC88472Yns2) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(closePage, "closePage");
        this.LJLIL = context;
        this.LJLILLLLZI = buttonAction;
        this.LJLJI = closePage;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC88472Yns2;
    }
}
