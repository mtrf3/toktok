package X;

import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ajz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94623ajz extends AbstractC65781Prl implements InterfaceC88472Yns<AppCompatTextView, C76800UCe> {
    public static final C94623ajz LJLIL = new C94623ajz();

    public C94623ajz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AppCompatTextView appCompatTextView) {
        AppCompatTextView receiver = appCompatTextView;
        o.LJIIIZ(receiver, "$receiver");
        receiver.setText(receiver.getContext().getString(R.string.gx));
        C93902aYM.LJFF(receiver, 16);
        receiver.setTypeface(Typeface.DEFAULT);
        return C76800UCe.LIZ;
    }
}
