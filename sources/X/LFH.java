package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.tablet.TabletServiceProxy;
import com.ss.android.ugc.aweme.tablet.api.ITabletService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFH implements ITabletService {
    public static final LFH LIZIZ = new LFH();
    public final /* synthetic */ ITabletService LIZ;

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC40368Fsq LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final void LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LIZIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC48243IwZ LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC53931LEp LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    public LFH() {
        ITabletService iTabletService;
        Object LIZ = C58096Mr6.LIZ(ITabletService.class, false);
        if (LIZ != null) {
            iTabletService = (ITabletService) LIZ;
        } else {
            if (C58096Mr6.u7 == null) {
                synchronized (ITabletService.class) {
                    if (C58096Mr6.u7 == null) {
                        C58096Mr6.u7 = new TabletServiceProxy();
                    }
                }
            }
            iTabletService = C58096Mr6.u7;
        }
        this.LIZ = iTabletService;
    }
}
