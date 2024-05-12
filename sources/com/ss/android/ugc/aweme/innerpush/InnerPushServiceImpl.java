package com.ss.android.ugc.aweme.innerpush;

import X.C10K;
import X.C141335gf;
import X.C3C5;
import X.C51764KTg;
import X.C52703KmJ;
import X.C56964MXg;
import X.C57419MgB;
import X.C58242MtS;
import X.C76800UCe;
import X.C78456Uqi;
import X.C84763XOl;
import X.C86478Xwo;
import X.C86494Xx4;
import X.C86496Xx6;
import X.C86497Xx7;
import X.C86500XxA;
import X.C86505XxF;
import X.C86506XxG;
import X.C86512XxM;
import X.C86537Xxl;
import X.C86547Xxv;
import X.C86548Xxw;
import X.EF7;
import X.EnumC86508XxI;
import X.EnumC86510XxK;
import X.EnumC86549Xxx;
import X.FCD;
import X.HandlerC86501XxB;
import X.InterfaceC55341Lnl;
import X.InterfaceC65784Pro;
import X.InterfaceC86486Xww;
import X.InterfaceC86533Xxh;
import X.X1D;
import Y.ACallableS112S0100000_9;
import com.bytedance.push.PushBody;
import com.ss.android.ugc.aweme.innerpush.api.IInnerPushService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class InnerPushServiceImpl implements IInnerPushService {
    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJFF() {
        return C86537Xxl.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void init() {
        C86500XxA c86500XxA = C86500XxA.LJLIL;
        synchronized (c86500XxA) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("triggerInit, isInit:");
            LIZ.append(C86500XxA.LJLJJI);
            C86478Xwo.LIZLLL("InnerPushManager", X1D.LIZIZ(LIZ));
            if (!C86500XxA.LJLJJI) {
                C86500XxA.LIZIZ(true);
                c86500XxA.LIZ();
                C86500XxA.LJLJJI = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC55341Lnl LJ() {
        return C56964MXg.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZIZ(String str) {
        C86537Xxl.LIZ.LIZIZ(str, false);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LIZJ(C51764KTg localPush) {
        JSONObject jSONObject;
        EnumC86508XxI enumC86508XxI;
        o.LJIIIZ(localPush, "localPush");
        if (C84763XOl.LJIIJJI) {
            return false;
        }
        long j = localPush.LIZJ;
        int i = localPush.LIZ;
        String str = localPush.LIZIZ;
        long j2 = localPush.LIZLLL;
        InnerPushUITemplate innerPushUITemplate = localPush.LJFF;
        InnerPushConfig innerPushConfig = localPush.LJ;
        Map<String, String> map = localPush.LJI;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        InnerPushMessage innerPushMessage = new InnerPushMessage(1, 2, j, j2, null, i, 0, str, 0L, false, innerPushUITemplate, innerPushConfig, null, false, null, false, false, false, localPush.LJII, String.valueOf(jSONObject), j, null, false, 6517584, null);
        if (innerPushMessage.getType() == 21) {
            enumC86508XxI = EnumC86508XxI.FROM_DM;
        } else {
            enumC86508XxI = EnumC86508XxI.FROM_LOCAL;
        }
        innerPushMessage.markReceiveFrom(enumC86508XxI);
        C86496Xx6.LJIIJ(innerPushMessage);
        HandlerC86501XxB.LIZIZ(HandlerC86501XxB.LIZ, innerPushMessage, 0L, 6);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LIZLLL(boolean z) {
        return C86537Xxl.LIZ.LIZLLL(z);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJII(InterfaceC86533Xxh observer) {
        o.LJIIIZ(observer, "observer");
        CopyOnWriteArrayList<InterfaceC86533Xxh> copyOnWriteArrayList = C86506XxG.LIZ;
        if (!copyOnWriteArrayList.isEmpty()) {
            copyOnWriteArrayList.remove(observer);
        }
        if (!C86506XxG.LIZ().isEmpty()) {
            Iterator it = C86506XxG.LIZ().entrySet().iterator();
            while (it.hasNext()) {
                ((List) ((Map.Entry) it.next()).getValue()).remove(observer);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIIZ(JSONObject jSONObject) {
        Object obj;
        if (C86547Xxv.LIZ) {
            if (!FCD.LJI(EF7.LIZIZ())) {
                C86478Xwo.LIZIZ("ExternalPushNotifier", "received push in sub-process");
            } else {
                try {
                    InnerPushMessage LIZ = C78456Uqi.LIZ(EnumC86508XxI.FROM_EXTERNAL, jSONObject);
                    InnerPushMessage innerPushMessage = LIZ;
                    if (LIZ == null) {
                        PushBody pushBody = new PushBody(jSONObject);
                        InnerPushMessage LJIIIIZZ = C57419MgB.LJIIIIZZ(pushBody.extra, true);
                        if (LJIIIIZZ != null) {
                            C57419MgB.LIZJ(LJIIIIZZ, pushBody);
                            long rid = LJIIIIZZ.getRid();
                            innerPushMessage = LJIIIIZZ;
                            if (rid == 0) {
                                LJIIIIZZ.setRid(pushBody.rid64);
                                innerPushMessage = LJIIIIZZ;
                            }
                        }
                    }
                    C3C5.m7constructorimpl(innerPushMessage);
                    obj = innerPushMessage;
                } catch (Throwable th) {
                    Object LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                    obj = LIZ2;
                }
                if (C3C5.m13isSuccessimpl(obj)) {
                    InnerPushMessage innerPushMessage2 = (InnerPushMessage) obj;
                    C86496Xx6.LJIIJ(innerPushMessage2);
                    EnumC86510XxK LIZJ = C86494Xx4.LIZJ(innerPushMessage2);
                    if (!((Boolean) C52703KmJ.LIZ.getValue()).booleanValue()) {
                        C86497Xx7.LJI(innerPushMessage2);
                        if (LIZJ == EnumC86510XxK.BY_DUPLICATION) {
                            return true;
                        }
                    } else {
                        innerPushMessage2.markReceiveFrom(EnumC86508XxI.FROM_EXTERNAL);
                        if (C86505XxF.LIZ(innerPushMessage2)) {
                            return true;
                        }
                        if (LIZJ == EnumC86510XxK.BY_DUPLICATION) {
                            C86478Xwo.LIZLLL("ExternalPushNotifier", "received external push success, will drop by duplication: " + innerPushMessage2);
                            return true;
                        }
                        if (LIZJ == EnumC86510XxK.PASS && !C84763XOl.LJIIJJI) {
                            C86478Xwo.LIZLLL("ExternalPushNotifier", "received external push success, will popup inner: " + innerPushMessage2);
                            HandlerC86501XxB.LIZIZ(HandlerC86501XxB.LIZ, innerPushMessage2, 0L, 6);
                            return true;
                        }
                        C86478Xwo.LIZLLL("ExternalPushNotifier", "received external push success, will popup external: " + C84763XOl.LJIIJJI + ", " + LIZJ + ", " + innerPushMessage2);
                        o.LJIIIIZZ(C10K.LIZIZ(new ACallableS112S0100000_9(new AqS165S0100000_15(innerPushMessage2, 740), (InterfaceC65784Pro<C76800UCe>) 17), C10K.LJI, null), "block: () -> Unit): Task…Task.BACKGROUND_EXECUTOR)");
                    }
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
                if (m10exceptionOrNullimpl != null) {
                    C86478Xwo.LIZJ("ExternalPushNotifier", "received external push failed", m10exceptionOrNullimpl);
                    C86496Xx6.LJIIIIZZ(null, "external_receive_msg", m10exceptionOrNullimpl.getMessage());
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIJ(String str) {
        try {
            InnerPushMessage LJIIIIZZ = C57419MgB.LJIIIIZZ(str, false);
            if (LJIIIIZZ == null) {
                return false;
            }
            if (LJIIIIZZ.getProtocol() != 2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIJJI(InterfaceC86486Xww interfaceC86486Xww) {
        C58242MtS.LIZIZ(interfaceC86486Xww);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC86486Xww LJIIL(int i) {
        return C58242MtS.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZ(boolean z, boolean z2) {
        C86512XxM.LIZIZ = z;
        if (z) {
            C86506XxG.LIZLLL(21, null);
        } else {
            C86506XxG.LIZIZ(21, null, z2, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJI(boolean z, boolean z2) {
        C86512XxM.LIZ = z;
        if (z) {
            C86506XxG.LIZLLL(23, null);
        } else {
            C86506XxG.LIZIZ(23, null, z2, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIIIZZ(InterfaceC86533Xxh observer, int[] iArr) {
        o.LJIIIZ(observer, "observer");
        C86506XxG.LJ(observer, iArr);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIILIIL(EnumC86549Xxx event, InnerPushMessage innerPushMessage, String actionType) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(actionType, "actionType");
        int i = C86548Xxw.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C86496Xx6.LJII(innerPushMessage, o.LJ(actionType, "slide_up"));
                    return;
                }
                C86496Xx6.LJIIJ(innerPushMessage);
                return;
            }
            C86496Xx6.LJIIJJI(innerPushMessage);
            return;
        }
        C86496Xx6.LJI(innerPushMessage, actionType);
    }
}
