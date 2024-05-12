package com.ss.android.ugc.aweme.topic.review.list;

import X.C113554cx;
import X.C185967Ro;
import X.C185977Rp;
import X.C185987Rq;
import X.C212428Vi;
import X.C214298b3;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73306Spq;
import X.C78926UyI;
import X.C78983UzD;
import X.C7S6;
import X.C88913eJ;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.EV9;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.OSZ;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicReviewListAssem extends DetailListAssem implements ViewPagerPageSelectedSubscriber {
    public final C214298b3 LJLLLL;
    public final C214298b3 LJLLLLLL;

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.csr;
    }

    public TopicReviewListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicReviewListVM.class);
        this.LJLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1108), C185977Rp.INSTANCE, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(TopicReviewVM.class);
        this.LJLLLLLL = C78926UyI.LJ(this, LIZ2, c9bd, new AqS153S0100000_3(LIZ2, 1109), C185987Rq.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    /* renamed from: W3, reason: merged with bridge method [inline-methods] */
    public final TopicReviewListVM P3() {
        return (TopicReviewListVM) this.LJLLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X3() {
        String str;
        C185967Ro c185967Ro = P3().LJLJJI;
        if (c185967Ro.LIZJ) {
            for (Map.Entry entry : ((LinkedHashMap) c185967Ro.LIZ).entrySet()) {
                Object key = entry.getKey();
                long currentTimeMillis = System.currentTimeMillis() - ((Number) entry.getValue()).longValue();
                HashMap<String, Long> hashMap = c185967Ro.LIZIZ;
                Long l = (Long) hashMap.get(key);
                if (l == null) {
                    l = 0L;
                }
                hashMap.put(key, Long.valueOf(l.longValue() + currentTimeMillis));
            }
        }
        c185967Ro.LIZJ = false;
        C185967Ro c185967Ro2 = P3().LJLJJI;
        Object obj = ((LinkedHashMap) P3().LJLJI).get("previous_page");
        String LJJLIIIJ = C78983UzD.LJJLIIIJ(P3().LJLILLLLZI);
        String str2 = P3().LJLIL;
        Object obj2 = ((LinkedHashMap) P3().LJLJI).get("topic_title");
        HashMap<String, Long> hashMap2 = c185967Ro2.LIZIZ;
        for (Map.Entry<String, Long> entry2 : hashMap2.entrySet()) {
            String key2 = entry2.getKey();
            Long valueOf = Long.valueOf(entry2.getValue().longValue());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            OSZ[] oszArr = new OSZ[7];
            oszArr[0] = new OSZ("enter_from", "topic_detail");
            oszArr[1] = new OSZ("previous_page", obj);
            oszArr[2] = new OSZ("category", LJJLIIIJ);
            oszArr[3] = new OSZ("topic_id", str2);
            oszArr[4] = new OSZ("topic_title", obj2);
            oszArr[5] = new OSZ("review_id", key2);
            if (valueOf != null) {
                str = valueOf.toString();
            } else {
                str = null;
            }
            oszArr[6] = new OSZ("duration", str);
            FMX.LJIIL("topic_review_duration", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(oszArr), linkedHashMap));
        }
        hashMap2.clear();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        X3();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        M3().LLLF.LJZL(TopicReviewCell.class);
        C73306Spq L3 = L3();
        String string = view.getContext().getString(R.string.cdf);
        o.LJIIIIZZ(string, "view.context.getString(R…iew_reviews_empty_header)");
        L3.getClass();
        L3.LJFF = string;
        L3.LJI = C88913eJ.LIZ(view, R.string.cde, "view.context.getString(R…eview_reviews_empty_desc)");
        C8YN.LJII(this, this.LJLLLLLL.getValue(), new TBT() { // from class: X.7RW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C186157Sh) obj).LJLJJLL;
            }
        }, null, new AqS185S0100000_3(this, 94), 6);
        R3();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, ViewPagerPageSelectedSubscriber.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, ViewPagerPageSelectedSubscriber.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(ViewPagerPageSelectedSubscriber.class.getClassLoader(), new Class[]{ViewPagerPageSelectedSubscriber.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, ViewPagerPageSelectedSubscriber.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber
    public final void cR(int i, C7S6 switchMethod) {
        o.LJIIIZ(switchMethod, "switchMethod");
        if (i == 1) {
            C185967Ro c185967Ro = P3().LJLJJI;
            c185967Ro.LIZJ = true;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = ((LinkedHashMap) c185967Ro.LIZ).keySet().iterator();
            while (it.hasNext()) {
                c185967Ro.LIZ.put(it.next(), Long.valueOf(currentTimeMillis));
            }
            return;
        }
        X3();
    }
}
