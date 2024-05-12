package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Ps9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65805Ps9 extends AbstractC65781Prl implements InterfaceC88471Ynr<C58045MqH, ButtonAction, Boolean> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65805Ps9(View view, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        super(2);
        this.LJLIL = view;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(C58045MqH c58045MqH, ButtonAction buttonAction) {
        Integer buttonActionType;
        String str;
        ButtonAction buttonAction2 = buttonAction;
        o.LJIIIZ(c58045MqH, "<anonymous parameter 0>");
        if (buttonAction2 != null && (buttonActionType = buttonAction2.getButtonActionType()) != null && buttonActionType.intValue() == 3) {
            ButtonActionInfo buttonActionInfo = buttonAction2.getButtonActionInfo();
            if (buttonActionInfo != null) {
                str = buttonActionInfo.getSchema();
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                Context context = this.LJLIL.getContext();
                o.LJIIIIZZ(context, "view.context");
                C70172RgO.LIZ(context, new AqS158S0200000_11((InterfaceC88472Yns) this.LJLILLLLZI, (InterfaceC88472Yns<? super String, C76800UCe>) buttonAction2, (ButtonAction) 10));
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
