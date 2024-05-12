package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XWr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84977XWr extends C1BC {
    public final int[] LJLJJLL;
    public final /* synthetic */ BaseNewMusicTabFragment LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return this.LJLJL.getResources().getString(this.LJLJJLL[i]);
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        if (i == 0) {
            return this.LJLJL.LJZL;
        }
        return this.LJLJL.LL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84977XWr(BaseNewMusicTabFragment baseNewMusicTabFragment, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJL = baseNewMusicTabFragment;
        this.LJLJJLL = new int[]{R.string.eju, R.string.iiz};
    }
}
