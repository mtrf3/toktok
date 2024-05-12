package X;

import com.ss.android.ugc.aweme.poi.tag.NearbyPoiTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.XyP, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86577XyP extends AbstractC65781Prl implements InterfaceC88471Ynr<NearbyPoiTagAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C86577XyP LJLIL = new C86577XyP();

    public C86577XyP() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NearbyPoiTagAssem nearbyPoiTagAssem, C43I<? extends Integer> c43i) {
        NearbyPoiTagAssem selectSubscribe = nearbyPoiTagAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLI = true;
            selectSubscribe.LLII.invoke();
        }
        return C76800UCe.LIZ;
    }
}
