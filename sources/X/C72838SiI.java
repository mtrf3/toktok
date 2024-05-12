package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecomsearch.middle.feedback.EcommerceSearchMiddleFeedback;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS16S1101000_12;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.AqS68S0400000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.SiI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72838SiI extends C98T {
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ C72837SiH LJLJJLL;
    public final /* synthetic */ InterfaceC72840SiK LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;

    @Override // X.C98T
    public final void LIZ(View view) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLJJL);
        String LIZJ = EcommerceSearchMiddleFeedback.LIZ().LIZJ();
        if (LIZJ == null) {
            LIZJ = EcommerceSearchMiddleFeedback.LIZJ;
        }
        c26045AKb.LJIIIZ(LIZJ);
        C72837SiH.LJLJJL = new WeakReference<>(c26045AKb);
        C72837SiH c72837SiH = this.LJLJJLL;
        InterfaceC72840SiK interfaceC72840SiK = this.LJLJL;
        int i = this.LJLJLJ;
        String valueOf = String.valueOf(c26045AKb.hashCode());
        c72837SiH.getClass();
        C76542zS.LIZJ("mall_search_text_submit", new AqS16S1101000_12(interfaceC72840SiK, i, valueOf, 2));
        c26045AKb.LJIIJ();
        C72837SiH c72837SiH2 = this.LJLJJLL;
        InterfaceC72840SiK interfaceC72840SiK2 = this.LJLJL;
        String valueOf2 = String.valueOf(c26045AKb.hashCode());
        c72837SiH2.getClass();
        C76542zS.LIZJ("mall_search_feedback_toast_show", new AqS65S1100000_12(interfaceC72840SiK2, valueOf2, 4));
        IEventCenter LJ = EventCenter.LJ();
        JSONObject jSONObject = new JSONObject();
        InterfaceC72840SiK interfaceC72840SiK3 = this.LJLJL;
        try {
            jSONObject.put("wordContent", interfaceC72840SiK3.getWordContent());
            C3C5.m7constructorimpl(jSONObject.put("wordGroupId", interfaceC72840SiK3.getWordGroupId()));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
        LJ.LIZ("ecSearchMiddleFeedbackEvent", jSONObject2);
        this.LJLJLLL.invoke();
    }

    public C72838SiI(View view, C72837SiH c72837SiH, InterfaceC72840SiK interfaceC72840SiK, int i, AqS68S0400000_8 aqS68S0400000_8) {
        this.LJLJJL = view;
        this.LJLJJLL = c72837SiH;
        this.LJLJL = interfaceC72840SiK;
        this.LJLJLJ = i;
        this.LJLJLLL = aqS68S0400000_8;
    }
}
