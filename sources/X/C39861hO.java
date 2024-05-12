package X;

import Y.IDLListenerS188S0100000;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* renamed from: X.1hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39861hO extends C19M implements InterfaceC009902d {
    public CharSequence LLIFFJFJJ;
    public ListAdapter LLII;
    public final Rect LLIIII;
    public int LLIIIILZ;
    public final /* synthetic */ C010002e LLIIIJ;

    public final void LJIILLIIL() {
        int i;
        int i2;
        Drawable LIZ = LIZ();
        if (LIZ != null) {
            LIZ.getPadding(this.LLIIIJ.LJLJLJ);
            if (C03Q.LIZ(this.LLIIIJ)) {
                i = this.LLIIIJ.LJLJLJ.right;
            } else {
                i = -this.LLIIIJ.LJLJLJ.left;
            }
        } else {
            Rect rect = this.LLIIIJ.LJLJLJ;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.LLIIIJ.getPaddingLeft();
        int paddingRight = this.LLIIIJ.getPaddingRight();
        int width = this.LLIIIJ.getWidth();
        C010002e c010002e = this.LLIIIJ;
        int i3 = c010002e.LJLJL;
        if (i3 == -2) {
            int LIZ2 = c010002e.LIZ((SpinnerAdapter) this.LLII, LIZ());
            int i4 = this.LLIIIJ.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.LLIIIJ.LJLJLJ;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (LIZ2 > i5) {
                LIZ2 = i5;
            }
            LJIILL(Math.max(LIZ2, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            LJIILL((width - paddingLeft) - paddingRight);
        } else {
            LJIILL(i3);
        }
        if (C03Q.LIZ(this.LLIIIJ)) {
            i2 = (((width - paddingRight) - this.LJLJJL) - this.LLIIIILZ) + i;
        } else {
            i2 = paddingLeft + this.LLIIIILZ + i;
        }
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC009902d
    public final CharSequence LJIIJJI() {
        return this.LLIFFJFJJ;
    }

    @Override // X.InterfaceC009902d
    public final void LJII(int i) {
        this.LLIIIILZ = i;
    }

    @Override // X.InterfaceC009902d
    public final void LJIIL(CharSequence charSequence) {
        this.LLIFFJFJJ = charSequence;
    }

    @Override // X.C19M, X.InterfaceC009902d
    public final void LJIILIIL(ListAdapter listAdapter) {
        super.LJIILIIL(listAdapter);
        this.LLII = listAdapter;
    }

    @Override // X.InterfaceC009902d
    public final void LIZIZ(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean isShowing = isShowing();
        LJIILLIIL();
        this.LLFFF.setInputMethodMode(2);
        show();
        C03G c03g = this.LJLJI;
        c03g.setChoiceMode(1);
        c03g.setTextDirection(i);
        c03g.setTextAlignment(i2);
        int selectedItemPosition = this.LLIIIJ.getSelectedItemPosition();
        C03G c03g2 = this.LJLJI;
        if (isShowing() && c03g2 != null) {
            c03g2.setListSelectionHidden(false);
            c03g2.setSelection(selectedItemPosition);
            if (c03g2.getChoiceMode() != 0) {
                c03g2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = this.LLIIIJ.getViewTreeObserver()) != null) {
            final IDLListenerS188S0100000 iDLListenerS188S0100000 = new IDLListenerS188S0100000(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(iDLListenerS188S0100000);
            this.LLFFF.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.02c
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = C39861hO.this.LLIIIJ.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(iDLListenerS188S0100000);
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39861hO(C010002e c010002e, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.LLIIIJ = c010002e;
        this.LLIIII = new Rect();
        this.LJLLLL = c010002e;
        this.LLFF = true;
        this.LLFFF.setFocusable(true);
        this.LJLLLLLL = new AdapterView.OnItemClickListener() { // from class: X.02b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                C39861hO.this.LLIIIJ.setSelection(i2);
                if (C39861hO.this.LLIIIJ.getOnItemClickListener() != null) {
                    C39861hO c39861hO = C39861hO.this;
                    c39861hO.LLIIIJ.performItemClick(view, i2, c39861hO.LLII.getItemId(i2));
                }
                C39861hO.this.dismiss();
            }
        };
    }
}
