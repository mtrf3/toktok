package X;

import Y.AObjectS130S0200000_3;
import Y.AObserverS67S0200000_3;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import o3.IDaS89S0000000_3;
import o3.h0;

/* renamed from: X.6tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174836tb extends RecyclerView.ViewHolder implements InterfaceC174326sm {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final C8ID LJLJJI;
    public final TextView LJLJJL;
    public final View LJLJJLL;
    public final View LJLJL;
    public CommentReplyButtonStruct LJLJLJ;
    public final CommentBatchManagementViewModel LJLJLLL;
    public final AObserverS67S0200000_3 LJLL;
    public final WeakReference<AbsFragment> LJLLI;
    public User LJLLILLLL;

    public final void M() {
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.LJLJLLL;
        if (commentBatchManagementViewModel != null && commentBatchManagementViewModel.jv0().getValue().booleanValue()) {
            if (!TextUtils.equals(this.LJLJJL.getText(), this.itemView.getContext().getResources().getString(R.string.dj0))) {
                FMX.onEventV3("comment_batch_management_view_replies_ck");
            } else {
                FMX.onEventV3("comment_batch_management_view_more_ck");
            }
        }
    }

    public final void L(int i) {
        CommentReplyButtonStruct commentReplyButtonStruct = this.LJLJLJ;
        if (commentReplyButtonStruct != null) {
            commentReplyButtonStruct.setButtonStatus(i);
        }
        N(true);
    }

    public final void N(boolean z) {
        CommentReplyButtonStruct commentReplyButtonStruct = this.LJLJLJ;
        if (commentReplyButtonStruct == null) {
            return;
        }
        if (commentReplyButtonStruct.getReplyCommentTotal() <= this.LJLJLJ.getTopSize() && this.LJLJLJ.getButtonStatus() != 4) {
            L(4);
            return;
        }
        int buttonStatus = this.LJLJLJ.getButtonStatus();
        if (buttonStatus != 0) {
            if (buttonStatus != 1) {
                if (buttonStatus != 2) {
                    if (buttonStatus != 3) {
                        if (buttonStatus != 4) {
                            return;
                        }
                        this.itemView.getLayoutParams().height = 0;
                        this.itemView.requestLayout();
                        return;
                    }
                    this.LJLJI.setVisibility(8);
                    this.LJLJJI.setVisibility(0);
                    return;
                }
                M();
                CommentReplyButtonStruct commentReplyButtonStruct2 = this.LJLJLJ;
                if (commentReplyButtonStruct2 != null) {
                    int expandSize = commentReplyButtonStruct2.getExpandSize();
                    this.LJLJLJ.setReplyCommentTotal(expandSize);
                    if (expandSize <= this.LJLJLJ.getTopSize()) {
                        L(4);
                        return;
                    }
                }
                this.LJLJI.setVisibility(0);
                this.LJLJJI.setVisibility(8);
                this.LJLILLLLZI.setVisibility(8);
                this.LJLJJLL.setVisibility(0);
                return;
            }
            M();
            this.LJLJI.setVisibility(0);
            this.LJLJJI.setVisibility(8);
            this.LJLILLLLZI.setVisibility(0);
            C74J.LJFF(3, this.LJLILLLLZI, z);
            C74J.LJFF(3, this.LJLJJLL, z);
            this.LJLJJI.setProgressBarInfo(C17N.LJIILL(36.0d));
            this.LJLJJLL.setVisibility(0);
            CommentReplyButtonStruct commentReplyButtonStruct3 = this.LJLJLJ;
            if (commentReplyButtonStruct3 != null) {
                long replyCommentTotal = commentReplyButtonStruct3.getReplyCommentTotal() - this.LJLJLJ.getExpandSize();
                if (replyCommentTotal > 0) {
                    TextView textView = this.LJLJJL;
                    int i = (int) replyCommentTotal;
                    textView.setText(textView.getContext().getResources().getQuantityString(R.plurals.bq, i, Integer.valueOf(i)));
                    return;
                }
                this.LJLJJL.setText(R.string.dj0);
                return;
            }
            this.LJLJJL.setText(R.string.dj0);
            return;
        }
        if (this.LJLJLJ == null) {
            return;
        }
        this.LJLJI.setVisibility(0);
        this.LJLJJI.setVisibility(8);
        this.LJLILLLLZI.setVisibility(0);
        this.LJLJJLL.setVisibility(8);
        int replyCommentTotal2 = (int) (this.LJLJLJ.getReplyCommentTotal() - this.LJLJLJ.getExpandSize());
        TextView textView2 = this.LJLJJL;
        textView2.setText(textView2.getContext().getResources().getQuantityString(R.plurals.br, replyCommentTotal2, Integer.valueOf(replyCommentTotal2)));
        if (this.LJLJLJ.getExpandSize() == 0) {
            C74J.LJFF(2, this.LJLILLLLZI, z);
            C74J.LJFF(2, this.LJLJJLL, z);
            this.LJLJJI.setProgressBarInfo(C17N.LJIILL(30.0d));
        } else {
            C74J.LJFF(3, this.LJLILLLLZI, z);
            C74J.LJFF(3, this.LJLJJLL, z);
            this.LJLJJI.setProgressBarInfo(C17N.LJIILL(36.0d));
        }
    }

    public C174836tb(View view, AbsFragment absFragment, InterfaceC1797373p interfaceC1797373p) {
        super(view);
        boolean z;
        this.LJLLI = new WeakReference<>(absFragment);
        this.LJLIL = view.findViewById(R.id.j71);
        View findViewById = view.findViewById(R.id.d1e);
        this.LJLILLLLZI = findViewById;
        this.LJLJI = (LinearLayout) view.findViewById(R.id.fkt);
        C8ID c8id = (C8ID) view.findViewById(R.id.fku);
        this.LJLJJI = c8id;
        TextView textView = (TextView) view.findViewById(R.id.mh5);
        this.LJLJJL = textView;
        View findViewById2 = view.findViewById(R.id.bgu);
        this.LJLJJLL = findViewById2;
        View findViewById3 = view.findViewById(R.id.naw);
        this.LJLJL = findViewById3;
        View findViewById4 = view.findViewById(R.id.ejv);
        View findViewById5 = view.findViewById(R.id.bgt);
        if ((((Number) C182497Ef.LIZ.getValue()).intValue() & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            findViewById3.setVisibility(0);
            C27740Aue.LJIIJJI(false, findViewById4, findViewById5);
        } else {
            findViewById3.setVisibility(8);
            C27740Aue.LJIIJJI(true, findViewById4, findViewById5);
        }
        EnumC1796673i enumC1796673i = EnumC1796673i.BUTTON;
        C88463da.LIZIZ(findViewById, enumC1796673i, 0.0f, new AObjectS130S0200000_3(this, interfaceC1797373p, 0));
        C88463da.LIZIZ(findViewById2, enumC1796673i, 0.0f, new AObjectS130S0200000_3(this, interfaceC1797373p, 1));
        c8id.setProgressBarInfo(C17N.LJIILL(28.0d));
        this.LJLJLLL = CommentBatchManagementViewModel.hv0(absFragment);
        this.LJLL = new AObserverS67S0200000_3(this, view, 12);
        h0.LJIJI(textView, new IDaS89S0000000_3(9));
    }
}
