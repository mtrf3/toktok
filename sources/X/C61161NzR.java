package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.commercialize.depend.AdTrackDependImpl;
import com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NzR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61161NzR implements IAdTrackDepend {
    public static final C61161NzR LIZIZ = new C61161NzR();
    public final /* synthetic */ IAdTrackDepend LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final int LIZ(Exception exc) {
        return this.LIZ.LIZ(exc);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZIZ(String result, String did) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(did, "did");
        return this.LIZ.LIZIZ(result, did);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final void LIZLLL(AqS160S0100000_10 aqS160S0100000_10) {
        this.LIZ.LIZLLL(aqS160S0100000_10);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final SharedPreferences LJI() {
        return this.LIZ.LJI();
    }

    public C61161NzR() {
        IAdTrackDepend iAdTrackDepend;
        Object LIZ = C58096Mr6.LIZ(IAdTrackDepend.class, false);
        if (LIZ != null) {
            iAdTrackDepend = (IAdTrackDepend) LIZ;
        } else {
            if (C58096Mr6.LLLLIIL == null) {
                synchronized (IAdTrackDepend.class) {
                    if (C58096Mr6.LLLLIIL == null) {
                        C58096Mr6.LLLLIIL = new AdTrackDependImpl();
                    }
                }
            }
            iAdTrackDepend = C58096Mr6.LLLLIIL;
        }
        this.LIZ = iAdTrackDepend;
    }
}
