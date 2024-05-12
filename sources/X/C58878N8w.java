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
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.N8w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58878N8w extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final CommerceMusicLogger LJLJI;
    public final InterfaceC88472Yns<MusicModel, C76800UCe> LJLJJI;
    public final SmartImageView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final TuxTextView LJLJLJ;
    public final TuxTextView LJLJLLL;
    public final TuxTag LJLL;
    public final SY4 LJLLI;
    public final TuxIconView LJLLILLLL;
    public final View LJLLJ;
    public final XLM LJLLL;
    public final Animation LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C58878N8w(View view, LifecycleOwner lifecycleOwner, CommerceMusicLogger logger, InterfaceC88472Yns<? super MusicModel, C76800UCe> navigateToShoot) {
        super(view);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(logger, "logger");
        o.LJIIIZ(navigateToShoot, "navigateToShoot");
        this.LJLIL = view;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = logger;
        this.LJLJJI = navigateToShoot;
        View findViewById = this.itemView.findViewById(R.id.iqf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…ommend_music_cover_image)");
        this.LJLJJL = (SmartImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.iqm);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…commend_music_title_view)");
        this.LJLJJLL = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.iqb);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…commend_music_album_view)");
        this.LJLJL = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.iql);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…ecommend_music_time_view)");
        this.LJLJLJ = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.iqd);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…commend_music_count_view)");
        this.LJLJLLL = (TuxTextView) findViewById5;
        this.LJLL = (TuxTag) this.itemView.findViewById(R.id.iqa);
        View findViewById6 = this.itemView.findViewById(R.id.iqk);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…mmend_music_shoot_button)");
        this.LJLLI = (SY4) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.iqi);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.…_music_play_pause_button)");
        this.LJLLILLLL = (TuxIconView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.iqg);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.…mend_music_info_splitter)");
        this.LJLLJ = findViewById8;
        this.LJLLL = V8H.LIZ(-1);
        this.LJLLLL = AnimationUtils.loadAnimation(view.getContext(), R.anim.v);
    }
}
