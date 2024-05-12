package Y;

import X.AbstractC90587Zgt;
import X.AbstractC90599Zh5;
import X.C90092ZXk;
import X.C90571Zgd;
import X.C90589Zgv;
import X.C90591Zgx;
import X.C90605ZhB;
import X.C90861ZlJ;
import X.C90862ZlK;
import X.DialogC90860ZlI;
import X.DialogC90863ZlL;
import X.DialogC90914ZmA;
import X.ZY3;
import X.ZY4;
import X.ZY5;
import android.app.PendingIntent;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public class IDCListenerS136S0100000_24 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS136S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        ((DialogC90914ZmA) iDCListenerS136S0100000_24.l0).dismiss();
    }

    public static final void onClick$1(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        PendingIntent sessionActivity;
        MediaControllerCompat mediaControllerCompat = ((DialogC90914ZmA) iDCListenerS136S0100000_24.l0).LLIL;
        if (mediaControllerCompat != null && (sessionActivity = mediaControllerCompat.LIZ.LIZ.getSessionActivity()) != null) {
            try {
                sessionActivity.send();
                ((DialogC90914ZmA) iDCListenerS136S0100000_24.l0).dismiss();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
    }

    public static final void onClick$2(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        Interpolator interpolator;
        DialogC90914ZmA dialogC90914ZmA = (DialogC90914ZmA) iDCListenerS136S0100000_24.l0;
        boolean z = !dialogC90914ZmA.LLJ;
        dialogC90914ZmA.LLJ = z;
        if (z) {
            dialogC90914ZmA.LLI.setVisibility(0);
        }
        DialogC90914ZmA dialogC90914ZmA2 = (DialogC90914ZmA) iDCListenerS136S0100000_24.l0;
        if (dialogC90914ZmA2.LLJ) {
            interpolator = dialogC90914ZmA2.LLJJI;
        } else {
            interpolator = dialogC90914ZmA2.LLJJIII;
        }
        dialogC90914ZmA2.LLJJ = interpolator;
        dialogC90914ZmA2.LJJIIZI(true);
    }

    public static final void onClick$3(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        ((DialogC90860ZlI) iDCListenerS136S0100000_24.l0).dismiss();
    }

    public static final void onClick$4(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        ((DialogC90863ZlL) iDCListenerS136S0100000_24.l0).dismiss();
    }

    public static final void onClick$5(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        if (((DialogC90863ZlL) iDCListenerS136S0100000_24.l0).LJLJJLL.LJI()) {
            ((DialogC90863ZlL) iDCListenerS136S0100000_24.l0).LJLJI.getClass();
            ZY5.LJII(2);
        }
        ((DialogC90863ZlL) iDCListenerS136S0100000_24.l0).dismiss();
    }

    public static final void onClick$6(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        DialogC90863ZlL dialogC90863ZlL = ((AbstractC90587Zgt) iDCListenerS136S0100000_24.l0).LJLJJI;
        if (dialogC90863ZlL.LJZL != null) {
            dialogC90863ZlL.LJLLLL.removeMessages(2);
        }
        AbstractC90587Zgt abstractC90587Zgt = (AbstractC90587Zgt) iDCListenerS136S0100000_24.l0;
        abstractC90587Zgt.LJLJJI.LJZL = abstractC90587Zgt.LJLIL;
        int i = 1;
        boolean z = !view.isActivated();
        if (z) {
            i = 0;
        } else {
            AbstractC90587Zgt abstractC90587Zgt2 = (AbstractC90587Zgt) iDCListenerS136S0100000_24.l0;
            Integer num = (Integer) ((HashMap) abstractC90587Zgt2.LJLJJI.LL).get(abstractC90587Zgt2.LJLIL.LIZJ);
            if (num != null) {
                i = Math.max(1, num.intValue());
            }
        }
        ((AbstractC90587Zgt) iDCListenerS136S0100000_24.l0).setMute(z);
        ((AbstractC90587Zgt) iDCListenerS136S0100000_24.l0).LJLJI.setProgress(i);
        ((AbstractC90587Zgt) iDCListenerS136S0100000_24.l0).LJLIL.LJIIIZ(i);
        ((AbstractC90587Zgt) iDCListenerS136S0100000_24.l0).LJLJJI.LJLLLL.sendEmptyMessageDelayed(2, 500L);
    }

    public static final void onClick$7(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        C90092ZXk c90092ZXk;
        boolean z;
        int i;
        C90092ZXk c90092ZXk2;
        C90862ZlK c90862ZlK = (C90862ZlK) iDCListenerS136S0100000_24.l0;
        boolean z2 = true;
        boolean z3 = !c90862ZlK.M(c90862ZlK.LJLIL);
        boolean LJ = ((C90862ZlK) iDCListenerS136S0100000_24.l0).LJLIL.LJ();
        int i2 = 0;
        if (z3) {
            C90862ZlK c90862ZlK2 = (C90862ZlK) iDCListenerS136S0100000_24.l0;
            ZY5 zy5 = c90862ZlK2.LJLLL.LJLL.LJLJI;
            ZY4 zy4 = c90862ZlK2.LJLIL;
            zy5.getClass();
            ZY5.LIZIZ();
            C90605ZhB c90605ZhB = ZY5.LIZJ;
            if (c90605ZhB.LJIIZILJ instanceof AbstractC90599Zh5) {
                ZY3 LIZ = c90605ZhB.LJIILLIIL.LIZ(zy4);
                if (!c90605ZhB.LJIILLIIL.LIZIZ().contains(zy4) && LIZ != null && (c90092ZXk2 = LIZ.LIZ) != null && c90092ZXk2.LIZLLL) {
                    ((AbstractC90599Zh5) c90605ZhB.LJIIZILJ).LJIILIIL(zy4.LIZIZ);
                }
            } else {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
        } else {
            C90862ZlK c90862ZlK3 = (C90862ZlK) iDCListenerS136S0100000_24.l0;
            ZY5 zy52 = c90862ZlK3.LJLLL.LJLL.LJLJI;
            ZY4 zy42 = c90862ZlK3.LJLIL;
            zy52.getClass();
            ZY5.LIZIZ();
            C90605ZhB c90605ZhB2 = ZY5.LIZJ;
            if (c90605ZhB2.LJIIZILJ instanceof AbstractC90599Zh5) {
                ZY3 LIZ2 = c90605ZhB2.LJIILLIIL.LIZ(zy42);
                if (c90605ZhB2.LJIILLIIL.LIZIZ().contains(zy42) && LIZ2 != null && (((c90092ZXk = LIZ2.LIZ) == null || c90092ZXk.LIZJ) && c90605ZhB2.LJIILLIIL.LIZIZ().size() > 1)) {
                    ((AbstractC90599Zh5) c90605ZhB2.LJIIZILJ).LJIILJJIL(zy42.LIZIZ);
                }
            } else {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
        }
        ((C90862ZlK) iDCListenerS136S0100000_24.l0).N(z3, !LJ);
        if (LJ) {
            List<ZY4> LIZIZ = ((C90862ZlK) iDCListenerS136S0100000_24.l0).LJLLL.LJLL.LJLJJLL.LIZIZ();
            for (ZY4 zy43 : ((C90862ZlK) iDCListenerS136S0100000_24.l0).LJLIL.LIZIZ()) {
                if (LIZIZ.contains(zy43) != z3) {
                    AbstractC90587Zgt abstractC90587Zgt = (AbstractC90587Zgt) ((HashMap) ((C90862ZlK) iDCListenerS136S0100000_24.l0).LJLLL.LJLL.LJZI).get(zy43.LIZJ);
                    if (abstractC90587Zgt instanceof C90862ZlK) {
                        ((C90862ZlK) abstractC90587Zgt).N(z3, true);
                    }
                }
            }
        }
        C90862ZlK c90862ZlK4 = (C90862ZlK) iDCListenerS136S0100000_24.l0;
        C90591Zgx c90591Zgx = c90862ZlK4.LJLLL;
        ZY4 zy44 = c90862ZlK4.LJLIL;
        List<ZY4> LIZIZ2 = c90591Zgx.LJLL.LJLJJLL.LIZIZ();
        int max = Math.max(1, LIZIZ2.size());
        int i3 = -1;
        if (zy44.LJ()) {
            Iterator<ZY4> it = zy44.LIZIZ().iterator();
            while (it.hasNext()) {
                if (LIZIZ2.contains(it.next()) != z3) {
                    if (z3) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    max += i;
                }
            }
        } else {
            if (z3) {
                i3 = 1;
            }
            max += i3;
        }
        if (c90591Zgx.LJLL.LJLJJLL.LIZIZ().size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (max < 2) {
            z2 = false;
        }
        if (z != z2) {
            RecyclerView.ViewHolder LJJIZ = c90591Zgx.LJLL.LJLLLLLL.LJJIZ(0);
            if (LJJIZ instanceof C90861ZlJ) {
                C90861ZlJ c90861ZlJ = (C90861ZlJ) LJJIZ;
                View view2 = c90861ZlJ.itemView;
                if (z2) {
                    i2 = c90861ZlJ.LJLJJLL;
                }
                c90591Zgx.LJLLLLLL(i2, view2);
            }
        }
    }

    public static final void onClick$8(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        C90092ZXk c90092ZXk;
        C90589Zgv c90589Zgv = (C90589Zgv) iDCListenerS136S0100000_24.l0;
        ZY5 zy5 = c90589Zgv.LJLJL.LJLL.LJLJI;
        ZY4 zy4 = c90589Zgv.LJLJJLL;
        zy5.getClass();
        ZY5.LIZIZ();
        C90605ZhB c90605ZhB = ZY5.LIZJ;
        if (c90605ZhB.LJIIZILJ instanceof AbstractC90599Zh5) {
            ZY3 LIZ = c90605ZhB.LJIILLIIL.LIZ(zy4);
            if (LIZ != null && (c90092ZXk = LIZ.LIZ) != null && c90092ZXk.LJ) {
                ((AbstractC90599Zh5) c90605ZhB.LJIIZILJ).LJIILL(Collections.singletonList(zy4.LIZIZ));
            }
            ((C90589Zgv) iDCListenerS136S0100000_24.l0).LJLILLLLZI.setVisibility(4);
            ((C90589Zgv) iDCListenerS136S0100000_24.l0).LJLJI.setVisibility(0);
            return;
        }
        throw new IllegalStateException("There is no currently selected dynamic group route.");
    }

    public static final void onClick$9(IDCListenerS136S0100000_24 iDCListenerS136S0100000_24, View view) {
        C90571Zgd c90571Zgd = (C90571Zgd) iDCListenerS136S0100000_24.l0;
        boolean z = !c90571Zgd.LJLJLJ;
        c90571Zgd.LJLJLJ = z;
        if (z) {
            c90571Zgd.setImageDrawable(c90571Zgd.LJLJJI);
            ((C90571Zgd) iDCListenerS136S0100000_24.l0).LJLJJI.start();
            C90571Zgd c90571Zgd2 = (C90571Zgd) iDCListenerS136S0100000_24.l0;
            c90571Zgd2.setContentDescription(c90571Zgd2.LJLJL);
        } else {
            c90571Zgd.setImageDrawable(c90571Zgd.LJLJJL);
            ((C90571Zgd) iDCListenerS136S0100000_24.l0).LJLJJL.start();
            C90571Zgd c90571Zgd3 = (C90571Zgd) iDCListenerS136S0100000_24.l0;
            c90571Zgd3.setContentDescription(c90571Zgd3.LJLJJLL);
        }
        View.OnClickListener onClickListener = ((C90571Zgd) iDCListenerS136S0100000_24.l0).LJLJLLL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
