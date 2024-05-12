package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S43 implements S45 {
    public final /* synthetic */ S42 LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    @Override // X.S45
    public final void LIZIZ() {
        FavoriteVideoPickerViewModel favoriteVideoPickerViewModel = this.LIZ.LJLIL;
        Aweme awemeItem = this.LIZIZ;
        favoriteVideoPickerViewModel.getClass();
        o.LJIIIZ(awemeItem, "awemeItem");
        if (awemeItem.canShare()) {
            favoriteVideoPickerViewModel.LJLL.setValue(new MDR<>(awemeItem));
        } else {
            favoriteVideoPickerViewModel.LJLLI.setValue(new MDR<>(awemeItem));
        }
    }

    @Override // X.S45
    public final void LIZ(boolean z) {
        if (z) {
            FavoriteVideoPickerViewModel favoriteVideoPickerViewModel = this.LIZ.LJLIL;
            favoriteVideoPickerViewModel.LJLJLLL.setValue(this.LIZIZ);
            return;
        }
        this.LIZ.LJLIL.LJLJLLL.setValue(null);
    }

    public S43(S42 s42, Aweme aweme) {
        this.LIZ = s42;
        this.LIZIZ = aweme;
    }
}
