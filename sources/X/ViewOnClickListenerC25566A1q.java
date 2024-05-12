package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenItem;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenUser;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HideAccountViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS13S1101000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.A1q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC25566A1q extends RecyclerView.ViewHolder implements View.OnClickListener {
    public HiddenItem LJLIL;
    public final View LJLILLLLZI;
    public final C71799SFv LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final SY4 LJLJLJ;

    public ViewOnClickListenerC25566A1q(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.j83);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.root_view)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.eye);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_avatar)");
        this.LJLJI = (C71799SFv) findViewById2;
        View findViewById3 = view.findViewById(R.id.mc3);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_nickname)");
        this.LJLJJI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mq8);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_video_count)");
        this.LJLJJL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.m74);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_follower_count)");
        this.LJLJJLL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.m0w);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_bio)");
        this.LJLJL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.axt);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.btn_operate)");
        SY4 sy4 = (SY4) findViewById7;
        this.LJLJLJ = sy4;
        C16880lQ.LJIIJ(this, view);
        C16880lQ.LJJIZ(sy4, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HiddenItem hiddenItem;
        HiddenUser user;
        String userId;
        C25567A1r c25567A1r;
        String str;
        HideAccountViewModel hideAccountViewModel;
        HiddenUser user2;
        String userId2;
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.j83) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            HiddenItem hiddenItem2 = this.LJLIL;
            if (hiddenItem2 == null || (user2 = hiddenItem2.getUser()) == null || (userId2 = user2.getUserId()) == null) {
                return;
            }
            C59895Nf1.LIZLLL(context, "//user/profile", "uid", userId2);
            return;
        }
        if (id != R.id.axt || (hiddenItem = this.LJLIL) == null || (user = hiddenItem.getUser()) == null || (userId = user.getUserId()) == null) {
            return;
        }
        AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        if (bindingAdapter instanceof C25567A1r) {
            c25567A1r = (C25567A1r) bindingAdapter;
        } else {
            c25567A1r = null;
        }
        if (c25567A1r != null && (hideAccountViewModel = c25567A1r.LJLIL) != null) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            hideAccountViewModel.LJLIL.getValue();
            if (C2NU.LIZ.LIZIZ()) {
                hideAccountViewModel.withState(new AqS13S1101000_4(bindingAdapterPosition, userId, hideAccountViewModel, 3));
            } else {
                hideAccountViewModel.setState(new AqS170S0100000_4(hideAccountViewModel, 1151));
            }
        }
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("to_user_id", userId);
        HiddenItem hiddenItem3 = this.LJLIL;
        if (hiddenItem3 != null && hiddenItem3.isHidden()) {
            str = "undo";
        } else {
            str = "hide";
        }
        oszArr[1] = new OSZ("type", str);
        FMX.LJIIL("tns_hidden_accounts_page_click", C113554cx.LJJL(oszArr));
    }
}
