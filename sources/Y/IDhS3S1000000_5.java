package Y;

import X.BLU;
import X.C0NB;
import X.C15070iV;
import X.C28618BLa;
import X.C28619BLb;
import X.C32151Nz;
import X.C65123Ph9;
import X.C65124PhA;
import X.CN1;
import X.InterfaceC48038ItG;
import android.graphics.BitmapFactory;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.model.FeedItem;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDhS3S1000000_5 implements InterfaceC48038ItG {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public IDhS3S1000000_5(int i) {
        this.$t = i;
        this.s0 = "enter_auto_foru_feed_draw_refresh";
    }

    public IDhS3S1000000_5(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 4:
                this.s0 = str;
                return;
            case 1:
            case 3:
            default:
                this.s0 = str;
                return;
        }
    }

    public static final Object apply$0(IDhS3S1000000_5 iDhS3S1000000_5, Object uploadResultResponse) {
        o.LJIIIZ(uploadResultResponse, "uploadResultResponse");
        return new C15070iV(iDhS3S1000000_5.s0, uploadResultResponse);
    }

    public static final Object apply$1(IDhS3S1000000_5 iDhS3S1000000_5, Object obj) {
        return new C15070iV(iDhS3S1000000_5.s0, obj);
    }

    public static final Object apply$2(IDhS3S1000000_5 iDhS3S1000000_5, Object it) {
        o.LJIIIZ(it, "it");
        try {
            C65124PhA LIZLLL = C65124PhA.LIZLLL();
            String str = iDhS3S1000000_5.s0;
            ArrayList arrayList = new ArrayList();
            LIZLLL.getClass();
            return BitmapFactory.decodeStream(new ByteArrayInputStream(((C65123Ph9) ((INetworkService) CN1.LIZ(INetworkService.class)).downloadFile(false, Integer.MAX_VALUE, str, arrayList, null)).LIZ().LJ));
        } catch (Exception e) {
            C0NB.LJIIJ(6, "NinePatchUtil", e.getStackTrace());
            C0NB.LJ("NinePatchUtil", e.getMessage());
            return null;
        }
    }

    public static final Object apply$3(IDhS3S1000000_5 iDhS3S1000000_5, Object obj) {
        BaseListResponse response = (BaseListResponse) obj;
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList(response.data);
        C28618BLa.LIZJ(arrayList);
        if (!C32151Nz.LJJIIJZLJL(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28618BLa.LIZIZ((FeedItem) it.next());
            }
        }
        return new BLU(new C28619BLb(arrayList, (FeedExtra) response.extra), response.LIZ, response.LIZIZ, response.LIZJ, "click", iDhS3S1000000_5.s0);
    }

    public static final Object apply$4(IDhS3S1000000_5 iDhS3S1000000_5, Object obj) {
        BaseListResponse response = (BaseListResponse) obj;
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList(response.data);
        C28618BLa.LIZJ(arrayList);
        if (!C32151Nz.LJJIIJZLJL(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28618BLa.LIZIZ((FeedItem) it.next());
            }
        }
        return new BLU(new C28619BLb(arrayList, (FeedExtra) response.extra), response.LIZ, response.LIZIZ, response.LIZJ, "click", iDhS3S1000000_5.s0);
    }
}
