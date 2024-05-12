package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import kotlin.jvm.internal.o;

/* renamed from: X.ANm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26134ANm extends AbstractC65781Prl implements InterfaceC88472Yns<MyProfileGuideState, MyProfileGuideState> {
    public static final C26134ANm LJLIL = new C26134ANm();

    public C26134ANm() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
        MyProfileGuideState updateState = myProfileGuideState;
        o.LJIIIZ(updateState, "$this$updateState");
        return MyProfileGuideState.copy$default(updateState, true, false, false, false, null, null, null, false, false, false, null, false, false, false, false, false, false, false, false, false, 1048574, null);
    }
}
