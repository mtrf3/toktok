package X;

import Y.ARunnableS40S0100000_4;
import Y.AfS60S0100000_8;
import android.os.Message;
import com.google.gson.g;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import kotlin.jvm.internal.AqS112S0300000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.Jhp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49877Jhp implements InterfaceC49870Jhi {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final C50091JlH LJLJJI;
    public final C49841JhF LJLJJL;
    public final InterfaceC49844JhI LJLJJLL;
    public C73495Sst LJLJL;
    public SearchMixFeedList LJLJLJ;
    public String LJLJLLL;

    @Override // X.InterfaceC49870Jhi
    public final void release() {
        C73495Sst c73495Sst = this.LJLJL;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
    }

    @Override // X.InterfaceC49868Jhg
    public final void LIZIZ(C49847JhL root, AqS174S0100000_8 aqS174S0100000_8, AqS174S0100000_8 aqS174S0100000_82) {
        o.LJIIIZ(root, "root");
        if (C49895Ji7.LIZ() && C51625KNx.LIZ()) {
            C86918Y9i.LIZ().execute(new ARunnableS40S0100000_4(new AqS112S0300000_8(this, aqS174S0100000_8, aqS174S0100000_82, 3), 94));
        } else {
            LIZ(null, this.LJLJJLL.LJ(this.LJLJLLL), aqS174S0100000_8, aqS174S0100000_82);
        }
    }

    public final void LIZ(g gVar, int i, InterfaceC88472Yns<? super Message, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Message, C76800UCe> interfaceC88472Yns2) {
        int i2;
        String str;
        String str2;
        String LIZ;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis();
        C73495Sst c73495Sst = this.LJLJL;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        String str3 = this.LJLIL;
        String str4 = this.LJLJI;
        String str5 = this.LJLJLLL;
        SearchMixFeedList searchMixFeedList = this.LJLJLJ;
        if (searchMixFeedList != null) {
            i2 = searchMixFeedList.cursor;
        } else {
            i2 = 0;
        }
        int i3 = C49875Jhn.LLILL;
        String str6 = this.LJLJJL.LJLIL;
        JSONObject jSONObject = (JSONObject) this.LJLJJI.LJI.getValue();
        jSONObject.put("global_consume_count", i);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "immutableParamsJSON.appl…el.TAG, \"context: $it\") }");
        SearchMixFeedList searchMixFeedList2 = this.LJLJLJ;
        if (searchMixFeedList2 != null) {
            str = searchMixFeedList2.mBacktrace;
        } else {
            str = null;
        }
        String str7 = "";
        if (gVar == null || (str2 = gVar.toString()) == null) {
            str2 = "";
        }
        String str8 = this.LJLILLLLZI;
        LIZ = FLE.LIZ("other");
        if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
            str7 = EU3.LIZLLL();
        }
        int LJIILIIL = a.LJIIJ().LJIILIIL();
        String LIZJ = a.LJIIZILJ().LIZJ();
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        this.LJLJL = (C73495Sst) SearchApiNew.LIZIZ(new C50273JoD(str3, str4, str5, i2, i3, str6, jSONObject2, str, str2, str8, LIZ, str7, LJIILIIL, LIZJ, num)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new C49880Jhs(this, interfaceC88472Yns, currentTimeMillis, i), new AfS60S0100000_8(interfaceC88472Yns2, 8));
    }

    public C49877Jhp(String str, String str2, String str3, C50091JlH c50091JlH, C49841JhF c49841JhF, C49846JhK c49846JhK) {
        String LJIJI;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = c50091JlH;
        this.LJLJJL = c49841JhF;
        this.LJLJJLL = c49846JhK;
        SearchMixFeedList searchMixFeedList = this.LJLJLJ;
        this.LJLJLLL = (searchMixFeedList == null || (LJIJI = C78949Uyf.LJIJI(searchMixFeedList)) == null) ? "" : LJIJI;
    }
}
