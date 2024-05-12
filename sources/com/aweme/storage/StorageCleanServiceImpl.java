package com.aweme.storage;

import X.C10K;
import X.C221018lt;
import X.C22690un;
import X.C23910wl;
import X.C23940wo;
import X.C38995FSd;
import X.C58096Mr6;
import X.InterfaceC37283EkB;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.base.storage.IStorageCleanService;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class StorageCleanServiceImpl implements IStorageCleanService {
    public static IStorageCleanService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IStorageCleanService.class, false);
        if (LIZ != null) {
            return (IStorageCleanService) LIZ;
        }
        if (C58096Mr6.LIZ == null) {
            synchronized (IStorageCleanService.class) {
                if (C58096Mr6.LIZ == null) {
                    C58096Mr6.LIZ = new StorageCleanServiceImpl();
                }
            }
        }
        return C58096Mr6.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.base.storage.IStorageCleanService
    public final int LIZ() {
        return ((Number) C23910wl.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.base.storage.IStorageCleanService
    public final void LIZIZ(final Context context, final InterfaceC37283EkB interfaceC37283EkB) {
        o.LJIIIZ(context, "context");
        if (C22690un.LIZIZ || !((Boolean) C23940wo.LIZ.getValue()).booleanValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("manualClean completeForceClean: ");
            LIZ.append(C22690un.LIZIZ);
            LIZ.append(", exp: ");
            LIZ.append(((Boolean) C23940wo.LIZ.getValue()).booleanValue());
            C221018lt.LJFF("test_clean", X1D.LIZIZ(LIZ));
            interfaceC37283EkB.LIZ(-1L, false);
            return;
        }
        C10K.LIZIZ(new Callable() { // from class: X.0uq
            public final /* synthetic */ boolean LJLIL = true;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j;
                long j2;
                try {
                    if (this.LJLIL) {
                        j = C39687Fhr.LIZLLL(context);
                    } else {
                        j = 0;
                    }
                    C22690un.LIZIZ(context, false);
                    InterfaceC37283EkB interfaceC37283EkB2 = interfaceC37283EkB;
                    if (interfaceC37283EkB2 != null) {
                        if (this.LJLIL) {
                            j2 = j - C39687Fhr.LIZLLL(context);
                        } else {
                            j2 = -1;
                        }
                        interfaceC37283EkB2.LIZ(j2, true);
                        return null;
                    }
                    return null;
                } catch (Throwable unused) {
                    InterfaceC37283EkB interfaceC37283EkB3 = interfaceC37283EkB;
                    if (interfaceC37283EkB3 != null) {
                        interfaceC37283EkB3.LIZ(-1L, false);
                        return null;
                    }
                    return null;
                }
            }
        }, C38995FSd.LIZLLL(), null);
    }
}
