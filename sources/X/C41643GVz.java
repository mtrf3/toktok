package X;

import Y.ARunnableS26S0200000_7;
import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GVz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41643GVz extends C41642GVy {
    public final PublishModel LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // X.C41642GVy
    public final void LIZ() {
        StoryGroupPublishModel storyGroupPublishModel;
        PublishModel publishModel = this.LJLJLLL;
        if (publishModel != null && (storyGroupPublishModel = publishModel.storyGroupPublishModel) != null) {
            int i = storyGroupPublishModel.scheduleCount - storyGroupPublishModel.scheduleIndex;
            GWE gwe = this.LJLJJL;
            String quantityString = this.LJLIL.getResources().getQuantityString(R.plurals.ge, i, Integer.valueOf(i));
            o.LJIIIIZZ(quantityString, "fragmentActivity.resourc…failedCount, failedCount)");
            gwe.setText(quantityString);
            return;
        }
        super.LIZ();
    }

    @Override // X.C41642GVy
    public final void LJFF() {
        PublishModel publishModel = this.LJLJLLL;
        if (publishModel != null && publishModel.storyGroupPublishModel != null) {
            this.LJLJJI = true;
            LIZJ(false, false);
            LIZIZ();
            GVX.LIZJ = true;
            ((IStoryGroupScheduleService) this.LJLL.getValue()).retryGroupTask(this.LJLIL, this.LJLJLLL.storyGroupPublishModel);
            GW2 gw2 = this.LJLJL;
            if (gw2 != null) {
                gw2.LIZLLL.execute(new ARunnableS26S0200000_7(this.LJLILLLLZI.LIZIZ, gw2, 29));
                return;
            }
            return;
        }
        super.LJFF();
    }

    @Override // X.C41642GVy
    public final void LJ(boolean z, boolean z2) {
        PublishModel publishModel;
        StoryGroupPublishModel storyGroupPublishModel;
        super.LJ(z, z2);
        if (!z && !this.LJLJJI && !z2 && (publishModel = this.LJLJLLL) != null && (storyGroupPublishModel = publishModel.storyGroupPublishModel) != null) {
            ((IStoryGroupScheduleService) this.LJLL.getValue()).clearData(storyGroupPublishModel);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41643GVz(ActivityC45651qj activity, C41474GPm c41474GPm, PublishModel publishModel) {
        super(activity, c41474GPm, true);
        o.LJIIIZ(activity, "activity");
        this.LJLJLLL = publishModel;
        this.LJLL = C221108m2.LIZIZ(GW4.LJLIL);
        GWE gwe = this.LJLJJL;
        gwe.LJLJJI.setVisibility(0);
        FrameLayout frameLayout = gwe.LJLJJI;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.ee);
        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
        Context context = gwe.getContext();
        o.LJIIIIZZ(context, "context");
        frameLayout.setBackground(c110614Vt.LIZ(context));
    }
}
