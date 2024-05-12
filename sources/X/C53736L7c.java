package X;

import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.L7c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53736L7c extends TBS implements InterfaceC88471Ynr<String, String, C76800UCe> {
    public C53736L7c(Object obj) {
        super(2, obj, HeaderCTASocialInteractionComponent.class, "updateInterActionText", "updateInterActionText(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, String str2) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        ((HeaderCTASocialInteractionComponent) this.receiver).updateInterActionText(p0, str2);
        return C76800UCe.LIZ;
    }
}
