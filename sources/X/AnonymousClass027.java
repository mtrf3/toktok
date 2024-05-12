package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.027, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass027 {
    public static int LJLIL = -100;
    public static final C0M4<WeakReference<AnonymousClass027>> LJLILLLLZI = new C0M4<>();
    public static final Object LJLJI = new Object();

    public abstract void LIZLLL(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean LJ();

    public Context LJFF(Context context) {
        return context;
    }

    public abstract View LJI(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T LJII(int i);

    public abstract AnonymousClass022 LJIIIIZZ();

    public int LJIIIZ() {
        return -100;
    }

    public abstract MenuInflater LJIIJ();

    public abstract AnonymousClass021 LJIIJJI();

    public abstract void LJIIL();

    public abstract void LJIILIIL();

    public abstract void LJIILJJIL(Configuration configuration);

    public abstract void LJIILL(Bundle bundle);

    public abstract void LJIILLIIL();

    public abstract void LJIIZILJ(Bundle bundle);

    public abstract void LJIJ();

    public abstract void LJIJI(Bundle bundle);

    public abstract void LJIJJ();

    public abstract void LJIJJLI();

    public abstract boolean LJJ(int i);

    public abstract void LJJI(int i);

    public abstract void LJJIFFI(View view);

    public abstract void LJJII(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void LJJIIJ(C011902x c011902x);

    public void LJJIIJZLJL(int i) {
    }

    public abstract void LJJIIZ(CharSequence charSequence);

    public abstract AbstractC25580zS LJJIIZI(InterfaceC25570zR interfaceC25570zR);

    public static void LIZJ(AnonymousClass027 anonymousClass027) {
        synchronized (LJLJI) {
            LJIL(anonymousClass027);
            LJLILLLLZI.add(new WeakReference<>(anonymousClass027));
        }
    }

    public static void LJIL(AnonymousClass027 anonymousClass027) {
        synchronized (LJLJI) {
            Iterator<WeakReference<AnonymousClass027>> it = LJLILLLLZI.iterator();
            while (it.hasNext()) {
                AnonymousClass027 anonymousClass0272 = it.next().get();
                if (anonymousClass0272 == anonymousClass027 || anonymousClass0272 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void LJJIII(int i) {
        if ((i != -1 && i != 0 && i != 1 && i != 2 && i != 3) || LJLIL == i) {
            return;
        }
        LJLIL = i;
        synchronized (LJLJI) {
            Iterator<WeakReference<AnonymousClass027>> it = LJLILLLLZI.iterator();
            while (it.hasNext()) {
                AnonymousClass027 anonymousClass027 = it.next().get();
                if (anonymousClass027 != null) {
                    anonymousClass027.LJ();
                }
            }
        }
    }
}
