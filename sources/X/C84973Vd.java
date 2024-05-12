package X;

import android.util.LruCache;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84973Vd {
    public static final C84973Vd LIZ = new C84973Vd();
    public static String LIZIZ = "";
    public static final C64962gm LIZJ = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()));
    public static final LruCache<String, C69822oc> LIZLLL = new LruCache<>(100);
    public static final ConcurrentHashSet<String> LJ = new ConcurrentHashSet<>();

    public static void LJII() {
        if (C69992ot.LIZ()) {
            C69732oT.LIZIZ.clear();
        } else {
            LIZLLL.evictAll();
        }
        AnonymousClass489.LIZ.getClass();
        AnonymousClass489.LIZJ = false;
        ((LinkedHashMap) AnonymousClass489.LIZLLL).clear();
        ((LinkedHashMap) AnonymousClass489.LJ).clear();
    }

    public static OSZ LIZLLL(String itemId) {
        o.LJIIIZ(itemId, "itemId");
        if (C69992ot.LIZ()) {
            C69802oa LIZJ2 = C69732oT.LIZJ(itemId);
            if (LIZJ2 == null) {
                return null;
            }
            return new OSZ(LIZJ2.LIZ, LIZJ2.LIZIZ);
        }
        C69822oc c69822oc = LIZLLL.get(itemId);
        if (c69822oc == null) {
            return null;
        }
        long j = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        try {
            SettingsManager.LIZLLL().getClass();
            j = SettingsManager.LJFF("im_feed_video_status_valid_duration", LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
        } catch (Exception unused) {
        }
        if (System.currentTimeMillis() - c69822oc.LIZJ > j) {
            return null;
        }
        return new OSZ(c69822oc.LIZ, c69822oc.LIZIZ);
    }

    public static final boolean LJFF(C109544Rq c109544Rq) {
        return o.LJ(c109544Rq.getLocalExt().get("story_video_is_expired"), "1");
    }

    public static final void LJIIIZ(List<? extends C109544Rq> list) {
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        XKX.LIZLLL(LIZJ, null, null, new C69922om(list, null), 3);
    }

    public static void LJIIIIZZ(C84973Vd c84973Vd, String str) {
        Aweme aweme;
        c84973Vd.getClass();
        if (C69992ot.LIZ()) {
            C69802oa LIZJ2 = C69732oT.LIZJ(str);
            if (LIZJ2 != null) {
                aweme = LIZJ2.LIZIZ;
            } else {
                return;
            }
        } else {
            C69822oc c69822oc = LIZLLL.get(str);
            if (c69822oc == null) {
                return;
            } else {
                aweme = c69822oc.LIZIZ;
            }
        }
        if (aweme != null) {
            C46728IVo.LJIIL(819200, aweme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150 A[LOOP:1: B:30:0x014a->B:32:0x0150, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0230 A[LOOP:3: B:51:0x022a->B:53:0x0230, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0248 A[LOOP:4: B:56:0x0242->B:58:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f1 A[Catch: Exception -> 0x0206, all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:67:0x01e7, B:68:0x01ea, B:70:0x01f1, B:72:0x01f7, B:75:0x01fe, B:79:0x020c), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.effectmanager.common.ConcurrentHashSet, com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.lang.Object, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<? extends X.C109544Rq> r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84973Vd.LJ(java.util.List, X.2kd):java.lang.Object");
    }

    public static final void LJI(String errorCode, C109544Rq c109544Rq, ShareAwemeContent shareAwemeContent) {
        String processId = C3Y4.LIZJ;
        if (o.LJ(c109544Rq.getLocalExt().get("feed_video_last_unavailable_pid"), processId)) {
            return;
        }
        String itemId = shareAwemeContent.getItemId();
        String user = shareAwemeContent.getUser();
        String conversationId = c109544Rq.getConversationId();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(processId, "processId");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ2 = HXX.LIZJ("enter_from", "chat", "process_id", processId);
        LIZJ2.put("conversation_id", conversationId);
        LIZJ2.put("group_id", itemId);
        LIZJ2.put("to_user_id", user);
        LIZJ2.put("error_code", errorCode);
        onEventV3.LIZIZ("chat_video_cover_failed", LIZJ2);
        c109544Rq.addLocalExt("feed_video_last_unavailable_pid", processId);
        C106674Gp.LJIILJJIL(c109544Rq);
    }

    public static final void LJIIJ(AwemeDetailList awemeDetailList, List<? extends OSZ<? extends C109544Rq, String>> list, java.util.Set<String> set) {
        List<AwemeStatusBean> list2;
        List<Aweme> list3;
        VideoMaskInfo contentClassificationMaskInfo;
        String str;
        if (awemeDetailList != null) {
            list2 = awemeDetailList.getAwemeStatus();
            list3 = awemeDetailList.getAwemeList();
        } else {
            list2 = null;
            list3 = null;
        }
        if (list2 == null) {
            C34B.LIZJ("AwemeCoverManager", "server returned null list");
            return;
        }
        if (list2.size() != set.size()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("server returned ");
            LIZ2.append(list2.size());
            LIZ2.append(" aweme status info but query for ");
            LIZ2.append(set.size());
            C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (AwemeStatusBean awemeStatusBean : list2) {
            if (awemeStatusBean == null) {
                C34B.LIZJ("AwemeCoverManager", "returned null bean");
            } else if (awemeStatusBean.getAwemeId() == null || awemeStatusBean.getStatus() == null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("returned bean id: ");
                LIZ3.append(awemeStatusBean.getAwemeId());
                LIZ3.append(" / status: ");
                LIZ3.append(awemeStatusBean.getStatus());
                C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ3));
            } else {
                String awemeId = awemeStatusBean.getAwemeId();
                o.LJI(awemeId);
                if (!set.contains(awemeId)) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("returned wrong aweme id ");
                    LIZ4.append(awemeStatusBean.getAwemeId());
                    C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ4));
                } else {
                    String awemeId2 = awemeStatusBean.getAwemeId();
                    o.LJI(awemeId2);
                    linkedHashMap.put(awemeId2, awemeStatusBean);
                    Integer status = awemeStatusBean.getStatus();
                    int parseInt = CastIntegerProtector.parseInt(CardStruct.IStatusCode.DEFAULT);
                    if (status == null || status.intValue() != parseInt) {
                        if (awemeStatusBean.getStatusText() == null) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("returned bean id: ");
                            LIZ5.append(awemeStatusBean.getAwemeId());
                            LIZ5.append(" has status: ");
                            LIZ5.append(awemeStatusBean.getStatus());
                            LIZ5.append(" but text is null");
                            C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ5));
                        }
                    }
                }
            }
        }
        if (list3 != null) {
            for (Aweme aweme : list3) {
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "it.aid");
                linkedHashMap2.put(aid, aweme);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (OSZ<? extends C109544Rq, String> osz : list) {
            C109544Rq first = osz.getFirst();
            String second = osz.getSecond();
            AwemeStatusBean awemeStatusBean2 = (AwemeStatusBean) linkedHashMap.get(second);
            if (awemeStatusBean2 == null) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("aweme id: ");
                LIZ6.append(second);
                LIZ6.append(" not returned");
                C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ6));
            } else {
                Aweme aweme2 = (Aweme) linkedHashMap2.get(second);
                if (aweme2 == null) {
                    Integer status2 = awemeStatusBean2.getStatus();
                    int parseInt2 = CastIntegerProtector.parseInt(CardStruct.IStatusCode.DEFAULT);
                    if (status2 != null && status2.intValue() == parseInt2) {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("aweme id: ");
                        LIZ7.append(second);
                        LIZ7.append(" is Normal but detail not returned");
                        C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ7));
                    }
                }
                if (aweme2 != null && (contentClassificationMaskInfo = aweme2.getContentClassificationMaskInfo()) != null && o.LJ(contentClassificationMaskInfo.getShowMask(), Boolean.TRUE)) {
                    awemeStatusBean2.setStatus(Integer.valueOf(CastIntegerProtector.parseInt("1027")));
                    VideoMaskInfo contentClassificationMaskInfo2 = aweme2.getContentClassificationMaskInfo();
                    if (contentClassificationMaskInfo2 != null) {
                        str = contentClassificationMaskInfo2.getTitle();
                    } else {
                        str = null;
                    }
                    awemeStatusBean2.setStatusText(str);
                }
                arrayList.add(LJIIL(first, awemeStatusBean2, aweme2, false));
                LIZ.getClass();
                LJIIJJI(second, awemeStatusBean2, aweme2);
            }
        }
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe.LIZIZ.LIZIZ(arrayList, true);
    }

    public static void LJIIJJI(String str, AwemeStatusBean awemeStatusBean, Aweme aweme) {
        AwemeService.LIZ().R1(aweme);
        LIZLLL.put(str, new C69822oc(awemeStatusBean, aweme));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C109544Rq LJIIL(X.C109544Rq r16, com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84973Vd.LJIIL(X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):X.4Rq");
    }

    public static final void LIZ(View rootView, C109544Rq message, ShareAwemeContent content, boolean z, InterfaceC88473Ynt<? super String, ? super Integer, ? super Integer, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(content, "content");
        if (message.getMsgType() == 1025) {
            boolean isStoryExpired = ShareStoryContent.Companion.isStoryExpired((ShareStoryContent) content);
            boolean LJFF = LJFF(message);
            boolean LJ2 = o.LJ(content.getUser(), LIZIZ);
            if (isStoryExpired) {
                if (!LJ2 && !LJFF) {
                    java.util.Map<String, String> localExt = message.getLocalExt();
                    o.LJIIIIZZ(localExt, "msg.localExt");
                    localExt.put("story_video_is_expired", "1");
                }
            } else if (LJFF) {
                message.getLocalExt().remove("story_video_is_expired");
            }
        }
        String str = message.getLocalExt().get("feed_video_status_flag");
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ(str, message.getLocalExt().get("feed_video_status_text"), rootView, message, content, z, interfaceC88473Ynt);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C109544Rq r13, X.C62846OlW r14, com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent r15, X.InterfaceC67352kd r16, boolean r17) {
        /*
            r12 = this;
            r3 = r16
            r9 = r15
            r7 = r13
            boolean r0 = r3 instanceof X.C84983Ve
            if (r0 == 0) goto L78
            r5 = r3
            X.3Ve r5 = (X.C84983Ve) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L16:
            java.lang.Object r2 = r5.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJLL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L4d
            if (r0 != r3) goto L7e
            X.C141335gf.LIZJ(r2)
        L27:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2a:
            X.C141335gf.LIZJ(r2)
            X.UtN r0 = X.C36636EZk.LIZ
            X.3P3 r6 = new X.3P3
            r10 = 0
            r8 = r14
            r11 = r17
            r6.<init>(r7, r8, r9, r10, r11)
            r5.LJLIL = r12
            r5.getClass()
            r5.LJLILLLLZI = r7
            r5.LJLJI = r9
            r5.LJLJJLL = r1
            java.lang.Object r0 = X.XKX.LJI(r0, r6, r5)
            if (r0 != r4) goto L4b
            return r4
        L4b:
            r0 = r12
            goto L56
        L4d:
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent r9 = r5.LJLJI
            X.4Rq r7 = r5.LJLILLLLZI
            X.3Vd r0 = r5.LJLIL
            X.C141335gf.LIZJ(r2)
        L56:
            r2 = 0
            r5.LJLIL = r2
            r5.getClass()
            r5.LJLILLLLZI = r2
            r5.LJLJI = r2
            r5.LJLJJLL = r3
            r0.getClass()
            X.XIA r1 = X.C78613UtF.LIZJ
            X.2oj r0 = new X.2oj
            r0.<init>(r9, r7, r2)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r5)
            if (r0 != r4) goto L75
        L72:
            if (r0 != r4) goto L27
            return r4
        L75:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L72
        L78:
            X.3Ve r5 = new X.3Ve
            r5.<init>(r12, r3)
            goto L16
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84973Vd.LIZJ(X.4Rq, X.OlW, com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, X.2kd, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0263, code lost:
    
        if (X.C53578L1a.LIZ() != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r17, java.lang.String r18, final android.view.View r19, final X.C109544Rq r20, final com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent r21, final boolean r22, final X.InterfaceC88473Ynt<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, X.C76800UCe> r23) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84973Vd.LIZIZ(java.lang.String, java.lang.String, android.view.View, X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, boolean, X.Ynt):void");
    }
}
