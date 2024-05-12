package X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.paidcontent.assem.SeriesPostUIAssem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishPreviewContainerActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6dV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164856dV extends AbstractC65781Prl implements InterfaceC88472Yns<ActivityC45651qj, C76800UCe> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ SeriesPostUIAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164856dV(SeriesPostUIAssem seriesPostUIAssem, VideoPublishEditModel videoPublishEditModel) {
        super(1);
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = seriesPostUIAssem;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ActivityC45651qj activityC45651qj) {
        C1AT c1at;
        ActivityC45651qj it = activityC45651qj;
        o.LJIIIZ(it, "it");
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        this.LJLILLLLZI.getClass();
        Bundle v3 = SeriesPostUIAssem.v3(videoPublishEditModel);
        SeriesPostUIAssem seriesPostUIAssem = this.LJLILLLLZI;
        C164096cH c164096cH = seriesPostUIAssem.LJLJJI;
        TextView textView = seriesPostUIAssem.LJLJJL;
        String string = it.getResources().getString(R.string.qqn);
        Bundle bundle = null;
        if (textView != null && c164096cH != null) {
            C16360ka.LJIJJLI(c164096cH, "transition_name_thumbnail");
            C15070iV c15070iV = new C15070iV(c164096cH, "transition_name_thumbnail");
            C16360ka.LJIJJLI(textView, "transition_name_choose_cover");
            c1at = C020506f.LIZJ(it, c15070iV, new C15070iV(textView, "transition_name_choose_cover"));
        } else {
            c1at = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(VEVideoPublishPreviewScene.LLJJ, C78983UzD.LJLJJI);
        bundle2.putParcelable(VEVideoPublishPreviewScene.LLJJIJIIJIL, videoPublishEditModel);
        CreativeModel value = videoPublishEditModel.creativeModel;
        o.LJIIIZ(value, "value");
        bundle2.putParcelable("creative_model", value);
        bundle2.putString(VEVideoPublishPreviewScene.LLJJIII, null);
        bundle2.putSerializable(VEVideoPublishPreviewScene.LLJJIJI, null);
        bundle2.putInt(VEVideoPublishPreviewScene.LLJJI, 0);
        bundle2.putBundle(VEVideoPublishPreviewScene.LLJJIJIL, v3);
        bundle2.putString(VEVideoPublishPreviewScene.LLJJJ, string);
        bundle2.putBoolean(VEVideoPublishPreviewScene.LLJJJIL, true);
        Intent intent = new Intent(it, (Class<?>) VideoPublishPreviewContainerActivity.class);
        intent.putExtra("bundle_key", bundle2);
        if (c1at != null) {
            bundle = c1at.LIZLLL();
        }
        C78598Ut0.LJIJJ(intent, it);
        it.startActivity(intent, bundle);
        return C76800UCe.LIZ;
    }
}
