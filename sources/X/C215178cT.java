package X;

import Y.AfS19S1000000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedUploadingViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.StoryPlayerListViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.bottom.StoryProgressBarPlaceHolderComponent;
import com.ss.android.ugc.aweme.story.feed.common.bottom.StoryUploadPlaceHolderComponent;
import com.ss.android.ugc.aweme.story.feed.common.newarch.StoryFeedUploadingViewHolderV2;
import com.ss.android.ugc.aweme.story.feed.common.newarch.StoryPlayerListViewHolderV2;
import com.ss.android.ugc.aweme.story.feed.common.newarch.StoryVideoViewHolderV2;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionProgressBarComponent;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryUploadProgressTrigger;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.photo.StoryPhotoViewHolder;
import com.ss.android.ugc.aweme.story.feed.guidecard.StoryGuideCardPhotoVH;
import com.ss.android.ugc.aweme.story.feed.guidecard.StoryGuideCardVideoVH;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardFilterPanelComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardPanelComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.filter.GuideCardFilterVM;
import com.ss.android.ugc.aweme.story.feed.immersive.StoryImmersiveCollectionVH;
import com.ss.android.ugc.aweme.story.feed.immersive.StoryImmersiveUserFeedVH;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8cT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215178cT implements InterfaceC222068na {
    public static final C215178cT LIZ = new C215178cT();

    @Override // X.InterfaceC222068na
    public final InterfaceC65350Pko<StoryGuideCardFilterPanelComponent> LJIIIIZZ() {
        return C65352Pkq.LIZ(StoryGuideCardFilterPanelComponent.class);
    }

    @Override // X.InterfaceC222068na
    public final InterfaceC65350Pko<? extends C8W0> LJIJJ() {
        return C65352Pkq.LIZ(StoryGuideCardPanelComponent.class);
    }

    @Override // X.InterfaceC222068na
    public final InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJIIJ() {
        Class cls;
        if (C59542Vi.LIZ()) {
            cls = FeedCollectionProgressBarComponent.class;
        } else {
            cls = StoryProgressBarPlaceHolderComponent.class;
        }
        return C65352Pkq.LIZ(cls);
    }

    @Override // X.InterfaceC222068na
    public final boolean LJIIL() {
        List list;
        if (!C2304092m.LIZ()) {
            return false;
        }
        Keva keva = C215298cf.LIZLLL;
        if (System.currentTimeMillis() - keva.getLong("key_dislike_time_stamp", 0L) >= ((Number) C215298cf.LIZJ.getValue()).intValue() * 24 * 60 * 60 * 1000) {
            long currentTimeMillis = System.currentTimeMillis();
            String rawString = keva.getString("key_visit_card", "");
            if (rawString == null || rawString.length() == 0) {
                list = C61878OQg.INSTANCE;
            } else {
                o.LJIIIIZZ(rawString, "rawString");
                list = s.LJLJJL(rawString, new String[]{","}, 0, 6);
            }
            if (list.isEmpty()) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = (String) obj;
                    if (str.length() > 0 && currentTimeMillis - CastLongProtector.parseLong(str) < 86400000) {
                        i++;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (i <= ((Number) C215298cf.LIZ.getValue()).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC222068na
    public final InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJIILL() {
        Class cls;
        if (C59542Vi.LIZ()) {
            cls = StoryUploadProgressTrigger.class;
        } else {
            cls = StoryUploadPlaceHolderComponent.class;
        }
        return C65352Pkq.LIZ(cls);
    }

    public static boolean LJIJJLI(M89 param) {
        o.LJIIIZ(param, "param");
        if (o.LJ(param.getFrom(), "STORY_ENTRANCE_FEED_TOP_LIST") || o.LJ(param.getFrom(), "STORY_ENTRANCE_INBOX_TOP_LIST") || o.LJ(param.getFrom(), "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST")) {
            return true;
        }
        return false;
    }

    public static boolean LJIL(M89 param) {
        o.LJIIIZ(param, "param");
        if (o.LJ(param.getFrom(), "STORY_ENTRANCE_AVATAR")) {
            return true;
        }
        if (!o.LJ(param.getEventType(), "homepage_follow") && !o.LJ(param.getEventType(), "homepage_hot") && !o.LJ(param.getEventType(), "homepage_nearby") && !o.LJ(param.getEventType(), "homepage_friends")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8Xp] */
    @Override // X.InterfaceC222068na
    public final Object LIZ(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            return new StoryPhotoViewHolder((C222588oQ) params, new AbstractC213008Xo<StoryPhotoViewHolder, VideoItemParams>() { // from class: X.8Xp
                @Override // X.AbstractC213008Xo
                public final String LJ(VideoItemParams videoItemParams) {
                    String aid;
                    VideoItemParams item = videoItemParams;
                    o.LJIIIZ(item, "item");
                    Aweme aweme = item.getAweme();
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        return "";
                    }
                    return aid;
                }
            });
        }
        return null;
    }

    @Override // X.InterfaceC222068na
    public final Object LIZIZ(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            if (!C59542Vi.LIZ()) {
                return new StoryVideoViewHolder((C222588oQ) params);
            }
            return new StoryVideoViewHolderV2((C222588oQ) params);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8Xr] */
    @Override // X.InterfaceC222068na
    public final Object LIZLLL(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            return new StoryImmersiveUserFeedVH((C222588oQ) params, new AbstractC213008Xo<StoryImmersiveUserFeedVH, VideoItemParams>() { // from class: X.8Xr
                @Override // X.AbstractC213008Xo
                public final String LJ(VideoItemParams videoItemParams) {
                    VideoItemParams item = videoItemParams;
                    o.LJIIIZ(item, "item");
                    String aid = item.getAweme().getAid();
                    if (aid == null) {
                        return "";
                    }
                    return aid;
                }
            });
        }
        return null;
    }

    @Override // X.InterfaceC222068na
    public final InterfaceC56392Jf LJ(C2MA c2ma) {
        CommonCellAbility commonCellAbility;
        InterfaceC55100Ljs mi0;
        InterfaceC55235Lm3 LJIJ;
        C2MA Y6 = c2ma.Y6();
        if (!(Y6 instanceof CommonCellAbility) || (commonCellAbility = (CommonCellAbility) Y6) == null || (mi0 = commonCellAbility.mi0()) == null || (LJIJ = C55096Ljo.LJIJ(mi0)) == null) {
            return null;
        }
        return (InterfaceC56392Jf) C55096Ljo.LIZ(LJIJ, FeedCollectionViewPagerAbility.class, null);
    }

    @Override // X.InterfaceC222068na
    public final java.util.Map LJFF(final AbstractC55082Lja adapter) {
        o.LJIIIZ(adapter, "adapter");
        return C113554cx.LJJL(new OSZ(15, new AbstractC213068Xu<StoryGuideCardVideoVH, VideoItemParams>(adapter) { // from class: X.8Xx
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(adapter);
                o.LJIIIZ(adapter, "adapter");
            }

            @Override // X.AbstractC213068Xu
            public final String LJ(VideoItemParams item, StoryGuideCardVideoVH storyGuideCardVideoVH, int i) {
                o.LJIIIZ(item, "item");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(item);
                LIZ2.append(", position: ");
                LIZ2.append(i);
                return X1D.LIZIZ(LIZ2);
            }
        }), new OSZ(16, new AbstractC213068Xu<StoryGuideCardPhotoVH, VideoItemParams>(adapter) { // from class: X.8Xw
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(adapter);
                o.LJIIIZ(adapter, "adapter");
            }

            @Override // X.AbstractC213068Xu
            public final String LJ(VideoItemParams item, StoryGuideCardPhotoVH storyGuideCardPhotoVH, int i) {
                o.LJIIIZ(item, "item");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(item);
                LIZ2.append(", position: ");
                LIZ2.append(i);
                return X1D.LIZIZ(LIZ2);
            }
        }));
    }

    @Override // X.InterfaceC222068na
    public final Object LJIIIZ(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            C222588oQ c222588oQ = (C222588oQ) params;
            InterfaceC212878Xb<?, ?> interfaceC212878Xb = c222588oQ.LJIILLIIL.get(15);
            o.LJII(interfaceC212878Xb, "null cannot be cast to non-null type com.bytedance.tiktok.proxy.list.IProxyer<com.ss.android.ugc.aweme.story.feed.guidecard.StoryGuideCardVideoVH, com.ss.android.ugc.aweme.feed.model.VideoItemParams>");
            return new StoryGuideCardVideoVH(c222588oQ, interfaceC212878Xb);
        }
        return null;
    }

    @Override // X.InterfaceC222068na
    public final boolean LJIILJJIL(String str) {
        if (C77123UOp.LJJIJIIJIL(str) && C211998Tr.LIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.8Xq] */
    @Override // X.InterfaceC222068na
    public final Object LJIILLIIL(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            C222588oQ c222588oQ = (C222588oQ) params;
            if (LJIJ(c222588oQ.LIZJ)) {
                return new StoryImmersiveCollectionVH(c222588oQ, new AbstractC213008Xo<StoryImmersiveCollectionVH, VideoItemParams>() { // from class: X.8Xq
                    @Override // X.AbstractC213008Xo
                    public final String LJ(VideoItemParams videoItemParams) {
                        VideoItemParams item = videoItemParams;
                        o.LJIIIZ(item, "item");
                        String aid = item.getAweme().getAid();
                        if (aid == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            }
            if (C59542Vi.LIZ()) {
                return new StoryPlayerListViewHolderV2(c222588oQ);
            }
            return new StoryPlayerListViewHolder(c222588oQ);
        }
        return null;
    }

    @Override // X.InterfaceC222068na
    public final Object LJIIZILJ(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            C222588oQ c222588oQ = (C222588oQ) params;
            InterfaceC212878Xb<?, ?> interfaceC212878Xb = c222588oQ.LJIILLIIL.get(16);
            o.LJII(interfaceC212878Xb, "null cannot be cast to non-null type com.bytedance.tiktok.proxy.list.IProxyer<com.ss.android.ugc.aweme.story.feed.guidecard.StoryGuideCardPhotoVH, com.ss.android.ugc.aweme.feed.model.VideoItemParams>");
            return new StoryGuideCardPhotoVH(c222588oQ, interfaceC212878Xb);
        }
        return null;
    }

    @Override // X.InterfaceC222068na
    public final boolean LJIJ(Fragment fragment) {
        KRA LIZJ;
        M89 m89;
        if (!C2304092m.LIZ() || fragment == null || (LIZJ = KR8.LIZJ(fragment)) == null) {
            return false;
        }
        if (!o.LJ(LIZJ.LIZ, "DETAIL_STORY") && ((m89 = LIZJ.LIZJ) == null || !m89.isStoryPage())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC222068na
    public final Object LJIJI(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        if (params instanceof C222588oQ) {
            if (!C59542Vi.LIZ()) {
                return new StoryFeedUploadingViewHolder((C222588oQ) params);
            }
            return new StoryFeedUploadingViewHolderV2((C222588oQ) params);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC222068na
    public final void reportStoryViewed(String str) {
        StoryApi.LIZIZ.reportStoryViewed(str).LJJIIJ(T16.LIZ()).LJJII(new AfS19S1000000_3(str, 2), new AfS19S1000000_3(str, 3));
        if (C2304092m.LIZ()) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            String str2 = null;
            Object[] objArr = 0;
            if (activityStack != null) {
                for (Activity activity : activityStack) {
                    if (activity instanceof InterfaceC55058LjC) {
                        if (activity == null || !(activity instanceof ActivityC45651qj)) {
                            return;
                        }
                        ComponentActivity componentActivity = (ComponentActivity) activity;
                        C65776Prg LIZ2 = C65352Pkq.LIZ(GuideCardFilterVM.class);
                        GuideCardFilterVM guideCardFilterVM = (GuideCardFilterVM) new C214298b3(LIZ2, (InterfaceC65784Pro) new AqS153S0100000_3(LIZ2, 1608), (InterfaceC65784Pro) C214528bQ.LJLIL, (InterfaceC65784Pro) C78926UyI.LJJII(componentActivity, false), (InterfaceC65784Pro) C78926UyI.LJJIIJZLJL(componentActivity, false), (InterfaceC65784Pro) C184077Kh.LJLIL, (InterfaceC88472Yns) C215188cU.INSTANCE, (InterfaceC65784Pro) (objArr == true ? 1 : 0), 384).getValue();
                        if (guideCardFilterVM == null) {
                            return;
                        }
                        if (guideCardFilterVM.gv0() == null) {
                            ConcurrentHashMap<String, HashSet<String>> concurrentHashMap = guideCardFilterVM.LJLIL;
                            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                            o.LJIIIIZZ(curUserId, "userService().curUserId");
                            concurrentHashMap.put(curUserId, C77275UUl.LIZLLL(str));
                        } else {
                            HashSet<String> gv0 = guideCardFilterVM.gv0();
                            if (gv0 != null) {
                                gv0.add(str);
                            }
                        }
                        StringBuilder LIZIZ = C25620zW.LIZIZ("onStoryViewed ", str, " then records is: ");
                        HashSet<String> gv02 = guideCardFilterVM.gv0();
                        if (gv02 != null) {
                            str2 = ORZ.LLD(gv02, null, null, null, C215198cV.LJLIL, 31);
                        }
                        LIZIZ.append(str2);
                        X1D.LIZIZ(LIZIZ);
                        guideCardFilterVM.setState(new AqS28S1000000_3(str, 23));
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC222068na
    public final boolean LIZJ(M89 feedParam, InterfaceC209388Jq interfaceC209388Jq) {
        C222588oQ c222588oQ;
        o.LJIIIZ(feedParam, "feedParam");
        if (!(interfaceC209388Jq instanceof C222588oQ) || (c222588oQ = (C222588oQ) interfaceC209388Jq) == null || c222588oQ.LJIILJJIL != 13 || !C76A.LIZ()) {
            return false;
        }
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ()) {
            return false;
        }
        if (!LJIL(feedParam) && !LJIJJLI(feedParam)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC222068na
    public final boolean LJI(Aweme aweme, String str) {
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() || !C54838Lfe.LJIIZILJ(aweme)) {
            return false;
        }
        if (!C76A.LIZ()) {
            return true;
        }
        boolean LJ = o.LJ("homepage_hot", str);
        boolean LJ2 = o.LJ("homepage_follow", str);
        boolean LJ3 = o.LJ("homepage_nearby", str);
        boolean LJ4 = o.LJ("homepage_friends", str);
        if (LJ || LJ2 || LJ4 || LJ3) {
            return true;
        }
        return !C78996UzQ.LJJIIZI(aweme);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x008e, code lost:
    
        if (r7.equals("homepage_nearby") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0097, code lost:
    
        if (r7.equals("homepage_follow") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x009e, code lost:
    
        if (r7.equals("notification_page") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a7, code lost:
    
        if (r7.equals("story_widget_extension_small") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0173, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r8, "STORY_ENTRANCE_INBOX_TOP_LIST") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return X.EnumC215438ct.AUTO_PLAY_NEXT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return X.EnumC215438ct.LOOP_CURRENT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00b1, code lost:
    
        if (r7.equals("story_widget_extension_large") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r7.equals("homepage_hot") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_AVATAR", r8) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return X.EnumC215438ct.QUIT_AFTER_FINISH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f5, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST", r8) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fd, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_FEED_TOP_LIST", r8) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_GUIDE_CARD", r8) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_DEFAULT", r8) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0115, code lost:
    
        if (kotlin.jvm.internal.o.LJ("chat", r7) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011b, code lost:
    
        if (X.C2304092m.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return X.EnumC215438ct.QUIT_AFTER_FINISH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return X.EnumC215438ct.LOOP_CURRENT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return X.EnumC215438ct.AUTO_PLAY_NEXT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        if (r7.equals("member_list") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
    
        if (r7.equals("profile_visitor_list") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        if (r7.equals("others_homepage") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (X.C53578L1a.LIZ() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cd, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_MINE", r8) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_OTHER", r8) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        if (kotlin.jvm.internal.o.LJ("STORY_ENTRANCE_AVATAR", r8) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return X.EnumC215438ct.LOOP_CURRENT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return X.EnumC215438ct.QUIT_AFTER_FINISH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0063, code lost:
    
        if (r7.equals("follow_request") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
    
        if (r8 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0127, code lost:
    
        r1 = r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012e, code lost:
    
        if (r1 == (-796330400)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        if (r1 == 672000920) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0138, code lost:
    
        if (r1 == 1537078210) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
    
        if (r8.equals("STORY_ENTRANCE_DEFAULT") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
    
        if (kotlin.jvm.internal.o.LJ("notification_page", r7) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015d, code lost:
    
        if (X.C2304092m.LIZ() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return X.EnumC215438ct.QUIT_AFTER_FINISH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return X.EnumC215438ct.LOOP_CURRENT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        if (r8.equals("STORY_ENTRANCE_AVATAR") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return X.EnumC215438ct.QUIT_AFTER_FINISH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0150, code lost:
    
        if (r8.equals("STORY_ENTRANCE_INBOX_TOP_LIST") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return X.EnumC215438ct.AUTO_PLAY_NEXT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return X.EnumC215438ct.LOOP_CURRENT_USER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x006a, code lost:
    
        if (r7.equals("chat") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x007c, code lost:
    
        if (r7.equals("personal_homepage") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0085, code lost:
    
        if (r7.equals("homepage_friends") == false) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    @Override // X.InterfaceC222068na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC215438ct LJII(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C215178cT.LJII(java.lang.String, java.lang.String):X.8ct");
    }

    @Override // X.InterfaceC222068na
    public final View LJIIJJI(EnumC55150Lkg type, Context context, ViewGroup viewGroup, Fragment fragment) {
        int i;
        o.LJIIIZ(type, "type");
        System.currentTimeMillis();
        String tag = type.getTag();
        switch (C55151Lkh.LIZ[type.ordinal()]) {
            case 1:
                if (LJIJ(fragment)) {
                    i = R.layout.co9;
                    break;
                } else {
                    i = R.layout.abj;
                    break;
                }
            case 2:
                i = R.layout.cod;
                break;
            case 3:
                i = R.layout.cob;
                break;
            case 4:
                i = R.layout.cou;
                break;
            case 5:
                i = R.layout.coo;
                break;
            case 6:
                i = R.layout.com;
                break;
            default:
                throw new C162476Zf();
        }
        return C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), tag, context, i, null, viewGroup, false, 40);
    }

    @Override // X.InterfaceC222068na
    public final InterfaceC215228cY LJIILIIL(ViewGroup viewGroup, InterfaceC47667InH listener, InterfaceC209388Jq params, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, InterfaceC55100Ljs interfaceC55100Ljs, AqS169S0100000_3 aqS169S0100000_3) {
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(params, "params");
        return new C222038nX(viewGroup, listener, (C222588oQ) params, viewGroup2, viewGroup3, viewGroup4, interfaceC55100Ljs, aqS169S0100000_3);
    }
}
