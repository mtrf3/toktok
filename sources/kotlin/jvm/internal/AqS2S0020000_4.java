package kotlin.jvm.internal;

import X.A3V;
import X.AbstractC65781Prl;
import X.C25615A3n;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;

/* loaded from: classes5.dex */
public class AqS2S0020000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S0020000_4 aqS2S0020000_4, Object obj) {
        A3V setState = (A3V) obj;
        o.LJIIIZ(setState, "$this$setState");
        return A3V.LIZ(setState, new C25615A3n(aqS2S0020000_4.z0, aqS2S0020000_4.z1, false, 12, 0), null, null, null, null, 30);
    }

    public static final Object invoke$1(AqS2S0020000_4 aqS2S0020000_4, Object obj) {
        ProfileState setState = (ProfileState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileState.copy$default(setState, null, null, null, null, null, 0, 0, false, null, null, null, false, null, null, null, null, null, null, false, null, false, false, null, false, null, null, null, Boolean.valueOf(aqS2S0020000_4.z0), Boolean.valueOf(aqS2S0020000_4.z1), null, null, null, null, -402653185, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0020000_4(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
