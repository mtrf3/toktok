package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.assem.ProductListAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS178S0100000_12;
import ujb.s;

/* renamed from: X.S3x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71489S3x implements TextView.OnEditorActionListener {
    public final /* synthetic */ ProductListAssem LJLIL;

    public C71489S3x(ProductListAssem productListAssem) {
        this.LJLIL = productListAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        textView.clearFocus();
        KeyboardUtils.LIZIZ(textView);
        ProductListViewModel A3 = this.LJLIL.A3();
        String charSequence = textView.getText().toString();
        A3.getClass();
        if (charSequence == null || charSequence.length() == 0) {
            A3.setState(new AqS178S0100000_12(A3, 366));
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList<C71271Ry7> arrayList2 = ((S5B) A3.getState()).LJLJI;
            if (arrayList2 != null) {
                Iterator<C71271Ry7> it = arrayList2.iterator();
                while (it.hasNext()) {
                    C71271Ry7 next = it.next();
                    if (s.LJJLIIIJL(next.LJLJJI, charSequence, 0, true, 2) != -1) {
                        arrayList.add(next);
                    }
                }
            }
            A3.setState(new AqS178S0100000_12(arrayList, (ArrayList<C71271Ry7>) 365));
        }
        return true;
    }
}
