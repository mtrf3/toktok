package Y;

import X.C174436sx;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;

/* loaded from: classes4.dex */
public class AObjectS48S0101000_3 implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS48S0101000_3 aObjectS48S0101000_3) {
        KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aObjectS48S0101000_3.l0;
        int i = aObjectS48S0101000_3.i1;
        keyboardDialogFragment.LLJILJIL.LL = false;
        if (i == 10002) {
            keyboardDialogFragment.Ll(150);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS48S0101000_3 aObjectS48S0101000_3) {
        switch (aObjectS48S0101000_3.i1) {
            case 0:
                ((CommentListFragment) ((C174436sx) aObjectS48S0101000_3.l0).LJLJI).So();
                return null;
            default:
                DraftBoxActivity.LLIIIJ((Context) aObjectS48S0101000_3.l0);
                return null;
        }
    }

    public AObjectS48S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
