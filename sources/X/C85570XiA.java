package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XiA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85570XiA extends AbstractC85571XiB {
    @Override // X.AbstractC85571XiB
    public final int LIZLLL() {
        if (C85837XmT.LJII().equals("TR")) {
            return R.string.t5f;
        }
        if (C35870E5y.LIZ()) {
            return C85837XmT.LJFF();
        }
        return R.string.hya;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85570XiA(C85576XiG c85576XiG, ActivityC86117Xqz activityC86117Xqz, View view, List<? extends C85542Xhi> list) {
        super(c85576XiG, activityC86117Xqz, view, list);
        o.LJIIIZ(view, "view");
        super.LJII();
        this.LJIIJ = new C85539Xhf(ORZ.LLJILJILJ(this.LIZLLL), this.LIZLLL.size(), this.LIZ.LJJLIIJ(), LIZJ());
        LIZIZ().setAdapter(LIZ());
        LJI();
    }
}
