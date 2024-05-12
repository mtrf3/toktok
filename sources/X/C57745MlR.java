package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.MlR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57745MlR<T> implements InterfaceC66992k3 {
    public final /* synthetic */ UrlModel LJLIL;
    public final /* synthetic */ C86192XsC LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C57745MlR(UrlModel urlModel, C86192XsC c86192XsC, long j) {
        this.LJLIL = urlModel;
        this.LJLILLLLZI = c86192XsC;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Bitmap> interfaceC65052gv) {
        C57743MlP c57743MlP = InterfaceC57744MlQ.LJJII;
        W5F LJII = W5U.LJII(C78939UyV.LJ(this.LJLIL));
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        EnumC57383Mfb imgType = EnumC57383Mfb.LABEL;
        C57746MlS c57746MlS = new C57746MlS(this.LJLILLLLZI, this.LJLIL, this.LJLJI, (C73578SuE) interfaceC65052gv);
        c57743MlP.getClass();
        o.LJIIIZ(imgType, "imgType");
        LJII.LIZIZ(C57743MlP.LIZ(null, imgType));
        C78658Uty be0 = C57738MlK.LIZIZ.LJ().be0("", null, imgType, c57746MlS);
        if (be0 == null) {
            LJII.LJIIIZ(c57746MlS);
        } else {
            be0.LIZLLL(LJII);
        }
    }
}
