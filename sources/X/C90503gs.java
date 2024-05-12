package X;

import Y.IDObjectS326S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90503gs extends LinearLayout {
    public static final int LJLJJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
    public int LJLIL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLILLLLZI;
    public final List<Integer> LJLJI;

    public final InterfaceC88472Yns<Integer, C76800UCe> getClickStrategy() {
        return this.LJLILLLLZI;
    }

    public final void setClickStrategy(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    public final void setCurIndex(int i) {
        boolean z;
        if (this.LJLIL != i) {
            this.LJLIL = i;
            Iterator it = new IDObjectS326S0100000_1(this, 5).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view = (View) next;
                    if (view instanceof C85523Xg) {
                        C85523Xg c85523Xg = (C85523Xg) view;
                        if (i2 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c85523Xg.setIsSelected(z);
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void setTabPosition(int i) {
        int LJJI = C47261Igj.LJJI(this.LJLJI);
        while (true) {
            if (-1 < LJJI) {
                if (i >= ((Number) ListProtector.get(this.LJLJI, LJJI)).intValue()) {
                    break;
                } else {
                    LJJI--;
                }
            } else {
                LJJI = 0;
                break;
            }
        }
        setCurIndex(LJJI);
    }

    public final void setTabPositionList(List<Integer> list) {
        if (list == null) {
            return;
        }
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJI).addAll(list);
    }

    public final void setTitles(List<String> list) {
        boolean z;
        if (list == null) {
            return;
        }
        if (getChildCount() > 0) {
            removeAllViews();
        }
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                C85523Xg c85523Xg = new C85523Xg(context);
                c85523Xg.setTitle(str);
                if (i == this.LJLIL) {
                    z = true;
                } else {
                    z = false;
                }
                c85523Xg.setIsSelected(z);
                c85523Xg.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(76)));
                C16880lQ.LJIIJ(new TAT() { // from class: X.3gt
                    {
                        super(700L);
                    }

                    @Override // X.TAT
                    public final void LIZ(View view) {
                        int LJLZ;
                        if (view != null && (LJLZ = ORZ.LJLZ(view, new IDObjectS326S0100000_1(C90503gs.this, 12))) >= 0) {
                            C90503gs c90503gs = C90503gs.this;
                            if (c90503gs.LJLIL != LJLZ) {
                                InterfaceC88472Yns<Integer, C76800UCe> clickStrategy = c90503gs.getClickStrategy();
                                if (clickStrategy != null) {
                                    clickStrategy.invoke(Integer.valueOf(LJLZ));
                                }
                                C90503gs.this.setCurIndex(LJLZ);
                            }
                            C90503gs.this.LJLIL = LJLZ;
                        }
                    }
                }, c85523Xg);
                addView(c85523Xg, new LinearLayout.LayoutParams(-2, -1));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90503gs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = new ArrayList();
        setBackgroundResource(R.drawable.abe);
        int i = LJLJJI;
        setPadding(i, i, i, i);
    }
}
