package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o53.IDdS475S0100000_8;

/* renamed from: X.KLd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51553KLd extends JJW {
    public final SH8 LJLIL;
    public JJY LJLILLLLZI;

    @Override // X.JJW
    public final void L(JJZ jjz) {
        C51462KHq c51462KHq = (C51462KHq) jjz;
        String str = c51462KHq.LIZIZ;
        if (C1B6.LIZIZ(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            LIZ.append(c51462KHq.LIZIZ);
            str = X1D.LIZIZ(LIZ);
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(str);
        this.LJLIL.setController(LIZJ.LIZ());
    }

    public C51553KLd(C71510S4s c71510S4s, boolean z) {
        super(c71510S4s);
        View findViewById = this.itemView.findViewById(R.id.hoo);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.photo_view)");
        SH8 sh8 = (SH8) findViewById;
        this.LJLIL = sh8;
        sh8.setHorizontalNestedScrollEnabled(true);
        c71510S4s.setDelegateDragTransitionView(sh8);
        sh8.setTapListener(new C71864SIi(z, this));
        sh8.setControllerListener(new IDdS475S0100000_8(this, 0));
    }
}
