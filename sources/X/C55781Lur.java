package X;

import android.os.Handler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedExtra;
import com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendVideoModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Lur, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55781Lur extends AbstractC51036K1g<Aweme, CommonFeedModel> {
    public final long LJLIL;
    public String LJLJJI;
    public final List<RecommendFeedModel> LJLILLLLZI = new ArrayList();
    public final List<Aweme> LJLJI = new ArrayList();
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0) {
            return ((CommonFeedModel) t).getHasMore();
        }
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        return this.LJLJI;
    }

    public C55781Lur(long j) {
        this.LJLIL = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadMoreList(java.lang.Object... r12) {
        /*
            r11 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r5 = r11
            T r1 = r5.mData
            com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel r1 = (com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel) r1
            r0 = 1
            if (r1 == 0) goto L1d
            int r7 = r1.getNextCursor()
        L11:
            r6 = r12[r0]
            boolean r0 = r6 instanceof X.M89
            r2 = 0
            if (r0 == 0) goto L2a
            X.M89 r6 = (X.M89) r6
            if (r6 == 0) goto L2b
            goto L1f
        L1d:
            r7 = 1
            goto L11
        L1f:
            java.lang.String r0 = r6.getAid()     // Catch: java.lang.NumberFormatException -> L2b
            if (r0 == 0) goto L2b
            long r8 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L2b
            goto L2d
        L2a:
            r6 = r2
        L2b:
            r8 = 0
        L2d:
            if (r6 == 0) goto L58
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r6.getAnchorCustomData()
            if (r0 == 0) goto L58
            java.lang.String r0 = r0.getExposureItems()
        L39:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L87
            java.util.List<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = r5.LJLILLLLZI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L87
            if (r6 == 0) goto L87
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r6.getAnchorCustomData()
            if (r0 == 0) goto L87
            java.lang.String r4 = r0.getExposureItems()
            if (r4 == 0) goto L87
            goto L5a
        L58:
            r0 = r2
            goto L39
        L5a:
            com.google.gson.Gson r3 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L87
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L87
            X.Pkb r0 = X.C65340Pke.LIZ(r0)     // Catch: com.google.gson.s -> L87
            X.Pkc r0 = X.C65352Pkq.LJII(r1, r0)     // Catch: com.google.gson.s -> L87
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L87
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r4, r0)     // Catch: com.google.gson.s -> L87
            boolean r0 = r1 instanceof java.util.List     // Catch: com.google.gson.s -> L87
            if (r0 != 0) goto L7c
            r1 = r2
        L7c:
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: com.google.gson.s -> L87
            if (r1 == 0) goto L87
            java.util.List<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = r5.LJLILLLLZI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
        L87:
            X.34l r1 = X.C780334l.LJLIL
            X.LvC r4 = new X.LvC
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r10)
            r0 = 3
            X.XKX.LIZLLL(r1, r2, r2, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55781Lur.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r6 != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshList(java.lang.Object... r19) {
        /*
            r18 = this;
            java.lang.String r0 = "params"
            r1 = r19
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r0 = 1
            r6 = r1[r0]
            boolean r0 = r6 instanceof X.M89
            r2 = 0
            if (r0 == 0) goto L1e
            X.M89 r6 = (X.M89) r6
            if (r6 == 0) goto L1f
            java.lang.String r0 = r6.getAid()     // Catch: java.lang.NumberFormatException -> L1f
            if (r0 == 0) goto L1f
            long r8 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L1f
            goto L21
        L1e:
            r6 = r2
        L1f:
            r8 = 0
        L21:
            if (r6 == 0) goto L4e
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r6.getAnchorCustomData()
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.getExposureItems()
        L2d:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            r5 = r18
            if (r0 == 0) goto L7d
            java.util.List<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = r5.LJLILLLLZI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7d
            if (r6 == 0) goto Lba
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r6.getAnchorCustomData()
            if (r0 == 0) goto L7f
            java.lang.String r4 = r0.getExposureItems()
            if (r4 == 0) goto L7f
            goto L50
        L4e:
            r0 = r2
            goto L2d
        L50:
            com.google.gson.Gson r3 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L7d
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L7d
            X.Pkb r0 = X.C65340Pke.LIZ(r0)     // Catch: com.google.gson.s -> L7d
            X.Pkc r0 = X.C65352Pkq.LJII(r1, r0)     // Catch: com.google.gson.s -> L7d
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L7d
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r4, r0)     // Catch: com.google.gson.s -> L7d
            boolean r0 = r1 instanceof java.util.List     // Catch: com.google.gson.s -> L7d
            if (r0 != 0) goto L72
            r1 = r2
        L72:
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: com.google.gson.s -> L7d
            if (r1 == 0) goto L7d
            java.util.List<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = r5.LJLILLLLZI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
        L7d:
            if (r6 == 0) goto Lba
        L7f:
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r6.getAnchorCustomData()
            if (r0 == 0) goto Lba
            java.lang.String r10 = r0.getPageName()
        L89:
            boolean r0 = r5.isDataEmpty()
            r1 = 3
            if (r0 == 0) goto La2
            X.34l r0 = X.C780334l.LJLIL
            X.Luq r11 = new X.Luq
            r17 = 0
            r12 = r8
            r14 = r5
            r15 = r6
            r16 = r10
            r11.<init>(r12, r14, r15, r16, r17)
            X.XKX.LIZLLL(r0, r2, r2, r11, r1)
        La1:
            return
        La2:
            T r0 = r5.mData
            com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel r0 = (com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel) r0
            if (r0 == 0) goto Lb8
            int r7 = r0.getNextCursor()
        Lac:
            X.34l r0 = X.C780334l.LJLIL
            X.LvD r4 = new X.LvD
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r10, r11)
            X.XKX.LIZLLL(r0, r2, r2, r4, r1)
            goto La1
        Lb8:
            r7 = 1
            goto Lac
        Lba:
            r10 = r2
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55781Lur.refreshList(java.lang.Object[]):void");
    }

    @Override // X.AbstractC51036K1g, X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        this.mIsLoading = true;
        Object obj = params[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 4) {
                    this.mListQueryType = intValue;
                    loadMoreList(Arrays.copyOf(params, params.length));
                }
            } else {
                this.mListQueryType = 1;
                refreshList(Arrays.copyOf(params, params.length));
            }
        } else {
            this.mListQueryType = intValue;
            refreshList(Arrays.copyOf(params, params.length));
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        if (list != null) {
            ((ArrayList) this.LJLJI).clear();
            ((ArrayList) this.LJLJI).addAll(list);
            List<C8BT> list2 = this.mNotifyListeners;
            if (list2 != null) {
                Iterator<C8BT> it = list2.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess();
                }
            }
        }
    }

    public final void LJIIIZ(CommonFeedModel commonFeedModel, M89 m89) {
        String str;
        String str2;
        RecommendVideoModel video;
        List<RecommendFeedModel> feedList = commonFeedModel.getFeedList();
        if (feedList == null) {
            return;
        }
        String requestId = commonFeedModel.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendFeedModel recommendFeedModel : feedList) {
            RecommendFeedModel recommendFeedModel2 = recommendFeedModel;
            if (recommendFeedModel2.getType() == 3 && (video = recommendFeedModel2.getVideo()) != null && video.getAwemeStruct() != null) {
                arrayList.add(recommendFeedModel);
            }
        }
        List<Aweme> list = this.LJLJI;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                RecommendFeedModel recommendFeedModel3 = (RecommendFeedModel) next;
                Gson LIZ = GsonHolder.LIZLLL().LIZ();
                o.LJIIIIZZ(LIZ, "get().gson");
                RecommendVideoModel video2 = recommendFeedModel3.getVideo();
                if (video2 != null) {
                    str = video2.getAwemeStruct();
                } else {
                    str = null;
                }
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(LIZ, str, C65330PkU.LIZJ(C65352Pkq.LJI(Aweme.class)));
                    if (!(fromJson instanceof Aweme)) {
                        fromJson = null;
                    }
                    Aweme aweme = (Aweme) fromJson;
                    if (aweme != null) {
                        AwemeService.LIZ().R1(aweme);
                        LJIIJ(aweme, m89, false);
                        RecommendFeedExtra feedExtra = recommendFeedModel3.getFeedExtra();
                        if (feedExtra == null || (str2 = feedExtra.getRecommendInfo()) == null) {
                            str2 = "";
                        }
                        int size = ((ArrayList) this.LJLJI).size() + i + 1;
                        aweme.getMobParams().put("request_id", requestId);
                        aweme.getMobParams().put("order", String.valueOf(size));
                        aweme.getMobParams().put("rec_params", str2);
                        aweme.getMobParams().put("rec_session_id", this.LJLJJI);
                        aweme.getMobParams().put("action_type", "draw");
                        ((ArrayList) list).add(aweme);
                    }
                } catch (s unused) {
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        List<RecommendFeedModel> list2 = this.LJLILLLLZI;
        for (RecommendFeedModel recommendFeedModel4 : feedList) {
            ((ArrayList) list2).add(new RecommendFeedModel(recommendFeedModel4.getId(), recommendFeedModel4.getType(), null, null, 12, null));
        }
    }

    public static void LJIIJ(Aweme aweme, M89 m89, boolean z) {
        HashMap<String, String> mobParams;
        String str;
        if (aweme == null || m89 == null) {
            return;
        }
        AnchorCustomData anchorCustomData = m89.getAnchorCustomData();
        if (anchorCustomData != null) {
            aweme.setAnchorCustomData(anchorCustomData);
            String sourceModule = anchorCustomData.getSourceModule();
            if (sourceModule != null && C78857UxB.LJJJIL(sourceModule) && ((mobParams = aweme.getMobParams()) == null || true != mobParams.containsKey("source_module"))) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(sourceModule);
                if (z) {
                    str = "_outer_flow";
                } else {
                    str = "_inner_flow";
                }
                LIZ.append(str);
                aweme.appendMobParam("source_module", X1D.LIZIZ(LIZ));
            }
        }
        HashMap<String, String> logExtra = m89.getLogExtra();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : logExtra.entrySet()) {
            if (!o.LJ("source_module", entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            aweme.appendMobParam((String) entry2.getKey(), (String) entry2.getValue());
        }
    }
}
