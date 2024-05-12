package X;

import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.WJr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82091WJr extends F9E {
    public final InterfaceC88472Yns<C82035WHn, C76800UCe> LJLIL;
    public final InterfaceC88472Yns<C82028WHg, C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final InterfaceC88472Yns<C6MP, C76800UCe> LJLJL;
    public final InterfaceC88472Yns<C1537261o, C76800UCe> LJLJLJ;

    public C82091WJr() {
        throw null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ};
    }

    public C82091WJr(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, AqS168S0100000_2 aqS168S0100000_2, InterfaceC65784Pro dismissText, InterfaceC88472Yns clickDeleteIcon, InterfaceC88472Yns registerActionWithView, int i) {
        C82094WJu onTouchOutSide;
        if ((i & 4) != 0) {
            onTouchOutSide = C82094WJu.LJLIL;
        } else {
            onTouchOutSide = null;
        }
        C34406Des showMoreScene = (i & 8) != 0 ? C34406Des.LJLIL : null;
        InterfaceC88472Yns showName = aqS168S0100000_2;
        showName = (i & 16) != 0 ? C34407Det.LJLIL : showName;
        dismissText = (i & 32) != 0 ? C82095WJv.LJLIL : dismissText;
        clickDeleteIcon = (i & 64) != 0 ? C82092WJs.LJLIL : clickDeleteIcon;
        registerActionWithView = (i & 128) != 0 ? C82093WJt.LJLIL : registerActionWithView;
        o.LJIIIZ(onTouchOutSide, "onTouchOutSide");
        o.LJIIIZ(showMoreScene, "showMoreScene");
        o.LJIIIZ(showName, "showName");
        o.LJIIIZ(dismissText, "dismissText");
        o.LJIIIZ(clickDeleteIcon, "clickDeleteIcon");
        o.LJIIIZ(registerActionWithView, "registerActionWithView");
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = interfaceC88472Yns2;
        this.LJLJI = onTouchOutSide;
        this.LJLJJI = showMoreScene;
        this.LJLJJL = showName;
        this.LJLJJLL = dismissText;
        this.LJLJL = clickDeleteIcon;
        this.LJLJLJ = registerActionWithView;
    }
}
