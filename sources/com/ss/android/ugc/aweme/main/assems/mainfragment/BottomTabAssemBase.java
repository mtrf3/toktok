package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC53892LDc;
import X.AbstractC53895LDf;
import X.AbstractC55918Lx4;
import X.ActivityC45651qj;
import X.C1B3;
import X.C1B6;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C54198LOw;
import X.C55096Ljo;
import X.C55949LxZ;
import X.C57568Mia;
import X.C62822Ol8;
import X.C78866UxK;
import X.C87277YNd;
import X.C8W0;
import X.InterfaceC54080LKi;
import X.InterfaceC55102Lju;
import X.L9M;
import X.LDY;
import X.LLA;
import X.LLB;
import X.LLC;
import X.LLQ;
import X.OSZ;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BottomTabAssemBase extends C8W0 implements L9M, BottomTabAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(LLB.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 284));

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 154805478) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void CE() {
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJJII();
        }
    }

    @Override // X.C8W0
    public final void onCreate() {
        HomeTabAbility LJIL;
        super.onCreate();
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
            LJIL.ev(this);
        }
    }

    @Override // X.C8W0
    public final void onDestroy() {
        HomeTabAbility LJIL;
        super.onDestroy();
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
            LJIL.yL(this);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public final LLQ v3() {
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ)) == null || (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) == null) {
            return null;
        }
        return LJIL.OH(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void LLIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJ(0, tag);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void LLJ(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJIILL(tag);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void LLZLLIL(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJJIJIIJIL(tag);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void Q6(LDY observer) {
        Object obj;
        o.LJIIIZ(observer, "observer");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        Iterator it = ((List) this.LJLIL.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((LLA) obj).LJLIL, observer)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LLA lla = (LLA) obj;
        if (lla != null) {
            AbstractC53895LDf rv0 = Hox.LJLLI.LIZ(LIZ).rv0("page_feed");
            o.LJII(rv0, "null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
            ((AbstractC53892LDc) rv0).LJIL(lla);
            ((List) this.LJLIL.getValue()).remove(lla);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void b3(LDY observer) {
        o.LJIIIZ(observer, "observer");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        AbstractC53895LDf rv0 = Hox.LJLLI.LIZ(LIZ).rv0("page_feed");
        o.LJII(rv0, "null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
        LLA lla = new LLA((C54198LOw) observer);
        ((List) this.LJLIL.getValue()).add(lla);
        ((AbstractC53892LDc) rv0).LJIIZILJ(lla);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void lt(C55949LxZ c55949LxZ) {
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJJIIZ(c55949LxZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void z20(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJJIII(tag);
        }
    }

    @Override // X.L9M
    public final void G(List<? extends InterfaceC54080LKi> list, List<? extends InterfaceC54080LKi> list2) {
        MainActivityScope LJJLIIIJJIZ;
        HomeTabAbility LJIL;
        LLQ OH;
        AbstractC53895LDf abstractC53895LDf;
        AbstractC53895LDf abstractC53895LDf2;
        ArrayList<LLC> arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = (ArrayList) list2;
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((ArrayList) list).contains(next)) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!arrayList4.contains(next2)) {
                arrayList3.add(next2);
            }
        }
        OSZ osz = new OSZ(arrayList2, arrayList3);
        List<Object> list3 = (List) osz.getFirst();
        List<Object> list4 = (List) osz.getSecond();
        TabChangeManager tabChangeManager = (TabChangeManager) this.LJLILLLLZI.getValue();
        for (Object obj : list4) {
            if ((obj instanceof AbstractC53895LDf) && (abstractC53895LDf2 = (AbstractC53895LDf) obj) != null) {
                Class<? extends Fragment> LJIIJ = abstractC53895LDf2.LJIIJ();
                FragmentTabHost fragmentTabHost = tabChangeManager.LJLIL;
                if (fragmentTabHost != null && (arrayList = fragmentTabHost.LJLILLLLZI) != null && !arrayList.isEmpty()) {
                    Iterator<LLC> it3 = fragmentTabHost.LJLILLLLZI.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        LLC next3 = it3.next();
                        if (next3 != null && next3.LIZIZ == LJIIJ) {
                            if (next3.LIZLLL != null) {
                                FragmentManager fragmentManager = fragmentTabHost.LJLJJL;
                                C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
                                LIZ.LJJI(next3.LIZLLL);
                                LIZ.LJI();
                                fragmentTabHost.LJLJJL.LJJIL();
                                next3.LIZLLL = null;
                            }
                        }
                    }
                }
            }
        }
        for (Object obj2 : list3) {
            if ((obj2 instanceof AbstractC53895LDf) && (abstractC53895LDf = (AbstractC53895LDf) obj2) != null) {
                tabChangeManager.gv0(abstractC53895LDf.LJIIIZ(), abstractC53895LDf.tag(), abstractC53895LDf.LJIIJ());
            }
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ)) != null && (OH = LJIL.OH(LIZ2)) != null) {
            OH.LJJJ(list2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void S3(int i, String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJ(i, tag);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void eu(String tag, C57568Mia c57568Mia) {
        o.LJIIIZ(tag, "tag");
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJJIJLIJ(tag, c57568Mia);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void NS(String tag, Drawable drawable, AbstractC55918Lx4 abstractC55918Lx4, FrameLayout.LayoutParams layoutParams, ImageView.ScaleType scaleType) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(drawable, "drawable");
        LLQ v3 = v3();
        if (v3 != null) {
            v3.LJJIIZI(tag, drawable, abstractC55918Lx4, layoutParams, scaleType);
        }
    }
}
