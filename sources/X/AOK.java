package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AOK extends AbstractC65781Prl implements InterfaceC88472Yns<MyProfileGuideState, MyProfileGuideState> {
    public static final AOK LJLIL = new AOK();

    public AOK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
        MyProfileGuideState updateState = myProfileGuideState;
        o.LJIIIZ(updateState, "$this$updateState");
        return MyProfileGuideState.copy$default(updateState, false, false, false, true, null, null, null, false, false, false, null, false, false, false, false, false, false, false, false, false, 1048551, null);
    }
}
