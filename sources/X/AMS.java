package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AMS extends AbstractC65781Prl implements InterfaceC88472Yns<MyProfileGuideState, MyProfileGuideState> {
    public static final AMS INSTANCE = new AMS();

    public AMS() {
        super(1);
    }

    public final MyProfileGuideState invoke(MyProfileGuideState receiver) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
        invoke(myProfileGuideState2);
        return myProfileGuideState2;
    }
}
