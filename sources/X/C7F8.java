package X;

import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.7F8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7F8 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C7F7 LJLJJLL;
    public final /* synthetic */ S1T LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7F8(TuxTextView tuxTextView, int i, View view, int i2, int i3, C7F7 c7f7, S1T s1t) {
        super(0);
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = i;
        this.LJLJI = view;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
        this.LJLJJLL = c7f7;
        this.LJLJL = s1t;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i;
        int i2;
        TuxTextView tuxTextView;
        int i3;
        TuxTextView tuxTextView2;
        Object parent = this.LJLIL.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int width = ((View) parent).getWidth() - this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = this.LJLJI.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        int i4 = width - i;
        ViewGroup.LayoutParams layoutParams2 = this.LJLJI.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
        } else {
            i2 = 0;
        }
        int i5 = i4 - i2;
        int i6 = this.LJLJJI;
        int i7 = this.LJLJJL;
        if (i7 + i6 > i5) {
            int i8 = i5 / 2;
            if (i7 <= i8 && i8 < i6) {
                tuxTextView = this.LJLIL;
            } else {
                tuxTextView = this.LJLJJLL.LJLILLLLZI;
            }
            if (o.LJ(tuxTextView, this.LJLIL)) {
                i3 = this.LJLJJL;
            } else {
                i3 = this.LJLJJI;
            }
            i7 = Math.min(i3, i8);
            ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
            layoutParams3.width = i7;
            tuxTextView.setLayoutParams(layoutParams3);
            if (o.LJ(tuxTextView, this.LJLIL)) {
                tuxTextView2 = this.LJLJJLL.LJLILLLLZI;
            } else {
                tuxTextView2 = this.LJLIL;
            }
            ViewGroup.LayoutParams layoutParams4 = tuxTextView2.getLayoutParams();
            int i9 = i5 - i7;
            layoutParams4.width = i9;
            tuxTextView2.setLayoutParams(layoutParams4);
            if (o.LJ(tuxTextView, this.LJLJJLL.LJLILLLLZI)) {
                i6 = i7;
                i7 = i9;
            } else {
                i6 = i9;
            }
            this.LJLIL.post(new ARunnableS39S0100000_3(this.LJLJJLL, 206));
        } else {
            this.LJLJJLL.LJLJI.setVisibility(0);
        }
        this.LJLJL.LJJJJJ(this.LJLJJI, this.LJLJJL, 0, i6, i7, 0);
        return C76800UCe.LIZ;
    }
}
