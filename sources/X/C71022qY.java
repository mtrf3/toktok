package X;

import com.byted.cast.common.source.ServiceInfo;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.2qY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71022qY extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C71052qb LJLJJI;
    public final /* synthetic */ ServiceInfo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71022qY(int i, int i2, int i3, C71052qb c71052qb, ServiceInfo serviceInfo) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = c71052qb;
        this.LJLJJL = serviceInfo;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setServerListener onDisconnect serviceId: ");
        LIZ.append(this.LJLIL);
        LIZ.append(", what: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" extra: ");
        LIZ.append(this.LJLJI);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        C779434c c779434c = null;
        if (this.LJLILLLLZI == 200) {
            InterfaceC71012qX interfaceC71012qX = this.LJLJJI.LJ;
            if (interfaceC71012qX != null) {
                interfaceC71012qX.LJ(this.LJLJJL);
            }
        } else {
            InterfaceC71012qX interfaceC71012qX2 = this.LJLJJI.LJ;
            if (interfaceC71012qX2 != null) {
                interfaceC71012qX2.LIZ(this.LJLIL, null);
            }
        }
        EventBus LIZJ = EventBus.LIZJ();
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null) {
            c779434c = c71082qe.LIZIZ;
        }
        LIZJ.LJIJ(c779434c);
        return C76800UCe.LIZ;
    }
}
