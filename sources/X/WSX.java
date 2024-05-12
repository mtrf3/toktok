package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSX implements InterfaceC83233WlZ {
    public final /* synthetic */ WST LIZ;

    @Override // X.InterfaceC83233WlZ
    public final void LIZJ() {
    }

    @Override // X.InterfaceC83233WlZ
    public final void LJ(ComposerBeauty composerBeauty, List list) {
    }

    @Override // X.InterfaceC83233WlZ
    public final void LJFF(ComposerBeauty composerBeauty, List<String> list) {
    }

    @Override // X.InterfaceC83233WlZ
    public final void LJI(ComposerBeauty composerBeauty) {
    }

    @Override // X.InterfaceC83233WlZ
    public final void LJII() {
    }

    @Override // X.InterfaceC83233WlZ
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC83233WlZ
    public final void LJIIIZ() {
    }

    public WSX(WST wst) {
        this.LIZ = wst;
    }

    @Override // X.InterfaceC83233WlZ
    public final void LIZIZ(ComposerBeauty beauty) {
        o.LJIIIZ(beauty, "beauty");
        if (C1DH.LJJII(beauty) && beauty != null) {
            this.LIZ.LIZLLL.clear();
            this.LIZ.LIZ();
        }
    }

    @Override // X.InterfaceC83233WlZ
    public final void LIZLLL(BeautyCategory beautyCategory) {
        Boolean bool;
        WST wst = this.LIZ;
        BeautyCategoryExtra beautyCategoryExtra = beautyCategory.getBeautyCategoryExtra();
        if (beautyCategoryExtra != null) {
            bool = Boolean.valueOf(beautyCategoryExtra.getShowTips());
        } else {
            bool = null;
        }
        wst.LIZJ = bool.booleanValue();
        WST tryShowPrimaryTip = this.LIZ;
        o.LJIIIZ(tryShowPrimaryTip, "$this$tryShowPrimaryTip");
        WST wst2 = this.LIZ;
        wst2.getClass();
        C6QQ.LIZ(new AqS164S0100000_14(wst2, 35));
    }

    @Override // X.InterfaceC83233WlZ
    public final void LIZ(ComposerBeauty composerBeauty, int i, List<String> list) {
        boolean z;
        BeautyCategoryExtra categoryExtra = composerBeauty.getCategoryExtra();
        if (categoryExtra != null && categoryExtra.getShowTips()) {
            C1HQ<String, Boolean> c1hq = this.LIZ.LIZLLL;
            String resourceId = composerBeauty.getEffect().getResourceId();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            c1hq.put(resourceId, Boolean.valueOf(z));
            this.LIZ.LIZ();
        }
    }
}
