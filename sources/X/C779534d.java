package X;

import Y.ARunnableS20S0200000_1;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.34d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C779534d extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ ServiceInfo LJLJI;
    public final /* synthetic */ Aweme LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C779534d(boolean z, boolean z2, ServiceInfo serviceInfo, Aweme aweme) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = serviceInfo;
        this.LJLJJI = aweme;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C71052qb c71052qb;
        String str;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null || this.LJLIL) {
            return;
        }
        String str2 = null;
        if (this.LJLILLLLZI) {
            Aweme aweme = c71082qe.LIZJ.LIZIZ;
            if (aweme != null) {
                str = aweme.getGroupId();
            } else {
                str = null;
            }
            Aweme aweme2 = c71082qe.LIZJ.LIZIZ;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C779634e.LIZ(c71082qe.LIZJ.LIZJ, str, str2, !r0.LJ, this.LJLJI.name, c71082qe.LIZIZ.LJIIIIZZ(), "select_device_panel");
            c71082qe.LIZIZ.LJI(this.LJLJI);
            return;
        }
        C779434c c779434c = c71082qe.LIZIZ;
        ServiceInfo service = this.LJLJI;
        Aweme aweme3 = this.LJLJJI;
        c779434c.getClass();
        o.LJIIIZ(service, "service");
        if (c779434c.LJII.getValue() != null) {
            return;
        }
        C70922qO.LIZ("CastingServiceManager", "connectService");
        c779434c.LIZLLL = Long.valueOf(System.currentTimeMillis());
        ServiceInfo value = c779434c.LJIIIIZZ.getValue();
        if (value != null) {
            c779434c.LJI(value);
        }
        c779434c.LJII.postValue(service);
        c779434c.LJIIIIZZ.postValue(null);
        c779434c.LJIIIZ.postValue(null);
        C71082qe c71082qe2 = C71042qa.LIZIZ;
        if (c71082qe2 != null && (c71052qb = c71082qe2.LIZ) != null) {
            c71052qb.LIZLLL(service);
        }
        C779734f c779734f = c779434c.LJIIJ;
        ARunnableS20S0200000_1 aRunnableS20S0200000_1 = new ARunnableS20S0200000_1(c779434c, aweme3, 48);
        c779734f.getClass();
        ARunnableS20S0200000_1 aRunnableS20S0200000_12 = new ARunnableS20S0200000_1(aRunnableS20S0200000_1, c779734f, 47);
        c779734f.LIZ = aRunnableS20S0200000_12;
        c779734f.LIZIZ.postDelayed(aRunnableS20S0200000_12, 30000L);
    }

    @Override // X.InterfaceC65784Pro
    public final /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
