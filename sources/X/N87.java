package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* loaded from: classes11.dex */
public interface N87 extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "currencyCode", required = true)
    String getCurrencyCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "decimalPoint", required = true)
    Number getDecimalPoint();

    @ED6(option = {0, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "defaultLocale", required = false)
    Number getDefaultLocale();

    @InterfaceC36563EWp(isGetter = true, keyPath = "locale", required = false)
    String getLocale();

    @InterfaceC36563EWp(isGetter = true, keyPath = "prices", primitiveClassType = String.class, required = true)
    List<String> getPrices();

    @InterfaceC36563EWp(isGetter = true, keyPath = "showCurrencySymbol", required = false)
    Boolean getShowCurrencySymbol();
}
