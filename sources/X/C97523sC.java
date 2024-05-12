package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS41S1100000_1;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97523sC extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJJL = 0;
    public final SY4 LJLIL;
    public final ImageView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;

    public C97523sC(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.eg6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.im_tuxbutton_turn_on)");
        this.LJLIL = (SY4) findViewById;
        View findViewById2 = view.findViewById(R.id.e8v);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.ib_im_top_notice_close_button)");
        this.LJLILLLLZI = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.m8u);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_im_top_notice_title)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.an3);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.body)");
        this.LJLJJI = (TextView) findViewById4;
    }

    public final void L(String source, C97533sD config, SessionListTopNoticeViewModel topNoticeViewModel) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(topNoticeViewModel, "topNoticeViewModel");
        C16880lQ.LJJIZ(this.LJLIL, new ACListenerS21S0100000_1(topNoticeViewModel, 242));
        C16880lQ.LJIILLIIL(this.LJLILLLLZI, new ACListenerS41S1100000_1(topNoticeViewModel, source, 5));
        if (config.LIZIZ instanceof C97553sF) {
            this.LJLJI.setText(this.itemView.getContext().getString(((C97553sF) config.LIZIZ).LIZ));
        }
        if (config.LIZJ instanceof C97553sF) {
            this.LJLJJI.setText(this.itemView.getContext().getString(((C97553sF) config.LIZJ).LIZ));
        }
        InterfaceC97573sH interfaceC97573sH = config.LIZLLL;
        if (interfaceC97573sH instanceof C97593sJ) {
            this.LJLIL.setVisibility(8);
            return;
        }
        if (interfaceC97573sH instanceof C97553sF) {
            this.LJLIL.setVisibility(0);
            this.LJLIL.setText(this.itemView.getContext().getString(((C97553sF) config.LIZLLL).LIZ));
        } else {
            if (!(interfaceC97573sH instanceof C97563sG)) {
                return;
            }
            this.LJLIL.setVisibility(0);
            SY4 sy4 = this.LJLIL;
            config.LIZLLL.getClass();
            sy4.setText((CharSequence) null);
        }
    }
}
