package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes9.dex */
public interface K8L extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "avoid_record_history", required = false)
    Number getAvoidRecordHistory();

    @InterfaceC36563EWp(isGetter = true, keyPath = "ecomSearchParams", required = false)
    java.util.Map<String, Object> getEcomSearchParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC36563EWp(isGetter = true, keyPath = "event_id", required = false)
    String getEventId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "icon_type", required = false)
    String getIconType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "impr_id", required = false)
    String getImprId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "keyword", required = true)
    String getKeyword();

    @InterfaceC36563EWp(isGetter = true, keyPath = "searchFrom", required = false)
    Number getSearchFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "searchSourcePage", required = false)
    String getSearchSourcePage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "tab_name", required = false)
    String getTabName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "type", required = false)
    String getType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "words_type", required = false)
    String getWordsType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "is_sar_recall", required = false)
    String isSarRecall();
}
