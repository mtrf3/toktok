package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;

/* renamed from: X.Pvn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66031Pvn implements InterfaceC66086Pwg {
    public final /* synthetic */ MonitorServiceImpl LIZ;
    public final /* synthetic */ C65935PuF LIZIZ;
    public final /* synthetic */ C66226Pyw LIZJ;

    @Override // X.InterfaceC66086Pwg
    public final String LIZ() {
        String invoke = this.LIZJ.LJLJJI.invoke();
        if (invoke != null) {
            return invoke;
        }
        return "";
    }

    @Override // X.InterfaceC66086Pwg
    public final long LIZIZ() {
        return this.LIZJ.LJLJJLL.invoke().longValue();
    }

    @Override // X.InterfaceC66086Pwg
    public final String LIZJ() {
        String invoke = this.LIZJ.LJLJJL.invoke();
        if (invoke != null) {
            return invoke;
        }
        return LiveGiftNewGifterBadgeSetting.DEFAULT;
    }

    @Override // X.InterfaceC66086Pwg
    public final String LIZLLL() {
        String invoke = this.LIZJ.LJLJI.invoke();
        if (invoke != null) {
            return invoke;
        }
        return "";
    }

    @Override // X.InterfaceC66086Pwg
    public final boolean LJ() {
        Boolean invoke;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZJ.LJLL;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            return invoke.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC66086Pwg
    public final long LJFF() {
        return this.LIZJ.LJLJL.invoke().longValue();
    }

    @Override // X.InterfaceC66086Pwg
    public final String getDeviceId() {
        String invoke = this.LIZJ.LJLIL.invoke();
        if (invoke != null) {
            return invoke;
        }
        return "";
    }

    @Override // X.InterfaceC66086Pwg
    public final String getUserId() {
        String invoke = this.LIZJ.LJLILLLLZI.invoke();
        if (invoke != null) {
            return invoke;
        }
        return "";
    }

    public C66031Pvn(MonitorServiceImpl monitorServiceImpl, C65935PuF c65935PuF, C66226Pyw c66226Pyw) {
        this.LIZ = monitorServiceImpl;
        this.LIZIZ = c65935PuF;
        this.LIZJ = c66226Pyw;
    }
}
