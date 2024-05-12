package X;

import android.view.View;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;

/* loaded from: classes16.dex */
public final class XWK extends AbstractC80590Vk2 {
    public final /* synthetic */ ChooseMusicActivity LIZ;

    public XWK(ChooseMusicActivity chooseMusicActivity) {
        this.LIZ = chooseMusicActivity;
    }

    @Override // X.AbstractC80590Vk2
    public final void LIZ(View view, float f) {
        this.LIZ.LJLLILLLL.LIZIZ(f);
    }

    @Override // X.AbstractC80590Vk2
    public final void LIZIZ(int i, View view) {
        if (i != 5) {
            return;
        }
        this.LIZ.LLIIIILZ();
        ChooseMusicActivity chooseMusicActivity = this.LIZ;
        chooseMusicActivity.finish();
        chooseMusicActivity.overridePendingTransition(0, 0);
    }
}
