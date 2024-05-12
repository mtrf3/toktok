package X;

import Y.ARunnableS12S0300000_1;
import Y.ARunnableS5S0101000_1;
import Y.AUListenerS90S0100000_1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.44e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034444e {
    public final ChatRoomViewModel LIZ;
    public final C1034344d LIZIZ;
    public final C62822Ol8 LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF;
    public boolean LJI;
    public Animator LJII;

    public final java.util.Map<String, Integer> LIZIZ() {
        return (java.util.Map) this.LIZJ.getValue();
    }

    public final void LIZ(int i) {
        int i2;
        RecyclerView recyclerView = this.LIZIZ.LJLJLLL;
        if (recyclerView != null && i == recyclerView.getPaddingBottom()) {
            return;
        }
        Long l = this.LIZIZ.LJLILLLLZI.LIZLLL;
        if (l != null && l.longValue() == 1000) {
            i--;
        }
        RecyclerView recyclerView2 = this.LIZIZ.LJLJLLL;
        if (recyclerView2 != null && i == recyclerView2.getPaddingBottom()) {
            return;
        }
        RecyclerView recyclerView3 = this.LIZIZ.LJLJLLL;
        if (recyclerView3 != null) {
            i2 = recyclerView3.getPaddingBottom();
        } else {
            i2 = 0;
        }
        ValueAnimator valueAnimator = null;
        if (i < i2) {
            RecyclerView recyclerView4 = this.LIZIZ.LJLJLLL;
            if (recyclerView4 != null) {
                valueAnimator = ValueAnimator.ofInt(recyclerView4.getPaddingBottom(), i);
                valueAnimator.setDuration(300L);
                valueAnimator.addUpdateListener(new AUListenerS90S0100000_1(recyclerView4, 97));
                valueAnimator.start();
            }
            this.LJII = valueAnimator;
        } else {
            RecyclerView recyclerView5 = this.LIZIZ.LJLJLLL;
            if (recyclerView5 != null) {
                C97343ru.LIZJ(recyclerView5, null, Integer.valueOf(i), 7);
            }
            Animator animator = this.LJII;
            if (animator != null) {
                animator.cancel();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("config padding: ");
        LIZ.append(i);
        V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
    }

    public final boolean LIZJ(C109544Rq c109544Rq) {
        if (c109544Rq != null && c109544Rq.isSelf()) {
            long orderIndex = c109544Rq.getOrderIndex();
            Long l = this.LIZIZ.LJLILLLLZI.LIZLLL;
            if (l != null && orderIndex == l.longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL(C109544Rq c109544Rq) {
        long j;
        Long l = this.LIZIZ.LJLILLLLZI.LIZLLL;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (c109544Rq != null) {
            j2 = c109544Rq.getOrderIndex();
        }
        if (j2 >= j || C93793mB.LJIILLIIL(c109544Rq) || C93793mB.LJIILJJIL(c109544Rq)) {
            return true;
        }
        return false;
    }

    public final void LJFF(C109544Rq c109544Rq) {
        int i;
        C109544Rq c109544Rq2;
        String str;
        String str2;
        int i2;
        String str3;
        Integer num;
        String str4;
        int i3;
        int i4;
        Integer valueOf;
        int intValue;
        int i5;
        boolean z;
        Long l;
        List LJIJJLI;
        if (!LIZLLL(c109544Rq)) {
            return;
        }
        Long l2 = this.LIZIZ.LJLILLLLZI.LIZLLL;
        Integer num2 = null;
        if (l2 != null && (LJIJJLI = C78555UsJ.LJIJJLI(this.LIZ)) != null) {
            i = 0;
            for (Object obj : LJIJJLI) {
                int i6 = i + 1;
                if (i >= 0) {
                    if (((C109544Rq) obj).getOrderIndex() == l2.longValue()) {
                        break;
                    } else {
                        i = i6;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        i = -1;
        C1034344d c1034344d = this.LIZIZ;
        if (c1034344d.LJLILLLLZI.LJ) {
            intValue = C97343ru.LJ(R.dimen.t9);
        } else {
            if (i < 0) {
                RecyclerView recyclerView = c1034344d.LJLJLLL;
                if (recyclerView != null) {
                    i5 = recyclerView.getHeight();
                } else {
                    i5 = 0;
                }
                valueOf = Integer.valueOf(i5 - C97343ru.LJ(R.dimen.t7));
            } else {
                int LJ = C97343ru.LJ(R.dimen.t7);
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    List LJIJJLI2 = C78555UsJ.LJIJJLI(this.LIZ);
                    if (LJIJJLI2 != null) {
                        c109544Rq2 = (C109544Rq) ORZ.LJLLLLLL(i7, LJIJJLI2);
                    } else {
                        c109544Rq2 = null;
                    }
                    java.util.Map<String, Integer> LIZIZ = LIZIZ();
                    if (c109544Rq2 != null) {
                        str = c109544Rq2.getUuid();
                    } else {
                        str = null;
                    }
                    if (LIZIZ.get(str) == null) {
                        if (C93793mB.LJIILLIIL(c109544Rq2)) {
                            V1B.LJIIZILJ("typing height is null");
                        } else {
                            StringBuilder LJ2 = C7MY.LJ("height is null, position:", i7, ", type:");
                            if (c109544Rq2 != null) {
                                num2 = Integer.valueOf(c109544Rq2.getMsgType());
                            }
                            LJ2.append(num2);
                            V1B.LJIIZILJ(X1D.LIZIZ(LJ2));
                            return;
                        }
                    }
                    java.util.Map<String, Integer> LIZIZ2 = LIZIZ();
                    if (c109544Rq2 != null) {
                        str2 = c109544Rq2.getUuid();
                    } else {
                        str2 = null;
                    }
                    Integer num3 = LIZIZ2.get(str2);
                    if (num3 != null) {
                        i2 = num3.intValue();
                    } else {
                        i2 = 0;
                    }
                    i8 += i2;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("add Height: ");
                    java.util.Map<String, Integer> LIZIZ3 = LIZIZ();
                    if (c109544Rq2 != null) {
                        str3 = c109544Rq2.getUuid();
                    } else {
                        str3 = null;
                    }
                    LIZ.append(LIZIZ3.get(str3));
                    LIZ.append(" type: ");
                    if (c109544Rq2 != null) {
                        num = Integer.valueOf(c109544Rq2.getMsgType());
                    } else {
                        num = null;
                    }
                    LIZ.append(num);
                    LIZ.append(" uuid: ");
                    if (c109544Rq2 != null) {
                        str4 = c109544Rq2.getUuid();
                    } else {
                        str4 = null;
                    }
                    LIZ.append(str4);
                    V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
                    if (i7 != i) {
                        i7++;
                    } else {
                        RecyclerView recyclerView2 = this.LIZIZ.LJLJLLL;
                        if (recyclerView2 != null) {
                            i3 = recyclerView2.getHeight();
                        } else {
                            i3 = 0;
                        }
                        int i9 = (i3 - i8) - LJ;
                        int LJ3 = C97343ru.LJ(R.dimen.t9);
                        if (i9 < LJ3) {
                            i9 = LJ3;
                        }
                        RecyclerView recyclerView3 = this.LIZIZ.LJLJLLL;
                        if (recyclerView3 != null) {
                            i4 = recyclerView3.getHeight();
                        } else {
                            i4 = 0;
                        }
                        int LJ4 = i4 - C97343ru.LJ(R.dimen.t7);
                        if (i9 > LJ4) {
                            i9 = LJ4;
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("calculate padding bottom: ");
                        LIZ2.append(i9);
                        LIZ2.append(", in it, minusPadding:");
                        LIZ2.append(LJ);
                        V1B.LJIIZILJ(X1D.LIZIZ(LIZ2));
                        valueOf = Integer.valueOf(i9);
                    }
                }
            }
            if (valueOf == null) {
                return;
            } else {
                intValue = valueOf.intValue();
            }
        }
        RecyclerView recyclerView4 = this.LIZIZ.LJLJLLL;
        if (recyclerView4 != null && recyclerView4.getPaddingBottom() == intValue) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long currentTimeMillis = 100 - (System.currentTimeMillis() - this.LIZIZ.LJLJJI.LIZIZ);
            if (currentTimeMillis > 0) {
                C1DH.LJJIJIIJIL(currentTimeMillis, new ARunnableS5S0101000_1(this, intValue, 16));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("changePaddingDelayTime: ");
                LIZ3.append(currentTimeMillis);
                V1B.LJIIZILJ(X1D.LIZIZ(LIZ3));
            } else {
                LIZ(intValue);
            }
        }
        if (C93793mB.LJIILJJIL(c109544Rq) && (l = this.LIZIZ.LJLILLLLZI.LIZLLL) != null && l.longValue() == 0) {
            C1034344d.LIZLLL(this.LIZIZ, EnumC1035144l.DEFAULT, 2);
        }
        C1034744h c1034744h = this.LIZIZ.LJLJJI;
        c1034744h.getClass();
        C1DH.LJJIJIIJIL(50L, new RunnableC1034644g(false, c109544Rq, c1034744h));
    }

    public C1034444e(ChatRoomViewModel chatRoomViewModel, C1034344d mediator) {
        o.LJIIIZ(mediator, "mediator");
        this.LIZ = chatRoomViewModel;
        this.LIZIZ = mediator;
        this.LIZJ = C221108m2.LIZIZ(C1035544p.LJLIL);
        this.LIZLLL = C97343ru.LJ(R.dimen.ta);
        this.LJFF = C221108m2.LIZIZ(C1035844s.LJLIL);
    }

    public final void LJ(int i, View view, C109544Rq c109544Rq) {
        String str;
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        java.util.Map<String, Integer> LIZIZ = LIZIZ();
        Integer num = null;
        if (c109544Rq != null) {
            str = c109544Rq.getUuid();
        } else {
            str = null;
        }
        LIZIZ.put(str, Integer.valueOf(view.getMeasuredHeight()));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("measure msg type: ");
        if (c109544Rq != null) {
            num = Integer.valueOf(c109544Rq.getMsgType());
        }
        LIZ.append(num);
        LIZ.append(", height: ");
        LIZ.append(view.getMeasuredHeight());
        C34B.LIZIZ("PaddingCalculator", X1D.LIZIZ(LIZ));
        view.getMeasuredHeight();
    }

    public final void LJI(View view, C109544Rq c109544Rq, boolean z) {
        String str;
        boolean z2;
        View findViewById;
        if (!LIZLLL(c109544Rq)) {
            return;
        }
        int i = 0;
        boolean z3 = true;
        if (LIZJ(c109544Rq)) {
            if (view != null && (findViewById = view.findViewById(R.id.gi1)) != null && findViewById.getVisibility() == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 != this.LJ) {
                z = true;
            }
        }
        Long l = null;
        if (!z) {
            java.util.Map<String, Integer> LIZIZ = LIZIZ();
            if (c109544Rq != null) {
                str = c109544Rq.getUuid();
            } else {
                str = null;
            }
            if (LIZIZ.containsKey(str)) {
                return;
            }
        }
        if (view == null) {
            return;
        }
        if (C93793mB.LJIILJJIL(c109544Rq)) {
            C1034344d c1034344d = this.LIZIZ;
            if (c109544Rq != null) {
                l = Long.valueOf(c109544Rq.getOrderIndex());
            }
            c1034344d.LJLILLLLZI.LIZIZ(l, false);
            C1DH.LJJIJIIJIL(0L, new ARunnableS12S0300000_1(this, view, c109544Rq, 14));
            return;
        }
        if (LIZJ(c109544Rq)) {
            View findViewById2 = view.findViewById(R.id.gi1);
            if (findViewById2 == null || findViewById2.getVisibility() != 8) {
                z3 = false;
            }
            this.LJ = z3;
        }
        RecyclerView recyclerView = this.LIZIZ.LJLJLLL;
        if (recyclerView != null) {
            i = recyclerView.getWidth();
        }
        LJ(i, view, c109544Rq);
        LJFF(c109544Rq);
    }
}
