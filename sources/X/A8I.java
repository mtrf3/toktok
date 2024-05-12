package X;

import android.content.Context;
import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductGetParam;

/* loaded from: classes5.dex */
public interface A8I {
    void PD(Context context, IapProductGetParam iapProductGetParam);

    void fW(Context context, IapProductBuyParam iapProductBuyParam);

    void onDestroy();
}
