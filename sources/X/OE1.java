package X;

import com.bytedance.geckox.model.UpdatePackage;

/* loaded from: classes11.dex */
public final class OE1 extends OE9 {
    public final /* synthetic */ AbstractC61537ODd LIZ;

    public OE1(AbstractC61537ODd abstractC61537ODd) {
        this.LIZ = abstractC61537ODd;
    }

    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        UpdatePackage updatePackage = (UpdatePackage) c61546ODm.LIZIZ(C61540ODg.class);
        OC6.LIZ("gecko-debug-tag", "downloadListener onEnd", updatePackage.toString());
        AbstractC61537ODd abstractC61537ODd = this.LIZ;
        if (abstractC61537ODd != null) {
            abstractC61537ODd.LJIIIIZZ(updatePackage);
        }
    }
}
