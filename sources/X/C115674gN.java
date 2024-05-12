package X;

import Y.AUListenerS90S0100000_1;
import Y.IDObjectS1S0101000_1;
import Y.IDObjectS326S0100000_1;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115674gN {
    public static final C115674gN LIZ = new C115674gN();
    public static ValueAnimator LIZIZ;

    public static void LIZ(C115684gO c115684gO) {
        if (c115684gO == null) {
            return;
        }
        SparseArray<Integer> sparseArray = c115684gO.LJI;
        FrameLayout frameLayout = c115684gO.LJFF;
        if (frameLayout != null) {
            Iterator it = new IDObjectS326S0100000_1(frameLayout, 2).iterator();
            while (true) {
                IDObjectS1S0101000_1 iDObjectS1S0101000_1 = (IDObjectS1S0101000_1) it;
                if (!iDObjectS1S0101000_1.hasNext()) {
                    break;
                }
                View view = (View) iDObjectS1S0101000_1.next();
                if (sparseArray.get(view.getId()) != null) {
                    Integer num = sparseArray.get(view.getId());
                    o.LJIIIIZZ(num, "views.get(it.id)");
                    view.setVisibility(num.intValue());
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("shareCompleteClick, status is null for id ");
                    LIZ2.append(view.getId());
                    C36922EeM.LIZLLL(4, "FeedShareHelper", X1D.LIZIZ(LIZ2));
                }
            }
        }
        C2U8.LIZ(new C2MC());
    }

    public static void LIZIZ(C115684gO c115684gO) {
        FrameLayout frameLayout;
        if (c115684gO == null || (frameLayout = c115684gO.LJFF) == null) {
            return;
        }
        int childCount = frameLayout.getChildCount();
        SparseArray<Integer> sparseArray = new SparseArray<>();
        for (int i = 0; i < childCount; i++) {
            View childAt = c115684gO.LJFF.getChildAt(i);
            o.LJIIIIZZ(childAt, "viewProvider.bottomView.getChildAt(i)");
            sparseArray.put(childAt.getId(), Integer.valueOf(childAt.getVisibility()));
            childAt.setVisibility(8);
        }
        c115684gO.LJI = sparseArray;
    }

    public static void LIZJ(C115684gO c115684gO, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator;
        View view = c115684gO.LIZIZ;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c115684gO.LIZIZ.getHeight(), 0.0f);
        LIZIZ = ofFloat;
        if (ofFloat != null) {
            ofFloat.addUpdateListener(new AUListenerS90S0100000_1(c115684gO, 4));
        }
        if (animatorListenerAdapter != null && (valueAnimator = LIZIZ) != null) {
            valueAnimator.addListener(animatorListenerAdapter);
        }
        ValueAnimator valueAnimator2 = LIZIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(300L);
        }
        ValueAnimator valueAnimator3 = LIZIZ;
        if (valueAnimator3 == null) {
            return;
        }
        valueAnimator3.start();
    }

    public static void LIZLLL(Object obj, C115684gO c115684gO) {
        IMContact contact;
        String displayName;
        String string;
        String displayName2;
        String string2;
        Resources resources = EF7.LIZIZ().getResources();
        int i = 8;
        if (obj instanceof C9BZ) {
            TuxIconView tuxIconView = c115684gO.LIZLLL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TextView textView = c115684gO.LJ;
            if (textView != null) {
                if (((C9BZ) obj).LJLJJI instanceof IMUser) {
                    i = 0;
                }
                textView.setVisibility(i);
            }
            TuxTextView tuxTextView = c115684gO.LIZ;
            if (tuxTextView != null) {
                C9BZ c9bz = (C9BZ) obj;
                if (c9bz.LJLJJL) {
                    string2 = resources.getString(R.string.qis, c9bz.LJLJJI.getDisplayName());
                } else {
                    string2 = resources.getString(R.string.qir, c9bz.LJLJJI.getDisplayName());
                }
                tuxTextView.setText(string2);
            }
            TuxIconView tuxIconView2 = c115684gO.LIZJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_paperplane_fill);
            }
        } else if (obj instanceof C107794Kx) {
            C107794Kx c107794Kx = (C107794Kx) obj;
            List<IMContact> list = c107794Kx.LJLILLLLZI;
            if (list == null || (contact = (IMContact) ORZ.LJLLLL(list)) == null) {
                contact = c107794Kx.LJLIL;
            }
            TuxTextView tuxTextView2 = c115684gO.LIZ;
            if (tuxTextView2 != null) {
                if (c107794Kx.LJLJI) {
                    Object[] objArr = new Object[1];
                    o.LJIIIIZZ(contact, "contact");
                    if (!(contact instanceof IMUser)) {
                        displayName2 = contact.getDisplayName();
                        o.LJIIIIZZ(displayName2, "contact.displayName");
                    } else {
                        displayName2 = contact.getDisplayName();
                        o.LJIIIIZZ(displayName2, "contact.displayName");
                    }
                    objArr[0] = displayName2;
                    string = resources.getString(R.string.h0o, objArr);
                } else if ((c107794Kx.LJLIL instanceof IMConversation) && c107794Kx.LJLJLJ) {
                    string = resources.getString(R.string.gvm);
                } else {
                    Object[] objArr2 = new Object[1];
                    o.LJIIIIZZ(contact, "contact");
                    if (!(contact instanceof IMUser)) {
                        displayName = contact.getDisplayName();
                        o.LJIIIIZZ(displayName, "contact.displayName");
                    } else {
                        displayName = contact.getDisplayName();
                        o.LJIIIIZZ(displayName, "contact.displayName");
                    }
                    objArr2[0] = displayName;
                    string = resources.getString(R.string.h0n, objArr2);
                }
                tuxTextView2.setText(string);
            }
            TuxIconView tuxIconView3 = c115684gO.LIZLLL;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(0);
            }
            TextView textView2 = c115684gO.LJ;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TuxIconView tuxIconView4 = c115684gO.LIZJ;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconRes(R.raw.icon_tick_circle_fill);
            }
        } else if (obj instanceof C232629Ba) {
            TuxIconView tuxIconView5 = c115684gO.LIZLLL;
            if (tuxIconView5 != null) {
                tuxIconView5.setVisibility(8);
            }
            TextView textView3 = c115684gO.LJ;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TuxTextView tuxTextView3 = c115684gO.LIZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(EF7.LIZIZ().getResources().getString(R.string.g8n));
            }
            TuxIconView tuxIconView6 = c115684gO.LIZJ;
            if (tuxIconView6 != null) {
                tuxIconView6.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            }
        }
        float LIZJ = KL2.LIZJ(EF7.LIZIZ(), 32.0f);
        View view = c115684gO.LIZIZ;
        if (view != null) {
            view.getLayoutParams().height = 0;
            view.requestLayout();
            view.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, LIZJ);
            ofFloat.addUpdateListener(new AUListenerS90S0100000_1(view, 5));
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }
}
