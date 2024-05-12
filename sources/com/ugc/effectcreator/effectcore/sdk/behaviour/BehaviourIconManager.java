package com.ugc.effectcreator.effectcore.sdk.behaviour;

import X.C36636EZk;
import X.C93606aTa;
import X.C93842aXO;
import X.C93843aXP;
import X.C94820anA;
import X.InterfaceC67352kd;
import X.InterfaceC79150V4o;
import X.XKX;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourIconManager;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes34.dex */
public final class BehaviourIconManager implements IBehaviourIconManager {
    public static final C93606aTa Companion = new C93606aTa();
    public final C93842aXO config = C93843aXP.LIZ().getEffectPlatformConfig();
    public final ConcurrentHashMap<String, String> iconQueryMap = new ConcurrentHashMap<>();
    public InterfaceC79150V4o queryFetchJob;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourIconManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preBuildIcon(X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager.preBuildIcon(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourIconManager
    public Object query(String str, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return XKX.LJI(C36636EZk.LIZ, new C94820anA(this, str, null), interfaceC67352kd);
    }
}
