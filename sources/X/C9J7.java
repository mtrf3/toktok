package X;

import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureSocialConnectComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.9J7, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class C9J7 extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public C9J7(Object obj) {
        super(1, obj, ProfileAdvancedFeatureSocialConnectComponent.class, "updateFeatureText", "updateFeatureText(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        ((HeaderAdvancedFeatureBaseUIComponent) this.receiver).I3(p0);
        return C76800UCe.LIZ;
    }
}
