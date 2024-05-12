package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import X.C109544Rq;
import X.C115074fP;
import X.C16880lQ;
import X.C221108m2;
import X.C34B;
import X.C3KF;
import X.C3L4;
import X.C3L5;
import X.C3OG;
import X.C3PX;
import X.C3PY;
import X.C3PZ;
import X.C3Q9;
import X.C3UD;
import X.C42625Go9;
import X.C49E;
import X.C4WC;
import X.C4Z2;
import X.C62822Ol8;
import X.C63120Opw;
import X.C65232Piu;
import X.C75782yE;
import X.C76800UCe;
import X.C83393Pb;
import X.C84763XOl;
import X.C85773Yf;
import X.C93793mB;
import X.C96423qQ;
import X.EnumC96553qd;
import X.InterfaceC65784Pro;
import X.JBR;
import X.M59;
import X.M5A;
import X.ORZ;
import X.QD3;
import X.V10;
import X.X1D;
import Y.ARunnableS20S0200000_1;
import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class SessionListReadStatusViewModel extends ViewModel implements C3PY, C3UD, M5A {
    public static final /* synthetic */ int LJLL = 0;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public final boolean LJLJJLL = true;
    public final ConcurrentHashMap<String, C3L5> LJLJL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C3OG> LJLJLJ = new ConcurrentHashMap<>();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C3PZ.LJLIL);

    @Override // X.M5A
    public final void onAppEnterBackGround() {
        this.LJLJI = true;
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
    }

    public final NextLiveData<ConcurrentHashMap<String, EnumC96553qd>> gv0() {
        return (NextLiveData) this.LJLJLLL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C4Z2) C96423qQ.LIZ()).LJ(this);
        if (C85773Yf.LJLJI != null) {
            M59 LIZIZ = M59.LIZIZ();
            LIZIZ.getClass();
            synchronized (M59.class) {
                ((CopyOnWriteArrayList) LIZIZ.LJLILLLLZI).remove(this);
            }
        }
        C42625Go9.LIZJ(this);
    }

    @Override // X.C3PY
    public final void onResume() {
        C3PX.onResume(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResume, ");
        LIZ.append(hashCode());
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", X1D.LIZIZ(LIZ));
        if (!C115074fP.LIZJ()) {
            Collection<C3L5> values = this.LJLJL.values();
            o.LJIIIIZZ(values, "totalSessionMap.values");
            jv0(ORZ.LLJI(values));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onResume ,isInImPage ");
        C49E LIZ3 = C83393Pb.LIZ();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        LIZ3.getClass();
        LIZ2.append(C49E.LIZ(LJIIIIZZ));
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", X1D.LIZIZ(LIZ2));
        C49E LIZ4 = C83393Pb.LIZ();
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        LIZ4.getClass();
        if (C49E.LIZ(LJIIIIZZ2) && this.LJLJI) {
            Collection<C3L5> values2 = this.LJLJL.values();
            o.LJIIIIZZ(values2, "totalSessionMap.values");
            jv0(ORZ.LLJI(values2));
        }
        this.LJLJI = false;
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C3PX.onCreate(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C3PX.onDestroy(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C3PX.onPause(this);
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

    @Override // X.C3UD
    public final void Lr0(List<C3OG> list) {
        if (list != null && (!list.isEmpty())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReadCountChange: ");
            LIZ.append(list.size());
            C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", X1D.LIZIZ(LIZ));
            iv0(list);
        }
    }

    public final void hv0(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", "setUp");
        ((C4Z2) C96423qQ.LIZ()).LJIIIIZZ(this);
        if (C85773Yf.LJLJI != null) {
            M59.LIZIZ().LIZJ(this);
        }
        C42625Go9.LIZIZ(this);
        interfaceC65784Pro.invoke();
    }

    public final void iv0(List<? extends C3OG> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("syncMsgReadStatusMap: ");
        LIZ.append(list.size());
        LIZ.append('}');
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", X1D.LIZIZ(LIZ));
        ConcurrentHashMap<String, EnumC96553qd> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, EnumC96553qd> value = gv0().getValue();
        if (value != null) {
            concurrentHashMap.putAll(value);
        }
        for (C3OG c3og : list) {
            String str = c3og.LIZJ;
            if (str != null) {
                this.LJLJLJ.put(str, c3og);
                C3L5 c3l5 = this.LJLJL.get(str);
                if (c3l5 != null) {
                    lv0(c3l5, c3og);
                    EnumC96553qd enumC96553qd = c3l5.LLII;
                    o.LJIIIIZZ(enumC96553qd, "session.msgStatus");
                    concurrentHashMap.put(str, enumC96553qd);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("syncMsgReadStatusMap -> name: ");
                    LIZ2.append(c3l5.LJ());
                    LIZ2.append("status: ");
                    LIZ2.append(c3l5.LLII);
                    C34B.LIZIZ("MessageStatus-setMsgStatus", X1D.LIZIZ(LIZ2));
                }
            }
        }
        gv0().postValue(concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void jv0(List<? extends C3L4> list) {
        EnumC96553qd enumC96553qd;
        C109544Rq LJIILJJIL;
        C109544Rq LJIILJJIL2;
        ArrayList arrayList = new ArrayList();
        for (C3L4 c3l4 : list) {
            String LJFF = c3l4.LJFF();
            if (LJFF != null && LJFF.length() != 0 && (c3l4 instanceof C3L5)) {
                String conversationId = c3l4.LJFF();
                if (!this.LJLJL.containsKey(conversationId)) {
                    ConcurrentHashMap<String, C3L5> concurrentHashMap = this.LJLJL;
                    o.LJIIIIZZ(conversationId, "conversationId");
                    concurrentHashMap.put(conversationId, c3l4);
                } else {
                    C3L5 c3l5 = this.LJLJL.get(conversationId);
                    Long l = null;
                    if (c3l5 != null) {
                        enumC96553qd = c3l5.LLII;
                    } else {
                        enumC96553qd = null;
                    }
                    C3L5 c3l52 = this.LJLJL.get(conversationId);
                    if (c3l52 != null) {
                        l = Long.valueOf(c3l52.LJLJLJ);
                    }
                    ConcurrentHashMap<String, C3L5> concurrentHashMap2 = this.LJLJL;
                    o.LJIIIIZZ(conversationId, "conversationId");
                    concurrentHashMap2.put(conversationId, c3l4);
                    EnumC96553qd enumC96553qd2 = EnumC96553qd.SEEN;
                    if (enumC96553qd == enumC96553qd2) {
                        C3L5 c3l53 = (C3L5) c3l4;
                        long j = c3l53.LJLJLJ;
                        if (l != null && j == l.longValue()) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("prepareBatchQueryMsgList -> name: ");
                            LIZ.append(c3l53.LJ());
                            LIZ.append("status: ");
                            LIZ.append(c3l53.LLII);
                            C34B.LIZIZ("MessageStatus-setMsgStatus", X1D.LIZIZ(LIZ));
                            c3l53.LLII = enumC96553qd2;
                        }
                    }
                }
                C3L5 c3l54 = (C3L5) c3l4;
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(c3l54.LJFF());
                if (c3l54.LJIILLIIL() && c3l54.LLII != EnumC96553qd.SEEN && LIZ2 != null && TextUtils.isEmpty(LIZ2.getDraftContent()) && c3l54.LJIIIIZZ() == 0 && (LJIILJJIL = c3l54.LJIILJJIL()) != null && !C93793mB.LIZLLL(LJIILJJIL) && (LJIILJJIL2 = c3l54.LJIILJJIL()) != null) {
                    arrayList.add(LJIILJJIL2);
                }
            }
        }
        this.LJLIL.post(new ARunnableS20S0200000_1(arrayList, this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kv0(java.util.List<? extends X.C3L4> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = r4.LJLJJL
            if (r0 != 0) goto Ld
            boolean r0 = r4.LJLJJLL
            if (r0 == 0) goto L38
        Ld:
            r4.jv0(r5)
        L10:
            java.util.Iterator r3 = r5.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r3.next()
            X.3L4 r2 = (X.C3L4) r2
            java.lang.String r0 = r2.LJFF()
            if (r0 == 0) goto L14
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3OG> r1 = r4.LJLJLJ
            java.lang.String r0 = r2.LJFF()
            java.lang.Object r0 = r1.get(r0)
            X.3OG r0 = (X.C3OG) r0
            if (r0 == 0) goto L14
            lv0(r2, r0)
            goto L14
        L38:
            java.util.Iterator r3 = r5.iterator()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L10
            java.lang.Object r2 = r3.next()
            X.3L4 r2 = (X.C3L4) r2
            java.lang.String r0 = r2.LJFF()
            if (r0 == 0) goto L3c
            boolean r0 = r2 instanceof X.C3L5
            if (r0 == 0) goto L3c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3L5> r1 = r4.LJLJL
            java.lang.String r0 = r2.LJFF()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L3c
            goto Ld
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel.kv0(java.util.List):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReadStatusChanged(C3KF event) {
        o.LJIIIZ(event, "event");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap<String, EnumC96553qd> value = gv0().getValue();
        if (value != null) {
            concurrentHashMap.putAll(value);
        }
        C3L5 c3l5 = this.LJLJL.get(event.LJLIL);
        if (c3l5 == null || c3l5.LJLJLJ != event.LJLILLLLZI) {
            return;
        }
        EnumC96553qd enumC96553qd = c3l5.LLII;
        EnumC96553qd enumC96553qd2 = EnumC96553qd.SEEN;
        if (enumC96553qd != enumC96553qd2) {
            C3L5 c3l52 = this.LJLJL.get(event.LJLIL);
            if (c3l52 != null) {
                c3l52.LLII = enumC96553qd2;
            }
            String LJFF = c3l5.LJFF();
            o.LJIIIIZZ(LJFF, "session.sessionID");
            concurrentHashMap.put(LJFF, enumC96553qd2);
        }
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", "onReadStatusChanged: name: " + c3l5.LJ() + ", id: " + concurrentHashMap.get(c3l5.LJFF()));
    }

    public static void lv0(C3L4 c3l4, C3OG c3og) {
        boolean z;
        if (c3l4 instanceof C3L5) {
            C3L5 c3l5 = (C3L5) c3l4;
            EnumC96553qd enumC96553qd = c3l5.LLII;
            EnumC96553qd LJIILIIL = C3L5.LJIILIIL(c3l5, c3l5.LJIILJJIL(), c3og);
            c3l5.LLII = LJIILIIL;
            if (LJIILIIL != enumC96553qd) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder LJI = JBR.LJI("updateSessionMsgStatus(hasChanged: ", z, "): ");
            LJI.append(c3l5.LJ());
            LJI.append(": ");
            LJI.append(c3l5.LLII);
            C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", X1D.LIZIZ(LJI));
        }
    }

    @Override // X.C3UD
    public final void gA(Long l, Long l2, String str) {
        C3L5 c3l5;
        List<Long> list;
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        StringBuilder LIZJ = V10.LIZJ("onReadIndexUpdate: ", longValue, ", ");
        C65232Piu.LIZLLL(LIZJ, longValue2, ", ", str);
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", X1D.LIZIZ(LIZJ));
        if (str == null || (c3l5 = this.LJLJL.get(str)) == null) {
            return;
        }
        C109544Rq LJIILJJIL = c3l5.LJIILJJIL();
        boolean z = false;
        if (LJIILJJIL == null || !LJIILJJIL.isSelf() || longValue == LJIILJJIL.getSender()) {
            return;
        }
        EnumC96553qd enumC96553qd = c3l5.LLII;
        if (o.LJ("1", LJIILJJIL.getLocalExt().get("s:message_index_is_local")) || enumC96553qd != EnumC96553qd.SUCCESS) {
            return;
        }
        if (longValue2 >= LJIILJJIL.getIndex()) {
            enumC96553qd = EnumC96553qd.SEEN;
            z = true;
        }
        c3l5.LLII = enumC96553qd;
        if (!z) {
            return;
        }
        C3OG c3og = this.LJLJLJ.get(str);
        if (c3og != null && (list = c3og.LIZ) != null) {
            list.add(Long.valueOf(longValue));
        }
        ConcurrentHashMap<String, EnumC96553qd> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, EnumC96553qd> value = gv0().getValue();
        if (value != null) {
            concurrentHashMap.putAll(value);
        }
        EnumC96553qd enumC96553qd2 = c3l5.LLII;
        o.LJIIIIZZ(enumC96553qd2, "session.msgStatus");
        concurrentHashMap.put(str, enumC96553qd2);
        gv0().setValue(concurrentHashMap);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("syncMsgReadStatusMap -> name: ");
        LIZ.append(c3l5.LJ());
        LIZ.append("status: ");
        LIZ.append(c3l5.LLII);
        C34B.LIZIZ("MessageStatus-setMsgStatus", X1D.LIZIZ(LIZ));
    }
}
