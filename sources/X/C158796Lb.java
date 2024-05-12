package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158796Lb extends RecyclerView.ViewHolder {
    public final C71799SFv LJLIL;
    public final View LJLILLLLZI;
    public final ImageView LJLJI;
    public final SY4 LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public ObjectAnimator LJLJL;
    public final LinearLayout LJLJLJ;
    public final /* synthetic */ C158786La LJLJLLL;

    public final void L() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJLJL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJLJL) != null) {
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
            this.LJLJJL.setSelected(true);
            this.LJLJJLL.setSelected(true);
            this.LJLJJL.setTextColor(this.LJLJLLL.LJLIL.getResources().getColor(R.color.c7));
            this.LJLJJLL.setTextColor(this.LJLJLLL.LJLIL.getResources().getColor(R.color.c7));
            this.LJLJJI.setVisibility(0);
            return;
        }
        this.LJLILLLLZI.setVisibility(4);
        this.LJLJJL.setSelected(false);
        this.LJLJJLL.setSelected(false);
        this.LJLJJL.setTextColor(this.LJLJLLL.LJLIL.getResources().getColor(R.color.bc));
        this.LJLJJLL.setTextColor(this.LJLJLLL.LJLIL.getResources().getColor(R.color.be));
        this.LJLJJI.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158796Lb(C158786La c158786La, View view) {
        super(view);
        this.LJLJLLL = c158786La;
        View findViewById = view.findViewById(R.id.lsy);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tts_avatar)");
        this.LJLIL = (C71799SFv) findViewById;
        View findViewById2 = view.findViewById(R.id.lsz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tts_avatar_border_view)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.eyc);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_audio_download)");
        this.LJLJI = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f_u);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_selected)");
        SY4 sy4 = (SY4) findViewById4;
        this.LJLJJI = sy4;
        View findViewById5 = view.findViewById(R.id.mpj);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_tts_name)");
        this.LJLJJL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.mpi);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_tts_des)");
        this.LJLJJLL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.g4p);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.ll_name_desc)");
        this.LJLJLJ = (LinearLayout) findViewById7;
        sy4.setVisibility(8);
        sy4.setButtonStartIcon(Integer.valueOf(R.drawable.b7o));
        sy4.setIconHeight(SFS.LJI(12.0d));
        sy4.setIconWidth(SFS.LJI(16.0d));
    }

    public static void M(C158796Lb c158796Lb, int i) {
        c158796Lb.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    ImageView imageView = c158796Lb.LJLJI;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = c158796Lb.LJLJI;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.th);
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c158796Lb.LJLJI, "rotation", 0.0f, 360.0f);
                    c158796Lb.LJLJL = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(800L);
                    }
                    ObjectAnimator objectAnimator = c158796Lb.LJLJL;
                    if (objectAnimator != null) {
                        objectAnimator.setRepeatMode(1);
                    }
                    ObjectAnimator objectAnimator2 = c158796Lb.LJLJL;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setRepeatCount(-1);
                    }
                    ObjectAnimator objectAnimator3 = c158796Lb.LJLJL;
                    if (objectAnimator3 == null) {
                        return;
                    }
                    objectAnimator3.start();
                    return;
                }
            } else {
                c158796Lb.LJLJI.setVisibility(8);
                c158796Lb.L();
                return;
            }
        }
        if (!C74216TAu.LIZIZ.LIZIZ()) {
            C78596Usy.LJJJLIIL(c158796Lb.LJLJLLL.LJLIL.getContext(), false);
        }
        ImageView imageView3 = c158796Lb.LJLJI;
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.b5f);
        }
        ImageView imageView4 = c158796Lb.LJLJI;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        c158796Lb.L();
    }
}
