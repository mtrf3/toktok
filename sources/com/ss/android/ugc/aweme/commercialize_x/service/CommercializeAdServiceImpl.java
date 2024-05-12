package com.ss.android.ugc.aweme.commercialize_x.service;

import X.C1796273e;
import X.C58096Mr6;
import X.C58152Ms0;
import X.C59114NHy;
import X.C59115NHz;
import X.C60900NvE;
import X.C60903NvH;
import X.C74S;
import X.C78983UzD;
import X.C7OX;
import X.C7OY;
import X.InterfaceC1803976d;
import X.InterfaceC59113NHx;
import X.NI7;
import android.content.Context;
import android.util.SparseArray;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommercializeAdServiceImpl implements ICommercializeAdService {
    public final C60900NvE LIZ = C60903NvH.LJIL(C58152Ms0.LJLIL);
    public boolean LIZIZ;

    public static ICommercializeAdService LJ() {
        Object LIZ = C58096Mr6.LIZ(ICommercializeAdService.class, false);
        if (LIZ != null) {
            return (ICommercializeAdService) LIZ;
        }
        if (C58096Mr6.LLLZ == null) {
            synchronized (ICommercializeAdService.class) {
                if (C58096Mr6.LLLZ == null) {
                    C58096Mr6.LLLZ = new CommercializeAdServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final InterfaceC1803976d LIZLLL(int i) {
        SparseArray<InterfaceC1803976d> LIZ;
        InterfaceC59113NHx interfaceC59113NHx = (InterfaceC59113NHx) this.LIZ.LIZ();
        if (interfaceC59113NHx != null && (LIZ = interfaceC59113NHx.LIZ()) != null) {
            return LIZ.get(i);
        }
        return null;
    }

    public final C7OX LJFF(NI7 ni7) {
        Class<? extends C7OX> cls;
        if (!this.LIZIZ) {
            synchronized (this) {
                if (!this.LIZIZ) {
                    C59115NHz.LIZ();
                    this.LIZIZ = true;
                }
            }
        }
        int type = ni7.getType();
        try {
            SparseArray<C7OX> sparseArray = C59115NHz.LIZIZ;
            C7OX c7ox = sparseArray.get(type);
            if (c7ox == null && (cls = C59115NHz.LIZ.get(type)) != null) {
                c7ox = cls.newInstance();
                sparseArray.put(type, c7ox);
            }
            return c7ox;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final void LIZ(AwemeHostApplication application, boolean z) {
        C59114NHy c59114NHy = C59114NHy.LIZ;
        o.LJIIIZ(application, "application");
        this.LIZ.LIZIZ(c59114NHy);
        if (z && !this.LIZIZ) {
            synchronized (this) {
                if (!this.LIZIZ) {
                    C59115NHz.LIZ();
                    this.LIZIZ = true;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final C74S LIZIZ(Context context, C1796273e c1796273e) {
        o.LJIIIZ(context, "context");
        C7OX LJFF = LJFF(c1796273e);
        if (LJFF != null) {
            return LJFF.LIZIZ(context, c1796273e);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final C7OY LIZJ(Context context, NI7 ni7) {
        C7OX LJFF = LJFF(ni7);
        if (LJFF != null) {
            return LJFF.LIZ(ni7);
        }
        return null;
    }
}
