package X;

import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.PzX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66263PzX implements InterfaceC66269Pzd {
    @Override // X.InterfaceC66269Pzd
    public final void LIZ(C66240PzA previousStoreRegionInfo, C66240PzA currentStoreRegionInfo) {
        o.LJIIIZ(previousStoreRegionInfo, "previousStoreRegionInfo");
        o.LJIIIZ(currentStoreRegionInfo, "currentStoreRegionInfo");
        IComplianceBusinessService LJFF = a.LJFF();
        String str = previousStoreRegionInfo.LJLILLLLZI;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String str2 = (String) previousStoreRegionInfo.LJLJJI.LJLILLLLZI;
        String lowerCase2 = currentStoreRegionInfo.LJLILLLLZI.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        LJFF.LJJJI(lowerCase, str2, lowerCase2, (String) currentStoreRegionInfo.LJLJJI.LJLILLLLZI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tt store region manager callback: previousStoreRegionInfo = ");
        LIZ.append(previousStoreRegionInfo);
        LIZ.append(", currentStoreRegionInfo = ");
        LIZ.append(currentStoreRegionInfo);
        C26946Ahq.LIZ(X1D.LIZIZ(LIZ));
    }
}
