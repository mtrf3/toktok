package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZL extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLL = 0;
    public final XZU LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C29701Eo LJLJJI;
    public final View LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxIconView LJLJL;
    public final C116414hZ LJLJLJ;
    public final View LJLJLLL;

    public XZL(View view, XZU xzu) {
        super(view);
        this.LJLIL = xzu;
        View findViewById = view.findViewById(R.id.ga7);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…ottie_music_playing_icon)");
        C29701Eo c29701Eo = (C29701Eo) findViewById;
        this.LJLJJI = c29701Eo;
        View findViewById2 = view.findViewById(R.id.klw);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.sts_item_rl)");
        this.LJLJJL = findViewById2;
        View findViewById3 = view.findViewById(R.id.exu);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_anim_icon)");
        C29701Eo c29701Eo2 = (C29701Eo) findViewById3;
        View findViewById4 = view.findViewById(R.id.mod);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_title_state)");
        this.LJLJJLL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.fax);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_switch_btn)");
        TuxIconView tuxIconView = (TuxIconView) findViewById5;
        this.LJLJL = tuxIconView;
        View findViewById6 = view.findViewById(R.id.f6j);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_loading_spinner)");
        this.LJLJLJ = (C116414hZ) findViewById6;
        View findViewById7 = view.findViewById(R.id.ngf);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.vw_border)");
        this.LJLJLLL = findViewById7;
        c29701Eo2.setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/Speech_to_song.json");
        c29701Eo2.setRepeatCount(-1);
        c29701Eo2.playAnimation();
        C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 239));
        C146035oF.LIZJ(view, new AqS165S0100000_15(this, 861));
        if (QXF.LIZLLL()) {
            c29701Eo.setAnimation("little_audio_wave_anim.json");
            c29701Eo.setRepeatCount(-1);
            findViewById7.setBackgroundResource(R.drawable.bsr);
        }
    }
}
