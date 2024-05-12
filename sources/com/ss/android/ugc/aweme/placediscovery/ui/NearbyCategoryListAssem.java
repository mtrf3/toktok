package com.ss.android.ugc.aweme.placediscovery.ui;

import X.ActivityC45651qj;
import X.C0A2;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C45804HyK;
import X.C47704Ins;
import X.C54589Lbd;
import X.C54640LcS;
import X.C54641LcT;
import X.C54652Lce;
import X.C54661Lcn;
import X.C55096Ljo;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.InterfaceC57784Mm4;
import X.LJ5;
import X.LXZ;
import X.SYL;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyCategoryListAssem extends UIContentAssem implements ICategoryListAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final Map<String, HashSet<String>> LJLJJI;
    public final Rect LJLJJL;
    public final C214298b3 LJLJJLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1878454082) {
            return null;
        }
        return this;
    }

    public NearbyCategoryListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 481));
        this.LJLILLLLZI = C221108m2.LIZIZ(C54641LcT.LJLIL);
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C54589Lbd.class, "NearbyCategoryHierarchyData"), checkSupervisorPrepared());
        this.LJLJJI = new LinkedHashMap();
        this.LJLJJL = new Rect();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyCategoryTabViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 482), C54640LcS.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.ICategoryListAbility
    public final void Cc0() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.ss.android.ugc.aweme.api.NearbyBaseVAbility
    public final void ia() {
        v3().setVisibility(8);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.api.NearbyBaseVAbility
    public final void v20() {
        v3().setVisibility(0);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        view.getContext();
        v3.setLayoutManager(new LinearLayoutManager(0, false));
        LXZ.LIZ.getClass();
        if (LXZ.LIZ() == 1) {
            v3().LLLF.LJZL(NearbyCategoryItemCellV1.class);
        } else if (LXZ.LIZ() == 2) {
            v3().LLLF.LJZL(NearbyCategoryItemCellV2.class);
        }
        if (LXZ.LIZ() == 1) {
            i = 3;
        } else {
            i = 4;
        }
        v3().LJII(new C54661Lcn(this, C7MY.LIZIZ(i)), -1);
        v3().getState().LJ(((C54589Lbd) this.LJLJI.getValue()).LJLIL);
        v20();
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.ICategoryListAbility
    public final void y0(List<PoiCategory> categorys) {
        o.LJIIIZ(categorys, "categorys");
        if (categorys.isEmpty()) {
            ia();
            return;
        }
        v20();
        v3().getState().LJFF();
        v3().getState().LJ(categorys);
        v3().postDelayed(new ARunnableS45S0100000_9(this, 87), 100L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.placediscovery.ui.ICategoryListAbility
    public final void mc0(String str, String str2) {
        Boolean bool;
        RoamingLocationInfo LIZIZ;
        String str3 = str2;
        String str4 = str;
        INearbyCategoryTabAbility iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INearbyCategoryTabAbility.class, null);
        if (iNearbyCategoryTabAbility != null) {
            bool = Boolean.valueOf(iNearbyCategoryTabAbility.Q5());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            return;
        }
        try {
            C0A2 layoutManager = v3().getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int LLILL = ((LinearLayoutManager) layoutManager).LLILL();
            C0A2 layoutManager2 = v3().getLayoutManager();
            o.LJII(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int LLILLJJLI = ((LinearLayoutManager) layoutManager2).LLILLJJLI();
            List<InterfaceC57784Mm4> listItems = v3().getListItems();
            Context context = getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null) {
                return;
            }
            if (str4 == null && ((LIZIZ = LJ5.LIZIZ(LJJIFFI)) == null || (str4 = LIZIZ.getManualRegion()) == null)) {
                return;
            }
            if (str3 == null) {
                RoamingLocationInfo LIZIZ2 = LJ5.LIZIZ(LJJIFFI);
                if (LIZIZ2 != null) {
                    str3 = LIZIZ2.getManualRegionName();
                } else {
                    str3 = null;
                }
            }
            Object obj = ((LinkedHashMap) this.LJLJJI).get(str4);
            if (obj == null) {
                obj = new HashSet();
            }
            if (LLILL <= LLILLJJLI) {
                while (true) {
                    if (LLILL >= 0) {
                        C0A2 layoutManager3 = v3().getLayoutManager();
                        o.LJII(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        View LJJIJIL = ((LinearLayoutManager) layoutManager3).LJJIJIL(LLILL);
                        if (LJJIJIL != null) {
                            Object obj2 = ListProtector.get(listItems, LLILL);
                            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.placediscovery.model.PoiCategory");
                            PoiCategory poiCategory = (PoiCategory) obj2;
                            LJJIJIL.getLocalVisibleRect(this.LJLJJL);
                            Rect rect = this.LJLJJL;
                            if (rect.left >= 0 && rect.right <= LJJIJIL.getWidth()) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(poiCategory.tabCode);
                                LIZ.append(str4);
                                if (!((HashSet) obj).contains(X1D.LIZIZ(LIZ))) {
                                    C54652Lce.LIZIZ(poiCategory.tabCode, ((NearbyCategoryTabViewModel) this.LJLJJLL.getValue()).LJLIL, LLILL, listItems.size(), str4, str3);
                                    String str5 = poiCategory.tabCode;
                                    if (str5 != null) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append(str5);
                                        LIZ2.append(str4);
                                        ((HashSet) obj).add(X1D.LIZIZ(LIZ2));
                                    }
                                }
                            }
                        }
                    }
                    if (LLILL == LLILLJJLI) {
                        break;
                    } else {
                        LLILL++;
                    }
                }
            }
            ((LinkedHashMap) this.LJLJJI).clear();
            this.LJLJJI.put(str4, obj);
        } catch (Exception unused) {
        }
    }
}
