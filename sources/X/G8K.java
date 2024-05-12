package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class G8K extends AbstractC42152GgW<C76800UCe> {
    public final Activity LJLJJI;
    public final VideoPublishEditModel LJLJJL;

    @Override // X.AbstractC42152GgW
    public final void LIZIZ() {
    }

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Privacy Confirmation Check Story";
    }

    @Override // X.AbstractC42152GgW
    public final void LIZLLL() {
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        boolean z;
        o.LJIIIZ(nextStep, "nextStep");
        if (this.LJLJJL.isPrivate() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C78555UsJ.LJJJ(this.LJLJJI, this.LJLJJL)) {
            nextStep.LIZIZ(this);
            return;
        }
        if (z || !G8L.LIZ() || !a.LJFF().LJJII(this.LJLJJI)) {
            if (!C78555UsJ.LJJIZ(this.LJLJJI, this.LJLJJL)) {
                nextStep.LIZIZ(this);
                return;
            }
        }
        nextStep.LIZJ(this);
        IComplianceBusinessService LJFF = a.LJFF();
        Activity activity = this.LJLJJI;
        LJFF.LJJIFFI(activity, activity.getString(R.string.tvj), "video_edit_page", new AqS154S0200000_7(nextStep, this, 58), new AqS154S0200000_7(nextStep, this, 59));
    }

    public G8K(ActivityC45651qj activity, VideoPublishEditModel model) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        this.LJLJJI = activity;
        this.LJLJJL = model;
    }
}
