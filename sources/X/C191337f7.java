package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.7f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191337f7 extends F9E implements Serializable {
    public final double LJLIL;
    public final double LJLILLLLZI;
    public final double LJLJI;
    public final double LJLJJI;
    public final double LJLJJL;
    public final double LJLJJLL;
    public final double LJLJL;
    public final double LJLJLJ;
    public final double LJLJLLL;
    public final boolean LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final List<C191427fG> LJLLL;

    public static /* synthetic */ C191337f7 copy$default(C191337f7 c191337f7, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, boolean z, String str, String str2, String str3, List list, int i, Object obj) {
        double d10 = d;
        double d11 = d2;
        double d12 = d7;
        double d13 = d6;
        double d14 = d5;
        double d15 = d3;
        double d16 = d4;
        List list2 = list;
        double d17 = d9;
        String str4 = str;
        double d18 = d8;
        String str5 = str3;
        boolean z2 = z;
        String str6 = str2;
        if ((i & 1) != 0) {
            d10 = c191337f7.LJLIL;
        }
        if ((i & 2) != 0) {
            d11 = c191337f7.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            d15 = c191337f7.LJLJI;
        }
        if ((i & 8) != 0) {
            d16 = c191337f7.LJLJJI;
        }
        if ((i & 16) != 0) {
            d14 = c191337f7.LJLJJL;
        }
        if ((i & 32) != 0) {
            d13 = c191337f7.LJLJJLL;
        }
        if ((i & 64) != 0) {
            d12 = c191337f7.LJLJL;
        }
        if ((i & 128) != 0) {
            d18 = c191337f7.LJLJLJ;
        }
        if ((i & 256) != 0) {
            d17 = c191337f7.LJLJLLL;
        }
        if ((i & 512) != 0) {
            z2 = c191337f7.LJLL;
        }
        if ((i & 1024) != 0) {
            str4 = c191337f7.LJLLI;
        }
        if ((i & 2048) != 0) {
            str6 = c191337f7.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            str5 = c191337f7.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            list2 = c191337f7.LJLLL;
        }
        List list3 = list2;
        double d19 = d16;
        double d20 = d14;
        return c191337f7.copy(d10, d11, d15, d19, d20, d13, d12, d18, d17, z2, str4, str6, str5, list3);
    }

    public final C191337f7 copy(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, boolean z, String poiId, String enterFrom, String address, List<C191427fG> poiMarkers) {
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(address, "address");
        o.LJIIIZ(poiMarkers, "poiMarkers");
        return new C191337f7(d, d2, d3, d4, d5, d6, d7, d8, d9, z, poiId, enterFrom, address, poiMarkers);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.LJLIL), Double.valueOf(this.LJLILLLLZI), Double.valueOf(this.LJLJI), Double.valueOf(this.LJLJJI), Double.valueOf(this.LJLJJL), Double.valueOf(this.LJLJJLL), Double.valueOf(this.LJLJL), Double.valueOf(this.LJLJLJ), Double.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL), this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL};
    }

    public final String getAddress() {
        return this.LJLLJ;
    }

    public final double getDefaultZoomLevel() {
        return this.LJLJI;
    }

    public final boolean getDisableInteraction() {
        return this.LJLL;
    }

    public final String getEnterFrom() {
        return this.LJLLILLLL;
    }

    public final double getMaxLat() {
        return this.LJLJJI;
    }

    public final double getMaxLng() {
        return this.LJLJJLL;
    }

    public final double getMaxUIZoomLevel() {
        return this.LJLJLLL;
    }

    public final double getMinLat() {
        return this.LJLJJL;
    }

    public final double getMinLng() {
        return this.LJLJL;
    }

    public final double getMinUIZoomLevel() {
        return this.LJLJLJ;
    }

    public final String getPoiId() {
        return this.LJLLI;
    }

    public final double getPoiLat() {
        return this.LJLIL;
    }

    public final double getPoiLng() {
        return this.LJLILLLLZI;
    }

    public final List<C191427fG> getPoiMarkers() {
        return this.LJLLL;
    }

    public C191337f7(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, boolean z, String poiId, String enterFrom, String address, List<C191427fG> poiMarkers) {
        o.LJIIIZ(poiId, "poiId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(address, "address");
        o.LJIIIZ(poiMarkers, "poiMarkers");
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
        this.LJLJI = d3;
        this.LJLJJI = d4;
        this.LJLJJL = d5;
        this.LJLJJLL = d6;
        this.LJLJL = d7;
        this.LJLJLJ = d8;
        this.LJLJLLL = d9;
        this.LJLL = z;
        this.LJLLI = poiId;
        this.LJLLILLLL = enterFrom;
        this.LJLLJ = address;
        this.LJLLL = poiMarkers;
    }

    public C191337f7(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, boolean z, String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, d6, d7, d8, d9, z, str, str2, str3, (i & FileUtils.BUFFER_SIZE) != 0 ? C61878OQg.INSTANCE : list);
    }
}
