package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import java.util.List;

/* renamed from: X.ReZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC70059ReZ {
    void onSizeGuideClick(SizeGuide sizeGuide);

    void onSpecChecked(View view, int i, int i2, C70216Rh6 c70216Rh6, boolean z);

    void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6);

    void onSpecLayoutBind(C70248Rhc c70248Rhc, int i, List<C70216Rh6> list);

    void onSpecListLayoutBind(SpecListLayoutV2 specListLayoutV2, RWJ rwj);
}
