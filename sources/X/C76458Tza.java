package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ComponentTypeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MatchComponentTypeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tza, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76458Tza implements InterfaceC58334Muw {
    @Override // X.InterfaceC58334Muw
    public final void LIZ(String businessId) {
        o.LJIIIZ(businessId, "businessId");
    }

    @Override // X.InterfaceC58334Muw
    public final void LIZIZ(String businessId, java.util.Map<String, String> map) {
        ComponentTypeResult componentTypeResult;
        o.LJIIIZ(businessId, "businessId");
        if (o.LJ(businessId, "component_type")) {
            ConcurrentHashMap<String, MatchComponentTypeInfo> concurrentHashMap = C76457TzZ.LIZ;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                MatchComponentTypeInfo matchComponentTypeInfo = concurrentHashMap.get(entry.getKey());
                if (matchComponentTypeInfo == null || !matchComponentTypeInfo.isReported()) {
                    if (concurrentHashMap.containsKey(entry.getKey())) {
                        MatchComponentTypeInfo matchComponentTypeInfo2 = concurrentHashMap.get(entry.getKey());
                        if (matchComponentTypeInfo2 != null) {
                            componentTypeResult = matchComponentTypeInfo2.getResult();
                        } else {
                            componentTypeResult = null;
                        }
                        if (componentTypeResult == ComponentTypeResult.SHOW && !o.LJ(entry.getValue(), CardStruct.IStatusCode.DEFAULT)) {
                            MatchComponentTypeInfo matchComponentTypeInfo3 = concurrentHashMap.get(entry.getKey());
                            if (matchComponentTypeInfo3 != null) {
                                matchComponentTypeInfo3.setResult(ComponentTypeResult.SUCCESS);
                                matchComponentTypeInfo3.setReported(true);
                                matchComponentTypeInfo3.setStartShowTime(entry.getValue());
                            }
                            C76457TzZ.LJ(entry.getKey(), ComponentTypeResult.SUCCESS.getValue());
                        }
                    }
                    if (!concurrentHashMap.containsKey(entry.getKey())) {
                        concurrentHashMap.put(entry.getKey(), new MatchComponentTypeInfo(entry.getValue(), 0L, ComponentTypeResult.SEI, false));
                    }
                }
            }
        }
    }
}
