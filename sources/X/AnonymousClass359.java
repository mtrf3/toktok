package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.359, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass359 extends AbstractC65781Prl implements InterfaceC88472Yns<SY4, C76800UCe> {
    public static final AnonymousClass359 LJLIL = new AnonymousClass359();

    public AnonymousClass359() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SY4 sy4) {
        SY4 it = sy4;
        o.LJIIIZ(it, "it");
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        c110614Vt.LIZJ = C61328O5c.LIZJ(100);
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        it.setBackground(c110614Vt.LIZ(context));
        return C76800UCe.LIZ;
    }
}
