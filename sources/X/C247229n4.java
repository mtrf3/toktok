package X;

import com.bytedance.touchpoint.core.model.CoinBottomTab;
import com.bytedance.touchpoint.core.model.DynamicDialog;
import com.bytedance.touchpoint.core.model.Title;

/* renamed from: X.9n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247229n4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C95U c95u) {
        Integer valueOf;
        String str;
        String str2;
        Title title;
        String str3;
        String str4;
        String str5;
        if (c95u == null || (valueOf = Integer.valueOf(c95u.LIZ)) == null) {
            return;
        }
        if (valueOf.intValue() == 4) {
            if (!(c95u instanceof DynamicDialog)) {
                c95u = null;
            }
            DynamicDialog dynamicDialog = (DynamicDialog) c95u;
            if (dynamicDialog != null && (str4 = dynamicDialog.jsSource) != null && str4.length() != 0 && dynamicDialog != null && (str5 = dynamicDialog.name) != null && str5.length() != 0) {
                return;
            }
            C247749nu.LJ(dynamicDialog);
            return;
        }
        if (valueOf.intValue() != 29) {
            return;
        }
        if (!(c95u instanceof CoinBottomTab)) {
            c95u = null;
        }
        CoinBottomTab coinBottomTab = (CoinBottomTab) c95u;
        if (coinBottomTab != null && (str = coinBottomTab.iconURL) != null && str.length() != 0 && coinBottomTab != null && (str2 = coinBottomTab.jumpLink) != null && str2.length() != 0 && coinBottomTab != null && (title = coinBottomTab.title) != null && (str3 = title.text) != null && str3.length() != 0) {
            return;
        }
        C247749nu.LJ(coinBottomTab);
    }
}
