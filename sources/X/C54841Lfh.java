package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.crash.ICommonParams;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lfh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54841Lfh implements ICommonParams, InterfaceC85311Xdz, InterfaceC73592SuS, InterfaceC48038ItG, InterfaceC47094Ie2, C0K7 {
    public static final C54841Lfh LJLIL = new C54841Lfh();
    public static final C54841Lfh LJLILLLLZI = new C54841Lfh();
    public static final C54841Lfh LJLJI = new C54841Lfh();

    @Override // X.InterfaceC47094Ie2
    public void LIZ() {
    }

    @Override // X.InterfaceC47094Ie2
    public void LIZIZ() {
    }

    @Override // com.bytedance.crash.ICommonParams
    public String getDeviceId() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public List getPatchInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public java.util.Map getPluginInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public String getSessionId() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public long getUserId() {
        return 0L;
    }

    @Override // X.InterfaceC85311Xdz
    public void LIZJ() {
        LJ6.LIZ.storeLong(LJ6.LIZJ("nearby_gps_permission_dialog_show_time"), System.currentTimeMillis());
    }

    @Override // com.bytedance.crash.ICommonParams
    public java.util.Map getCommonParams() {
        return new HashMap();
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        return true;
    }
}
