package X;

import com.ss.android.ugc.aweme.im.sdk.activitystatus.data.api.ActivityStatusAPI;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.GiphyGifApi;

/* renamed from: X.4Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106504Fy extends C4G3 {
    public final C253119wZ LIZ;
    public final C106504Fy LIZIZ = this;
    public C4G1<ActivityStatusAPI> LIZJ = C253079wV.LIZ(new C106464Fu(this, 1));
    public C4G1<C3UL> LIZLLL = C4LK.LIZ(new C106464Fu(this, 0));
    public C4G1<C98453th> LJ = C253079wV.LIZ(new C106464Fu(this, 3));
    public C4G1<InterfaceC100593x9> LJFF = C4LK.LIZ(new C106464Fu(this, 2));
    public C4G1<C98453th> LJI = C253079wV.LIZ(new C106464Fu(this, 5));
    public C4G1<C3A6> LJII = C253079wV.LIZ(new C106464Fu(this, 4));
    public C4G1<GiphyGifApi> LJIIIIZZ = C253079wV.LIZ(new C106464Fu(this, 6));
    public C4G1<GiphyAnalytics> LJIIIZ = C253079wV.LIZ(new C106464Fu(this, 7));

    @Override // X.C4G4
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC100563x6
    public final InterfaceC100593x9 LIZ() {
        return this.LJFF.get();
    }

    @Override // X.InterfaceC100563x6
    public final C3A6 LIZJ() {
        return this.LJII.get();
    }

    @Override // X.YU9
    public final C4G2 LIZLLL() {
        return new C4G2(this.LIZIZ);
    }

    @Override // X.InterfaceC100563x6
    public final C3UL LJ() {
        return this.LIZLLL.get();
    }

    public C106504Fy(C253119wZ c253119wZ) {
        this.LIZ = c253119wZ;
    }
}
