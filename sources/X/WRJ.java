package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRJ implements InterfaceC148845sm {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final InterfaceC82293WRl LIZIZ;

    public WRJ(String str, WRZ wrz) {
        this.LIZ = str;
        this.LIZIZ = wrz;
    }

    @Override // X.InterfaceC148845sm
    public final int LIZ(FilterBean filterBean, InterfaceC122704ri getter) {
        o.LJIIIZ(filterBean, "filterBean");
        o.LJIIIZ(getter, "getter");
        InterfaceC82293WRl interfaceC82293WRl = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('-');
        LIZ.append(filterBean.getResId());
        int LIZIZ = interfaceC82293WRl.LIZIZ(X1D.LIZIZ(LIZ), filterBean.getCompareKey());
        if (LIZIZ == -1) {
            return TML.LIZLLL(filterBean, TML.LIZIZ(filterBean, getter), getter);
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC148845sm
    public final void LIZIZ(FilterBean filterBean, int i) {
        o.LJIIIZ(filterBean, "filterBean");
        InterfaceC82293WRl interfaceC82293WRl = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('-');
        LIZ.append(filterBean.getResId());
        interfaceC82293WRl.LIZ(i, X1D.LIZIZ(LIZ), filterBean.getCompareKey());
    }
}
