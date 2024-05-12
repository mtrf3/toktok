package X;

import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopCloneServiceImpl;

/* renamed from: X.Y6s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86850Y6s implements IVopCloneService {
    public static final C86850Y6s LIZIZ = new C86850Y6s();
    public final /* synthetic */ IVopCloneService LIZ;

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final void LIZJ(Context context, String str) {
        this.LIZ.LIZJ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final String LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v destroyEngine() {
        return this.LIZ.destroyEngine();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v getCurrentState() {
        return this.LIZ.getCurrentState();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v init(String str) {
        return this.LIZ.init(str);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v play() {
        return this.LIZ.play();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v preparePlayer() {
        return this.LIZ.preparePlayer();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v stop() {
        return this.LIZ.stop();
    }

    public C86850Y6s() {
        IVopCloneService iVopCloneService;
        Object LIZ = C58096Mr6.LIZ(IVopCloneService.class, false);
        if (LIZ != null) {
            iVopCloneService = (IVopCloneService) LIZ;
        } else {
            if (C58096Mr6.LLIZLLLIL == null) {
                synchronized (IVopCloneService.class) {
                    if (C58096Mr6.LLIZLLLIL == null) {
                        C58096Mr6.LLIZLLLIL = new VopCloneServiceImpl();
                    }
                }
            }
            iVopCloneService = C58096Mr6.LLIZLLLIL;
        }
        this.LIZ = iVopCloneService;
    }
}
