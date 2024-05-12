package X;

import com.ss.android.ugc.aweme.casting.CastingServiceImpl;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.casting.api.ICastingService;
import com.ss.android.ugc.aweme.casting.api.IPlaybackControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Yp3, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88545Yp3 implements ICastingService {
    public static final C88545Yp3 LIZIZ = new C88545Yp3();
    public final /* synthetic */ ICastingService LIZ;

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final IPlaybackControlService LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LIZJ(boolean z) {
        this.LIZ.LIZJ(z);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final ICastingPlayerService LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJFF(String str, String str2, String str3) {
        this.LIZ.LJFF(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJI(String str, String str2, String str3) {
        this.LIZ.LJI(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final InterfaceC62486Ofi LJII(Aweme aweme, String str) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LJII(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIIZ() {
        this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final EE1 LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIJJI(boolean z) {
        this.LIZ.LJIIJJI(z);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIIL(Aweme aweme) {
        return this.LIZ.LJIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean isConnected() {
        return this.LIZ.isConnected();
    }

    public C88545Yp3() {
        ICastingService iCastingService;
        Object LIZ = C58096Mr6.LIZ(ICastingService.class, false);
        if (LIZ != null) {
            iCastingService = (ICastingService) LIZ;
        } else {
            if (C58096Mr6.LLJJJJLIIL == null) {
                synchronized (ICastingService.class) {
                    if (C58096Mr6.LLJJJJLIIL == null) {
                        C58096Mr6.LLJJJJLIIL = new CastingServiceImpl();
                    }
                }
            }
            iCastingService = C58096Mr6.LLJJJJLIIL;
        }
        this.LIZ = iCastingService;
    }
}
