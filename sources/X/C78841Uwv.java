package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.g1;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.android.play.core.appupdate.u;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.ShopRecommendVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommend;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.external.router.OpenTextEditInterceptor;
import com.ss.android.ugc.aweme.external.router.OpenVideoEditInterceptor;
import com.ss.android.ugc.aweme.feed.experiment.FeedPauseAnimationOptimizationType;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.services.external.IRouterService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Uwv */
/* loaded from: classes14.dex */
public final class C78841Uwv implements InterfaceC39656FhM, IHostFrameworkDepend, IRouterService {
    public static Boolean LJLIL;

    public static final int LJ(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i == 2) {
            return 1;
        }
        return i != 3 ? 3 : 2;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IRouterService
    public IInterceptor openEditPageRouter() {
        return new OpenVideoEditInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IRouterService
    public IInterceptor openTextEditRouter() {
        return new OpenTextEditInterceptor();
    }

    public static final C66906QNq LIZ(long j) {
        return new C66906QNq((int) j, (int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Q3D LJII(List list) {
        int i;
        Stack stack = new Stack();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Q2L q2l = (Q2L) it.next();
            Q3D q3d = new Q3D(q2l);
            if (q2l instanceof Q2H) {
                i = ((Q2H) q2l).LIZIZ;
            } else if (q2l instanceof Q2D) {
                i = ((Q2D) q2l).LIZIZ;
            } else {
                stack.push(q3d);
            }
            for (int i2 = i; i2 > 0; i2--) {
                Object obj = stack.get(stack.size() - i2);
                if (q3d.LIZIZ == null) {
                    q3d.LIZIZ = new ArrayList<>();
                }
                q3d.LIZIZ.add(obj);
            }
            while (i > 0) {
                stack.pop();
                i--;
            }
            stack.push(q3d);
        }
        if (stack.size() == 1) {
            return (Q3D) stack.pop();
        }
        throw new IllegalArgumentException("could not build command tree");
    }

    public static void LJIIIIZZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C65265PjR.LIZIZ().getClass();
            }
        }
    }

    public static final int LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<StickerItemModel> arrayList;
        if (C42000Ge4.LJIILIIL(videoPublishEditModel)) {
            return ((ArrayList) LJIIL(videoPublishEditModel)).size();
        }
        InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
        if (inlineCaptionModel != null && (arrayList = inlineCaptionModel.utterances) != null) {
            return arrayList.size();
        }
        return 0;
    }

    public static final List LJIIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        List<TextStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : list) {
            if (u.LJIJ(textStickerModel)) {
                arrayList.add(textStickerModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    public static final ArrayList LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        List<Utterance> utterances;
        ?? r7;
        ArrayList<StickerItemModel> arrayList;
        String str;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C44384HbQ.LLJILJIL(videoPublishEditModel)) {
            if (C42000Ge4.LJIILIIL(videoPublishEditModel)) {
                List LJIIL = LJIIL(videoPublishEditModel);
                r7 = new ArrayList(C32I.LJJL(LJIIL, 10));
                Iterator it = ((ArrayList) LJIIL).iterator();
                while (it.hasNext()) {
                    r7.add(C137045Zk.LIZIZ((TextStickerModel) it.next()));
                }
            } else {
                try {
                    InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
                    if (inlineCaptionModel != null && (arrayList = inlineCaptionModel.utterances) != null) {
                        r7 = new ArrayList(C32I.LJJL(arrayList, 10));
                        Iterator<StickerItemModel> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            r7.add(GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), it2.next().extra, TextStickerData.class));
                        }
                    } else {
                        r7 = 0;
                    }
                } catch (s unused) {
                    r7 = C61878OQg.INSTANCE;
                }
            }
            if (r7 == 0) {
                r7 = C61878OQg.INSTANCE;
            }
            for (TextStickerData textStickerData : r7) {
                String textStr = textStickerData.getTextStr();
                if (textStr != null) {
                    str = ujb.o.LJJJJZ(textStr, "\n", "", false);
                } else {
                    str = null;
                }
                textStickerData.setTextStr(str);
            }
            return LJJJI(r7);
        }
        CaptionStruct captionStruct = videoPublishEditModel.captionStruct;
        if (captionStruct == null || (utterances = captionStruct.getUtterances()) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Utterance> it3 = utterances.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new CaptionUtterance(it3.next(), (TextStickerData) null));
        }
        return arrayList2;
    }

    public static String LJIILLIIL(AVMusic aVMusic) {
        String mid;
        if (aVMusic != null && (mid = aVMusic.getMid()) != null) {
            return mid;
        }
        return "";
    }

    public static String LJIIZILJ(AVMusic aVMusic) {
        String imprId;
        if (aVMusic != null && aVMusic.getLogPb() != null && (imprId = aVMusic.getLogPb().getImprId()) != null) {
            return imprId;
        }
        return "";
    }

    public static boolean LJIJJLI(Context context) {
        if (LJLIL == null) {
            LJLIL = Boolean.valueOf(LJIIJ(context, "com.twitter.sdk.android.TRACE_ENABLED", false));
        }
        return LJLIL.booleanValue();
    }

    public static final boolean LJIL(SearchSugEntity searchSugEntity) {
        SugExtraInfo sugExtraInfo;
        if (searchSugEntity == null || (sugExtraInfo = searchSugEntity.sugExtraInfo) == null || !sugExtraInfo.isRichSug()) {
            return false;
        }
        return true;
    }

    public static void LJJ(Context context) {
        if (LJIJJLI(context)) {
            C65265PjR.LIZIZ().getClass();
        }
    }

    public static void LJJI(Context context) {
        if (LJIJJLI(context)) {
            C65265PjR.LIZIZ().getClass();
        }
    }

    public static /* synthetic */ void LJJIIZI(InterfaceC65784Pro interfaceC65784Pro) {
        LJJIIZ("", interfaceC65784Pro);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C31431Lf LJJIJIIJI(X.InterfaceC24520xk r5) {
        /*
            r0 = -1464256199(0xffffffffa8b93939, float:-2.0563942E-14)
            r5.LJJIIJ(r0)
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            X.1HY r2 = X.C31431Lf.LJFF
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r5.LJJIIJ(r0)
            boolean r0 = r5.LJIJJ(r1)
            java.lang.Object r1 = r5.LJIILL()
            if (r0 != 0) goto L28
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L30
        L28:
            X.1wd r1 = new X.1wd
            r1.<init>(r4)
            r5.LJJIII(r1)
        L30:
            r5.LJJIJIIJIL()
            X.Pro r1 = (X.InterfaceC65784Pro) r1
            r0 = 4
            java.lang.Object r0 = X.C73975T1n.LJIIIIZZ(r3, r2, r1, r5, r0)
            X.1Lf r0 = (X.C31431Lf) r0
            r5.LJJIJIIJIL()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78841Uwv.LJJIJIIJI(X.0xk):X.1Lf");
    }

    public static void LJJIJL(User user) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", user.getUid());
        c188727au.LJIIIZ("enter_from", "homepage_follow");
        c188727au.LJIIIZ("enter_type", "card");
        c188727au.LJIIIZ("trigger_reason", "cold_launch");
        String recommendReason = user.getRecommendReason();
        if (LOG.LIZ()) {
            recommendReason = "super_account";
        }
        c188727au.LJIIIZ("rec_reason", recommendReason);
        FMX.LJIIL("follow_cancel", c188727au.LIZ);
    }

    public static void LJJIJLIJ(User user) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", user.getUid());
        c188727au.LJIIIZ("enter_from", "homepage_follow");
        c188727au.LJIIIZ("enter_type", "card");
        c188727au.LJIIIZ("trigger_reason", "cold_launch");
        String recommendReason = user.getRecommendReason();
        if (LOG.LIZ()) {
            recommendReason = "super_account";
        }
        c188727au.LJIIIZ("rec_reason", recommendReason);
        FMX.LJIIL("follow", c188727au.LIZ);
    }

    public static final void LJJIZ(C57128MbU c57128MbU) {
        V92 hierarchy;
        if (c57128MbU.getAvatarImageView() != null && (hierarchy = c57128MbU.getAvatarImageView().getHierarchy()) != null) {
            hierarchy.LJIJI(R.drawable.b0p, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        }
    }

    public static boolean LJJJ(User user) {
        if (user == null || C79004UzY.LJJIFFI(user.getFollowerDetailList())) {
            return false;
        }
        List<FollowerDetail> followerDetailList = user.getFollowerDetailList();
        ArrayList arrayList = new ArrayList();
        if (!C79004UzY.LJJIFFI(followerDetailList)) {
            arrayList.clear();
            arrayList.addAll(followerDetailList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FollowerDetail followerDetail = (FollowerDetail) it.next();
                if (followerDetail != null && followerDetail.getFansCount() <= 0) {
                    it.remove();
                }
            }
        }
        if (C79004UzY.LJJIFFI(arrayList) || arrayList.size() <= 1) {
            return false;
        }
        return true;
    }

    public static final ArrayList LJJJI(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LJ.add(new CaptionUtterance((Utterance) null, ((TextStickerData) it.next()).m110clone()));
        }
        return LJ;
    }

    public static final ArrayList LJJJIL(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = LJJJJI(list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                TextStickerData textStickerData = (TextStickerData) next;
                textStickerData.setUiStartTime(textStickerData.getStartTime());
                textStickerData.setUiEndTime(textStickerData.getEndTime());
                arrayList.add(C151525x6.LJFF(textStickerData, i));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    public static final ArrayList LJJJJI(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TextStickerData textStickerData = ((CaptionUtterance) it.next()).inlineUtterance;
            if (textStickerData != null) {
                LJ.add(textStickerData.m110clone());
            }
        }
        return LJ;
    }

    public static final ArrayList LJJJJIZL(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Utterance utterance = ((CaptionUtterance) it.next()).utterance;
            if (utterance != null) {
                LJ.add(utterance);
            }
        }
        return LJ;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
    public String getContainerID(C31926Cfy c31926Cfy) {
        Object LIZ;
        boolean z;
        InterfaceC37790EsM interfaceC37790EsM;
        String LIZ2;
        F21 LLLLLLJ;
        String str = null;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("get_container_id_jsb_rollback");
            if (config != null) {
                LIZ = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Boolean bool = (Boolean) LIZ;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            InterfaceC40516FvE interfaceC40516FvE = (InterfaceC40516FvE) FCS.LIZIZ(c31926Cfy, InterfaceC40516FvE.class);
            if (interfaceC40516FvE != null && (LLLLLLJ = interfaceC40516FvE.LLLLLLJ()) != null) {
                return LLLLLLJ.LJLIL;
            }
        } else if (c31926Cfy != null && (interfaceC37790EsM = (InterfaceC37790EsM) c31926Cfy.LIZ(InterfaceC37790EsM.class)) != null && (LIZ2 = interfaceC37790EsM.LIZ()) != null) {
            return LIZ2;
        }
        C59639Nat LIZ3 = F0L.LIZ();
        if (!((ArrayList) LIZ3.LIZIZ).isEmpty()) {
            str = (String) ORZ.LLFF(LIZ3.LIZIZ);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final void LIZIZ(Context context, ImageView imageView) {
        if (imageView == null || context == null) {
            return;
        }
        FeedPauseAnimationOptimizationType.LIZ.getClass();
        if (!FeedPauseAnimationOptimizationType.LIZIZ()) {
            imageView.setImageResource(R.drawable.bo_);
            return;
        }
        int LIZIZ = C7MY.LIZIZ(60);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_play;
        c2068389v.LIZIZ = LIZIZ;
        c2068389v.LIZJ = LIZIZ;
        imageView.setImageDrawable(c2068389v.LIZ(context));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = LIZIZ;
            layoutParams.height = LIZIZ;
        }
    }

    public static final void LIZJ(JHM jhm, String str) {
        o.LJIIIZ(jhm, "<this>");
        if (C174826ta.LIZ()) {
            C76V.LIZ().LIZ(str);
            jhm.LIZJ(0, "spammy_tag_cnt");
        }
    }

    public static final void LJFF(String methodName, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(methodName, "methodName");
        long currentTimeMillis = System.currentTimeMillis();
        interfaceC65784Pro.invoke();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (!TextUtils.isEmpty(methodName) && currentTimeMillis2 > 2) {
            ConcurrentHashMap<String, List<Long>> concurrentHashMap = C139895eL.LIZJ;
            if (concurrentHashMap.get(methodName) == null) {
                concurrentHashMap.put(methodName, new ArrayList());
            }
            List<Long> list = concurrentHashMap.get(methodName);
            o.LJI(list);
            list.add(Long.valueOf(currentTimeMillis2));
        }
    }

    public static final String LJI(Object from, Object until) {
        o.LJIIIZ(from, "from");
        o.LJIIIZ(until, "until");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Random range is empty: [");
        LIZ.append(from);
        LIZ.append(", ");
        LIZ.append(until);
        LIZ.append(").");
        return X1D.LIZIZ(LIZ);
    }

    public static final boolean LJIJJ(Rect rect, Rect rect2) {
        o.LJIIIZ(rect, "<this>");
        if (rect.right == rect2.left || rect.top == rect2.bottom || rect.left == rect2.right || rect.bottom == rect2.top) {
            return true;
        }
        return false;
    }

    public static final int LJJIFFI(V0R v0r, C40517FvF range) {
        o.LJIIIZ(v0r, "<this>");
        o.LJIIIZ(range, "range");
        if (!range.isEmpty()) {
            int i = range.LJLILLLLZI;
            if (i < Integer.MAX_VALUE) {
                return v0r.nextInt(range.LJLIL, i + 1);
            }
            int i2 = range.LJLIL;
            if (i2 > Integer.MIN_VALUE) {
                return v0r.nextInt(i2 - 1, i) + 1;
            }
            return v0r.nextInt();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot get random in empty range: ");
        LIZ.append(range);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final long LJJII(V0R v0r, UIW uiw) {
        o.LJIIIZ(v0r, "<this>");
        long j = uiw.LJLIL;
        long j2 = uiw.LJLILLLLZI;
        if (j > j2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot get random in empty range: ");
            LIZ.append(uiw);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        if (j2 < Long.MAX_VALUE) {
            return v0r.nextLong(j, j2 + 1);
        }
        if (j > Long.MIN_VALUE) {
            return v0r.nextLong(j - 1, j2) + 1;
        }
        return v0r.nextLong();
    }

    public static final void LJJIIJ(C5MG nleImpl, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(nleImpl, "$this$nleImpl");
        C135235Sl configure = nleImpl.LIZ;
        o.LJIIIZ(configure, "configure");
        if (configure.LIZ.invoke().booleanValue()) {
            LJFF("", new AqS163S0100000_13(interfaceC65784Pro, 58));
        }
    }

    public static final void LJJIIZ(String methodName, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(methodName, "methodName");
        if (!C139895eL.LIZIZ) {
            LJFF(methodName, new AqS163S0100000_13(interfaceC65784Pro, 57));
        }
    }

    public static boolean LJJIJ(String str, JSONObject jSONObject) {
        Boolean bool;
        Object opt = jSONObject.opt(str);
        if (opt instanceof Boolean) {
            bool = (Boolean) opt;
        } else if (opt instanceof Integer) {
            Integer num = (Integer) opt;
            if (num.intValue() == 1) {
                bool = Boolean.TRUE;
            } else {
                if (num.intValue() == 0) {
                    bool = Boolean.FALSE;
                }
                return false;
            }
        } else {
            if (opt instanceof String) {
                String str2 = (String) opt;
                if ("true".equalsIgnoreCase(str2) || "1".equals(str2)) {
                    bool = Boolean.TRUE;
                } else if ("false".equalsIgnoreCase(str2) || CardStruct.IStatusCode.DEFAULT.equals(str2)) {
                    bool = Boolean.FALSE;
                }
            }
            return false;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final Object LJJIJIIJIL(Object obj, java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        if ((obj != null && map.containsKey(obj)) || (0 != 0 && map != null)) {
            return map.get(obj);
        }
        return null;
    }

    public static void LJJIJIL(User user, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", user.getUid());
        c188727au.LIZLLL(user.getFollowStatus(), "relation_tag");
        c188727au.LJIIIZ("enter_from", "homepage_follow");
        c188727au.LJIIIZ("enter_type", "card");
        c188727au.LJIIIZ("trigger_reason", "cold_launch");
        String recommendReason = user.getRecommendReason();
        if (LOG.LIZ()) {
            recommendReason = "super_account";
        }
        c188727au.LJIIIZ("rec_reason", recommendReason);
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(str));
        FMX.LJIILJJIL("enter_personal_detail", C227768wm.LJJIIZI(c188727au.LIZ));
    }

    public static final ShopRecommendVO LJJJJJ(ProductPackStruct productPackStruct, ShopRecommendData shopRecommendData) {
        ShopRecommend shopRecommend;
        o.LJIIIZ(productPackStruct, "<this>");
        SellerInfo sellerInfo = productPackStruct.sellerInfo;
        if (sellerInfo != null && (shopRecommend = sellerInfo.shopRecommend) != null && o.LJ(shopRecommend.isRecommend, Boolean.TRUE)) {
            ShopRecommend shopRecommend2 = productPackStruct.sellerInfo.shopRecommend;
            return new ShopRecommendVO(shopRecommend2.modelTitle, shopRecommend2.enterName, shopRecommend2.enterSchema, shopRecommendData);
        }
        return null;
    }

    public static InterfaceC07790Sh LJJJJLI(InterfaceC07790Sh interfaceC07790Sh, C31431Lf state) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(state, "state");
        return C07770Sf.LIZ(interfaceC07790Sh, g1.LIZ, new C49401wm(state, null, false, true));
    }

    @Override // X.InterfaceC39656FhM
    public void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        C78857UxB.LJIILJJIL(classLoader, set, new TPP());
    }

    public static boolean LJIIIZ(float f, float f2, float f3) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) && Float.isNaN(f2)) {
                return true;
            }
            return false;
        }
        if (Math.abs(f2 - f) < f3) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int LJIJI = LJIJI(context, str, "bool");
            if (LJIJI > 0) {
                return resources.getBoolean(LJIJI);
            }
            int LJIJI2 = LJIJI(context, str, "string");
            if (LJIJI2 > 0) {
                return Boolean.parseBoolean(context.getString(LJIJI2));
            }
        }
        return z;
    }

    public static final CharSequence LJIILJJIL(SearchSugEntity entity, Context context, InterfaceC212198Ul search) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        SpannableString spannableString;
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(search, "search");
        if (C52197Ke9.LIZ() || C52195Ke7.LIZ() || C52199KeB.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            spannableStringBuilder = new SpannableStringBuilder();
            String str2 = entity.content;
            List<Position> list = entity.hignLightPositions;
            if (str2 != null) {
                str = str2;
            }
            if (TextUtils.isEmpty(str) || list == null) {
                spannableString = new SpannableString(str);
            } else {
                spannableString = new SpannableString(str);
                ArrayList arrayList = new ArrayList();
                if (C52199KeB.LIZ()) {
                    int i = 0;
                    for (Position position : list) {
                        if (position.getBegin() > i) {
                            arrayList.add(new Position(i, position.getBegin() - 1));
                        }
                        i = position.getEnd() + 1;
                    }
                    if (i < str.length()) {
                        arrayList.add(new Position(i, str.length() - 1));
                    }
                } else {
                    arrayList.addAll(list);
                }
                boolean z2 = !C52195Ke7.LIZ();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Position position2 = (Position) it.next();
                    if (position2 != null) {
                        if (z2) {
                            AnonymousClass636.LJIJI(spannableString, position2.getBegin(), position2.getEnd() + 1);
                        }
                        int begin = position2.getBegin();
                        int end = position2.getEnd() + 1;
                        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
                        int max = Math.max(0, begin);
                        if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                            spannableString.setSpan(new ForegroundColorSpan(LJIIIIZZ), max, end, 17);
                        }
                    }
                }
            }
            spannableStringBuilder.append((CharSequence) spannableString);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            String str3 = entity.content;
            if (str3 != null) {
                str = str3;
            }
            List<? extends Position> list2 = entity.hignLightPositions;
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            spannableStringBuilder.append((CharSequence) search.LIZIZ(context, str, list2));
        }
        return spannableStringBuilder;
    }

    public static final CharSequence LJIJ(SearchSugEntity searchSugEntity, View view, InterfaceC212198Ul search) {
        String str;
        o.LJIIIZ(search, "search");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (searchSugEntity.sugExtraInfo.isVerifiedUser()) {
            spannableStringBuilder.append((CharSequence) " T");
            spannableStringBuilder.setSpan(new SJU(R.drawable.ax3, view.getContext()), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 33);
        }
        Context context = view.getContext();
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null) {
            str = sugExtraInfo.getUserRelationType();
        } else {
            str = null;
        }
        String LIZIZ = C250889sy.LIZIZ(context, str);
        if (LIZIZ.length() > 0) {
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) LIZIZ);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C1EU.LIZ(view, "itemView.context", R.attr.gv)), (spannableStringBuilder.length() - 3) - LIZIZ.length(), spannableStringBuilder.length(), 33);
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length() - LIZIZ.length();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(styleSpan, length, length2, 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, 13, Resources.getSystem().getDisplayMetrics())), length, length2, 18);
        }
        return spannableStringBuilder;
    }

    public static int LJIJI(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = C16880lQ.LLLLL(context).getApplicationInfo().icon;
        if (i > 0) {
            packageName = context.getResources().getResourcePackageName(i);
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static final void LJJIIJZLJL(String str, InterfaceC153045zY veEditor, InterfaceC88472Yns block) {
        o.LJIIIZ(veEditor, "veEditor");
        o.LJIIIZ(block, "block");
        if (!C139895eL.LIZIZ) {
            LJFF(str, new AqS149S0200000_2(veEditor, block, 1));
        }
    }

    public static final void LJJIL(C57128MbU c57128MbU, int i, int i2) {
        if (c57128MbU.getLiveTagView() != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            c57128MbU.getLiveTagView().setLayoutParams(layoutParams);
        }
    }

    public static final TextStickerData LJJJJ(Utterance utterance, Context context, boolean z) {
        String str;
        o.LJIIIZ(utterance, "<this>");
        TextStickerData textStickerData = new TextStickerData(utterance.getText(), 4, -1, 2, null, new Point(), (int) utterance.getStartTime(), (int) utterance.getEndTime(), (int) utterance.getStartTime(), (int) utterance.getEndTime(), 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 22, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, "type_inline_caption", 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1073742832, -67108865, 1048575, null);
        textStickerData.setFontType("Proxima-Nova-Semibold.otf");
        textStickerData.setTextWrapList(C47261Igj.LJII(C68W.LIZJ(C68W.LJIILJJIL(textStickerData, context))));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        textStickerData.setEditorProCaption(str);
        return textStickerData;
    }

    public static final void LJJJJJL(TextStickerData textStickerData, String text, Context context) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(context, "context");
        textStickerData.setTextStr(text);
        textStickerData.setTextWrapList(C47261Igj.LJII(C68W.LIZJ(C68W.LJIILJJIL(textStickerData, context))));
        textStickerData.setInlineTextStyles(C61878OQg.INSTANCE);
    }

    public static final void LJJJJL(IMUser iMUser, C80483Dw config, IMUser iMUser2) {
        o.LJIIIZ(iMUser, "<this>");
        o.LJIIIZ(config, "config");
        if (iMUser2 == null) {
            return;
        }
        if (!config.LJLIL) {
            iMUser.setInternalShareHoldoutVersion(iMUser2.getInternalShareHoldoutVersion());
        }
        if (config.LJLILLLLZI) {
            UrlModel avatarThumb = iMUser.getAvatarThumb();
            UrlModel avatarThumb2 = iMUser2.getAvatarThumb();
            if (((Number) C52724Kme.LIZ.getValue()).intValue() != 1 || avatarThumb == null || avatarThumb2 == null || !C89553fL.LJ(avatarThumb, avatarThumb2) || C89553fL.LIZJ(avatarThumb) >= C89553fL.LIZJ(avatarThumb2)) {
                return;
            }
            iMUser.setAvatarThumb(iMUser2.getAvatarThumb());
            iMUser.setAvatarMedium(iMUser2.getAvatarMedium());
        }
    }

    public static final void LJJIII(C5MG nleImpl, String str, InterfaceC153045zY veEditor, InterfaceC88472Yns block) {
        o.LJIIIZ(nleImpl, "$this$nleImpl");
        o.LJIIIZ(veEditor, "veEditor");
        o.LJIIIZ(block, "block");
        C135235Sl configure = nleImpl.LIZ;
        o.LJIIIZ(configure, "configure");
        if (configure.LIZ.invoke().booleanValue()) {
            LJFF(str, new AqS149S0200000_2(veEditor, block, 2));
        }
    }

    @Override // X.InterfaceC39656FhM
    public boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return C54840Lfg.LJIJJ(classLoader, file, file2, z, new C78866UxK(), "path", new C32810CuE());
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
    public void addObserverEvent(C31926Cfy c31926Cfy, String actionType, List eventName, List params) {
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        InterfaceC40516FvE interfaceC40516FvE = (InterfaceC40516FvE) FCS.LIZIZ(c31926Cfy, InterfaceC40516FvE.class);
        if (interfaceC40516FvE != null) {
            interfaceC40516FvE.Ka(actionType, eventName, params);
        }
    }
}
