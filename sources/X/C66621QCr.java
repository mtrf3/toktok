package X;

import java.util.ArrayList;

/* renamed from: X.QCr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66621QCr implements InterfaceC61858OPm, Cloneable {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC61858OPm
    public final InterfaceC65160Phk[] getElements() {
        InterfaceC49552Jca[] interfaceC49552JcaArr;
        String str;
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            C66622QCs c66622QCs = new C66622QCs(str2.length());
            c66622QCs.LIZIZ(str2);
            C66624QCu c66624QCu = new C66624QCu(str2.length());
            ArrayList arrayList = new ArrayList();
            while (c66624QCu.LIZIZ < c66624QCu.LIZ) {
                C66619QCp LIZ = C66623QCt.LIZ(c66622QCs, c66624QCu);
                int i = c66624QCu.LIZIZ;
                int i2 = c66624QCu.LIZ;
                if (i < i2) {
                    if (c66622QCs.LIZ[i - 1] != ',') {
                        while (i < i2 && C62814Ol0.LJJI(c66622QCs.LIZ[i])) {
                            i++;
                        }
                        c66624QCu.LIZ(i);
                        if (c66624QCu.LIZIZ >= c66624QCu.LIZ) {
                            interfaceC49552JcaArr = new InterfaceC49552Jca[0];
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            while (c66624QCu.LIZIZ < c66624QCu.LIZ) {
                                arrayList2.add(C66623QCt.LIZ(c66622QCs, c66624QCu));
                                if (c66622QCs.LIZ[c66624QCu.LIZIZ - 1] == ',') {
                                    break;
                                }
                            }
                            interfaceC49552JcaArr = (InterfaceC49552Jca[]) arrayList2.toArray(new InterfaceC49552Jca[arrayList2.size()]);
                        }
                        str = LIZ.LJLIL;
                        String str3 = LIZ.LJLILLLLZI;
                        C66620QCq c66620QCq = new C66620QCq(str, str3, interfaceC49552JcaArr);
                        if (str.length() == 0 || str3 != null) {
                            arrayList.add(c66620QCq);
                        }
                    }
                }
                interfaceC49552JcaArr = null;
                str = LIZ.LJLIL;
                String str32 = LIZ.LJLILLLLZI;
                C66620QCq c66620QCq2 = new C66620QCq(str, str32, interfaceC49552JcaArr);
                if (str.length() == 0) {
                }
                arrayList.add(c66620QCq2);
            }
            return (InterfaceC65160Phk[]) arrayList.toArray(new InterfaceC65160Phk[arrayList.size()]);
        }
        return new InterfaceC65160Phk[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C66622QCs c66622QCs;
        if (this instanceof InterfaceC66625QCv) {
            c66622QCs = ((InterfaceC66625QCv) this).LIZ();
        } else {
            c66622QCs = new C66622QCs(64);
            String name = getName();
            String value = getValue();
            int length = name.length() + 2;
            if (value != null) {
                length += value.length();
            }
            int length2 = c66622QCs.LIZ.length;
            int i = c66622QCs.LIZIZ;
            if (length > length2 - i) {
                c66622QCs.LIZJ(i + length);
            }
            c66622QCs.LIZIZ(name);
            c66622QCs.LIZIZ(": ");
            if (value != null) {
                c66622QCs.LIZIZ(value);
            }
        }
        return c66622QCs.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC61858OPm
    public final String getName() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC61858OPm
    public final String getValue() {
        return this.LJLILLLLZI;
    }

    public C66621QCr(String str, String str2) {
        if (str != null) {
            this.LJLIL = str;
            this.LJLILLLLZI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
