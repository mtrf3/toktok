package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Bzd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30597Bzd implements WUF {
    public final java.util.Map<Class, Object> LIZ;
    public final java.util.Map<WUE, InterfaceC29176Bci> LIZIZ;

    public C30597Bzd() {
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        this.LIZIZ = new HashMap();
        hashMap.put(InterfaceC30599Bzf.class, new C30598Bze());
    }

    public static final void LIZ() {
        LiveOuterService.LJJJLL().LJJI().getClass();
        if (GoLiveMemoryLeakOptSetting.INSTANCE.enable()) {
            C20910rv.LJIILLIIL(null);
            if (C30398BwQ.LIZ) {
                ((IToolbarService) CN1.LIZ(IToolbarService.class)).d9();
                C30398BwQ.LIZ = false;
                return;
            }
            return;
        }
        if (C30398BwQ.LIZ) {
            return;
        }
        C20910rv.LJIILLIIL(null);
        ((IToolbarService) CN1.LIZ(IToolbarService.class)).d9();
        C30398BwQ.LIZ = false;
    }

    public final void LIZJ() {
        LiveOuterService.LJJJLL().LJJI().getClass();
    }

    public static final void LIZIZ(InterfaceC30508ByC interfaceC30508ByC) {
        C31130CJq LJJI = LiveOuterService.LJJJLL().LJJI();
        C30525ByT c30525ByT = new C30525ByT(interfaceC30508ByC);
        LJJI.getClass();
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).requestCreateInfoFromTools(c30525ByT);
    }

    public final void LIZLLL(WU5 wu5) {
        Object obj = ((HashMap) this.LIZIZ).get(wu5);
        if (obj != null) {
            ((HashMap) this.LIZIZ).remove(wu5);
            LiveOuterService.LJJJLL().startLiveManager().getClass();
            ((CopyOnWriteArrayList) ((C29165BcX) Live.getService().startLiveManager()).LJLIL).remove(obj);
        }
    }
}
