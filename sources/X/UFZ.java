package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.emote.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UFZ extends AbstractC38911fr {
    public final /* synthetic */ PreviewImageDialogFragment LJLILLLLZI;
    public final /* synthetic */ LiveSubMediaModel LJLJI;

    @Override // X.AbstractC38911fr
    public final void LJJIII() {
    }

    @Override // X.AbstractC38911fr
    public final void LJJIIZ(C76881UFh params) {
        o.LJIIIZ(params, "params");
        LiveSubMediaModel liveSubMediaModel = this.LJLILLLLZI.LJLJI;
        if (liveSubMediaModel != null) {
            V16.LJJLIIIJJIZ(liveSubMediaModel, params.LIZ);
        }
        LiveSubMediaModel liveSubMediaModel2 = this.LJLILLLLZI.LJLJI;
        if (liveSubMediaModel2 != null) {
            liveSubMediaModel2.setEmoteEditFinishParams(params);
        }
        PreviewImageDialogFragment previewImageDialogFragment = this.LJLILLLLZI;
        int indexOf = ((ArrayList) previewImageDialogFragment.LJLIL).indexOf(this.LJLJI);
        if (indexOf >= 0) {
            previewImageDialogFragment.LJLJJL.notifyItemChanged(indexOf);
            previewImageDialogFragment.LJLJJI.notifyDataSetChanged();
        }
    }

    public UFZ(PreviewImageDialogFragment previewImageDialogFragment, LiveSubMediaModel liveSubMediaModel) {
        this.LJLILLLLZI = previewImageDialogFragment;
        this.LJLJI = liveSubMediaModel;
    }
}
