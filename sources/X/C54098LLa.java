package X;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.tux.input.TuxTextView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.LLa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54098LLa implements InterfaceC54099LLb {
    public static WeakReference<C54113LLp> LIZIZ;
    public static LLQ LIZLLL;
    public static final C54098LLa LIZ = new C54098LLa();
    public static String LIZJ = "";

    public static void LIZ(String str) {
        C54113LLp c54113LLp;
        TuxTextView tabTitleView;
        float LJIIZILJ;
        WeakReference<C54113LLp> weakReference = LIZIZ;
        if (weakReference == null || (c54113LLp = weakReference.get()) == null || (tabTitleView = c54113LLp.getTabTitleView()) == null) {
            return;
        }
        int width = tabTitleView.getWidth();
        if (width <= 0) {
            Context context = tabTitleView.getContext();
            o.LJIIIIZZ(context, "tabTitleView.context");
            width = C63081OpJ.LJJJJL(context) / 5;
        }
        if (C1A7.LJJIIJ(tabTitleView, str, new TextPaint(), width, Float.valueOf(C32151Nz.LJIIZILJ(10))).getLineCount() > 1) {
            if (C1A7.LJJIIJ(tabTitleView, str, new TextPaint(), width, Float.valueOf(C32151Nz.LJIIZILJ(9))).getLineCount() > 1) {
                LJIIZILJ = C32151Nz.LJIIZILJ(8);
            } else {
                LJIIZILJ = C32151Nz.LJIIZILJ(9);
            }
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(10);
        }
        LLQ llq = LIZLLL;
        if (llq != null) {
            llq.LJJIIJZLJL(LJIIZILJ);
            tabTitleView.setText(str);
        } else {
            o.LJIJI("tabBarLogic");
            throw null;
        }
    }
}
