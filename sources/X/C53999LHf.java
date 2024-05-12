package X;

import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;

/* renamed from: X.LHf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53999LHf extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C53999LHf(BaseRedDotImpl baseRedDotImpl) {
        super(1, baseRedDotImpl, BaseRedDotImpl.class, "onForegroundEvent", "onForegroundEvent(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.receiver.getClass();
        if (booleanValue) {
            C36203EIt.LIZ(EnumC36206EIw.HOT_START, null);
        }
        return C76800UCe.LIZ;
    }
}
