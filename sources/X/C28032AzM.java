package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OrderConfig;

/* renamed from: X.AzM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28032AzM {
    public static final OrderConfig LIZ = new OrderConfig(C47261Igj.LJJIJIL("entrance_form", "rec_content_id", "rec_content_type", "source_page_type", "enter_from_info", "action_type", "enter_from_merge", "source_content_id", "source_page_type", "search_id", "search_result_id"), C47261Igj.LJJIJIL("entrance_form", "rec_content_id", "rec_content_type", "source_page_type", "enter_from_info", "action_type", "enter_from_merge", "source_content_id", "source_page_type", "search_id", "search_result_id", "author_id"), true);

    public static final OrderConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        OrderConfig orderConfig = LIZ;
        OrderConfig orderConfig2 = (OrderConfig) LIZLLL.LJIIIIZZ("ecom_order_config", OrderConfig.class, orderConfig);
        if (orderConfig2 == null) {
            return orderConfig;
        }
        return orderConfig2;
    }
}
