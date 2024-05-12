package Y;

import X.AbstractC1038245q;
import X.C0A2;
import X.C1034444e;
import X.C46168IAa;
import X.C4BT;
import X.C4EU;
import X.C97343ru;
import X.EnumC1035144l;
import X.T5T;
import X.V1B;
import X.X1D;
import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAssem;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class ARunnableS7S0110000_1 implements Runnable {
    public final int $t;
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
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int measuredHeight = ((C4EU) this.l0).LIZ(R.id.k9w).getMeasuredHeight() - ((C4EU) this.l0).LIZ(R.id.jcz).getHeight();
        if (measuredHeight > 0) {
            ((C4EU) this.l0).LIZ(R.id.l4n).setVisibility(0);
            if (!((C46168IAa) ((C4EU) this.l0).LIZ(R.id.jcz)).LJLIL || this.z1) {
                ((ScrollView) ((C4EU) this.l0).LIZ(R.id.jcz)).smoothScrollTo(0, measuredHeight);
                return;
            }
            return;
        }
        ((C4EU) this.l0).LIZ(R.id.l4n).setVisibility(8);
    }

    public final void LIZ$1() {
        int i;
        int i2;
        int i3;
        RecyclerView.ViewHolder LJJIZ;
        View view;
        Integer num;
        C1034444e c1034444e = (C1034444e) this.l0;
        if (c1034444e.LJI && !this.z1) {
            int intValue = ((Number) c1034444e.LJFF.getValue()).intValue();
            ((C1034444e) this.l0).getClass();
            int LJ = C97343ru.LJ(R.dimen.t9) + intValue;
            RecyclerView recyclerView = ((C1034444e) this.l0).LIZIZ.LJLJLLL;
            if (recyclerView != null) {
                i = recyclerView.getPaddingBottom();
            } else {
                i = 0;
            }
            if (i < LJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("need set padding when show input: ");
                RecyclerView recyclerView2 = ((C1034444e) this.l0).LIZIZ.LJLJLLL;
                if (recyclerView2 != null) {
                    num = Integer.valueOf(recyclerView2.getPaddingBottom());
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append(' ');
                LIZ.append(LJ);
                V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
                ((C1034444e) this.l0).LIZ(LJ);
                ((C1034444e) this.l0).LIZIZ.LJ(EnumC1035144l.INPUT_PANEL_CHANGE);
                return;
            }
            RecyclerView recyclerView3 = ((C1034444e) this.l0).LIZIZ.LJLJLLL;
            if (recyclerView3 != null) {
                i2 = recyclerView3.getHeight();
            } else {
                i2 = 0;
            }
            int i4 = i2 - LJ;
            RecyclerView recyclerView4 = ((C1034444e) this.l0).LIZIZ.LJLJLLL;
            if (recyclerView4 != null && (LJJIZ = recyclerView4.LJJIZ(0)) != null && (view = LJJIZ.itemView) != null) {
                i3 = view.getBottom();
            } else {
                i3 = -1;
            }
            if (i3 <= i4 && i3 >= 0) {
                return;
            }
            ((C1034444e) this.l0).LIZIZ.LJ(EnumC1035144l.INPUT_PANEL_CHANGE);
        }
    }

    public static final void run$0(ARunnableS7S0110000_1 aRunnableS7S0110000_1) {
        boolean LIZ;
        try {
            T5T t5t = (T5T) ((QnaAskQuestionFragment) aRunnableS7S0110000_1.l0)._$_findCachedViewById(R.id.a8v);
            if (t5t != null) {
                if (aRunnableS7S0110000_1.z1) {
                    t5t.requestFocus();
                    KeyboardUtils.LIZLLL(t5t);
                } else {
                    KeyboardUtils.LIZIZ(t5t);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0110000_1 aRunnableS7S0110000_1) {
        boolean LIZ;
        try {
            C4BT c4bt = ((InputView) aRunnableS7S0110000_1.l0).LJLJL;
            if (c4bt != null) {
                c4bt.LJI(-2, aRunnableS7S0110000_1.z1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S0110000_1 aRunnableS7S0110000_1) {
        boolean LIZ;
        try {
            aRunnableS7S0110000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S0110000_1 aRunnableS7S0110000_1) {
        boolean LIZ;
        try {
            aRunnableS7S0110000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S0110000_1 aRunnableS7S0110000_1) {
        boolean LIZ;
        try {
            if (aRunnableS7S0110000_1.z1) {
                ((MessageListAssem) aRunnableS7S0110000_1.l0).A3().LJFF(0, 0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S0110000_1 aRunnableS7S0110000_1) {
        boolean LIZ;
        C0A2 c0a2;
        try {
            if (aRunnableS7S0110000_1.z1) {
                AbstractC1038245q abstractC1038245q = (AbstractC1038245q) aRunnableS7S0110000_1.l0;
                if (!abstractC1038245q.LJLJLLL.isTakoChat$im_base_release()) {
                    RecyclerView recyclerView = abstractC1038245q.LJLIL;
                    if (recyclerView != null) {
                        c0a2 = recyclerView.getLayoutManager();
                    } else {
                        c0a2 = null;
                    }
                    if (c0a2 instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) c0a2).LJFF(0, 0);
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0110000_1(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
