package com.ss.android.ugc.aweme.detail.panel;

import X.C58096Mr6;
import X.HXQ;
import X.I3G;
import X.I3H;
import X.I3O;
import com.ss.android.ugc.aweme.port.in.IDuetModeCameraService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetModeCameraServiceImpl implements IDuetModeCameraService {
    public I3O LIZ;
    public HXQ LIZIZ;

    public static IDuetModeCameraService LJ() {
        Object LIZ = C58096Mr6.LIZ(IDuetModeCameraService.class, false);
        if (LIZ != null) {
            return (IDuetModeCameraService) LIZ;
        }
        if (C58096Mr6.s == null) {
            synchronized (IDuetModeCameraService.class) {
                if (C58096Mr6.s == null) {
                    C58096Mr6.s = new DuetModeCameraServiceImpl();
                }
            }
        }
        return C58096Mr6.s;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IDuetModeCameraService
    public final HXQ LIZJ() {
        HXQ hxq = this.LIZIZ;
        if (hxq != null) {
            return hxq;
        }
        o.LJIJI("duetDownloadListener");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IDuetModeCameraService
    public final I3O LIZLLL() {
        I3O i3o = this.LIZ;
        if (i3o != null) {
            return i3o;
        }
        o.LJIJI("duetClickListener");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IDuetModeCameraService
    public final void LIZ(I3G i3g) {
        this.LIZIZ = i3g;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IDuetModeCameraService
    public final void LIZIZ(I3H i3h) {
        this.LIZ = i3h;
    }
}
