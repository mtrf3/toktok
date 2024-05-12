package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.C100783xS;
import X.C101203y8;
import X.C221108m2;
import X.C3GF;
import X.C4CG;
import X.C4HV;
import X.C4HX;
import X.C4K8;
import X.C5H3;
import X.C8SE;
import X.InterfaceC102253zp;
import X.InterfaceC106314Ff;
import X.InterfaceC109344Qw;
import X.InterfaceC109664Sc;
import X.InterfaceC111984aQ;
import X.InterfaceC112624bS;
import X.InterfaceC116514hj;
import X.InterfaceC55617LsD;
import X.InterfaceC57106Mb8;
import X.InterfaceC71996SNk;
import X.InterfaceC84043Ro;
import X.InterfaceC86093Zl;
import X.InterfaceC88043cu;
import X.InterfaceC98123tA;
import X.InterfaceC98813uH;
import X.LV9;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMServiceProvider {
    public static final C4K8 messagingGeckoUtils;
    public static final IMServiceProvider INSTANCE = new IMServiceProvider();
    public static final C5H3 relationService$delegate = C221108m2.LIZIZ(IMServiceProvider$relationService$2.INSTANCE);
    public static final C5H3 shareService$delegate = C221108m2.LIZIZ(IMServiceProvider$shareService$2.INSTANCE);
    public static final C5H3 familiarService$delegate = C221108m2.LIZIZ(IMServiceProvider$familiarService$2.INSTANCE);
    public static final C5H3 inboxAdapterService$delegate = C221108m2.LIZIZ(IMServiceProvider$inboxAdapterService$2.INSTANCE);
    public static final C5H3 inboxDmService$delegate = C221108m2.LIZIZ(IMServiceProvider$inboxDmService$2.INSTANCE);
    public static final C101203y8 sendMessageTemplateService = C101203y8.LIZIZ;
    public static final C5H3 performanceService$delegate = C221108m2.LIZIZ(IMServiceProvider$performanceService$2.INSTANCE);
    public static final C5H3 imUserService$delegate = C221108m2.LIZIZ(IMServiceProvider$imUserService$2.INSTANCE);
    public static final C5H3 imChatService$delegate = C221108m2.LIZIZ(IMServiceProvider$imChatService$2.INSTANCE);
    public static final C5H3 groupChatService$delegate = C221108m2.LIZIZ(IMServiceProvider$groupChatService$2.INSTANCE);
    public static final C5H3 imChatSettingsService$delegate = C221108m2.LIZIZ(IMServiceProvider$imChatSettingsService$2.INSTANCE);
    public static final C5H3 imNotificationService$delegate = C221108m2.LIZIZ(IMServiceProvider$imNotificationService$2.INSTANCE);
    public static final C5H3 imSayHiService$delegate = C221108m2.LIZIZ(IMServiceProvider$imSayHiService$2.INSTANCE);
    public static final C5H3 imMafService$delegate = C221108m2.LIZIZ(IMServiceProvider$imMafService$2.INSTANCE);
    public static final C5H3 imVideoService$delegate = C221108m2.LIZIZ(IMServiceProvider$imVideoService$2.INSTANCE);
    public static final C5H3 imStickerStoreService$delegate = C221108m2.LIZIZ(IMServiceProvider$imStickerStoreService$2.INSTANCE);
    public static final C5H3 imEnsureService$delegate = C221108m2.LIZIZ(IMServiceProvider$imEnsureService$2.INSTANCE);
    public static final C5H3 imNudgeService$delegate = C221108m2.LIZIZ(IMServiceProvider$imNudgeService$2.INSTANCE);
    public static final C5H3 imFrescoService$delegate = C221108m2.LIZIZ(IMServiceProvider$imFrescoService$2.INSTANCE);
    public static final C5H3 imFilterKeywordsService$delegate = C221108m2.LIZIZ(IMServiceProvider$imFilterKeywordsService$2.INSTANCE);
    public static final C5H3 imNudeFilterService$delegate = C221108m2.LIZIZ(IMServiceProvider$imNudeFilterService$2.INSTANCE);
    public static final C5H3 imXBridgeProviderService$delegate = C221108m2.LIZIZ(IMServiceProvider$imXBridgeProviderService$2.INSTANCE);
    public static final C5H3 imSearchService$delegate = C221108m2.LIZIZ(IMServiceProvider$imSearchService$2.INSTANCE);
    public static final C5H3 imTakoService$delegate = C221108m2.LIZIZ(IMServiceProvider$imTakoService$2.INSTANCE);

    static {
        final int i = 0;
        messagingGeckoUtils = new C4K8(i) { // from class: X.3xY
            public final InterfaceC88471Ynr<String, String, String> LIZ;
            public final InterfaceC88472Yns<String, Boolean> LIZIZ;
            public final String LIZJ;
            public final InterfaceC88472Yns<String, File> LIZLLL;

            @Override // X.C4K8
            public final boolean LIZIZ() {
                return this.LIZIZ.invoke("tt_messaging_mt_emoji_zip").booleanValue();
            }

            {
                C100853xZ getChannelPath = C100853xZ.LJLIL;
                C100863xa ifChannelExists = C100863xa.LJLIL;
                String LIZ = C38943FQd.LIZ();
                C100873xb fileBuilder = C100873xb.LJLIL;
                o.LJIIIZ(getChannelPath, "getChannelPath");
                o.LJIIIZ(ifChannelExists, "ifChannelExists");
                o.LJIIIZ(fileBuilder, "fileBuilder");
                this.LIZ = getChannelPath;
                this.LIZIZ = ifChannelExists;
                this.LIZJ = LIZ;
                this.LIZLLL = fileBuilder;
            }

            @Override // X.C4K8
            public final Object LIZ(String fileName) {
                o.LJIIIZ(fileName, "fileName");
                if (!LIZIZ()) {
                    C3C4 LIZ = C141335gf.LIZ(new IllegalStateException("GeckoEmojiUtils: gecko small emoji not loaded yet"));
                    C3C5.m7constructorimpl(LIZ);
                    return LIZ;
                }
                String invoke = this.LIZ.invoke(this.LIZJ, "tt_messaging_mt_emoji_zip");
                if (invoke == null || invoke.length() == 0) {
                    C3C4 LIZ2 = C141335gf.LIZ(new IllegalStateException("GeckoEmojiUtils: invalid parent channel path"));
                    C3C5.m7constructorimpl(LIZ2);
                    return LIZ2;
                }
                InterfaceC88472Yns<String, File> interfaceC88472Yns = this.LIZLLL;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(invoke);
                LIZ3.append(File.separator);
                LIZ3.append(fileName);
                File invoke2 = interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ3));
                if (!invoke2.exists()) {
                    C3C4 LIZ4 = C141335gf.LIZ(new IllegalStateException("GeckoEmojiUtils: emoji file does not exist"));
                    C3C5.m7constructorimpl(LIZ4);
                    return LIZ4;
                }
                String absolutePath = invoke2.getAbsolutePath();
                C3C5.m7constructorimpl(absolutePath);
                return absolutePath;
            }
        };
    }

    public final InterfaceC84043Ro getFamiliarService() {
        return (InterfaceC84043Ro) familiarService$delegate.getValue();
    }

    public final LV9 getGroupChatService() {
        return (LV9) groupChatService$delegate.getValue();
    }

    public final InterfaceC98813uH getImChatService() {
        return (InterfaceC98813uH) imChatService$delegate.getValue();
    }

    public final InterfaceC116514hj getImChatSettingsService() {
        return (InterfaceC116514hj) imChatSettingsService$delegate.getValue();
    }

    public final C4HV getImEnsureService() {
        return (C4HV) imEnsureService$delegate.getValue();
    }

    public final C4HX getImFilterKeywordsService() {
        return (C4HX) imFilterKeywordsService$delegate.getValue();
    }

    public final C4CG getImFrescoService() {
        return (C4CG) imFrescoService$delegate.getValue();
    }

    public final InterfaceC86093Zl getImMafService() {
        return (InterfaceC86093Zl) imMafService$delegate.getValue();
    }

    public final InterfaceC55617LsD getImNotificationService() {
        return (InterfaceC55617LsD) imNotificationService$delegate.getValue();
    }

    public final InterfaceC71996SNk getImNudeFilterService() {
        return (InterfaceC71996SNk) imNudeFilterService$delegate.getValue();
    }

    public final InterfaceC112624bS getImNudgeService() {
        return (InterfaceC112624bS) imNudgeService$delegate.getValue();
    }

    public final InterfaceC57106Mb8 getImSayHiService() {
        return (InterfaceC57106Mb8) imSayHiService$delegate.getValue();
    }

    public final InterfaceC111984aQ getImSearchService() {
        return (InterfaceC111984aQ) imSearchService$delegate.getValue();
    }

    public final InterfaceC88043cu getImStickerStoreService() {
        return (InterfaceC88043cu) imStickerStoreService$delegate.getValue();
    }

    public final C8SE getImTakoService() {
        return (C8SE) imTakoService$delegate.getValue();
    }

    public final C3GF getImUserService() {
        return (C3GF) imUserService$delegate.getValue();
    }

    public final InterfaceC102253zp getImVideoService() {
        return (InterfaceC102253zp) imVideoService$delegate.getValue();
    }

    public final C100783xS getImXBridgeProviderService() {
        return (C100783xS) imXBridgeProviderService$delegate.getValue();
    }

    public final InterfaceC109664Sc getInboxAdapterService() {
        return (InterfaceC109664Sc) inboxAdapterService$delegate.getValue();
    }

    public final IImInboxDmService getInboxDmService() {
        return (IImInboxDmService) inboxDmService$delegate.getValue();
    }

    public final InterfaceC106314Ff getPerformanceService() {
        return (InterfaceC106314Ff) performanceService$delegate.getValue();
    }

    public final InterfaceC98123tA getRelationService() {
        return (InterfaceC98123tA) relationService$delegate.getValue();
    }

    public final InterfaceC109344Qw getShareService() {
        return (InterfaceC109344Qw) shareService$delegate.getValue();
    }

    public final C4K8 getMessagingGeckoUtils() {
        return messagingGeckoUtils;
    }

    public final C101203y8 getSendMessageTemplateService() {
        return sendMessageTemplateService;
    }
}
