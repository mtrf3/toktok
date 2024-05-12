package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Oan, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62181Oan implements InterfaceC78763Uvf {
    public final /* synthetic */ C62180Oam LIZ;

    @Override // X.InterfaceC78763Uvf
    public final void onSuccess() {
        C62180Oam c62180Oam = this.LIZ;
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJI(UriProtector.parse(this.LIZ.LJLJI));
        LIZJ.LJIIL = this.LIZ.getController();
        LIZJ.LJII = this.LIZ.getImageLoadListener();
        c62180Oam.setController(LIZJ.LIZ());
        this.LIZ.LIZIZ();
        String url = this.LIZ.LJLJI;
        o.LJIIIZ(url, "url");
    }

    public C62181Oan(C62180Oam c62180Oam) {
        this.LIZ = c62180Oam;
    }

    @Override // X.InterfaceC78763Uvf
    public final void onFailure(Exception exc) {
        this.LIZ.getClass();
    }
}
