package X;

import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.BrW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30094BrW implements C0IZ {
    public final /* synthetic */ IBannerService LIZ;
    public final /* synthetic */ C30087BrP LIZIZ;

    @Override // X.C0IZ
    public final void LIZ(boolean z) {
        IBannerService iBannerService = this.LIZ;
        Room room = this.LIZIZ.LJLLILLLL;
        if (room != null) {
            if (iBannerService.yj0(room.getId())) {
                this.LIZIZ.LIZ(this.LIZ);
                return;
            }
            C30087BrP c30087BrP = this.LIZIZ;
            c30087BrP.LJLJJL.unload(c30087BrP.LJLLLL);
            this.LIZIZ.LJLLLL = null;
            return;
        }
        o.LJIJI("mRoom");
        throw null;
    }

    public C30094BrW(IBannerService iBannerService, C30087BrP c30087BrP) {
        this.LIZ = iBannerService;
        this.LIZIZ = c30087BrP;
    }
}
