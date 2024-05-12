package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class PMI {
    public final Object LIZ;

    public abstract void LIZIZ();

    public abstract SpannableString LIZLLL(SpannableString spannableString);

    public abstract void LJ();

    public abstract PI8 LJIIIIZZ();

    public abstract void LJIIJ(Class cls);

    public void LJIIJJI(GenericArrayType genericArrayType) {
    }

    public void LJIIL(ParameterizedType parameterizedType) {
    }

    public abstract void LJIILIIL(TypeVariable typeVariable);

    public abstract void LJIILJJIL(WildcardType wildcardType);

    public void LJII() {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop detect when state is : ");
            LIZ.append(LJIIIIZZ());
            C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ));
        }
    }

    public PMI(int i) {
        if (i != 4) {
            if (i != 5) {
                if (i != 8) {
                    this.LIZ = new WeakHashMap();
                    return;
                } else {
                    this.LIZ = new Bundle();
                    return;
                }
            }
            return;
        }
        this.LIZ = new HashSet();
    }

    public final void LIZ(String str) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[");
            LIZ.append(LJIIIIZZ());
            LIZ.append("]: ");
            LIZ.append(str);
            C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ));
        }
    }

    public void LJI(boolean z) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLifeCycleChange when state is : ");
            LIZ.append(LJIIIIZZ());
            C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJIIIZ(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && ((java.util.Set) this.LIZ).add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        LJIILIIL((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        LJIILJJIL((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        LJIIL((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        LJIIJ((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        LJIIJJI((GenericArrayType) type);
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unknown type: ");
                        LIZ.append(type);
                        throw new AssertionError(X1D.LIZIZ(LIZ));
                    }
                } catch (Throwable th) {
                    ((java.util.Set) this.LIZ).remove(type);
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ PMI(C3R9 parameters) {
        o.LJIIIZ(parameters, "parameters");
        this.LIZ = parameters;
    }

    public /* synthetic */ PMI(View container) {
        o.LJIIJ(container, "container");
        this.LIZ = container;
    }

    public final String LIZJ(String str, String str2) {
        String string = ((BaseBundle) this.LIZ).getString(str, str2);
        o.LJIIIIZZ(string, "params.getString(key, default)");
        return string;
    }

    public void LJFF(C64198PHm c64198PHm, boolean z) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enter : ");
            LIZ.append(LJIIIIZZ());
            C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ));
        }
    }
}
