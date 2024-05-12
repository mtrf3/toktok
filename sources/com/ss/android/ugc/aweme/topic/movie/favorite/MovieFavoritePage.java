package com.ss.android.ugc.aweme.topic.movie.favorite;

import X.C184077Kh;
import X.C184807Nc;
import X.C184817Nd;
import X.C185477Pr;
import X.C213218Yj;
import X.C214298b3;
import X.C214528bQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7PR;
import X.C7VQ;
import X.InterfaceC65784Pro;
import X.QD3;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes4.dex */
public final class MovieFavoritePage extends BaseFavoritePage {
    public final C214298b3 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C65776Prg LJLJI = C65352Pkq.LIZ(MovieFavoritePageAssem.class);
    public final int LJLJJI = R.string.i9_;
    public final String LJLJJL = "movies";
    public final String LJLJJLL = "movies";

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final boolean xl() {
        return false;
    }

    public MovieFavoritePage() {
        C65776Prg LIZ = C65352Pkq.LIZ(MovieFavoriteListVM.class);
        this.LJLJL = new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 1078), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C185477Pr.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
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
        return s.LJJZZIII(CardStruct.IStatusCode.DEFAULT, string);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectEvent(C184807Nc e) {
        Object obj;
        o.LJIIIZ(e, "e");
        TopicRawInfo topicRawInfo = e.LJLIL;
        if (topicRawInfo != null) {
            Integer num = topicRawInfo.type;
            int type = C7PR.MOVIE.getType();
            if (num == null || num.intValue() != type) {
                return;
            }
            if (e.LJLILLLLZI) {
                ((AssemListViewModel) this.LJLJL.getValue()).listAddItemAt(0, (int) new C184817Nd(topicRawInfo, null, null, null, null, 30));
                return;
            }
            AssemListViewModel assemListViewModel = (AssemListViewModel) this.LJLJL.getValue();
            AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(topicRawInfo, 495);
            List<ITEM> listGetAll = assemListViewModel.listGetAll();
            if (listGetAll == 0) {
                return;
            }
            Iterator it = listGetAll.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Boolean) aqS169S0100000_3.invoke(obj)).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C184817Nd c184817Nd = (C184817Nd) obj;
            if (c184817Nd == null) {
                return;
            }
            assemListViewModel.listRemoveItem((AssemListViewModel) c184817Nd);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C7VQ wl(Context context) {
        o.LJIIIZ(context, "context");
        final C213218Yj Jl = Jl(context);
        return new C7VQ(this, Jl) { // from class: X.7Ps
            public final C213218Yj LJLJJI;

            @Override // X.C7VQ, X.AbstractC186377Td
            public final C213218Yj LIZ() {
                return this.LJLJJI;
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectEvent(C184807Nc e) {
                o.LJIIIZ(e, "e");
                TopicRawInfo topicRawInfo = e.LJLIL;
                if (topicRawInfo != null) {
                    Integer num = topicRawInfo.type;
                    int type = C7PR.MOVIE.getType();
                    if (num == null || num.intValue() != type) {
                        return;
                    }
                    if (e.LJLILLLLZI) {
                        LJFF(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            }

            {
                super(this, Jl);
                this.LJLJJI = Jl;
            }
        };
    }
}
