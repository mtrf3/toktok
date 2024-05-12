package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193937jJ;
import X.AbstractC225698tR;
import X.ActivityC45651qj;
import X.C162476Zf;
import X.C181847Bs;
import X.C195867mQ;
import X.C195877mR;
import X.C195887mS;
import X.C195907mU;
import X.C196267n4;
import X.C196477nP;
import X.C196487nQ;
import X.C1JI;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C225688tQ;
import X.C225708tS;
import X.C26045AKb;
import X.C47704Ins;
import X.C4LD;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C56642Ke;
import X.C57092Lx;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78685UuP;
import X.C78926UyI;
import X.C7ML;
import X.C7XD;
import X.C9BE;
import X.C9XU;
import X.G27;
import X.InterfaceC196737np;
import X.InterfaceC57784Mm4;
import X.QD3;
import X.SYL;
import X.X1D;
import Y.ARunnableS0S0111000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.ability.NowListAbility;
import com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel;
import com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class NowBaseListAssem extends UIContentAssem implements INowListFragmentPanel {
    public final C55749LuL LJLIL;
    public final C196477nP LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C195907mU LJLJJL;

    public abstract String A3();

    public abstract C73305Spp E3();

    public abstract void F3();

    public abstract Class<? extends PowerCell<?>>[] I3();

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final RecyclerView.RecycledViewPool WE() {
        return null;
    }

    public abstract NowDistributionListViewModel v3();

    public abstract SYL x3();

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final void yJ(RecyclerView.RecycledViewPool recycledViewPool) {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.7mU] */
    public NowBaseListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJLILLLLZI = C1JI.LJJIII(this);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowPageViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 588), C195867mQ.INSTANCE, null);
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 587));
        this.LJLJJL = new G27() { // from class: X.7mU
            @Override // X.G27
            public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
                Integer num;
                Integer num2;
                int i;
                int LJJIIZ;
                o.LJIIIZ(newConfig, "newConfig");
                String A3 = NowBaseListAssem.this.A3();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("tablet rotation, screen size(");
                if (activity != null) {
                    num = Integer.valueOf(C63081OpJ.LJJJJL(activity));
                } else {
                    num = null;
                }
                LIZ2.append(num);
                LIZ2.append(", ");
                if (activity != null) {
                    num2 = Integer.valueOf(C63081OpJ.LJJJJJL(activity));
                } else {
                    num2 = null;
                }
                LIZ2.append(num2);
                LIZ2.append(')');
                C7XD.LJ(A3, X1D.LIZIZ(LIZ2));
                final NowBaseListAssem nowBaseListAssem = NowBaseListAssem.this;
                nowBaseListAssem.getClass();
                final int i2 = 0;
                boolean z = true;
                if (LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() != 1) {
                    z = false;
                    if (C53946LFe.LIZJ(null, null).LJFF) {
                        i = C53946LFe.LIZJ(null, null).LIZJ;
                        if (nowBaseListAssem.getContext() != null && (LJJIIZ = (i - O6R.LJJIIZ(C32151Nz.LJIIZILJ(485))) / 2) >= 0) {
                            i2 = LJJIIZ;
                        }
                        C195927mW c195927mW = new C195927mW() { // from class: X.7mV
                            @Override // X.LLY
                            public final void s0(AbstractC225698tR tabStyle, boolean z2) {
                                o.LJIIIZ(tabStyle, "tabStyle");
                                SYL x3 = NowBaseListAssem.this.x3();
                                int i3 = i2;
                                int paddingTop = NowBaseListAssem.this.x3().getPaddingTop();
                                int i4 = i2;
                                NowBaseListAssem.this.getClass();
                                x3.setPadding(i3, paddingTop, i4, NowBaseListAssem.H3(tabStyle));
                            }
                        };
                        nowBaseListAssem.getClass();
                        LFQ.LIZIZ(c195927mW);
                        C2NH.LIZ.post(new ARunnableS0S0111000_3(nowBaseListAssem, z, i2, 1));
                    }
                }
                i = C53946LFe.LIZJ(null, null).LIZIZ;
                if (nowBaseListAssem.getContext() != null) {
                    i2 = LJJIIZ;
                }
                C195927mW c195927mW2 = new C195927mW() { // from class: X.7mV
                    @Override // X.LLY
                    public final void s0(AbstractC225698tR tabStyle, boolean z2) {
                        o.LJIIIZ(tabStyle, "tabStyle");
                        SYL x3 = NowBaseListAssem.this.x3();
                        int i3 = i2;
                        int paddingTop = NowBaseListAssem.this.x3().getPaddingTop();
                        int i4 = i2;
                        NowBaseListAssem.this.getClass();
                        x3.setPadding(i3, paddingTop, i4, NowBaseListAssem.H3(tabStyle));
                    }
                };
                nowBaseListAssem.getClass();
                LFQ.LIZIZ(c195927mW2);
                C2NH.LIZ.post(new ARunnableS0S0111000_3(nowBaseListAssem, z, i2, 1));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final InterfaceC196737np getPlayer() {
        return (InterfaceC196737np) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final NowPageViewModel sg() {
        return (NowPageViewModel) this.LJLJI.getValue();
    }

    public final AbstractC193937jJ C3() {
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return null;
        }
        return ((C181847Bs) this.LJLIL.getValue()).LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final Fragment getFragment() {
        return C212428Vi.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final SYL i8() {
        return x3();
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        C196487nQ.LIZIZ(this);
        Fragment fragment = getFragment();
        if (fragment != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(fragment, null), this, NowListAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        C196487nQ.LIZJ(this);
        Fragment fragment = getFragment();
        if (fragment != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(fragment, null), NowListAbility.class, null);
        }
        C9XU.LIZLLL(this.LJLJJL);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        AbstractC193937jJ C3 = C3();
        if (C3 == null) {
            return;
        }
        ((Set) C196267n4.LIZ.getValue()).remove(C3);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        AbstractC193937jJ C3 = C3();
        if (C3 == null) {
            return;
        }
        ((Set) C196267n4.LIZ.getValue()).add(C3);
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public boolean pt0() {
        return C196487nQ.LIZ(this);
    }

    public static int H3(AbstractC225698tR abstractC225698tR) {
        if (o.LJ(abstractC225698tR, C225688tQ.LIZ)) {
            C57092Lx.LIZ.getClass();
            return C61447O9r.LIZ();
        }
        if (o.LJ(abstractC225698tR, C225708tS.LIZ)) {
            return 0;
        }
        throw new C162476Zf();
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LIZLLL.setUserVisibleHint(false);
        }
        NowPageViewModel sg = sg();
        if (sg != null) {
            sg.setState(C195887mS.LJLIL);
        }
        AbstractC193937jJ C3 = C3();
        if (C3 == null) {
            return;
        }
        ((Set) C196267n4.LIZ.getValue()).remove(C3);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LIZLLL.setUserVisibleHint(true);
        }
        NowPageViewModel sg = sg();
        if (sg != null) {
            sg.setState(C195877mR.LJLIL);
        }
        AbstractC193937jJ C3 = C3();
        if (C3 == null) {
            return;
        }
        ((Set) C196267n4.LIZ.getValue()).add(C3);
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final int jd0(InterfaceC57784Mm4 item) {
        C7ML c7ml;
        Aweme aweme;
        List<ITEM> listGetAll;
        String str;
        C7ML c7ml2;
        Aweme aweme2;
        o.LJIIIZ(item, "item");
        if ((item instanceof C7ML) && (c7ml = (C7ML) item) != null && (aweme = c7ml.getAweme()) != null && (listGetAll = v3().listGetAll()) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listGetAll) {
                if (obj instanceof C7ML) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                if ((interfaceC57784Mm4 instanceof C7ML) && (c7ml2 = (C7ML) interfaceC57784Mm4) != null && (aweme2 = c7ml2.getAweme()) != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(str, aweme.getAid())) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        String str;
        String str2;
        JSONObject jSONObject;
        o.LJIIIZ(event, "event");
        try {
            JSONObject jSONObject2 = event.LJLIL;
            String str3 = null;
            if (jSONObject2 != null) {
                str = JSONObjectProtectorUtils.getString(jSONObject2, "eventName");
            } else {
                str = null;
            }
            if (o.LJ(str, "videoReportSuccess")) {
                JSONObject jSONObject3 = event.LJLIL;
                if (jSONObject3 != null && (jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject3, "data")) != null) {
                    str3 = JSONObjectProtectorUtils.getString(jSONObject, "object_id");
                }
                Aweme LJIJI = C4LD.LIZ.LJIJI();
                if (LJIJI == null || (str2 = LJIJI.getAid()) == null) {
                    str2 = "";
                }
                String A3 = A3();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onJsBroadCastEvent get object_id is ");
                LIZ.append(str3);
                LIZ.append(", reportAwemeId is ");
                LIZ.append(str2);
                C7XD.LJ(A3, X1D.LIZIZ(LIZ));
                if (C78685UuP.LJJJZ(str2) && o.LJ(str2, str3)) {
                    C26045AKb c26045AKb = new C26045AKb(getContainerView());
                    c26045AKb.LJIIIIZZ(R.string.j4q);
                    c26045AKb.LJIIJ();
                }
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        EventBus.LIZJ().LJIILJJIL(this);
        SYL x3 = x3();
        Class<? extends PowerCell<?>>[] I3 = I3();
        x3.LLLF.LJZL((Class[]) Arrays.copyOf(I3, I3.length));
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZIZ(LIZ, this.LJLJJL);
        }
    }
}
