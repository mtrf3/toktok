package X;

/* loaded from: classes12.dex */
public final class QZN implements QZ6 {
    public final /* synthetic */ C67824Qjc LIZ;

    public QZN(C67824Qjc c67824Qjc) {
        this.LIZ = c67824Qjc;
    }

    @Override // X.QZ6
    public final void LIZ(boolean z) {
        HandlerC67272Qai handlerC67272Qai = this.LIZ.LJLLL;
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(1, Boolean.valueOf(z)));
    }
}
