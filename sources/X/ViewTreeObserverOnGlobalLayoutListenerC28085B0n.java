package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.B0n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC28085B0n implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ PaymentFragment LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object obj;
        String str;
        long j;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        ViewTreeObserver viewTreeObserver;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        HashMap<String, Object> hashMap = this.LJLILLLLZI.getEnterParams().trackParams;
        if (hashMap != null) {
            obj = hashMap.get("previous_page");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Long l = this.LJLILLLLZI.getEnterParams().apiDuration;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        HashMap<String, Object> hashMap2 = this.LJLILLLLZI.getEnterParams().trackParams;
        if (hashMap2 != null) {
            obj2 = hashMap2.get("entrance_info");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        HashMap<String, Object> hashMap3 = this.LJLILLLLZI.getEnterParams().trackParams;
        if (hashMap3 != null) {
            obj3 = hashMap3.get("source_page_type");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        HashMap<String, Object> hashMap4 = this.LJLILLLLZI.getEnterParams().trackParams;
        if (hashMap4 != null) {
            obj4 = hashMap4.get("entrance_form");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str4 = (String) obj4;
        } else {
            str4 = null;
        }
        C28068Azw.LIZ(str, true, CardStruct.IStatusCode.DEFAULT, null, currentTimeMillis, j, str2, str3, str4, null);
        View _$_findCachedViewById = this.LJLILLLLZI._$_findCachedViewById(R.id.isf);
        if (_$_findCachedViewById != null && (viewTreeObserver = _$_findCachedViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC28085B0n(long j, PaymentFragment paymentFragment) {
        this.LJLIL = j;
        this.LJLILLLLZI = paymentFragment;
    }
}
