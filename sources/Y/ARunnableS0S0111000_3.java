package Y;

import X.AbstractC225698tR;
import X.C181847Bs;
import X.C194147je;
import X.C53946LFe;
import X.C53976LGi;
import X.C61447O9r;
import X.C7MY;
import X.LLR;
import X.SYL;
import android.content.Context;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS0S0111000_3 implements Runnable {
    public final int $t;
    public int i2;
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

    public final void LIZ$0() {
        int LIZIZ;
        int i;
        IFriendsTabLayoutAbility LIZ;
        Rect E40;
        int LIZIZ2 = C7MY.LIZIZ(10);
        NowBaseListAssem nowBaseListAssem = (NowBaseListAssem) this.l0;
        AbstractC225698tR abstractC225698tR = LLR.LIZJ.LIZ;
        nowBaseListAssem.getClass();
        int H3 = NowBaseListAssem.H3(abstractC225698tR);
        if (o.LJ(((C181847Bs) ((NowBaseListAssem) this.l0).LJLIL.getValue()).LJLIL, C194147je.LIZ)) {
            i = C7MY.LIZIZ(52);
            H3 = 0;
        } else {
            Context context = ((NowBaseListAssem) this.l0).getContext();
            if (context == null || (LIZ = C53976LGi.LIZ(context)) == null || (E40 = LIZ.E40()) == null || (LIZIZ = E40.bottom) == 0) {
                LIZIZ = C7MY.LIZIZ(80);
            }
            i = LIZIZ2 + LIZIZ;
            if (C61447O9r.LJIIIZ) {
                H3 = C7MY.LIZIZ(47);
            }
        }
        if (!this.z1 && C53946LFe.LIZJ(null, null).LJFF) {
            SYL x3 = ((NowBaseListAssem) this.l0).x3();
            int i2 = this.i2;
            x3.setPadding(i2, 0, i2, 0);
        } else {
            SYL x32 = ((NowBaseListAssem) this.l0).x3();
            int i3 = this.i2;
            x32.setPadding(i3, i, i3, H3);
        }
    }

    public static final void run$0(ARunnableS0S0111000_3 aRunnableS0S0111000_3) {
        switch (aRunnableS0S0111000_3.i2) {
            case 0:
                ((CommentInputFragment) aRunnableS0S0111000_3.l0).h(!aRunnableS0S0111000_3.z1);
                return;
            default:
                ((SearchStateViewModel) aRunnableS0S0111000_3.l0).lambda$setIsStopAutoPlayByTns$6(aRunnableS0S0111000_3.z1);
                return;
        }
    }

    public static final void run$1(ARunnableS0S0111000_3 aRunnableS0S0111000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0111000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0111000_3(Object obj, boolean z, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.z1 = z;
        this.i2 = i;
    }
}
