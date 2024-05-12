package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.C192057gH;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7VQ;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class PlaylistCollectionPage extends BaseFavoritePage {
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C65776Prg LJLJI = C65352Pkq.LIZ(PlaylistCollectionList.class);
    public final int LJLJJI = R.string.bb5;
    public final String LJLJJL = "favourite_playlist";
    public final String LJLJJLL = "mixes";

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final boolean xl() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String Al() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final int Gl() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C65776Prg Hl() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String Il() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String Dl(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(this.LJLJJI, 0);
        o.LJIIIIZZ(string, "context.getString(pageTitleRes, 0)");
        return s.LJJZZIII(" 0", string);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C7VQ wl(Context context) {
        o.LJIIIZ(context, "context");
        return new C192057gH(this, Jl(context));
    }
}
