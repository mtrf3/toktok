package com.bytedance.pumbaa.hybrid.impl.jsb;

import X.C141335gf;
import X.C38386F4s;
import X.C39489Fef;
import X.C39507Fex;
import X.C39508Fey;
import X.C39509Fez;
import X.C3C4;
import X.C3C5;
import X.C76800UCe;
import X.EXK;
import X.InterfaceC39517Ff7;
import X.ORY;
import X.VNU;
import X.X1D;
import android.webkit.ValueCallback;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.hybrid.base.BridgeConfig;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class BridgeHookDispatcher {
    public static final BridgeHookDispatcher INSTANCE = new BridgeHookDispatcher();
    public static List<InterfaceC39517Ff7> chain = new ArrayList();
    public static BridgeConfig config;
    public static ILogger logger;
    public static C39508Fey lynxBridgeManager;
    public static C39507Fex webBridgeManager;

    public final List<InterfaceC39517Ff7> getChain() {
        return chain;
    }

    public final BridgeConfig getConfig$com_bytedance_pumbaa_hybrid_impl() {
        return config;
    }

    public final void registerBridgeInterceptor(InterfaceC39517Ff7 interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        chain.add(interceptor);
    }

    public final void removeBridgeInterceptor(InterfaceC39517Ff7 interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        chain.remove(interceptor);
    }

    public final void setChain(List<InterfaceC39517Ff7> list) {
        o.LJIIIZ(list, "<set-?>");
        chain = list;
    }

    public final void setConfig$com_bytedance_pumbaa_hybrid_impl(BridgeConfig bridgeConfig) {
        config = bridgeConfig;
    }

    public final void updateSettings(BridgeConfig config2) {
        o.LJIIIZ(config2, "config");
        config = config2;
    }

    public final void hookCallback(Callback callback, Object... callbackParams) {
        C39489Fef c39489Fef;
        o.LJIIIZ(callbackParams, "callbackParams");
        C39508Fey c39508Fey = lynxBridgeManager;
        if (c39508Fey != null) {
            Object obj = null;
            if (callback != null) {
                try {
                    String valueOf = String.valueOf(callback.hashCode());
                    if (valueOf != null && (c39489Fef = c39508Fey.LIZ.get(valueOf)) != null && c39489Fef.LJLJJI) {
                        C39489Fef L = C39489Fef.L(c39489Fef, C38386F4s.LJFF(ORY.LJJZZIII(callbackParams)), null, 524223);
                        Iterator<InterfaceC39517Ff7> it = c39508Fey.LIZJ.getChain().iterator();
                        while (it.hasNext()) {
                            it.next().LIZIZ(L);
                        }
                        c39508Fey.LIZ.remove(c39489Fef.LJLIL);
                        obj = Boolean.valueOf(c39508Fey.LIZIZ.remove(c39489Fef.LJLIL));
                    }
                } catch (Throwable th) {
                    obj = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(obj);
                }
            }
            C3C5.m7constructorimpl(obj);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
            if (m10exceptionOrNullimpl != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onLynxBridgeCallback error: ");
                LIZ.append(m10exceptionOrNullimpl);
                LIZ.append(", stack: ");
                LIZ.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                X1D.LIZIZ(LIZ);
            }
        }
    }

    public final void hookWebCallback(String str, ValueCallback<String> valueCallback) {
        Object LIZ;
        C39507Fex c39507Fex = webBridgeManager;
        if (c39507Fex != null && str != null) {
            try {
                if (ujb.o.LJJJLIIL(str, "javascript:", false) && !s.LJJJLZIJ(str, "__event_id", false) && s.LJJJLZIJ(str, "__callback_id", false) && s.LJJJLZIJ(str, "__params", false) && s.LJJJLZIJ(str, "__msg_type", false)) {
                    if (!s.LJJJLZIJ(str, "_handleMessageFromApp(", false)) {
                        if (s.LJJJLZIJ(str, "_handleMessageFromToutiao(", false)) {
                            c39507Fex.LIZIZ(str, "_handleMessageFromToutiao(", ")");
                        } else if (s.LJJJLZIJ(str, "iframe.contentWindow.postMessage(", false)) {
                            c39507Fex.LIZIZ(str, "iframe.contentWindow.postMessage(", "atob(");
                        }
                    } else {
                        c39507Fex.LIZIZ(str, "_handleMessageFromApp(", ")");
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onWebBridgeCallback error: ");
                LIZ2.append(m10exceptionOrNullimpl);
                LIZ2.append(", stack: ");
                LIZ2.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                X1D.LIZIZ(LIZ2);
            }
        }
    }

    public final void hookReturn(int i, Object obj, String[] metaInfo) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        o.LJIIIZ(metaInfo, "metaInfo");
        Object obj2 = null;
        switch (i) {
            case 300001:
                C39507Fex c39507Fex = webBridgeManager;
                if (c39507Fex == null) {
                    return;
                }
                try {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = c39507Fex.LIZIZ;
                    ListIterator<String> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            str5 = listIterator.previous();
                            C39489Fef c39489Fef = c39507Fex.LIZ.get(str5);
                            if (c39489Fef != null) {
                                str6 = c39489Fef.LJLLI;
                            } else {
                                str6 = null;
                            }
                            if (o.LJ(str6, metaInfo[0])) {
                                if (c39489Fef == null) {
                                    str7 = null;
                                } else {
                                    str7 = c39489Fef.LJLLILLLL;
                                }
                                if (o.LJ(str7, metaInfo[1])) {
                                    if (c39489Fef == null) {
                                        str8 = null;
                                    } else {
                                        str8 = c39489Fef.LJLLJ;
                                    }
                                    if (o.LJ(str8, metaInfo[2])) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            str5 = null;
                        }
                    }
                    String str9 = str5;
                    if (str9 != null) {
                        C39489Fef L = C39489Fef.L(c39507Fex.LIZ.get(str9), null, obj, 524159);
                        Iterator<InterfaceC39517Ff7> it = c39507Fex.LIZJ.getChain().iterator();
                        while (it.hasNext()) {
                            it.next().LIZ(L);
                        }
                        if (!L.LJLJJI) {
                            c39507Fex.LIZ.remove(str9);
                            c39507Fex.LIZIZ.remove(str9);
                        }
                        obj2 = C76800UCe.LIZ;
                    }
                    C3C5.m7constructorimpl(obj2);
                } catch (Throwable th) {
                    obj2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(obj2);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj2);
                if (m10exceptionOrNullimpl == null) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onWebBridgeReturn error:");
                LIZ.append(m10exceptionOrNullimpl);
                LIZ.append(", stack: ");
                LIZ.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                X1D.LIZIZ(LIZ);
                return;
            case 300002:
                C39508Fey c39508Fey = lynxBridgeManager;
                if (c39508Fey == null) {
                    return;
                }
                try {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList2 = c39508Fey.LIZIZ;
                    ListIterator<String> listIterator2 = copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            str = listIterator2.previous();
                            C39489Fef c39489Fef2 = c39508Fey.LIZ.get(str);
                            if (c39489Fef2 != null) {
                                str2 = c39489Fef2.LJLLI;
                            } else {
                                str2 = null;
                            }
                            if (o.LJ(str2, ujb.o.LJJJJZ(metaInfo[0], "/", ".", false))) {
                                if (c39489Fef2 == null) {
                                    str3 = null;
                                } else {
                                    str3 = c39489Fef2.LJLLILLLL;
                                }
                                if (o.LJ(str3, metaInfo[1])) {
                                    if (c39489Fef2 == null) {
                                        str4 = null;
                                    } else {
                                        str4 = c39489Fef2.LJLLJ;
                                    }
                                    if (o.LJ(str4, metaInfo[2])) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            str = null;
                        }
                    }
                    String str10 = str;
                    if (str10 != null) {
                        C39489Fef L2 = C39489Fef.L(c39508Fey.LIZ.get(str10), null, obj, 524159);
                        Iterator<InterfaceC39517Ff7> it2 = c39508Fey.LIZJ.getChain().iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ(L2);
                        }
                        if (!L2.LJLJJI) {
                            c39508Fey.LIZ.remove(str10);
                            c39508Fey.LIZIZ.remove(str10);
                        }
                        obj2 = C76800UCe.LIZ;
                    }
                    C3C5.m7constructorimpl(obj2);
                } catch (Throwable th2) {
                    obj2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(obj2);
                }
                Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(obj2);
                if (m10exceptionOrNullimpl2 == null) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onLynxBridgeReturn error: ");
                LIZ2.append(m10exceptionOrNullimpl2);
                LIZ2.append(", stack: ");
                LIZ2.append(C38386F4s.LIZJ(m10exceptionOrNullimpl2, false));
                X1D.LIZIZ(LIZ2);
                return;
            default:
                return;
        }
    }

    public final void init(ILogger iLogger, List<InterfaceC39517Ff7> chain2, BridgeConfig config2) {
        o.LJIIIZ(chain2, "chain");
        o.LJIIIZ(config2, "config");
        config = config2;
        chain.addAll(chain2);
        logger = iLogger;
        EXK.LIZLLL(new C39509Fez(config2));
        lynxBridgeManager = new C39508Fey(this);
        webBridgeManager = new C39507Fex(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean hookParams(int i, Object obj, String[] metaInfo, Object[] params) {
        C39489Fef LIZ;
        Object LIZ2;
        Field declaredField;
        C39489Fef LIZ3;
        o.LJIIIZ(metaInfo, "metaInfo");
        o.LJIIIZ(params, "params");
        boolean z = true;
        C3C4 c3c4 = null;
        switch (i) {
            case 300001:
                C39507Fex c39507Fex = webBridgeManager;
                if (c39507Fex == null) {
                    return false;
                }
                try {
                    LIZ = C39507Fex.LIZ(obj, ORY.LJJZZIII(metaInfo), ORY.LJJZZIII(params));
                } catch (Throwable th) {
                    c3c4 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(c3c4);
                }
                if (LIZ != 0) {
                    c39507Fex.LIZIZ.add(LIZ.LJLIL);
                    c39507Fex.LIZ.put(LIZ.LJLIL, LIZ);
                    Iterator<InterfaceC39517Ff7> it = c39507Fex.LIZJ.getChain().iterator();
                    while (it.hasNext()) {
                        if (it.next().LIZJ(C39489Fef.L(LIZ, null, null, 524287))) {
                            return z;
                        }
                    }
                    c3c4 = LIZ;
                }
                C3C5.m7constructorimpl(c3c4);
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
                if (m10exceptionOrNullimpl != null) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("onWebBridgeInvoke error:");
                    LIZ4.append(m10exceptionOrNullimpl);
                    LIZ4.append(", stack: ");
                    LIZ4.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                    X1D.LIZIZ(LIZ4);
                }
                z = false;
                return z;
            case 300002:
                C39508Fey c39508Fey = lynxBridgeManager;
                if (c39508Fey == null) {
                    return false;
                }
                try {
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if ((obj instanceof LynxModule) && (declaredField = LynxModule.class.getDeclaredField("mContext")) != null) {
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (!(obj2 instanceof VNU)) {
                            obj2 = null;
                        }
                        VNU vnu = (VNU) obj2;
                        if (vnu != null && (LIZ3 = C39508Fey.LIZ(vnu, ORY.LJJZZIII(metaInfo), ORY.LJJZZIII(params))) != null) {
                            c39508Fey.LIZIZ.add(LIZ3.LJLIL);
                            c39508Fey.LIZ.put(LIZ3.LJLIL, LIZ3);
                            Iterator<InterfaceC39517Ff7> it2 = c39508Fey.LIZJ.getChain().iterator();
                            while (it2.hasNext()) {
                                if (it2.next().LIZJ(C39489Fef.L(LIZ3, null, null, 524287))) {
                                    return z;
                                }
                            }
                        }
                    }
                }
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
                Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ2);
                if (m10exceptionOrNullimpl2 != null) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("onLynxBridgeInvoke error: ");
                    LIZ5.append(m10exceptionOrNullimpl2);
                    LIZ5.append(", stack: ");
                    LIZ5.append(C38386F4s.LIZJ(m10exceptionOrNullimpl2, false));
                    X1D.LIZIZ(LIZ5);
                }
                z = false;
                return z;
            default:
                return false;
        }
    }
}
