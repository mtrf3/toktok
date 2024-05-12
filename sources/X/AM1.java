package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AM1 extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setLabels$ecommerce_transaction_release(List<ProductBannerLabel> list) {
        int i;
        int i2;
        int i3;
        Integer height;
        Integer width;
        ArrayList arrayList = new ArrayList();
        View label_one = LIZ(R.id.ff_);
        o.LJIIIIZZ(label_one, "label_one");
        arrayList.add(label_one);
        View label_two = LIZ(R.id.ffd);
        o.LJIIIIZZ(label_two, "label_two");
        arrayList.add(label_two);
        View label_three = LIZ(R.id.ffb);
        o.LJIIIIZZ(label_three, "label_three");
        arrayList.add(label_three);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setVisibility(8);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            ((ImageView) ListProtector.get(arrayList, i5)).setVisibility(0);
            ViewGroup.LayoutParams layoutParams = ((View) ListProtector.get(arrayList, i5)).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Image image = ((ProductBannerLabel) ListProtector.get(list, i5)).image;
            if (image != null && (width = image.getWidth()) != null) {
                i = (int) C45804HyK.LJJ(width.intValue() / 3);
            } else {
                i = 0;
            }
            layoutParams2.width = i;
            Image image2 = ((ProductBannerLabel) ListProtector.get(list, i5)).image;
            if (image2 != null && (height = image2.getHeight()) != null) {
                i2 = (int) C45804HyK.LJJ(height.intValue() / 3);
            } else {
                i2 = 0;
            }
            layoutParams2.height = i2;
            if (((ProductBannerLabel) ListProtector.get(list, i5)).leftRetract != null) {
                i3 = (int) C45804HyK.LJJ(r0.intValue());
            } else {
                i3 = 0;
            }
            layoutParams2.setMarginStart(i4 - i3);
            ((View) ListProtector.get(arrayList, i5)).setLayoutParams(layoutParams2);
            W5F LIZLLL = C70759Rpr.LIZLLL(((ProductBannerLabel) ListProtector.get(list, i5)).image);
            LIZLLL.LJJIIJZLJL = (ImageView) ListProtector.get(arrayList, i5);
            C16880lQ.LLJJJ(LIZLLL);
            i4 = layoutParams2.width + layoutParams2.getMarginStart();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AM1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a3k, this, true);
    }
}
