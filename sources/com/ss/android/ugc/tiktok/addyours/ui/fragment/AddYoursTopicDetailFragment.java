package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C1B3;
import X.C1B6;
import X.C214298b3;
import X.C214528bQ;
import X.C218998id;
import X.C219248j2;
import X.C220198kZ;
import X.C220208ka;
import X.C220378kr;
import X.C221118m3;
import X.C29S;
import X.C3C5;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC219268j4;
import X.InterfaceC65350Pko;
import X.QD3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS15S0000100_3;
import kotlin.jvm.internal.AqS56S1200000_1;
import kotlin.jvm.internal.AqS58S1200000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class AddYoursTopicDetailFragment extends BaseFragment {
    public final C214298b3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public long LJLLILLLL;
    public final AtomicBoolean LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public AddYoursTopicDetailFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursDetailViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 764);
        C220198kZ c220198kZ = C220198kZ.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c220198kZ, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c220198kZ, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221118m3.LIZ(C220208ka.LJLIL);
        this.LJLJI = C221118m3.LIZ(new AqS58S1200000_3(this, "topic", (Object) null, 7));
        this.LJLJJI = C221118m3.LIZ(new AqS56S1200000_1(this, "from_aweme", (Object) null, 1));
        this.LJLJJL = C221118m3.LIZ(new AqS58S1200000_3(this, "enter_from", (Object) null, 8));
        this.LJLJJLL = C221118m3.LIZ(new AqS56S1200000_1(this, "follow_status", (Object) null, 2));
        this.LJLJL = C221118m3.LIZ(new AqS58S1200000_3(this, "user_avatars", (Object) null, 9));
        this.LJLJLJ = C221118m3.LIZ(new AqS58S1200000_3((Fragment) this, "entrance_category", (Object) 3, 4));
        this.LJLJLLL = C221118m3.LIZ(new AqS58S1200000_3(this, "category_name", "feed", 5));
        this.LJLL = C221118m3.LIZ(new AqS58S1200000_3(this, "is_from_qa_sticker", Boolean.FALSE, 6));
        this.LJLLI = C221118m3.LIZ(new AqS58S1200000_3(this, "viewed_user_id", (Object) null, 10));
        this.LJLLILLLL = -1L;
        this.LJLLJ = new AtomicBoolean(false);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!o.LJ(this.LJLJJL.getValue(), "add_yours_detail_page") && this.LJLLILLLL >= 0) {
            C218998id.LIZIZ("stay_time", new AqS15S0000100_3(System.currentTimeMillis() - this.LJLLILLLL, 3));
            this.LJLLILLLL = -1L;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLLILLLL <= 0) {
            this.LJLLILLLL = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3
    public final void onNewTopic(C219248j2 event) {
        o.LJIIIZ(event, "event");
        AddYoursTopic addYoursTopic = event.LJLIL;
        if (event.LJLILLLLZI == EnumC219268j4.NETWORK && !this.LJLLJ.getAndSet(true)) {
            C218998id.LIZIZ("enter_add_yours_detail_page", new AqS134S0200000_3(this, addYoursTopic, 291));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String aid;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 181));
        AddYoursDetailViewModel addYoursDetailViewModel = (AddYoursDetailViewModel) this.LJLIL.getValue();
        AddYoursTopic topic = (AddYoursTopic) this.LJLJI.getValue();
        o.LJIIIZ(topic, "topic");
        addYoursDetailViewModel.withState(new AqS134S0200000_3(addYoursDetailViewModel, topic, 10));
        Aweme aweme = (Aweme) this.LJLJJI.getValue();
        if (aweme == null) {
            aweme = ((AddYoursTopic) this.LJLJI.getValue()).getVideo();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("detail_aweme_list_type", 42);
        bundle2.putString("event_label", "add_yours_detail_page");
        bundle2.putString("detail_id", String.valueOf(((AddYoursTopic) this.LJLJI.getValue()).getTopicId()));
        bundle2.putString("detail_aweme_from", (String) this.LJLJJL.getValue());
        bundle2.putSerializable("topic", (AddYoursTopic) this.LJLJI.getValue());
        bundle2.putString("process_id", UUID.randomUUID().toString());
        if (aweme != null && (aid = aweme.getAid()) != null) {
            bundle2.putString("from_group_id", aid);
        }
        bundle2.putString("qa_origin_detail_key", "DONT_KNOW");
        bundle2.putSerializable("from_aweme", (Aweme) this.LJLJJI.getValue());
        ((Fragment) this.LJLILLLLZI.getValue()).setArguments(bundle2);
        ((DetailAwemeListFragment) this.LJLILLLLZI.getValue()).LLILLIZIL = new C220378kr((AddYoursTopic) this.LJLJI.getValue(), (Aweme) this.LJLJJI.getValue(), ((Number) this.LJLJLJ.getValue()).intValue(), (String) this.LJLLI.getValue());
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIJ((Fragment) this.LJLILLLLZI.getValue(), null, R.id.d77);
        LIZ.LJII();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.gi, viewGroup, false, "inflater.inflate(R.layou…layout, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }
}
