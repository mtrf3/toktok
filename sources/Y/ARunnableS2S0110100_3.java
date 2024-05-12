package Y;

import X.C215498cz;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;

/* loaded from: classes4.dex */
public class ARunnableS2S0110100_3 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS2S0110100_3 aRunnableS2S0110100_3) {
        boolean LIZ;
        try {
            ((C215498cz) aRunnableS2S0110100_3.l0).LIZ(aRunnableS2S0110100_3.j2, aRunnableS2S0110100_3.z1, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0110100_3 aRunnableS2S0110100_3) {
        CommentListFragment commentListFragment = (CommentListFragment) aRunnableS2S0110100_3.l0;
        boolean z = aRunnableS2S0110100_3.z1;
        long j = aRunnableS2S0110100_3.j2;
        if (commentListFragment.LLFII.getParent() != null) {
            commentListFragment.No(j, z);
        }
    }

    public ARunnableS2S0110100_3(Object obj, boolean z, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
        this.j2 = j;
    }
}
