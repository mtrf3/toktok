package X;

import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.HeaderCTASocialEntranceComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.9J4, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class C9J4 extends TBS implements InterfaceC88472Yns<CharSequence, C76800UCe> {
    public C9J4(Object obj) {
        super(1, obj, HeaderCTASocialEntranceComponent.class, "updateContentDescription", "updateContentDescription(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(CharSequence charSequence) {
        CharSequence p0 = charSequence;
        o.LJIIIZ(p0, "p0");
        ((HeaderCTABaseUIComponent) this.receiver).updateContentDescription(p0);
        return C76800UCe.LIZ;
    }
}
