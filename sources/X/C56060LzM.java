package X;

import android.view.View;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainContentBean;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LzM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56060LzM {
    public static void LIZ(C56075Lzb contentView, ShopMainContentBean data) {
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(data, "data");
        int i = C56003LyR.LIZ[data.getViewType().ordinal()];
        if (i != 1) {
            String str = "";
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String lynxData = data.getLynxData();
                    if (lynxData != null) {
                        str = lynxData;
                    }
                    linkedHashMap.put("data", str);
                    linkedHashMap.put("type", data.getDataFrom().getValue());
                    linkedHashMap.put("tab_id", data.getTabId());
                    linkedHashMap.put("log_id", data.getLogId());
                    C36746EbW.LIZ(3, "setContent");
                    contentView.LJLJLJ = data.isDataFromCache();
                    contentView.setVisibility(0);
                    contentView.LJLJL = TemplateData.LJ(linkedHashMap);
                    if (!contentView.LJLJJLL) {
                        return;
                    }
                    Object obj = null;
                    contentView.LJLJL = null;
                    C36746EbW.LIZ(3, "updateData");
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = contentView.LJLJI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                        obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
                    }
                    if (!(obj instanceof VNS)) {
                        return;
                    }
                    contentView.LIZ(data.getViewHierarchyData(), true);
                    ((VNS) obj).updateData(TemplateData.LJ(linkedHashMap));
                    return;
                }
                contentView.setVisibility(8);
                return;
            }
            String lynxData2 = data.getLynxData();
            if (lynxData2 != null) {
                str = lynxData2;
            }
            contentView.setError(str);
            return;
        }
        contentView.setVisibility(0);
        View view = contentView.LJLIL;
        if (view == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(contentView.getContext()), R.layout.aoa, contentView, false);
            contentView.LJLIL = LLLLIILL;
            if (LLLLIILL != null) {
                C278517l.LIZIZ(-1, -1, LLLLIILL);
            }
            contentView.addView(contentView.LJLIL);
        } else {
            view.setVisibility(0);
        }
        View view2 = contentView.LJLIL;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = contentView.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.setVisibility(8);
    }
}
