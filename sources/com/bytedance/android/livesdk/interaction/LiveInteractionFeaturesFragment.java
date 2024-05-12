package com.bytedance.android.livesdk.interaction;

import X.ActivityC45651qj;
import X.BGJ;
import X.BV1;
import X.BW1;
import X.BWA;
import X.BWU;
import X.BWZ;
import X.BYI;
import X.BZI;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DH;
import X.C1KJ;
import X.C1XG;
import X.C221108m2;
import X.C28787BRn;
import X.C28861BUj;
import X.C28898BVu;
import X.C29306Beo;
import X.C29S;
import X.C30627C0h;
import X.C3C5;
import X.C51029K0z;
import X.C62822Ol8;
import X.C76800UCe;
import X.C80133Vcf;
import X.C90903hW;
import X.CN1;
import X.InterfaceC08080Tk;
import X.InterfaceC28903BVz;
import X.OSZ;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.QAQuickEntranceSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveInteractionFeaturesFragment extends Fragment {
    public C80133Vcf LJLIL;
    public ViewGroup LJLILLLLZI;
    public ViewGroup LJLJI;
    public ViewGroup LJLJJI;
    public ViewGroup LJLJJL;
    public ViewGroup LJLJJLL;
    public ViewGroup LJLJL;
    public ViewGroup LJLJLJ;
    public ViewGroup LJLJLLL;
    public DataChannel LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public String LJLLILLLL = "";
    public boolean LJLLJ = true;
    public final List<OSZ<InterfaceC28903BVz, View>> LJLLL = new ArrayList();
    public final List<OSZ<InterfaceC28903BVz, View>> LJLLLL = new ArrayList();
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 222));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 223));

    public final void vl() {
        if (BV1.LJ(this.LJLL) || !QAQuickEntranceSetting.INSTANCE.enable() || !BV1.LJIIIZ(this.LJLL)) {
            if (BV1.LJ(this.LJLL)) {
                if (!BV1.LIZLLL(this.LJLL) && !BV1.LJIIIIZZ(this.LJLL) && !BV1.LJII(this.LJLL)) {
                    return;
                }
            } else {
                return;
            }
        }
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            xl(new C28861BUj(), viewGroup);
        }
    }

    public final void wl() {
        ViewGroup viewGroup;
        if (BV1.LJ(this.LJLL) || C1DH.LJJIIJ(this.LJLL)) {
            if ((!BV1.LJ(this.LJLL) || BV1.LIZLLL(this.LJLL)) && (viewGroup = this.LJLJLJ) != null) {
                xl(new C28898BVu(), viewGroup);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<OSZ<InterfaceC28903BVz, View>> it = this.LJLLL.iterator();
        while (it.hasNext()) {
            it.next().getFirst().LIZJ(this.LJLL);
        }
        ((ArrayList) this.LJLLL).clear();
        ((ArrayList) this.LJLLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLLI = arguments.getBoolean("collapsable", false);
            String string = arguments.getString("entrance", "");
            o.LJIIIIZZ(string, "it.getString(\"entrance\", \"\")");
            this.LJLLILLLL = string;
        }
        this.LJLL = C51029K0z.LJIILIIL(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        String str;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        ViewGroup viewGroup6;
        DataChannel dataChannel;
        Room room;
        RoomAuthStatus roomAuthStatus;
        Room room2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.content_container)");
        this.LJLIL = (C80133Vcf) findViewById;
        this.LJLILLLLZI = (ViewGroup) view.findViewById(R.id.c25);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.ikz);
        this.LJLJJI = (ViewGroup) view.findViewById(R.id.ch6);
        this.LJLJJL = (ViewGroup) view.findViewById(R.id.fqs);
        this.LJLJJLL = (ViewGroup) view.findViewById(R.id.lkg);
        this.LJLJL = (ViewGroup) view.findViewById(R.id.dxu);
        this.LJLJLJ = (ViewGroup) view.findViewById(R.id.ijx);
        this.LJLJLLL = (ViewGroup) view.findViewById(R.id.fdj);
        C30627C0h c30627C0h = C30627C0h.LJLIL;
        DataChannel dataChannel2 = this.LJLL;
        if (dataChannel2 != null && (room2 = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        if (c30627C0h.LIZ(j) && (viewGroup = this.LJLILLLLZI) != null) {
            xl(new BWA(), viewGroup);
        }
        if ((LivePollSetting.INSTANCE.enable(this.LJLL) || ((dataChannel = this.LJLL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.enableGiftPoll == 1)) && (viewGroup2 = this.LJLJI) != null) {
            xl(new BW1(), viewGroup2);
        }
        InterfaceC08080Tk liveGameEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
        DataChannel dataChannel3 = this.LJLL;
        liveGameEffectHelper.getClass();
        LiveEffect LIZIZ = C1XG.LIZIZ(dataChannel3);
        if (LIZIZ != null && C1KJ.LIZ.LIZ(LIZIZ) && (viewGroup6 = this.LJLJJI) != null) {
            xl(new BGJ(), viewGroup6);
        }
        if (BV1.LJ(this.LJLL)) {
            if (BV1.LIZLLL(this.LJLL)) {
                vl();
                wl();
            } else if (BV1.LJIIIIZZ(this.LJLL)) {
                vl();
                ViewGroup viewGroup7 = this.LJLJLJ;
                if (viewGroup7 != null) {
                    xl(new C28898BVu(), viewGroup7);
                }
            } else if (BV1.LJI(this.LJLL)) {
                ViewGroup viewGroup8 = this.LJLJLJ;
                if (viewGroup8 != null) {
                    xl(new C28898BVu(), viewGroup8);
                }
            } else if (BV1.LJII(this.LJLL)) {
                vl();
            }
        } else {
            vl();
            wl();
        }
        if (((IGiftService) CN1.LIZ(IGiftService.class)).enableRedEnvelope() && (viewGroup5 = this.LJLJJLL) != null) {
            xl(((IGiftService) CN1.LIZ(IGiftService.class)).provideInteractionView(this), viewGroup5);
        }
        if (((IGoodyBagService) CN1.LIZ(IGoodyBagService.class)).V60(this.LJLL) && (viewGroup4 = this.LJLJL) != null) {
            xl(((IGoodyBagService) CN1.LIZ(IGoodyBagService.class)).eQ(), viewGroup4);
        }
        if (!BYI.LIZIZ(BWZ.PAID_LIVE_EVENT) && !BYI.LIZIZ(BWZ.SUB_ONLY) && !BYI.LIZIZ(BWZ.COMMERCE) && LiveKaraokeSetting.INSTANCE.enable() && (viewGroup3 = this.LJLJLLL) != null) {
            xl(new BWU(), viewGroup3);
        }
        if (!this.LJLLI) {
            Iterator it = ((ArrayList) this.LJLLL).iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                InterfaceC28903BVz interfaceC28903BVz = (InterfaceC28903BVz) osz.getFirst();
                View view2 = (View) osz.getSecond();
                interfaceC28903BVz.onShow();
                C29306Beo.LJJLJLI(view2);
            }
        } else if (((ArrayList) this.LJLLL).size() <= 8) {
            Iterator it2 = ((ArrayList) this.LJLLL).iterator();
            while (it2.hasNext()) {
                OSZ osz2 = (OSZ) it2.next();
                InterfaceC28903BVz interfaceC28903BVz2 = (InterfaceC28903BVz) osz2.getFirst();
                View view3 = (View) osz2.getSecond();
                interfaceC28903BVz2.onShow();
                C29306Beo.LJJLJLI(view3);
            }
        } else {
            C80133Vcf c80133Vcf = this.LJLIL;
            if (c80133Vcf != null) {
                c80133Vcf.addView((View) this.LJLLLLLL.getValue(), 3, (ViewGroup.LayoutParams) this.LJLZ.getValue());
                ((ArrayList) this.LJLLLL).clear();
                List<OSZ<InterfaceC28903BVz, View>> list = this.LJLLLL;
                ArrayList arrayList = (ArrayList) this.LJLLL;
                ((ArrayList) list).addAll(arrayList.subList(3, arrayList.size()));
                for (OSZ osz3 : ((ArrayList) this.LJLLL).subList(0, 3)) {
                    InterfaceC28903BVz interfaceC28903BVz3 = (InterfaceC28903BVz) osz3.getFirst();
                    View view4 = (View) osz3.getSecond();
                    interfaceC28903BVz3.onShow();
                    C29306Beo.LJJLJLI(view4);
                }
            } else {
                o.LJIJI("contentContainer");
                throw null;
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_interaction_panel_show");
        LIZ.LJIILLIIL(this.LJLL);
        LIZ.LJIJJ(this.LJLLILLLL, "entrance");
        if (o.LJ(this.LJLLILLLL, "more_top")) {
            if (((ArrayList) this.LJLLL).size() > 8) {
                str = "fold";
            } else {
                str = "unfold";
            }
            LIZ.LJIJJ(str, "status");
        }
        LIZ.LJJIIJZLJL();
    }

    public final void xl(InterfaceC28903BVz interfaceC28903BVz, View view) {
        if (interfaceC28903BVz == null) {
            return;
        }
        C80133Vcf c80133Vcf = this.LJLIL;
        if (c80133Vcf != null) {
            if (c80133Vcf.indexOfChild(view) == -1) {
                return;
            }
            LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.e_q);
            TextView textView = (TextView) view.findViewById(R.id.text);
            liveIconView.setIconAttr(interfaceC28903BVz.LJ());
            textView.setText(interfaceC28903BVz.LIZLLL());
            interfaceC28903BVz.LIZIZ(view, this.LJLL);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(interfaceC28903BVz, 187), view);
            view.setLayoutParams((ViewGroup.LayoutParams) this.LJLZ.getValue());
            List<OSZ<InterfaceC28903BVz, View>> list = this.LJLLL;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                OSZ osz = (OSZ) next;
                C80133Vcf c80133Vcf2 = this.LJLIL;
                if (c80133Vcf2 != null) {
                    int indexOfChild = c80133Vcf2.indexOfChild((View) osz.getSecond());
                    C80133Vcf c80133Vcf3 = this.LJLIL;
                    if (c80133Vcf3 != null) {
                        if (indexOfChild < c80133Vcf3.indexOfChild(view)) {
                            arrayList.add(next);
                        }
                    } else {
                        o.LJIJI("contentContainer");
                        throw null;
                    }
                } else {
                    o.LJIJI("contentContainer");
                    throw null;
                }
            }
            ListProtector.add(this.LJLLL, Math.min(arrayList.size(), ((ArrayList) this.LJLLL).size()), new OSZ(interfaceC28903BVz, view));
            return;
        }
        o.LJIJI("contentContainer");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        if (this.LJLLI) {
            i = R.layout.d4g;
        } else {
            i = R.layout.d4f;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
