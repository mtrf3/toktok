package X;

/* renamed from: X.WLo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82140WLo implements InterfaceC81994WFy {
    public final /* synthetic */ ViewOnTouchListenerC82139WLn LIZ;

    public C82140WLo(ViewOnTouchListenerC82139WLn viewOnTouchListenerC82139WLn) {
        this.LIZ = viewOnTouchListenerC82139WLn;
    }

    @Override // X.InterfaceC81994WFy
    public final void LIZ(float f) {
        this.LIZ.LJLJJLL.setTimeBubble((int) (f * r2.LJLLI));
    }

    @Override // X.InterfaceC81994WFy
    public final void LIZIZ(float f) {
        ViewOnTouchListenerC82139WLn viewOnTouchListenerC82139WLn = this.LIZ;
        int i = (int) (f * viewOnTouchListenerC82139WLn.LJLLI);
        viewOnTouchListenerC82139WLn.LJLL = i;
        InterfaceC82142WLq interfaceC82142WLq = viewOnTouchListenerC82139WLn.LJLLLLLL;
        if (interfaceC82142WLq != null) {
            ((C82141WLp) interfaceC82142WLq).LIZLLL.LJJIIJ(i);
        }
    }
}
