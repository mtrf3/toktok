package X;

import Y.ARunnableS12S0101000_8;
import Y.IDObjectS174S0100000_1;
import Y.IDaS159S0200000_1;
import Y.IDuS313S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.4Rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109434Rf implements InterfaceC48038ItG, InterfaceC82517Wa1, InterfaceC40350FsY, InterfaceC109484Rk, InterfaceC22840v2 {
    public static final C109434Rf LJLIL = new C109434Rf();

    @Override // X.InterfaceC82517Wa1
    public void LIZ() {
    }

    public static final Activity LIZJ(Context activity) {
        Context baseContext;
        o.LJIIJ(activity, "$this$activity");
        if (activity instanceof Activity) {
            return (Activity) activity;
        }
        if (!(activity instanceof ContextWrapper) || (baseContext = ((ContextWrapper) activity).getBaseContext()) == null) {
            return null;
        }
        return LIZJ(baseContext);
    }

    public static final C46985IcH LIZLLL(ARunnableS12S0101000_8 aRunnableS12S0101000_8) {
        return new C46985IcH("TASK_INIT_CACHE_DIR", aRunnableS12S0101000_8);
    }

    public static final C46985IcH LJ(RunnableC45114HnC runnableC45114HnC) {
        return new C46985IcH("TASK_MDL_START", runnableC45114HnC);
    }

    public static final int LJFF(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!FakeMessageKt.isFakeMessage((C109544Rq) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public static final C73429Srp LJII(T5T t5t) {
        o.LJIIIZ(t5t, "<this>");
        C68322mC c68322mC = new C68322mC();
        C73390SrC LJIIJ = AbstractC73672Svk.LJIIJ(new IDuS313S0100000_1(c68322mC, 3));
        IDObjectS174S0100000_1 iDObjectS174S0100000_1 = new IDObjectS174S0100000_1(c68322mC, 8);
        t5t.addTextChangedListener(iDObjectS174S0100000_1);
        return LJIIJ.LJIILLIIL(new IDaS159S0200000_1(t5t, iDObjectS174S0100000_1, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJIILLIIL(java.util.List r12) {
        /*
            X.4kE r5 = X.C118064kE.LJLIL
            java.lang.String r0 = "formatter"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r11 = r12.iterator()
            r1 = 0
        L11:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lfd
            java.lang.Object r3 = r11.next()
            int r2 = r1 + 1
            r0 = 0
            if (r1 < 0) goto Lf9
            X.4Rq r3 = (X.C109544Rq) r3
            r4.add(r3)
            java.lang.Object r10 = X.ORZ.LJLLLLLL(r2, r12)
            X.4Rq r10 = (X.C109544Rq) r10
            java.lang.String r1 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r3, r1)
            r7 = 4001(0xfa1, float:5.607E-42)
            r6 = 15
            if (r10 != 0) goto L93
            int r1 = r3.getMsgType()
            if (r1 == r6) goto L4f
            int r1 = r3.getMsgType()
            if (r1 == r7) goto L4f
            boolean r1 = X.C93793mB.LJIILJJIL(r3)
            if (r1 != 0) goto L4f
            boolean r1 = X.C93793mB.LJIILLIIL(r3)
            if (r1 == 0) goto Le7
        L4f:
            boolean r1 = X.C1DJ.LJIL(r3)
            if (r1 == 0) goto L8f
        L55:
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage$Builder r8 = new com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage$Builder
            r8.<init>()
            r1 = 4006(0xfa6, float:5.614E-42)
            r8.msgType(r1)
            if (r0 != 0) goto L91
            java.lang.String r7 = ""
        L63:
            X.OSZ r6 = new X.OSZ
            java.lang.String r1 = "formatted-timestamp"
            r6.<init>(r1, r7)
            java.util.Map r1 = X.C51029K0z.LJJIIZI(r6)
            r8.localExt(r1)
            X.4Rq r6 = r8.build()
            r6.setUuid(r0)
            long r0 = r3.getIndex()
            r6.setIndex(r0)
            boolean r0 = X.C1DJ.LJIL(r3)
            if (r0 == 0) goto L8c
            r1 = 507(0x1fb, float:7.1E-43)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.putLocalCache(r1, r0)
        L8c:
            r4.add(r6)
        L8f:
            r1 = r2
            goto L11
        L91:
            r7 = r0
            goto L63
        L93:
            int r1 = r10.getMsgType()
            if (r1 == r6) goto L9f
            int r1 = r10.getMsgType()
            if (r1 != r7) goto Lb5
        L9f:
            int r1 = r3.getMsgType()
            if (r1 != r6) goto La6
            goto L4f
        La6:
            long r0 = r3.getCreatedAt()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto Lf5
        Lb5:
            boolean r1 = X.C93793mB.LJIILLIIL(r3)
            if (r1 != 0) goto L4f
            boolean r1 = X.C93793mB.LJIILJJIL(r3)
            if (r1 != 0) goto L4f
            boolean r1 = X.C93793mB.LJIILIIL(r3)
            if (r1 == 0) goto Lc8
            goto L4f
        Lc8:
            long r8 = r3.getCreatedAt()
            long r6 = r10.getCreatedAt()
            long r8 = r8 - r6
            r6 = 300000(0x493e0, double:1.482197E-318)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 < 0) goto L4f
            long r0 = r3.getCreatedAt()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto Lf5
        Le7:
            long r0 = r3.getCreatedAt()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
        Lf5:
            if (r0 != 0) goto L55
            goto L4f
        Lf9:
            X.C47261Igj.LJJJJJ()
            throw r0
        Lfd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109434Rf.LJIILLIIL(java.util.List):java.util.List");
    }

    @Override // X.InterfaceC22840v2
    public void LJIILIIL(C22830v1 outputData) {
        o.LJIIIZ(outputData, "outputData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("task result :: [ code == ");
        LIZ.append(outputData.LIZ);
        LIZ.append(" , data == ");
        LIZ.append(outputData.LIZIZ);
        LIZ.append(" ]");
        C0NB.LJIIIZ("GiftPanelOpenIntentionCollector", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        TEA tea;
        C109444Rg event = (C109444Rg) obj;
        o.LJIIIZ(event, "event");
        Effect effect = event.LJLIL;
        int i = C74522TMo.LIZ[event.LJLILLLLZI.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            tea = TEA.UNKNOWN;
                        } else {
                            tea = TEA.DOWNLOAD_FAILED;
                        }
                    } else {
                        tea = TEA.DOWNLOAD_SUCCESS;
                    }
                } else {
                    tea = TEA.NOT_DOWNLOAD;
                }
            } else {
                tea = TEA.DOWNLOADING;
            }
        } else {
            tea = TEA.UNKNOWN;
        }
        return new C157166Eu(effect, tea, event.LJLJI);
    }

    public static final List LJI(int i, List list) {
        ArrayList arrayList = new ArrayList(i);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C109544Rq c109544Rq = (C109544Rq) ListProtector.get(list, i2);
            if (C98793uF.LIZIZ(c109544Rq)) {
                arrayList.add(c109544Rq);
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static final C109544Rq LJIIIIZZ(C99033ud sessionInfo, List messageList) {
        C109544Rq c109544Rq;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(messageList, "messageList");
        C100053wH pushReferenceInfo = sessionInfo.getPushReferenceInfo();
        if (pushReferenceInfo == null) {
            return null;
        }
        long refMessageId = pushReferenceInfo.getRefMessageId();
        Iterator it = messageList.iterator();
        while (true) {
            if (it.hasNext()) {
                c109544Rq = (C109544Rq) it.next();
                if (c109544Rq.getMsgId() == refMessageId) {
                    break;
                }
            } else {
                String conversationId = sessionInfo.getConversationId();
                o.LJIIIZ(conversationId, "conversationId");
                c109544Rq = new C109544Rq();
                c109544Rq.setMsgType(pushReferenceInfo.getRefMessageType());
                c109544Rq.setContent(pushReferenceInfo.getRefMessageJsonContent());
                c109544Rq.setSender(pushReferenceInfo.getRefSenderUid());
                c109544Rq.setMsgId(pushReferenceInfo.getRefMessageId());
                c109544Rq.setConversationId(conversationId);
                break;
            }
        }
        java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
        o.LJIIIIZZ(localExt, "this.localExt");
        localExt.put("quick_reply_message", "true");
        C91853j3.LIZLLL(c109544Rq, sessionInfo.isGroupChat(), C106674Gp.LJFF(c109544Rq, null), sessionInfo.getEnterMethod(), true);
        return c109544Rq;
    }

    public static final Object LJIIJ(Iterable iterable, InterfaceC88472Yns interfaceC88472Yns) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) interfaceC88472Yns.invoke(next)).booleanValue()) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static final boolean LJIIL(int i, C109544Rq msg) {
        BaseTemplate LJIILL;
        BaseResponseComponent LLILLJJLI;
        o.LJIIIZ(msg, "msg");
        if ((C4LS.LIZIZ() && (msg.getMsgType() == 5 || msg.getMsgType() == 1805)) || C4YR.LIZIZ(msg, C99033ud.Companion)) {
            return false;
        }
        if (C69648RVc.LIZIZ(msg) && ((LJIILL = C1DJ.LJIILL(msg)) == null || (LLILLJJLI = LJIILL.LLILLJJLI()) == null || !C69648RVc.LIZ(LLILLJJLI, C47X.REPLY))) {
            return false;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("im_message_reply_enable", 1) == 2) {
                return msg.isSuccessOrNormal();
            }
        } catch (Throwable unused) {
        }
        if (i != 58 && i != 59) {
            if (msg.getMsgStatus() == 3) {
                return false;
            }
            return true;
        }
        return msg.isSuccessOrNormal();
    }

    public static final void LJIILL(InterfaceC38628FEa interfaceC38628FEa, AqS167S0100000_1 aqS167S0100000_1) {
        aqS167S0100000_1.invoke(interfaceC38628FEa);
        List<InterfaceC38628FEa> LIZ = interfaceC38628FEa.LIZ();
        if (LIZ != null) {
            Iterator<InterfaceC38628FEa> it = LIZ.iterator();
            while (it.hasNext()) {
                LJIILL(it.next(), aqS167S0100000_1);
            }
        }
    }

    @Override // X.InterfaceC40350FsY
    public boolean LIZIZ(Context context, SparkContext sparkContext) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sparkContext, "sparkContext");
        if (!s.LJJJLZIJ(sparkContext.url, "bypass_presentation_hook=0", false)) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) TranslucentActivity.class);
        C109464Ri.LIZ.getClass();
        C117144ik.LIZIZ.getClass();
        C117144ik.LIZIZ(sparkContext);
        intent.putExtra("SparkContextContainerId", sparkContext.containerId);
        C16880lQ.LIZJ(context, intent);
        return true;
    }

    public static final boolean LJIIIZ(C109544Rq c109544Rq, int i, boolean z) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (z) {
            return false;
        }
        int msgType = c109544Rq.getMsgType();
        if (msgType != 8 && msgType != 11) {
            if (msgType != 22 && msgType != 72 && msgType != 81) {
                if (msgType != 1809) {
                    if (msgType != 3001 && msgType != 25 && msgType != 26) {
                        switch (msgType) {
                            case 1801:
                                String scene = c109544Rq.getScene();
                                if (scene != null) {
                                    switch (scene.hashCode()) {
                                        case -1533934094:
                                            if (scene.equals("now_bonus_invite")) {
                                                return false;
                                            }
                                            break;
                                        case -439827310:
                                            if (scene.equals("now_invite")) {
                                                return false;
                                            }
                                            break;
                                        case -158595423:
                                            if (scene.equals("now_signup")) {
                                                return false;
                                            }
                                            break;
                                        case -84391837:
                                            if (scene.equals("point_of_interest")) {
                                                return false;
                                            }
                                            break;
                                        case 1662319721:
                                            if (scene.equals("now_post")) {
                                                return false;
                                            }
                                            break;
                                    }
                                }
                                return c109544Rq.isSuccessOrNormal();
                            case 1802:
                            case 1803:
                                if (!c109544Rq.isSuccessOrNormal() && c109544Rq.getMsgStatus() != 3) {
                                    return false;
                                }
                                return true;
                            default:
                                return false;
                        }
                    }
                } else {
                    return c109544Rq.isSuccessOrNormal();
                }
            }
            return c109544Rq.isSuccessOrNormal();
        }
        if (!c109544Rq.isSuccessOrNormal() && c109544Rq.getMsgStatus() != 1) {
            return false;
        }
        if (i != 800 && i != 810) {
            return false;
        }
        return true;
    }

    public static final void LJIIJJI(Iterable removeIf, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIJ(removeIf, "$this$removeIf");
        Iterator it = removeIf.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) interfaceC88472Yns.invoke(next)).booleanValue()) {
                it.remove();
                interfaceC88472Yns2.invoke(next);
            }
        }
    }

    public static void LJIILJJIL(JSONObject jSONObject, String str, Object obj) {
        if (C38354F3m.LJ(str) || obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
