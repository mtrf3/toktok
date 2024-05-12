package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HtI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45492HtI extends AbstractC45748HxQ {
    public final /* synthetic */ MvChoosePhotoScene LJLJJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJL.LLLI;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLJJL;
        if (i == mvChoosePhotoScene.LLLII) {
            return mvChoosePhotoScene.getString(R.string.blg);
        }
        if (i == mvChoosePhotoScene.LLLIIIIL) {
            return mvChoosePhotoScene.getString(R.string.jlk);
        }
        if (i == mvChoosePhotoScene.LLLIIII) {
            return mvChoosePhotoScene.getString(R.string.tl_);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45492HtI(MvChoosePhotoScene mvChoosePhotoScene, WMH parentScene) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJJL = mvChoosePhotoScene;
    }

    @Override // X.AbstractC45750HxS
    public final Object LJJIIJ(int i, ViewGroup viewGroup) {
        return this.LJLJJL.LLLFF(i);
    }
}
