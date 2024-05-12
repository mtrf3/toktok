package com.ss.android.ugc.aweme.ml.infra;

import X.C48555J3v;
import X.C48557J3x;
import X.IFF;
import X.InterfaceC48513J2f;
import X.InterfaceC48558J3y;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public abstract class SmartRegressCalculateService implements ISmartRegressCalculateService {
    public static final C48557J3x Companion = new C48557J3x();
    public static final boolean debug = false;

    public abstract /* synthetic */ void calculate(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48558J3y interfaceC48558J3y);

    public abstract /* synthetic */ void calculateWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48558J3y interfaceC48558J3y);

    public abstract /* synthetic */ void calculateWithAweme(String str, Aweme aweme, InterfaceC48558J3y interfaceC48558J3y);

    public abstract /* synthetic */ void configSceneModel(String str, SmartRegressionSceneConfig smartRegressionSceneConfig);

    public abstract /* synthetic */ boolean enable(String str);

    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    public abstract /* synthetic */ boolean isEnvReady(String str);

    public abstract /* synthetic */ float lastCalculateResult(String str, float f);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartRegressCalculateService instance() {
        Companion.getClass();
        return C48555J3v.LIZ;
    }
}
