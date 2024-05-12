package X;

import com.bytedance.android.live.liveinteract.platform.common.utils.LinkMicAppBundleUtil;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TVX implements F6T {
    public final /* synthetic */ LinkMicAppBundleUtil LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.F6T
    public final void onSuccess() {
        TVU.LJIJI(false, 0, this.LIZ.LIZ, System.currentTimeMillis() - this.LIZIZ, "source", "", "");
        if (this.LIZ.LIZIZ != Integer.MAX_VALUE) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load success with dialog ");
        LIZ.append(this.LIZJ);
        TVY.LIZIZ(X1D.LIZIZ(LIZ));
        this.LIZLLL.invoke();
    }

    @Override // X.F6T
    public final void onFailed() {
        TVY.LIZIZ("load linkmic aab failed with dialog");
        if (o.LJ("local_test", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel())) {
            C30868C9o.LJI("please set setting 【live_test_skip_aab_check】 = true to skip aab check and restart app。");
        }
    }

    @Override // X.F6T
    public final void LIZ(int i, String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load failed with dialog: reason");
        LIZ.append(i);
        TVY.LIZIZ(X1D.LIZIZ(LIZ));
        LinkMicAppBundleUtil linkMicAppBundleUtil = this.LIZ;
        linkMicAppBundleUtil.LIZIZ = i;
        TVU.LJIJI(false, 1, linkMicAppBundleUtil.LIZ, System.currentTimeMillis() - this.LIZIZ, this.LIZJ, String.valueOf(this.LIZ.LIZIZ), "");
        C75516TkO c75516TkO = C75516TkO.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPluginInstallError reason = ");
        LIZ2.append(i);
        LIZ2.append(' ');
        LIZ2.append(this.LIZJ);
        c75516TkO.LIZ(601, X1D.LIZIZ(LIZ2), null);
    }

    public TVX(LinkMicAppBundleUtil linkMicAppBundleUtil, long j, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = linkMicAppBundleUtil;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = interfaceC65784Pro;
    }
}
