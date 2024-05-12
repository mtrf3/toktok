package X;

import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GiO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42268GiO implements InterfaceC45242HpG {
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

    public C42268GiO(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        o.LJIIIZ(data, "data");
        Parcelable parcelableExtra = data.getParcelableExtra("key_short_video_context");
        if (parcelableExtra != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
            ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                H78.LJII("selectedMediaData is invalid when onChosenResult invoked in NowChosenResultImpl");
                return;
            }
            int intExtra = data.getIntExtra("key_choose_media_item_size", 0);
            String str = ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath;
            o.LJIIIIZZ(str, "selectedMediaData[0].fileLocalUriPath");
            shortVideoContext.singleImageCoverBitmapData = new SingleImageCoverBitmapData(str, intExtra, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).date, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).type, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).width, ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).height, null, 64, null);
            C42264GiK.LJII(new C42263GiJ(this.LIZ, shortVideoContext, parcelableArrayListExtra, false, C42269GiP.LJLIL, C42270GiQ.LJLIL));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
