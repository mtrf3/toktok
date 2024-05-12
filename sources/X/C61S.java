package X;

import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.jvm.internal.o;

/* renamed from: X.61S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61S implements C61V, RTU, C0K7, InterfaceC82917WgT {
    public static final C61S LJLIL = new C61S();

    @Override // X.InterfaceC82917WgT
    public boolean LIZ() {
        return ((Boolean) C61W.LIZ.getValue()).booleanValue();
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static InterfaceC150695vl LIZIZ(AbstractC42651GoZ rootScene, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(rootScene, "rootScene");
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            return new C61M(rootScene, interfaceC65784Pro);
        }
        return new C153265zu(rootScene, interfaceC65784Pro);
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return obj;
    }
}
