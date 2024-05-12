package X;

import Y.AfS62S0200000_13;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFeedUserListRetryTimesSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Tty, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76110Tty implements InterfaceC76125TuD {
    public final CopyOnWriteArrayList<AbstractC75784Toi> LJLIL;
    public final ConcurrentHashMap<String, Boolean> LJLILLLLZI;
    public final ConcurrentHashMap<String, Integer> LJLJI;
    public final ConcurrentHashMap<String, Integer> LJLJJI;
    public InterfaceC75579TlP LJLJJL;
    public C75794Tos LJLJJLL;
    public InterfaceC32199CkN LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public String LJLL;
    public int LJLLI;
    public long LJLLILLLL;
    public FrameLayout LJLLJ;
    public C76301Tx3 LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public final C62822Ol8 LJZI;
    public final ConcurrentHashMap<String, C75989Ts1> LJZL;
    public OSZ<Integer, Integer> LL;
    public final C76111Ttz LLD;
    public final C76308TxA LLF;
    public final List<Integer> LLFF;
    public final long LLFFF;
    public boolean LLFII;

    public final long LIZ() {
        Long l;
        C75794Tos c75794Tos = this.LJLJJLL;
        if (c75794Tos != null && (l = c75794Tos.LIZ) != null) {
            long longValue = l.longValue();
            if (longValue > 0) {
                return longValue + this.LLFFF;
            }
            return longValue;
        }
        return 0L;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
        InterfaceC76112Tu0 layoutChangedListener;
        C0NB.LJIIIZ("MultiHostFeedHandler", "onLayoutSwitched");
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJJIIZ();
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
        InterfaceC76112Tu0 layoutChangedListener;
        C0NB.LJIIIZ("MultiHostFeedHandler", "onWindowRefreshFinished");
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJJLIIIJILLIZJL();
        }
    }

    @Override // X.InterfaceC76125TuD
    public final void release() {
        C0NB.LJIIIZ("MultiHostFeedHandler", "release");
        InterfaceC32199CkN interfaceC32199CkN = this.LJLJL;
        if (interfaceC32199CkN != null) {
            interfaceC32199CkN.LIZIZ(this.LLFF, this.LLF);
        }
        ((C73318Sq2) this.LJZI.getValue()).LIZLLL();
        this.LJZL.clear();
        B5G.LIZJ(LIZ(), "feed_release");
        this.LJLJL = null;
        this.LJLJJLL = null;
        InterfaceC75579TlP interfaceC75579TlP = this.LJLJJL;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.A9(true);
        }
        this.LJLJJL = null;
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null) {
            C29306Beo.LJJIJIIJIL(c76301Tx3);
        }
        C76301Tx3 c76301Tx32 = this.LJLLL;
        if (c76301Tx32 != null) {
            c76301Tx32.LIZIZ();
        }
        this.LJLLL = null;
        Iterator<AbstractC75784Toi> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
        this.LJLIL.clear();
        this.LJLILLLLZI.clear();
        this.LJLJI.clear();
        this.LJLJJI.clear();
        View view = this.LJLZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJZ;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.LJLLLLLL;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = this.LJLLLL;
        if (view5 != null) {
            C29306Beo.LJJIJIIJIL(view5);
        }
        View view6 = this.LJLLLLLL;
        if (view6 != null) {
            C29306Beo.LJJIJIIJIL(view6);
        }
        View view7 = this.LJLZ;
        if (view7 != null) {
            C29306Beo.LJJIJIIJIL(view7);
        }
        View view8 = this.LJZ;
        if (view8 != null) {
            C29306Beo.LJJIJIIJIL(view8);
        }
    }

    public C76110Tty(int i) {
        CopyOnWriteArrayList<AbstractC75784Toi> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        new ConcurrentHashMap();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Integer> concurrentHashMap3 = new ConcurrentHashMap<>();
        this.LJLIL = copyOnWriteArrayList;
        this.LJLILLLLZI = concurrentHashMap;
        this.LJLJI = concurrentHashMap2;
        this.LJLJJI = concurrentHashMap3;
        this.LJLJJL = null;
        this.LJLLI = EnumC31946CgI.MULTI_ARCH.getType();
        this.LJZI = C221108m2.LIZIZ(C76114Tu2.LJLIL);
        this.LJZL = new ConcurrentHashMap<>();
        this.LLD = new C76111Ttz(this);
        this.LLF = new C76308TxA(this);
        this.LLFF = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC31509CYf.LINK_MIC_BATTLE.getIntType()), Integer.valueOf(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType()), Integer.valueOf(EnumC31509CYf.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType()), Integer.valueOf(EnumC31509CYf.LINK_MIC_BATTLE_ITEM_CARD.getIntType()));
        this.LLFFF = 1L;
        this.LLFII = true;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        InterfaceC76112Tu0 layoutChangedListener;
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPreLayoutSwitch, layout=");
        LIZ.append(layout);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJJI(layout);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        InterfaceC76112Tu0 layoutChangedListener;
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayerRangeCalculateFinish, layout=");
        LIZ.append(layout);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJJJ(layout);
        }
    }

    @Override // X.InterfaceC76125TuD
    public final void LJJJJZ(SeiAppData sei) {
        int i;
        long j;
        boolean z;
        LiveWidget liveWidget;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        C75726Tnm feedWindowManager;
        C75726Tnm feedWindowManager2;
        Long l;
        Long l2;
        C75794Tos c75794Tos;
        C75794Tos c75794Tos2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        AbstractC76298Tx0 abstractC76298Tx0;
        Long LJJIZ;
        o.LJIIIZ(sei, "sei");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeiAppData, data=");
        LIZ.append(sei);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        SeiDsl seiDsl = sei.dsl;
        if (seiDsl != null) {
            i = seiDsl.scene;
        } else {
            i = 0;
        }
        String str = sei.channelId;
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        String str2 = sei.anchorLinkMicId;
        int i3 = sei.linkerArchType;
        if (this.LLFII) {
            this.LLFII = false;
            this.LJLJLJ = i;
            this.LJLJLLL = j;
            this.LJLL = str2;
            this.LJLLI = i3;
            StringBuilder LIZLLL = C1FJ.LIZLLL("onSeiAppData, isInitial=true, newSeiScen=", i, ", newChannelId=", j);
            LIZLLL.append(", newLinkMicId=");
            LIZLLL.append(str2);
            LIZLLL.append(", newArcType=");
            LIZLLL.append(i3);
            C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZLLL));
        } else {
            int i4 = this.LJLJLJ;
            long j2 = this.LJLJLLL;
            String str3 = this.LJLL;
            int i5 = this.LJLLI;
            if (i4 == i && j2 == j && o.LJ(str3, str2) && i5 == i3) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSeiAppData, isInitial=false, ifConfigSame=");
            LIZ2.append(z);
            LIZ2.append(", oldSeiScene=");
            LIZ2.append(i4);
            LIZ2.append(", oldChannelId=");
            C65232Piu.LIZLLL(LIZ2, j2, ", oldLinkMicId=", str3);
            C1EU.LIZJ(LIZ2, ", oldArcType=", i5, ", newSeiScen=", i);
            C0MT.LIZLLL(LIZ2, ", newChannelId=", j, ", newLinkMicId=");
            LIZ2.append(str2);
            LIZ2.append(", newArcType=");
            LIZ2.append(i3);
            C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ2));
            if (!z) {
                C0NB.LJIIIZ("MultiHostFeedHandler", "clearByConfigChange");
                ((C73318Sq2) this.LJZI.getValue()).LIZLLL();
                this.LJZL.clear();
                InterfaceC75579TlP interfaceC75579TlP = this.LJLJJL;
                if (interfaceC75579TlP != null) {
                    interfaceC75579TlP.A9(true);
                }
                C76301Tx3 c76301Tx3 = this.LJLLL;
                if (c76301Tx3 != null) {
                    C29306Beo.LJJIJIIJIL(c76301Tx3);
                }
                C76301Tx3 c76301Tx32 = this.LJLLL;
                if (c76301Tx32 != null) {
                    c76301Tx32.LIZIZ();
                }
                DataChannel dataChannel = null;
                this.LJLLL = null;
                B5G.LIZJ(LIZ(), "feed_release_config_change");
                this.LJLJLJ = i;
                this.LJLJLLL = j;
                this.LJLL = str2;
                this.LJLLI = i3;
                long LIZ3 = LIZ();
                C75794Tos c75794Tos3 = this.LJLJJLL;
                if (c75794Tos3 != null && (liveWidget = c75794Tos3.LJII) != null) {
                    dataChannel = liveWidget.dataChannel;
                }
                B5G.LIZ(LIZ3, dataChannel, "feed_config_change");
            }
        }
        HashMap hashMap = new HashMap();
        int size = this.LJZL.size();
        List<SeiRegion> list = sei.grids;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("checkIfLinkedListChange, isCountSame=");
        if (size == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1FL.LJFF(LIZ4, z2, ", oldCount=", size, ", newCount=");
        b1.LJ(LIZ4, i2, LIZ4, "MultiHostFeedHandler");
        List<SeiRegion> list2 = sei.grids;
        if (list2 != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            int size2 = list2.size();
            z3 = false;
            for (int i6 = 0; i6 < size2; i6++) {
                SeiRegion seiRegion = (SeiRegion) ListProtector.get(list2, i6);
                String LIZ5 = seiRegion.LIZ();
                o.LJIIIIZZ(LIZ5, "region.interactId");
                hashMap.put(LIZ5, Integer.valueOf(seiRegion.position));
                if (!this.LJLJI.containsKey(seiRegion.LIZ())) {
                    z3 = true;
                }
                C75989Ts1 c75989Ts1 = this.LJZL.get(seiRegion.LIZ());
                String str4 = "";
                if (c75989Ts1 != null) {
                    String str5 = this.LJLL;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    c75989Ts1.LJ = str4;
                    c75989Ts1.LIZLLL = this.LJLJLLL;
                    String LIZ6 = seiRegion.LIZ();
                    o.LJIIIIZZ(LIZ6, "seiRegion.interactId");
                    concurrentHashMap.put(LIZ6, c75989Ts1);
                } else {
                    String LIZ7 = seiRegion.LIZ();
                    o.LJIIIIZZ(LIZ7, "seiRegion.interactId");
                    String LIZ8 = seiRegion.LIZ();
                    if (LIZ8 == null) {
                        LIZ8 = "";
                    }
                    C75989Ts1 c75989Ts12 = new C75989Ts1(LIZ8);
                    c75989Ts12.LJII = this.LJLLI;
                    String str6 = this.LJLL;
                    if (str6 != null) {
                        str4 = str6;
                    }
                    c75989Ts12.LJ = str4;
                    c75989Ts12.LIZLLL = this.LJLJLLL;
                    concurrentHashMap.put(LIZ7, c75989Ts12);
                }
            }
            this.LJZL.putAll(concurrentHashMap);
        } else {
            z3 = false;
        }
        this.LJLJI.putAll(hashMap);
        if (z3) {
            C76301Tx3 c76301Tx33 = this.LJLLL;
            if (c76301Tx33 != null) {
                this.LJZL.size();
                if (c76301Tx33.LJLL == EnumC75620Tm4.Linked && (abstractC76298Tx0 = c76301Tx33.LJLJLJ.LIZJ) != null) {
                    abstractC76298Tx0.LJIILJJIL();
                }
            }
            C75794Tos c75794Tos4 = this.LJLJJLL;
            if (c75794Tos4 != null && (l = c75794Tos4.LIZ) != null) {
                l.longValue();
                C75794Tos c75794Tos5 = this.LJLJJLL;
                if (c75794Tos5 != null && (l2 = c75794Tos5.LIZIZ) != null) {
                    l2.longValue();
                    C0NB.LJIIIZ("MultiHostFeedHandler", "onLinkedListChange");
                    long j3 = 0;
                    if (this.LJLJLLL != 0 && (((c75794Tos = this.LJLJJLL) == null || (l6 = c75794Tos.LIZ) == null || l6.longValue() != 0) && ((c75794Tos2 = this.LJLJJLL) == null || (l5 = c75794Tos2.LIZIZ) == null || l5.longValue() != 0))) {
                        C31012CFc.LIZIZ();
                        C75870Tq6 c75870Tq6 = new C75870Tq6();
                        if (this.LJLLI == EnumC31946CgI.CROSS_ROOM_ARCH.getType()) {
                            CoHostApi coHostApi = (CoHostApi) Q7L.LIZIZ(CoHostApi.class);
                            C75794Tos c75794Tos6 = this.LJLJJLL;
                            if (c75794Tos6 != null && (l4 = c75794Tos6.LIZ) != null) {
                                j3 = l4.longValue();
                            }
                            InterfaceC92693kP LJJII = T28.LIZLLL(coHostApi.updateUserListCrossArc(j3, this.LJLJLLL, 1L)).LJIL(LiveCohostFeedUserListRetryTimesSetting.INSTANCE.getValue()).LJJII(new AfS62S0200000_13(this, c75870Tq6, 19), new AfS62S0200000_13(this, c75870Tq6, 20));
                            C73318Sq2 cb = (C73318Sq2) this.LJZI.getValue();
                            o.LJIIIZ(cb, "cb");
                            cb.LIZ(LJJII);
                        } else {
                            CoHostApi coHostApi2 = (CoHostApi) Q7L.LIZIZ(CoHostApi.class);
                            C75794Tos c75794Tos7 = this.LJLJJLL;
                            if (c75794Tos7 != null && (l3 = c75794Tos7.LIZ) != null) {
                                j3 = l3.longValue();
                            }
                            InterfaceC92693kP LJJII2 = T28.LIZLLL(coHostApi2.updateUserList(j3, this.LJLJLLL)).LJIL(LiveCohostFeedUserListRetryTimesSetting.INSTANCE.getValue()).LJJII(new AfS62S0200000_13(this, c75870Tq6, 21), new AfS62S0200000_13(this, c75870Tq6, 22));
                            C73318Sq2 cb2 = (C73318Sq2) this.LJZI.getValue();
                            o.LJIIIZ(cb2, "cb");
                            cb2.LIZ(LJJII2);
                        }
                    } else {
                        StringBuilder LIZ9 = X1D.LIZ();
                        LIZ9.append("onLInkListChange return ");
                        LIZ9.append(this.LJLJLLL);
                        LIZ9.append(' ');
                        LIZ9.append(this.LJLJJLL);
                        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ9));
                    }
                }
            }
        }
        List<SeiRegion> list3 = sei.grids;
        if (list3 != null) {
            for (SeiRegion seiRegion2 : list3) {
                if (seiRegion2.LIZ() != null && !o.LJ(this.LJLILLLLZI.get(seiRegion2.LIZ()), Boolean.valueOf(seiRegion2.muteAudioBool))) {
                    C75989Ts1 c75989Ts13 = this.LJZL.get(seiRegion2.LIZ());
                    if (c75989Ts13 != null) {
                        c75989Ts13.LJIIJ = seiRegion2.muteAudioBool;
                    }
                    C76301Tx3 c76301Tx34 = this.LJLLL;
                    if (c76301Tx34 != null && (feedWindowManager2 = c76301Tx34.getFeedWindowManager()) != null) {
                        String LIZ10 = seiRegion2.LIZ();
                        o.LJIIIIZZ(LIZ10, "it.interactId");
                        C76116Tu4 LIZ11 = feedWindowManager2.LIZ(LIZ10);
                        if (LIZ11 != null) {
                            LIZ11.setAudienceMuteState(seiRegion2.muteAudioBool);
                            ConcurrentHashMap<String, Boolean> concurrentHashMap2 = this.LJLILLLLZI;
                            String LIZ12 = seiRegion2.LIZ();
                            o.LJIIIIZZ(LIZ12, "it.interactId");
                            concurrentHashMap2.put(LIZ12, Boolean.valueOf(seiRegion2.muteAudioBool));
                        }
                    }
                }
            }
        }
        List<SeiRegion> list4 = sei.grids;
        if (list4 != null) {
            for (SeiRegion seiRegion3 : list4) {
                if (seiRegion3.LIZ() != null) {
                    Integer num = this.LJLJJI.get(seiRegion3.LIZ());
                    int i7 = seiRegion3.onlineUserState;
                    if (num == null || num.intValue() != i7) {
                        int i8 = seiRegion3.onlineUserState;
                        if (i8 == 0 || i8 == 1 || i8 != 2) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        C75989Ts1 c75989Ts14 = this.LJZL.get(seiRegion3.LIZ());
                        if (c75989Ts14 != null) {
                            c75989Ts14.LJIIJJI = z4;
                        }
                        C76301Tx3 c76301Tx35 = this.LJLLL;
                        if (c76301Tx35 != null && (feedWindowManager = c76301Tx35.getFeedWindowManager()) != null) {
                            String LIZ13 = seiRegion3.LIZ();
                            o.LJIIIIZZ(LIZ13, "it.interactId");
                            C76116Tu4 LIZ14 = feedWindowManager.LIZ(LIZ13);
                            if (LIZ14 != null) {
                                LIZ14.LJL(z4);
                                ConcurrentHashMap<String, Integer> concurrentHashMap3 = this.LJLJJI;
                                String LIZ15 = seiRegion3.LIZ();
                                o.LJIIIIZZ(LIZ15, "it.interactId");
                                concurrentHashMap3.put(LIZ15, Integer.valueOf(seiRegion3.onlineUserState));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        InterfaceC76112Tu0 layoutChangedListener;
        o.LJIIIZ(seiAppData, "seiAppData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeiBattleIdUpdated, seiAppData=");
        LIZ.append(seiAppData);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJJLIIIJ(seiAppData);
        }
    }

    @Override // X.InterfaceC76125TuD
    public final void LJJLIIIJJI(InterfaceC75804Tp2 interfaceC75804Tp2) {
        SeiAppData seiAppData;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeiAppData, data=");
        LIZ.append(interfaceC75804Tp2);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        if ((interfaceC75804Tp2 instanceof SeiAppData) && (seiAppData = (SeiAppData) interfaceC75804Tp2) != null) {
            LJJJJZ(seiAppData);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        InterfaceC76112Tu0 layoutChangedListener;
        o.LJIIIZ(user, "user");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserJoinedForHost, user=");
        LIZ.append(user);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJLLL(user);
        }
    }

    public static void LIZLLL(CohostListUser cohostListUser, C75989Ts1 c75989Ts1) {
        Long l = cohostListUser.userId;
        o.LJIIIIZZ(l, "serverUserInfo.userId");
        c75989Ts1.LIZIZ = l.longValue();
        Long l2 = cohostListUser.roomId;
        o.LJIIIIZZ(l2, "serverUserInfo.roomId");
        c75989Ts1.LIZJ = l2.longValue();
        String str = cohostListUser.displayId;
        o.LJIIIIZZ(str, "serverUserInfo.displayId");
        String str2 = cohostListUser.nickName;
        o.LJIIIIZZ(str2, "serverUserInfo.nickName");
        c75989Ts1.LJI = new C75768ToS(str, str2, cohostListUser.avatarThumb);
    }

    public final void LIZJ(CohostListUser cohostListUser, ConcurrentHashMap<String, C75989Ts1> concurrentHashMap) {
        C75989Ts1 c75989Ts1 = concurrentHashMap.get(cohostListUser.linkmicIdStr);
        if (c75989Ts1 != null) {
            LIZLLL(cohostListUser, c75989Ts1);
            return;
        }
        String str = cohostListUser.linkmicIdStr;
        o.LJIIIIZZ(str, "serverUserInfo.linkmicIdStr");
        String str2 = cohostListUser.linkmicIdStr;
        if (str2 == null) {
            str2 = "";
        }
        C75989Ts1 c75989Ts12 = new C75989Ts1(str2);
        c75989Ts12.LJII = this.LJLLI;
        LIZLLL(cohostListUser, c75989Ts12);
        concurrentHashMap.put(str, c75989Ts12);
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        Boolean bool;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        FrameLayout.LayoutParams layoutParams5;
        InterfaceC76112Tu0 layoutChangedListener;
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutSwitch, layout=");
        LIZ.append(layout);
        LIZ.append(", switchType=");
        LIZ.append(i);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJJLIIIJJIZ(layout, i);
        }
        if (layout.getLayoutName() == null) {
            return;
        }
        String layoutName = layout.getLayoutName();
        ViewGroup.LayoutParams layoutParams6 = null;
        if (layoutName != null) {
            bool = Boolean.valueOf(C45804HyK.LJJJJIZL(layoutName));
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool) || this.LJLJLJ != 2 || (frameLayout = this.LJLLJ) == null) {
            return;
        }
        Rect containerActualRange = layout.getContainerActualRange();
        if (frameLayout.getWidth() > containerActualRange.right - containerActualRange.left) {
            View view = this.LJLZ;
            if (view != null) {
                layoutParams3 = view.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams5 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                layoutParams5.topMargin = containerActualRange.top;
                layoutParams5.height = containerActualRange.height();
                layoutParams5.width = containerActualRange.left;
                View view2 = this.LJLZ;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams5);
                }
                View view3 = this.LJLZ;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
            View view4 = this.LJZ;
            if (view4 != null) {
                layoutParams6 = view4.getLayoutParams();
            }
            if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                layoutParams4.topMargin = containerActualRange.top;
                layoutParams4.height = containerActualRange.height();
                layoutParams4.width = frameLayout.getWidth() - containerActualRange.right;
                View view5 = this.LJZ;
                if (view5 != null) {
                    view5.setLayoutParams(layoutParams4);
                }
                View view6 = this.LJZ;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
            }
        }
        View view7 = this.LJLLLL;
        if (view7 != null && (layoutParams2 = view7.getLayoutParams()) != null) {
            layoutParams2.height = containerActualRange.top;
            View view8 = this.LJLLLL;
            if (view8 != null) {
                view8.setLayoutParams(layoutParams2);
            }
            View view9 = this.LJLLLL;
            if (view9 != null) {
                view9.setVisibility(0);
            }
        }
        View view10 = this.LJLLLLLL;
        if (view10 == null || (layoutParams = view10.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = frameLayout.getHeight() - containerActualRange.bottom;
        View view11 = this.LJLLLLLL;
        if (view11 != null) {
            view11.setLayoutParams(layoutParams);
        }
        View view12 = this.LJLLLLLL;
        if (view12 == null) {
            return;
        }
        view12.setVisibility(0);
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
        InterfaceC76112Tu0 layoutChangedListener;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutWindowUpdate, layout=");
        LIZ.append(c76696U8e);
        LIZ.append(", preWindowCount=");
        LIZ.append(i);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LJLJJL(c76696U8e, i);
        }
    }

    @Override // X.InterfaceC76125TuD
    public final void LLILLL(FrameLayout frameLayout, OSZ<Integer, Integer> osz) {
        Context context;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLiveFeedContainerSet, container=");
        LIZ.append(frameLayout);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        this.LL = osz;
        if (!o.LJ(this.LJLLJ, frameLayout)) {
            this.LJLLJ = frameLayout;
        }
        if (this.LJLJLJ != 2) {
            return;
        }
        if (this.LJLLLL == null || this.LJLLLLLL == null) {
            C75794Tos c75794Tos = this.LJLJJLL;
            ViewParent viewParent = null;
            if (c75794Tos != null) {
                context = c75794Tos.LIZJ;
            } else {
                context = null;
            }
            FrameLayout frameLayout2 = this.LJLLJ;
            if ((context != null || (frameLayout2 != null && (context = frameLayout2.getContext()) != null)) && frameLayout2 != null) {
                View view = this.LJLZ;
                if (view != null) {
                    viewParent = view.getParent();
                }
                if (!o.LJ(viewParent, frameLayout2)) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
                    layoutParams.gravity = 48;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 0);
                    layoutParams2.gravity = 80;
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                    layoutParams3.gravity = 8388659;
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(0, 0);
                    layoutParams4.gravity = 8388661;
                    View view2 = this.LJLLLL;
                    if (view2 != null) {
                        C29306Beo.LJJIJIIJIL(view2);
                    }
                    View view3 = new View(context);
                    view3.setId(R.id.lfm);
                    view3.setVisibility(8);
                    view3.setBackgroundColor(-16777216);
                    frameLayout2.addView(view3, layoutParams);
                    this.LJLLLL = view3;
                    View view4 = this.LJLLLLLL;
                    if (view4 != null) {
                        C29306Beo.LJJIJIIJIL(view4);
                    }
                    View view5 = new View(context);
                    view5.setId(R.id.aqg);
                    view5.setVisibility(8);
                    view5.setBackgroundColor(-16777216);
                    frameLayout2.addView(view5, layoutParams2);
                    this.LJLLLLLL = view5;
                    View view6 = this.LJLZ;
                    if (view6 != null) {
                        C29306Beo.LJJIJIIJIL(view6);
                    }
                    View view7 = new View(context);
                    view7.setId(R.id.fp2);
                    view7.setVisibility(8);
                    view7.setBackgroundColor(-16777216);
                    frameLayout2.addView(view7, layoutParams3);
                    this.LJLZ = view7;
                    View view8 = this.LJZ;
                    if (view8 != null) {
                        C29306Beo.LJJIJIIJIL(view8);
                    }
                    View view9 = new View(context);
                    view9.setId(R.id.j2o);
                    view9.setVisibility(8);
                    view9.setBackgroundColor(-16777216);
                    frameLayout2.addView(view9, layoutParams4);
                    this.LJZ = view9;
                }
            }
            View view10 = this.LJLLLL;
            if (view10 != null) {
                view10.bringToFront();
            }
            View view11 = this.LJLLLLLL;
            if (view11 != null) {
                view11.bringToFront();
            }
            C76301Tx3 c76301Tx3 = this.LJLLL;
            if (c76301Tx3 != null) {
                c76301Tx3.bringToFront();
            }
        }
        if (this.LJLLL == null) {
            C0NB.LJIIIZ("MultiHostFeedHandler", "onLiveFeedContainerSet, cohostFeedContainer == null");
            Context context2 = frameLayout.getContext();
            o.LJIIIIZZ(context2, "container.context");
            C76301Tx3 c76301Tx32 = new C76301Tx3(context2);
            c76301Tx32.setId(R.id.d73);
            this.LJLLL = c76301Tx32;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLiveFeedContainerSet, cohostFeedContainer == ");
            LIZ2.append(this.LJLLL);
            C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ2));
        }
        C76301Tx3 c76301Tx33 = this.LJLLL;
        if (c76301Tx33 != null) {
            if (frameLayout.indexOfChild(c76301Tx33) != -1) {
                C0NB.LJIIIZ("MultiHostFeedHandler", "onLiveFeedContainerSet, container.contains(it) = true");
                return;
            }
            if (c76301Tx33.getParent() != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onLiveFeedContainerSet, it.parent = ");
                LIZ3.append(c76301Tx33.getParent());
                C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ3));
                c76301Tx33.LIZIZ();
                C29306Beo.LJJIJIIJIL(c76301Tx33);
            }
            C76301Tx3 c76301Tx34 = (C76301Tx3) frameLayout.findViewById(R.id.d73);
            if (c76301Tx34 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onLiveFeedContainerSet, oldCohostView = ");
                LIZ4.append(c76301Tx34);
                C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ4));
                c76301Tx34.LIZIZ();
                C29306Beo.LJJIJIIJIL(c76301Tx34);
            }
            frameLayout.addView(c76301Tx33, 0);
            c76301Tx33.LIZ(this.LLD);
            c76301Tx33.bringToFront();
        }
    }

    public final void LIZIZ(C75794Tos c75794Tos, InterfaceC75579TlP interfaceC75579TlP, C74994Tby audienceModel, InterfaceC32199CkN interfaceC32199CkN) {
        DataChannel dataChannel;
        LiveWidget liveWidget;
        o.LJIIIZ(audienceModel, "audienceModel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, data=");
        LIZ.append(c75794Tos);
        LIZ.append(", linkLayoutManager=");
        LIZ.append(interfaceC75579TlP);
        LIZ.append(", audienceModel=");
        LIZ.append(audienceModel);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        this.LJLJJLL = c75794Tos;
        this.LJLJJL = interfaceC75579TlP;
        this.LJLJL = interfaceC32199CkN;
        if (interfaceC32199CkN != null) {
            interfaceC32199CkN.LIZ(this.LLFF, this.LLF);
        }
        long LIZ2 = LIZ();
        C75794Tos c75794Tos2 = this.LJLJJLL;
        if (c75794Tos2 != null && (liveWidget = c75794Tos2.LJII) != null) {
            dataChannel = liveWidget.dataChannel;
        } else {
            dataChannel = null;
        }
        B5G.LIZ(LIZ2, dataChannel, "feed_release");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        InterfaceC76112Tu0 layoutChangedListener;
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowStateChanged, window = ");
        LIZ.append(window);
        LIZ.append(", isRoomOwnerWindow = ");
        LIZ.append(window.LJLJI());
        LIZ.append(", oldState = ");
        LIZ.append(oldState);
        LIZ.append(", newState = ");
        LIZ.append(newState);
        LIZ.append(", actionType=");
        LIZ.append(actionType);
        LIZ.append(", extra=");
        LIZ.append(c75786Tok);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = this.LJLLL;
        if (c76301Tx3 != null && (layoutChangedListener = c76301Tx3.getLayoutChangedListener()) != null) {
            layoutChangedListener.LLIIJLIL(window, oldState, newState, actionType, c75786Tok);
        }
    }
}
