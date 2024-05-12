package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C06420Na {
    public static float LIZIZ(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static TuxTextView LIZJ(Context context, int i) {
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(i);
        return tuxTextView;
    }

    public static InterfaceC273515n LIZ(InterfaceC50891zB interfaceC50891zB, InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        o.LJIIIZ(measure, "$this$measure");
        long LLF = interfaceC50891zB.LLF(measure, interfaceC39071g7, j);
        interfaceC50891zB.B();
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C78555UsJ.LJIIIZ(j, LLF));
        return C0ON.LIZIZ(measure, LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, new IDqS416S0100000(LJJJIL, 188));
    }
}
