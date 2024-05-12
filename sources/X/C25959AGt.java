package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AGt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25959AGt extends C1BC {
    public final /* synthetic */ CreatorCenterFragment LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (i != 0) {
            if (i == 1) {
                String string = this.LJLJJLL.getString(R.string.e9w);
                o.LJIIIIZZ(string, "getString(R.string.creat…ainScreen_liveSec_header)");
                return string;
            }
            throw new IllegalArgumentException("Invalid position");
        }
        String string2 = this.LJLJJLL.getString(R.string.e_2);
        o.LJIIIIZZ(string2, "getString(R.string.creat…inScreen_toolsSec_header)");
        return string2;
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        if (i != 0) {
            if (i == 1) {
                return (Fragment) this.LJLJJLL.LJLILLLLZI.getValue();
            }
            throw new IllegalArgumentException("Invalid position");
        }
        return (Fragment) this.LJLJJLL.LJLIL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25959AGt(CreatorCenterFragment creatorCenterFragment, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJJLL = creatorCenterFragment;
    }
}
