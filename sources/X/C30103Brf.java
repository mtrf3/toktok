package X;

import com.bytedance.android.livesdk.model.message.RemindMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Brf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30103Brf extends TBS implements InterfaceC88472Yns<RemindMessage, C76800UCe> {
    public C30103Brf(C30087BrP c30087BrP) {
        super(1, c30087BrP, C30087BrP.class, "handleCopyrightViolation", "handleCopyrightViolation(Lcom/bytedance/android/livesdk/model/message/RemindMessage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(RemindMessage remindMessage) {
        RemindMessage p0 = remindMessage;
        o.LJIIIZ(p0, "p0");
        ((C30087BrP) this.receiver).LJLJI.handleCopyrightViolation(p0);
        return C76800UCe.LIZ;
    }
}
