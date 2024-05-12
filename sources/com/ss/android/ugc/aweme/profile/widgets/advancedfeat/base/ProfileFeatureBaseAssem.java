package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import X.C16880lQ;
import X.C17J;
import X.C188727au;
import X.C2068389v;
import X.C221108m2;
import X.C234999Kd;
import X.C40675Fxn;
import X.C44384HbQ;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C76800UCe;
import X.C78688UuS;
import X.C78999UzT;
import X.C8VA;
import X.C8VB;
import X.C8VC;
import X.C8VV;
import X.C99Z;
import X.C9GK;
import X.C9HE;
import X.C9HG;
import X.C9ID;
import X.C9IL;
import X.C9J9;
import X.C9JE;
import X.C9JF;
import X.C9JG;
import X.C9JH;
import X.C9JT;
import X.C9KV;
import X.FMX;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.TBT;
import X.W5F;
import X.W5U;
import Y.ARunnableS40S0100000_4;
import Y.AfS56S0100000_4;
import Y.IDComparatorS32S0000000_4;
import Y.IDLListenerS192S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileFeatureBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileFeatureBaseAssem extends UIContentAssem implements C9GK {
    public static final C9JG LJLLLLLL = new Object() { // from class: X.9JG
    };
    public Context LJLIL;
    public C9HG LJLILLLLZI;
    public LinearLayout LJLJI;
    public int LJLJJI;
    public boolean LJLLI;
    public Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final Set<Integer> LJLJJL = new LinkedHashSet();
    public final Map<Integer, Integer> LJLJJLL = new LinkedHashMap();
    public final List<Map.Entry<Integer, Integer>> LJLJL = new ArrayList();
    public final C55749LuL LJLJLJ = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
    public final C5H3 LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 715));
    public final Map<Integer, Boolean> LJLL = new LinkedHashMap();
    public final InterfaceC65784Pro<C76800UCe> LJLLILLLL = new AqS154S0100000_4(this, 716);
    public final C5H3 LJLLJ = C221108m2.LIZIZ(C9JE.LJLIL);
    public final C5H3 LJLLL = C221108m2.LIZIZ(C9JF.LJLIL);

    public void _$_clearFindViewByIdCache() {
        this.LJLLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLL;
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

    @Override // X.C9GK, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final C73318Sq2 A3() {
        return (C73318Sq2) this.LJLLL.getValue();
    }

    private final boolean H3() {
        return ((Boolean) this.LJLJLLL.getValue()).booleanValue();
    }

    private final void K3() {
        this.LJLJL.clear();
        Iterator<Map.Entry<Integer, Integer>> it = this.LJLJJLL.entrySet().iterator();
        while (it.hasNext()) {
            this.LJLJL.add(it.next());
        }
        List<Map.Entry<Integer, Integer>> list = this.LJLJL;
        if (list.size() > 1) {
            C40675Fxn.LJJLIIIJ(list, new IDComparatorS32S0000000_4(1));
        }
    }

    private final void M3() {
        List<Integer> list;
        View findViewById;
        int intValue;
        User user;
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null && (user = c234999Kd.LIZ) != null) {
            list = user.getUserAdvancedFeaturesOrder();
        } else {
            list = null;
        }
        if (list != null) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) ListProtector.get(list, i2);
                if (num != null) {
                    int intValue2 = num.intValue();
                    Integer num2 = this.LJLJJLL.get(Integer.valueOf(intValue2));
                    if (num2 != null) {
                        int intValue3 = num2.intValue();
                        LinearLayout linearLayout = this.LJLJI;
                        if (linearLayout != null) {
                            View childAt = linearLayout.getChildAt(intValue3);
                            childAt.findViewById(R.id.y2).setVisibility(0);
                            if (intValue3 != i2) {
                                LinearLayout linearLayout2 = this.LJLJI;
                                if (linearLayout2 != null) {
                                    C16880lQ.LLII(linearLayout2, intValue3);
                                    this.LJLJJLL.put(Integer.valueOf(intValue2), Integer.valueOf(i));
                                    LinearLayout linearLayout3 = this.LJLJI;
                                    if (linearLayout3 != null) {
                                        linearLayout3.addView(childAt, i);
                                        for (Map.Entry<Integer, Integer> entry : this.LJLJJLL.entrySet()) {
                                            if (entry.getKey().intValue() != intValue2 && i <= (intValue = entry.getValue().intValue()) && intValue < intValue3) {
                                                this.LJLJJLL.put(entry.getKey(), Integer.valueOf(entry.getValue().intValue() + 1));
                                            }
                                        }
                                    } else {
                                        o.LJIJI("linearLayout");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("linearLayout");
                                    throw null;
                                }
                            }
                            i++;
                        } else {
                            o.LJIJI("linearLayout");
                            throw null;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        int i3 = -1;
        Integer num3 = null;
        for (Map.Entry<Integer, Integer> entry2 : this.LJLJJLL.entrySet()) {
            LinearLayout linearLayout4 = this.LJLJI;
            if (linearLayout4 != null) {
                if (C44384HbQ.LLFF(linearLayout4.getChildAt(entry2.getValue().intValue())) && entry2.getValue().intValue() > i3) {
                    i3 = entry2.getValue().intValue();
                    num3 = entry2.getKey();
                }
            } else {
                o.LJIJI("linearLayout");
                throw null;
            }
        }
        Integer num4 = num3;
        if (num4 != null) {
            Integer num5 = this.LJLJJLL.get(Integer.valueOf(num4.intValue()));
            if (num5 != null) {
                LinearLayout linearLayout5 = this.LJLJI;
                if (linearLayout5 != null) {
                    View childAt2 = linearLayout5.getChildAt(num5.intValue());
                    if (childAt2 == null || (findViewById = childAt2.findViewById(R.id.y2)) == null) {
                        return;
                    }
                    findViewById.setVisibility(8);
                    return;
                }
                o.LJIJI("linearLayout");
                throw null;
            }
        }
    }

    private final void N3() {
        C9HG c9hg = this.LJLILLLLZI;
        if (c9hg != null) {
            if (c9hg.getOnScrollListener() == null) {
                C9HG c9hg2 = this.LJLILLLLZI;
                if (c9hg2 != null) {
                    c9hg2.setOnScrollListener(new C9HE() { // from class: X.9JD
                        @Override // X.C9HE
                        public final void LIZ() {
                            ProfileFeatureBaseAssem.this.x3().onNext(0);
                        }
                    });
                    return;
                } else {
                    o.LJIJI("scrollView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("scrollView");
        throw null;
    }

    public final C9ID C3() {
        return (C9ID) this.LJLJLJ.getValue();
    }

    public final void I3() {
        String str;
        for (Map.Entry<Integer, Integer> entry : this.LJLJL) {
            Integer num = this.LJLJJLL.get(entry.getKey());
            if (num != null) {
                int intValue = num.intValue();
                LinearLayout linearLayout = this.LJLJI;
                if (linearLayout != null) {
                    if (intValue < linearLayout.getChildCount()) {
                        Boolean bool = this.LJLL.get(entry.getKey());
                        Boolean bool2 = Boolean.TRUE;
                        if (o.LJ(bool, bool2)) {
                            continue;
                        } else {
                            LinearLayout linearLayout2 = this.LJLJI;
                            if (linearLayout2 != null) {
                                View childAt = linearLayout2.getChildAt(intValue);
                                if (childAt != null && C44384HbQ.LLFF(childAt) && childAt.getLocalVisibleRect(new Rect())) {
                                    C188727au c188727au = new C188727au();
                                    if (H3()) {
                                        str = "personal_homepage";
                                    } else {
                                        str = "others_homepage";
                                    }
                                    c188727au.LJIIIZ("enter_from", str);
                                    c188727au.LJIIIZ("target", C78688UuS.LJJIL(entry.getKey().intValue()));
                                    c188727au.LIZLLL(this.LJLJL.indexOf(entry) + 1, "index");
                                    FMX.LJIIL("profile_creator_tools_show", c188727au.LIZ);
                                    this.LJLL.put(entry.getKey(), bool2);
                                    W4(entry.getKey().intValue());
                                }
                            } else {
                                o.LJIJI("linearLayout");
                                throw null;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    o.LJIJI("linearLayout");
                    throw null;
                }
            }
        }
    }

    @Override // X.C8W0
    public void onPause() {
        this.LJLL.clear();
        this.LJLLI = false;
        this.LJLJJL.clear();
        super.onPause();
    }

    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public C99Z defaultObservableData() {
        return new C99Z(null);
    }

    public final C73849Syb<Integer> x3() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-behaviorSubject>(...)");
        return (C73849Syb) value;
    }

    private final void F3() {
        C78999UzT.LJFF(x3().LJJJJLI(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 56), new InterfaceC64592gB() { // from class: X.9HH
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                C221018lt.LIZIZ("advanced features", message);
            }
        }), A3());
    }

    public final void L3() {
        M3();
        K3();
        N3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        if (!C9JH.LIZ()) {
            C9HG c9hg = this.LJLILLLLZI;
            if (c9hg != null) {
                c9hg.getViewTreeObserver().removeOnGlobalLayoutListener(new IDLListenerS192S0100000_4((InterfaceC65784Pro) this.LJLLILLLL, 3));
            } else {
                o.LJIJI("scrollView");
                throw null;
            }
        }
        A3().dispose();
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
        if (C9JH.LIZ()) {
            I3();
        }
    }

    public final void E3(List features) {
        o.LJIIIZ(features, "features");
        this.LJLJJI = ((C9JT) ((C9J9) ORZ.LLFF(features)).LJLIL).getId();
        C8VV.LIZJ(this, new AqS135S0200000_4(features, (List<C9J9>) this, (ProfileFeatureBaseAssem) 85));
    }

    @Override // X.C9GK
    public void W4(int i) {
        AqS29S0001000_4 aqS29S0001000_4 = new AqS29S0001000_4(i, 8);
        Class<ProfileFeatureBaseAssem> cls = ProfileFeatureBaseAssem.class;
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
        LIZLLL.LJI((Class) LJLLJ, aqS29S0001000_4);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Context context;
        o.LJIIIZ(view, "view");
        if ((view instanceof C9HG) && (context = getContext()) != null) {
            this.LJLIL = context;
            if (C76800UCe.LIZ == null) {
                return;
            }
            this.LJLILLLLZI = (C9HG) view;
            View findViewById = view.findViewById(R.id.y1);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.advanced_content)");
            this.LJLJI = (LinearLayout) findViewById;
            F3();
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9JA
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PL) obj).LIZJ;
                }
            }, new AqS170S0100000_4(this, 631));
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9JB
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C234999Kd) obj).LIZIZ;
                }
            }, new AqS170S0100000_4(this, 632));
            if (C9JH.LIZ() && !H3()) {
                C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9JC
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C9PN) obj).LJIIJ;
                    }
                }, new AqS170S0100000_4(this, 633));
                return;
            }
            C9HG c9hg = this.LJLILLLLZI;
            if (c9hg != null) {
                c9hg.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS192S0100000_4((InterfaceC65784Pro) this.LJLLILLLL, 3));
            } else {
                o.LJIJI("scrollView");
                throw null;
            }
        }
    }

    @Override // X.C9GK
    public boolean t4(C9JT area) {
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                return linearLayout.getChildAt(intValue).getLocalVisibleRect(new Rect());
            }
            o.LJIJI("linearLayout");
            throw null;
        }
        return false;
    }

    @Override // X.C9GK
    public View t5(C9JT area) {
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            return linearLayout.getChildAt(intValue);
        }
        o.LJIJI("linearLayout");
        throw null;
    }

    @Override // X.C9GK
    public void Cb(boolean z, C9JT area) {
        int i;
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                View findViewById = linearLayout.getChildAt(intValue).findViewById(R.id.y4);
                if (findViewById != null) {
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    findViewById.setVisibility(i);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // X.C9GK
    public void Ci(C9JT area, Map<String, Boolean> mobMap) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(mobMap, "mobMap");
        C9HG c9hg = this.LJLILLLLZI;
        if (c9hg != null) {
            c9hg.post(new ARunnableS40S0100000_4(this, 69));
            if (this.LJLJJL.contains(Integer.valueOf(area.getId()))) {
                return;
            }
            C17J.LJIIZILJ(this, H3(), C9IL.INTERACTION, mobMap);
            this.LJLJJL.add(Integer.valueOf(area.getId()));
            C9HG c9hg2 = this.LJLILLLLZI;
            if (c9hg2 != null) {
                c9hg2.setVisibility(0);
                Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
                if (num != null) {
                    int intValue = num.intValue();
                    LinearLayout linearLayout = this.LJLJI;
                    if (linearLayout != null) {
                        linearLayout.getChildAt(intValue).setVisibility(0);
                        if (!this.LJLLI && area.getId() == this.LJLJJI) {
                            this.LJLLI = true;
                            return;
                        }
                        return;
                    }
                    o.LJIJI("linearLayout");
                    throw null;
                }
                return;
            }
            o.LJIJI("scrollView");
            throw null;
        }
        o.LJIJI("scrollView");
        throw null;
    }

    @Override // X.C9GK
    public void Dd(int i, C9JT area) {
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt == null) {
                    return;
                }
                TuxIconView tuxIconView = (TuxIconView) childAt.findViewById(R.id.y3);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = i;
                c2068389v.LJ = Integer.valueOf(R.attr.eb);
                tuxIconView.setTuxIcon(c2068389v);
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // X.C9GK
    public void Ue(String contentDescription, C9JT area) {
        o.LJIIIZ(contentDescription, "contentDescription");
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                linearLayout.getChildAt(intValue).setContentDescription(contentDescription);
            } else {
                o.LJIJI("linearLayout");
                throw null;
            }
        }
    }

    @Override // X.C9GK
    public void Vf(String text, C9JT area) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                TextView textView = (TextView) linearLayout.getChildAt(intValue).findViewById(R.id.y5);
                if (textView != null) {
                    textView.setText(text);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // X.C9GK
    public void g2(View view, C9JT area) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(area, "area");
        Map<Integer, Integer> map = this.LJLJJLL;
        Integer valueOf = Integer.valueOf(area.getId());
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            map.put(valueOf, Integer.valueOf(linearLayout.getChildCount()));
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                linearLayout2.addView(view);
                if (area.getId() == this.LJLJJI) {
                    L3();
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
        o.LJIJI("linearLayout");
        throw null;
    }

    @Override // X.C9GK
    public void jj(C9JT area, Map<String, Boolean> mobMap) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(mobMap, "mobMap");
        if (!this.LJLJJL.contains(Integer.valueOf(area.getId())) && !this.LJLLI && area.getId() == this.LJLJJI) {
            this.LJLLI = true;
        }
        C17J.LJIIZILJ(this, H3(), C9IL.INTERACTION, mobMap);
        this.LJLJJL.remove(Integer.valueOf(area.getId()));
        if (this.LJLJJL.isEmpty()) {
            C9HG c9hg = this.LJLILLLLZI;
            if (c9hg != null) {
                c9hg.setVisibility(8);
            } else {
                o.LJIJI("scrollView");
                throw null;
            }
        }
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                linearLayout.getChildAt(intValue).setVisibility(8);
            } else {
                o.LJIJI("linearLayout");
                throw null;
            }
        }
    }

    @Override // X.C9GK
    public void m5(String url, C9JT area) {
        ImageView imageView;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt != null && (imageView = (ImageView) childAt.findViewById(R.id.y3)) != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(url);
                    LJIIIIZZ.LJJIIJZLJL = imageView;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // X.C9GK
    public void u5(View.OnClickListener clickListener, C9JT area) {
        o.LJIIIZ(clickListener, "clickListener");
        o.LJIIIZ(area, "area");
        Integer num = this.LJLJJLL.get(Integer.valueOf(area.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                C16880lQ.LJIIJ(clickListener, linearLayout.getChildAt(intValue));
            } else {
                o.LJIJI("linearLayout");
                throw null;
            }
        }
    }
}
