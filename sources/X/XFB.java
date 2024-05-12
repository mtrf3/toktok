package X;

import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;

/* loaded from: classes16.dex */
public final /* synthetic */ class XFB extends TBS implements InterfaceC88473Ynt<String, String, String, C10K<EffectFetchApiResBean>> {
    public XFB(C84494XEc c84494XEc) {
        super(3, c84494XEc, C84494XEc.class, "fetch", "fetch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbolts/Task;", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C10K<EffectFetchApiResBean> invoke(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        HH1.LIZ(str4, "p0", str5, "p1", str6, "p2");
        return ((EffectFetchApi) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(str4, true, EffectFetchApi.class)).getEffectMeta(str5, str6, "android");
    }
}
