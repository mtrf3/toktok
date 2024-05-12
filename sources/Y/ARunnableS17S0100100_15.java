package Y;

import X.C56178M3a;
import X.M3Z;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionAssemV2;

/* loaded from: classes16.dex */
public class ARunnableS17S0100100_15 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "first_frame";
        long j = this.j1;
        PoiPublishExtensionAssem poiPublishExtensionAssem = (PoiPublishExtensionAssem) this.l0;
        m3z.LIZ(j - ((Number) poiPublishExtensionAssem.LLFII.LIZ(poiPublishExtensionAssem, PoiPublishExtensionAssem.LLI[0])).longValue());
        C56178M3a.LIZ(m3z);
        Long l = ((PoiPublishExtensionAssem) this.l0).P3().LJLJJI;
        if (l != null) {
            long j2 = this.j1;
            long longValue = l.longValue();
            M3Z m3z2 = new M3Z("video_post_page");
            m3z2.LIZLLL = "page_render";
            m3z2.LIZ(j2 - longValue);
            C56178M3a.LIZ(m3z2);
        }
    }

    public final void LIZ$1() {
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "first_frame";
        long j = this.j1;
        PoiPublishExtensionAssemV2 poiPublishExtensionAssemV2 = (PoiPublishExtensionAssemV2) this.l0;
        m3z.LIZ(j - ((Number) poiPublishExtensionAssemV2.LJLLLL.LIZ(poiPublishExtensionAssemV2, PoiPublishExtensionAssemV2.LJZI[0])).longValue());
        C56178M3a.LIZ(m3z);
        Long l = ((PoiPublishExtensionAssemV2) this.l0).I3().LJLJJI;
        if (l != null) {
            long j2 = this.j1;
            long longValue = l.longValue();
            M3Z m3z2 = new M3Z("video_post_page");
            m3z2.LIZLLL = "page_render";
            m3z2.LIZ(j2 - longValue);
            C56178M3a.LIZ(m3z2);
        }
    }

    public static final void run$0(ARunnableS17S0100100_15 aRunnableS17S0100100_15) {
        boolean LIZ;
        try {
            aRunnableS17S0100100_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS17S0100100_15 aRunnableS17S0100100_15) {
        boolean LIZ;
        try {
            aRunnableS17S0100100_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS17S0100100_15(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
