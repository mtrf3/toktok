package X;

import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.61o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1537261o extends F9E {
    public final C6MP LJLIL;
    public final TextView LJLILLLLZI;
    public final ImageView LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C1537261o(C6MP toolbarType, TuxTextView textView, SmartImageView imageView) {
        o.LJIIIZ(toolbarType, "toolbarType");
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(imageView, "imageView");
        this.LJLIL = toolbarType;
        this.LJLILLLLZI = textView;
        this.LJLJI = imageView;
    }
}
