package X;

import Y.ACListenerS23S0100000_3;
import Y.IDCListenerS296S0100000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.73Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73Z extends AbstractC1796373f implements G27 {
    public final AbsFragment LJLILLLLZI;
    public final InterfaceC1797373p LJLJI;
    public final C72434Sbm LJLJJI;
    public final C2064988n LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final TextView LJLJLJ;
    public final TextView LJLJLLL;
    public final LinearLayout LJLL;
    public final TextView LJLLI;
    public final SmartImageView LJLLILLLL;
    public final View LJLLJ;
    public String LJLLL;
    public Comment LJLLLL;
    public final C74V LJLLLLLL;
    public DialogInterfaceC39771hF LJLZ;

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        DialogInterfaceC39771hF dialogInterfaceC39771hF = this.LJLZ;
        if (dialogInterfaceC39771hF != null) {
            dialogInterfaceC39771hF.dismiss();
        }
        this.LJLZ = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73Z(View itemView, AbsFragment fragment, InterfaceC1797373p commentListener) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(commentListener, "commentListener");
        this.LJLILLLLZI = fragment;
        this.LJLJI = commentListener;
        this.LJLLL = "";
        C72434Sbm c72434Sbm = (C72434Sbm) itemView.findViewById(R.id.abh);
        this.LJLJJI = c72434Sbm;
        C2064988n c2064988n = (C2064988n) itemView.findViewById(R.id.bst);
        this.LJLJJL = c2064988n;
        TuxTextView tuxTextView = (TuxTextView) itemView.findViewById(R.id.title);
        this.LJLJJLL = tuxTextView;
        this.LJLJL = (TuxTextView) itemView.findViewById(R.id.blr);
        this.LJLJLJ = (TextView) itemView.findViewById(R.id.bm6);
        this.LJLJLLL = (TextView) itemView.findViewById(R.id.bmc);
        itemView.findViewById(R.id.bmd);
        this.LJLL = (LinearLayout) itemView.findViewById(R.id.dv2);
        this.LJLLI = (TextView) itemView.findViewById(R.id.dv4);
        this.LJLLILLLL = (SmartImageView) itemView.findViewById(R.id.dv3);
        this.LJLLJ = itemView.findViewById(R.id.bs_);
        itemView.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 11));
        C16880lQ.LJJIJL(c72434Sbm, new ACListenerS23S0100000_3(this, 305));
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(this, 306));
        C74V c74v = new C74V();
        this.LJLLLLLL = c74v;
        c74v.LIZIZ(itemView, fragment, commentListener);
        C1806877g.LIZ(c2064988n);
    }
}
