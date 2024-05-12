package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48513J2f;
import X.InterfaceC48561J4b;
import X.J45;
import X.J4F;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public abstract class SmartCommonPreloadService implements ISmartCommonPreloadService {
    public static final J4F Companion = new J4F();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public abstract /* synthetic */ void checkAndInit();

    public abstract /* synthetic */ void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig);

    public abstract /* synthetic */ boolean enable(String str);

    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    public abstract /* synthetic */ boolean isEnvReady(String str);

    public abstract /* synthetic */ boolean lastResult(String str, boolean z);

    public abstract /* synthetic */ float lastResultScore(String str, float f);

    public abstract /* synthetic */ void smartJudge(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48561J4b interfaceC48561J4b);

    public abstract /* synthetic */ void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48561J4b interfaceC48561J4b);

    public abstract /* synthetic */ void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC48561J4b interfaceC48561J4b);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartCommonPreloadService instance() {
        Companion.getClass();
        return J45.LIZ;
    }
}
