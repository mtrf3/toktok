package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.N8x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58879N8x extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final SmartImageView LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final TuxTag LJLJLJ;
    public final SY4 LJLJLLL;
    public final TuxIconView LJLL;
    public final View LJLLI;
    public final XLM LJLLILLLL;
    public final Animation LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58879N8x(View view, LifecycleOwner lifecycleOwner) {
        super(view);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = view;
        this.LJLILLLLZI = lifecycleOwner;
        View findViewById = this.itemView.findViewById(R.id.iqf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…ommend_music_cover_image)");
        this.LJLJI = (SmartImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.iqm);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…commend_music_title_view)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.iqb);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…commend_music_album_view)");
        this.LJLJJL = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.iql);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…ecommend_music_time_view)");
        this.LJLJJLL = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.iqd);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…commend_music_count_view)");
        this.LJLJL = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.iqa);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…end_music_ai_rec_way_tag)");
        this.LJLJLJ = (TuxTag) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.iqk);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.…mmend_music_shoot_button)");
        this.LJLJLLL = (SY4) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.iqi);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.…_music_play_pause_button)");
        this.LJLL = (TuxIconView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.iqg);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.…mend_music_info_splitter)");
        this.LJLLI = findViewById9;
        this.LJLLILLLL = V8H.LIZ(-1);
        this.LJLLJ = AnimationUtils.loadAnimation(view.getContext(), R.anim.v);
        this.itemView.getLayoutParams().width = O6R.LJJIIJZLJL(this.itemView.getContext().getResources().getDisplayMetrics().widthPixels * 0.885d);
    }
}
