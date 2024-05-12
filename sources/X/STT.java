package X;

import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseStyleFragment;

/* loaded from: classes13.dex */
public final class STT extends AbstractC008101l {
    public final /* synthetic */ ProfileAigcChooseStyleFragment LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        STD.LIZ(null, "back");
        ActivityC45651qj mo49getActivity = this.LIZJ.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public STT(ProfileAigcChooseStyleFragment profileAigcChooseStyleFragment) {
        super(true);
        this.LIZJ = profileAigcChooseStyleFragment;
    }
}
