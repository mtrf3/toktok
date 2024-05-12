package com.ss.android.ugc.aweme.services.effectplatform;

import X.C76800UCe;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;

/* loaded from: classes8.dex */
public interface IEffectPlatformFactory {
    InterfaceC84498XEg create(EffectPlatformBuilder effectPlatformBuilder);

    InterfaceC84498XEg create(EffectConfiguration.Builder builder, InterfaceC88472Yns<? super EffectConfiguration, C76800UCe> interfaceC88472Yns, boolean z, boolean z2);

    EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder);

    List<Host> getDownloadableModelHosts();

    List<Host> getHosts();

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ InterfaceC84498XEg create$default(IEffectPlatformFactory iEffectPlatformFactory, EffectConfiguration.Builder builder, InterfaceC88472Yns interfaceC88472Yns, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                if ((i & 8) != 0) {
                    z2 = false;
                }
                return iEffectPlatformFactory.create(builder, interfaceC88472Yns, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }
}
