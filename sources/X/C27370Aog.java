package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import kotlin.jvm.internal.o;

/* renamed from: X.Aog, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27370Aog extends AbstractC65781Prl implements InterfaceC88472Yns<District, Boolean> {
    public static final C27370Aog LJLIL = new C27370Aog();

    public C27370Aog() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(District district) {
        String str;
        District it = district;
        o.LJIIIZ(it, "it");
        String str2 = it.name;
        boolean z = true;
        if (str2 != null && !ujb.o.LJJJJJL(str2) && (str = it.geoNameId) != null && !ujb.o.LJJJJJL(str)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}