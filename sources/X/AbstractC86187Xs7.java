package X;

import Y.ACListenerS28S0101000_10;
import Y.ACListenerS32S0101000_15;
import Y.ACallableS109S0100000_6;
import Y.AgS131S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xs7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86187Xs7 {
    public Aweme LJLIL;
    public String LJLILLLLZI;
    public DataCenter LJLJI;
    public final Context LJLJJI;
    public final View LJLJJL;

    public AbstractC86187Xs7(View view) {
        this.LJLJJI = view.getContext();
        this.LJLJJL = view;
        C86188Xs8 c86188Xs8 = (C86188Xs8) this;
        View LIZLLL = C16970lZ.LIZLLL(C45804HyK.LJIJJ(c86188Xs8.LJLJJI), R.layout.avp);
        if (view instanceof FrameLayout) {
            ((ViewGroup) view).addView(LIZLLL);
        }
        c86188Xs8.LJLJJLL = (C62846OlW) LIZLLL.findViewById(R.id.d7v);
        c86188Xs8.LJLJL = (FrameLayout) LIZLLL.findViewById(R.id.d7x);
        c86188Xs8.LJLJLJ = (TextView) LIZLLL.findViewById(R.id.d7z);
        View findViewById = LIZLLL.findViewById(R.id.d7w);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS28S0101000_10(0, c86188Xs8, 5), findViewById);
        }
        View findViewById2 = LIZLLL.findViewById(R.id.d7y);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0101000_15(1, c86188Xs8, 0), findViewById2);
        }
        if (C90193gN.LIZIZ(view.getContext())) {
            c86188Xs8.LJLJLJ.setBackgroundResource(R.drawable.au3);
        } else {
            c86188Xs8.LJLJLJ.setBackgroundResource(R.drawable.au2);
        }
        if (FollowFeedCombineOptimizeExpObject.INSTANCE.isHit()) {
            C10K.LIZJ(new ACallableS109S0100000_6(view, 33)).LJ(new AgS131S0100000_15(c86188Xs8, 34), C10K.LJIIIIZZ, null);
            return;
        }
        TextView textView = c86188Xs8.LJLJLJ;
        LiveOuterService.LJJJLL().LJJIIJ();
        textView.setText(C38957FQr.LIZ(view.getContext(), "pm_following_livecard_live_icon"));
    }
}
