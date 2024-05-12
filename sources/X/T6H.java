package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes13.dex */
public final class T6H<T extends AmeBaseFragment> extends C1BC {
    public final List<T> LJLJJLL;
    public final List<Integer> LJLJL;

    public final Fragment LJJIIJZLJL() {
        int indexOf = this.LJLJL.indexOf(0);
        if (indexOf >= 0 && indexOf < this.LJLJJLL.size()) {
            return (Fragment) ListProtector.get(this.LJLJJLL, indexOf);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        if (this.LJLJJLL.contains(obj)) {
            return this.LJLJJLL.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        Integer num = (Integer) ListProtector.get(this.LJLJL, i);
        if (ListProtector.get(this.LJLJJLL, i) instanceof InterfaceC59677NbV) {
            return ((InterfaceC59677NbV) ListProtector.get(this.LJLJJLL, i)).getTitle();
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 8) {
                            if (intValue != 16) {
                                if (intValue != 19) {
                                    if (intValue != 26) {
                                        if (intValue != 34) {
                                            switch (intValue) {
                                                case 10:
                                                    return C86V.LJFF(R.string.dgm);
                                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                    return C86V.LJFF(R.string.dgp);
                                                case 12:
                                                    return C86V.LJFF(R.string.gfb);
                                                default:
                                                    return "";
                                            }
                                        }
                                        return C86V.LJFF(R.string.p0m);
                                    }
                                    return C86V.LJFF(R.string.dib);
                                }
                                return C86V.LJFF(R.string.gsd);
                            }
                            return C86V.LJFF(R.string.dgk);
                        }
                        return C86V.LJFF(R.string.dgr);
                    }
                    if (ListProtector.get(this.LJLJJLL, i) != null && ((AmeBaseFragment) ListProtector.get(this.LJLJJLL, i)).isCommerce) {
                        return C86V.LJFF(R.string.dn9);
                    }
                }
            }
            return C86V.LJFF(R.string.gmj);
        }
        if (ListProtector.get(this.LJLJJLL, i) != null && ((AmeBaseFragment) ListProtector.get(this.LJLJJLL, i)).isCommerce) {
            return C86V.LJFF(R.string.dn9);
        }
        return C86V.LJFF(R.string.h2f);
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }

    @Override // X.C1BC
    public final long LJJIIJ(int i) {
        return ((Integer) ListProtector.get(this.LJLJL, i)).intValue();
    }

    public final int LJJIIZ(int i) {
        return ((Integer) ListProtector.get(this.LJLJL, i)).intValue();
    }

    public final int LJJIIZI(int i) {
        return this.LJLJL.indexOf(Integer.valueOf(i));
    }

    public T6H(FragmentManager fragmentManager, List<T> list, List<Integer> list2) {
        super(fragmentManager, 0);
        this.LJLJJLL = list;
        this.LJLJL = list2;
    }
}
