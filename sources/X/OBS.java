package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OBS implements InterfaceC50639Ju7<C50741Jvl> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(OBW.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(OBV.LJLIL);
    public C50741Jvl LIZJ = new C50741Jvl(0);
    public String LIZLLL = "";
    public final int LJ = 3;

    @Override // X.InterfaceC50639Ju7
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LJ);
    }

    public final OBT LIZJ() {
        return (OBT) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC50639Ju7
    public final /* bridge */ /* synthetic */ C50741Jvl getData() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC50639Ju7
    public final void LIZ(Context context, SearchResultParam searchResultParam, Long l) {
        o.LJIIIZ(context, "context");
        if ((!this.LIZJ.LJLIL.isEmpty()) || this.LIZLLL.length() == 0) {
            return;
        }
        C61483OBb.LIZJ.getClass();
        IResourceService iResourceService = (IResourceService) C61484OBc.LIZIZ().LIZIZ(IResourceService.class, "hybridkit_default_bid");
        if (iResourceService == null) {
            return;
        }
        String LIZ = C38943FQd.LIZ();
        if (LIZ.length() <= 0 || LIZJ().LIZ()) {
            return;
        }
        String str = this.LIZLLL;
        O1M o1m = new O1M(LIZ);
        C61091NyJ c61091NyJ = new C61091NyJ(true);
        c61091NyJ.LIZ = C47261Igj.LJJIJIL(EnumC61089NyH.GECKO);
        o1m.LIZ = c61091NyJ;
        o1m.LIZLLL = 0;
        o.LJIIJ(str, "<set-?>");
        o1m.LJFF = str;
        iResourceService.loadAsync("", o1m, new AqS63S1100000_10(this, str, 12), new AqS176S0100000_10(this, 211));
    }
}
