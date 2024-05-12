package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Im9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47597Im9 {
    public static final List<EnumC47599ImB> LIZ;
    public static final List<EnumC47599ImB> LIZIZ;
    public static final List<EnumC47599ImB> LIZJ;

    static {
        EnumC47599ImB enumC47599ImB = EnumC47599ImB.BYTEVC2_SOFTWARE;
        EnumC47599ImB enumC47599ImB2 = EnumC47599ImB.BYTEVC1_HARDWARE;
        EnumC47599ImB enumC47599ImB3 = EnumC47599ImB.BYTEVC1_SOFTWARE;
        EnumC47599ImB enumC47599ImB4 = EnumC47599ImB.H264_HARDWARE;
        EnumC47599ImB enumC47599ImB5 = EnumC47599ImB.H264_SOFTWARE;
        LIZ = Collections.unmodifiableList(Arrays.asList(enumC47599ImB, enumC47599ImB2, enumC47599ImB3, enumC47599ImB4, enumC47599ImB5));
        LIZIZ = Collections.unmodifiableList(Arrays.asList(enumC47599ImB2, enumC47599ImB4, enumC47599ImB, enumC47599ImB3, enumC47599ImB5));
        LIZJ = Collections.unmodifiableList(Arrays.asList(enumC47599ImB5, enumC47599ImB4, enumC47599ImB3, enumC47599ImB2, enumC47599ImB));
    }

    public static List<EnumC47599ImB> LIZJ(InterfaceC47596Im8 interfaceC47596Im8, List<EnumC47599ImB> list) {
        List list2 = null;
        if (interfaceC47596Im8.type() == EnumC47602ImE.VID_PLAY_AUTH_TOKEN_SOURCE) {
            list2 = Collections.unmodifiableList(null);
        }
        ArrayList arrayList = new ArrayList();
        for (EnumC47599ImB enumC47599ImB : list) {
            int[] iArr = C47600ImC.LIZ;
            int i = iArr[enumC47599ImB.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                int i2 = iArr[enumC47599ImB.ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3 && i2 != 4 && i2 != 5) {
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append("unsupported dimension! ");
                                            LIZ2.append(enumC47599ImB);
                                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                                        }
                                    } else {
                                        throw new UnsupportedOperationException("tob only");
                                    }
                                }
                                if (list2 == null || list2.contains(enumC47599ImB.encodeType)) {
                                    arrayList.add(enumC47599ImB);
                                }
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("unsupported dimension! ");
                                LIZ3.append(enumC47599ImB);
                                throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
                            }
                        } else {
                            throw new UnsupportedOperationException("tob only");
                        }
                    } else {
                        throw new UnsupportedOperationException("tob only");
                    }
                } else {
                    throw new UnsupportedOperationException("tob only");
                }
            } else {
                throw new UnsupportedOperationException("tob only");
            }
        }
        return arrayList;
    }

    public static void LIZ(C47601ImD c47601ImD, List list, List list2) {
        if (Collections.unmodifiableList(null).isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC47599ImB enumC47599ImB = (EnumC47599ImB) it.next();
            if (list2 != null) {
                if (!((ArrayList) list2).contains(enumC47599ImB)) {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public static C47594Im6 LIZIZ(C47598ImA c47598ImA, List<EnumC47599ImB> list, List<EnumC47599ImB> list2) {
        for (EnumC47599ImB enumC47599ImB : list) {
            if (list2 == null || !((ArrayList) list2).contains(enumC47599ImB)) {
                return new C47594Im6(c47598ImA, enumC47599ImB);
            }
        }
        return null;
    }
}
