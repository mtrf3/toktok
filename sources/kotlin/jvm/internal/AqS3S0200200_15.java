package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C56178M3a;
import X.C76800UCe;
import X.C85287Xdb;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.M3Z;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;

/* loaded from: classes16.dex */
public class AqS3S0200200_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AqS3S0200200_15 aqS3S0200200_15, Object obj) {
        ((PoiPublishExtensionVM) aqS3S0200200_15.l0).LJLJJI = Long.valueOf(System.currentTimeMillis());
        long currentTimeMillis = System.currentTimeMillis();
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "network_data_parse";
        m3z.LIZ(currentTimeMillis - aqS3S0200200_15.j2);
        m3z.LIZIZ(1L);
        C56178M3a.LIZ(m3z);
        ((InterfaceC88472Yns) aqS3S0200200_15.l1).invoke(Long.valueOf(System.currentTimeMillis() - aqS3S0200200_15.j3));
        ((PoiPublishExtensionVM) aqS3S0200200_15.l0).setState(new AqS181S0100000_15((PoiSearchApi.PoiSearchResultWrapper) obj, 222));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S0200200_15 aqS3S0200200_15, Object obj) {
        ((C85287Xdb) aqS3S0200200_15.l0).LIZ = Long.valueOf(System.currentTimeMillis());
        long currentTimeMillis = System.currentTimeMillis();
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "network_data_parse";
        m3z.LIZ(currentTimeMillis - aqS3S0200200_15.j2);
        m3z.LIZIZ(1L);
        C56178M3a.LIZ(m3z);
        ((InterfaceC88473Ynt) aqS3S0200200_15.l1).invoke(obj, Long.valueOf(System.currentTimeMillis() - aqS3S0200200_15.j3), ((C85287Xdb) aqS3S0200200_15.l0).LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0200200_15(C85287Xdb c85287Xdb, long j, IDqS439S0100000_15 iDqS439S0100000_15, long j2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c85287Xdb;
        this.j2 = j;
        this.l1 = iDqS439S0100000_15;
        this.j3 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS3S0200200_15) (LINE:83951623) kotlin.jvm.internal.AqS3S0200200_15.l1 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r2 I:kotlin.jvm.internal.AqS3S0200200_15) (LINE:83951616) kotlin.jvm.internal.AqS3S0200200_15.$t int, block:B:1:0x0000 */
    public AqS3S0200200_15(PoiPublishExtensionVM poiPublishExtensionVM, PoiPublishExtensionVM poiPublishExtensionVM2, long j, InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns, long j2) {
        super(1);
        int i;
        Object obj;
        this.$t = i;
        this.l0 = poiPublishExtensionVM;
        this.j2 = poiPublishExtensionVM2;
        this.l1 = obj;
        this.j3 = interfaceC88472Yns;
    }
}
