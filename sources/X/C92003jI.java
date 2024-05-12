package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.3jI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92003jI extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ TextView LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ TextView LJLJJL;
    public final /* synthetic */ InterfaceC88474Ynu<Integer, Integer, Integer, Integer, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92003jI(boolean z, TextView textView, int i, int i2, TextView textView2, InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Integer, C76800UCe> interfaceC88474Ynu) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = textView;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = textView2;
        this.LJLJJLL = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        TextView textView;
        int i;
        TextView textView2;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.LJLIL) {
            Object parent = this.LJLILLLLZI.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((View) parent).measure(0, 0);
        }
        Object parent2 = this.LJLILLLLZI.getParent();
        o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        int LIZ = C47135Ieh.LIZ(13, ((View) parent2).getMeasuredWidth());
        int i3 = this.LJLJI;
        int i4 = this.LJLJJI;
        if (i4 + i3 > LIZ) {
            int i5 = LIZ / 2;
            if (i4 <= i5 && i5 < i3) {
                textView = this.LJLILLLLZI;
            } else {
                textView = this.LJLJJL;
            }
            if (o.LJ(textView, this.LJLILLLLZI)) {
                i = this.LJLJJI;
            } else {
                i = this.LJLJI;
            }
            int min = Math.min(i, i5);
            if (this.LJLIL && min >= 0) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = min;
                textView.setLayoutParams(layoutParams);
            }
            if (o.LJ(textView, this.LJLILLLLZI)) {
                textView2 = this.LJLJJL;
            } else {
                textView2 = this.LJLILLLLZI;
            }
            if (this.LJLIL && (i2 = LIZ - min) >= 0) {
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                layoutParams2.width = i2;
                textView2.setLayoutParams(layoutParams2);
            }
            if (o.LJ(textView, this.LJLJJL)) {
                i4 = LIZ - min;
                i3 = min;
            } else {
                i3 = LIZ - min;
                i4 = min;
            }
        }
        InterfaceC88474Ynu<Integer, Integer, Integer, Integer, C76800UCe> interfaceC88474Ynu = this.LJLJJLL;
        if (interfaceC88474Ynu != null) {
            interfaceC88474Ynu.invoke(Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("calculate anchor text size cost time = ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        return Integer.valueOf(android.util.Log.d("AnchorSubTextLayout", X1D.LIZIZ(LIZ2)));
    }
}
