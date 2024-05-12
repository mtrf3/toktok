package com.ss.android.ugc.aweme.favorites.business.powerviewpager;

import X.AbstractC186347Ta;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FavoritePowerViewPagerViewModel extends ViewModel {
    public final MutableLiveData<List<AbstractC186347Ta>> LJLIL;
    public final MutableLiveData LJLILLLLZI;

    public FavoritePowerViewPagerViewModel() {
        MutableLiveData<List<AbstractC186347Ta>> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
    }

    public final String gv0(int i) {
        AbstractC186347Ta abstractC186347Ta;
        FavoriteTabItemV2 LIZ;
        String str;
        List list = (List) this.LJLILLLLZI.getValue();
        if (list == null || (abstractC186347Ta = (AbstractC186347Ta) ListProtector.get(list, i)) == null || (LIZ = abstractC186347Ta.LIZ()) == null || (str = LIZ.mobKey) == null) {
            return "";
        }
        return str;
    }

    public final String hv0(int i) {
        AbstractC186347Ta abstractC186347Ta;
        FavoriteTabItemV2 LIZ;
        String str;
        List list = (List) this.LJLILLLLZI.getValue();
        if (list == null || (abstractC186347Ta = (AbstractC186347Ta) ListProtector.get(list, i)) == null || (LIZ = abstractC186347Ta.LIZ()) == null || (str = LIZ.pageTitle) == null) {
            return "";
        }
        return str;
    }

    public final int iv0(String str) {
        List list = (List) this.LJLILLLLZI.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (o.LJ(((AbstractC186347Ta) it.next()).LIZ().mobKey, str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
