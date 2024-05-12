package Y;

import X.C224738rt;
import X.C8DP;
import X.InterfaceC88471Ynr;
import X.KQA;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.now.interaction.assem.NowKeyboardInputAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes4.dex */
public class ARunnableS5S0210000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        if (this.z2) {
            Rect LIZIZ = C8DP.LIZIZ((RecyclerView.ViewHolder) this.l0);
            if (LIZIZ != null) {
                InboxFragment inboxFragment = (InboxFragment) this.l1;
                int[] iArr = new int[2];
                inboxFragment._$_findCachedViewById(R.id.ekg).getLocationOnScreen(iArr);
                i = LIZIZ.top - iArr[1];
                int computeVerticalScrollRange = (((RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg)).computeVerticalScrollRange() - ((RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg)).computeVerticalScrollOffset()) - inboxFragment._$_findCachedViewById(R.id.ekg).getHeight();
                if (computeVerticalScrollRange <= 0) {
                    computeVerticalScrollRange = 0;
                }
                if (i > computeVerticalScrollRange) {
                    inboxFragment._$_findCachedViewById(R.id.ekg).animate().translationY(computeVerticalScrollRange - i).setDuration(300L).start();
                    i = computeVerticalScrollRange;
                }
            } else {
                i = 0;
            }
            ((InboxFragment) this.l1).LJLJLLL = i;
        } else {
            ((InboxFragment) this.l1)._$_findCachedViewById(R.id.ekg).animate().translationY(0.0f).setDuration(300L).start();
            InboxFragment inboxFragment2 = (InboxFragment) this.l1;
            i = -inboxFragment2.LJLJLLL;
            inboxFragment2.LJLJLLL = 0;
        }
        ((RecyclerView) ((InboxFragment) this.l1)._$_findCachedViewById(R.id.ekg)).LJLIIIL(0, i);
    }

    public static final void run$0(ARunnableS5S0210000_3 aRunnableS5S0210000_3) {
        boolean LIZ;
        try {
            ((KQA) aRunnableS5S0210000_3.l0).j0((List) aRunnableS5S0210000_3.l1, aRunnableS5S0210000_3.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0210000_3 aRunnableS5S0210000_3) {
        boolean LIZ;
        try {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aRunnableS5S0210000_3.l0;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(((ComponentPriorityProtocol) aRunnableS5S0210000_3.l1).o0(), Boolean.valueOf(aRunnableS5S0210000_3.z2));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S0210000_3 aRunnableS5S0210000_3) {
        boolean LIZ;
        try {
            if (aRunnableS5S0210000_3.z2) {
                ((NowKeyboardInputAssem) aRunnableS5S0210000_3.l0).M3();
                KeyboardUtils.LIZLLL((C224738rt) aRunnableS5S0210000_3.l1);
            } else {
                KeyboardUtils.LIZIZ((C224738rt) aRunnableS5S0210000_3.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS5S0210000_3 aRunnableS5S0210000_3) {
        boolean LIZ;
        try {
            aRunnableS5S0210000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS5S0210000_3 aRunnableS5S0210000_3) {
        ((CommentListFragment) aRunnableS5S0210000_3.l0).J5((List) aRunnableS5S0210000_3.l1, aRunnableS5S0210000_3.z2);
    }

    public ARunnableS5S0210000_3(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
