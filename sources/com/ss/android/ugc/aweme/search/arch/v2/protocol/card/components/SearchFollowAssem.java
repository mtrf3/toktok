package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C212428Vi;
import X.C47704Ins;
import X.C49033JMf;
import X.C49039JMl;
import X.C55749LuL;
import X.C57446Mgc;
import X.C7YW;
import X.C8XO;
import X.EnumC57119MbL;
import X.HG3;
import X.InterfaceC49026JLy;
import X.OSZ;
import X.RBX;
import Y.AObserverS76S0100000_8;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchFollowAssem extends ReusedUISlotAssem<SearchFollowAssem> implements C8XO<InterfaceC49026JLy> {
    public User LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final C55749LuL LLFF = new C55749LuL(C47704Ins.LIZJ(this, C49033JMf.class, null), checkSupervisorPrepared());
    public final AObserverS76S0100000_8 LLFFF = new AObserverS76S0100000_8(this, 24);

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cf7;
    }

    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LLFZ;
        Integer valueOf = Integer.valueOf(R.id.m6y);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(R.id.m6y);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public final void m4() {
        User user = this.LLFII;
        if (user != null) {
            C57446Mgc c57446Mgc = (C57446Mgc) _$_findCachedViewById(R.id.m6y);
            C7YW c7yw = new C7YW();
            c7yw.LIZ = user;
            c7yw.LIZIZ(EnumC57119MbL.NO_PREFIX);
            c7yw.LJFF = this;
            c7yw.LIZLLL = C113554cx.LJJL(new OSZ(Boolean.FALSE, 62), new OSZ(Boolean.TRUE, 62));
            c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
        }
        try {
            TuxTextView tuxTextView = (TuxTextView) ((C57446Mgc) _$_findCachedViewById(R.id.m6y)).findViewById(R.id.ium);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(62);
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49026JLy interfaceC49026JLy) {
        String str;
        int i;
        SearchGlobalViewModel searchGlobalViewModel;
        String str2;
        InterfaceC49026JLy item = interfaceC49026JLy;
        o.LJIIIZ(item, "item");
        User currentUser = item.getCurrentUser();
        this.LLFII = currentUser;
        if (currentUser != null) {
            str = currentUser.getUid();
        } else {
            str = null;
        }
        boolean equals = TextUtils.equals(str, ((RBX) HG3.LJIILL()).getCurUserId());
        View tv_follow = _$_findCachedViewById(R.id.m6y);
        o.LJIIIIZZ(tv_follow, "tv_follow");
        if (!equals) {
            i = 0;
        } else {
            i = 8;
        }
        tv_follow.setVisibility(i);
        if (equals) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of(LIZ).get(SearchGlobalViewModel.class);
            if (searchGlobalViewModel != null) {
                User user = this.LLFII;
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                Integer kv0 = searchGlobalViewModel.kv0(str2);
                if (kv0 != null) {
                    int intValue = kv0.intValue();
                    User user2 = this.LLFII;
                    if (user2 != null) {
                        user2.setFollowStatus(intValue);
                    }
                }
                NextLiveData nextLiveData = searchGlobalViewModel.LJLILLLLZI;
                if (nextLiveData != null) {
                    nextLiveData.removeObserver(this.LLFFF);
                    ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                    if (LIZ2 != null) {
                        nextLiveData.observe(LIZ2, this.LLFFF);
                    }
                }
            }
        } else {
            searchGlobalViewModel = null;
        }
        m4();
        ((C57446Mgc) _$_findCachedViewById(R.id.m6y)).setFollowClickInterceptor(new C49039JMl(this, null));
        ((C57446Mgc) _$_findCachedViewById(R.id.m6y)).setDataChangeListener(new AqS139S0200000_8(this, searchGlobalViewModel, 55));
        ((C57446Mgc) _$_findCachedViewById(R.id.m6y)).setTracker(new AqS158S0100000_8(this, 710));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49026JLy interfaceC49026JLy) {
        return true;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49026JLy interfaceC49026JLy) {
    }
}
