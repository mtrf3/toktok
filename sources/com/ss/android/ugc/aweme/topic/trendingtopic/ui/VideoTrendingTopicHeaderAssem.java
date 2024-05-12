package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.AbstractC029409q;
import X.AbstractC029609s;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C187657Yb;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C236729Qu;
import X.C236739Qv;
import X.C252709vu;
import X.C43I;
import X.C47261Igj;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C8VA;
import X.C8VB;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.C9KF;
import X.C9QU;
import X.C9R1;
import X.C9R3;
import X.ORZ;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS373S0100000_4;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicSearchViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.BillboardInfo;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTrendingTopicHeaderAssem extends UIContentAssem implements C9QU {
    public EditText LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public RecyclerView LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public C73305Spp LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public Map<Integer, View> LJLL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLL;
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

    @Override // X.C9QU, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public VideoTrendingTopicHeaderAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTrendingTopicListViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 889), C9R3.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoTrendingTopicSearchViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 890), C9R1.INSTANCE, null);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 888));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 887));
    }

    private final C73306Spq A3() {
        return (C73306Spq) this.LJLJLLL.getValue();
    }

    private final C73306Spq C3() {
        return (C73306Spq) this.LJLJLJ.getValue();
    }

    public final VideoTrendingTopicListViewModel E3() {
        return (VideoTrendingTopicListViewModel) this.LJLJJL.getValue();
    }

    public final VideoTrendingTopicSearchViewModel F3() {
        return (VideoTrendingTopicSearchViewModel) this.LJLJJLL.getValue();
    }

    public final void I3() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.LJLJI;
            if (view2 != null) {
                view2.setVisibility(8);
                EditText editText = this.LJLIL;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    RecyclerView recyclerView = this.LJLJJI;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        if (E3().LJLJLJ != null) {
                            ((RecyclerView) getContainerView().findViewById(R.id.li2)).LJLI(E3().hv0());
                        }
                        getContainerView().findViewById(R.id.li2).setVisibility(0);
                        getContainerView().findViewById(R.id.izh).setVisibility(8);
                        x3();
                        E3().kv0(null, true);
                        C236739Qv c236739Qv = C236739Qv.LJLIL;
                        Class<VideoTrendingTopicHeaderAssem> cls = VideoTrendingTopicHeaderAssem.class;
                        Class<?>[] interfaces = cls.getInterfaces();
                        o.LJIIIIZZ(interfaces, "currentClass.interfaces");
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> cls2 : interfaces) {
                            if (C8VB.class.isAssignableFrom(cls2)) {
                                arrayList.add(cls2);
                            }
                        }
                        while (arrayList.isEmpty()) {
                            cls = cls.getSuperclass();
                            if (cls == null) {
                                return;
                            }
                            Class<?>[] interfaces2 = cls.getInterfaces();
                            o.LJIIIIZZ(interfaces2, "currentClass.interfaces");
                            arrayList = new ArrayList();
                            for (Class<?> cls3 : interfaces2) {
                                if (C8VB.class.isAssignableFrom(cls3)) {
                                    arrayList.add(cls3);
                                }
                            }
                        }
                        C8VA LIZLLL = getSupervisor().LIZLLL();
                        Object LJLLJ = ORZ.LJLLJ(arrayList);
                        o.LJII(LJLLJ, "null cannot be cast to non-null type java.lang.Class<out com.bytedance.assem.arch.service.AssemObservableService<DATA of com.bytedance.assem.arch.service.AssemServiceExtKt.setAssemServiceState>>");
                        LIZLLL.LJI((Class) LJLLJ, c236739Qv);
                        return;
                    }
                    o.LJIJI("tagListRecycleView");
                    throw null;
                }
                o.LJIJI("searchEditText");
                throw null;
            }
            o.LJIJI("searchBtn");
            throw null;
        }
        o.LJIJI("closeBtn");
        throw null;
    }

    @Override // X.C9QU
    public void LJIJI() {
        EditText editText = this.LJLIL;
        if (editText != null) {
            if (editText.hasFocus()) {
                editText.clearFocus();
            }
            EditText editText2 = this.LJLIL;
            if (editText2 != null) {
                KeyboardUtils.LIZIZ(editText2);
                return;
            } else {
                o.LJIJI("searchEditText");
                throw null;
            }
        }
        o.LJIJI("searchEditText");
        throw null;
    }

    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public C236729Qu defaultObservableData() {
        return new C236729Qu(new C43I(Boolean.FALSE), null);
    }

    public final void x3() {
        C73305Spp c73305Spp = this.LJLJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    public final boolean H3() {
        List<VideoTrendingTopic> list;
        if (E3().iv0() == 0) {
            List<VideoTrendingTopic> list2 = F3().LJLIL;
            if (list2 == null || list2.isEmpty()) {
                return false;
            }
        } else {
            int iv0 = E3().iv0();
            if (1 > iv0 || iv0 >= 3) {
                return false;
            }
            VideoTrendingTopicListViewModel E3 = E3();
            if (E3.iv0() >= ((ArrayList) E3.LJLIL).size() || (list = ((BillboardInfo) ListProtector.get(E3.LJLIL, E3.iv0())).topics) == null || !(!list.isEmpty())) {
                return false;
            }
        }
        return true;
    }

    public final void K3() {
        C73306Spq A3 = A3();
        if (A3 != null) {
            C73305Spp c73305Spp = this.LJLJL;
            if (c73305Spp != null) {
                c73305Spp.setStatus(A3);
                C73305Spp c73305Spp2 = this.LJLJL;
                if (c73305Spp2 != null) {
                    c73305Spp2.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
            o.LJIJI("statusView");
            throw null;
        }
    }

    public final void L3() {
        C73306Spq C3 = C3();
        if (C3 != null) {
            C73305Spp c73305Spp = this.LJLJL;
            if (c73305Spp != null) {
                c73305Spp.setStatus(C3);
                C73305Spp c73305Spp2 = this.LJLJL;
                if (c73305Spp2 != null) {
                    c73305Spp2.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
            o.LJIJI("statusView");
            throw null;
        }
    }

    public final void M3() {
        C73305Spp c73305Spp = (C73305Spp) getContainerView().findViewById(R.id.kf_);
        o.LJIIIIZZ(c73305Spp, "containerView.status_view");
        this.LJLJL = c73305Spp;
        c73305Spp.LJFF();
        c73305Spp.setVisibility(0);
        C73305Spp c73305Spp2 = this.LJLJL;
        if (c73305Spp2 != null) {
            C16880lQ.LJIIJJI(new ACListenerS24S0100000_4(this, 191), c73305Spp2);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        E3().LJLJLLL.LIZLLL();
        F3().LJLJI.LIZLLL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        String string = LIZ.getString(R.string.sk6);
        o.LJIIIIZZ(string, "activity.getString(R.str…ndingTopicsSelect_header)");
        M3();
        C252709vu c252709vu = (C252709vu) getContainerView().findViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZIZ(new AqS151S0200000_4(LIZ, this, 20));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        EditText editText = (EditText) getContainerView().findViewById(R.id.jf9);
        editText.setOnFocusChangeListener(new IDCListenerS373S0100000_4(this, 2));
        this.LJLIL = editText;
        TuxIconView tuxIconView = (TuxIconView) getContainerView().findViewById(R.id.avg);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 189));
        this.LJLILLLLZI = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) getContainerView().findViewById(R.id.ayv);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS24S0100000_4(this, 190));
        this.LJLJI = tuxTextView;
        final RecyclerView recyclerView = (RecyclerView) getContainerView().findViewById(R.id.li9);
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "context");
        recyclerView.setAdapter(new C187657Yb(context, C47261Igj.LJJIJIIJI(LIZ.getString(R.string.skb), LIZ.getString(R.string.skc))));
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC029609s() { // from class: X.9R2
                @Override // X.AbstractC029609s
                public final void LIZLLL(int i, int i2) {
                    String str;
                    AbstractC029409q adapter2 = RecyclerView.this.getAdapter();
                    o.LJII(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.topic.trendingtopic.viewmodel.VideoTopicTagAdapter");
                    if (i == ((C187657Yb) adapter2).LJLJI) {
                        VideoTrendingTopicListViewModel E3 = this.E3();
                        AbstractC029409q adapter3 = RecyclerView.this.getAdapter();
                        o.LJII(adapter3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.topic.trendingtopic.viewmodel.VideoTopicTagAdapter");
                        C187657Yb c187657Yb = (C187657Yb) adapter3;
                        List<String> list = c187657Yb.LJLILLLLZI;
                        if (list != null) {
                            str = (String) ListProtector.get(list, c187657Yb.LJLJI);
                        } else {
                            Context context2 = c187657Yb.LJLIL;
                            if (context2 != null) {
                                str = context2.getString(R.string.skb);
                            } else {
                                str = null;
                            }
                        }
                        E3.kv0(str, false);
                    }
                }
            });
        }
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setVisibility(0);
        this.LJLJJI = recyclerView;
        C8YN.LJII(this, E3(), new TBT() { // from class: X.9QX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9R4) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 207), 4);
        C8YN.LJII(this, F3(), new TBT() { // from class: X.9Qx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236769Qy) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 208), 4);
        C8VC.LJIIJ(this, C65352Pkq.LIZ(C9QU.class), new TBT() { // from class: X.9Qs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236729Qu) obj).LIZIZ;
            }
        }, new TBT() { // from class: X.9Qt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236729Qu) obj).LIZ;
            }
        }, new AqS186S0100000_4(this, 206));
    }
}
