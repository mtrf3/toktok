package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.35r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC783535r extends LinearLayout {
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;
    public C62846OlW LJLJI;

    public abstract int getResourceId();

    public final C62846OlW getAvatarIv() {
        C62846OlW c62846OlW = this.LJLJI;
        if (c62846OlW != null) {
            return c62846OlW;
        }
        o.LJIJI("avatarIv");
        throw null;
    }

    public final TuxTextView getSubtitleTv() {
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("subtitleTv");
        throw null;
    }

    public final TuxTextView getTitleTv() {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("titleTv");
        throw null;
    }

    public final void setAvatarIv(C62846OlW c62846OlW) {
        o.LJIIIZ(c62846OlW, "<set-?>");
        this.LJLJI = c62846OlW;
    }

    public final void setSubtitleTv(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLILLLLZI = tuxTextView;
    }

    public final void setTitleTv(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLIL = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC783535r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
