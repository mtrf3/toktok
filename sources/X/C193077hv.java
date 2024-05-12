package X;

import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.7hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193077hv implements InterfaceC192527h2 {
    public final String LJLIL;
    public AKT LJLILLLLZI;
    public final C193067hu LJLJI;

    public C193077hv(String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = awemeId;
        this.LJLJI = new C193067hu(this);
    }

    @QD3
    public final void onCollectAwemeEvent(C193097hx e) {
        AKT akt;
        o.LJIIIZ(e, "e");
        if (e.LJLILLLLZI == 0) {
            if (o.LJ(e.LJLIL, this.LJLIL) && (akt = this.LJLILLLLZI) != null) {
                akt.LIZ();
            }
            if (EventBus.LIZJ().LJI(this)) {
                EventBus.LIZJ().LJIJ(this);
            }
        }
    }

    @Override // X.AnonymousClass885
    public final void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, bool.booleanValue(), enumC2063587z);
    }

    @Override // X.InterfaceC192527h2
    public final void u8(String id, boolean z, EnumC2063587z source) {
        AKT akt;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (!z) {
            if (o.LJ(id, this.LJLIL) && (akt = this.LJLILLLLZI) != null) {
                akt.LIZ.LJLIL.LJI = false;
                akt.LIZ();
            }
            AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ(this);
        }
    }
}
