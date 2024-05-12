package Y;

import X.C174836tb;
import X.InterfaceC1797373p;
import X.InterfaceC88471Ynr;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;

/* loaded from: classes4.dex */
public class AObjectS130S0200000_3 implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS130S0200000_3(C174836tb c174836tb, InterfaceC1797373p interfaceC1797373p, int i) {
        this.$t = i;
        this.l0 = c174836tb;
        this.l1 = interfaceC1797373p;
    }

    public static final Object invoke$0(AObjectS130S0200000_3 aObjectS130S0200000_3, Object obj, Object obj2) {
        CommentReplyButtonStruct commentReplyButtonStruct;
        C174836tb c174836tb = (C174836tb) aObjectS130S0200000_3.l0;
        InterfaceC1797373p interfaceC1797373p = (InterfaceC1797373p) aObjectS130S0200000_3.l1;
        c174836tb.getClass();
        if (((MotionEvent) obj2).getAction() == 1 && (commentReplyButtonStruct = c174836tb.LJLJLJ) != null && interfaceC1797373p != null && commentReplyButtonStruct.getButtonStatus() != 3) {
            ((CommentListFragment) interfaceC1797373p).Hn(c174836tb.LJLJLJ, c174836tb);
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AObjectS130S0200000_3 aObjectS130S0200000_3, Object obj, Object obj2) {
        CommentReplyButtonStruct commentReplyButtonStruct;
        C174836tb c174836tb = (C174836tb) aObjectS130S0200000_3.l0;
        InterfaceC1797373p interfaceC1797373p = (InterfaceC1797373p) aObjectS130S0200000_3.l1;
        c174836tb.getClass();
        if (((MotionEvent) obj2).getAction() == 1 && (commentReplyButtonStruct = c174836tb.LJLJLJ) != null && interfaceC1797373p != null && commentReplyButtonStruct.getButtonStatus() != 3) {
            c174836tb.LJLJLJ.setButtonStatus(2);
            ((CommentListFragment) interfaceC1797373p).Hn(c174836tb.LJLJLJ, c174836tb);
        }
        return Boolean.TRUE;
    }
}
