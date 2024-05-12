package X;

import com.ss.android.ugc.aweme.legoImp.task.SyncProtectionSettingTask;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Ft4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40382Ft4 implements InterfaceC53832LAu {
    public final /* synthetic */ SyncProtectionSettingTask LJLIL;

    @Override // X.InterfaceC53832LAu
    public final void onSuccess() {
        this.LJLIL.getClass();
        a.LJIILL().LJIJJ();
        a.LJIILL().LJIIJJI();
    }

    public C40382Ft4(SyncProtectionSettingTask syncProtectionSettingTask) {
        this.LJLIL = syncProtectionSettingTask;
    }

    @Override // X.InterfaceC53832LAu
    public final void onFailed(Exception exception) {
        o.LJIIIZ(exception, "exception");
        this.LJLIL.getClass();
        a.LJIILL().LJIJJ();
    }
}
