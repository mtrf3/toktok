package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.category.CardItemCell;

/* renamed from: X.Xd3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85253Xd3 implements InterfaceC47667InH {
    public final /* synthetic */ CardItemCell LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C85253Xd3(CardItemCell cardItemCell) {
        this.LJLIL = cardItemCell;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        C85254Xd4 c85254Xd4;
        C85254Xd4 c85254Xd42;
        PoiDiscoveryApi.PoiDiscoveryCard item = this.LJLIL.getItem();
        if (item != null && (c85254Xd4 = item.LJLJJI) != null && c85254Xd4.LIZJ) {
            PoiDiscoveryApi.PoiDiscoveryCard item2 = this.LJLIL.getItem();
            if (item2 != null && (c85254Xd42 = item2.LJLJJI) != null) {
                c85254Xd42.LIZJ = false;
            }
            this.LJLIL.LJIILLIIL();
        }
    }
}
