package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qsg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68386Qsg extends AbstractC68391Qsl {
    public C68386Qsg() {
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.EQUALS);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.GREATER_THAN);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.GREATER_THAN_EQUALS);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.IDENTITY_EQUALS);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.IDENTITY_NOT_EQUALS);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.LESS_THAN);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.LESS_THAN_EQUALS);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.NOT_EQUALS);
    }

    public static boolean LIZJ(InterfaceC68379QsZ interfaceC68379QsZ, InterfaceC68379QsZ interfaceC68379QsZ2) {
        if (interfaceC68379QsZ.getClass().equals(interfaceC68379QsZ2.getClass())) {
            if ((interfaceC68379QsZ instanceof C68371QsR) || (interfaceC68379QsZ instanceof C68367QsN)) {
                return true;
            }
            if (interfaceC68379QsZ instanceof C68366QsM) {
                if (Double.isNaN(interfaceC68379QsZ.LJI().doubleValue()) || Double.isNaN(interfaceC68379QsZ2.LJI().doubleValue()) || interfaceC68379QsZ.LJI().doubleValue() != interfaceC68379QsZ2.LJI().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (interfaceC68379QsZ instanceof C68376QsW) {
                return interfaceC68379QsZ.LJII().equals(interfaceC68379QsZ2.LJII());
            }
            if (interfaceC68379QsZ instanceof C68365QsL) {
                return interfaceC68379QsZ.LIZJ().equals(interfaceC68379QsZ2.LIZJ());
            }
            if (interfaceC68379QsZ != interfaceC68379QsZ2) {
                return false;
            }
            return true;
        }
        if (((interfaceC68379QsZ instanceof C68371QsR) || (interfaceC68379QsZ instanceof C68367QsN)) && ((interfaceC68379QsZ2 instanceof C68371QsR) || (interfaceC68379QsZ2 instanceof C68367QsN))) {
            return true;
        }
        boolean z = interfaceC68379QsZ instanceof C68366QsM;
        if (!z || !(interfaceC68379QsZ2 instanceof C68376QsW)) {
            boolean z2 = interfaceC68379QsZ instanceof C68376QsW;
            if (!z2 || !(interfaceC68379QsZ2 instanceof C68366QsM)) {
                if (interfaceC68379QsZ instanceof C68365QsL) {
                    return LIZJ(new C68366QsM(interfaceC68379QsZ.LJI()), interfaceC68379QsZ2);
                }
                if (interfaceC68379QsZ2 instanceof C68365QsL) {
                    return LIZJ(interfaceC68379QsZ, new C68366QsM(interfaceC68379QsZ2.LJI()));
                }
                if ((!z2 && !z) || !(interfaceC68379QsZ2 instanceof InterfaceC68406Qt0)) {
                    if (!(interfaceC68379QsZ instanceof InterfaceC68406Qt0) || (!(interfaceC68379QsZ2 instanceof C68376QsW) && !(interfaceC68379QsZ2 instanceof C68366QsM))) {
                        return false;
                    }
                    return LIZJ(new C68376QsW(interfaceC68379QsZ.LJII()), interfaceC68379QsZ2);
                }
                return LIZJ(interfaceC68379QsZ, new C68376QsW(interfaceC68379QsZ2.LJII()));
            }
            return LIZJ(new C68366QsM(interfaceC68379QsZ.LJI()), interfaceC68379QsZ2);
        }
        return LIZJ(interfaceC68379QsZ, new C68366QsM(interfaceC68379QsZ2.LJI()));
    }

    public static boolean LIZLLL(InterfaceC68379QsZ interfaceC68379QsZ, InterfaceC68379QsZ interfaceC68379QsZ2) {
        if (interfaceC68379QsZ instanceof InterfaceC68406Qt0) {
            interfaceC68379QsZ = new C68376QsW(interfaceC68379QsZ.LJII());
        }
        if (interfaceC68379QsZ2 instanceof InterfaceC68406Qt0) {
            interfaceC68379QsZ2 = new C68376QsW(interfaceC68379QsZ2.LJII());
        }
        if (!(interfaceC68379QsZ instanceof C68376QsW) || !(interfaceC68379QsZ2 instanceof C68376QsW)) {
            double doubleValue = interfaceC68379QsZ.LJI().doubleValue();
            double doubleValue2 = interfaceC68379QsZ2.LJI().doubleValue();
            if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || (doubleValue2 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && doubleValue2 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) && Double.compare(doubleValue, doubleValue2) < 0)) {
                return true;
            }
            return false;
        }
        if (interfaceC68379QsZ.LJII().compareTo(interfaceC68379QsZ2.LJII()) < 0) {
            return true;
        }
        return false;
    }

    public static boolean LJ(InterfaceC68379QsZ interfaceC68379QsZ, InterfaceC68379QsZ interfaceC68379QsZ2) {
        if (interfaceC68379QsZ instanceof InterfaceC68406Qt0) {
            interfaceC68379QsZ = new C68376QsW(interfaceC68379QsZ.LJII());
        }
        if (interfaceC68379QsZ2 instanceof InterfaceC68406Qt0) {
            interfaceC68379QsZ2 = new C68376QsW(interfaceC68379QsZ2.LJII());
        }
        if (((!(interfaceC68379QsZ instanceof C68376QsW) || !(interfaceC68379QsZ2 instanceof C68376QsW)) && (Double.isNaN(interfaceC68379QsZ.LJI().doubleValue()) || Double.isNaN(interfaceC68379QsZ2.LJI().doubleValue()))) || LIZLLL(interfaceC68379QsZ2, interfaceC68379QsZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    @Override // X.AbstractC68391Qsl
    public final InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list) {
        boolean LIZJ;
        boolean LIZJ2;
        C68368QsO.LJII(2, C68368QsO.LJ(str).name(), list);
        InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
        InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
        int ordinal = C68368QsO.LJ(str).ordinal();
        if (ordinal != 23) {
            if (ordinal != 48) {
                if (ordinal != 42) {
                    if (ordinal == 43) {
                        LIZJ = LJ(LIZIZ, LIZIZ2);
                    } else {
                        switch (ordinal) {
                            case 37:
                                LIZJ = LIZLLL(LIZIZ2, LIZIZ);
                                break;
                            case 38:
                                LIZJ = LJ(LIZIZ2, LIZIZ);
                                break;
                            case 39:
                                LIZJ = C68368QsO.LJIIJJI(LIZIZ, LIZIZ2);
                                break;
                            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                LIZJ2 = C68368QsO.LJIIJJI(LIZIZ, LIZIZ2);
                                break;
                            default:
                                LIZIZ(str);
                                throw null;
                        }
                    }
                } else {
                    LIZJ = LIZLLL(LIZIZ, LIZIZ2);
                }
            } else {
                LIZJ2 = LIZJ(LIZIZ, LIZIZ2);
            }
            LIZJ = !LIZJ2;
        } else {
            LIZJ = LIZJ(LIZIZ, LIZIZ2);
        }
        if (LIZJ) {
            return InterfaceC68379QsZ.LJIILL;
        }
        return InterfaceC68379QsZ.LJIILLIIL;
    }
}
