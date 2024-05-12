package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AOE extends AbstractC65781Prl implements InterfaceC88472Yns<MyProfileGuideState, MyProfileGuideState> {
    public static final AOE LJLIL = new AOE();

    public AOE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
        MyProfileGuideState updateState = myProfileGuideState;
        o.LJIIIZ(updateState, "$this$updateState");
        return MyProfileGuideState.copy$default(updateState, false, false, false, false, null, null, null, false, false, false, null, false, false, false, false, false, false, false, false, false, 786430, null);
    }
}
