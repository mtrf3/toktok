package X;

import Y.AObjectS52S0101000_7;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;

@InterfaceC55644Lse(service = {G5X.class})
/* renamed from: X.G7f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40999G7f implements G5X {
    public final GF2 LJLIL;
    public final InterfaceC41201GEz LJLILLLLZI;
    public final GF0 LJLJI;
    public final GF1 LJLJJI;
    public final List<InterfaceC40998G7e> LJLJJL;

    @Override // X.G5X
    public final void Ny() {
        Iterator<InterfaceC40998G7e> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().P0();
        }
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        Iterator<InterfaceC40998G7e> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().initialize();
        }
        C59367NRr.LIZJ(this);
    }

    @Override // X.G5X
    public final C40994G7a w20() {
        return new C40994G7a(this);
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public C40999G7f(GF4 gf4) {
        this.LJLIL = gf4;
        CommerceTcmPublishModule LIZ = CommerceToolsTcmServiceImpl.LJIJJ().LIZ(gf4);
        this.LJLILLLLZI = LIZ;
        GF0 KH = CommerceToolsMusicService.LIZIZ(false).KH(gf4);
        this.LJLJI = KH;
        C42506GmE LJII = CommerceMissionServiceImpl.LJIIIIZZ().LJII(gf4);
        this.LJLJJI = LJII;
        this.LJLJJL = C47261Igj.LJJIJIL(LIZ, KH, LJII, CommerceToolsStickerServiceImpl.LJIIL().LIZ(gf4));
    }

    @Override // X.G5X
    public final void ay(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        LIZ(aObjectS52S0101000_7, C41001G7h.LJLIL);
    }

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        C40996G7c c40996G7c = new C40996G7c(interfaceC65784Pro, interfaceC65784Pro2);
        c40996G7c.LIZ(new AqS173S0100000_7(this, 214));
        c40996G7c.LIZ(new AqS173S0100000_7(this, 215));
        c40996G7c.LIZ(new AqS173S0100000_7(this, 216));
        c40996G7c.LIZ(new AqS173S0100000_7(c40996G7c, 227));
        C40997G7d c40997G7d = c40996G7c.LIZJ;
        if (c40997G7d != null) {
            c40997G7d.LIZLLL();
        }
    }
}
