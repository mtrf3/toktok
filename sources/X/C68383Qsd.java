package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Qsd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68383Qsd extends AbstractC68391Qsl {
    public C68383Qsd() {
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.ASSIGN);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.CONST);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.CREATE_ARRAY);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.CREATE_OBJECT);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.EXPRESSION_LIST);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.GET);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.GET_INDEX);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.GET_PROPERTY);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.NULL);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.SET_PROPERTY);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.TYPEOF);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.UNDEFINED);
        ((ArrayList) this.LIZ).add(EnumC68385Qsf.VAR);
    }

    @Override // X.AbstractC68391Qsl
    public final InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list) {
        String str2;
        int ordinal = C68368QsO.LJ(str).ordinal();
        int i = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal != 24) {
                    if (ordinal != 33) {
                        if (ordinal != 49) {
                            if (ordinal != 58) {
                                if (ordinal != 17) {
                                    if (ordinal != 18) {
                                        if (ordinal != 35 && ordinal != 36) {
                                            switch (ordinal) {
                                                case BaseNotice.CREATOR /* 62 */:
                                                    InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.TYPEOF, 1, list, list, 0));
                                                    if (LIZIZ instanceof C68371QsR) {
                                                        str2 = "undefined";
                                                    } else if (LIZIZ instanceof C68365QsL) {
                                                        str2 = "boolean";
                                                    } else if (LIZIZ instanceof C68366QsM) {
                                                        str2 = "number";
                                                    } else if (LIZIZ instanceof C68376QsW) {
                                                        str2 = "string";
                                                    } else if (LIZIZ instanceof C68378QsY) {
                                                        str2 = "function";
                                                    } else if (!(LIZIZ instanceof C68392Qsm) && !(LIZIZ instanceof C68381Qsb)) {
                                                        str2 = "object";
                                                    } else {
                                                        throw new IllegalArgumentException(C16880lQ.LLLZ("Unsupported value type %s in typeof", new Object[]{LIZIZ}));
                                                    }
                                                    return new C68376QsW(str2);
                                                case 63:
                                                    C68368QsO.LJII(0, EnumC68385Qsf.UNDEFINED.name(), list);
                                                    return InterfaceC68379QsZ.LJIIJ;
                                                case 64:
                                                    C68368QsO.LJIIIIZZ(1, EnumC68385Qsf.VAR.name(), list);
                                                    Iterator it = ((ArrayList) list).iterator();
                                                    while (it.hasNext()) {
                                                        InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) it.next());
                                                        if (LIZIZ2 instanceof C68376QsW) {
                                                            c68377QsX.LJ(LIZIZ2.LJII(), InterfaceC68379QsZ.LJIIJ);
                                                        } else {
                                                            throw new IllegalArgumentException(C16880lQ.LLLZ("Expected string for var name. got %s", new Object[]{C16880lQ.LJLLILLLL(LIZIZ2.getClass())}));
                                                        }
                                                    }
                                                    return InterfaceC68379QsZ.LJIIJ;
                                                default:
                                                    LIZIZ(str);
                                                    throw null;
                                            }
                                        }
                                        InterfaceC68379QsZ LIZIZ3 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.GET_PROPERTY, 2, list, list, 0));
                                        InterfaceC68379QsZ LIZIZ4 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                                        if ((LIZIZ3 instanceof C68375QsV) && C68368QsO.LJIIJ(LIZIZ4)) {
                                            return ((C68375QsV) LIZIZ3).LJIIZILJ(LIZIZ4.LJI().intValue());
                                        }
                                        if (LIZIZ3 instanceof InterfaceC68406Qt0) {
                                            return ((InterfaceC68406Qt0) LIZIZ3).LJIIIZ(LIZIZ4.LJII());
                                        }
                                        if (LIZIZ3 instanceof C68376QsW) {
                                            if ("length".equals(LIZIZ4.LJII())) {
                                                return new C68366QsM(Double.valueOf(LIZIZ3.LJII().length()));
                                            }
                                            if (C68368QsO.LJIIJ(LIZIZ4) && LIZIZ4.LJI().doubleValue() < LIZIZ3.LJII().length()) {
                                                return new C68376QsW(String.valueOf(LIZIZ3.LJII().charAt(LIZIZ4.LJI().intValue())));
                                            }
                                        }
                                        return InterfaceC68379QsZ.LJIIJ;
                                    }
                                    ArrayList arrayList = (ArrayList) list;
                                    if (arrayList.isEmpty()) {
                                        return new C68363QsJ();
                                    }
                                    if (arrayList.size() % 2 == 0) {
                                        C68363QsJ c68363QsJ = new C68363QsJ();
                                        while (i < arrayList.size() - 1) {
                                            InterfaceC68379QsZ LIZIZ5 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(arrayList, i));
                                            InterfaceC68379QsZ LIZIZ6 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(arrayList, i + 1));
                                            if (!(LIZIZ5 instanceof C68381Qsb) && !(LIZIZ6 instanceof C68381Qsb)) {
                                                c68363QsJ.LJIIIIZZ(LIZIZ5.LJII(), LIZIZ6);
                                                i += 2;
                                            } else {
                                                throw new IllegalStateException("Failed to evaluate map entry");
                                            }
                                        }
                                        return c68363QsJ;
                                    }
                                    throw new IllegalArgumentException(C16880lQ.LLLZ("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
                                }
                                ArrayList arrayList2 = (ArrayList) list;
                                if (arrayList2.isEmpty()) {
                                    return new C68375QsV();
                                }
                                C68375QsV c68375QsV = new C68375QsV();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC68379QsZ LIZIZ7 = c68377QsX.LIZIZ((InterfaceC68379QsZ) it2.next());
                                    if (!(LIZIZ7 instanceof C68381Qsb)) {
                                        c68375QsV.LJJIFFI(i, LIZIZ7);
                                        i++;
                                    } else {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                }
                                return c68375QsV;
                            }
                            InterfaceC68379QsZ LIZIZ8 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.SET_PROPERTY, 3, list, list, 0));
                            InterfaceC68379QsZ LIZIZ9 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                            InterfaceC68379QsZ LIZIZ10 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2));
                            if (LIZIZ8 != InterfaceC68379QsZ.LJIIJ && LIZIZ8 != InterfaceC68379QsZ.LJIIJJI) {
                                if ((LIZIZ8 instanceof C68375QsV) && (LIZIZ9 instanceof C68366QsM)) {
                                    ((C68375QsV) LIZIZ8).LJJIFFI(LIZIZ9.LJI().intValue(), LIZIZ10);
                                } else if (LIZIZ8 instanceof InterfaceC68406Qt0) {
                                    ((InterfaceC68406Qt0) LIZIZ8).LJIIIIZZ(LIZIZ9.LJII(), LIZIZ10);
                                }
                                return LIZIZ10;
                            }
                            throw new IllegalStateException(C16880lQ.LLLZ("Can't set property %s of %s", new Object[]{LIZIZ9.LJII(), LIZIZ8.LJII()}));
                        }
                        C68368QsO.LJII(0, EnumC68385Qsf.NULL.name(), list);
                        return InterfaceC68379QsZ.LJIIJJI;
                    }
                    InterfaceC68379QsZ LIZIZ11 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.GET, 1, list, list, 0));
                    if (LIZIZ11 instanceof C68376QsW) {
                        return c68377QsX.LIZLLL(LIZIZ11.LJII());
                    }
                    throw new IllegalArgumentException(C16880lQ.LLLZ("Expected string for get var. got %s", new Object[]{C16880lQ.LJLLILLLL(LIZIZ11.getClass())}));
                }
                C68368QsO.LJIIIIZZ(1, EnumC68385Qsf.EXPRESSION_LIST.name(), list);
                InterfaceC68379QsZ interfaceC68379QsZ = InterfaceC68379QsZ.LJIIJ;
                while (i < ((ArrayList) list).size()) {
                    interfaceC68379QsZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, i));
                    if (!(interfaceC68379QsZ instanceof C68381Qsb)) {
                        i++;
                    } else {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                }
                return interfaceC68379QsZ;
            }
            C68368QsO.LJIIIIZZ(2, EnumC68385Qsf.CONST.name(), list);
            ArrayList arrayList3 = (ArrayList) list;
            if (arrayList3.size() % 2 == 0) {
                for (int i2 = 0; i2 < arrayList3.size() - 1; i2 += 2) {
                    InterfaceC68379QsZ LIZIZ12 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, i2));
                    if (LIZIZ12 instanceof C68376QsW) {
                        String LJII = LIZIZ12.LJII();
                        c68377QsX.LJ(LJII, c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, i2 + 1)));
                        ((HashMap) c68377QsX.LIZLLL).put(LJII, Boolean.TRUE);
                    } else {
                        throw new IllegalArgumentException(C16880lQ.LLLZ("Expected string for const name. got %s", new Object[]{C16880lQ.LJLLILLLL(LIZIZ12.getClass())}));
                    }
                }
                return InterfaceC68379QsZ.LJIIJ;
            }
            throw new IllegalArgumentException(C16880lQ.LLLZ("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList3.size())}));
        }
        InterfaceC68379QsZ LIZIZ13 = c68377QsX.LIZIZ((InterfaceC68379QsZ) E2C.LIZIZ(EnumC68385Qsf.ASSIGN, 2, list, list, 0));
        if (LIZIZ13 instanceof C68376QsW) {
            if (c68377QsX.LJI(LIZIZ13.LJII())) {
                InterfaceC68379QsZ LIZIZ14 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                c68377QsX.LJFF(LIZIZ13.LJII(), LIZIZ14);
                return LIZIZ14;
            }
            throw new IllegalArgumentException(C16880lQ.LLLZ("Attempting to assign undefined value %s", new Object[]{LIZIZ13.LJII()}));
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Expected string for assign var. got %s", new Object[]{C16880lQ.LJLLILLLL(LIZIZ13.getClass())}));
    }
}
