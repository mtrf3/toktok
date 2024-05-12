package com.ss.android.ugc.aweme.anchor.service;

import X.C58096Mr6;
import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnchorStateServiceImpl implements AnchorLock$IAnchorStateService, AnchorDialogPanelService {
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LIZ() {
        this.LIZ = 0;
    }

    static {
        new ArrayList();
    }

    public static AnchorDialogPanelService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(AnchorDialogPanelService.class, false);
        if (LIZ != null) {
            return (AnchorDialogPanelService) LIZ;
        }
        if (C58096Mr6.LLIIII == null) {
            synchronized (AnchorDialogPanelService.class) {
                if (C58096Mr6.LLIIII == null) {
                    C58096Mr6.LLIIII = new AnchorStateServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIIII;
    }

    public static AnchorLock$IAnchorStateService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(AnchorLock$IAnchorStateService.class, false);
        if (LIZ != null) {
            return (AnchorLock$IAnchorStateService) LIZ;
        }
        if (C58096Mr6.LLIIII == null) {
            synchronized (AnchorLock$IAnchorStateService.class) {
                if (C58096Mr6.LLIIII == null) {
                    C58096Mr6.LLIIII = new AnchorStateServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIIII;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final boolean LJFF() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService
    public final boolean LJI() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LIZIZ(int i) {
        if (LJII(i) || i == 4) {
            this.LIZ = i;
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService
    public final void LIZJ(boolean z) {
        this.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LIZLLL(int i) {
        if ((this.LIZ | i) == i) {
            this.LIZ = 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final String LJ(Context context) {
        Resources resources = null;
        if (this.LIZ == 4) {
            if (context != null) {
                resources = context.getResources();
            }
            o.LJI(resources);
            String string = resources.getString(R.string.p6x);
            o.LJIIIIZZ(string, "{\n            context?.r…conflict_toast)\n        }");
            return string;
        }
        if (context != null) {
            resources = context.getResources();
        }
        o.LJI(resources);
        String string2 = resources.getString(R.string.p6v);
        o.LJIIIIZZ(string2, "{\n            context?.r…conflict_toast)\n        }");
        return string2;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final boolean LJII(int i) {
        if ((this.LIZ | i) == i) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LJIIIIZZ(boolean z) {
        this.LIZIZ = z;
    }
}
