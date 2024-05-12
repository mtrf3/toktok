package X;

import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.Xsx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86239Xsx implements InterfaceC61118Nyk {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ C86230Xso LIZIZ;

    public C86239Xsx(AqS165S0100000_15 aqS165S0100000_15, C86230Xso c86230Xso) {
        this.LIZ = aqS165S0100000_15;
        this.LIZIZ = c86230Xso;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] iArr, String[] strArr) {
        if (iArr[0] == 0) {
            this.LIZ.invoke();
        } else {
            this.LIZIZ.LIZIZ.LIZ(-6, "Permission not granted");
        }
    }
}
