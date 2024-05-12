package X;

import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226408ua extends AbstractC65781Prl implements InterfaceC88471Ynr<AddYoursEntranceButtonAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C226408ua LJLIL = new C226408ua();

    public C226408ua() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddYoursEntranceButtonAssem addYoursEntranceButtonAssem, C43I<? extends C195357lb> c43i) {
        AddYoursEntranceButtonAssem selectSubscribe = addYoursEntranceButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHolderUnSelectedEvent, event=");
        LIZ.append(c43i);
        C221018lt.LIZ("AddYoursEntranceButtonAssem", X1D.LIZIZ(LIZ));
        if (c43i != null) {
            selectSubscribe.LLIIJI = false;
            selectSubscribe.r4();
        }
        return C76800UCe.LIZ;
    }
}
