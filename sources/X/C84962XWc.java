package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;

/* renamed from: X.XWc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84962XWc extends C1BC {
    public final /* synthetic */ BaseNewMusicTabFragment LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        if (this.LJLJJLL.LLIIIL && KO4.LIZ()) {
            if (!C59859NeR.LIZ()) {
                return 3;
            }
            return 4;
        }
        if (C59859NeR.LIZ()) {
            return 3;
        }
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        boolean z;
        if (this.LJLJJLL.LLIIIL && KO4.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        return this.LJLJJLL.xl(C61630OGs.LIZIZ(i, z));
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        boolean z;
        if (this.LJLJJLL.LLIIIL && KO4.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        int i2 = C61632OGu.LIZ[C61630OGs.LIZIZ(i, z).ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        return this.LJLJJLL.LLFZ;
                    }
                    throw new IllegalStateException("Wrong TabType");
                }
                return this.LJLJJLL.LLFFF;
            }
            return this.LJLJJLL.LLFII;
        }
        return this.LJLJJLL.LLFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84962XWc(BaseNewMusicTabFragment baseNewMusicTabFragment, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJJLL = baseNewMusicTabFragment;
    }
}
