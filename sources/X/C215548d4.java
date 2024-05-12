package X;

import com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.8d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215548d4 extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuCreateEntranceAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C215548d4 LJLIL = new C215548d4();

    public C215548d4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuCreateEntranceAssem danmakuCreateEntranceAssem, C43I<? extends C195357lb> c43i) {
        DanmakuCreateEntranceAssem selectSubscribe = danmakuCreateEntranceAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            DanmakuViewModel q4 = selectSubscribe.q4();
            q4.lv0(true);
            q4.mv0();
            q4.LJLLLLLL = false;
        }
        return C76800UCe.LIZ;
    }
}
