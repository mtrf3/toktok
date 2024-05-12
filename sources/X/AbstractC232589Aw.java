package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC232589Aw extends LinearLayout {
    public TuxTextView LJLIL;
    public TuxIconView LJLILLLLZI;

    public final TuxIconView getInfoIconView() {
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("infoIconView");
        throw null;
    }

    public final TuxTextView getTitleTextView() {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("titleTextView");
        throw null;
    }

    public final void setInfoIconView(TuxIconView tuxIconView) {
        o.LJIIIZ(tuxIconView, "<set-?>");
        this.LJLILLLLZI = tuxIconView;
    }

    public final void setTitleTextView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLIL = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC232589Aw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
    }
}
