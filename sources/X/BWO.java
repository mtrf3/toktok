package X;

import com.bytedance.android.livesdk.interaction.AudienceInteractionFeaturesDialog;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BWO extends C1E1 {
    public final /* synthetic */ AudienceInteractionFeaturesDialog LIZ;

    public BWO(AudienceInteractionFeaturesDialog audienceInteractionFeaturesDialog) {
        this.LIZ = audienceInteractionFeaturesDialog;
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZIZ(C04120Ee c04120Ee) {
        C29306Beo.LJJLJLI(this.LIZ._$_findCachedViewById(R.id.c25).findViewById(R.id.c0x));
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LJFF(C04120Ee c04120Ee) {
        if (c04120Ee.LJIIIIZZ == EnumC04110Ed.CANCEL) {
            C29306Beo.LJI(this.LIZ._$_findCachedViewById(R.id.c25).findViewById(R.id.c0x));
        }
    }
}