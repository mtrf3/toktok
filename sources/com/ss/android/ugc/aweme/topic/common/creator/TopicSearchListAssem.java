package com.ss.android.ugc.aweme.topic.common.creator;

import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73306Spq;
import X.C78926UyI;
import X.C7P1;
import X.C7PR;
import X.C9BE;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.topic.book.creator.BookSearchItemCell;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.creator.MovieSearchItemCell;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicSearchListAssem extends DetailListAssem {
    public final C214298b3 LJLLLL;
    public C7PR LJLLLLLL;

    /* loaded from: classes4.dex */
    public interface TopicSelectedAbility extends C2K0 {
        boolean Uk(TopicRawInfo topicRawInfo, boolean z);

        boolean z30(String str);
    }

    public TopicSearchListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicSearchViewModel.class);
        this.LJLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1069), C7P1.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    /* renamed from: W3, reason: merged with bridge method [inline-methods] */
    public final TopicSearchViewModel P3() {
        return (TopicSearchViewModel) this.LJLLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer num;
        C7PR c7pr;
        String str;
        String str2;
        Integer num2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Object obj = getConfig().LJ.get("topic_type");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        C7PR c7pr2 = C7PR.BOOK;
        int type = c7pr2.getType();
        if (num == null || num.intValue() != type) {
            Object obj2 = getConfig().LJ.get("topic_type");
            if (obj2 instanceof Integer) {
                num2 = (Integer) obj2;
            } else {
                num2 = null;
            }
            c7pr = C7PR.MOVIE;
            int type2 = c7pr.getType();
            if (num2 == null || num2.intValue() != type2) {
                return;
            }
        } else {
            c7pr = c7pr2;
        }
        this.LJLLLLLL = c7pr;
        TopicSearchViewModel P3 = P3();
        C7PR c7pr3 = this.LJLLLLLL;
        if (c7pr3 != null) {
            P3.LJLILLLLZI = c7pr3;
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
                C73306Spq L3 = L3();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_magnify_glass;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                L3.LIZJ = 0;
                L3.LIZIZ = c2068389v;
                Object obj3 = getConfig().LJ.get("title");
                if (obj3 instanceof String) {
                    str = (String) obj3;
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                L3.LJFF = str;
                Object obj4 = getConfig().LJ.get("desc");
                if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
                    str3 = str2;
                }
                L3.LJI = str3;
                C7PR c7pr4 = this.LJLLLLLL;
                if (c7pr4 != null) {
                    int type3 = c7pr4.getType();
                    if (type3 == c7pr2.getType()) {
                        M3().LLLF.LJZL(BookSearchItemCell.class);
                    } else if (type3 == C7PR.MOVIE.getType()) {
                        M3().LLLF.LJZL(MovieSearchItemCell.class);
                    } else {
                        return;
                    }
                    SYL M3 = M3();
                    getContext();
                    M3.setLayoutManager(new LinearLayoutManager(1, false));
                    M3().setLifecycleOwner(this);
                    AssemViewModel.asyncSubscribe$default(P3(), new TBT() { // from class: X.7Lx
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj5) {
                            C182347Dq c182347Dq = (C182347Dq) obj5;
                            c182347Dq.getClass();
                            return C208708Ha.LIZLLL(c182347Dq);
                        }
                    }, null, new AqS169S0100000_3(LIZJ, 487), new AqS153S0100000_3(LIZJ, 1068), new AqS134S0200000_3(this, LIZJ, 157), 2, null);
                    R3();
                    U3();
                    TopicSearchViewModel P32 = P3();
                    C2K0 LIZ = C55096Ljo.LIZ(LIZJ, RefreshAbility.class, null);
                    if (LIZ == null) {
                        C55096Ljo.LJIIJJI(LIZJ, P32, RefreshAbility.class, null);
                    } else {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                            if (invocationHandler instanceof EV9) {
                                ((EV9) invocationHandler).LIZ.add(P32);
                            } else {
                                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                            }
                        } catch (IllegalArgumentException unused) {
                            EV9 ev9 = new EV9();
                            ev9.LIZ.add(P32);
                            ev9.LIZ.add(LIZ);
                            Object newProxyInstance = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, ev9);
                            if (newProxyInstance != null) {
                                C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, RefreshAbility.class, null);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                            }
                        }
                    }
                    TopicSearchViewModel P33 = P3();
                    C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ, SearchAbility.class, null);
                    if (LIZ2 == null) {
                        C55096Ljo.LJIIJJI(LIZJ, P33, SearchAbility.class, null);
                        return;
                    }
                    try {
                        InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                        if (invocationHandler2 instanceof EV9) {
                            ((EV9) invocationHandler2).LIZ.add(P33);
                            return;
                        }
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    } catch (IllegalArgumentException unused2) {
                        EV9 ev92 = new EV9();
                        ev92.LIZ.add(P33);
                        ev92.LIZ.add(LIZ2);
                        Object newProxyInstance2 = Proxy.newProxyInstance(SearchAbility.class.getClassLoader(), new Class[]{SearchAbility.class}, ev92);
                        if (newProxyInstance2 != null) {
                            C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance2, SearchAbility.class, null);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility");
                    }
                }
                o.LJIJI("topicType");
                throw null;
            }
            return;
        }
        o.LJIJI("topicType");
        throw null;
    }
}
