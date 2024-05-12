package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ree, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70064Ree {
    public static final /* synthetic */ int LIZ = 0;

    public static View LIZ(ViewGroup container, SizeGuide sizeGuide) {
        o.LJIIIZ(container, "container");
        if (sizeGuide == null) {
            return null;
        }
        View LIZJ = C72545SdZ.LIZJ(container, "container.context", R.layout.a7d, container, false);
        TextView textView = (TextView) LIZJ.findViewById(R.id.k1r);
        if (textView != null) {
            textView.setText(sizeGuide.skuSizeGuideTitle);
        }
        return LIZJ;
    }

    public static void LIZIZ(FragmentManager fragmentManager, Context context, InterfaceC71003Rtn trackNode, HashMap hashMap, SizeGuide sizeGuide) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(trackNode, "trackNode");
        if (sizeGuide == null) {
            return;
        }
        String str = sizeGuide.skuSizeGuideSchema;
        if (str == null || str.length() == 0) {
            C27504Aqq.LIZ(fragmentManager, C79234V7u.LJJIIZI(trackNode, null), sizeGuide);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (hashMap != null) {
                linkedHashMap.putAll(hashMap);
            }
            for (Map.Entry<String, Object> entry : C78897Uxp.LJIJJ(trackNode).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
            linkedHashMap.put("previous_page", "product_detail");
            C26867AgZ.LIZIZ(context, sizeGuide.skuSizeGuideSchema, C51029K0z.LJJIIZI(new OSZ("track_params", linkedHashMap)), false).open();
        }
        C78946Uyc.LJJII(trackNode, new C70919RsR(), C70063Red.LJLIL);
    }
}
