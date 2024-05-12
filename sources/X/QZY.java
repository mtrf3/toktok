package X;

import com.google.firebase.installations.FirebaseInstallationsRegistrar;

/* loaded from: classes12.dex */
public final /* synthetic */ class QZY implements InterfaceC67209QZh {
    @Override // X.InterfaceC67209QZh
    public Object LIZ(QZO qzo) {
        return FirebaseInstallationsRegistrar.LIZ(qzo);
    }

    public static int LIZIZ(InterfaceC88472Yns interfaceC88472Yns, int i, int i2) {
        return (interfaceC88472Yns.hashCode() + i) * i2;
    }

    public static void LIZJ(StringBuilder sb, Integer num, StringBuilder sb2, String str) {
        sb.append(num);
        C0NB.LIZIZ(str, X1D.LIZIZ(sb2));
    }
}
