package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import org.json.JSONObject;

/* renamed from: X.Uty, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78658Uty implements InterfaceC57744MlQ, InterfaceC78660Uu0 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final EnumC57383Mfb LJLJI;
    public final InterfaceC78660Uu0 LJLJJI;
    public final InterfaceC88471Ynr<String, JSONObject, C76800UCe> LJLJJL;
    public final InterfaceC78662Uu2 LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public EnumC41264GHk LJLL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        C221018lt.LJFF("PerMonitor-Img", "loadBitmap img cancel");
        LIZJ(2);
        InterfaceC78660Uu0 interfaceC78660Uu0 = this.LJLJJI;
        if (interfaceC78660Uu0 != null) {
            interfaceC78660Uu0.LIZ();
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        this.LJLJLLL = true;
        LIZJ(-1);
        InterfaceC78660Uu0 interfaceC78660Uu0 = this.LJLJJI;
        if (interfaceC78660Uu0 != null) {
            interfaceC78660Uu0.LIZIZ(bitmap);
        }
    }

    public final void LIZJ(int i) {
        boolean z;
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        this.LJLJJLL.stop();
        long LIZIZ = C78646Utm.LIZIZ(C78646Utm.LIZ, this.LJLJJLL.LIZ());
        JSONObject jSONObject = new JSONObject();
        JSONObject putOpt = jSONObject.put("enter_from", this.LJLIL).put("ui_type", this.LJLJI.getTypeName()).put("load_type", EnumC57748MlU.LOAD_DATA.getTypeName()).put("tag", this.LJLILLLLZI).put("load_time", LIZIZ).put("is_succeed", C78646Utm.LJFF(this.LJLJLLL)).put("is_from_cache", C78646Utm.LJFF(!((C78659Utz) this.LJLJLJ.getValue()).LIZ)).putOpt("hit_cdn_cache", ((C78659Utz) this.LJLJLJ.getValue()).LIZIZ);
        Long valueOf = Long.valueOf(((C78659Utz) this.LJLJLJ.getValue()).LIZJ);
        if (valueOf.longValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            valueOf = null;
        }
        JSONObject putOpt2 = putOpt.putOpt("file_size", valueOf);
        Integer valueOf2 = Integer.valueOf(i);
        if (valueOf2.intValue() == -1) {
            valueOf2 = null;
        }
        JSONObject putOpt3 = putOpt2.putOpt("fail_reason", valueOf2);
        EnumC41264GHk enumC41264GHk = this.LJLL;
        if (enumC41264GHk != null) {
            num = Integer.valueOf(C78646Utm.LJ(enumC41264GHk));
        }
        putOpt3.putOpt("net_status", num);
        this.LJLJJL.invoke("relation_image_monitor", jSONObject);
    }

    public final void LIZLLL(W5F w5f) {
        if (this.LJLJL) {
            w5f.LJIIIZ(this.LJLJJI);
            return;
        }
        this.LJLJJLL.start();
        this.LJLL = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        w5f.LJJIZ = (C78659Utz) this.LJLJLJ.getValue();
        w5f.LJIIIZ(this);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        this.LJLJLLL = false;
        C221018lt.LIZJ("PerMonitor-Img", "loadBitmap img fail", th);
        InterfaceC78660Uu0 interfaceC78660Uu0 = this.LJLJJI;
        if (interfaceC78660Uu0 != null) {
            interfaceC78660Uu0.onFailed(th);
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
        InterfaceC78660Uu0 interfaceC78660Uu0 = this.LJLJJI;
        if (interfaceC78660Uu0 != null) {
            interfaceC78660Uu0.onProgress(f);
        }
    }

    public C78658Uty(String str, String str2, EnumC57383Mfb enumC57383Mfb, InterfaceC78660Uu0 interfaceC78660Uu0) {
        C78645Utl c78645Utl = new C78645Utl(C78646Utm.LIZ);
        C58033Mq5 c58033Mq5 = new C58033Mq5(null, 3);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = enumC57383Mfb;
        this.LJLJJI = interfaceC78660Uu0;
        this.LJLJJL = c78645Utl;
        this.LJLJJLL = c58033Mq5;
        this.LJLJLJ = C221108m2.LIZIZ(C78664Uu4.LJLIL);
    }
}
