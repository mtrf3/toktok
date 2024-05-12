package com.ss.android.ugc.tiktok.addyours.collection;

import X.C186867Va;
import X.C214298b3;
import X.C219308j8;
import X.C219368jE;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.SYL;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursCollectionListAssem extends BaseFavoriteListAssem<C219308j8, C219368jE, Long> {
    public final C214298b3 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public AddYoursCollectionListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursCollectionListVM.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1419), C186867Va.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem
    public final AssemListViewModel<C219308j8, C219368jE, Long> H3() {
        return (AssemListViewModel) this.LJLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String v3() {
        String string;
        Context context = getContext();
        if (context == null || (string = context.getString(R.string.bec)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String x3() {
        String string;
        Context context = getContext();
        if (context == null || (string = context.getString(R.string.bed)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL F3 = F3();
        F3.LLLF.LJZL(AddYoursCollectionCell.class);
        F3.getContext();
        F3.setLayoutManager(new LinearLayoutManager(1, false));
    }
}
