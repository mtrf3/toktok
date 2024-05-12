package X;

import Y.ACallableS83S0101000_12;
import android.os.Message;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.LiX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55017LiX extends AbstractC51036K1g<Aweme, FeedItemList> {
    public static boolean LJLLL;
    public static boolean LJLLLL;
    public int LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public FeedItemList LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;
    public C54972Lho LJLJLJ;
    public boolean LJLL;
    public InterfaceC55018LiY LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLJLLL = true;
    public int LJLLJ = -1;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((FeedItemList) t).getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((FeedItemList) t).isHasMore()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean needCheckEmptyForQueryType() {
        int i = this.mListQueryType;
        if (19 != i && 20 != i) {
            return true;
        }
        return false;
    }

    public C55017LiX() {
        this.mCount = 6;
    }

    public static boolean LJIIL(FeedItemList feedItemList) {
        if (feedItemList == null || feedItemList.getItems() == null) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(Message message) {
        if (message != null && message.getData() != null && message.getData().getBoolean("is_from_feed_cache")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(int i) {
        List<Aweme> list;
        Object LIZ;
        String str;
        T t = this.mData;
        if (t != 0) {
            FeedItemList m120clone = ((FeedItemList) t).m120clone();
            List<Aweme> originAwemeList = ((FeedItemList) this.mData).getItems();
            o.LJIIIZ(originAwemeList, "originAwemeList");
            if (i != 1 && i != 3) {
                if (i != 4) {
                    try {
                        LIZ = Boolean.valueOf(C36311EMx.LJFF.removeAll(ORZ.LLJJ(originAwemeList)));
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                    if (m10exceptionOrNullimpl != null) {
                        FMW.LIZLLL("FeedConsumeOpt", "FeedConsumeOpt", "comsume", "", m10exceptionOrNullimpl);
                        list = C61878OQg.INSTANCE;
                    } else {
                        C36311EMx.LIZJ = true;
                        LinkedList<Aweme> linkedList = C36311EMx.LJFF;
                        if (linkedList.size() <= 1) {
                            C38995FSd.LIZLLL().execute(RunnableC36313EMz.LJLIL);
                            list = C61878OQg.INSTANCE;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Aweme poll = linkedList.poll();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("consume the feed from pool, the desc of which is : ");
                            if (poll != null) {
                                str = poll.getDesc();
                            } else {
                                str = null;
                            }
                            LIZ2.append(str);
                            X1D.LIZIZ(LIZ2);
                            if (poll == null) {
                                list = C61878OQg.INSTANCE;
                            } else {
                                arrayList.add(poll);
                                list = arrayList;
                            }
                        }
                    }
                } else {
                    list = C36311EMx.LJI;
                }
            } else {
                List<Aweme> list2 = C36311EMx.LJ;
                list = list2;
                if (list2 == null) {
                    List<Aweme> synchronizedList = Collections.synchronizedList(new ArrayList());
                    o.LJIIIIZZ(synchronizedList, "synchronizedList(mutableListOf<Aweme>())");
                    list = synchronizedList;
                }
            }
            if (list.size() > 0) {
                m120clone.items = list;
                FGR.LIZIZ().LIZ(this.mHandler, new ACallableS83S0101000_12(1, m120clone, 0), 0);
            }
        }
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 3 && objArr.length <= 11) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (SplashSettingServiceImpl.LJII().LIZIZ() && this.mData == 0 && C55511LqV.LJIIIIZZ(aweme2) && C55511LqV.LIZIZ) {
            C2U8.LIZ(new C9CC(aweme2));
            return true;
        }
        return C78996UzQ.LJIIIIZZ(getItems(), aweme2, this.mNotifyListeners);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:99|(1:107)|108|(4:110|(2:111|(3:113|(5:115|116|(4:120|(4:124|(5:126|(1:128)(1:134)|129|(1:131)(1:133)|132)|135|(5:137|(14:139|140|141|142|143|(3:145|146|147)|157|(1:159)(1:161)|160|150|(1:152)|153|(1:156)|155)|167|(1:169)(1:171)|170))|172|(1:174))|175|176)(1:178)|177)(1:179))|180|(2:182|(2:184|(1:186))(2:187|(3:189|(4:192|(4:195|(2:197|198)(2:200|201)|199|193)|202|203)|191))))|204|(3:210|(4:213|(3:221|222|(2:223|(2:225|(1:235)(3:230|231|232))(0)))(0)|233|211)|241)|242|(3:376|(4:379|(3:384|385|(2:394|395)(5:397|398|(1:400)|401|(3:406|407|408)))|396|377)|416)|244|(3:252|(1:260)(2:256|(1:258))|259)|261|(13:263|(4:265|(2:267|(2:269|(1:271))(2:354|(1:358)))|359|(1:361)(2:362|(5:364|(1:366)|367|(1:369)|370)(1:371)))(1:372)|273|(1:275)|276|(1:278)|279|(2:282|280)|283|284|285|286|287)|373|273|(0)|276|(0)|279|(1:280)|283|284|285|286|287) */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x054f, code lost:
    
        if (r1 != 20) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x07a0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x07a1, code lost:
    
        X.C36922EeM.LJFF(r0);
        r3 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x058a A[LOOP:7: B:280:0x057c->B:282:0x058a, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.ss.android.ugc.aweme.feed.model.FeedItemList, T, java.lang.Object] */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 2201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55017LiX.handleData(java.lang.Object):void");
    }

    @Override // X.C8BS, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        List<Aweme> list;
        List<Aweme> items;
        Aweme aweme;
        FeedItemList feedItemList;
        String str;
        FAJ.LIZ("feed_ui_duration", true);
        FAJ.LIZ("feed_ui_duration_start_to_get_view", false);
        FAJ.LJFF("cold_boot_new_user_journey_pause_to_data_fetched", false);
        FAJ.LIZ("feed_data_fetched_to_on_success", false);
        if (C39082FVm.LIZ()) {
            HashMap LIZJ = C03660Ck.LIZJ("monitor_scene", "scene_feed_data");
            LIZJ.put("vv_code", 6100);
            if (message == null || message.obj == null) {
                LIZJ.put("data_is_exception", 1);
                LIZJ.put("data_exception_msg", "");
                LIZJ.put("data_exception_code", 0);
                LIZJ.put("vv_code", 6140);
            } else {
                LIZJ.put("data_is_null_or_empty", 0);
                if (this.LJLL && LJIILIIL(message)) {
                    LIZJ.put("vv_code", 6120);
                    LIZJ.put("data_is_skip_cache", 1);
                } else if (message.obj instanceof Exception) {
                    LIZJ.put("data_is_exception", 1);
                    LIZJ.put("data_exception_msg", E43.LIZ((Exception) message.obj));
                    LIZJ.put("data_exception_code", Integer.valueOf(C64920Pds.LIZ(EF7.LIZIZ(), (Throwable) message.obj)));
                    LIZJ.put("vv_code", 6140);
                } else if (LJIILIIL(message)) {
                    LIZJ.put("data_cache_is_used", 1);
                    LIZJ.put("data_type", "feed_cache");
                } else {
                    LIZJ.put("vv_code", 6110);
                }
            }
            C39082FVm.LIZJ(LIZJ);
        }
        if (this.LJLL && LJIILIIL(message)) {
            return;
        }
        if (message != null && message.what == 0) {
            this.LJLL = true;
        }
        if (!LJIILIIL(message)) {
            this.LJLJLLL = true;
        }
        if (LJIILIIL(message)) {
            C56662Kg.LIZ().LJ = true;
            FFX.LIZ(1, "data_cache_is_used");
        }
        Object obj = message.obj;
        if ((obj instanceof FeedItemList) && (str = (feedItemList = (FeedItemList) obj).debugInfo) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("IsSortPromptSucc")) {
                    if (JSONObjectProtectorUtils.getBoolean(jSONObject, "IsSortPromptSucc")) {
                        if (o.LJ(C55014LiU.LIZ, "fypAdjust_chatPage_normalFeed_button")) {
                            C55014LiU.LIZLLL = true;
                        } else {
                            C55014LiU.LIZJ = true;
                        }
                        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = C55014LiU.LIZIZ;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(Boolean.TRUE);
                        }
                        C55014LiU.LIZ = null;
                        C55014LiU.LIZIZ = null;
                    } else {
                        C55014LiU.LIZLLL = false;
                        C55014LiU.LIZJ = false;
                        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2 = C55014LiU.LIZIZ;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(Boolean.FALSE);
                        }
                        C55014LiU.LIZ = null;
                        C55014LiU.LIZIZ = null;
                        message.obj = new C55015LiV();
                    }
                    feedItemList.debugInfo = null;
                }
            } catch (JSONException unused) {
            }
        }
        if ((DUE.LIZJ() || DUE.LIZIZ() || DUE.LJFF(false) || DUE.LJ() || DUE.LIZLLL()) && (list = C36311EMx.LJ) != null && (!list.isEmpty())) {
            Message obtain = Message.obtain(message);
            Object obj2 = message.obj;
            if (obj2 instanceof FeedItemList) {
                FeedItemList feedItemList2 = (FeedItemList) obj2;
                FeedItemList m120clone = feedItemList2.m120clone();
                List<Aweme> items2 = feedItemList2.getItems();
                if (items2 != null) {
                    if (DUE.LIZJ() || DUE.LJFF(false) || DUE.LJ()) {
                        m120clone.items = C36311EMx.LIZ(items2, -1);
                    } else {
                        m120clone.items = C36311EMx.LIZ(items2, 0);
                    }
                }
                obtain.obj = m120clone;
            }
            super.handleMsg(obtain);
        } else if (((Boolean) C34148Dai.LIZJ.getValue()).booleanValue() && C34148Dai.LIZ) {
            Object obj3 = message.obj;
            if ((obj3 instanceof FeedItemList) && (items = ((FeedItemList) obj3).getItems()) != null) {
                for (int i = 1; i < items.size(); i++) {
                    Aweme aweme2 = (Aweme) ListProtector.get(items, i);
                    int i2 = i - 1;
                    Aweme aweme3 = (Aweme) ListProtector.get(items, i2);
                    if (i >= 2) {
                        aweme = (Aweme) ListProtector.get(items, i - 2);
                    } else {
                        aweme = null;
                    }
                    if (aweme2 != null && aweme2.isLive() && aweme3 != null && !aweme3.isAd() && aweme != null && !aweme.isAd()) {
                        ListProtector.set(items, i2, aweme2);
                        ListProtector.set(items, i, aweme3);
                    }
                }
            }
            super.handleMsg(message);
            C34148Dai.LIZ = false;
        } else {
            super.handleMsg(message);
        }
        if (C90L.LIZ) {
            FAJ.LJFF("feed_ui_duration_get_view_tail", false);
        }
        FAJ.LJFF("feed_ui_duration", true);
        FAJ.LIZ("feed_ui_to_video", true);
        FAJ.LIZ("feed_ui_to_texture_available", false);
        FAK LIZ = C56672Kh.LIZ();
        FAV stage = FAV.FEED_UI_TO_VIDEO;
        LIZ.getClass();
        o.LJIIIZ(stage, "stage");
        LIZ.LJJIJIIJI = stage;
        C56662Kg.LIZ().LIZJ("cold_boot_main_feed_success_to_focus", false);
    }

    @Override // X.AbstractC51036K1g
    public final void loadCache(Object... objArr) {
        if (C34186DbK.LIZ()) {
            LJIIJJI(2);
        } else {
            if (!C34186DbK.LIZ || !((Boolean) C33867DQx.LIZIZ.getValue()).booleanValue()) {
                return;
            }
            LJIIJJI(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadLatestList(java.lang.Object... r24) {
        /*
            r23 = this;
            r0 = 1
            r2 = r24
            r0 = r2[r0]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4 = r23
            r4.LJLIL = r0
            r0 = 2
            r0 = r2[r0]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.LJLILLLLZI = r0
            int r1 = r2.length
            r0 = 5
            r3 = 4
            if (r1 < r0) goto L68
            r1 = r2[r3]
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L68
            java.lang.String r1 = (java.lang.String) r1
            r4.LJLJI = r1
        L29:
            int r5 = r4.LJLIL
            java.util.List r0 = r4.getItems()
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto L65
            r6 = 0
        L37:
            T r0 = r4.mData
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            long r8 = r0.minCursor
            int r10 = r4.mCount
            int r0 = r2.length
            if (r0 < r3) goto L63
            r0 = 3
            r11 = r2[r0]
            boolean r0 = r11 instanceof java.lang.Integer
            if (r0 == 0) goto L63
            java.lang.Integer r11 = (java.lang.Integer) r11
        L4b:
            r12 = 0
            int r13 = r4.LJLILLLLZI
            java.lang.String r14 = r4.LJLJI
            r19 = 0
            java.lang.Boolean r20 = java.lang.Boolean.FALSE
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r21 = r12
            r22 = r12
            r4.LJIIJ(r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L63:
            r11 = 0
            goto L4b
        L65:
            r6 = -1
            goto L37
        L68:
            java.lang.String r0 = ""
            r4.LJLJI = r0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55017LiX.loadLatestList(java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadMoreList(java.lang.Object... r28) {
        /*
            r27 = this;
            r8 = r27
            T r0 = r8.mData
            if (r0 == 0) goto Lc
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            long r0 = r0.cursor
            r8.LJLJJLL = r0
        Lc:
            r6 = 1
            r3 = r28
            r0 = r3[r6]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.LJLIL = r0
            r0 = 2
            r0 = r3[r0]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.LJLILLLLZI = r0
            int r0 = r3.length
            r7 = 3
            r2 = 4
            r5 = 0
            if (r0 < r2) goto Lbd
            r1 = r3[r7]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto Lbd
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r23 = r1.booleanValue()
        L36:
            int r0 = r3.length
            r4 = 5
            if (r0 < r4) goto Lb8
            r1 = r3[r2]
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Lb8
            java.lang.String r1 = (java.lang.String) r1
            r8.LJLJI = r1
        L44:
            int r0 = r3.length
            if (r0 < r4) goto Lb5
            r0 = r3[r2]
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto Lb5
            r8.LJLJL = r6
        L4f:
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "loadMoreList call,type:"
            r4.append(r0)
            int r0 = r8.LJLIL
            r4.append(r0)
            java.lang.String r0 = ",pullType:"
            r4.append(r0)
            int r0 = r8.LJLILLLLZI
            r4.append(r0)
            java.lang.String r0 = ",countryCode:"
            r4.append(r0)
            java.lang.String r1 = r8.LJLJI
            java.lang.String r0 = "FeedFetchModel"
            X.C1FJ.LJFF(r4, r1, r4, r2, r0)
            int r9 = r8.LJLIL
            java.util.List r0 = r8.getItems()
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto Lae
            r10 = 0
        L81:
            int r14 = r8.mCount
            int r0 = r3.length
            if (r0 < r2) goto Lac
            r15 = r3[r7]
            boolean r0 = r15 instanceof java.lang.Integer
            if (r0 == 0) goto Lac
            java.lang.Integer r15 = (java.lang.Integer) r15
        L8e:
            r16 = 0
            int r1 = r8.LJLILLLLZI
            java.lang.String r0 = r8.LJLJI
            java.lang.Boolean r24 = java.lang.Boolean.FALSE
            r12 = -1
            r17 = r1
            r18 = r0
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r25 = r16
            r26 = r16
            r8.LJIIJ(r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        Lac:
            r15 = 0
            goto L8e
        Lae:
            T r0 = r8.mData
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            long r10 = r0.maxCursor
            goto L81
        Lb5:
            r8.LJLJL = r5
            goto L4f
        Lb8:
            java.lang.String r0 = ""
            r8.LJLJI = r0
            goto L44
        Lbd:
            r23 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55017LiX.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshList(java.lang.Object... r34) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55017LiX.refreshList(java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        T t = this.mData;
        if (t != 0) {
            ((FeedItemList) t).items = list;
        }
    }

    public static final boolean LJIIIZ(Aweme aweme, Aweme aweme2) {
        if (aweme.isLiveNoDeduplicate() && FW9.LIZ()) {
            if (aweme2 == null || !LFV.LIZ(aweme2)) {
                return false;
            }
            return true;
        }
        if (!aweme.isAd()) {
            return true;
        }
        if (aweme.getAwemeRawAd() == null) {
            return false;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    public final void LJIILJJIL(FeedItemList feedItemList, int i) {
        if (C39082FVm.LIZ()) {
            HashMap LIZJ = C03660Ck.LIZJ("monitor_scene", "scene_feed_data");
            LIZJ.put("vv_code", Integer.valueOf(i));
            LIZJ.put("data_query_type", Integer.valueOf(this.mListQueryType));
            if (feedItemList == null || feedItemList.getItems() == null || feedItemList.getItems().size() == 0) {
                LIZJ.put("data_is_null_or_empty", 1);
            } else {
                LIZJ.put("data_is_null_or_empty", 0);
                if (i == 6210) {
                    LIZJ.put("data_process_size", Integer.valueOf(feedItemList.getItems().size()));
                } else {
                    LIZJ.put("data_receive_size", Integer.valueOf(feedItemList.getItems().size()));
                }
            }
            C39082FVm.LIZJ(LIZJ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011d, code lost:
    
        if (r37 == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(final int r29, final long r30, final long r32, final int r34, final java.lang.Integer r35, final java.lang.String r36, final int r37, final java.lang.String r38, final java.lang.String r39, final java.lang.String r40, final java.util.concurrent.locks.Lock r41, final android.os.Message r42, final boolean r43, java.lang.Boolean r44, java.lang.String r45, final java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55017LiX.LJIIJ(int, long, long, int, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.concurrent.locks.Lock, android.os.Message, boolean, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }
}
