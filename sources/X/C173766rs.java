package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173766rs {
    public final /* synthetic */ MvChoosePhotoScene LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    public final void LIZ() {
        this.LIZ.LLLIILIL();
    }

    public C173766rs(MvChoosePhotoScene mvChoosePhotoScene, Bundle bundle) {
        this.LIZ = mvChoosePhotoScene;
        this.LIZIZ = bundle;
    }

    public final void LIZIZ(int i, int i2) {
        Bundle LIZLLL = C1DG.LIZLLL("key_photo_select_min_count", i2, "key_photo_select_max_count", i2);
        LIZLLL.putInt("key_video_select_min_count", i2);
        LIZLLL.putInt("key_video_select_max_count", i2);
        LIZLLL.putInt("key_support_flag", 6);
        LIZLLL.putBoolean("Key_enable_multi_video", true);
        LIZLLL.putInt("key_choose_scene", 6);
        if (i != 1) {
            if (i == 2) {
                LIZLLL.putString("key_mv_hint_text", this.LIZ.getString(R.string.ijn));
                LIZLLL.putBoolean("Key_replace_item", true);
            }
        } else {
            this.LIZIZ.putString("key_mv_hint_text", this.LIZ.getString(R.string.e89, Integer.valueOf(i2)));
        }
        this.LIZIZ.putAll(LIZLLL);
    }
}
