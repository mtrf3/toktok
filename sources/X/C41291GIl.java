package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.GIl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41291GIl implements GJ8 {
    public final /* synthetic */ AdPersonalizationActivity LIZ;

    public C41291GIl(AdPersonalizationActivity adPersonalizationActivity) {
        this.LIZ = adPersonalizationActivity;
    }

    @Override // X.GJ8
    public final void LIZ(boolean z) {
        if (z) {
            if (C41290GIk.LJIIIIZZ() && C41290GIk.LIZ() == 1) {
                this.LIZ.LLFII(false);
            }
            if (!C41290GIk.LJIIIIZZ() && C41290GIk.LIZJ() == 1) {
                this.LIZ.LLFII(false);
            }
            AI8 ai8 = this.LIZ.LJLLI;
            if (ai8 != null) {
                ai8.setCellEnabled(false);
                this.LIZ.LLFFF = true;
                return;
            } else {
                o.LJIJI("personalizationAdItem");
                throw null;
            }
        }
        AI8 ai82 = this.LIZ.LJLLI;
        if (ai82 != null) {
            ai82.setCellEnabled(true);
            this.LIZ.LLFFF = false;
        } else {
            o.LJIJI("personalizationAdItem");
            throw null;
        }
    }
}
