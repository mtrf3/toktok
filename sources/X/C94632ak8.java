package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ak8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94632ak8 extends AbstractC65781Prl implements InterfaceC88472Yns<AppCompatTextView, C76800UCe> {
    public static final C94632ak8 LJLIL = new C94632ak8();

    public C94632ak8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AppCompatTextView appCompatTextView) {
        AppCompatTextView receiver = appCompatTextView;
        o.LJIIIZ(receiver, "$receiver");
        receiver.setTextColor(C04330Ez.LIZIZ(receiver.getContext(), R.color.adn));
        receiver.setTextSize(2, 13.0f);
        receiver.setMaxLines(1);
        receiver.setEllipsize(TextUtils.TruncateAt.END);
        receiver.setTypeface(Typeface.DEFAULT_BOLD);
        receiver.setGravity(17);
        receiver.setCompoundDrawablesWithIntrinsicBounds(R.drawable.dfa, 0, 0, 0);
        receiver.setPadding(0, C93742aVm.LIZIZ(6), 0, C93742aVm.LIZIZ(6));
        receiver.setCompoundDrawablePadding(C93742aVm.LIZIZ(4));
        return C76800UCe.LIZ;
    }
}
