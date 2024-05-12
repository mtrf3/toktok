package X;

import com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WQg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82262WQg implements InterfaceC78567UsV {
    public final InterfaceC82236WPg LIZ;
    public final InterfaceC139745e6<FilterBoxApi> LIZIZ;
    public final InterfaceC139745e6<InterfaceC84497XEf> LIZJ;
    public final C44211HWt LIZLLL;
    public final InterfaceC82281WQz LJ;

    @Override // X.InterfaceC78567UsV
    public final C82240WPk create() {
        return new C82240WPk(new WR5(C221108m2.LIZIZ(new AqS164S0100000_14(this, 346)), this.LIZLLL, this.LIZJ, this.LJ), this.LIZ);
    }

    public C82262WQg(InterfaceC82236WPg filterRepository, C45335Hql c45335Hql, C45331Hqh c45331Hqh, C44211HWt c44211HWt, C1TI c1ti) {
        o.LJIIIZ(filterRepository, "filterRepository");
        this.LIZ = filterRepository;
        this.LIZIZ = c45335Hql;
        this.LIZJ = c45331Hqh;
        this.LIZLLL = c44211HWt;
        this.LJ = c1ti;
    }
}
