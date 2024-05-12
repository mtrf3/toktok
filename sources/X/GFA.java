package X;

import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GFA extends AbstractC65781Prl implements InterfaceC88472Yns<GF9, Mission> {
    public static final GFA LJLIL = new GFA();

    public GFA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Mission invoke(GF9 gf9) {
        GF9 inject = gf9;
        o.LJIIIZ(inject, "$this$inject");
        return inject.LIZLLL().creativeModel.commerceModel.getMission();
    }
}
