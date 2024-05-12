package X;

import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.L7b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53735L7b extends TBS implements InterfaceC88471Ynr<String, Integer, C76800UCe> {
    public C53735L7b(Object obj) {
        super(2, obj, HeaderCTASocialInteractionComponent.class, "updateInteractionIcon", "updateInteractionIcon(Ljava/lang/String;Ljava/lang/Integer;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, Integer num) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        ((HeaderCTASocialInteractionComponent) this.receiver).updateInteractionIcon(p0, num);
        return C76800UCe.LIZ;
    }
}
