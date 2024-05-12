package X;

import android.view.View;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity;

/* loaded from: classes16.dex */
public final class XWL extends AbstractC80590Vk2 {
    public final /* synthetic */ ChooseMusicActivity LIZ;

    @Override // X.AbstractC80590Vk2
    public final void LIZ(View view, float f) {
    }

    public XWL(ChooseMusicActivity chooseMusicActivity) {
        this.LIZ = chooseMusicActivity;
    }

    @Override // X.AbstractC80590Vk2
    public final void LIZIZ(int i, View view) {
        if (i != 5) {
            return;
        }
        this.LIZ.LLFII();
        ChooseMusicActivity chooseMusicActivity = this.LIZ;
        chooseMusicActivity.finish();
        chooseMusicActivity.overridePendingTransition(0, 0);
    }
}
