package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FCt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38595FCt extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Boolean, String, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38595FCt(String str, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, C68322mC<String> c68322mC3, long j) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c68322mC2;
        this.LJLJJI = c68322mC3;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String context, Boolean bool, String str) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(context, "context");
        String geckoChannel = this.LJLIL;
        String accessKey = this.LJLILLLLZI.element;
        String host = this.LJLJI.element;
        String resPath = this.LJLJJI.element;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJL;
        o.LJIIIZ(geckoChannel, "geckoChannel");
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(resPath, "resPath");
        LinkedHashMap LIZIZ = JF1.LIZIZ("gecko_channel", geckoChannel, WM7.SCENE_SERVICE, "deeplink_ug_install_campaign");
        LIZIZ.put("access_key", accessKey);
        LIZIZ.put("host", host);
        LIZIZ.put("path", resPath);
        LIZIZ.put("context", context);
        LIZIZ.put("duration", Long.valueOf(elapsedRealtime));
        LIZIZ.put("is_success", Integer.valueOf(booleanValue ? 1 : 0));
        LIZIZ.put("error_msg", ED2.LIZ(str));
        C76542zS.LIZ("rd_tiktokec_manual_update_gecko", LIZIZ);
        return C76800UCe.LIZ;
    }
}
