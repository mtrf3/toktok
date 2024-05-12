package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCC extends AbstractC65781Prl implements InterfaceC65784Pro<byte[]> {
    public static final XCC LJLIL = new XCC();

    public XCC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final byte[] invoke() {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initialize-->platformVersion=");
        LIZ.append("760.0.0.160");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("EffectPlatformAES", LIZIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("760.0.0.160");
        LIZ2.append(":android");
        String substring = C09100Xi.LIZ(C78847Ux1.LJJJJJL(C78857UxB.LJJJLZIJ(X1D.LIZIZ(LIZ2)))).substring(8, 24);
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("md5: ");
        LIZ3.append("760.0.0.160");
        LIZ3.append(":android -> ");
        LIZ3.append(substring);
        C12310e3.LIZ("EffectPlatformAES", X1D.LIZIZ(LIZ3));
        return C78857UxB.LJJJLZIJ(substring);
    }
}
