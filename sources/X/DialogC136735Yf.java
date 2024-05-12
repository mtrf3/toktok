package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogC136735Yf extends Dialog {
    public final TuxIconView LJLIL;
    public final TuxTextView LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC136735Yf(ActivityC45651qj context) {
        super(context, R.style.a8o);
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bkm, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…large_toast_dialog, null)");
        setContentView(LLLZIIL);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        o.LJI(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) KL2.LIZJ(context, 120.0f);
        attributes.width = (int) KL2.LIZJ(context, 188.0f);
        window.setAttributes(attributes);
        window.setFlags(32, 32);
        View findViewById = LLLZIIL.findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.icon)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.ghd);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.message)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
    }
}
