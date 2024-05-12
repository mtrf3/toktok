package X;

import android.app.Activity;
import com.bytedance.android.live.broadcast.api.IBroadcastService;

/* renamed from: X.Bc4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29136Bc4 implements InterfaceC30837C8j {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.InterfaceC30837C8j
    public final void onSuccess() {
        Activity activity = this.LIZ;
        int i = this.LIZIZ;
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LIZJ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
        EnumC30836C8i enumC30836C8i = EnumC30836C8i.Camera;
        if (enumC30836C8i.isInstalled()) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).init();
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        } else {
            enumC30836C8i.checkInstall(activity, "interact", new C28485BFx(i, interfaceC65784Pro, interfaceC88472Yns));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29136Bc4(Activity activity, int i, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = activity;
        this.LIZIZ = i;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC65784Pro;
    }
}
