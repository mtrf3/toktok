package X;

import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntranceAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8g7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217438g7 extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeEntranceAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C217438g7 LJLIL = new C217438g7();

    public C217438g7() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeEntranceAssem landscapeEntranceAssem, C43I<? extends C195357lb> c43i) {
        LandscapeEntranceAssem selectSubscribe = landscapeEntranceAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().getVisibility() == 0) {
            selectSubscribe.LLI = false;
            C218678i7.LIZ();
        }
        return C76800UCe.LIZ;
    }
}
