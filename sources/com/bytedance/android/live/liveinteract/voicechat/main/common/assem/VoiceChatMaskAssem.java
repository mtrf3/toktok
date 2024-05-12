package com.bytedance.android.live.liveinteract.voicechat.main.common.assem;

import X.AbstractC75323ThH;
import X.C0NB;
import X.C16880lQ;
import X.C214528bQ;
import X.C221108m2;
import X.C278517l;
import X.C29044Baa;
import X.C2K0;
import X.C2L4;
import X.C32106Cis;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73994T2g;
import X.C74638TRa;
import X.C74824TYe;
import X.C75145TeP;
import X.C75317ThB;
import X.C75318ThC;
import X.C75324ThI;
import X.C75326ThK;
import X.C75335ThT;
import X.C75336ThU;
import X.C75344Thc;
import X.C75346The;
import X.C75348Thg;
import X.C76965UIn;
import X.C77117UOj;
import X.C78886Uxe;
import X.C78926UyI;
import X.C79004UzY;
import X.C8E;
import X.EnumC75338ThW;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC75179Tex;
import X.InterfaceC75441TjB;
import X.InterfaceC75973Trl;
import X.SYB;
import X.TRB;
import X.TV3;
import X.U8H;
import X.UC0;
import X.ViewOnClickListenerC75325ThJ;
import Y.ARunnableS24S0300000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class VoiceChatMaskAssem extends UISlotAssem implements VoiceChatMaskAbility, InterfaceC55102Lju, C2L4 {
    public DataChannel LJLL;
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, SYB.class, null), checkSupervisorPrepared());
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 158));
    public final C32106Cis LJLLILLLL = new C32106Cis();
    public final TRB LJLLJ = new TRB(this);
    public final C75317ThB LJLLL = new C75317ThB(this);
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C75335ThT.LJLIL);
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(C75336ThU.LJLIL);
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C75346The.LJLIL);

    public ILinkStateAbility L3() {
        return null;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1567676036) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility
    public final void D5() {
        C65776Prg LIZ = C65352Pkq.LIZ(LinkStatusViewModel.class);
        LinkStatusViewModel linkStatusViewModel = (LinkStatusViewModel) C73994T2g.LJJIIJ(new AqS154S0100000_4(LIZ, 1167), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C75348Thg.INSTANCE, LIZ);
        View containerView = getContainerView();
        if (containerView != null) {
            linkStatusViewModel.kv0(UC0.LJJIJL(containerView));
        }
    }

    public int K3() {
        return ColorProtector.parseColor("#151723");
    }

    public final Map<String, AbstractC75323ThH> M3() {
        return (Map) this.LJLLLL.getValue();
    }

    public final Map<String, C75324ThI> N3() {
        return (Map) this.LJLLLLLL.getValue();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(LinkMicScope.class);
    }

    public final ILinkStateAbility P3() {
        InterfaceC55235Lm3 LJJIL = UC0.LJJIL(getContainerView());
        if (LJJIL == null) {
            return null;
        }
        return (ILinkStateAbility) UC0.LJIIL(LJJIL, ILinkStateAbility.class, null);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility
    public final void k8() {
        InterfaceC55235Lm3 LJJIL;
        LinkStatusViewModel linkStatusViewModel;
        View containerView = getContainerView();
        if (containerView != null && (LJJIL = UC0.LJJIL(containerView)) != null) {
            C2K0 LJIIL = UC0.LJIIL(LJJIL, ILinkStateAbility.class, null);
            if ((LJIIL instanceof LinkStatusViewModel) && (linkStatusViewModel = (LinkStatusViewModel) LJIIL) != null) {
                linkStatusViewModel.lv0(LJJIL);
            }
        }
        for (Map.Entry<String, AbstractC75323ThH> entry : M3().entrySet()) {
            AbstractC75323ThH value = entry.getValue();
            MutableLiveData mutableLiveData = (MutableLiveData) entry.getValue().LJIIIIZZ.getValue();
            EnumC75338ThW enumC75338ThW = EnumC75338ThW.UNKNOWN;
            value.getClass();
            AbstractC75323ThH.LJIILJJIL(mutableLiveData, enumC75338ThW);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        C8E.LJ().zF(this.LJLLL);
        C8E.LJ().X3(this.LJLLJ);
        DataChannel dataChannel = this.LJLL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        Iterator<Map.Entry<String, AbstractC75323ThH>> it = M3().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().LJIILIIL();
        }
        this.LJLLILLLL.LIZ.clear();
    }

    @Override // X.C8W0
    public final void onPause() {
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        ILinkStateAbility P3;
        super.onPause();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            for (LinkUser linkUser : LJJIIZI) {
                Long userId = linkUser.getUserId();
                long LJIIIZ = C79004UzY.LJIIIZ();
                if (userId != null && userId.longValue() == LJIIIZ) {
                    if (linkUser != null && (P3 = P3()) != null) {
                        P3.Jv(2, null);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        ILinkStateAbility P3;
        super.onResume();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            for (LinkUser linkUser : LJJIIZI) {
                Long userId = linkUser.getUserId();
                long LJIIIZ = C79004UzY.LJIIIZ();
                if (userId != null && userId.longValue() == LJIIIZ) {
                    if (linkUser != null && (P3 = P3()) != null) {
                        P3.Jv(1, null);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H3(InterfaceC75179Tex interfaceC75179Tex) {
        AbstractC75323ThH I3;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        if (M3().containsKey(interfaceC75179Tex.LJJ())) {
            C75324ThI c75324ThI = N3().get(interfaceC75179Tex.LJJ());
            if (c75324ThI != null) {
                viewGroup = c75324ThI.LJLJLJ;
            } else {
                viewGroup = null;
            }
            if (viewGroup == interfaceC75179Tex.LJJIJIL()) {
                return;
            }
        }
        if (M3().get(interfaceC75179Tex.LJJ()) == null && (I3 = I3(interfaceC75179Tex.LJJ())) != null) {
            I3.LJIIL(L3());
            M3().put(I3.LIZIZ, I3);
        }
        if (!interfaceC75179Tex.LJLJI()) {
            AbstractC75323ThH abstractC75323ThH = M3().get(interfaceC75179Tex.LJJ());
            if (abstractC75323ThH != null) {
                C75324ThI c75324ThI2 = N3().get(interfaceC75179Tex.LJJ());
                if (c75324ThI2 != null) {
                    viewGroup2 = c75324ThI2.LJLJLJ;
                }
                if (viewGroup2 != interfaceC75179Tex.LJJIJIL()) {
                    C75324ThI c75324ThI3 = N3().get(abstractC75323ThH.LIZIZ);
                    if (c75324ThI3 == null) {
                        if (!((AbstractCollection) this.LJLZ.getValue()).isEmpty()) {
                            c75324ThI3 = (ViewOnClickListenerC75325ThJ) ((LinkedList) this.LJLZ.getValue()).pop();
                            if (c75324ThI3 == null) {
                                c75324ThI3 = new C75324ThI(getContext(), this);
                            }
                        } else {
                            c75324ThI3 = new C75324ThI(getContext(), this);
                        }
                    }
                    c75324ThI3.LJIIIZ();
                    c75324ThI3.LIZ(abstractC75323ThH, interfaceC75179Tex.LJJIJIL());
                    N3().put(abstractC75323ThH.LIZIZ, c75324ThI3);
                    return;
                }
                return;
            }
            return;
        }
        AbstractC75323ThH abstractC75323ThH2 = M3().get(interfaceC75179Tex.LJJ());
        if (abstractC75323ThH2 == null || ((ViewOnClickListenerC75325ThJ) this.LJLLI.getValue()).LJLJLJ == interfaceC75179Tex.LJJIJIL()) {
            return;
        }
        ((ViewOnClickListenerC75325ThJ) this.LJLLI.getValue()).LJIIIZ();
        ((ViewOnClickListenerC75325ThJ) this.LJLLI.getValue()).LIZ(abstractC75323ThH2, interfaceC75179Tex.LJJIJIL());
    }

    public AbstractC75323ThH I3(String str) {
        if (str == null) {
            return null;
        }
        return new C75318ThC(this.LJLL, str);
    }

    public final void O3(InterfaceC75179Tex interfaceC75179Tex) {
        long j;
        User owner;
        FollowInfo followInfo;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i = C75326ThK.LIZ[interfaceC75179Tex.LJJIL().ordinal()];
        Integer num = null;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                C0NB.LJIIIZ("bindMaskLinked", String.valueOf(interfaceC75179Tex.LJJIJIL().hashCode()));
                C0NB.LJIIIZ("bindMaskLinked", String.valueOf(M3().containsKey(interfaceC75179Tex.LJJ())));
                C75324ThI c75324ThI = N3().get(interfaceC75179Tex.LJJ());
                if (c75324ThI != null && (viewGroup2 = c75324ThI.LJLJLJ) != null) {
                    num = Integer.valueOf(viewGroup2.hashCode());
                }
                C0NB.LJIIIZ("bindMaskLinked", String.valueOf(num));
                H3(interfaceC75179Tex);
                AbstractC75323ThH abstractC75323ThH = M3().get(interfaceC75179Tex.LJJ());
                if (abstractC75323ThH != null) {
                    AbstractC75323ThH.LJIILJJIL((MutableLiveData) abstractC75323ThH.LJIIJ.getValue(), Boolean.TRUE);
                }
                C32106Cis c32106Cis = this.LJLLILLLL;
                int LJZ = interfaceC75179Tex.LJZ();
                String LJJ = interfaceC75179Tex.LJJ();
                c32106Cis.getClass();
                int LJJJJZ = C78886Uxe.LJJJJZ(C8E.LJ());
                if (LJJJJZ != 0 && LJJJJZ != 1) {
                    if (!o.LJ(LJJ, C78886Uxe.LJJJJLL(C8E.LJ()))) {
                        return;
                    }
                    c32106Cis.LIZ.remove(Integer.valueOf(LJZ));
                    return;
                }
                c32106Cis.LIZ.remove(Integer.valueOf(LJZ));
                return;
            }
            C0NB.LJIIIZ("bindMaskJoin", String.valueOf(interfaceC75179Tex.LJJIJIL().hashCode()));
            C0NB.LJIIIZ("bindMaskJoin", String.valueOf(M3().containsKey(interfaceC75179Tex.LJJ())));
            C75324ThI c75324ThI2 = N3().get(interfaceC75179Tex.LJJ());
            if (c75324ThI2 != null && (viewGroup = c75324ThI2.LJLJLJ) != null) {
                num = Integer.valueOf(viewGroup.hashCode());
            }
            C0NB.LJIIIZ("bindMaskJoin", String.valueOf(num));
            H3(interfaceC75179Tex);
            AbstractC75323ThH abstractC75323ThH2 = M3().get(interfaceC75179Tex.LJJ());
            if (abstractC75323ThH2 == null) {
                return;
            }
            AbstractC75323ThH.LJIILJJIL((MutableLiveData) abstractC75323ThH2.LJIIJ.getValue(), Boolean.FALSE);
            return;
        }
        DataChannel dataChannel = this.LJLL;
        ((LiveData) new C75344Thc(dataChannel).LIZ.getValue()).setValue(Integer.valueOf(interfaceC75179Tex.LJZ()));
        C75145TeP c75145TeP = new C75145TeP(interfaceC75179Tex, getContext(), this);
        FrameLayout parent = interfaceC75179Tex.LJJIJIL();
        o.LJIIIZ(parent, "parent");
        c75145TeP.LJ = dataChannel;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c75145TeP.LIZIZ), R.layout.dn6, null, false);
        C278517l.LIZIZ(-1, -1, LLLLIILL);
        ViewGroup viewGroup3 = (ViewGroup) LLLLIILL;
        TV3.LJIILIIL(-1, viewGroup3, parent);
        TV3.LJIILL(parent, new ARunnableS24S0300000_13(parent, viewGroup3, c75145TeP, 2));
        c75145TeP.LIZLLL = viewGroup3;
        C32106Cis c32106Cis2 = this.LJLLILLLL;
        int LJZ2 = interfaceC75179Tex.LJZ();
        c32106Cis2.getClass();
        int LJJJJZ2 = C78886Uxe.LJJJJZ(C8E.LJ());
        if ((LJJJJZ2 != 0 && LJJJJZ2 != 1) || c32106Cis2.LIZ.contains(Integer.valueOf(LJZ2))) {
            return;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j = followInfo.getFollowStatus();
        } else {
            j = 0;
        }
        C74824TYe.LJJJJI(j, "plus_button");
        c32106Cis2.LIZ.add(Integer.valueOf(LJZ2));
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility
    public final void jF(Map<String, Integer> map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            AbstractC75323ThH abstractC75323ThH = M3().get(entry.getKey());
            if (abstractC75323ThH != null) {
                AbstractC75323ThH.LJIILJJIL((MutableLiveData) abstractC75323ThH.LJIIIIZZ.getValue(), C77117UOj.LJJIII(((Number) entry.getValue()).intValue()));
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        U8H LJJZZI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof FrameLayout)) {
            return;
        }
        LinkMicScope.LIZ(new LinkMicScope(getContainerView()), this, VoiceChatMaskAbility.class);
        this.LJLL = ((SYB) this.LJLJLLL.getValue()).LJLIL;
        view.setBackgroundColor(K3());
        ((ViewGroup) view).setClipChildren(false);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.LJJLIIIIJ((ViewGroup) view, false, false);
        }
        DataChannel dataChannel = this.LJLL;
        if (dataChannel != null) {
            dataChannel.ov0(this, MultiGuestV3VideoSizeChannel.class, C74638TRa.LJLIL);
        }
        C8E.LJ().e3(this.LJLLJ);
        C8E.LJ().Aq(this.LJLLL);
    }
}
