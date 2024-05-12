package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData;
import java.io.Serializable;

/* renamed from: X.MqH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58045MqH extends Response<AddItemToCartData> implements Serializable {
    public final boolean isValid() {
        return isCodeOK();
    }

    public C58045MqH(int i, String str, AddItemToCartData addItemToCartData) {
        super(i, str, addItemToCartData, null, 8, null);
    }
}
