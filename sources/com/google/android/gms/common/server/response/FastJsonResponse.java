package com.google.android.gms.common.server.response;

import X.C03880Dg;
import X.C16880lQ;
import X.C1DI;
import X.C37355ElL;
import X.C39519Ff9;
import X.C64362PNu;
import X.C65300Pk0;
import X.C67306QbG;
import X.C79057V0z;
import X.InterfaceC67309QbJ;
import X.O5Y;
import X.QH7;
import android.os.Parcel;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class FastJsonResponse {

    /* loaded from: classes12.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C67306QbG CREATOR = new C67306QbG();
        public final int LJLIL;
        public final boolean LJLILLLLZI;
        public final int LJLJI;
        public final boolean LJLJJI;
        public final String LJLJJL;
        public final Class<? extends FastJsonResponse> LJLJJLL;
        public final String LJLJL;
        public final int zaf;
        public final int zai;
        public zan zaj;
        public InterfaceC67309QbJ<I, O> zak;

        public final boolean LJJJLIIL() {
            return this.zak != null;
        }

        public final String toString() {
            C64362PNu c64362PNu = new C64362PNu(this);
            c64362PNu.LIZ(Integer.valueOf(this.zai), "versionCode");
            c64362PNu.LIZ(Integer.valueOf(this.LJLIL), "typeIn");
            c64362PNu.LIZ(Boolean.valueOf(this.LJLILLLLZI), "typeInArray");
            c64362PNu.LIZ(Integer.valueOf(this.LJLJI), "typeOut");
            c64362PNu.LIZ(Boolean.valueOf(this.LJLJJI), "typeOutArray");
            c64362PNu.LIZ(this.LJLJJL, "outputFieldName");
            c64362PNu.LIZ(Integer.valueOf(this.zaf), "safeParcelFieldId");
            String str = this.LJLJL;
            if (str == null) {
                str = null;
            }
            c64362PNu.LIZ(str, "concreteTypeName");
            Class<? extends FastJsonResponse> cls = this.LJLJJLL;
            if (cls != null) {
                c64362PNu.LIZ(C16880lQ.LJLLILLLL(cls), "concreteType.class");
            }
            InterfaceC67309QbJ<I, O> interfaceC67309QbJ = this.zak;
            if (interfaceC67309QbJ != null) {
                c64362PNu.LIZ(C16880lQ.LJLLILLLL(interfaceC67309QbJ.getClass()), "converterName");
            }
            return c64362PNu.toString();
        }

        public final I LJJJJZI(O o) {
            QH7.LJIIIIZZ(this.zak);
            return (I) ((StringToIntConverter) this.zak).LJJJJL(o);
        }

        public static Field LJJJJL(int i, String str) {
            return new Field(7, true, 7, true, str, i, null);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int LJLIL = C79057V0z.LJLIL(parcel, 20293);
            C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zai);
            C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.LJLIL);
            C79057V0z.LJJJZ(parcel, 3, this.LJLILLLLZI);
            C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.LJLJI);
            C79057V0z.LJJJZ(parcel, 5, this.LJLJJI);
            C79057V0z.LJJZZIII(parcel, 6, this.LJLJJL, false);
            C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 7, this.zaf);
            String str = this.LJLJL;
            zaa zaaVar = null;
            if (str == null) {
                str = null;
            }
            C79057V0z.LJJZZIII(parcel, 8, str, false);
            InterfaceC67309QbJ<I, O> interfaceC67309QbJ = this.zak;
            if (interfaceC67309QbJ != null) {
                if (interfaceC67309QbJ instanceof StringToIntConverter) {
                    zaaVar = new zaa((StringToIntConverter) interfaceC67309QbJ);
                } else {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
            }
            C79057V0z.LJJZZI(parcel, 9, zaaVar, i, false);
            C79057V0z.LJLILLLLZI(parcel, LJLIL);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.zai = 1;
            this.LJLIL = i;
            this.LJLILLLLZI = z;
            this.LJLJI = i2;
            this.LJLJJI = z2;
            this.LJLJJL = str;
            this.zaf = i3;
            this.LJLJJLL = cls;
            if (cls == null) {
                this.LJLJL = null;
            } else {
                this.LJLJL = C16880lQ.LJLLILLLL(cls);
            }
            this.zak = null;
        }

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
            this.zai = i;
            this.LJLIL = i2;
            this.LJLILLLLZI = z;
            this.LJLJI = i3;
            this.LJLJJI = z2;
            this.LJLJJL = str;
            this.zaf = i4;
            if (str2 == null) {
                this.LJLJJLL = null;
                this.LJLJL = null;
            } else {
                this.LJLJJLL = SafeParcelResponse.class;
                this.LJLJL = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.LJJJJL();
            }
        }
    }

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5314951976174240543"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public abstract Map<String, Field<?, ?>> LIZIZ();

    public abstract Object LJ();

    public abstract boolean LJII();

    public String toString() {
        Map<String, Field<?, ?>> LIZIZ = LIZIZ();
        StringBuilder sb = new StringBuilder(100);
        for (String str : LIZIZ.keySet()) {
            Field<?, ?> field = LIZIZ.get(str);
            if (LJI(field)) {
                Object LJIIIIZZ = LJIIIIZZ(field, LIZLLL(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                C1DI.LIZIZ(sb, "\"", str, "\":");
                if (LJIIIIZZ == null) {
                    sb.append("null");
                } else {
                    switch (field.LJLJI) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) LJIIIIZZ, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) LJIIIIZZ, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            O5Y.LJJLIIIJJIZ(sb, (HashMap) LJIIIIZZ);
                            break;
                        default:
                            if (field.LJLILLLLZI) {
                                ArrayList arrayList = (ArrayList) LJIIIIZZ;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = ListProtector.get(arrayList, i);
                                    if (obj != null) {
                                        LJIIIZ(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                LJIIIZ(sb, field, LJIIIIZZ);
                                break;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public Object LIZLLL(Field field) {
        boolean z;
        String str = field.LJLJJL;
        if (field.LJLJJLL != null) {
            if (LJ() == null) {
                z = true;
            } else {
                z = false;
            }
            Object[] objArr = {field.LJLJJL};
            if (z) {
                try {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                    sb.append("get");
                    sb.append(upperCase);
                    sb.append(substring);
                    return LIZ(this, getClass().getMethod(sb.toString(), new Class[0]), new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            throw new IllegalStateException(C16880lQ.LLLZ("Concrete field shouldn't be value object: %s", objArr));
        }
        return LJ();
    }

    public boolean LJI(Field field) {
        if (field.LJLJI == 11) {
            if (field.LJLJJI) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <O, I> I LJIIIIZZ(Field<I, O> field, Object obj) {
        if (field.zak != null) {
            return field.LJJJJZI(obj);
        }
        return obj;
    }

    public static final void LJIIIZ(StringBuilder sb, Field field, Object obj) {
        int i = field.LJLIL;
        if (i != 11) {
            if (i == 7) {
                sb.append("\"");
                sb.append(C37355ElL.LIZIZ((String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
            return;
        }
        Class<? extends FastJsonResponse> cls = field.LJLJJLL;
        QH7.LJIIIIZZ(cls);
        sb.append(cls.cast(obj).toString());
    }
}
