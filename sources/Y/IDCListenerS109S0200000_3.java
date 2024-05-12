package Y;

import X.C4LD;
import X.C71Y;
import X.C78K;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListCell;
import com.ss.android.ugc.now.interaction.assem.CommentCell;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCListenerS109S0200000_3 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(IDCListenerS109S0200000_3 iDCListenerS109S0200000_3, View view) {
        C71Y.LIZ("NowCommentCell", "reply btn long click");
        ((CommentCell) iDCListenerS109S0200000_3.l0).U((CommentItem) iDCListenerS109S0200000_3.l1);
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS109S0200000_3 iDCListenerS109S0200000_3, View view) {
        C71Y.LIZ("NowCommentCell", "itemView long click");
        ((CommentCell) iDCListenerS109S0200000_3.l0).U((CommentItem) iDCListenerS109S0200000_3.l1);
        return true;
    }

    public static final boolean onLongClick$2(IDCListenerS109S0200000_3 iDCListenerS109S0200000_3, View view) {
        C71Y.LIZ("NowCommentCell", "name long click");
        ((CommentCell) iDCListenerS109S0200000_3.l0).U((CommentItem) iDCListenerS109S0200000_3.l1);
        return true;
    }

    public static final boolean onLongClick$3(IDCListenerS109S0200000_3 iDCListenerS109S0200000_3, View view) {
        C71Y.LIZ("NowCommentCell", "reply name long click");
        ((CommentCell) iDCListenerS109S0200000_3.l0).U((CommentItem) iDCListenerS109S0200000_3.l1);
        return true;
    }

    public static final boolean onLongClick$4(IDCListenerS109S0200000_3 iDCListenerS109S0200000_3, View view) {
        AssemViewModel assemViewModel = (AssemViewModel) ((RepostListCell) iDCListenerS109S0200000_3.l0).LJLJJI.getValue();
        Aweme aweme = ((C78K) iDCListenerS109S0200000_3.l1).LJLIL;
        View itemView = ((RepostListCell) iDCListenerS109S0200000_3.l0).itemView;
        o.LJIIIIZZ(itemView, "itemView");
        o.LJIIIZ(aweme, "aweme");
        assemViewModel.setState(new AqS169S0100000_3(aweme, 887));
        boolean LJJJJJ = C4LD.LIZIZ.LJJJJJ("repost_history");
        if (LJJJJJ) {
            itemView.setScaleX(0.99f);
            itemView.setScaleY(0.99f);
            itemView.setOnTouchListener(new View.OnTouchListener() { // from class: X.2S3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        view2.setScaleX(1.0f);
                        view2.setScaleY(1.0f);
                        return false;
                    }
                    return false;
                }
            });
        }
        return LJJJJJ;
    }

    public IDCListenerS109S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
