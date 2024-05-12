package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class ODO extends OE9 {
    public final /* synthetic */ AbstractC61537ODd LIZ;

    public ODO(AbstractC61537ODd abstractC61537ODd) {
        this.LIZ = abstractC61537ODd;
    }

    @Override // X.OE9
    public final void LIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        UpdatePackage updatePackage = (UpdatePackage) c61546ODm.LJFF(C61579OEt.class);
        OC6.LIZ("gecko-debug-tag", "onUpdateFailed", updatePackage.toString(), th.getMessage());
        if (updatePackage.getIsZstd() && !updatePackage.getUpdateWithPatch() && updatePackage.hasFallback()) {
            AbstractC61537ODd abstractC61537ODd = this.LIZ;
            OC6.LIZ("gecko-debug-tag", "update failed with zstd, now use zip!", updatePackage.toString());
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(2);
            optionCheckUpdateParams.setListener(abstractC61537ODd);
            C61276O3c LJ = EBC.LIZ.LJ();
            if (LJ == null) {
                return;
            }
            try {
                ODN.LJIIIIZZ(LJ, optionCheckUpdateParams).LJ(Arrays.asList(updatePackage.fallbackInstance()));
                return;
            } catch (Exception e) {
                OC6.LIZ("gecko-debug-tag", "update failed with zstd and zip!", e.getMessage());
                return;
            }
        }
        String channel = updatePackage.getChannel();
        AbstractC61537ODd abstractC61537ODd2 = this.LIZ;
        if (abstractC61537ODd2 == null) {
            return;
        }
        abstractC61537ODd2.LJIIJJI(channel, th);
        this.LIZ.LJIIJ(updatePackage, th);
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        LIZ(c61546ODm, abstractC61551ODr, th);
    }
}
