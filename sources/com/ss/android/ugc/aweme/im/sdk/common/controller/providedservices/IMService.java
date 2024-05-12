package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.A7X;
import X.AUS;
import X.AbstractC53585L1h;
import X.C100483wy;
import X.C100493wz;
import X.C100623xC;
import X.C112224ao;
import X.C117504jK;
import X.C16880lQ;
import X.C1E5;
import X.C221108m2;
import X.C30591Hz;
import X.C30Y;
import X.C32U;
import X.C33778DNm;
import X.C34B;
import X.C35478DwA;
import X.C36839Ed1;
import X.C3AL;
import X.C3B2;
import X.C3GF;
import X.C3UM;
import X.C3VX;
import X.C3YZ;
import X.C44384HbQ;
import X.C48841JEv;
import X.C4C7;
import X.C4CG;
import X.C4CJ;
import X.C4HU;
import X.C4HV;
import X.C4HW;
import X.C4HX;
import X.C4HY;
import X.C4I7;
import X.C4K8;
import X.C4LY;
import X.C4R6;
import X.C4Z2;
import X.C4ZL;
import X.C53166Ktm;
import X.C53503KzD;
import X.C56264M6i;
import X.C58096Mr6;
import X.C5H3;
import X.C62712d9;
import X.C62752dD;
import X.C70402pY;
import X.C72212sT;
import X.C72242sW;
import X.C73098SmU;
import X.C76482zM;
import X.C78613UtF;
import X.C79673At;
import X.C85773Yf;
import X.C8SE;
import X.C93603ls;
import X.C96423qQ;
import X.DPI;
import X.DS1;
import X.EF7;
import X.EXV;
import X.InterfaceC100183wU;
import X.InterfaceC100563x6;
import X.InterfaceC100593x9;
import X.InterfaceC100803xU;
import X.InterfaceC101213y9;
import X.InterfaceC102253zp;
import X.InterfaceC106314Ff;
import X.InterfaceC107424Jm;
import X.InterfaceC109344Qw;
import X.InterfaceC109664Sc;
import X.InterfaceC111984aQ;
import X.InterfaceC112624bS;
import X.InterfaceC112734bd;
import X.InterfaceC116174hB;
import X.InterfaceC116514hj;
import X.InterfaceC221448ma;
import X.InterfaceC221688my;
import X.InterfaceC38673FFt;
import X.InterfaceC40381Ft3;
import X.InterfaceC45541Hu5;
import X.InterfaceC55617LsD;
import X.InterfaceC55770Lug;
import X.InterfaceC56268M6m;
import X.InterfaceC57106Mb8;
import X.InterfaceC59802Wi;
import X.InterfaceC71996SNk;
import X.InterfaceC83383Pa;
import X.InterfaceC84043Ro;
import X.InterfaceC86093Zl;
import X.InterfaceC88043cu;
import X.InterfaceC98123tA;
import X.InterfaceC98813uH;
import X.L4O;
import X.LV9;
import X.T2R;
import X.X1D;
import X.XKX;
import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.di.ImEntranceService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.files.MediaFilesCleanTask;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.photo.FeedUserPhotoReplyViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.DMMediaApi;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.camera.config.DMMediaAuthConfig;
import com.ss.android.ugc.aweme.im.service.camera.exp.IMImageCacheSizeSetting;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMService implements IIMService {
    public static final Companion Companion = new Companion();
    public static IIMService inst;
    public final long initTimestamp = SystemClock.uptimeMillis();
    public final C5H3 activityStatusViewModel$delegate = C221108m2.LIZIZ(IMService$activityStatusViewModel$2.INSTANCE);
    public final C5H3 mufActivityStatusModel$delegate = C221108m2.LIZIZ(new AqS151S0100000_1(this, 628));

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IIMService get() {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
            return createIIMServicebyMonsterPlugin;
        }

        public final IIMService inst() {
            if (IMService.inst == null) {
                IMService.inst = get();
                C34B.LJII("follow_status", "IMService.inst: IMService not initialized");
            }
            return IMService.inst;
        }

        public Companion() {
        }
    }

    public static final IIMService get() {
        return Companion.get();
    }

    public static final IIMService inst() {
        return Companion.inst();
    }

    private final void interceptSchema() {
        SmartRouter.addInterceptor(new IInterceptor() { // from class: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$interceptSchema$1
            @Override // com.bytedance.router.interceptor.IInterceptor
            public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
                return C62712d9.LIZ(this, routeIntent);
            }

            @Override // com.bytedance.router.interceptor.IInterceptor
            public boolean matchInterceptRules(RouteIntent routeIntent) {
                String str;
                Uri uri;
                Uri uri2;
                StringBuilder LIZ = X1D.LIZ();
                String str2 = null;
                if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                    str = uri2.getHost();
                } else {
                    str = null;
                }
                LIZ.append(str);
                if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                    str2 = uri.getPath();
                }
                LIZ.append(str2);
                return ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "chat/message", false);
            }

            /* JADX WARN: Code restructure failed: missing block: B:43:0x002e, code lost:
            
                if (r11 != null) goto L19;
             */
            @Override // com.bytedance.router.interceptor.IInterceptor
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onInterceptRoute(android.content.Context r10, com.bytedance.router.RouteIntent r11) {
                /*
                    r9 = this;
                    r8 = 0
                    if (r11 == 0) goto L67
                    android.content.Intent r0 = r11.getExtra()
                    if (r0 == 0) goto L67
                    android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r0)
                    if (r1 == 0) goto L67
                    java.lang.String r0 = "uid"
                    java.lang.String r2 = r1.getString(r0)
                L15:
                    java.lang.String r7 = ""
                    if (r11 == 0) goto L2d
                    android.content.Intent r0 = r11.getExtra()
                    if (r0 == 0) goto L2d
                    android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r0)
                    if (r1 == 0) goto L2d
                    java.lang.String r0 = "enter_from"
                    java.lang.String r6 = r1.getString(r0)
                    if (r6 != 0) goto L30
                L2d:
                    r6 = r7
                    if (r11 == 0) goto L44
                L30:
                    android.content.Intent r0 = r11.getExtra()
                    if (r0 == 0) goto L44
                    android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r0)
                    if (r1 == 0) goto L44
                    java.lang.String r0 = "enter_method"
                    java.lang.String r0 = r1.getString(r0)
                    if (r0 != 0) goto L65
                L44:
                    r5 = 0
                    if (r11 == 0) goto L63
                    android.content.Intent r0 = r11.getExtra()
                    if (r0 == 0) goto L63
                    android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r0)
                    if (r1 == 0) goto L63
                    java.lang.String r0 = "inner_push_type"
                    int r4 = r1.getInt(r0)
                L59:
                    r3 = 1
                    if (r2 == 0) goto L62
                    int r0 = r2.length()
                    if (r0 != 0) goto L69
                L62:
                    return r3
                L63:
                    r4 = 0
                    goto L59
                L65:
                    r7 = r0
                    goto L44
                L67:
                    r2 = r8
                    goto L15
                L69:
                    com.ss.android.ugc.aweme.im.service.model.IMUser r2 = X.C80533Eb.LJFF(r2, r8)
                    if (r2 != 0) goto L70
                    return r3
                L70:
                    X.3tv r1 = new X.3tv
                    android.app.Activity r0 = X.C84763XOl.LJIIIIZZ()
                    r1.<init>(r0, r2)
                    r1.setEnterFromForMob(r6)
                    r1.setEnterMethodForMob(r7)
                    r1.setFullScreenByDefault(r5)
                    r1.setShowKeyBoardByDefault(r5)
                    r1.setInnerPushType(r4)
                    r1.setQuickChat(r3)
                    r1.setTCM(r5)
                    X.3tm r0 = X.C98503tm.LIZ
                    r0.LJFF(r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$interceptSchema$1.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC107424Jm getActivityStatusAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getActivityStatusAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public ActivityStatusViewModelImpl getActivityStatusViewModel() {
        return (ActivityStatusViewModelImpl) this.activityStatusViewModel$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public AbstractC53585L1h<L4O, AUS> getAvatarActiveAdapter() {
        C53503KzD c53503KzD = C53503KzD.LIZ;
        o.LJII(c53503KzD, "null cannot be cast to non-null type com.ss.android.ugc.aweme.avatar.protocol.BaseAvatarBusinessAdapter<com.ss.android.ugc.aweme.avatar.protocol.IAvatarBusinessState, com.ss.android.ugc.aweme.avatar.protocol.IAvatarBusinessVariant>");
        return c53503KzD;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC84043Ro getFamiliarService() {
        return IMServiceProvider.INSTANCE.getFamiliarService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public LV9 getGroupChatService() {
        return IMServiceProvider.INSTANCE.getGroupChatService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC98813uH getImChatService() {
        return IMServiceProvider.INSTANCE.getImChatService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC116514hj getImChatSettingsService() {
        return IMServiceProvider.INSTANCE.getImChatSettingsService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4CJ getImDrawableService() {
        return new C44384HbQ();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4HV getImEnsureService() {
        return IMServiceProvider.INSTANCE.getImEnsureService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4HX getImFilterKeywordsService() {
        return IMServiceProvider.INSTANCE.getImFilterKeywordsService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4CG getImFrescoService() {
        return IMServiceProvider.INSTANCE.getImFrescoService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC71996SNk getImIIMNudeFilterService() {
        return IMServiceProvider.INSTANCE.getImNudeFilterService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC40381Ft3 getImInitializeService() {
        return new C30591Hz();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC86093Zl getImMafService() {
        return IMServiceProvider.INSTANCE.getImMafService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4C7 getImNaviAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getImNaviAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC55617LsD getImNotificationService() {
        return IMServiceProvider.INSTANCE.getImNotificationService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC112734bd getImNudgeAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getImNudgeAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC112624bS getImNudgeService() {
        return IMServiceProvider.INSTANCE.getImNudgeService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC56268M6m getImParser() {
        return new C56264M6i();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC57106Mb8 getImSayHiService() {
        return IMServiceProvider.INSTANCE.getImSayHiService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC221688my getImSayhiAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getImSayhiAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4R6 getImShareAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getImShareAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC88043cu getImStickerStoreService() {
        return IMServiceProvider.INSTANCE.getImStickerStoreService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C8SE getImTakoService() {
        return IMServiceProvider.INSTANCE.getImTakoService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C3GF getImUserService() {
        return IMServiceProvider.INSTANCE.getImUserService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC102253zp getImVideoService() {
        return IMServiceProvider.INSTANCE.getImVideoService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC100803xU getImXBridgeProviderService() {
        return IMServiceProvider.INSTANCE.getImXBridgeProviderService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC109664Sc getInboxAdapterService() {
        return IMServiceProvider.INSTANCE.getInboxAdapterService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4HU getInboxAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getInboxAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IImInboxDmService getInboxDmService() {
        return IMServiceProvider.INSTANCE.getInboxDmService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4K8 getMessagingGeckoUtils() {
        return IMServiceProvider.INSTANCE.getMessagingGeckoUtils();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC116174hB getMufActivityStatusModel() {
        return (InterfaceC116174hB) this.mufActivityStatusModel$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC106314Ff getPerformanceService() {
        return IMServiceProvider.INSTANCE.getPerformanceService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4I7 getProfileViewerAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getProfileViewerAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC221448ma getQuickReplyAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getQuickReplyAnalytics();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC98123tA getRelationService() {
        return IMServiceProvider.INSTANCE.getRelationService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC111984aQ getSearchService() {
        return IMServiceProvider.INSTANCE.getImSearchService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC101213y9 getSendMessageTemplateService() {
        return IMServiceProvider.INSTANCE.getSendMessageTemplateService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC109344Qw getShareService() {
        return IMServiceProvider.INSTANCE.getShareService();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C32U getStickerStoreAnalytics() {
        return IMAnalyticsProvider.INSTANCE.getStickerStoreAnalytics();
    }

    public IMService() {
        IIMEntranceService iIMEntranceService;
        Object LIZ = C58096Mr6.LIZ(IIMEntranceService.class, false);
        if (LIZ != null) {
            iIMEntranceService = (IIMEntranceService) LIZ;
        } else {
            if (C58096Mr6.u == null) {
                synchronized (IIMEntranceService.class) {
                    if (C58096Mr6.u == null) {
                        C58096Mr6.u = new ImEntranceService();
                    }
                }
            }
            iIMEntranceService = C58096Mr6.u;
        }
        iIMEntranceService.init(this);
    }

    public final InterfaceC116174hB createMUFActivityStatusModel() {
        InterfaceC100593x9 LIZ = ((InterfaceC100563x6) C1E5.LIZLLL(InterfaceC100563x6.class, C16880lQ.LLLLL(EF7.LIZIZ()))).LIZ();
        C3B2 activityStatusViewModel = createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
        C3AL.LIZ.getClass();
        return LIZ.LIZ(activityStatusViewModel, C3AL.LIZ(), C48841JEv.LIZ(T2R.LJIIJJI().plus(C78613UtF.LIZJ)));
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public void initActivityStatusMsgReceiveOptimization() {
        ((InterfaceC100563x6) C1E5.LIZLLL(InterfaceC100563x6.class, C16880lQ.LLLLL(EF7.LIZIZ()))).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC100183wU getActivityStatusAccuracyAnalysis() {
        return C112224ao.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC55770Lug getAutoMessageTooltipHelper() {
        return C3VX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC45541Hu5 getCameraService() {
        return new InterfaceC45541Hu5() { // from class: X.4Il
            @Override // X.InterfaceC45541Hu5
            public final MediaFilesCleanTask LJFF() {
                return new MediaFilesCleanTask();
            }

            @Override // X.InterfaceC45541Hu5
            public final void LJI() {
                C107174In c107174In = C107174In.LJLIL;
                Keva repo = C43988HOe.LIZIZ();
                o.LJIIIIZZ(repo, "repo");
                c107174In.invoke(repo);
            }

            @Override // X.InterfaceC45541Hu5
            public final boolean LIZ() {
                return C113774dJ.LIZ();
            }

            @Override // X.InterfaceC45541Hu5
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC45541Hu5
            public final void LIZJ() {
            }

            @Override // X.InterfaceC45541Hu5
            public final void LJII() {
            }

            @Override // X.InterfaceC45541Hu5
            public final FeedUserPhotoReplyViewHolder LJIIIIZZ(Object params) {
                o.LJIIIZ(params, "params");
                if (params instanceof C222588oQ) {
                    return new FeedUserPhotoReplyViewHolder((C222588oQ) params);
                }
                return null;
            }

            @Override // X.InterfaceC45541Hu5
            public final void LJIIIZ(String serializedMsg) {
                o.LJIIIZ(serializedMsg, "serializedMsg");
                C109544Rq c109544Rq = (C109544Rq) C62070OXq.LIZ(C109544Rq.class, serializedMsg);
                if (c109544Rq == null) {
                    return;
                }
                C78897Uxp.LJJLIIIJILLIZJL(c109544Rq, true);
                C78857UxB.LJJJJI(new C70042oy(c109544Rq, null));
            }

            @Override // X.InterfaceC45541Hu5
            public final void LIZLLL(int i, String serializedMsg) {
                o.LJIIIZ(serializedMsg, "serializedMsg");
                C109544Rq c109544Rq = (C109544Rq) C62070OXq.LIZ(C109544Rq.class, serializedMsg);
                if (c109544Rq == null) {
                    return;
                }
                String conversationId = c109544Rq.getConversationId();
                o.LJIIIIZZ(conversationId, "mediaMsg.conversationId");
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(conversationId);
                if (LIZ2 != null) {
                    java.util.Map<String, String> localExt = LIZ2.getLocalExt();
                    if (localExt != null) {
                        localExt.put("a:media_mask", CardStruct.IStatusCode.DEFAULT);
                    }
                    String conversationId2 = LIZ2.getConversationId();
                    o.LJIIIIZZ(conversationId2, "conversationId");
                    AbstractC90763hI LIZ3 = C81273Gx.LIZ(conversationId2);
                    java.util.Map<String, String> localExt2 = LIZ2.getLocalExt();
                    o.LJIIIIZZ(localExt2, "localExt");
                    LIZ3.LJIJJ(localExt2, null);
                }
                C78897Uxp.LJJLIIIJILLIZJL(c109544Rq, false);
                if (i == 1 || i == 2) {
                    java.util.Map<String, String> localExt3 = c109544Rq.getLocalExt();
                    o.LJIIIIZZ(localExt3, "localExt");
                    localExt3.put("a:nude_unmask", "1");
                    C106674Gp.LJIILJJIL(c109544Rq);
                }
                C78857UxB.LJJJJI(new C70032ox(c109544Rq, i, null));
            }

            @Override // X.InterfaceC45541Hu5
            public final C73487Ssl LJ(final int i, final boolean z) {
                C73428Sro LJJL = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.4hl
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<DMMediaAuthConfig> interfaceC73573Su9) {
                        String LIZ2;
                        String string;
                        if (!z) {
                            DMMediaAuthConfig dMMediaAuthConfig = null;
                            try {
                                LIZ2 = C116544hm.LIZ(i);
                            } catch (Exception unused) {
                            }
                            if (LIZ2 != null && (string = ((Keva) C116544hm.LIZ.getValue()).getString(LIZ2, "")) != null && string.length() != 0) {
                                dMMediaAuthConfig = (DMMediaAuthConfig) C62070OXq.LIZ(DMMediaAuthConfig.class, string);
                                if (dMMediaAuthConfig != null && dMMediaAuthConfig.getImageUploadConfig() != null && dMMediaAuthConfig.getVideoUploadConfig() != null) {
                                    if (System.currentTimeMillis() <= Math.min(CastLongProtector.parseLong(dMMediaAuthConfig.getImageUploadConfig().getAuthToken().getExpireTime()), CastLongProtector.parseLong(dMMediaAuthConfig.getVideoUploadConfig().getAuthToken().getExpireTime()))) {
                                        interfaceC73573Su9.onNext(dMMediaAuthConfig);
                                    }
                                }
                            }
                        }
                        interfaceC73573Su9.onComplete();
                    }
                }).LJJL(T16.LIZ());
                C73675Svn LJIILL = DMMediaApi.LIZIZ.getDMMediaUploadAuthConfig(i).LJJL(T16.LIZ()).LJIILL(new InterfaceC64592gB() { // from class: X.4Im
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object it) {
                        o.LJIIIIZZ(it, "it");
                        String LIZ2 = C116544hm.LIZ(i);
                        if (LIZ2 != null) {
                            ((Keva) C116544hm.LIZ.getValue()).storeString(LIZ2, C62070OXq.LIZIZ(it));
                        }
                    }
                });
                C73320Sq4.LIZ(LJIILL, "source2 is null");
                AbstractC73672Svk LJIIIIZZ = AbstractC73672Svk.LJIIIIZZ(LJJL, LJIILL);
                LJIIIIZZ.getClass();
                return new C73487Ssl(LJIIIIZZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC38673FFt getHeavyJobControlService() {
        return new InterfaceC38673FFt() { // from class: X.4Hd
            @Override // X.InterfaceC38673FFt
            public final void LIZ() {
                C34B.LJI("IMHeavyJobControlService", "startHeavyJob");
                C96423qQ.LIZ();
                C4Z2.LJIIL();
                ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) C100573x7.LIZ.getValue();
                activityStatusViewModelImpl.LJLILLLLZI.LIZ("startPolling");
                C73411SrX c73411SrX = activityStatusViewModelImpl.LLF;
                if (c73411SrX != null) {
                    activityStatusViewModelImpl.LJLLJ.LIZIZ(c73411SrX);
                }
                C73411SrX c73411SrX2 = activityStatusViewModelImpl.LLFF;
                if (c73411SrX2 != null) {
                    activityStatusViewModelImpl.LJLLJ.LIZIZ(c73411SrX2);
                }
                activityStatusViewModelImpl.LJIJJ();
                activityStatusViewModelImpl.LJIJI();
                activityStatusViewModelImpl.LJIIZILJ(null, ORZ.LLJI(activityStatusViewModelImpl.LJLJLJ.keySet()), false);
                activityStatusViewModelImpl.LJIIZILJ(null, ORZ.LLJI(activityStatusViewModelImpl.LJLJL.keySet()), false);
            }

            @Override // X.InterfaceC38673FFt
            public final void LIZIZ() {
                C34B.LJI("IMHeavyJobControlService", "stopHeavyJob");
                C96423qQ.LIZ();
                C4Z2.LJIIJJI();
                ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) C100573x7.LIZ.getValue();
                activityStatusViewModelImpl.LJLILLLLZI.LIZ("stopPolling");
                C73411SrX c73411SrX = activityStatusViewModelImpl.LLF;
                if (c73411SrX != null) {
                    activityStatusViewModelImpl.LJLLJ.LIZIZ(c73411SrX);
                }
                C73411SrX c73411SrX2 = activityStatusViewModelImpl.LLFF;
                if (c73411SrX2 != null) {
                    activityStatusViewModelImpl.LJLLJ.LIZIZ(c73411SrX2);
                }
                activityStatusViewModelImpl.LLF = null;
                activityStatusViewModelImpl.LLFF = null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4HW getIMErrorMonitor() {
        return new C4HW() { // from class: X.3x1
            @Override // X.C4HW
            public final void LIZ(String event) {
                o.LJIIIZ(event, "event");
                Iterator it = ((CopyOnWriteArraySet) C115074fP.LJLILLLLZI.getValue()).iterator();
                while (it.hasNext()) {
                    ((C4ZB) it.next()).LIZJ(event);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC59802Wi getImImageService() {
        return new InterfaceC59802Wi() { // from class: X.2Wh
            @Override // X.InterfaceC59802Wi
            public final List<OSZ<String, Long>> LIZ() {
                long j;
                java.util.Map<String, Long> cacheSizeMap = ((IMImageCacheSizeSetting.IMImageCacheSizeConfig) IMImageCacheSizeSetting.LIZIZ.getValue()).getCacheSizeMap();
                EnumC61782be[] values = EnumC61782be.values();
                ArrayList arrayList = new ArrayList(values.length);
                for (EnumC61782be enumC61782be : values) {
                    String space = enumC61782be.getSpace();
                    Long l = cacheSizeMap.get(enumC61782be.getSpace());
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 536870912;
                    }
                    arrayList.add(new OSZ(space, Long.valueOf(j)));
                }
                return arrayList;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C4HY getInboxTabChangeManager() {
        return C79673At.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public long getInitTimestamp() {
        return this.initTimestamp;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public A7X getLandAutoMsgToChatHelper() {
        return C70402pY.LIZ;
    }

    public static IIMService createIIMServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IIMService.class, z);
        if (LIZ != null) {
            return (IIMService) LIZ;
        }
        if (C58096Mr6.h1 == null) {
            synchronized (IIMService.class) {
                if (C58096Mr6.h1 == null) {
                    C58096Mr6.h1 = new IMService();
                }
            }
        }
        return C58096Mr6.h1;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public void initialize(Application application, C100623xC c100623xC, InterfaceC83383Pa proxy) {
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        o.LJIIIZ(application, "application");
        o.LJIIIZ(proxy, "proxy");
        inst = this;
        if (c100623xC != null) {
            String str = c100623xC.LIZJ;
            o.LJIIIIZZ(str, "config.apiHost");
            C30Y.LIZ = str;
            o.LJIIIIZZ(c100623xC.LIZ, "config.wsUrl");
            o.LJIIIIZZ(c100623xC.LIZIZ, "config.wsHttpHost");
        }
        C85773Yf c85773Yf = C85773Yf.LJLIL;
        if (((C3UM.LIZ() != 3 && C3UM.LIZ() != 4 && !C117504jK.LIZ) || C36839Ed1.LIZIZ(EF7.LIZIZ())) && C85773Yf.LJLJJI.compareAndSet(false, true)) {
            C96423qQ.LIZ();
            C4Z2.LJIJJLI();
            C34B.LJI("AwemeImManager", "init");
            C85773Yf.LJLJI = proxy;
            if (C3YZ.LIZ()) {
                C4ZL.LIZLLL();
                C76482zM.LIZ(c85773Yf);
            }
            C72242sW c72242sW = new C72242sW();
            if (DPI.LIZ() || (C53166Ktm.LIZ() & 1) != 1) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                j = 5000;
            } else if (!DPI.LIZ() ? (C53166Ktm.LIZ() & 4) == 4 : !(!C35478DwA.LIZIZ() || !DS1.LIZ())) {
                j = 8000;
            } else {
                j = 10;
            }
            c72242sW.element = j;
            if ((C33778DNm.LIZ() & 512) == 512) {
                long j2 = c72242sW.element;
                if (j2 >= 5000) {
                    c72242sW.element = j2 - 1000;
                }
            }
            long j3 = c72242sW.element;
            if ((C4LY.LIZIZ() & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if ((C4LY.LIZIZ() & 8) == 8) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    String LIZJ = C100483wy.LIZJ("has_mutual_follow_friends");
                    if (o.LJ(LIZJ, CardStruct.IStatusCode.DEFAULT)) {
                        j3 = C100483wy.LIZ();
                    }
                    C100483wy.LJ(C4LY.LIZIZ(), j3, LIZJ, null, null, null, null, null, null, 1016);
                } else {
                    if ((C4LY.LIZIZ() & 16) == 16) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        String LIZJ2 = C100483wy.LIZJ("has_mutual_follow_friends");
                        String LIZJ3 = C100483wy.LIZJ("send_message_label");
                        String LIZJ4 = C100483wy.LIZJ("receive_message_label");
                        String LIZJ5 = C100483wy.LIZJ("like_message_label");
                        if (o.LJ(LIZJ2, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ3, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ4, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ5, CardStruct.IStatusCode.DEFAULT)) {
                            j3 = C100483wy.LIZ();
                        }
                        C100483wy.LJ(C4LY.LIZIZ(), j3, LIZJ2, LIZJ3, LIZJ4, LIZJ5, null, null, null, 960);
                    } else {
                        if ((C4LY.LIZIZ() & 32) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            String LIZJ6 = C100483wy.LIZJ("has_mutual_follow_friends");
                            String LIZJ7 = C100483wy.LIZJ("send_message_label");
                            String LIZJ8 = C100483wy.LIZJ("receive_message_label");
                            String LIZJ9 = C100483wy.LIZJ("like_message_label");
                            String LIZIZ = C100483wy.LIZIZ("send_message_local_label");
                            String LIZIZ2 = C100483wy.LIZIZ("receive_message_local_label");
                            String LIZIZ3 = C100483wy.LIZIZ("like_message_local_label");
                            if (o.LJ(LIZJ6, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ7, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ8, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ9, CardStruct.IStatusCode.DEFAULT) && !o.LJ(LIZIZ, "1") && !o.LJ(LIZIZ2, "1") && !o.LJ(LIZIZ3, "1")) {
                                j3 = C100483wy.LIZ();
                            }
                            C100483wy.LJ(C4LY.LIZIZ(), j3, LIZJ6, LIZJ7, LIZJ8, LIZJ9, LIZIZ, LIZIZ2, LIZIZ3, 512);
                        } else if ((C4LY.LIZIZ() & 128) == 128) {
                            String LIZJ10 = C100483wy.LIZJ("has_mutual_follow_friends");
                            String LIZJ11 = C100483wy.LIZJ("send_message_label");
                            String LIZJ12 = C100483wy.LIZJ("receive_message_label");
                            String LIZJ13 = C100483wy.LIZJ("like_message_label");
                            if (o.LJ(LIZJ11, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ12, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ13, CardStruct.IStatusCode.DEFAULT)) {
                                j3 = ((C4LY.LIZIZ() & 512) == 512 && o.LJ(LIZJ10, CardStruct.IStatusCode.DEFAULT)) ? -1000L : C100483wy.LIZ();
                            }
                            C100483wy.LJ(C4LY.LIZIZ(), j3, LIZJ10, LIZJ11, LIZJ12, LIZJ13, null, null, null, 960);
                        } else if ((C4LY.LIZIZ() & 256) == 256) {
                            String LIZJ14 = C100483wy.LIZJ("has_mutual_follow_friends");
                            String LIZJ15 = C100483wy.LIZJ("send_message_label");
                            String LIZJ16 = C100483wy.LIZJ("receive_message_label");
                            String LIZJ17 = C100483wy.LIZJ("like_message_label");
                            String LIZIZ4 = C100483wy.LIZIZ("send_message_local_label");
                            String LIZIZ5 = C100483wy.LIZIZ("receive_message_local_label");
                            String LIZIZ6 = C100483wy.LIZIZ("like_message_local_label");
                            if (o.LJ(LIZJ15, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ16, CardStruct.IStatusCode.DEFAULT) && o.LJ(LIZJ17, CardStruct.IStatusCode.DEFAULT) && !o.LJ(LIZIZ4, "1") && !o.LJ(LIZIZ5, "1") && !o.LJ(LIZIZ6, "1")) {
                                j3 = ((C4LY.LIZIZ() & 512) == 512 && o.LJ(LIZJ14, CardStruct.IStatusCode.DEFAULT)) ? -1000L : C100483wy.LIZ();
                            }
                            C100483wy.LJ(C4LY.LIZIZ(), j3, LIZJ14, LIZJ15, LIZJ16, LIZJ17, LIZIZ4, LIZIZ5, LIZIZ6, 512);
                        }
                    }
                }
            }
            c72242sW.element = j3;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start sdk delay time:");
            LIZ.append(c72242sW.element);
            C34B.LJI("AwemeImManager", X1D.LIZIZ(LIZ));
            if (c72242sW.element != -1000) {
                C85773Yf.LJLJJL = XKX.LIZLLL(C85773Yf.LJLILLLLZI, null, null, new C72212sT(c72242sW, null), 3);
            }
        }
        interceptSchema();
        C100493wz c100493wz = C100493wz.LJLIL;
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            c100493wz.invoke();
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C62752dD(c100493wz, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public void setHighlightText(TextView textView, String str, String keyword) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(keyword, "keyword");
        C93603ls.LIZIZ(textView, str, keyword);
    }
}
