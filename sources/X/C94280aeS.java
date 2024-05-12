package X;

import com.bytedance.ies.effectcreator.swig.Asset;
import com.bytedance.ies.effectcreator.swig.Feature;

/* renamed from: X.aeS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94280aeS implements InterfaceC93942aZ0 {
    public final /* synthetic */ Feature LIZ;
    public final /* synthetic */ Asset LIZIZ;

    @Override // X.InterfaceC93942aZ0
    public final void LIZ() {
        this.LIZ.willBeSelected();
        Asset asset = this.LIZIZ;
        if (asset != null) {
            C93847aXT.LJ(this.LIZ, asset, true);
        }
    }

    public C94280aeS(Feature feature, Asset asset) {
        this.LIZ = feature;
        this.LIZIZ = asset;
    }
}
