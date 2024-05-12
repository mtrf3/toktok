package com.ss.android.ugc.aweme.services.storage;

import X.C221108m2;
import X.C5H3;
import X.GXX;
import X.InterfaceC171126nc;
import X.InterfaceC42708GpU;
import X.InterfaceC42712GpY;
import X.InterfaceC43052Gv2;
import X.InterfaceC43072GvM;
import X.InterfaceC43105Gvt;

/* loaded from: classes8.dex */
public final class AVStorageManagerImpl implements InterfaceC42712GpY {
    public final C5H3 monitor$delegate = C221108m2.LIZIZ(AVStorageManagerImpl$monitor$2.INSTANCE);
    public final C5H3 allowListService$delegate = C221108m2.LIZIZ(AVStorageManagerImpl$allowListService$2.INSTANCE);
    public final C5H3 fileProvider$delegate = C221108m2.LIZIZ(AVStorageManagerImpl$fileProvider$2.INSTANCE);
    public final C5H3 pathAdapter$delegate = C221108m2.LIZIZ(AVStorageManagerImpl$pathAdapter$2.INSTANCE);
    public final C5H3 pathService$delegate = C221108m2.LIZIZ(AVStorageManagerImpl$pathService$2.INSTANCE);
    public final C5H3 persistedAllowListManager$delegate = C221108m2.LIZIZ(AVStorageManagerImpl$persistedAllowListManager$2.INSTANCE);

    @Override // X.InterfaceC42712GpY
    public GXX getAllowListService() {
        return (GXX) this.allowListService$delegate.getValue();
    }

    @Override // X.InterfaceC42712GpY
    public InterfaceC43105Gvt getFileProvider() {
        return (InterfaceC43105Gvt) this.fileProvider$delegate.getValue();
    }

    @Override // X.InterfaceC42712GpY
    public InterfaceC43052Gv2 getMonitor() {
        return (InterfaceC43052Gv2) this.monitor$delegate.getValue();
    }

    @Override // X.InterfaceC42712GpY
    public InterfaceC171126nc getPathAdapter() {
        return (InterfaceC171126nc) this.pathAdapter$delegate.getValue();
    }

    @Override // X.InterfaceC42712GpY
    public InterfaceC43072GvM getPathService() {
        return (InterfaceC43072GvM) this.pathService$delegate.getValue();
    }

    @Override // X.InterfaceC42712GpY
    public InterfaceC42708GpU getPersistedAllowListManager() {
        return (InterfaceC42708GpU) this.persistedAllowListManager$delegate.getValue();
    }
}
