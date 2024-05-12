package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C113554cx;
import X.C212428Vi;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C7SY;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.OSZ;
import Y.IDObjectS2S0101000_3;
import Y.IDObjectS327S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiHeaderContainerAssem extends DynamicAssem implements IPoiDetailVisibilityAbility {
    public static final Map<String, Integer> LJLLI = C113554cx.LJJL(new OSZ("detail_header_container1", Integer.valueOf(R.id.htl)), new OSZ("detail_header_container2", Integer.valueOf(R.id.htm)), new OSZ("detail_header_container3", Integer.valueOf(R.id.htn)), new OSZ("detail_header_container4", Integer.valueOf(R.id.hto)), new OSZ("detail_header_container5", Integer.valueOf(R.id.htp)), new OSZ("detail_header_container6", Integer.valueOf(R.id.htq)), new OSZ("detail_header_container7", Integer.valueOf(R.id.htr)), new OSZ("detail_header_container8", Integer.valueOf(R.id.hts)));
    public boolean LJLJLLL;
    public LinearLayout LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0i;
    }

    public PoiHeaderContainerAssem() {
        new LinkedHashMap();
        this.LJLJLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility
    public final void la() {
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            Iterator it = new IDObjectS327S0100000_3(linearLayout, 0).iterator();
            while (true) {
                IDObjectS2S0101000_3 iDObjectS2S0101000_3 = (IDObjectS2S0101000_3) it;
                if (iDObjectS2S0101000_3.hasNext()) {
                    ((View) iDObjectS2S0101000_3.next()).setVisibility(8);
                } else {
                    return;
                }
            }
        } else {
            o.LJIJI("headerContainer");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility
    public final void y4() {
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            Iterator it = new IDObjectS327S0100000_3(linearLayout, 1).iterator();
            while (true) {
                IDObjectS2S0101000_3 iDObjectS2S0101000_3 = (IDObjectS2S0101000_3) it;
                if (iDObjectS2S0101000_3.hasNext()) {
                    ((View) iDObjectS2S0101000_3.next()).setVisibility(0);
                } else {
                    return;
                }
            }
        } else {
            o.LJIJI("headerContainer");
            throw null;
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> K3() {
        return LJLLI;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DetailPageNameAbility detailPageNameAbility;
        String lr;
        o.LJIIIZ(view, "view");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, IPoiDetailVisibilityAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, IPoiDetailVisibilityAbility.class, null);
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
                    Object newProxyInstance = Proxy.newProxyInstance(IPoiDetailVisibilityAbility.class.getClassLoader(), new Class[]{IPoiDetailVisibilityAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, IPoiDetailVisibilityAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility");
                    }
                }
            }
        }
        int size = getConfig().LJIIIZ.size();
        View findViewById = view.findViewById(R.id.e3i);
        o.LJIIIIZZ(findViewById, "view.findViewById<LinearLayout>(R.id.header)");
        this.LJLL = (LinearLayout) findViewById;
        Map<String, Integer> map = LJLLI;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getValue().intValue()));
        }
        int min = Math.min(size, arrayList.size());
        for (int i = 0; i < min; i++) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(((Number) ListProtector.get(arrayList, i)).intValue());
            frameLayout.setVisibility(8);
            LinearLayout linearLayout = this.LJLL;
            if (linearLayout != null) {
                linearLayout.addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
            } else {
                o.LJIJI("headerContainer");
                throw null;
            }
        }
        assembleChildren();
        if (this.LJLJLLL) {
            this.LJLJLLL = false;
            Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
            if (LIZLLL2 != null && (detailPageNameAbility = (DetailPageNameAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL2, null), DetailPageNameAbility.class, null)) != null && (lr = detailPageNameAbility.lr()) != null) {
                view.post(new C7SY(lr));
            }
        }
    }
}
