package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.VfA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80288VfA extends AbstractC029409q<AbstractC80300VfM> {
    public final ArrayList<InterfaceC80303VfP> LJLIL = new ArrayList<>();
    public C281618q LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ C80290VfC LJLJJI;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    public final void LJLLLLLL() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        this.LJLIL.clear();
        this.LJLIL.add(new C80302VfO());
        int size = this.LJLJJI.LJLJI.LJIIJJI().size();
        boolean z = false;
        int i = -1;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < size) {
            C281618q c281618q = (C281618q) ListProtector.get(this.LJLJJI.LJLJI.LJIIJJI(), i2);
            if (c281618q.isChecked()) {
                LJLZ(c281618q);
            }
            if (c281618q.isCheckable()) {
                c281618q.LJI(z);
            }
            if (c281618q.hasSubMenu()) {
                SubMenuC39851hN subMenuC39851hN = c281618q.LJIILJJIL;
                if (subMenuC39851hN.hasVisibleItems()) {
                    if (i2 != 0) {
                        this.LJLIL.add(new C80299VfL(this.LJLJJI.LJZI, z ? 1 : 0));
                    }
                    this.LJLIL.add(new C80297VfJ(c281618q));
                    int size2 = subMenuC39851hN.size();
                    int i4 = 0;
                    boolean z3 = false;
                    while (i4 < size2) {
                        C281618q c281618q2 = (C281618q) subMenuC39851hN.getItem(i4);
                        if (c281618q2.isVisible()) {
                            if (!z3 && c281618q2.getIcon() != null) {
                                z3 = true;
                            }
                            if (c281618q2.isCheckable()) {
                                c281618q2.LJI(z);
                            }
                            if (c281618q.isChecked()) {
                                LJLZ(c281618q);
                            }
                            this.LJLIL.add(new C80297VfJ(c281618q2));
                        }
                        i4++;
                        z = false;
                    }
                    if (z3) {
                        int size3 = this.LJLIL.size();
                        for (int size4 = this.LJLIL.size(); size4 < size3; size4++) {
                            ((C80297VfJ) ListProtector.get(this.LJLIL, size4)).LIZIZ = true;
                        }
                    }
                }
            } else {
                int i5 = c281618q.LIZIZ;
                if (i5 != i) {
                    i3 = this.LJLIL.size();
                    if (c281618q.getIcon() != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i2 != 0) {
                        i3++;
                        ArrayList<InterfaceC80303VfP> arrayList = this.LJLIL;
                        int i6 = this.LJLJJI.LJZI;
                        arrayList.add(new C80299VfL(i6, i6));
                    }
                } else if (!z2 && c281618q.getIcon() != null) {
                    int size5 = this.LJLIL.size();
                    for (int i7 = i3; i7 < size5; i7++) {
                        ((C80297VfJ) ListProtector.get(this.LJLIL, i7)).LIZIZ = true;
                    }
                    z2 = true;
                }
                C80297VfJ c80297VfJ = new C80297VfJ(c281618q);
                c80297VfJ.LIZIZ = z2;
                this.LJLIL.add(c80297VfJ);
                i = i5;
            }
            i2++;
            z = false;
        }
        this.LJLJI = z;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C80288VfA(C80290VfC c80290VfC) {
        this.LJLJJI = c80290VfC;
        LJLLLLLL();
    }

    public final void LJLZ(C281618q c281618q) {
        if (this.LJLILLLLZI == c281618q || !c281618q.isCheckable()) {
            return;
        }
        C281618q c281618q2 = this.LJLILLLLZI;
        if (c281618q2 != null) {
            c281618q2.setChecked(false);
        }
        this.LJLILLLLZI = c281618q;
        c281618q.setChecked(true);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        InterfaceC80303VfP interfaceC80303VfP = (InterfaceC80303VfP) ListProtector.get(this.LJLIL, i);
        if (interfaceC80303VfP instanceof C80299VfL) {
            return 2;
        }
        if (interfaceC80303VfP instanceof C80302VfO) {
            return 3;
        }
        if (interfaceC80303VfP instanceof C80297VfJ) {
            if (((C80297VfJ) interfaceC80303VfP).LIZ.hasSubMenu()) {
                return 1;
            }
            return 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(AbstractC80300VfM abstractC80300VfM) {
        if (abstractC80300VfM instanceof C80293VfF) {
            C80286Vf8 c80286Vf8 = (C80286Vf8) abstractC80300VfM.itemView;
            FrameLayout frameLayout = c80286Vf8.LLFII;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            c80286Vf8.LLFFF.setCompoundDrawables(null, null, null, null);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC80300VfM abstractC80300VfM, int i) {
        Drawable drawable;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                C80299VfL c80299VfL = (C80299VfL) ListProtector.get(this.LJLIL, i);
                abstractC80300VfM.itemView.setPadding(0, c80299VfL.LIZ, 0, c80299VfL.LIZIZ);
                return;
            }
            ((TextView) abstractC80300VfM.itemView).setText(((C80297VfJ) ListProtector.get(this.LJLIL, i)).LIZ.LJ);
            return;
        }
        C80286Vf8 c80286Vf8 = (C80286Vf8) abstractC80300VfM.itemView;
        c80286Vf8.setIconTintList(this.LJLJJI.LJLL);
        C80290VfC c80290VfC = this.LJLJJI;
        if (c80290VfC.LJLJLJ) {
            c80286Vf8.setTextAppearance(c80290VfC.LJLJL);
        }
        ColorStateList colorStateList = this.LJLJJI.LJLJLLL;
        if (colorStateList != null) {
            c80286Vf8.setTextColor(colorStateList);
        }
        Drawable drawable2 = this.LJLJJI.LJLLI;
        if (drawable2 != null) {
            drawable = drawable2.getConstantState().newDrawable();
        } else {
            drawable = null;
        }
        C16300kU.LJIILLIIL(c80286Vf8, drawable);
        C80297VfJ c80297VfJ = (C80297VfJ) ListProtector.get(this.LJLIL, i);
        c80286Vf8.setNeedsEmptyIcon(c80297VfJ.LIZIZ);
        c80286Vf8.setHorizontalPadding(this.LJLJJI.LJLLILLLL);
        c80286Vf8.setIconPadding(this.LJLJJI.LJLLJ);
        C80290VfC c80290VfC2 = this.LJLJJI;
        if (c80290VfC2.LJLLLL) {
            c80286Vf8.setIconSize(c80290VfC2.LJLLL);
        }
        c80286Vf8.setMaxLines(this.LJLJJI.LJLZ);
        c80286Vf8.LJIIIIZZ(c80297VfJ.LIZ);
    }

    @Override // X.AbstractC029409q
    public final AbstractC80300VfM onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC80300VfM c80293VfF;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        c80293VfF = null;
                    } else {
                        c80293VfF = new C80301VfN(this.LJLJJI.LJLILLLLZI);
                    }
                } else {
                    c80293VfF = new C80294VfG(this.LJLJJI.LJLJJLL, viewGroup);
                }
            } else {
                c80293VfF = new C80295VfH(this.LJLJJI.LJLJJLL, viewGroup);
            }
        } else {
            C80290VfC c80290VfC = this.LJLJJI;
            c80293VfF = new C80293VfF(c80290VfC.LJLJJLL, viewGroup, c80290VfC.LL);
        }
        C0AX.LIZ(viewGroup, c80293VfF.itemView, R.id.lj7);
        View view = c80293VfF.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c80293VfF.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c80293VfF.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c80293VfF.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c80293VfF.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c80293VfF.getClass().getName();
        return c80293VfF;
    }
}
