package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ge0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41996Ge0 implements InterfaceC45242HpG {
    public final ActivityC45651qj LIZ;

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
    }

    public C41996Ge0(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        ShortVideoContext shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) data.getParcelableExtra("key_video_publish_edit_model");
        if (parcelableArrayListExtra != null && (!parcelableArrayListExtra.isEmpty()) && shortVideoContext != null) {
            C43712HDo.LIZ(this.LIZ, (MediaModel) ListProtector.get(parcelableArrayListExtra, 0), shortVideoContext, videoPublishEditModel, false, true);
        }
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
