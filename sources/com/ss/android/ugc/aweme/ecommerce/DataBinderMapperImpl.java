package com.ss.android.ugc.aweme.ecommerce;

import X.AbstractC024407s;
import X.C70862RrW;
import X.C70863RrX;
import X.C70867Rrb;
import X.C71741SDp;
import X.C71744SDs;
import X.C71749SDx;
import X.C71750SDy;
import X.C71751SDz;
import X.InterfaceC024507t;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class DataBinderMapperImpl extends AbstractC024407s {
    public static final SparseIntArray LIZ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        LIZ = sparseIntArray;
        sparseIntArray.put(R.layout.zk, 1);
        sparseIntArray.put(R.layout.zl, 2);
        sparseIntArray.put(R.layout.a1u, 3);
        sparseIntArray.put(R.layout.a3j, 4);
        sparseIntArray.put(R.layout.a40, 5);
        sparseIntArray.put(R.layout.a55, 6);
        sparseIntArray.put(R.layout.a6d, 7);
        sparseIntArray.put(R.layout.a6k, 8);
    }

    @Override // X.AbstractC024407s
    public final List<AbstractC024407s> LIZ() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // X.AbstractC024407s
    public final ViewDataBinding LIZIZ(InterfaceC024507t interfaceC024507t, View view, int i) {
        int i2 = LIZ.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i2) {
                    case 1:
                        if ("layout/commerce_input_form_0".equals(tag)) {
                            return new C71741SDp(view, interfaceC024507t);
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_input_form is invalid. Received: ", tag));
                    case 2:
                        if ("layout/commerce_input_form_wrap_0".equals(tag)) {
                            return new C71744SDs(view, interfaceC024507t);
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_input_form_wrap is invalid. Received: ", tag));
                    case 3:
                        if ("layout/commerce_payment_method_view_0".equals(tag)) {
                            return new C71749SDx(view, interfaceC024507t);
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_payment_method_view is invalid. Received: ", tag));
                    case 4:
                        if ("layout/commerce_pdp_policies_item_0".equals(tag)) {
                            return new C71751SDz(interfaceC024507t, new View[]{view});
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_pdp_policies_item is invalid. Received: ", tag));
                    case 5:
                        if ("layout/commerce_pdp_review_cell_0".equals(tag)) {
                            return new C70863RrX(view, interfaceC024507t);
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_pdp_review_cell is invalid. Received: ", tag));
                    case 6:
                        if ("layout/commerce_pdp_user_right_sheet_item_0".equals(tag)) {
                            return new C71750SDy(interfaceC024507t, new View[]{view});
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_pdp_user_right_sheet_item is invalid. Received: ", tag));
                    case 7:
                        if ("layout/commerce_review_cell_product_link_item_0".equals(tag)) {
                            return new C70862RrW(view, interfaceC024507t);
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_review_cell_product_link_item is invalid. Received: ", tag));
                    case 8:
                        if ("layout/commerce_review_gallery_bottom_info_0".equals(tag)) {
                            return new C70867Rrb(view, interfaceC024507t);
                        }
                        throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_review_gallery_bottom_info is invalid. Received: ", tag));
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // X.AbstractC024407s
    public final ViewDataBinding LIZJ(InterfaceC024507t interfaceC024507t, View[] viewArr, int i) {
        int i2;
        if (viewArr.length == 0 || (i2 = LIZ.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag != null) {
            if (i2 != 4) {
                if (i2 != 6) {
                    return null;
                }
                if ("layout/commerce_pdp_user_right_sheet_item_0".equals(tag)) {
                    return new C71750SDy(interfaceC024507t, viewArr);
                }
                throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_pdp_user_right_sheet_item is invalid. Received: ", tag));
            }
            if ("layout/commerce_pdp_policies_item_0".equals(tag)) {
                return new C71751SDz(interfaceC024507t, viewArr);
            }
            throw new IllegalArgumentException(b0.LIZIZ("The tag for commerce_pdp_policies_item is invalid. Received: ", tag));
        }
        throw new RuntimeException("view must have a tag");
    }
}
