package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* renamed from: X.Udv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77663Udv extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "packageInfo", nestedClassType = InterfaceC77664Udw.class, required = false)
    List<InterfaceC77664Udw> getPackageInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "recommendId", required = false)
    Number getRecommendId();

    @InterfaceC36563EWp(isGetter = false, keyPath = "packageInfo", nestedClassType = InterfaceC77664Udw.class, required = false)
    void setPackageInfo(List<? extends InterfaceC77664Udw> list);

    @InterfaceC36563EWp(isGetter = false, keyPath = "recommendId", required = false)
    void setRecommendId(Number number);
}
