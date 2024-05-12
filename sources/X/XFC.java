package X;

import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final /* synthetic */ class XFC extends TBS implements InterfaceC88473Ynt<String, String, String, C10K<EffectFetchApiResBean>> {
    public XFC(C84494XEc c84494XEc) {
        super(3, c84494XEc, C84494XEc.class, "fetchWithoutLogin", "fetchWithoutLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbolts/Task;", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C10K<EffectFetchApiResBean> invoke(String str, String str2, String str3) {
        String p0 = str;
        String p1 = str2;
        String p2 = str3;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        return C84494XEc.LIZ(p0, p1, p2);
    }
}
