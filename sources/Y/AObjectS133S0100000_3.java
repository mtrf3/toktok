package Y;

import X.AnonymousClass710;
import X.AnonymousClass745;
import X.C175296uL;
import X.C178406zM;
import X.C188727au;
import X.C74Z;
import X.EnumC57365MfJ;
import X.FMX;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;

/* loaded from: classes4.dex */
public class AObjectS133S0100000_3 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS133S0100000_3 aObjectS133S0100000_3) {
        FollowLiveVideoViewHolder followLiveVideoViewHolder = (FollowLiveVideoViewHolder) aObjectS133S0100000_3.l0;
        followLiveVideoViewHolder.getClass();
        return Long.valueOf(System.currentTimeMillis() - followLiveVideoViewHolder.LLJJIJIL);
    }

    public static final Object invoke$1(AObjectS133S0100000_3 aObjectS133S0100000_3) {
        ((CommentListFragment) aObjectS133S0100000_3.l0).oo();
        return null;
    }

    public static final Object invoke$2(AObjectS133S0100000_3 aObjectS133S0100000_3) {
        if (AnonymousClass710.LIZLLL(((AnonymousClass745) aObjectS133S0100000_3.l0).LLFF)) {
            AnonymousClass745 anonymousClass745 = (AnonymousClass745) aObjectS133S0100000_3.l0;
            String str = anonymousClass745.LLIIIJ;
            int LJ = C178406zM.LJ(anonymousClass745.LLIIIILZ, anonymousClass745.LLFF);
            AnonymousClass745 anonymousClass7452 = (AnonymousClass745) aObjectS133S0100000_3.l0;
            C74Z.LJJIJIIJIL("translate", str, LJ, anonymousClass7452.LLFF, anonymousClass7452.LLIIIZ);
            ((AnonymousClass745) aObjectS133S0100000_3.l0).LLIIII.LJLILLLLZI = true;
        }
        AnonymousClass745 anonymousClass7453 = (AnonymousClass745) aObjectS133S0100000_3.l0;
        if (C175296uL.LIZIZ(anonymousClass7453.LLFF, anonymousClass7453.LLIIJI, anonymousClass7453.LLIIIJ, true)) {
            AnonymousClass745 anonymousClass7454 = (AnonymousClass745) aObjectS133S0100000_3.l0;
            C74Z.LJII(anonymousClass7454.LLIIIJ, anonymousClass7454.LLFF, EnumC57365MfJ.SHOW, "", anonymousClass7454.LLIIJI);
        }
        Comment comment = ((AnonymousClass745) aObjectS133S0100000_3.l0).LLFF;
        if (!comment.isExpand && comment.needCollapse) {
            FMX.LJIIL("show_more_comment", new C188727au().LIZ);
        }
        return Boolean.FALSE;
    }

    public AObjectS133S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
