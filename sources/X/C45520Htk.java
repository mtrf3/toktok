package X;

import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;

/* renamed from: X.Htk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45520Htk implements HPI {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    public C45520Htk(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        this.LIZ.LLLLJI();
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        ViewPager viewPager = mvChoosePhotoScene.LLILLL;
        if (viewPager != null) {
            viewPager.getCurrentItem();
        }
        mvChoosePhotoScene.b();
    }
}
