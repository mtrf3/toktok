package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.RecommendAfterAddData;
import java.io.Serializable;

/* renamed from: X.2mF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68352mF extends Response<RecommendAfterAddData> implements Serializable {
    public final boolean isValid() {
        return isCodeOK();
    }

    public C68352mF(int i, String str, RecommendAfterAddData recommendAfterAddData) {
        super(i, str, recommendAfterAddData, null, 8, null);
    }
}
