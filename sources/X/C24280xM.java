package X;

import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0xM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24280xM {
    public final C80261Vej LIZ;
    public final ViewPager LIZIZ;
    public final ArrayList<C35691af> LIZJ = new ArrayList<>();

    public final void LIZ() {
        C80261Vej c80261Vej = this.LIZ;
        String LIVE_FILTER_PANEL_NAME = C0TY.LJFF;
        o.LJIIIIZZ(LIVE_FILTER_PANEL_NAME, "LIVE_FILTER_PANEL_NAME");
        C78856UxA LIZIZ = LIZIZ(new C35691af(LIVE_FILTER_PANEL_NAME, "livefilter"), C1KS.LIZJ());
        C78847Ux1.LJJLIIIJILLIZJL(LIZIZ);
        c80261Vej.addTab(LIZIZ);
    }

    public final void LIZJ(List<C1QC> effectPanelList) {
        boolean z;
        C78856UxA LIZIZ;
        o.LJIIIZ(effectPanelList, "effectPanelList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(effectPanelList, 10));
        for (C1QC c1qc : effectPanelList) {
            arrayList.add(new C35691af(c1qc.LJLIL, c1qc.LJLJI));
        }
        if (LiveBeautyReverseExperiment.INSTANCE.isInExperiment() || LiveEffectDowngradeSetting.INSTANCE.remove()) {
            this.LIZ.removeAllTabs();
            LIZ();
            return;
        }
        if (o.LJ(this.LIZJ, arrayList)) {
            return;
        }
        this.LIZ.removeAllTabs();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C35691af c35691af = (C35691af) next;
                if (i != 0) {
                    String category = c35691af.LJLILLLLZI;
                    o.LJIIIZ(category, "category");
                    if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && InterfaceC30442Bx8.z.LIZJ().contains(category) && !LiveEffectDowngradeSetting.INSTANCE.remove()) {
                        z = true;
                        C80261Vej c80261Vej = this.LIZ;
                        LIZIZ = LIZIZ(c35691af, z);
                        if (i != 0 && !BeautyPanelMemoryOptSetting.INSTANCE.enable()) {
                            C78847Ux1.LJJLIIIJ(LIZIZ);
                        } else {
                            C78847Ux1.LJJLIIIJILLIZJL(LIZIZ);
                        }
                        c80261Vej.addTab(LIZIZ);
                        i = i2;
                    }
                }
                z = false;
                C80261Vej c80261Vej2 = this.LIZ;
                LIZIZ = LIZIZ(c35691af, z);
                if (i != 0) {
                }
                C78847Ux1.LJJLIIIJILLIZJL(LIZIZ);
                c80261Vej2.addTab(LIZIZ);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LIZ();
        this.LIZJ.clear();
        this.LIZJ.addAll(arrayList);
    }

    public final C78856UxA LIZIZ(C35691af c35691af, boolean z) {
        View findViewById;
        C47121t6 c47121t6;
        TextView textView;
        C78856UxA newTab = this.LIZ.newTab();
        o.LJIIIIZZ(newTab, "tabView.newTab()");
        newTab.LIZJ(R.layout.d32);
        View view = newTab.LJFF;
        if (view != null && (textView = (TextView) view.findViewById(R.id.kyz)) != null) {
            textView.setText(c35691af.LJLIL);
        }
        View view2 = newTab.LJFF;
        if (view2 != null && (c47121t6 = (C47121t6) view2.findViewById(R.id.kyz)) != null) {
            c47121t6.setReduceFont(true);
        }
        View view3 = newTab.LJFF;
        if (view3 != null && (findViewById = view3.findViewById(R.id.kz4)) != null) {
            if (z) {
                C29306Beo.LJJLJLI(findViewById);
            } else {
                C29306Beo.LJI(findViewById);
            }
        }
        newTab.LIZ = c35691af;
        return newTab;
    }

    public C24280xM(C80261Vej c80261Vej, final C94433nD c94433nD, final DataChannel dataChannel) {
        this.LIZ = c80261Vej;
        this.LIZIZ = c94433nD;
        c80261Vej.addOnTabSelectedListener((LHW) new C4VB(c94433nD) { // from class: X.26V
            @Override // X.C4VB, X.InterfaceC54357LUz
            public final void LIZ(C78856UxA c78856UxA) {
                C78847Ux1.LJJLIIIJILLIZJL(c78856UxA);
            }

            @Override // X.C4VB, X.InterfaceC54357LUz
            public final void LIZIZ(C78856UxA tab) {
                C35701ag c35701ag;
                AbstractC24260xK abstractC24260xK;
                C35691af c35691af;
                C35691af c35691af2;
                o.LJIIIZ(tab, "tab");
                this.LJLIL.setCurrentItem(tab.LJ);
                C78847Ux1.LJJLIIIJ(tab);
                BZI LIZ = C28787BRn.LIZ("livesdk_pm_live_beauty_tab_change");
                LIZ.LJIIZILJ();
                Object obj = tab.LIZ;
                String str = null;
                if ((obj instanceof C35691af) && (c35691af2 = (C35691af) obj) != null) {
                    str = c35691af2.LJLILLLLZI;
                }
                LIZ.LJIJJ(str, "tab");
                LIZ.LJJIIJZLJL();
                Object obj2 = tab.LIZ;
                if ((obj2 instanceof C35691af) && (c35691af = (C35691af) obj2) != null) {
                    DataChannel dataChannel2 = dataChannel;
                    String category = c35691af.LJLILLLLZI;
                    o.LJIIIZ(category, "category");
                    InterfaceC30442Bx8.z.LIZJ().remove(category);
                    if (dataChannel2 != null) {
                        dataChannel2.pv0(EffectRedDotStatusChangeEvent.class);
                    }
                }
                PagerAdapter adapter = C24280xM.this.LIZIZ.getAdapter();
                if ((adapter instanceof C35701ag) && (c35701ag = (C35701ag) adapter) != null && (abstractC24260xK = c35701ag.LJLLILLLL) != null) {
                    abstractC24260xK.LIZ();
                }
            }
        });
        c94433nD.addOnPageChangeListener(new C111134Xt(c80261Vej));
    }
}
