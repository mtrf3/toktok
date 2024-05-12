package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4kW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118244kW extends FrameLayout {
    public TuxTextView LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118244kW(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        new LinkedHashMap();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(71);
        tuxTextView.setTextAlignment(4);
        tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
        this.LJLIL = tuxTextView;
        addView(tuxTextView, new FrameLayout.LayoutParams(-1, -2, 49));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C26338AVi.LJIIIZ(this, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 16);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cv, context2));
    }
}
