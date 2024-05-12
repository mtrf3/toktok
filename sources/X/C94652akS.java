package X;

import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.akS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94652akS extends AbstractC65781Prl implements InterfaceC88472Yns<AppCompatTextView, C76800UCe> {
    public static final C94652akS LJLIL = new C94652akS();

    public C94652akS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AppCompatTextView appCompatTextView) {
        AppCompatTextView receiver = appCompatTextView;
        o.LJIIIZ(receiver, "$receiver");
        receiver.setTypeface(Typeface.DEFAULT);
        receiver.setSingleLine(false);
        receiver.setTextSize(2, 12.0f);
        receiver.setTextColor(C04330Ez.LIZIZ(receiver.getContext(), R.color.adn));
        receiver.setGravity(8388627);
        return C76800UCe.LIZ;
    }
}
