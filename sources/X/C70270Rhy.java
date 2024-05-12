package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70270Rhy extends AbstractC70272Ri0<C70253Rhh> {
    public final C70468RlA LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70270Rhy(ViewGroup parent) {
        super(new FrameLayout(parent.getContext()));
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(parent, "parent");
        this.itemView.setLayoutParams(new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))));
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        }
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C70468RlA c70468RlA = new C70468RlA(context);
        this.LJLIL = c70468RlA;
        View view = this.itemView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(c70468RlA);
            viewGroup.setClipChildren(false);
        }
    }

    @Override // X.AbstractC70272Ri0
    public final void L(int i, Object obj) {
        C70253Rhh c70253Rhh = (C70253Rhh) obj;
        C70468RlA c70468RlA = this.LJLIL;
        String str = c70253Rhh.LJLIL;
        Image image = c70253Rhh.LJLILLLLZI;
        String str2 = c70253Rhh.LJLJI;
        boolean z = c70253Rhh.LJLJJI;
        c70468RlA.LJJ(new C70257Rhl(str, image, null, i, str2, z, c70253Rhh.LJLJJL, z));
        if (c70253Rhh.LJLJJL) {
            c70468RlA.LJJIFFI();
        } else {
            c70468RlA.LJFF();
        }
    }
}
