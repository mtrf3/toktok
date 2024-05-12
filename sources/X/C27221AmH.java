package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AmH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27221AmH {
    public final List<C27021Aj3> LIZ;
    public final ClientConfig LIZIZ;
    public final LinkRichText LIZJ;
    public final AddressLocation LIZLLL;
    public final AddressRightsInfo LJ;

    public C27221AmH(List<C27021Aj3> items, ClientConfig clientConfig, LinkRichText linkRichText, AddressLocation addressLocation, AddressRightsInfo addressRightsInfo) {
        o.LJIIIZ(items, "items");
        this.LIZ = items;
        this.LIZIZ = clientConfig;
        this.LIZJ = linkRichText;
        this.LIZLLL = addressLocation;
        this.LJ = addressRightsInfo;
    }
}
