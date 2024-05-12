package X;

import Y.AfS24S0400000_13;
import android.content.Context;
import android.webkit.WebSettings;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.game.model.PartnershipDownloadResponse;
import fjb.a;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.CommerceAttributionHandler$handleDownloadGame$1", f = "CommerceAttributionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UZH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ UZK LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ UZI LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ UZM LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZH(UZK uzk, Context context, UZI uzi, String str, UZM uzm, int i, InterfaceC67352kd<? super UZH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uzk;
        this.LJLILLLLZI = context;
        this.LJLJI = uzi;
        this.LJLJJI = str;
        this.LJLJJL = uzm;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UZH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        AbstractC73672Svk<C28467BFf<PartnershipDownloadResponse>> sendClickDownloadEvent;
        Long LJJIZ;
        Long LJJIZ2;
        Long LJJIZ3;
        C141335gf.LIZJ(obj);
        String LIZ = UZK.LIZ(this.LJLILLLLZI);
        String str = this.LJLJI.LJLL;
        long j3 = 0;
        if (str != null && (LJJIZ3 = C38350F3i.LJJIZ(str)) != null) {
            j = LJJIZ3.longValue();
        } else {
            j = 0;
        }
        String str2 = this.LJLJI.LJLJJI;
        if (str2 != null && (LJJIZ2 = C38350F3i.LJJIZ(str2)) != null) {
            j2 = LJJIZ2.longValue();
        } else {
            j2 = 0;
        }
        String str3 = this.LJLJI.LJLJLJ;
        if (str3 != null && (LJJIZ = C38350F3i.LJJIZ(str3)) != null) {
            j3 = LJJIZ.longValue();
        }
        String str4 = this.LJLJI.LJLJJL;
        GameLivePartnershipRetrofitApi partnershipRetrofitApi = (GameLivePartnershipRetrofitApi) Q7L.LIZIZ(GameLivePartnershipRetrofitApi.class);
        if (o.LJ(str4, "3")) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.LJLILLLLZI);
            if (defaultUserAgent == null) {
                defaultUserAgent = "ua";
            }
            String ua = URLEncoder.encode(defaultUserAgent, "UTF-8");
            o.LJIIIIZZ(partnershipRetrofitApi, "partnershipRetrofitApi");
            UZI uzi = this.LJLJI;
            String str5 = uzi.LJLLJ;
            String str6 = uzi.LJLLL;
            String valueOf = String.valueOf(j2);
            o.LJIIIIZZ(ua, "ua");
            sendClickDownloadEvent = partnershipRetrofitApi.gameTtcmDownload("3", str5, str6, valueOf, LIZ, ua);
        } else {
            UZI uzi2 = this.LJLJI;
            String str7 = uzi2.LJLILLLLZI;
            String str8 = "";
            if (str7 == null) {
                str7 = "";
            }
            String str9 = this.LJLJJI;
            String str10 = uzi2.LJLJI;
            if (str10 != null) {
                str8 = str10;
            }
            sendClickDownloadEvent = partnershipRetrofitApi.sendClickDownloadEvent(j3, j, j2, str7, LIZ, str9, str8, "android", str4);
        }
        C73454SsE LJJJ = sendClickDownloadEvent.LJJL(T16.LIZ()).LJJJJJ(2L).LJJJ(C73969T1h.LIZIZ());
        UZK uzk = this.LJLIL;
        UZI uzi3 = this.LJLJI;
        Context context = this.LJLILLLLZI;
        UZM uzm = this.LJLJJL;
        LJJJ.LJJJLIIL(new AfS24S0400000_13(uzk, uzi3, context, uzm, 2), new UZJ(uzm, uzk, uzi3, context, this.LJLJJLL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
