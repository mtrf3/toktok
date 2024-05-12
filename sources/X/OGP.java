package X;

import android.content.Context;
import android.util.Pair;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.SendThirdPartyLogMethod$handle$1$1", f = "SendThirdPartyLogMethod.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OGP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ OGQ LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ CompletionBlock<InterfaceC58863N8h> LJLJJL;
    public final /* synthetic */ OGS LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OGP(C68322mC<String> c68322mC, OGQ ogq, Context context, String str, CompletionBlock<InterfaceC58863N8h> completionBlock, OGS ogs, InterfaceC67352kd<? super OGP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = ogq;
        this.LJLJI = context;
        this.LJLJJI = str;
        this.LJLJJL = completionBlock;
        this.LJLJJLL = ogs;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new OGP(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C68322mC<String> c68322mC = this.LJLIL;
        OGQ ogq = this.LJLILLLLZI;
        String str2 = c68322mC.element;
        Context context = this.LJLJI;
        String ua = this.LJLJJI;
        o.LJIIIIZZ(ua, "ua");
        ogq.getClass();
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
        if (iGamePartnershipService == null || iGamePartnershipService.oK() == null) {
            str = "";
        } else {
            str = UZK.LIZ(context);
        }
        c68322mC.element = ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(str2, "__UA__", ua, false), "__ADID__", str, false), "__TS__", String.valueOf(System.currentTimeMillis()), false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(this.LJLIL.element, linkedHashMap);
        String str3 = (String) LIZJ.first;
        String relativePath = (String) LIZJ.second;
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            OGQ ogq2 = this.LJLILLLLZI;
            if (ogq2.LJLJJLL == null) {
                ogq2.LJLJJLL = (GameLivePartnershipRetrofitApi) C65083PgV.LJIIIIZZ(GameLivePartnershipRetrofitApi.class, str3);
            }
            if (this.LJLILLLLZI.LJLJJLL == null) {
                OGQ.LJII(new Exception("baseUrl error"), this.LJLJJL, jSONObject, this.LJLJJLL);
            }
            GameLivePartnershipRetrofitApi gameLivePartnershipRetrofitApi = this.LJLILLLLZI.LJLJJLL;
            if (gameLivePartnershipRetrofitApi != null) {
                CompletionBlock<InterfaceC58863N8h> completionBlock = this.LJLJJL;
                OGS ogs = this.LJLJJLL;
                o.LJIIIIZZ(relativePath, "relativePath");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("x-metasec-bypass-ttnet-features", "1");
                C64797Pbt<TypedInput> execute = gameLivePartnershipRetrofitApi.performGet(relativePath, linkedHashMap, linkedHashMap2, false).execute();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (execute == null) {
                    jSONObject.put("error_code", -11);
                    jSONObject.put("error_message", "failed in sendMMPShowEvent, response is null.");
                    C0NB.LJ("SendThirdPartyLogMethod", "failed in sendMMPShowEvent, response is null.");
                    C31626Cb8.LIZ(completionBlock, 0, "failed in sendMMPShowEvent, response is null.", 4);
                } else {
                    C36910EeA c36910EeA = execute.LIZ;
                    if (!c36910EeA.LIZJ() || c36910EeA.LIZIZ != 200) {
                        jSONObject.put("error_code", c36910EeA.LIZIZ);
                        jSONObject.put("http_code", c36910EeA.LIZIZ);
                        jSONObject.put("error_message", c36910EeA.LIZJ);
                        C0NB.LIZIZ("SendThirdPartyLogMethod", "send show event fail.");
                        int i = c36910EeA.LIZIZ;
                        String str4 = c36910EeA.LIZJ;
                        o.LJIIIIZZ(str4, "response.reason");
                        C31626Cb8.LIZ(completionBlock, i, str4, 4);
                    } else {
                        jSONObject.put("error_code", 0);
                        jSONObject.put("error_message", "");
                        jSONObject.put("http_code", c36910EeA.LIZIZ);
                        C0NB.LIZIZ("SendThirdPartyLogMethod", "send show event success");
                        XBaseModel LIZJ2 = ED5.LIZJ(InterfaceC58863N8h.class, null);
                        ((InterfaceC58863N8h) LIZJ2).setCode(new Integer(1));
                        completionBlock.onSuccess((XBaseResultModel) LIZJ2, "");
                    }
                }
                jSONObject.put("duration", currentTimeMillis2);
                OGQ.LJIIIIZZ(ogs, jSONObject);
            }
        } catch (Exception e) {
            jSONObject.put("duration", System.currentTimeMillis() - currentTimeMillis);
            OGQ ogq3 = this.LJLILLLLZI;
            CompletionBlock<InterfaceC58863N8h> completionBlock2 = this.LJLJJL;
            OGS ogs2 = this.LJLJJLL;
            ogq3.getClass();
            OGQ.LJII(e, completionBlock2, jSONObject, ogs2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
