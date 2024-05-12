package X;

import Y.ARunnableS45S0100000_9;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.experiment.Entrance;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import defpackage.e1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import o3.IDaS91S0000000_9;
import o3.h0;

/* loaded from: classes10.dex */
public final class LEC {
    public static void LIZJ() {
        int i;
        int i2;
        Entrance LJFF = C53765L8f.LJFF();
        int i3 = 1;
        if (LJFF != null) {
            i = LJFF.showLimit;
        } else {
            i = 1;
        }
        if (!C40471FuV.LIZ() || i <= 0) {
            i = 1;
        }
        Entrance LIZJ = C53765L8f.LIZJ();
        if (LIZJ != null) {
            i2 = LIZJ.showLimit;
        } else {
            i2 = 1;
        }
        if (C40471FuV.LIZ() && i2 > 0) {
            i3 = i2;
        }
        LEB.LJ = i;
        LEB.LIZLLL = i3;
    }

    public static int LIZIZ(HomeTabViewModel viewModel, ActivityC45651qj activity) {
        float f;
        List<TopTabProtocol> list;
        float LJIIZILJ;
        List<TopTabProtocol> L2;
        float f2;
        float f3;
        float LIZJ;
        List<TopTabProtocol> L22;
        float f4;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(activity, "activity");
        HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), HomeTabAbility.class, null);
        float f5 = 0.0f;
        if (homeTabAbility != null && (L22 = homeTabAbility.L2()) != null) {
            Iterator<TopTabProtocol> it = L22.iterator();
            f = 0.0f;
            while (it.hasNext()) {
                InterfaceC53908LDs interfaceC53908LDs = it.next().LJFF().LIZ;
                if (interfaceC53908LDs != null) {
                    f4 = interfaceC53908LDs.getTextWidth();
                } else {
                    f4 = 0.0f;
                }
                f += f4;
            }
        } else {
            f = 0.0f;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activity);
        int i = 2;
        if ((C52309Kfx.LIZ() || C40471FuV.LIZ()) && LJJIFFI != null) {
            if (C52192Ke4.LIZ) {
                TuxTextView tuxTextView = new TuxTextView(LJJIFFI, null, 6, 0);
                tuxTextView.setTuxFont(32);
                HomeTabAbility homeTabAbility2 = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), HomeTabAbility.class, null);
                if (homeTabAbility2 != null && (L2 = homeTabAbility2.L2()) != null) {
                    int size = L2.size() - 1;
                    int LJJJJL = (C63081OpJ.LJJJJL(LJJIFFI) - LEB.LIZJ()) - LEB.LIZLLL();
                    tuxTextView.setTextSize(17.0f);
                    tuxTextView.LJJIZ(17.0f, 22, C2059886o.LIZ(), 0.02f);
                    Iterator<TopTabProtocol> it2 = L2.iterator();
                    float f6 = 0.0f;
                    while (it2.hasNext()) {
                        f6 += tuxTextView.getPaint().measureText(it2.next().w0(LJJIFFI));
                    }
                    if (C53302Kvy.LIZ()) {
                        f2 = (size * 16.0f) + 16.0f;
                    } else {
                        f2 = size * 16.0f;
                    }
                    Float valueOf = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(f2)) + f6);
                    float f7 = LJJJJL;
                    if (valueOf.floatValue() <= f7) {
                        valueOf.floatValue();
                    } else {
                        tuxTextView.setTuxFont(102);
                        tuxTextView.setTextSize(16.0f);
                        Iterator<TopTabProtocol> it3 = L2.iterator();
                        while (it3.hasNext()) {
                            f5 += tuxTextView.getPaint().measureText(it3.next().w0(LJJIFFI));
                        }
                        if (C53302Kvy.LIZ()) {
                            f3 = (size * 12.0f) + 12.0f;
                        } else {
                            f3 = size * 12.0f;
                        }
                        Float valueOf2 = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(f3)) + f5);
                        if (valueOf2.floatValue() <= f7) {
                            valueOf2.floatValue();
                            return 16;
                        }
                        return 15;
                    }
                }
                return 17;
            }
            TuxTextView tuxTextView2 = new TuxTextView(LJJIFFI, null, 6, 0);
            tuxTextView2.setTuxFont(32);
            tuxTextView2.setTextSize(17.0f);
            HomeTabAbility homeTabAbility3 = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), HomeTabAbility.class, null);
            if (homeTabAbility3 == null || (list = homeTabAbility3.L2()) == null) {
                list = C61878OQg.INSTANCE;
            }
            int LJIIJJI = KL2.LJIIJJI(LJJIFFI);
            Iterator<TopTabProtocol> it4 = list.iterator();
            while (it4.hasNext()) {
                f5 += tuxTextView2.getPaint().measureText(it4.next().w0(LJJIFFI));
            }
            if (C53302Kvy.LIZ()) {
                LJIIZILJ = C32151Nz.LJIIZILJ(8) * list.size();
            } else {
                LJIIZILJ = C32151Nz.LJIIZILJ(8);
                i = list.size();
            }
            if ((LJIIZILJ * i) + f5 >= (LJIIJJI - LEB.LIZJ()) - LEB.LIZLLL()) {
                return 15;
            }
            return 17;
        }
        if (!SearchServiceImpl.LLLZI().LJJJI()) {
            if (e1.LIZ(31744, "i18n_following_badge_type_number", true, false)) {
                LIZJ = KL2.LIZJ(activity, 33.0f);
            } else {
                LIZJ = KL2.LIZJ(activity, 16.0f);
            }
        } else if (C51645KOr.LIZIZ.LJIIIZ()) {
            if (e1.LIZ(31744, "i18n_following_badge_type_number", true, false)) {
                LIZJ = KL2.LIZJ(activity, 105.0f);
            } else {
                LIZJ = KL2.LIZJ(activity, 80.0f);
            }
        } else if (ECommerceMallService.v3().Q1()) {
            if (e1.LIZ(31744, "i18n_following_badge_type_number", true, false)) {
                LIZJ = KL2.LIZJ(activity, 105.0f);
            } else {
                LIZJ = KL2.LIZJ(activity, 80.0f);
            }
        } else if (e1.LIZ(31744, "i18n_following_badge_type_number", true, false)) {
            LIZJ = KL2.LIZJ(activity, 82.0f);
        } else {
            LIZJ = KL2.LIZJ(activity, 57.0f);
        }
        float f8 = f + LIZJ;
        int LJIIJJI2 = KL2.LJIIJJI(activity);
        float LIZIZ = LEB.LIZIZ(activity, true);
        float LIZIZ2 = LEB.LIZIZ(activity, false);
        float f9 = LJIIJJI2;
        float f10 = 2;
        if (f8 <= f9 - (LIZIZ * f10)) {
            LEB.LJFF = true;
        } else if (f8 <= f9 - (LIZIZ2 * f10)) {
            LEB.LJFF = false;
        } else {
            if (f8 < f9 - KL2.LIZJ(activity, 72.0f)) {
                LEB.LJFF = false;
            } else {
                LEB.LJFF = false;
            }
            return 15;
        }
        return 17;
    }

    public static void LIZ(LOS host, InterfaceC54080LKi iTabButton, HomeTabViewModel viewModel) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(iTabButton, "iTabButton");
        o.LJIIIZ(viewModel, "viewModel");
        C8RO c8ro = MainTabStrip.LLD;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addTabToHost, ");
        LIZ.append(iTabButton.tag());
        c8ro.LIZLLL(X1D.LIZIZ(LIZ));
        View LJFF = iTabButton.LJFF(LED.LIZ);
        o.LJI(LJFF);
        LJFF.setContentDescription(iTabButton.LIZ());
        h0.LJIJI(LJFF, new IDaS91S0000000_9(1));
        LOP LJIILJJIL = host.LJIILJJIL(LJFF, iTabButton.tag());
        int size = host.LJLIL.size();
        if (LJIILJJIL.LIZJ == host) {
            LJIILJJIL.LIZ = size;
            ListProtector.add(host.LJLIL, size, LJIILJJIL);
            int size2 = host.LJLIL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((LOP) ListProtector.get(host.LJLIL, size)).LIZ = size;
                }
            }
            if (!C52308Kfw.LIZ() || !C52192Ke4.LIZ) {
                host.LIZLLL(LJIILJJIL);
            }
            LOX lox = LJIILJJIL.LIZLLL;
            LOU lou = host.LJLJI;
            int i = LJIILJJIL.LIZ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            host.LJIL(layoutParams);
            lou.addView(lox, i, layoutParams);
            host.LJLJI.post(new ARunnableS45S0100000_9((Object) host, 254));
            if (e1.LIZ(31744, "main_tab_accessibility_label_enable", true, false) && lox != null) {
                h0.LJIJI(lox, new LOY(lox, LJIILJJIL.LIZ));
            }
            String tabName = iTabButton.tag();
            o.LJIIIZ(tabName, "tabName");
            viewModel.LJLILLLLZI.put(tabName, iTabButton);
            Iterator<Map.Entry<InterfaceC54080LKi, View>> it = viewModel.LJLJI.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC54080LKi key = it.next().getKey();
                if (key != null && o.LJ(iTabButton.tag(), key.tag())) {
                    it.remove();
                    break;
                }
            }
            viewModel.LJLJI.put(iTabButton, LJFF);
            return;
        }
        "Tab belongs to a different TabLayout.".toString();
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }
}
