package X;

import com.bytedance.android.live.wallet.model.FeedBackList;
import com.bytedance.android.live.wallet.model.FeedbackGroup;
import com.bytedance.android.live.wallet.model.FeedbackOption;
import com.bytedance.android.live.wallet.model.FeedbackRG;
import com.bytedance.android.live.wallet.service.IFeedbackService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UyH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78925UyH extends N8A {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        LinkedHashMap linkedHashMap = null;
        N89 n89 = (N89) ED5.LIZJ(N89.class, null);
        FeedBackList feedBackListItem = ((IFeedbackService) CN1.LIZ(IFeedbackService.class)).getFeedBackListItem();
        if (feedBackListItem != null && feedBackListItem.feedbackAllow) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("allow", Boolean.valueOf(feedBackListItem.feedbackAllow));
            ArrayList arrayList = new ArrayList();
            List<FeedbackGroup> list = feedBackListItem.groupTitle;
            if (list != null) {
                for (FeedbackGroup feedbackGroup : list) {
                    feedbackGroup.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("id", feedbackGroup.id);
                    linkedHashMap2.put("title", feedbackGroup.title);
                    arrayList.add(linkedHashMap2);
                }
            }
            linkedHashMap.put("groups", arrayList);
            ArrayList arrayList2 = new ArrayList();
            List<FeedbackOption> list2 = feedBackListItem.options;
            if (list2 != null) {
                for (FeedbackOption feedbackOption : list2) {
                    feedbackOption.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("id", feedbackOption.id);
                    linkedHashMap3.put("group_id", feedbackOption.groupID);
                    linkedHashMap3.put("title", feedbackOption.title);
                    linkedHashMap3.put("description", feedbackOption.description);
                    linkedHashMap3.put("schema_link", feedbackOption.schemaLink);
                    linkedHashMap3.put("schema_text", feedbackOption.schemaText);
                    linkedHashMap3.put("show_user_input", feedbackOption.showUserInput);
                    linkedHashMap3.put("event_tracking_key", feedbackOption.eventTrackingKey);
                    arrayList2.add(linkedHashMap3);
                }
            }
            linkedHashMap.put("options", arrayList2);
            FeedbackRG feedbackRG = feedBackListItem.extra;
            if (feedbackRG != null) {
                linkedHashMap.put("extra", C51029K0z.LJJIIZI(new OSZ("rg", feedbackRG.rg)));
            }
        }
        n89.setFeedbackData(linkedHashMap);
        c37356ElM.onSuccess(n89, "");
    }
}
