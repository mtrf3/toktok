package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* renamed from: X.G5x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40965G5x extends GF4 {
    public final /* synthetic */ G65 LIZIZ;
    public final /* synthetic */ Fragment LIZJ;

    @Override // X.GGH
    public final void LJ(boolean z) {
    }

    @Override // X.GGH
    public final void LJII(boolean z) {
    }

    @Override // X.GGH
    public final void LJIIL(boolean z) {
    }

    @Override // X.GGH
    public final void LJIILL(boolean z) {
    }

    @Override // X.GF9, X.InterfaceC42491Glz, X.GGH, X.GF3
    public final VideoPublishEditModel LIZLLL() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.InterfaceC42491Glz
    public final boolean LJIILIIL() {
        return this.LIZIZ.LIZJ.creativeModel.transientPostPageModel.LJIIJ;
    }

    @Override // X.GF7
    public final InterfaceC78933UyP LJIILLIIL() {
        return this.LIZIZ.LJI;
    }

    @Override // X.GF7
    public final WM7 getScene() {
        return this.LIZIZ.LJFF;
    }

    @Override // X.GF9
    public final String getUid() {
        String uid;
        C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return uid;
    }

    @Override // X.InterfaceC41452GOq
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        AbstractC42651GoZ abstractC42651GoZ = this.LIZIZ.LIZ;
        return C165706es.LIZIZ(SceneExtensionsKt.LIZLLL(abstractC42651GoZ), abstractC42651GoZ);
    }

    @Override // X.GGH
    public final boolean LJIIJ() {
        return CommerceToolsTcmServiceImpl.LJIJJ().LJIILL();
    }

    @Override // X.GGH
    public final List<AVTextExtraStruct> LJI() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC42491Glz, X.GGH
    public final Fragment getFragment() {
        return this.LIZJ;
    }

    public C40965G5x(G65 g65, Fragment fragment) {
        this.LIZIZ = g65;
        this.LIZJ = fragment;
    }
}
