package com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui;

import X.AbstractC028509h;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C243359gp;
import X.C243369gq;
import X.C243459gz;
import X.C243509h4;
import X.C243519h5;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC198557ql;
import X.InterfaceC243269gg;
import X.SYL;
import X.TBT;
import android.content.Intent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.featureeffectvideo.powerlist.FeatureVideoCreateNewVideoCell;
import com.ss.android.ugc.aweme.featureeffectvideo.powerlist.FeatureVideoItemCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeaturedVideoAwemeListAssem extends UIListContentAssem<FeaturedVideoAwemeListViewModel> implements InterfaceC243269gg {
    public static final C243509h4 LJLJJL = new Object() { // from class: X.9h4
    };
    public final C214298b3 LJLJI;
    public Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 759));
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C243369gq.class, "hierarchy_data_feature_video"), checkSupervisorPrepared());

    private final void K3() {
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9gy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C243479h1) obj).LJLIL;
            }
        }, null, C243359gp.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9h0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C243479h1) obj).LJLILLLLZI;
            }
        }, null, new AqS186S0100000_4(this, 185), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9h2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C243479h1) obj).LJLJI;
            }
        }, null, new AqS186S0100000_4(this, 186), 6);
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLJJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC243269gg, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public FeaturedVideoAwemeListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeaturedVideoAwemeListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 760), C243459gz.INSTANCE, null);
    }

    public final void C3() {
        Intent intent = new Intent();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LIZ.setResult(LiveChatShowDelayForHotLiveSetting.DEFAULT, intent);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            LIZ2.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9h5] */
    @Override // X.C8VB
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public C243519h5 defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9h5
        };
    }

    public final C243369gq F3() {
        return (C243369gq) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public FeaturedVideoAwemeListViewModel A3() {
        return (FeaturedVideoAwemeListViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        return c57939MoZ;
    }

    private final void I3() {
        SYL v3 = v3();
        v3.LLLF.LJZL(FeatureVideoItemCell.class, FeatureVideoCreateNewVideoCell.class);
        v3.setItemAnimator(null);
        getContainerView().getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 1, false);
        wrapGridLayoutManager.LLIILII = new AbstractC028509h() { // from class: X.9h3
            @Override // X.AbstractC028509h
            public final int LJFF(int i) {
                return 1;
            }
        };
        v3().setLayoutManager(wrapGridLayoutManager);
    }

    @Override // X.InterfaceC243269gg
    public Aweme i4() {
        return A3().LJLJI;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onCreateView() {
        super.onCreateView();
        I3();
        K3();
    }

    @Override // X.InterfaceC243269gg
    public String q3() {
        C243369gq F3 = F3();
        if (F3 != null) {
            return F3.LJLIL;
        }
        return null;
    }
}
