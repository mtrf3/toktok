package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Tew, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75178Tew extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public C75178Tew(Object obj) {
        super(1, obj, C75177Tev.class, "handleMultiLiveUIChangeEvent", "handleMultiLiveUIChangeEvent(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        C75177Tev c75177Tev = (C75177Tev) this.receiver;
        if (intValue != 1) {
            if (intValue != 2) {
                c75177Tev.getClass();
                if (intValue == 3 && C74776TWi.LJIIL() && c75177Tev.LIZJ != null) {
                    c75177Tev.LJIIIZ(false);
                }
            } else {
                c75177Tev.LJIIJ(true);
                TextView textView = c75177Tev.LIZJ;
                if (textView != null) {
                    c75177Tev.LJIIIZ(true);
                    textView.setTextColor(C15380j0.LIZIZ(R.color.a3k));
                    c75177Tev.LJIIJJI();
                }
            }
        } else {
            c75177Tev.LJIIJ(true);
            TextView textView2 = c75177Tev.LIZJ;
            if (textView2 != null) {
                c75177Tev.LJIIIZ(true);
                textView2.setTextColor(C15380j0.LIZIZ(R.color.a3j));
                c75177Tev.LJIIJJI();
            }
        }
        return C76800UCe.LIZ;
    }
}
