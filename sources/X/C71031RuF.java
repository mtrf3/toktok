package X;

import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.RuF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71031RuF extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ MessageCenterAssem LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71031RuF(View view, MessageCenterAssem messageCenterAssem, String str) {
        super(0);
        this.LJLIL = view;
        this.LJLILLLLZI = messageCenterAssem;
        this.LJLJI = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        View findViewById = this.LJLIL.findViewById(R.id.gwg).findViewById(R.id.gwr);
        String enterFrom = this.LJLILLLLZI.E3().LJLILLLLZI;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (findViewById != null) {
            C78946Uyc.LJJIIJ(findViewById, new C70969RtF(0), new AqS35S1000000_12(enterFrom, 13));
        }
        String str2 = this.LJLJI;
        View view = this.LJLIL;
        if (str2 != null) {
            E94 LLL = C63081OpJ.LLL(str2);
            LLL.LJI(3, "previous_page", "seller_message");
            str = LLL.LIZ();
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_click_time", System.currentTimeMillis());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SmartRouter.buildRoute(view.getContext(), UriProtector.parse(str).buildUpon().appendQueryParameter("trackParams", jSONObject.toString()).toString()).open();
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
