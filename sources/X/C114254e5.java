package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114254e5 extends AbstractC65781Prl implements InterfaceC88472Yns<FrameLayout, C76800UCe> {
    public static final C114254e5 LJLIL = new C114254e5();

    public C114254e5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(FrameLayout frameLayout) {
        FrameLayout it = frameLayout;
        o.LJIIIZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        Context context2 = it.getContext();
        o.LJIIIIZZ(context2, "it.context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eh, context2));
        tuxTextView.setTuxFont(42);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        tuxTextView.setText(it.getContext().getString(R.string.jh2));
        it.addView(tuxTextView);
        return C76800UCe.LIZ;
    }
}
