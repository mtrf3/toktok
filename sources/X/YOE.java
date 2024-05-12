package X;

import com.ss.android.vesdk.VEEditor;

/* loaded from: classes16.dex */
public class YOE implements X0P {
    public final /* synthetic */ VEEditor LIZ;

    public YOE(VEEditor vEEditor) {
        this.LIZ = vEEditor;
    }

    @Override // X.X0P
    public final void LIZ(int i, int i2, float f, String str) {
        HandlerC169726lM handlerC169726lM;
        this.LIZ.LJJIIJ();
        InterfaceC133905Ni interfaceC133905Ni = this.LIZ.LJLLLLLL;
        if (interfaceC133905Ni != null) {
            interfaceC133905Ni.LIZ(i, i2, f, str);
        }
        if (this.LIZ.LJLLI != null && (handlerC169726lM = this.LIZ.LJLJLLL) != null) {
            handlerC169726lM.post(new YOK(this, i, i2, f, str));
        }
    }
}
