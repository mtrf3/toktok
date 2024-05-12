package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XHB extends AbstractC65781Prl implements InterfaceC88471Ynr<XH8, XHD, XH8> {
    public static final XHB LJLIL = new XHB();

    public XHB() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final XH8 invoke(XH8 xh8, XHD xhd) {
        XH8 acc = xh8;
        XHD element = xhd;
        o.LJIIIZ(acc, "acc");
        o.LJIIIZ(element, "element");
        XH8 LIZLLL = acc.LIZLLL(element.getKey());
        if (LIZLLL == XHC.LIZIZ) {
            return element;
        }
        return new XH9(element, LIZLLL);
    }
}
