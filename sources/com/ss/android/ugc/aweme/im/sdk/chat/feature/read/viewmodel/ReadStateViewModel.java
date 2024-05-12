package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import X.AbstractC1041546x;
import X.AbstractC89473fD;
import X.C102073zX;
import X.C102083zY;
import X.C102093zZ;
import X.C102123zc;
import X.C107074Id;
import X.C109544Rq;
import X.C221108m2;
import X.C32H;
import X.C34B;
import X.C3PX;
import X.C3PY;
import X.C43J;
import X.C4Z2;
import X.C62822Ol8;
import X.C63219OrX;
import X.C63540Owi;
import X.C96423qQ;
import X.C99033ud;
import X.InterfaceC102153zf;
import X.InterfaceC1029942l;
import X.InterfaceC1031843e;
import X.InterfaceC99673vf;
import X.InterfaceC99713vj;
import X.ORY;
import X.ORZ;
import X.X1D;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateMarkDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ReadStateViewModel extends ViewModel implements C3PY, InterfaceC99673vf, InterfaceC1029942l, InterfaceC1031843e {
    public static final boolean LJLJL = C43J.LIZLLL();
    public final C102073zX LJLIL = new C102073zX();
    public boolean LJLILLLLZI;
    public C99033ud LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Set<String> LJLJJLL;

    @Override // X.InterfaceC1029942l
    public final void Og() {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void T1(C109544Rq c109544Rq) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void ea(C109544Rq c109544Rq, boolean z) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void u7(int i, C109544Rq c109544Rq) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v6(C109544Rq c109544Rq, Map<String, List<C32H>> map, Map<String, List<C32H>> map2, Long l, Long l2) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y(C109544Rq c109544Rq) {
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y5(int i, C63219OrX c63219OrX) {
    }

    @Override // X.InterfaceC1029942l
    public final void Hp() {
        C34B.LIZIZ("ReadStateViewModel", "onNewestMessageVisible");
        ReadStateMarkDelegate hv0 = hv0();
        hv0.getClass();
        C34B.LIZIZ("ReadStateMarkDelegate", "onNewestMessageVisible");
        if (hv0.LJLJJI) {
            hv0.LIZ();
            return;
        }
        C34B.LIZIZ("ReadStateMarkDelegate", "applyMarkStrategyB");
        hv0.sendEmptyMessageDelayed(0, 1000L);
        hv0.LJLJJLL = 1000L;
    }

    public final ReadStateMarkDelegate hv0() {
        return (ReadStateMarkDelegate) this.LJLJJI.getValue();
    }

    @Override // X.C3PY
    public final void onDestroy() {
        InterfaceC99713vj interfaceC99713vj = this.LJLIL.LIZ;
        if (interfaceC99713vj != null) {
            C96423qQ.LIZ().LJI(interfaceC99713vj.getConversationId(), this);
        }
        this.LJLJJLL.clear();
    }

    public ReadStateViewModel() {
        C221108m2.LIZIZ(C102123zc.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 144));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 145));
        this.LJLJJLL = new LinkedHashSet();
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C3PX.onCreate(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C3PX.onPause(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C3PX.onResume(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C3PX.onStart(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C3PX.onStop(this);
    }

    @Override // X.InterfaceC1029942l
    public final void Ah(AbstractC89473fD event) {
        o.LJIIIZ(event, "event");
    }

    public final void G8(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        lifecycleOwner.getLifecycle().addObserver(this);
        lifecycleOwner.getLifecycle().addObserver(hv0());
        AbsReadStateDelegate absReadStateDelegate = (AbsReadStateDelegate) this.LJLJJL.getValue();
        if (absReadStateDelegate != null) {
            lifecycleOwner.getLifecycle().addObserver(absReadStateDelegate);
        }
    }

    @Override // X.InterfaceC1029942l
    public final void IP(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void QG(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void Vj(List<? extends C109544Rq> data) {
        Object obj;
        boolean z;
        C102083zY c102083zY;
        o.LJIIIZ(data, "data");
        C34B.LIZIZ("ReadStateViewModel", "onSubmitListComplete");
        this.LJLIL.LIZIZ().clear();
        ORZ.LJLLI(data, this.LJLIL.LIZIZ());
        hv0().getClass();
        ReadStateSyncDelegate readStateSyncDelegate = (ReadStateSyncDelegate) this.LJLJJL.getValue();
        if (readStateSyncDelegate != null) {
            C34B.LIZIZ("ReadStateSyncDelegate", "onDataChanged");
            if (readStateSyncDelegate.LJLIL.LIZIZ().isEmpty()) {
                return;
            }
            C99033ud c99033ud = readStateSyncDelegate.LJLIL.LIZIZ;
            if (c99033ud != null && !c99033ud.isGroupChat() && (c102083zY = (C102083zY) readStateSyncDelegate.LJLIL.LIZJ.getValue()) != null) {
                boolean z2 = !((C109544Rq) ListProtector.get(readStateSyncDelegate.LJLIL.LIZIZ(), 0)).isSelf();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reportMessageReplyOnce: ");
                LIZ.append(c102083zY.LJ);
                C34B.LIZIZ("ReadStateReporter", X1D.LIZIZ(LIZ));
                if (!c102083zY.LJ && z2) {
                    c102083zY.LIZIZ("replied");
                }
                c102083zY.LJ = true;
            }
            List<C109544Rq> LIZIZ = readStateSyncDelegate.LJLIL.LIZIZ();
            ArrayList arrayList = new ArrayList();
            for (C109544Rq c109544Rq : LIZIZ) {
                if (!ORY.LJJIJIIJIL(Integer.valueOf(c109544Rq.getMsgType()), ReadStateSyncDelegate.LJLJJL)) {
                    arrayList.add(c109544Rq);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C109544Rq c109544Rq2 = (C109544Rq) obj;
                    if (c109544Rq2.isSelf() && !c109544Rq2.isDeleted()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C109544Rq c109544Rq3 = (C109544Rq) obj;
            if (c109544Rq3 == null) {
                return;
            }
            C102073zX c102073zX = readStateSyncDelegate.LJLIL;
            C99033ud c99033ud2 = c102073zX.LIZIZ;
            if (c99033ud2 != null && !c99033ud2.isGroupChat()) {
                z = true;
            } else {
                z = false;
            }
            if (z && arrayList.indexOf(c109544Rq3) != 0) {
                if (c102073zX.LIZJ().getValue() == null) {
                    return;
                }
                c102073zX.LIZLLL(null, -1);
                C102083zY c102083zY2 = (C102083zY) readStateSyncDelegate.LJLIL.LIZJ.getValue();
                if (c102083zY2 == null) {
                    return;
                }
                c102083zY2.LIZ();
                return;
            }
            boolean LIZLLL = readStateSyncDelegate.LJLIL.LIZLLL(c109544Rq3, -1);
            if (!LIZLLL) {
                C102073zX c102073zX2 = readStateSyncDelegate.LJLIL;
                c102073zX2.LIZJ().setValue(c102073zX2.LIZJ().getValue());
            }
            if (((c109544Rq3.getMsgId() <= 0 || c109544Rq3.getMsgStatus() != 2) && c109544Rq3.getMsgStatus() != 5) || !LIZLLL) {
                return;
            }
            C34B.LIZIZ("ReadStateSyncDelegate", "onDataChanged, update");
            readStateSyncDelegate.LIZIZ();
            readStateSyncDelegate.LIZ(2000L);
        }
    }

    @Override // X.InterfaceC1031843e
    public final void cQ(CharSequence charSequence) {
        C34B.LIZIZ("ReadStateViewModel", "onInputting");
        ReadStateMarkDelegate hv0 = hv0();
        hv0.getClass();
        C34B.LIZIZ("ReadStateMarkDelegate", "onInputting");
        if (hv0.LJLJJI) {
            hv0.LIZ();
            return;
        }
        C34B.LIZIZ("ReadStateMarkDelegate", "applyMarkStrategyB");
        hv0.sendEmptyMessageDelayed(0, 1000L);
        hv0.LJLJJLL = 1000L;
    }

    @Override // X.InterfaceC1029942l
    public final void ik0(List<? extends C109544Rq> data) {
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDataChanged: ");
        LIZ.append(Integer.valueOf(data.size()));
        C34B.LIZIZ("ReadStateViewModel", X1D.LIZIZ(LIZ));
    }

    public final boolean iv0(C109544Rq c109544Rq) {
        String str;
        C99033ud c99033ud;
        C99033ud c99033ud2 = this.LJLJI;
        String str2 = null;
        if (c99033ud2 != null) {
            str = c99033ud2.getLastMsgUUIdWhenEnterChatRoom();
        } else {
            str = null;
        }
        if (c109544Rq != null) {
            str2 = c109544Rq.getUuid();
        }
        if (!o.LJ(str, str2) || (c99033ud = this.LJLJI) == null) {
            return false;
        }
        return c99033ud.isLastMsgReadWhenEnterChatRoom();
    }

    @Override // X.InterfaceC1029942l
    public final void rD(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void zG(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void M1(List<C109544Rq> list, boolean z) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadOlder: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("ReadStateViewModel", X1D.LIZIZ(LIZ));
    }

    public final void gv0(Fragment fragment, InterfaceC102153zf interfaceC102153zf) {
        C34B.LIZIZ("ReadStateViewModel", "attachObserver");
        if (!this.LJLILLLLZI) {
            return;
        }
        C99033ud c99033ud = this.LJLJI;
        if (c99033ud != null && c99033ud.isGroupChat()) {
            return;
        }
        this.LJLIL.LIZJ().observe(fragment, interfaceC102153zf, true);
    }

    @Override // X.InterfaceC1029942l
    public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v0(List<C109544Rq> list, boolean z) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadNewer: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("ReadStateViewModel", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void K7(int i, String str, List list) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onQueryMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("ReadStateViewModel", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void X8(Map map, int i, List list) {
        Integer num;
        Integer num2;
        AbsReadStateDelegate absReadStateDelegate;
        Object obj;
        String str;
        C109544Rq c109544Rq;
        String str2;
        String str3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateMessage: ");
        Integer num3 = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append("  && ");
        if (map != null) {
            num2 = Integer.valueOf(map.size());
        } else {
            num2 = null;
        }
        LIZ.append(num2);
        LIZ.append(", , isLocalIndex ");
        o.LJI(list);
        LIZ.append(o.LJ(((C109544Rq) ListProtector.get(list, 0)).getLocalExt().get("s:message_index_is_local"), "1"));
        C34B.LIZIZ("ReadStateViewModel", X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                C109544Rq c109544Rq2 = (C109544Rq) obj2;
                if (c109544Rq2 != null) {
                    str2 = c109544Rq2.getConversationId();
                } else {
                    str2 = null;
                }
                InterfaceC99713vj interfaceC99713vj = this.LJLIL.LIZ;
                if (interfaceC99713vj != null) {
                    str3 = interfaceC99713vj.getConversationId();
                } else {
                    str3 = null;
                }
                if (o.LJ(str2, str3)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty() || (absReadStateDelegate = (AbsReadStateDelegate) this.LJLJJL.getValue()) == null || arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String uuid = ((C109544Rq) obj).getUuid();
                    C102093zZ value = absReadStateDelegate.LJLIL.LIZJ().getValue();
                    if (value != null && (c109544Rq = value.LIZ) != null) {
                        str = c109544Rq.getUuid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(uuid, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C109544Rq c109544Rq3 = (C109544Rq) obj;
            if (c109544Rq3 == null) {
                return;
            }
            C102073zX c102073zX = absReadStateDelegate.LJLIL;
            C102093zZ value2 = c102073zX.LIZJ().getValue();
            if (value2 != null) {
                num3 = Integer.valueOf(value2.LIZIZ);
            }
            c102073zX.LIZLLL(c109544Rq3, num3);
        }
    }

    public final void jv0(String conversationId, InterfaceC99713vj interfaceC99713vj, C99033ud sessionInfo) {
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        C34B.LIZIZ("ReadStateViewModel", "setup");
        this.LJLILLLLZI = true;
        this.LJLJI = sessionInfo;
        this.LJLIL.LIZIZ().clear();
        this.LJLIL.LIZJ().setValue(null);
        C96423qQ.LIZ();
        C4Z2.LJIIJ(conversationId, this);
        C102073zX c102073zX = this.LJLIL;
        c102073zX.getClass();
        c102073zX.LIZ = interfaceC99713vj;
        c102073zX.LIZIZ = sessionInfo;
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
        String str;
        Map<String, String> localExt;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSendMessage: isLocalIndex ");
        if (c109544Rq != null && (localExt = c109544Rq.getLocalExt()) != null) {
            str = localExt.get("s:message_index_is_local");
        } else {
            str = null;
        }
        LIZ.append(o.LJ(str, "1"));
        C34B.LIZIZ("ReadStateViewModel", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void x6(List<C109544Rq> list, int i, C107074Id extra) {
        Integer num;
        o.LJIIIZ(extra, "extra");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGetMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(' ');
        LIZ.append(i);
        LIZ.append("  ");
        LIZ.append(extra);
        C34B.LIZIZ("ReadStateViewModel", X1D.LIZIZ(LIZ));
        ReadStateMarkDelegate hv0 = hv0();
        hv0.getClass();
        C34B.LIZIZ("ReadStateMarkDelegate", "onMessageComing");
        hv0.LJLILLLLZI = true;
        if (hv0.LJLJJI) {
            hv0.LIZ();
        } else {
            C34B.LIZIZ("ReadStateMarkDelegate", "applyMarkStrategyA");
            hv0.sendEmptyMessageDelayed(0, 2000L);
            hv0.LJLJJLL = 2000L;
        }
        ReadStateSyncDelegate readStateSyncDelegate = (ReadStateSyncDelegate) this.LJLJJL.getValue();
        if (readStateSyncDelegate != null) {
            C34B.LIZIZ("ReadStateSyncDelegate", "onMessageInComing");
            C99033ud c99033ud = readStateSyncDelegate.LJLIL.LIZIZ;
            if (c99033ud != null && c99033ud.isGroupChat()) {
                readStateSyncDelegate.LIZIZ();
                return;
            }
            readStateSyncDelegate.LJLIL.LIZLLL(null, -1);
            C102083zY c102083zY = (C102083zY) readStateSyncDelegate.LJLIL.LIZJ.getValue();
            if (c102083zY == null) {
                return;
            }
            c102083zY.LIZ();
        }
    }
}
