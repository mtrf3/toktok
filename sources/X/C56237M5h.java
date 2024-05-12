package X;

import com.ss.android.ugc.aweme.feed.ui.instagram.ThirdPartyDialogConfig;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.M5h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56237M5h {
    public Serializable LIZ;
    public Object LIZIZ;

    public /* synthetic */ C56237M5h() {
        this.LIZ = new ConcurrentHashMap();
        this.LIZIZ = new ReferenceQueue();
    }

    public /* synthetic */ C56237M5h(CU2 config) {
        o.LJIIIZ(config, "config");
        this.LIZ = new HashMap();
        this.LIZIZ = new C56249M5t();
        ((C56249M5t) this.LIZIZ).LIZ(new C56231M5b());
        ((HashMap) this.LIZ).put("EntryNode", 1);
        ((C56249M5t) this.LIZIZ).LIZ(new M5Z());
        ((HashMap) this.LIZ).put("PushPreloadCacheNode", 2);
        ((C56249M5t) this.LIZIZ).LIZ(new C56248M5s());
        int i = 3;
        ((HashMap) this.LIZ).put("NewUserJourneyNode", 3);
        if (config.LIZ) {
            ((C56249M5t) this.LIZIZ).LIZ(new C56234M5e());
            i = 4;
            ((HashMap) this.LIZ).put("AppLinkNode", 4);
        }
        ((C56249M5t) this.LIZIZ).LIZ(new C56233M5d());
        int i2 = i + 1;
        ((HashMap) this.LIZ).put("LoginNode", Integer.valueOf(i2));
        ((C56249M5t) this.LIZIZ).LIZ(new C56232M5c());
        int i3 = i2 + 1;
        ((HashMap) this.LIZ).put("SchemeNode", Integer.valueOf(i3));
        ((C56249M5t) this.LIZIZ).LIZ(new M5T());
        ((HashMap) this.LIZ).put("TerminalNode", Integer.valueOf(i3 + 1));
    }

    public /* synthetic */ C56237M5h(KLL kll, KLL kll2) {
        this.LIZ = kll;
        this.LIZIZ = kll2;
    }

    public /* synthetic */ C56237M5h(String str, ThirdPartyDialogConfig thirdPartyDialogConfig) {
        this.LIZ = str;
        this.LIZIZ = thirdPartyDialogConfig;
    }
}
