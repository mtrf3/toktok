package Y;

import X.C185107Og;
import X.C74Z;
import X.C78983UzD;
import X.InterfaceC176256vt;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectViewHolder;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public class IDCListenerS279S0100000_3 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    public static final void onCancel$5(IDCListenerS279S0100000_3 iDCListenerS279S0100000_3, DialogInterface dialogInterface) {
        C74Z.LIZIZ(r0.getEventType(), "cancel", r0.ym(), ((CommentListFragment) iDCListenerS279S0100000_3.l0).Am());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            case 3:
                onCancel$3(this, dialogInterface);
                return;
            case 4:
                onCancel$4(this, dialogInterface);
                return;
            case 5:
                onCancel$5(this, dialogInterface);
                return;
            case 6:
                onCancel$6(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS279S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS279S0100000_3 iDCListenerS279S0100000_3, DialogInterface dialogInterface) {
        ((InterfaceC176256vt) iDCListenerS279S0100000_3.l0).onCancel();
    }

    public static final void onCancel$1(IDCListenerS279S0100000_3 iDCListenerS279S0100000_3, DialogInterface dialogInterface) {
        ((InterfaceC176256vt) iDCListenerS279S0100000_3.l0).onCancel();
    }

    public static final void onCancel$2(IDCListenerS279S0100000_3 iDCListenerS279S0100000_3, DialogInterface dialogInterface) {
        InterfaceC176256vt interfaceC176256vt = ((CommentCollectViewHolder) iDCListenerS279S0100000_3.l0).mCommentActionSheetClickListener;
        if (interfaceC176256vt != null) {
            interfaceC176256vt.onCancel();
        }
    }

    public static final void onCancel$3(IDCListenerS279S0100000_3 iDCListenerS279S0100000_3, DialogInterface dialogInterface) {
        InterfaceC176256vt interfaceC176256vt = ((CommentCollectViewHolder) iDCListenerS279S0100000_3.l0).mCommentActionSheetClickListener;
        if (interfaceC176256vt != null) {
            interfaceC176256vt.onCancel();
        }
    }

    public static final void onCancel$4(IDCListenerS279S0100000_3 iDCListenerS279S0100000_3, DialogInterface dialogInterface) {
        C185107Og.LIZ((String) ((LinkedHashMap) ((TopicReviewPanel) iDCListenerS279S0100000_3.l0).wl().LJLJI).get("enter_method"), (String) ((LinkedHashMap) ((TopicReviewPanel) iDCListenerS279S0100000_3.l0).wl().LJLJI).get("previous_page"), C78983UzD.LJJLIIIJ(((TopicReviewPanel) iDCListenerS279S0100000_3.l0).wl().LJLILLLLZI), ((TopicReviewPanel) iDCListenerS279S0100000_3.l0).wl().LJLIL, (String) ((LinkedHashMap) ((TopicReviewPanel) iDCListenerS279S0100000_3.l0).wl().LJLJI).get("topic_title"), null, "cancel", 321);
    }

    public static final void onCancel$6(IDCListenerS279S0100000_3 iDCListenerS279S0100000_3, DialogInterface dialogInterface) {
    }
}
