package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xej, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85357Xej {
    public C71895SJn LIZ;
    public LinearLayoutCompat LIZIZ;
    public TuxIconView LIZJ;
    public TuxTextView LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C85389XfF.LJLIL);

    public final IAVPublishService LIZIZ() {
        return (IAVPublishService) this.LJ.getValue();
    }

    public final C71895SJn LIZJ() {
        C71895SJn c71895SJn = this.LIZ;
        if (c71895SJn != null) {
            return c71895SJn;
        }
        o.LJIJI("skeletonView");
        throw null;
    }

    public static View LIZ(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c0z, viewGroup, false, "from(parent.context)\n   …list_cell, parent, false)");
    }

    public final void LIZLLL(View view) {
        int i;
        View findViewById = view.findViewById(R.id.k1z);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.skeleton_container)");
        this.LIZ = (C71895SJn) findViewById;
        View findViewById2 = LIZJ().findViewById(R.id.g2g);
        o.LJIIIIZZ(findViewById2, "skeletonView.findViewById(R.id.ll_container)");
        this.LIZIZ = (LinearLayoutCompat) findViewById2;
        View findViewById3 = LIZJ().findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById3, "skeletonView.findViewById(R.id.icon)");
        this.LIZJ = (TuxIconView) findViewById3;
        View findViewById4 = LIZJ().findViewById(R.id.l3h);
        o.LJIIIIZZ(findViewById4, "skeletonView.findViewById(R.id.textView)");
        this.LIZLLL = (TuxTextView) findViewById4;
        LIZJ().setAnimationDuration(800L);
        LinearLayoutCompat linearLayoutCompat = this.LIZIZ;
        if (linearLayoutCompat != null) {
            C110614Vt c110614Vt = new C110614Vt();
            if (LIZIZ().isEnablePutSettingsIntoMoreOption()) {
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
                c110614Vt.LIZJ = C61328O5c.LIZJ(4);
            } else {
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
                c110614Vt.LJFF = Integer.valueOf(R.attr.e0);
                c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
                c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            }
            Context context = LIZJ().getContext();
            o.LJIIIIZZ(context, "skeletonView.context");
            linearLayoutCompat.setBackground(c110614Vt.LIZ(context));
            C78897Uxp.LJJJJJL(LIZJ(), C32151Nz.LJIIZILJ(4));
            TuxTextView tuxTextView = this.LIZLLL;
            if (tuxTextView != null) {
                if (LIZIZ().isEnableCombineCDS()) {
                    i = 62;
                } else if (LIZIZ().isEnablePutSettingsIntoMoreOption()) {
                    i = 61;
                } else {
                    i = 72;
                }
                tuxTextView.setTuxFont(i);
                if (LIZIZ().isEnablePutSettingsIntoMoreOption()) {
                    tuxTextView.setTextColorRes(R.attr.gx);
                } else {
                    tuxTextView.setTextColorRes(R.attr.go);
                }
                tuxTextView.setGravity(16);
                TuxIconView tuxIconView = this.LIZJ;
                if (tuxIconView != null) {
                    if (LIZIZ().isEnablePutSettingsIntoMoreOption()) {
                        tuxIconView.setTintColorRes(R.attr.gx);
                        return;
                    } else {
                        tuxIconView.setTintColorRes(R.attr.go);
                        return;
                    }
                }
                o.LJIJI("icon");
                throw null;
            }
            o.LJIJI("textView");
            throw null;
        }
        o.LJIJI("linearContainer");
        throw null;
    }
}
