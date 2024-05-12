package webcast.api.sub;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class TemplateListData {

    @InterfaceC65349Pkn("payment_redirect")
    public boolean paymentRedirect;

    @InterfaceC65349Pkn("sub_scenario")
    public int subScenario;

    @InterfaceC65349Pkn("webapp_payment")
    public boolean webappPayment;

    @InterfaceC65349Pkn("template_list")
    public List<TemplateInfo> templateList = new ArrayList();

    @InterfaceC65349Pkn("balance")
    public String balance = "";
}
