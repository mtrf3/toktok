package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.LSs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54298LSs<T extends Fragment> extends PagerAdapter {
    public final FragmentManager LJLILLLLZI;
    public C1B3 LJLJI;
    public Fragment LJLJJI;
    public final int LJLJJL;
    public final HashMap<Integer, T> LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* bridge */ /* synthetic */ void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* bridge */ /* synthetic */ Parcelable LJIJJ() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* bridge */ /* synthetic */ void LJJIFFI(ViewGroup viewGroup) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        HashMap<Integer, T> hashMap = this.LJLJJLL;
        if (hashMap != null) {
            hashMap.clear();
            HashMap<Integer, T> hashMap2 = this.LJLJJLL;
            InterfaceC54281LSb interfaceC54281LSb = ((C54297LSr) this).LJLL;
            if (interfaceC54281LSb != 0) {
                interfaceC54281LSb.LIZIZ(hashMap2);
            }
        }
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJL;
    }

    public AbstractC54298LSs(FragmentManager fragmentManager, int i) {
        this.LJLILLLLZI = fragmentManager;
        this.LJLJJL = i;
        C54297LSr c54297LSr = (C54297LSr) this;
        InterfaceC54281LSb interfaceC54281LSb = c54297LSr.LJLL;
        if (interfaceC54281LSb != null) {
            interfaceC54281LSb.LIZ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        this.LJLJJLL = linkedHashMap;
        InterfaceC54281LSb interfaceC54281LSb2 = c54297LSr.LJLL;
        if (interfaceC54281LSb2 != null) {
            interfaceC54281LSb2.LIZIZ(linkedHashMap);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LJLJJI;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.LJLJJI.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.LJLJJI = fragment;
        }
    }
}
