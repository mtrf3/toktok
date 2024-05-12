package X;

import com.ss.android.ugc.aweme.feed.assem.qabutton.QAInviteButtonAssem;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8RX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RX extends AbstractC65781Prl implements InterfaceC88471Ynr<QAInviteButtonAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C8RX LJLIL = new C8RX();

    public C8RX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(QAInviteButtonAssem qAInviteButtonAssem, C43I<? extends Boolean> c43i) {
        PriorityAbility priorityAbility;
        QAInviteButtonAssem selectSubscribe = qAInviteButtonAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (priorityAbility = (PriorityAbility) selectSubscribe.LLFII.getValue()) != null) {
            priorityAbility.Es(selectSubscribe, null, new AqS134S0200000_3(selectSubscribe, (QAInviteButtonAssem) c43i2, (C43I<Boolean>) 84));
        }
        return C76800UCe.LIZ;
    }
}
