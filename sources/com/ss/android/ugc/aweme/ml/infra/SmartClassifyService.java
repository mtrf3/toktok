package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48513J2f;
import X.J44;
import X.J4E;
import X.J4H;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class SmartClassifyService implements ISmartClassifyService {
    public static final J4E Companion = new J4E();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ void classify(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, J4H j4h);

    public abstract /* synthetic */ void classifyWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, J4H j4h);

    public abstract /* synthetic */ void classifyWithAweme(String str, Aweme aweme, J4H j4h);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public abstract /* synthetic */ boolean isEnvReady(String str);

    public abstract /* synthetic */ String lastPredictResultLabel(String str, String str2);

    public abstract /* synthetic */ Map<String, Float> lastPredictResultScoreMap(String str);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartClassifyService instance() {
        Companion.getClass();
        return J44.LIZ;
    }
}
