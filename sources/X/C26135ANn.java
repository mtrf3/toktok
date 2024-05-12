package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import kotlin.jvm.internal.o;

/* renamed from: X.ANn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26135ANn extends AbstractC65781Prl implements InterfaceC88472Yns<MyProfileGuideState, MyProfileGuideState> {
    public static final C26135ANn LJLIL = new C26135ANn();

    public C26135ANn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
        MyProfileGuideState updateState = myProfileGuideState;
        o.LJIIIZ(updateState, "$this$updateState");
        return MyProfileGuideState.copy$default(updateState, false, false, false, true, null, null, null, false, false, false, null, false, false, false, false, false, false, false, false, false, 1048551, null);
    }
}
