package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;

/* renamed from: X.ODu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61554ODu extends OE9 {
    public final /* synthetic */ AbstractC61537ODd LIZ;

    public C61554ODu(AbstractC61537ODd abstractC61537ODd) {
        this.LIZ = abstractC61537ODd;
    }

    @Override // X.OE9
    public final void LIZLLL(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        Pair pair = (Pair) c61546ODm.LIZIZ(ODH.class);
        UpdatePackage updatePackage = (UpdatePackage) pair.first;
        String channel = updatePackage.getChannel();
        AbstractC61537ODd abstractC61537ODd = this.LIZ;
        if (abstractC61537ODd != null) {
            abstractC61537ODd.LJIILJJIL(((Long) pair.second).longValue(), channel);
            this.LIZ.LJIILL(updatePackage, ((Long) pair.second).longValue());
        }
    }
}
