package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TiB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75379TiB {
    public final C47061t0 LIZ;
    public boolean LIZIZ;
    public String LIZJ = "ttlive_sound_wavee_anim_low.webp";

    public C75379TiB(C47061t0 c47061t0) {
        this.LIZ = c47061t0;
    }

    public final void LIZ(String fileName) {
        InterfaceC81252Vui interfaceC81252Vui;
        if (o.LJ("", fileName)) {
            this.LIZIZ = true;
            return;
        }
        C29306Beo.LJJLJLI(this.LIZ);
        C81705W4v LIZJ = W5I.LIZJ();
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null) {
            interfaceC81252Vui = c47061t0.getController();
        } else {
            interfaceC81252Vui = null;
        }
        LIZJ.LJIIL = interfaceC81252Vui;
        String LIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1");
        o.LJIIIZ(fileName, "fileName");
        LIZJ.LJII(C15510jD.LJIIIZ(LIZ, fileName));
        LIZJ.LJII = new C75386TiI(this, fileName);
        LIZJ.LJIIJ = true;
        W4R LIZ2 = LIZJ.LIZ();
        C47061t0 c47061t02 = this.LIZ;
        if (c47061t02 == null) {
            return;
        }
        c47061t02.setController(LIZ2);
    }
}
