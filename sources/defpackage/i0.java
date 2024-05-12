package defpackage;

import X.AbstractC32681Qa;
import X.C1ZR;
import X.C1ZT;
import X.FFL;
import X.InterfaceC22120ts;
import X.InterfaceC65784Pro;
import X.InterfaceC73592SuS;
import X.X1D;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import n.b;
import o7a.m;
import p8.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class i0 implements InterfaceC73592SuS {
    public static FloatBuffer LJI(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        return ((LiveEffect) obj).getEffect().getTags().contains("new");
    }

    public static InterfaceC22120ts LIZ(InterfaceC22120ts interfaceC22120ts, InterfaceC22120ts other) {
        o.LJIIIZ(other, "other");
        if (other instanceof C1ZR) {
            if (interfaceC22120ts instanceof C1ZR) {
                AbstractC32681Qa abstractC32681Qa = ((C1ZR) other).LIZIZ;
                float LIZ = other.LIZ();
                IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(interfaceC22120ts, 164);
                if (Float.isNaN(LIZ)) {
                    LIZ = ((Number) iDqS420S0100000.invoke()).floatValue();
                }
                return new C1ZR(abstractC32681Qa, LIZ);
            }
            if (!(interfaceC22120ts instanceof C1ZR)) {
                return other;
            }
        } else if (interfaceC22120ts instanceof C1ZR) {
            return interfaceC22120ts;
        }
        return other.LJ(new IDqS420S0100000(interfaceC22120ts, 165));
    }

    public static InterfaceC22120ts LIZIZ(InterfaceC22120ts interfaceC22120ts, InterfaceC65784Pro other) {
        o.LJIIIZ(other, "other");
        if (!o.LJ(interfaceC22120ts, C1ZT.LIZIZ)) {
            return interfaceC22120ts;
        }
        return (InterfaceC22120ts) other.invoke();
    }

    public static String LJFF(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public static int LIZJ(String str, String str2, Keva keva, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        return keva.getInt(X1D.LIZIZ(LIZ), i);
    }

    public static ViewParent LIZLLL(String str, a.c cVar, TuxTextView tuxTextView, LinearLayout.LayoutParams layoutParams, TuxTextView tuxTextView2) {
        m.LIZ(str, cVar, tuxTextView, layoutParams);
        b.LIZ(tuxTextView2);
        return tuxTextView.getParent();
    }

    public static Object LJ(boolean z, String str, int i, Class cls, Object obj) {
        FFL.LJIIIZ().getClass();
        return FFL.LJIJ(z, str, i, cls, obj);
    }
}
