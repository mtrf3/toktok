package X;

import com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.GpX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42711GpX implements InterfaceC42713GpZ {
    public InterfaceC42712GpY LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC42713GpZ
    public final GXX getAllowListService() {
        InterfaceC42712GpY interfaceC42712GpY = this.LIZ;
        if (interfaceC42712GpY != null) {
            return interfaceC42712GpY.getAllowListService();
        }
        o.LJIJI("mProxy");
        throw null;
    }

    @Override // X.InterfaceC42713GpZ
    public final InterfaceC43105Gvt getFileProvider() {
        InterfaceC42712GpY interfaceC42712GpY = this.LIZ;
        if (interfaceC42712GpY != null) {
            return interfaceC42712GpY.getFileProvider();
        }
        o.LJIJI("mProxy");
        throw null;
    }

    @Override // X.InterfaceC42713GpZ
    public final InterfaceC43052Gv2 getMonitor() {
        InterfaceC42712GpY interfaceC42712GpY = this.LIZ;
        if (interfaceC42712GpY != null) {
            return interfaceC42712GpY.getMonitor();
        }
        o.LJIJI("mProxy");
        throw null;
    }

    @Override // X.InterfaceC42713GpZ
    public final InterfaceC171126nc getPathAdapter() {
        InterfaceC42712GpY interfaceC42712GpY = this.LIZ;
        if (interfaceC42712GpY != null) {
            return interfaceC42712GpY.getPathAdapter();
        }
        o.LJIJI("mProxy");
        throw null;
    }

    @Override // X.InterfaceC42713GpZ
    public final InterfaceC43072GvM getPathService() {
        InterfaceC42712GpY interfaceC42712GpY = this.LIZ;
        if (interfaceC42712GpY != null) {
            return interfaceC42712GpY.getPathService();
        }
        o.LJIJI("mProxy");
        throw null;
    }

    @Override // X.InterfaceC42713GpZ
    public final InterfaceC42708GpU getPersistedAllowListManager() {
        InterfaceC42712GpY interfaceC42712GpY = this.LIZ;
        if (interfaceC42712GpY != null) {
            return interfaceC42712GpY.getPersistedAllowListManager();
        }
        o.LJIJI("mProxy");
        throw null;
    }

    @Override // X.InterfaceC42713GpZ
    public final void LIZ(AVStorageManagerImpl aVStorageManagerImpl) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LIZIZ.set(true);
        this.LIZ = aVStorageManagerImpl;
        aVStorageManagerImpl.getPersistedAllowListManager().LIZJ(new C42709GpV());
        C60903NvH.LJIIJJI().LJJJI().LIZ().registerListener(getAllowListService());
    }
}
