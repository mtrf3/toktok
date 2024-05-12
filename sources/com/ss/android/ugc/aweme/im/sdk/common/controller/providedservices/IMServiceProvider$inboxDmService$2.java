package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C3KU;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.view.InboxHorizontalFriendCell;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS20S0010000_1;
import kotlin.jvm.internal.AqS3S0011000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class IMServiceProvider$inboxDmService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C3KU> {
    public static final IMServiceProvider$inboxDmService$2 INSTANCE = new IMServiceProvider$inboxDmService$2();

    public IMServiceProvider$inboxDmService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3KU] */
    @Override // X.InterfaceC65784Pro
    public final C3KU invoke() {
        return new IImInboxDmService() { // from class: X.3KU
            public final C62822Ol8 LIZ = C221108m2.LIZIZ(C3KZ.LJLIL);

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getDmCell() {
                return new Class[]{InboxHorizontalFriendCell.class};
            }

            public final C3KV LIZ() {
                return (C3KV) this.LIZ.getValue();
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final int getDMRecommendedChatCount() {
                C76662ze.LJLIL.getClass();
                return ((ArrayList) C76662ze.LJII()).size();
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final MLE getDMSessionLoadConfig() {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                if ((C3SX.LIZ() & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((C3SX.LIZ() & 128) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((C3SX.LIZ() & 256) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((C3SX.LIZ() & 512) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((C3SX.LIZ() & 1024) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                return new MLE(z, z2, z3, z4, z5, 16);
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onInboxTabClicked() {
                C76662ze.LJLIL.getClass();
                C76662ze.LJLILLLLZI = true;
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C76762zo(null), 3);
                C84653Tx c84653Tx = C84653Tx.LIZ;
                if (!C42625Go9.LIZ(c84653Tx)) {
                    C42625Go9.LIZIZ(c84653Tx);
                }
                synchronized (C3K5.LJLIL) {
                    C3K5.LIZJ("click_tab", C65222hC.LJLIL);
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onSubmitDMData() {
                synchronized (C3K5.LJLIL) {
                    C3K5.LIZJ("submit_data", null);
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onUnreadBadgeShow() {
                synchronized (C3K5.LJLIL) {
                    if (C3K5.LIZ("received_dm_unread") || C3K5.LIZ("received_notice_unread")) {
                        C3K5.LIZJ("unread_badge_show", C3K9.LJLIL);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final C82093Kb optInboxWhiteScreenTime() {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4 = true;
                if ((C3SE.LIZ() & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((C3SE.LIZ() & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((C3SE.LIZ() & 4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((C3SE.LIZ() & 8) == 0) {
                    z4 = false;
                }
                return new C82093Kb(z, z2, z3, z4);
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void clearDMUnreadCache() {
                LIZ().getClass();
                Keva LIZ = C3KV.LIZ();
                if (LIZ != null) {
                    LIZ.clear();
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final boolean enableSkylightAvatarOpt() {
                return C84673Tz.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final C3KX getCachedDMUnreadInfo() {
                LIZ().getClass();
                return C3KV.LIZJ();
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final C3KX getPostedDMUnreadInfo() {
                return LIZ().LIZLLL;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final boolean hasUnreadMessageRequest() {
                if (C4T4.LIZ() < 1) {
                    return false;
                }
                if (C3TX.LIZIZ()) {
                    C3L2 c3l2 = C771431a.LIZ().LJLILLLLZI.LJLJI;
                    if (c3l2 == null || C82473Ln.LJ(c3l2) == null || !C72302sc.LIZIZ()) {
                        return false;
                    }
                } else {
                    C3L2 c3l22 = C37O.LIZIZ().LJLLLL;
                    if (c3l22 == null || C82473Ln.LJ(c3l22) == null || !C72302sc.LIZIZ()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onNoticeManagerInit() {
                C3KV LIZ = LIZ();
                LIZ.getClass();
                if ((C82133Kf.LIZ() & 2) == 0 || LIZ.LIZIZ) {
                    return;
                }
                LIZ.LIZJ = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C3KW(LIZ, null), 3);
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onSDKLogout() {
                C3KV LIZ = LIZ();
                LIZ.LIZIZ = true;
                XKQ xkq = LIZ.LIZJ;
                if (xkq != null && (true ^ xkq.isCompleted())) {
                    xkq.LIZIZ(null);
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final Object getActiveContacts(InterfaceC67352kd<? super List<C116144h8>> interfaceC67352kd) {
                XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
                xks.LJIIL();
                C3R9 c3r9 = new C3R9(0, false);
                c3r9.LJFF = true;
                c3r9.LJIIJ = true;
                c3r9.LJI = true;
                C3R3 c3r3 = new C3R3(c3r9);
                AbstractC82553Lv.LJI(c3r3, new AqS183S0100000_1(xks, 104), new AqS167S0100000_1(xks, 449));
                c3r3.LIZLLL();
                return xks.LJIIJJI();
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onNodeVisibilityChanged(boolean z) {
                if (z) {
                    C3K5.LJLIL.LIZIZ();
                    return;
                }
                synchronized (C3K5.LJLIL) {
                    if (!C3K5.LJLJJLL && !C3K5.LJLL.isEmpty()) {
                        C3K5.LJLJJLL = true;
                        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C82033Jv(null), 3);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onReceiveInboxPerfMetric(JSONObject data) {
                InterfaceC81953Jn interfaceC81953Jn;
                Integer num;
                AbstractC82423Li abstractC82423Li;
                List<C3L4> LIZIZ;
                o.LJIIIZ(data, "data");
                C3K5 c3k5 = C3K5.LJLIL;
                data.put("total_conv_size", C3K5.LJLJLLL);
                if (C3TX.LIZIZ()) {
                    C82543Lu LIZ = C3K3.LIZ();
                    C81983Jq c81983Jq = LIZ.LJLLI;
                    if (c81983Jq != null && (abstractC82423Li = (AbstractC82423Li) ((ConcurrentHashMap) LIZ.LJLLL).get(c81983Jq)) != null && (LIZIZ = abstractC82423Li.LIZIZ()) != null) {
                        num = Integer.valueOf(LIZIZ.size());
                    } else {
                        num = null;
                    }
                    data.put("inbox_conv_size", num);
                } else {
                    C82253Kr LIZIZ2 = C37O.LIZIZ();
                    C81983Jq c81983Jq2 = LIZIZ2.LJLJJI;
                    int i = 0;
                    if (c81983Jq2 != null && (interfaceC81953Jn = (InterfaceC81953Jn) ((ConcurrentHashMap) LIZIZ2.LJLJI).get(c81983Jq2)) != null) {
                        i = interfaceC81953Jn.LJII().size();
                    }
                    data.put("inbox_conv_size", i);
                }
                C3K5.LIZLLL(c3k5, "im_conv_fluency", null, data, 2);
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onReceiveNoticeData(Throwable th) {
                synchronized (C3K5.LJLIL) {
                    C3K5.LIZJ("received_notice_data", null);
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onReceiveNoticeUnreadCount(boolean z) {
                synchronized (C3K5.LJLIL) {
                    C3K5.LIZJ("received_notice_unread", new AqS20S0010000_1(z, 1));
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onUnreadBubbleShow(boolean z) {
                synchronized (C3K5.LJLIL) {
                    C3K5.LIZJ("unread_bubble_show", new AqS20S0010000_1(z, 2));
                }
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final View getDmEntranceView(Context context, String position) {
                o.LJIIIZ(position, "position");
                if (context != null) {
                    try {
                        int hashCode = position.hashCode();
                        if (hashCode != -1572049565) {
                            if (hashCode != -1271119582) {
                                if (hashCode == 1691937916) {
                                    if (!position.equals("homepage_hot")) {
                                    }
                                }
                            } else if (!position.equals("homepage_follow")) {
                            }
                            return (View) C4SE.LIZ(context, position).LIZ;
                        }
                        if (position.equals("notification_page")) {
                            return (View) C4SE.LIZIZ(context, position).LIZ;
                        }
                    } catch (Exception e) {
                        C34B.LJFF(e);
                    }
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onReceiveDMUnreadCount(int i, boolean z) {
                synchronized (C3K5.LJLIL) {
                    C3K5.LIZJ("received_dm_unread", new AqS3S0011000_1(i, z, 2));
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
            
                if ((!r0.isEmpty()) == true) goto L7;
             */
            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onReceivedDMData(X.C3MD r6, java.lang.Throwable r7) {
                /*
                    r5 = this;
                    if (r6 == 0) goto L16
                    java.util.List<X.3ML> r0 = r6.LIZ
                    if (r0 == 0) goto L16
                    boolean r0 = r0.isEmpty()
                    r1 = 1
                    r0 = r0 ^ 1
                    if (r0 != r1) goto L16
                Lf:
                    r4 = 0
                    if (r1 == 0) goto L2d
                    X.3K5 r1 = X.C3K5.LJLIL
                    monitor-enter(r1)
                    goto L18
                L16:
                    r1 = 0
                    goto Lf
                L18:
                    java.lang.String r0 = "received_dm_data"
                    X.C3K5.LIZJ(r0, r4)     // Catch: java.lang.Throwable -> L1e
                    goto L21
                L1e:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                L21:
                    monitor-exit(r1)
                    X.3Jb r2 = X.C81843Jc.LJ()
                    X.3Ja r1 = X.EnumC81823Ja.INBOX_MEDIATOR
                    X.3JU r0 = X.C3JU.POST_TO_INBOX
                    r2.LIZIZ(r1, r0)
                L2d:
                    X.3K4 r3 = X.C3K4.LIZ
                    java.lang.StringBuilder r2 = X.X1D.LIZ()
                    java.lang.String r0 = "r("
                    r2.append(r0)
                    if (r6 == 0) goto L86
                    java.util.List<X.3ML> r0 = r6.LIZ
                    if (r0 == 0) goto L86
                    int r0 = r0.size()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L46:
                    r2.append(r0)
                    r1 = 95
                    r2.append(r1)
                    if (r6 == 0) goto L84
                    int r0 = r6.LIZJ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L56:
                    r2.append(r0)
                    r2.append(r1)
                    if (r6 == 0) goto L82
                    int r0 = r6.LIZLLL
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L64:
                    r2.append(r0)
                    r2.append(r1)
                    if (r6 == 0) goto L72
                    int r0 = r6.LJ
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                L72:
                    r2.append(r4)
                    r0 = 41
                    r2.append(r0)
                    java.lang.String r0 = X.X1D.LIZIZ(r2)
                    X.C3K4.LIZJ(r3, r0)
                    return
                L82:
                    r0 = r4
                    goto L64
                L84:
                    r0 = r4
                    goto L56
                L86:
                    r0 = r4
                    goto L46
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3KU.onReceivedDMData(X.3MD, java.lang.Throwable):void");
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IImInboxDmService
            public final void onReceiveUnreadCount(List<? extends C3L4> sessions, int i, boolean z) {
                int i2;
                boolean z2;
                Keva LIZ;
                o.LJIIIZ(sessions, "sessions");
                C3KV LIZ2 = LIZ();
                LIZ2.getClass();
                AnonymousClass325.LIZ.getClass();
                if (sessions.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (C3L4 c3l4 : sessions) {
                        if (c3l4.LJLLL && c3l4.LJLLILLLL == 0 && c3l4.LJIIJ() && !c3l4.LL && (i2 = i2 + 1) < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
                C3KX c3kx = new C3KX(i + i2, false, -1);
                if ((C82133Kf.LIZ() & 1) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || z) {
                    C3KV.LIZIZ(LIZ2, c3kx, z, false, 4);
                    if (((C82133Kf.LIZ() & 16) != 0 || (C82133Kf.LIZ() & 2) != 0) && z && c3kx.LJLIL >= 0 && (LIZ = C3KV.LIZ()) != null) {
                        LIZ.storeBoolean("needUnreadDot", c3kx.LJLILLLLZI);
                        LIZ.storeInt("unreadCount", c3kx.LJLIL);
                        LIZ.storeInt("unreadDot", c3kx.LJLJI);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("tryUpdateCache: info=");
                        LIZ3.append(c3kx);
                        C34B.LJI("DMInboxUnreadHelper", X1D.LIZIZ(LIZ3));
                    }
                    LIZ2.LIZIZ = true;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onReceiveUnreadCount, info=");
                LIZ4.append(c3kx);
                LIZ4.append(", isDataReady=");
                LIZ4.append(z);
                C34B.LJI("DMInboxUnreadHelper", X1D.LIZIZ(LIZ4));
            }
        };
    }
}
