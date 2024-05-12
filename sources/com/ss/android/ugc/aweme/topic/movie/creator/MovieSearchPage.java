package com.ss.android.ugc.aweme.topic.movie.creator;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C188727au;
import X.C221108m2;
import X.C26045AKb;
import X.C29S;
import X.C2K0;
import X.C2U8;
import X.C32I;
import X.C3C5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65777Prh;
import X.C75792yF;
import X.C76800UCe;
import X.C7TR;
import X.C8VV;
import X.C90903hW;
import X.CK3;
import X.EV9;
import X.EnumC42934Gt8;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.InterfaceC61213O0r;
import X.ORZ;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility;
import com.ss.android.ugc.aweme.prefab.ability.SubmitAbility;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.anchors.MovieAnchorContent;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class MovieSearchPage extends DetailBaseFragment implements SubmitAbility, TopicSearchListAssem.TopicSelectedAbility {
    public String LJLILLLLZI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public int LJLJI = 5;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 723));
    public final Map<String, MovieDetail> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String lr() {
        return "movie_search_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.SubmitAbility
    public final void q0() {
        String str;
        List<String> urlList;
        Collection<MovieDetail> values = ((LinkedHashMap) this.LJLJJL).values();
        C188727au LIZ = CK3.LIZ("anchor_type", "movie");
        ArrayList arrayList = new ArrayList(C32I.LJJL(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((MovieDetail) it.next()).id);
        }
        LIZ.LJI("movie_id", ORZ.LLD(arrayList, null, null, null, null, 63));
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(values, 10));
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MovieDetail) it2.next()).title);
        }
        LIZ.LJI("movie_title", ORZ.LLD(arrayList2, null, null, null, null, 63));
        LIZ.LIZLLL(values.size(), "movie_num");
        FMX.LJIIL("choose_anchor", LIZ.LIZ);
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(values, 10));
        for (MovieDetail movieDetail : values) {
            String str2 = movieDetail.id;
            String str3 = movieDetail.title;
            Integer num = movieDetail.year;
            Double d = movieDetail.rating;
            UrlModel urlModel = movieDetail.cover;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                str = (String) ORZ.LJLLLL(urlList);
            } else {
                str = null;
            }
            arrayList3.add(new MovieAnchorContent(str2, str3, num, d, str, null, 32, null));
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            MovieAnchorContent movieAnchorContent = (MovieAnchorContent) it3.next();
            String str4 = movieAnchorContent.id;
            int type = EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE();
            String str5 = movieAnchorContent.title;
            String LIZJ = C75792yF.LIZJ(movieAnchorContent);
            o.LJIIIIZZ(LIZJ, "toJson(it)");
            C2U8.LIZ(new C7TR(new AnchorTransData(type, LIZJ, str5, null, null, str4, null, true, null, null, null, null, null, false, 16216, null)));
        }
        vl();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, SubmitAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, this, SubmitAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(SubmitAbility.class.getClassLoader(), new Class[]{SubmitAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, SubmitAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.SubmitAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, TopicSearchListAssem.TopicSelectedAbility.class, null);
        if (LIZ2 == null) {
            C55096Ljo.LJIIJJI(LIZJ2, this, TopicSearchListAssem.TopicSelectedAbility.class, null);
            return;
        }
        try {
            InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
            if (invocationHandler2 instanceof EV9) {
                ((EV9) invocationHandler2).LIZ.add(this);
                return;
            }
            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
        } catch (IllegalArgumentException unused2) {
            EV9 ev92 = new EV9();
            ev92.LIZ.add(this);
            ev92.LIZ.add(LIZ2);
            Object newProxyInstance2 = Proxy.newProxyInstance(TopicSearchListAssem.TopicSelectedAbility.class.getClassLoader(), new Class[]{TopicSearchListAssem.TopicSelectedAbility.class}, ev92);
            if (newProxyInstance2 != null) {
                C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, TopicSearchListAssem.TopicSelectedAbility.class, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility");
        }
    }

    @Override // com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility
    public final boolean z30(String topicId) {
        o.LJIIIZ(topicId, "topicId");
        return this.LJLJJL.containsKey(topicId);
    }

    @Override // com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility
    public final boolean Uk(TopicRawInfo topicInfo, boolean z) {
        String str;
        Resources resources;
        o.LJIIIZ(topicInfo, "topicInfo");
        if (z) {
            this.LJLJJL.put(String.valueOf(topicInfo.id), new MovieDetail(topicInfo.id, topicInfo.title, topicInfo.year, topicInfo.externalRating, null, topicInfo.cover, topicInfo.isCollected, 16, null));
            Map<String, MovieDetail> map = this.LJLJJL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (true ^ ((List) this.LJLJJI.getValue()).contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (((List) this.LJLJJI.getValue()).size() + linkedHashMap.size() > this.LJLJI) {
                C26045AKb c26045AKb = new C26045AKb(this);
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    str = resources.getString(R.string.i96, Integer.valueOf(this.LJLJI));
                } else {
                    str = null;
                }
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
                C65777Prh.LIZJ(this.LJLJJL).remove(topicInfo.id);
                return false;
            }
            ItemSelectAbility itemSelectAbility = (ItemSelectAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ItemSelectAbility.class, null);
            if (itemSelectAbility != null) {
                itemSelectAbility.M7(this.LJLJJL.size());
            }
            return true;
        }
        C65777Prh.LIZJ(this.LJLJJL).remove(topicInfo.id);
        ItemSelectAbility itemSelectAbility2 = (ItemSelectAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ItemSelectAbility.class, null);
        if (itemSelectAbility2 != null) {
            itemSelectAbility2.M7(this.LJLJJL.size());
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 931));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setBackgroundColor(getResources().getColor(R.color.acm));
        frameLayout.setId(R.id.bul);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return frameLayout;
    }
}
