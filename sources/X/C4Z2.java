package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.im.core.service.IMCoreProxyService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.4Z2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Z2 implements C3AB {
    @Override // X.C3AB
    public final void LIZLLL() {
        C4Z6 reason = C4Z6.NET;
        o.LJIIIZ(reason, "reason");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullMessage: ");
        LIZ.append(reason);
        c114834f1.i("SDKMessagePuller", X1D.LIZIZ(LIZ));
        XKX.LIZLLL(C4Z3.LIZ, null, null, new C4Z5(null), 3);
    }

    public static final void LJIILLIIL() {
        C4Z9 c4z9 = C4Z9.LJLIL;
        long elapsedRealtime = SystemClock.elapsedRealtime() - IMCoreProxyService.LIZ;
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initPlatform: ");
        C1FL.LJFF(LIZ, C4Z9.LJLILLLLZI, ", ", 0, ", ");
        LIZ.append(elapsedRealtime);
        c114834f1.i("PlatformManager", X1D.LIZIZ(LIZ));
        if (C4Z9.LJLILLLLZI) {
            return;
        }
        C4Z9.LJLILLLLZI = true;
        C4ZL.LIZ();
        C4ZG.LLLLZ(c4z9);
        C4ZL.LIZLLL();
        C76482zM.LIZ(c4z9);
        C4Z8.LJI(c4z9);
        C114434eN.LJLIL.LJIIIIZZ(false);
    }

    public final void LJIIIZ() {
        C63309Osz.LIZLLL().LIZIZ = C3E3.LIZ;
    }

    public static final Context LJIILJJIL() {
        return C63308Osy.LJI().LIZ;
    }

    public static final boolean LJIIZILJ() {
        return C63308Osy.LJI().LJ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4ZC] */
    public static final void LJIJJLI() {
        C63308Osy.LJI().LJIILJJIL = new Object() { // from class: X.4ZC
        };
    }

    public final void LJIJI() {
        C63308Osy.LJI().LJIIL(2, 4);
    }

    public final void LJIJJ() {
        C63308Osy.LJI().getClass();
        C63291Osh.LIZ().getClass();
        if (!C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIIZZ(2, "im_init"))) {
            synchronized (C63308Osy.LJI()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("IMClient retryInit:");
                LIZ.append(2);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                C63356Otk.LJIIIZ().getClass();
                new C63294Osk(2).LJIIZILJ(true);
            }
        }
    }

    public static final void LJIIJJI() {
        C63310Ot0.LJ();
    }

    public static final void LJIIL() {
        C63310Ot0.LJFF();
    }

    public static final java.util.Map<String, List<C117824jq>> LJIILIIL(List<String> list) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from attchment where ");
                LIZ.append(EnumC117884jw.COLUMN_HASH.key);
                LIZ.append(" in (");
                StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
                int i = 0;
                while (true) {
                    arrayList = (ArrayList) list;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    sb.append("?");
                    if (i != arrayList.size() - 1) {
                        sb.append(",");
                    }
                    i++;
                }
                sb.append(")");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(sb.toString(), (String[]) arrayList.toArray(new String[0]));
                Iterator it = ((ArrayList) C117834jr.LIZJ(interfaceC63132Oq8)).iterator();
                while (it.hasNext()) {
                    C117824jq c117824jq = (C117824jq) it.next();
                    List list2 = (List) hashMap.get(c117824jq.getHash());
                    if (list2 == null) {
                        list2 = new ArrayList();
                        hashMap.put(c117824jq.getHash(), list2);
                    }
                    list2.add(c117824jq);
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMAttachmentDao getAttachments2 ", e);
                C63337OtR.LJ("IMAttachmentDao getAttachments2", e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "getAttachmentsMapByMD5");
            return hashMap;
        } catch (Throwable th) {
            C63143OqJ.LIZ(interfaceC63132Oq8);
            throw th;
        }
    }

    public static final long LJIILL(int[] iArr) {
        try {
            if (iArr.length == 0) {
                InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
                if (LJI == null) {
                    return 0L;
                }
                return LJI.LJJJJIZL(null);
            }
            StringBuilder sb = new StringBuilder("(");
            for (int i = 0; i < iArr.length; i++) {
                sb.append(iArr[i]);
                if (i < iArr.length - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EnumC63154OqU.COLUMN_MSG_TYPE.key);
            LIZ.append(" in ");
            LIZ.append((Object) sb);
            String LIZIZ = X1D.LIZIZ(LIZ);
            InterfaceC78848Ux2 LJI2 = C63143OqJ.LJII().LJI();
            if (LJI2 == null) {
                return 0L;
            }
            return LJI2.LJJJJIZL(LIZIZ);
        } catch (Exception e) {
            C63322OtC.LJ("IMMsgDao getMsgCountByMsgType", e);
            C63337OtR.LJFF(e);
            C63322OtC.LIZLLL("IMMsgDao getMsgCountByMsgType 0");
            return 0L;
        }
    }

    public static final void LJIL(int[] iArr) {
        C63308Osy.LJI().LIZLLL().LJIJ = iArr;
    }

    public static final void LJJI(int[] iArr) {
        C63308Osy.LJI().LIZLLL().LJIIZILJ = iArr;
    }

    public static final void LJJIFFI(Context context) {
        C63308Osy LJI = C63308Osy.LJI();
        LJI.getClass();
        if (context == null || C16880lQ.LLLLL(context) == null) {
            return;
        }
        LJI.LIZ = C16880lQ.LLLLL(context);
    }

    @Override // X.C3AB
    public final void LIZ(EnumC100693xJ scene) {
        o.LJIIIZ(scene, "scene");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBizSceneChanged: ");
        LIZ.append(scene);
        c114834f1.i("PlatformManager", X1D.LIZIZ(LIZ));
        int i = C100703xK.LIZ[scene.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C4ZL.LJ().LJ();
                    C85773Yf.LIZJ(scene);
                    return;
                }
                if (C4LY.LIZ()) {
                    C4ZL.LJ().LJ();
                    C85773Yf.LIZJ(scene);
                    return;
                } else {
                    C114434eN.LJLIL.LJI(false);
                    return;
                }
            }
            if (C4LY.LIZ()) {
                C4ZL.LJ().LJ();
                C85773Yf.LIZJ(scene);
                return;
            } else {
                C114434eN.LJLIL.LJI(false);
                return;
            }
        }
        if (C4LY.LIZ()) {
            C4ZL.LJ().LJ();
            C85773Yf.LIZJ(scene);
        } else {
            C114434eN.LJLIL.LJI(false);
        }
    }

    @Override // X.C3AB
    public final void LIZIZ(InterfaceC99673vf observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) C99993wB.LJLJI.getValue()).add(observer);
    }

    @Override // X.C3AB
    public final void LIZJ(C4ZE observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJII).remove(observer);
    }

    @Override // X.C3AB
    public final void LJ(C3UD observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJIIIIZZ).remove(observer);
    }

    @Override // X.C3AB
    public final void LJFF(C782535h observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) C99993wB.LJLJI.getValue()).remove(observer);
    }

    @Override // X.C3AB
    public final void LJII(C4ZE observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJII).add(observer);
    }

    @Override // X.C3AB
    public final void LJIIIIZZ(C3UD observer) {
        o.LJIIIZ(observer, "observer");
        ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJIIIIZZ).add(observer);
    }

    public final void LJJ(C82993Nn sortOrderGenerator) {
        o.LJIIIZ(sortOrderGenerator, "sortOrderGenerator");
        C63308Osy.LJI().LJFF = sortOrderGenerator;
    }

    public static final void LJIIJ(String conversationId, InterfaceC99673vf observer) {
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(observer, "observer");
        C63309Osz.LIZLLL().LJIILJJIL(conversationId, observer);
    }

    public static final void LJIJ(java.util.Map<String, ? extends Object> map, boolean z) {
        C4Z6 reason = C4Z6.IM_BIZ;
        o.LJIIIZ(reason, "reason");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("manualPullMessage: ");
        LIZ.append(reason);
        LIZ.append(' ');
        LIZ.append(map);
        c114834f1.i("SDKMessagePuller", X1D.LIZIZ(LIZ));
        XKX.LIZLLL(C4Z3.LIZ, null, null, new C4Z4(z, map, null), 3);
    }

    @Override // X.C3AB
    public final void LJI(String conversationId, InterfaceC99673vf observer) {
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(observer, "observer");
        C63309Osz.LIZLLL().LJIILLIIL(conversationId, observer);
    }
}
