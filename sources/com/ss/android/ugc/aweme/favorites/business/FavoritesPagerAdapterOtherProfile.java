package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.C1BC;
import X.C32I;
import X.C47261Igj;
import X.ORZ;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FavoritesPagerAdapterOtherProfile extends C1BC implements LifecycleEventObserver {
    public final Bundle LJLJJLL;
    public final Context LJLJL;
    public final List<AbstractC186377Td> LJLJLJ;

    public final List<Fragment> LJJIIJZLJL() {
        List<AbstractC186377Td> list = this.LJLJLJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<AbstractC186377Td> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ().LIZ);
        }
        return arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLJ).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        if (ORZ.LJLJJI(object, LJJIIJZLJL())) {
            return ((ArrayList) LJJIIJZLJL()).indexOf(object);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return ((AbstractC186377Td) ListProtector.get(this.LJLJLJ, i)).LIZ().LIZIZ;
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return ((AbstractC186377Td) ListProtector.get(this.LJLJLJ, i)).LIZ().LIZ;
    }

    public final String LJJIIZ(int i) {
        return ((AbstractC186377Td) ListProtector.get(this.LJLJLJ, i)).LIZ().LIZJ;
    }

    public final void LJJIIZI(int i) {
        ProfileListFragment profileListFragment;
        boolean z;
        int i2 = 0;
        for (Fragment fragment : LJJIIJZLJL()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Fragment fragment2 = fragment;
                if ((fragment2 instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) fragment2) != null) {
                    if (profileListFragment.getFragmentManager() != null) {
                        if (i2 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        profileListFragment.setUserVisibleHint(z);
                    }
                    profileListFragment.Oi();
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        Iterator<AbstractC186377Td> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(event);
        }
    }

    public FavoritesPagerAdapterOtherProfile(FragmentManager fragmentManager, Bundle bundle, ActivityC45651qj activityC45651qj) {
        super(fragmentManager, 0);
        this.LJLJJLL = bundle;
        this.LJLJL = activityC45651qj;
        this.LJLJLJ = new ArrayList();
    }
}
