package androidx.appcompat.widget;

import X.AbstractC281018k;
import X.AbstractC37391dP;
import X.AnonymousClass191;
import X.C02M;
import X.C02N;
import X.C02P;
import X.C02U;
import X.C16880lQ;
import X.C25560zQ;
import X.C281318n;
import X.C281618q;
import X.C281818s;
import X.C281918t;
import X.C282118v;
import X.C282218w;
import X.C282318x;
import X.C282518z;
import X.SubMenuC39851hN;
import X.ViewOnClickListenerC39821hK;
import Y.IDCreatorS45S0000000;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ActionMenuPresenter extends AbstractC281018k {
    public C282118v LJLL;
    public Drawable LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public final SparseBooleanArray LJZI;
    public C282218w LJZL;
    public C281818s LL;
    public C02U LLD;
    public C281918t LLF;
    public final C282318x LLFF;
    public int LLFFF;

    @Override // X.C02O
    public final Parcelable LIZIZ() {
        SavedState savedState = new SavedState();
        savedState.openSubMenuId = this.LLFFF;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e9, code lost:
    
        if (r3 != false) goto L58;
     */
    @Override // X.C02O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.LJII():boolean");
    }

    public final boolean LJIIJJI() {
        Object obj;
        C02U c02u = this.LLD;
        if (c02u != null && (obj = this.LJLJLJ) != null) {
            ((View) obj).removeCallbacks(c02u);
            this.LLD = null;
            return true;
        }
        C282218w c282218w = this.LJZL;
        if (c282218w != null) {
            if (c282218w.LIZIZ()) {
                c282218w.LJIIIZ.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean LJIIL() {
        C282218w c282218w = this.LJZL;
        if (c282218w != null && c282218w.LIZIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.02U, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.18w] */
    public final boolean LJIILIIL() {
        C281318n c281318n;
        if (this.LJLLJ && !LJIIL() && (c281318n = this.LJLJI) != null && this.LJLJLJ != null && this.LLD == null) {
            c281318n.LJIIIIZZ();
            if (!c281318n.LJIIIZ.isEmpty()) {
                final Context context = this.LJLILLLLZI;
                final C281318n c281318n2 = this.LJLJI;
                final C282118v c282118v = this.LJLL;
                final ?? r3 = new C02M(context, c281318n2, c282118v) { // from class: X.18w
                    @Override // X.C02M
                    public final void LIZJ() {
                        C281318n c281318n3 = ActionMenuPresenter.this.LJLJI;
                        if (c281318n3 != null) {
                            c281318n3.LIZJ(true);
                        }
                        ActionMenuPresenter.this.LJZL = null;
                        super.LIZJ();
                    }

                    {
                        this.LJI = 8388613;
                        C282318x c282318x = ActionMenuPresenter.this.LLFF;
                        this.LJIIIIZZ = c282318x;
                        AbstractC37391dP abstractC37391dP = this.LJIIIZ;
                        if (abstractC37391dP != null) {
                            abstractC37391dP.LJIIIZ(c282318x);
                        }
                    }
                };
                ?? r1 = new Runnable(r3) { // from class: X.02U
                    public final C282218w LJLIL;

                    public final void LIZ() {
                        C02J c02j;
                        C281318n c281318n3 = ActionMenuPresenter.this.LJLJI;
                        if (c281318n3 != null && (c02j = c281318n3.LJ) != null) {
                            c02j.LIZ(c281318n3);
                        }
                        View view = (View) ActionMenuPresenter.this.LJLJLJ;
                        if (view != null && view.getWindowToken() != null) {
                            C282218w c282218w = this.LJLIL;
                            if (!c282218w.LIZIZ()) {
                                if (c282218w.LJFF != null) {
                                    c282218w.LIZLLL(0, 0, false, false);
                                }
                            }
                            ActionMenuPresenter.this.LJZL = this.LJLIL;
                        }
                        ActionMenuPresenter.this.LLD = null;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    {
                        this.LJLIL = r3;
                    }
                };
                this.LLD = r1;
                ((View) this.LJLJLJ).post(r1);
                return true;
            }
            return false;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new IDCreatorS45S0000000(13);
        public int openSubMenuId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.18x] */
    public ActionMenuPresenter(Context context) {
        super(context);
        this.LJZI = new SparseBooleanArray();
        this.LLFF = new C02N() { // from class: X.18x
            @Override // X.C02N
            public final boolean LIZIZ(C281318n c281318n) {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (c281318n == actionMenuPresenter.LJLJI) {
                    return false;
                }
                actionMenuPresenter.LLFFF = ((SubMenuC39851hN) c281318n).LJJII.LIZ;
                C02N c02n = actionMenuPresenter.LJLJJL;
                if (c02n == null) {
                    return false;
                }
                return c02n.LIZIZ(c281318n);
            }

            @Override // X.C02N
            public final void LIZ(C281318n c281318n, boolean z) {
                if (c281318n instanceof SubMenuC39851hN) {
                    c281318n.LJIIJ().LIZJ(false);
                }
                C02N c02n = ActionMenuPresenter.this.LJLJJL;
                if (c02n != null) {
                    c02n.LIZ(c281318n, z);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C02O
    public final void LIZJ(boolean z) {
        int i;
        C281618q c281618q;
        int size;
        ViewGroup viewGroup = (ViewGroup) this.LJLJLJ;
        ArrayList<C281618q> arrayList = null;
        if (viewGroup != null) {
            C281318n c281318n = this.LJLJI;
            if (c281318n != null) {
                c281318n.LJIIIIZZ();
                ArrayList<C281618q> LJIIJJI = this.LJLJI.LJIIJJI();
                int size2 = LJIIJJI.size();
                i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    C281618q c281618q2 = (C281618q) ListProtector.get(LJIIJJI, i2);
                    if ((c281618q2.LJJ & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof C02P) {
                            c281618q = ((C02P) childAt).getItemData();
                        } else {
                            c281618q = null;
                        }
                        View LIZLLL = LIZLLL(c281618q2, childAt, viewGroup);
                        if (c281618q2 != c281618q) {
                            LIZLLL.setPressed(false);
                            LIZLLL.jumpDrawablesToCurrentState();
                        }
                        if (LIZLLL != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) LIZLLL.getParent();
                            if (viewGroup2 != null) {
                                C16880lQ.LJLLL(LIZLLL, viewGroup2);
                            }
                            ((ViewGroup) this.LJLJLJ).addView(LIZLLL, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.LJLL) {
                    i++;
                } else {
                    C16880lQ.LLIFFJFJJ(i, viewGroup);
                }
            }
        }
        ((View) this.LJLJLJ).requestLayout();
        C281318n c281318n2 = this.LJLJI;
        if (c281318n2 != null) {
            c281318n2.LJIIIIZZ();
            ArrayList<C281618q> arrayList2 = c281318n2.LJIIIIZZ;
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
            }
        }
        C281318n c281318n3 = this.LJLJI;
        if (c281318n3 != null) {
            c281318n3.LJIIIIZZ();
            arrayList = c281318n3.LJIIIZ;
        }
        if (this.LJLLJ && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((C281618q) ListProtector.get(arrayList, 0)).LJJIIJ))) {
            if (this.LJLL == null) {
                this.LJLL = new C282118v(this, this.LJLIL);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.LJLL.getParent();
            if (viewGroup3 != this.LJLJLJ) {
                if (viewGroup3 != null) {
                    C16880lQ.LJLLL(this.LJLL, viewGroup3);
                }
                ViewGroup viewGroup4 = (ViewGroup) this.LJLJLJ;
                C282118v c282118v = this.LJLL;
                viewGroup4.getClass();
                C282518z c282518z = new C282518z();
                ((LinearLayout.LayoutParams) c282518z).gravity = 16;
                c282518z.LIZ = true;
                viewGroup4.addView(c282118v, c282518z);
            }
        } else {
            C282118v c282118v2 = this.LJLL;
            if (c282118v2 != null) {
                Object parent = c282118v2.getParent();
                Object obj = this.LJLJLJ;
                if (parent == obj) {
                    C16880lQ.LJLLL(this.LJLL, (ViewGroup) obj);
                }
            }
        }
        ((AnonymousClass191) this.LJLJLJ).setOverflowReserved(this.LJLLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.02M, X.18s] */
    @Override // X.C02O
    public final boolean LJFF(final SubMenuC39851hN subMenuC39851hN) {
        boolean z;
        if (!subMenuC39851hN.hasVisibleItems()) {
            return false;
        }
        SubMenuC39851hN subMenuC39851hN2 = subMenuC39851hN;
        while (true) {
            C281318n c281318n = subMenuC39851hN2.LJJIFFI;
            if (c281318n == this.LJLJI) {
                break;
            }
            subMenuC39851hN2 = (SubMenuC39851hN) c281318n;
        }
        C281618q c281618q = subMenuC39851hN2.LJJII;
        ViewGroup viewGroup = (ViewGroup) this.LJLJLJ;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                final View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C02P) && ((C02P) childAt).getItemData() == c281618q) {
                    if (childAt != 0) {
                        this.LLFFF = subMenuC39851hN.LJJII.LIZ;
                        int size = subMenuC39851hN.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                MenuItem item = subMenuC39851hN.getItem(i2);
                                if (item.isVisible() && item.getIcon() != null) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        final Context context = this.LJLILLLLZI;
                        ?? r1 = new C02M(context, subMenuC39851hN, childAt) { // from class: X.18s
                            @Override // X.C02M
                            public final void LIZJ() {
                                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                                actionMenuPresenter.LL = null;
                                actionMenuPresenter.LLFFF = 0;
                                super.LIZJ();
                            }

                            {
                                if ((subMenuC39851hN.LJJII.LJJ & 32) != 32) {
                                    View view = ActionMenuPresenter.this.LJLL;
                                    this.LJFF = view == null ? (View) ActionMenuPresenter.this.LJLJLJ : view;
                                }
                                C282318x c282318x = ActionMenuPresenter.this.LLFF;
                                this.LJIIIIZZ = c282318x;
                                AbstractC37391dP abstractC37391dP = this.LJIIIZ;
                                if (abstractC37391dP != null) {
                                    abstractC37391dP.LJIIIZ(c282318x);
                                }
                            }
                        };
                        this.LL = r1;
                        r1.LJII = z;
                        AbstractC37391dP abstractC37391dP = r1.LJIIIZ;
                        if (abstractC37391dP != null) {
                            abstractC37391dP.LJIILJJIL(z);
                        }
                        C281818s c281818s = this.LL;
                        if (!c281818s.LIZIZ()) {
                            if (c281818s.LJFF == null) {
                                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                            }
                            c281818s.LIZLLL(0, 0, false, false);
                        }
                        C02N c02n = this.LJLJJL;
                        if (c02n != null) {
                            c02n.LIZIZ(subMenuC39851hN);
                        }
                        return true;
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    @Override // X.C02O
    public final void LJIIJ(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).openSubMenuId) > 0 && (findItem = this.LJLJI.findItem(i)) != null) {
            LJFF((SubMenuC39851hN) findItem.getSubMenu());
        }
    }

    @Override // X.C02O
    public final void LIZ(C281318n c281318n, boolean z) {
        LJIIJJI();
        C281818s c281818s = this.LL;
        if (c281818s != null && c281818s.LIZIZ()) {
            c281818s.LJIIIZ.dismiss();
        }
        C02N c02n = this.LJLJJL;
        if (c02n != null) {
            c02n.LIZ(c281318n, z);
        }
    }

    @Override // X.C02O
    public final void LJIIIIZZ(Context context, C281318n c281318n) {
        this.LJLILLLLZI = context;
        C16880lQ.LLZIL(context);
        this.LJLJI = c281318n;
        Resources resources = context.getResources();
        C25560zQ c25560zQ = new C25560zQ(context);
        if (!this.LJLLL) {
            this.LJLLJ = true;
        }
        this.LJLLLL = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.LJLZ = c25560zQ.LIZ();
        int i = this.LJLLLL;
        if (this.LJLLJ) {
            if (this.LJLL == null) {
                C282118v c282118v = new C282118v(this, this.LJLIL);
                this.LJLL = c282118v;
                if (this.LJLLILLLL) {
                    c282118v.setImageDrawable(this.LJLLI);
                    this.LJLLI = null;
                    this.LJLLILLLL = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.LJLL.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.LJLL.getMeasuredWidth();
        } else {
            this.LJLL = null;
        }
        this.LJLLLLLL = i;
        resources.getDisplayMetrics();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.02P] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final View LIZLLL(C281618q c281618q, View view, ViewGroup viewGroup) {
        ViewOnClickListenerC39821hK viewOnClickListenerC39821hK;
        View actionView = c281618q.getActionView();
        int i = 0;
        if (actionView == null || c281618q.LJ()) {
            if (view instanceof C02P) {
                viewOnClickListenerC39821hK = (C02P) view;
            } else {
                viewOnClickListenerC39821hK = (C02P) C16880lQ.LLLLIILL(this.LJLJJI, this.LJLJL, viewGroup, false);
            }
            viewOnClickListenerC39821hK.LJIIIIZZ(c281618q);
            ViewOnClickListenerC39821hK viewOnClickListenerC39821hK2 = viewOnClickListenerC39821hK;
            viewOnClickListenerC39821hK2.setItemInvoker((AnonymousClass191) this.LJLJLJ);
            if (this.LLF == null) {
                this.LLF = new C281918t(this);
            }
            viewOnClickListenerC39821hK2.setPopupCallback(this.LLF);
            actionView = viewOnClickListenerC39821hK;
        }
        if (c281618q.LJJIIJ) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((LinearLayoutCompat) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(AnonymousClass191.LJIIIZ(layoutParams));
        }
        return actionView;
    }
}
