package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HmS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45068HmS extends AbstractC65781Prl implements InterfaceC88472Yns<C85871Xn1, C85871Xn1> {
    public static final C45068HmS LJLIL = new C45068HmS();

    public C45068HmS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C85871Xn1 invoke(C85871Xn1 c85871Xn1) {
        int i;
        C85871Xn1 setState = c85871Xn1;
        o.LJIIIZ(setState, "$this$setState");
        if (C00F.LIZ(31744, 0, "autocut_edit_entrance_name", true) == 1) {
            i = R.string.e1p;
        } else {
            i = R.string.e1q;
        }
        return C85871Xn1.LIZ(setState, null, null, false, null, null, null, null, Integer.valueOf(i), 127);
    }
}
