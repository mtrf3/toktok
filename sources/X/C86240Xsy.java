package X;

import kotlin.jvm.internal.AqS162S0200000_15;

/* renamed from: X.Xsy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86240Xsy implements InterfaceC61118Nyk {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ C86229Xsn LIZIZ;

    public C86240Xsy(AqS162S0200000_15 aqS162S0200000_15, C86229Xsn c86229Xsn) {
        this.LIZ = aqS162S0200000_15;
        this.LIZIZ = c86229Xsn;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] iArr, String[] strArr) {
        if (iArr[0] == 0 && iArr[1] == 0) {
            this.LIZ.invoke();
        } else {
            this.LIZIZ.LIZIZ.LIZ(-6, "Permission rejected");
        }
    }
}
