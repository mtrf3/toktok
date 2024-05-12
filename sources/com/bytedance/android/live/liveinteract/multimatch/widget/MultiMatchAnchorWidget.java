package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.AbstractC76181Tv7;
import X.B5G;
import X.C05630Jz;
import X.C0NB;
import X.C15380j0;
import X.C2L4;
import X.C30049Bqn;
import X.C30868C9o;
import X.C32537Cpp;
import X.C4W;
import X.C65352Pkq;
import X.C73943T0h;
import X.C75515TkN;
import X.C75622Tm6;
import X.C75633TmH;
import X.C75768ToS;
import X.C75852Tpo;
import X.C75883TqJ;
import X.C75955TrT;
import X.C75965Trd;
import X.C75994Ts6;
import X.C75995Ts7;
import X.C75997Ts9;
import X.C76128TuG;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76302Tx4;
import X.C76469Tzl;
import X.C76470Tzm;
import X.C76965UIn;
import X.C79234V7u;
import X.C8E;
import X.C8VV;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC75468Tjc;
import X.EnumC75909Tqj;
import X.EnumC76178Tv4;
import X.InterfaceC29856Bng;
import X.InterfaceC30237Btp;
import X.InterfaceC30442Bx8;
import X.InterfaceC31781Cdd;
import X.InterfaceC75441TjB;
import X.InterfaceC76362Ty2;
import X.U8H;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLinkedAnchorNumChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchResumeEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkMicIconMutex;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiSubSceneTechSwitchSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MultiMatchAnchorWidget extends MatchBaseWidget implements InterfaceC76362Ty2, C2L4 {
    public static final /* synthetic */ int LJLL = 0;
    public AbstractC76181Tv7 LJLJL;
    public final C76302Tx4 LJLJLJ;
    public final C75994Ts6 LJLJLLL;

    public final void LLFFF() {
        if (LLFF(0)) {
            if ((!C75633TmH.LIZ.isEmpty()) && !InterfaceC30442Bx8.LLJ.LIZJ().booleanValue() && C76265TwT.LIZ.LJ() == EnumC76178Tv4.NORMAL) {
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 155);
                C75965Trd c75965Trd = new C75965Trd(context);
                c75965Trd.LIZIZ = aqS163S0100000_13;
                C75852Tpo.LJ(new C75955TrT(c75965Trd));
                return;
            }
            AbstractC76181Tv7 abstractC76181Tv7 = this.LJLJL;
            if (abstractC76181Tv7 == null) {
                return;
            }
            abstractC76181Tv7.LJJZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return MultiMatchAnchorWidget.class.getName();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(MatchScope.class);
    }

    @Override // X.InterfaceC76362Ty2
    public final boolean nC() {
        InterfaceC30237Btp interfaceC30237Btp = this.LJLJLLL.LJLILLLLZI;
        if (interfaceC30237Btp != null && interfaceC30237Btp.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        U8H LJJZZI;
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI2;
        InterfaceC31781Cdd interfaceC31781Cdd;
        Fragment LJIIIZ;
        int i;
        C75515TkN.LIZIZ(this.LJLJLLL.LJLILLLLZI, new ARunnableS49S0100000_13(this, 53), EnumC75468Tjc.PK);
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.START;
        if (LJ.compareTo(enumC76178Tv4) >= 0 && LJ.compareTo(EnumC76178Tv4.END) < 0) {
            if (LJ == enumC76178Tv4) {
                i = 1;
            } else {
                i = 2;
            }
            C75622Tm6.LJIIIZ(i);
        }
        if (C76128TuG.LIZIZ(this.dataChannel, false, 6) && (((interfaceC31781Cdd = this.widgetCallback) != null && (LJIIIZ = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ = C79234V7u.LJIIIZ(getView())) != null)) {
            C8VV.LJIIIIZZ(LJIIIZ, C65352Pkq.LIZ(MatchBottomNoticeCard.class));
            C8VV.LJIIIIZZ(LJIIIZ, C65352Pkq.LIZ(MatchItemAssem.class));
        }
        AbstractC76181Tv7 abstractC76181Tv7 = this.LJLJL;
        if (abstractC76181Tv7 != null) {
            abstractC76181Tv7.LJJJJZI();
        }
        this.LJLJL = null;
        C76271TwZ.LJJIIJZLJL();
        this.LJLJLJ.detachView();
        if (LinkMicSeiSubSceneTechSwitchSetting.INSTANCE.enable() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI2 = LJJIJL.LJJZZI()) != null) {
            LJJZZI2.LJJIJIIJIL("MultiMatchAnchorWidget#onDestroy");
        }
        InterfaceC75441TjB LJJIJL2 = C8E.LIZLLL().LJJIJL();
        if (LJJIJL2 != null && (LJJZZI = LJJIJL2.LJJZZI()) != null) {
            LJJZZI.LJJZ(0L);
        }
        super.onDestroy();
        C0NB.LIZIZ("MultiMatchWidget", "onDestroy");
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Fragment LJIIIZ;
        super.onCreate();
        C0NB.LIZIZ("MultiMatchWidget", "onCreate");
        EnumC30204BtI.INTERACTION_PK.load(this.dataChannel, this.LJLJLLL);
        this.LJLJLLL.LIZLLL(8);
        C76265TwT.LJII(0, "create");
        this.LJLJLJ.attachView(this);
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(C30049Bqn.class).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS65S0100000_13(this, 58));
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if ((interfaceC31781Cdd != null && (LJIIIZ = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ = C79234V7u.LJIIIZ(getView())) != null) {
            C8VV.LIZ(LJIIIZ, false, new AqS144S0200000_13(LJIIIZ, this, 6));
        }
        this.dataChannel.mv0(BattleStateChannel.class, this, C75995Ts7.LJLIL);
    }

    public MultiMatchAnchorWidget(View view) {
        super(view);
        this.LJLJLJ = new C76302Tx4();
        C75994Ts6 c75994Ts6 = new C75994Ts6(this);
        c75994Ts6.LJLJL = this;
        this.LJLJLLL = c75994Ts6;
    }

    @Override // X.InterfaceC76362Ty2
    public final void Ip0(LinkMicBattleMessage message) {
        o.LJIIIZ(message, "message");
        if (message.action == 1) {
            LLFF(2);
            AbstractC76181Tv7 abstractC76181Tv7 = this.LJLJL;
            if (abstractC76181Tv7 != null) {
                abstractC76181Tv7.LJJZZI(message);
            }
        }
        if (message.action == 7) {
            LLFF(2);
        }
    }

    @Override // X.InterfaceC76362Ty2
    public final void It0(int i) {
        AbstractC76181Tv7 abstractC76181Tv7;
        if (LLFF(1) && (abstractC76181Tv7 = this.LJLJL) != null) {
            abstractC76181Tv7.LJJLL(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LLFF(int i) {
        O o;
        long j;
        AbstractC76181Tv7 c76470Tzm;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ensureMatchViewCreated  ");
        LIZ.append(i);
        C0NB.LIZIZ("MultiMatchWidget", X1D.LIZIZ(LIZ));
        IMultiHostService LIZLLL = C8E.LIZLLL();
        List<C75883TqJ> LJIL = LIZLLL.LJIL();
        ArrayList arrayList = new ArrayList();
        Iterator<C75883TqJ> it = LJIL.iterator();
        while (true) {
            ImageModel imageModel = null;
            if (!it.hasNext()) {
                break;
            }
            C75883TqJ next = it.next();
            C75883TqJ c75883TqJ = next;
            IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class);
            if (iHostFrescoHelper != null) {
                C75768ToS c75768ToS = c75883TqJ.LJIIZILJ;
                if (c75768ToS != null) {
                    imageModel = c75768ToS.LIZJ;
                }
                iHostFrescoHelper.EM(imageModel, new C75997Ts9());
            }
            if (c75883TqJ.LJJI == EnumC75909Tqj.LINKED) {
                arrayList.add(next);
            }
        }
        this.dataChannel.rv0(BattleLinkedAnchorNumChannel.class, Integer.valueOf(arrayList.size()));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    o = "";
                } else {
                    o = "invite_message";
                }
            } else {
                o = "match_guide";
            }
        } else {
            o = "invite_succeed";
        }
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C4W.class)).LIZ = o;
        int i2 = 0;
        for (C75883TqJ c75883TqJ2 : LIZLLL.LJIL()) {
            if (c75883TqJ2.LJ() && c75883TqJ2.LJFF()) {
                i2 = 1;
            } else if (c75883TqJ2.LJ()) {
                i2 = 2;
            }
        }
        if (i2 > 0) {
            if (i == 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("hasHandlingCoHost:");
                LIZ2.append(i2);
                LIZ2.append(" from message invite");
                C0NB.LJIIIZ("MultiMatchWidget", X1D.LIZIZ(LIZ2));
            } else {
                if (i2 == 2) {
                    C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.myq));
                    return false;
                }
                if (i2 == 1) {
                    C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.myo));
                    return false;
                }
            }
        }
        if (this.LJLJL == null) {
            C76244Tw8 c76244Tw8 = (C76244Tw8) LJZI(C76244Tw8.class);
            c76244Tw8.onCleared();
            c76244Tw8.LIZ.setValue(Long.valueOf(B5G.LIZIZ().LJFF));
            c76244Tw8.LIZIZ.setValue(arrayList);
            c76244Tw8.LIZJ = arrayList;
            if (arrayList.size() > 2) {
                c76470Tzm = new C76469Tzl();
            } else {
                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                if (arrayList.size() == 2) {
                    j = ((C75883TqJ) ListProtector.get(arrayList, 1)).LIZ;
                } else {
                    j = 0;
                }
                LIZIZ.LJI = j;
                c76470Tzm = new C76470Tzm();
            }
            this.LJLJL = c76470Tzm;
            c76470Tzm.LJJJJZ(this);
        } else {
            C76244Tw8 c76244Tw82 = (C76244Tw8) LJZI(C76244Tw8.class);
            c76244Tw82.LIZ.setValue(Long.valueOf(B5G.LIZIZ().LJFF));
            c76244Tw82.LIZIZ.setValue(arrayList);
            c76244Tw82.LIZJ = arrayList;
            if (arrayList.size() > 2 && !(this.LJLJL instanceof C76469Tzl)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onBattleClick  ->  not multi, but use multi match view ");
                LIZ3.append(i);
                C0NB.LJ("MultiMatchWidget", X1D.LIZIZ(LIZ3));
                AbstractC76181Tv7 abstractC76181Tv7 = this.LJLJL;
                if (abstractC76181Tv7 != null) {
                    abstractC76181Tv7.LJJJJZI();
                }
                this.LJLJL = null;
                LLFF(i);
            } else if (arrayList.size() <= 2 && !(this.LJLJL instanceof C76470Tzm)) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onBattleClick  -> not two match, but use two match view ");
                LIZ4.append(i);
                C0NB.LJ("MultiMatchWidget", X1D.LIZIZ(LIZ4));
                AbstractC76181Tv7 abstractC76181Tv72 = this.LJLJL;
                if (abstractC76181Tv72 != null) {
                    abstractC76181Tv72.LJJJJZI();
                }
                this.LJLJL = null;
                LLFF(i);
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("onBattleClick  -> link num=");
                LIZ5.append(arrayList.size());
                LIZ5.append(",  match view is ");
                LIZ5.append(this.LJLJL);
                LIZ5.append(", ");
                LIZ5.append(i);
                LIZ5.append(' ');
                C0NB.LJIIIZ("MultiMatchWidget", X1D.LIZIZ(LIZ5));
            }
        }
        return true;
    }

    @Override // X.InterfaceC76362Ty2
    public final void XV(boolean z) {
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "role_type", "anchor");
        C05630Jz.LIZ(z ? 1 : 0, "show", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "show", jSONObject2);
        C05630Jz.LJI(jSONObject2, "role_type", "anchor");
        C76271TwZ.LJJZZIII(c76271TwZ, "battle_icon_show", jSONObject, jSONObject2, null, false, 8);
        C76265TwT.LJIIIZ = z;
        if (z) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(LinkMicIconMutex.class, new ARunnableS49S0100000_13(this, 55));
            }
            if (C8E.LIZLLL().LJJIIJ()) {
                LLFF(3);
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.pv0(MatchResumeEvent.class);
                    return;
                }
                return;
            }
            return;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.qv0(LinkMicIconMutex.class, new ARunnableS49S0100000_13(this, 56));
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void LLF(long j, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        AbstractC76181Tv7 abstractC76181Tv7 = this.LJLJL;
        if (abstractC76181Tv7 != null) {
            abstractC76181Tv7.LJL(j, linkMicId);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void LJZL(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        AbstractC76181Tv7 abstractC76181Tv7 = this.LJLJL;
        if (abstractC76181Tv7 != null) {
            abstractC76181Tv7.LJJLJLI(i, i2, abnormalDisconnectReason);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void LL(List<LinkUser> list, List<LinkUser> list2, CustomLinkMessage customLinkMessage) {
        C0NB.LIZIZ("pk_interrupt", "onHostsListChanged ");
        AbstractC76181Tv7 abstractC76181Tv7 = this.LJLJL;
        if (abstractC76181Tv7 != null) {
            abstractC76181Tv7.LJJLJ(list, list2, customLinkMessage);
        }
    }
}
