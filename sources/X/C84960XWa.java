package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XWa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84960XWa extends XWZ {
    @Override // X.XWZ, X.XWS
    public final void LIZLLL() {
        super.LIZLLL();
        Context context = this.LIZJ.getContext();
        C73306Spq c73306Spq = new C73306Spq();
        String string = context.getString(R.string.gak);
        o.LJIIIIZZ(string, "context.getString(R.string.favorite_sounds)");
        c73306Spq.LJFF = string;
        String string2 = context.getString(R.string.gam);
        o.LJIIIIZZ(string2, "context.getString(R.stri…avorite_sounds_empty_tip)");
        c73306Spq.LJI = string2;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_bookmark;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        this.LIZJ.setStatus(c73306Spq);
    }

    public C84960XWa(Context context, View view, InterfaceC157206Ey<?> interfaceC157206Ey, InterfaceC191547fS interfaceC191547fS, InterfaceC85019XYh<XYN> interfaceC85019XYh, int i) {
        super(context, view, interfaceC157206Ey, interfaceC191547fS, interfaceC85019XYh, i);
    }
}
