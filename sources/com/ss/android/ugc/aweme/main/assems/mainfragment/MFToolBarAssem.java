package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C12460eI;
import X.C16880lQ;
import X.C17N;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C54258LRe;
import X.C55096Ljo;
import X.C55274Lmg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C68252m5;
import X.C78847Ux1;
import X.C84193Sd;
import X.InterfaceC18010nF;
import X.InterfaceC36571c5;
import X.InterfaceC54084LKm;
import X.InterfaceC55102Lju;
import X.LL4;
import X.LM3;
import X.LM8;
import X.LML;
import X.LMV;
import X.LMW;
import X.LMX;
import X.LMY;
import X.LMZ;
import X.LNZ;
import X.LRD;
import X.ORZ;
import X.QD3;
import Y.ARunnableS45S0100000_9;
import Y.IDAListenerS4S0110000_9;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes10.dex */
public final class MFToolBarAssem extends UIContentAssem implements IMFDialogAbility, IMFToolBarAbility, InterfaceC55102Lju {
    public C54258LRe LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public LMW LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -103993180 || hashCode == 1142664397) {
            return this;
        }
        return null;
    }

    public MFToolBarAssem() {
        new LinkedHashMap();
        this.LJLJI = true;
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 314));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 309));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 313));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 311));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 310));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 312));
    }

    public final List<LML> A3() {
        return (List) this.LJLL.getValue();
    }

    public final View C3() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-titleBarContainer>(...)");
        return (View) value;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final ViewGroup Df() {
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            return lmw.LJI("NOTIFICATION");
        }
        o.LJIJI("toolBarCreateViewManager");
        throw null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility
    public final boolean E2() {
        C54258LRe c54258LRe = this.LJLIL;
        if (c54258LRe == null || !c54258LRe.LIZJ()) {
            return false;
        }
        return true;
    }

    public final View E3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-titleShadow>(...)");
        return (View) value;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility
    public final boolean K0() {
        C54258LRe c54258LRe = this.LJLIL;
        if (c54258LRe == null || !c54258LRe.LJ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final boolean Oo() {
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            return lmw.LLLIIIL();
        }
        o.LJIJI("toolBarCreateViewManager");
        throw null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void e0() {
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            lmw.LIZJ();
            Iterator it = ORZ.LLIIIZ(A3(), v3()).iterator();
            while (it.hasNext()) {
                ((LML) it.next()).e0();
            }
            E3().setVisibility(0);
            return;
        }
        o.LJIJI("toolBarCreateViewManager");
        throw null;
    }

    public final List<LML> v3() {
        return (List) this.LJLJLLL.getValue();
    }

    public final LMX x3() {
        return (LMX) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final Integer Do0() {
        View findViewById = getContainerView().findViewById(R.id.j5x);
        if (findViewById != null) {
            return Integer.valueOf(findViewById.getBottom());
        }
        return null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final boolean R8() {
        return x3().R8();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void iG() {
        x3().LIZJ(true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        CommonPageFragment kv0;
        Fragment mv0;
        super.onResume();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (kv0 = C84193Sd.LIZ(LIZ).kv0()) != null && s.LJJJLZIJ(C16880lQ.LJLLJ(kv0.getClass()), "MainPageFragment", false) && (mv0 = C116694i1.LIZ(LIZ).mv0()) != null && (this.LJLJJL.getValue() instanceof InterfaceC18010nF) && mv0 == this.LJLJJL.getValue() && !LIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false)) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) this.LJLJJL.getValue();
            o.LJII(interfaceC36571c5, "null cannot be cast to non-null type com.bytedance.analytics.page.IPage");
            C12460eI.LJIIIIZZ((InterfaceC18010nF) interfaceC36571c5, LIZ);
        }
        if (!this.LJLJI) {
            return;
        }
        this.LJLJI = false;
        View findViewById = getContainerView().findViewById(R.id.j5x);
        if (findViewById != null) {
            findViewById.postDelayed(new ARunnableS45S0100000_9(this, 77), 3000L);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void rt() {
        E3().setVisibility(8);
    }

    public static String F3(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            sb.append((String) it.next());
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stringParam.toString()");
        return sb2;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void A6(LL4 ll4) {
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            lmw.A6(ll4);
        } else {
            o.LJIJI("toolBarCreateViewManager");
            throw null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final boolean DN(String tag) {
        o.LJIIIZ(tag, "tag");
        InterfaceC54084LKm LIZ = x3().LIZ(tag);
        if (LIZ != null) {
            return x3().LJ(LIZ);
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void Dk0(boolean z) {
        Iterator it = ORZ.LLIIIZ(A3(), v3()).iterator();
        while (it.hasNext()) {
            ((LML) it.next()).LIZ();
        }
        TopTabAbility LJJLIIIJL = C78847Ux1.LJJLIIIJL(C55096Ljo.LJIIZILJ(this));
        if (LJJLIIIJL != null) {
            LJJLIIIJL.yh0(false, z);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void LLIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            lmw.LLIZ(tag);
        } else {
            o.LJIJI("toolBarCreateViewManager");
            throw null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void LLJ(String tag) {
        o.LJIIIZ(tag, "tag");
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            lmw.LLJ(tag);
        } else {
            o.LJIJI("toolBarCreateViewManager");
            throw null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void LLZLLIL(String tag) {
        o.LJIIIZ(tag, "tag");
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            lmw.LLZLLIL(tag);
        } else {
            o.LJIJI("toolBarCreateViewManager");
            throw null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void La(boolean z) {
        Iterator it = ORZ.LLIIIZ(A3(), v3()).iterator();
        while (it.hasNext()) {
            ((LML) it.next()).LIZJ();
        }
        TopTabAbility LJJLIIIJL = C78847Ux1.LJJLIIIJL(C55096Ljo.LJIIZILJ(this));
        if (LJJLIIIJL != null) {
            LJJLIIIJL.Cg0(false, z);
        }
    }

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == 1) {
            x3().LIZJ(event.LJLIL);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int LJIILL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        LM8 homepageToolBar = LNZ.LIZIZ.getHomepageToolBar();
        View findViewById = getContainerView().findViewById(R.id.j5x);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…_container,\n            )");
        LM3 LIZLLL = homepageToolBar.LIZLLL((FrameLayout) findViewById);
        this.LJLJL = LIZLLL;
        if (LIZLLL != null) {
            LIZLLL.LJIILIIL(x3());
            C68252m5.LIZ(this, new LMV(this, null));
            Context context = getContext();
            if (context != null) {
                LJIILL = C63081OpJ.LJJJJLI(context);
            } else {
                LJIILL = C17N.LJIILL(99);
            }
            ViewGroup.LayoutParams layoutParams = E3().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = LJIILL;
            E3().setLayoutParams(layoutParams2);
            E3().setVisibility(0);
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ == null) {
                return;
            }
            C54258LRe LIZ2 = LRD.LIZ(LIZ);
            LIZ2.LJIIIIZZ("swipe_up_guide", new LMY(this));
            LIZ2.LJIIIIZZ("not_interested_tutorial", new LMZ(this));
            this.LJLIL = LIZ2;
            return;
        }
        o.LJIJI("toolBarCreateViewManager");
        throw null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void Hq(int i, String tag) {
        o.LJIIIZ(tag, "tag");
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            lmw.LIZIZ(i, tag, true);
        } else {
            o.LJIJI("toolBarCreateViewManager");
            throw null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void S3(int i, String tag) {
        o.LJIIIZ(tag, "tag");
        LMW lmw = this.LJLJL;
        if (lmw != null) {
            lmw.LIZIZ(i, tag, false);
        } else {
            o.LJIJI("toolBarCreateViewManager");
            throw null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void Un0(long j, boolean z) {
        float f;
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(C3(), "alpha", f, f2);
        ofFloat.setDuration(j);
        ofFloat.addListener(new IDAListenerS4S0110000_9(this, z, 1));
        ofFloat.start();
    }
}
