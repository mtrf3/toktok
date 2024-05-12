package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Om6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62882Om6 {
    public final TuxTextView LIZ;
    public final DislikeHashTag LIZIZ;
    public final InterfaceC62886OmA LIZJ;
    public int LIZLLL;
    public final Drawable LJ;
    public final Drawable LJFF;
    public final String LJI;

    public final void LIZ(int i) {
        if (i == this.LIZLLL) {
            return;
        }
        this.LIZLLL = i;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                this.LIZ.setBackground(this.LJFF);
                TuxTextView tuxTextView = this.LIZ;
                Context context = tuxTextView.getContext();
                o.LJIIIIZZ(context, "view.context");
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
                return;
            }
            this.LIZ.setBackground(this.LJ);
            TuxTextView tuxTextView2 = this.LIZ;
            Context context2 = tuxTextView2.getContext();
            o.LJIIIIZZ(context2, "view.context");
            tuxTextView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
            return;
        }
        this.LIZ.setBackground(this.LJ);
        TuxTextView tuxTextView3 = this.LIZ;
        Context context3 = tuxTextView3.getContext();
        o.LJIIIIZZ(context3, "view.context");
        tuxTextView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gw, context3));
    }

    public C62882Om6(TuxTextView tuxTextView, DislikeHashTag dislikeHashTag, InterfaceC62886OmA listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ = tuxTextView;
        this.LIZIZ = dislikeHashTag;
        this.LIZJ = listener;
        Drawable LIZIZ = C04270Et.LIZIZ(tuxTextView.getContext(), R.drawable.ajf);
        this.LJ = LIZIZ;
        this.LJFF = C04270Et.LIZIZ(tuxTextView.getContext(), R.drawable.aje);
        String string = tuxTextView.getContext().getString(R.string.hme);
        o.LJIIIIZZ(string, "view.context.getString(R…d_filtering_hastag_limit)");
        this.LJI = string;
        tuxTextView.setBackground(LIZIZ);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS30S0100000_10(this, 179));
    }
}
