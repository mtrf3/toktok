package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Utx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78657Utx implements InterfaceC57744MlQ, InterfaceC70769Rq1 {
    public static final ConcurrentHashMap<Integer, C78657Utx> LJLLILLLL = new ConcurrentHashMap<>();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final EnumC57383Mfb LJLJJI;
    public final InterfaceC88471Ynr<String, JSONObject, C76800UCe> LJLJJL;
    public final InterfaceC78662Uu2 LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public EnumC41264GHk LJLLI;

    public C78657Utx() {
        throw null;
    }

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    public final void LIZ(int i) {
        boolean z;
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        this.LJLJJLL.stop();
        long LIZIZ = C78646Utm.LIZIZ(C78646Utm.LIZ, this.LJLJJLL.LIZ());
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("enter_from", this.LJLIL).put("ui_type", this.LJLJJI.getTypeName()).put("load_type", EnumC57748MlU.DISPLAY.getTypeName()).put("tag", this.LJLILLLLZI).put("load_time", LIZIZ).put("is_succeed", C78646Utm.LJFF(this.LJLJLLL)).put("is_from_cache", C78646Utm.LJFF(!((C78659Utz) this.LJLJLJ.getValue()).LIZ)).putOpt("hit_cdn_cache", ((C78659Utz) this.LJLJLJ.getValue()).LIZIZ).put("is_ready", C78646Utm.LJFF(!this.LJLL));
        Integer valueOf = Integer.valueOf(this.LJLJI);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            valueOf = null;
        }
        JSONObject putOpt = put.putOpt("position", valueOf);
        Long valueOf2 = Long.valueOf(((C78659Utz) this.LJLJLJ.getValue()).LIZJ);
        if (valueOf2.longValue() == -1) {
            valueOf2 = null;
        }
        JSONObject putOpt2 = putOpt.putOpt("file_size", valueOf2);
        Integer valueOf3 = Integer.valueOf(i);
        if (valueOf3.intValue() == -1) {
            valueOf3 = null;
        }
        JSONObject putOpt3 = putOpt2.putOpt("fail_reason", valueOf3);
        EnumC41264GHk enumC41264GHk = this.LJLLI;
        if (enumC41264GHk != null) {
            num = Integer.valueOf(C78646Utm.LJ(enumC41264GHk));
        }
        putOpt3.putOpt("net_status", num);
        this.LJLJJL.invoke("relation_image_monitor", jSONObject);
    }

    public final void LIZIZ(W5F w5f) {
        if (this.LJLJL) {
            if (o.LJ(this.LJLIL, "notification_page")) {
                L9F.LIZ(w5f, null, "RelationImgDisplayMonImpl");
                return;
            } else {
                C16880lQ.LLJJJ(w5f);
                return;
            }
        }
        this.LJLJJLL.start();
        this.LJLLI = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        w5f.LJJIZ = (C78659Utz) this.LJLJLJ.getValue();
        if (o.LJ(this.LJLIL, "notification_page")) {
            L9F.LIZ(w5f, this, "RelationImgDisplayMonImpl");
        } else {
            w5f.LIZLLL(this);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        if (smartImageView != null) {
            int hashCode = smartImageView.hashCode();
            ConcurrentHashMap<Integer, C78657Utx> concurrentHashMap = LJLLILLLL;
            C78657Utx remove = concurrentHashMap.remove(Integer.valueOf(hashCode));
            if (remove != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("view(");
                LIZ.append(smartImageView.hashCode());
                LIZ.append(" recycler");
                C221018lt.LJFF("PerMonitor-Img", X1D.LIZIZ(LIZ));
                remove.LIZ(1);
            }
            concurrentHashMap.put(Integer.valueOf(hashCode), this);
            smartImageView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC78661Uu1(this));
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        int i;
        this.LJLJLLL = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("view(");
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(") load img fail");
        C221018lt.LIZJ("PerMonitor-Img", X1D.LIZIZ(LIZ), th);
        if (view != null) {
            LJLLILLLL.remove(Integer.valueOf(view.hashCode()));
        }
        LIZ(0);
    }

    public C78657Utx(String enterFrom, String str, int i, EnumC57383Mfb imgType) {
        C78644Utk c78644Utk = new C78644Utk(C78646Utm.LIZ);
        C58033Mq5 c58033Mq5 = new C58033Mq5(null, 3);
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(imgType, "imgType");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = imgType;
        this.LJLJJL = c78644Utk;
        this.LJLJJLL = c58033Mq5;
        this.LJLJLJ = C221108m2.LIZIZ(C78663Uu3.LJLIL);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        int i;
        this.LJLJLLL = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("view(");
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append("), load success!");
        X1D.LIZIZ(LIZ);
        if (view != null) {
            LJLLILLLL.remove(Integer.valueOf(view.hashCode()));
        }
        LIZ(-1);
    }
}
