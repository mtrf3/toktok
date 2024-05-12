package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158806Lc extends RecyclerView.ViewHolder {
    public final C71799SFv LJLIL;
    public final View LJLILLLLZI;
    public final ImageView LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxIconView LJLJJL;
    public final TuxIconView LJLJJLL;
    public final ProgressBar LJLJL;
    public final TuxTextView LJLJLJ;
    public ObjectAnimator LJLJLLL;
    public final /* synthetic */ C158786La LJLL;

    public final void L() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJLJLLL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJLJLLL) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LJLJI;
        if (imageView == null) {
            return;
        }
        imageView.setRotation(0.0f);
    }

    public final void N(boolean z) {
        if (z) {
            View view = this.LJLILLLLZI;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(28);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt, view);
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJJI.setTextColor(C173636rf.LIZ(R.attr.eb, this.itemView.getContext()));
            this.LJLJJLL.setTintColor(C173636rf.LIZ(R.attr.eb, this.itemView.getContext()));
            return;
        }
        this.LJLILLLLZI.setVisibility(4);
        this.LJLJJI.setTextColor(C173636rf.LIZ(R.attr.dj, this.itemView.getContext()));
        this.LJLJJLL.setTintColor(C173636rf.LIZ(R.attr.dj, this.itemView.getContext()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158806Lc(C158786La c158786La, View view) {
        super(view);
        this.LJLL = c158786La;
        View findViewById = view.findViewById(R.id.lsy);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tts_avatar)");
        this.LJLIL = (C71799SFv) findViewById;
        View findViewById2 = view.findViewById(R.id.lsz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tts_avatar_border_view)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.eyc);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_audio_download)");
        this.LJLJI = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.la8);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.title_name)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ecd);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.icon_right_offset)");
        this.LJLJJL = (TuxIconView) findViewById5;
        View findViewById6 = view.findViewById(R.id.eby);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.icon_lock)");
        this.LJLJJLL = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.iac);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.progress_bar)");
        this.LJLJL = (ProgressBar) findViewById7;
        View findViewById8 = view.findViewById(R.id.ib7);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.progress_value)");
        this.LJLJLJ = (TuxTextView) findViewById8;
    }

    public static void M(C158806Lc c158806Lc, int i) {
        c158806Lc.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    ImageView imageView = c158806Lc.LJLJI;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = c158806Lc.LJLJI;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.th);
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c158806Lc.LJLJI, "rotation", 0.0f, 360.0f);
                    c158806Lc.LJLJLLL = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(800L);
                    }
                    ObjectAnimator objectAnimator = c158806Lc.LJLJLLL;
                    if (objectAnimator != null) {
                        objectAnimator.setRepeatMode(1);
                    }
                    ObjectAnimator objectAnimator2 = c158806Lc.LJLJLLL;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setRepeatCount(-1);
                    }
                    ObjectAnimator objectAnimator3 = c158806Lc.LJLJLLL;
                    if (objectAnimator3 == null) {
                        return;
                    }
                    objectAnimator3.start();
                    return;
                }
            } else {
                c158806Lc.LJLJI.setVisibility(8);
                c158806Lc.L();
                return;
            }
        }
        if (!C74216TAu.LIZIZ.LIZIZ()) {
            C78596Usy.LJJJLIIL(c158806Lc.LJLL.LJLIL.getContext(), false);
        }
        ImageView imageView3 = c158806Lc.LJLJI;
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.b5f);
        }
        ImageView imageView4 = c158806Lc.LJLJI;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        c158806Lc.L();
    }
}
