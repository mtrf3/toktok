package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44657Hfp implements InterfaceC122704ri {
    public final /* synthetic */ InterfaceC83727WtX LIZ;

    public C44657Hfp(InterfaceC83727WtX interfaceC83727WtX) {
        this.LIZ = interfaceC83727WtX;
    }

    @Override // X.InterfaceC122704ri
    public final float LIZ(FilterBean filterBean) {
        o.LJIIIZ(filterBean, "filterBean");
        float LIZLLL = C44659Hfr.LIZLLL(filterBean);
        if (LIZLLL == 0.0f) {
            InterfaceC83727WtX interfaceC83727WtX = this.LIZ;
            String filterFolder = filterBean.getFilterFolder();
            o.LJIIIIZZ(filterFolder, "filterBean.filterFolder");
            return interfaceC83727WtX.getFilterIntensity(filterFolder);
        }
        return LIZLLL;
    }
}
