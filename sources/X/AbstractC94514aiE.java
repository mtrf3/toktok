package X;

import X.C94389agD;
import X.InterfaceC94009aa5;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aiE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94514aiE<T extends InterfaceC94009aa5, VH extends C94389agD> extends AbstractC94375afz<T, VH> {
    public final C5H3 LJLJJL;

    public AbstractC94514aiE(List<T> list) {
        super(list);
        this.LJLJJL = C221108m2.LIZ(EnumC221088m0.NONE, C94720alY.LJLIL);
    }

    @Override // X.AbstractC94375afz
    public final int LJZI(int i) {
        return ((InterfaceC94009aa5) ListProtector.get(this.LJLIL, i)).LJ();
    }

    @Override // X.AbstractC94375afz
    public final C94389agD LLD(int i, ViewGroup parent) {
        Class cls;
        C94389agD c94389agD;
        o.LJIIIZ(parent, "parent");
        int i2 = ((SparseIntArray) this.LJLJJL.getValue()).get(i);
        if (i2 != 0) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), i2, parent, false);
            o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(this…layoutResId, this, false)");
            Class<?> cls2 = getClass();
            while (cls2 != null) {
                try {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    if (genericSuperclass instanceof ParameterizedType) {
                        for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
                            if (type instanceof Class) {
                                if (C94389agD.class.isAssignableFrom((Class) type)) {
                                    cls = (Class) type;
                                    break;
                                }
                            } else {
                                if (type instanceof ParameterizedType) {
                                    Type rawType = ((ParameterizedType) type).getRawType();
                                    if ((rawType instanceof Class) && C94389agD.class.isAssignableFrom((Class) rawType)) {
                                        cls = (Class) rawType;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                } catch (TypeNotPresentException e) {
                    C16880lQ.LLLLIIL(e);
                } catch (GenericSignatureFormatError e2) {
                    e2.printStackTrace();
                } catch (MalformedParameterizedTypeException e3) {
                    C16880lQ.LLLLIIL(e3);
                }
                cls = null;
                cls2 = cls2.getSuperclass();
                if (cls != null) {
                    try {
                        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                            Constructor declaredConstructor = cls.getDeclaredConstructor(getClass(), View.class);
                            o.LJIIIIZZ(declaredConstructor, "z.getDeclaredConstructor…aClass, View::class.java)");
                            declaredConstructor.setAccessible(true);
                            Object newInstance = declaredConstructor.newInstance(this, LLLLIILL);
                            if (newInstance != null) {
                                c94389agD = (C94389agD) newInstance;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type VH");
                            }
                        } else {
                            Constructor declaredConstructor2 = cls.getDeclaredConstructor(View.class);
                            o.LJIIIIZZ(declaredConstructor2, "z.getDeclaredConstructor(View::class.java)");
                            declaredConstructor2.setAccessible(true);
                            Object newInstance2 = declaredConstructor2.newInstance(LLLLIILL);
                            if (newInstance2 != null) {
                                c94389agD = (C94389agD) newInstance2;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type VH");
                            }
                        }
                        if (c94389agD != null) {
                            return c94389agD;
                        }
                    } catch (IllegalAccessException e4) {
                        C16880lQ.LLLLIIL(e4);
                    } catch (InstantiationException e5) {
                        C16880lQ.LLLLIIL(e5);
                    } catch (NoSuchMethodException e6) {
                        C16880lQ.LLLLIIL(e6);
                    } catch (InvocationTargetException e7) {
                        C16880lQ.LLLLIIL(e7);
                    }
                    return new C94389agD(LLLLIILL);
                }
            }
            return new C94389agD(LLLLIILL);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewType: ");
        LIZ.append(i);
        LIZ.append(" found layoutResId，please use addItemType() first!");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
