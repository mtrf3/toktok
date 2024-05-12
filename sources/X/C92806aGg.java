package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aGg, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92806aGg extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public final /* synthetic */ PIViewModel LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ C91706Zyw LJLJJL;
    public final /* synthetic */ View LJLJJLL;
    public final /* synthetic */ InterfaceC91780a08 LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92806aGg(PIViewModel pIViewModel, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Context context, C91706Zyw c91706Zyw, View view, InterfaceC91780a08 interfaceC91780a08, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(1);
        this.LJLIL = pIViewModel;
        this.LJLILLLLZI = bool;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = context;
        this.LJLJJL = c91706Zyw;
        this.LJLJJLL = view;
        this.LJLJL = interfaceC91780a08;
        this.LJLJLJ = interfaceC65784Pro2;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String link) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(link, "link");
        android.net.Uri parse = UriProtector.parse(link);
        String path = parse.getPath();
        if (this.LJLIL.isSchemaMailTo(link)) {
            return Boolean.TRUE;
        }
        if (this.LJLIL.isHttpURL(link)) {
            return Boolean.FALSE;
        }
        if (!this.LJLIL.isSchemaMatch(link)) {
            Boolean bool = this.LJLILLLLZI;
            Boolean bool2 = Boolean.TRUE;
            if (o.LJ(bool, bool2)) {
                this.LJLJI.invoke();
                return bool2;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setFlags(268435456);
                C16880lQ.LIZJ(this.LJLJJI, intent);
            } catch (ActivityNotFoundException e) {
                System.out.println((Object) o.LJIILLIIL(e, "fail to open activity: "));
            }
            return Boolean.TRUE;
        }
        if (o.LJ(path, EnumC91972a3E.PIManagement.getPath())) {
            String queryParameter = UriProtector.getQueryParameter(parse, "bind_card_status");
            if (queryParameter == null || (!o.LJ(queryParameter, "succeed") && !o.LJ(queryParameter, "success"))) {
                z = false;
            } else {
                z = true;
            }
            String queryParameter2 = UriProtector.getQueryParameter(parse, "error_code");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            String queryParameter3 = UriProtector.getQueryParameter(parse, "type");
            String queryParameter4 = UriProtector.getQueryParameter(parse, "status");
            if (o.LJ(queryParameter3, "bind")) {
                if (queryParameter4 == null || (!o.LJ(queryParameter4, "succeed") && !o.LJ(queryParameter4, "success"))) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    z2 = true;
                    PIViewModel pIViewModel = this.LJLIL;
                    if (!z || z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    pIViewModel.redirectHandler(z3, queryParameter2, this.LJLJJL, C92116a5Y.LIZ(this.LJLJJLL), this.LJLJL, this.LJLJLJ);
                    return Boolean.TRUE;
                }
            }
            z2 = false;
            PIViewModel pIViewModel2 = this.LJLIL;
            if (!z) {
            }
            z3 = true;
            pIViewModel2.redirectHandler(z3, queryParameter2, this.LJLJJL, C92116a5Y.LIZ(this.LJLJJLL), this.LJLJL, this.LJLJLJ);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
