package Y;

import X.BZI;
import X.C0NB;
import X.C28618BLa;
import X.C28787BRn;
import X.C65123Ph9;
import X.C65124PhA;
import X.C68322mC;
import X.CN1;
import X.InterfaceC48038ItG;
import X.OSZ;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.model.FeedItem;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDhS10S1100000_5 implements InterfaceC48038ItG {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, android.graphics.Bitmap] */
    public static final Object apply$0(IDhS10S1100000_5 iDhS10S1100000_5, Object it) {
        o.LJIIIZ(it, "it");
        try {
            C65124PhA LIZLLL = C65124PhA.LIZLLL();
            String str = iDhS10S1100000_5.s0;
            ArrayList arrayList = new ArrayList();
            LIZLLL.getClass();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((C65123Ph9) ((INetworkService) CN1.LIZ(INetworkService.class)).downloadFile(false, Integer.MAX_VALUE, str, arrayList, null)).LIZ().LJ);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ((C68322mC) iDhS10S1100000_5.l1).element = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    return (Bitmap) ((C68322mC) iDhS10S1100000_5.l1).element;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e) {
            C0NB.LJI("EditImageForSubMethod", e);
            return null;
        }
    }

    public static final Object apply$1(IDhS10S1100000_5 iDhS10S1100000_5, Object obj) {
        Integer num;
        Object obj2;
        Object obj3;
        String str;
        Object obj4;
        BaseListResponse response = (BaseListResponse) obj;
        o.LJIIIZ(response, "response");
        String str2 = iDhS10S1100000_5.s0;
        Map map = (Map) iDhS10S1100000_5.l1;
        Integer valueOf = Integer.valueOf(response.statusCode);
        List<T> list = response.data;
        Object obj5 = null;
        if (list != 0) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_game_live_bottom_banner_request_rooms");
        LIZ.LJIJJ(str2, "enter_from");
        if (map != null) {
            obj2 = map.get("draw_video_id");
        } else {
            obj2 = null;
        }
        LIZ.LJIJJ(obj2, "group_id");
        if (map != null) {
            obj3 = map.get("draw_author_id");
        } else {
            obj3 = null;
        }
        LIZ.LJIJJ(obj3, "author_id");
        if (valueOf != null) {
            str = valueOf.toString();
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "error_code");
        if (map != null) {
            obj4 = map.get("related_live_tag");
        } else {
            obj4 = null;
        }
        LIZ.LJIJJ(obj4, "game_related_tag");
        if (map != null) {
            obj5 = map.get("tag_name");
        }
        LIZ.LJIJJ(obj5, "game_name");
        LIZ.LJIJJ(num, "room_cnt");
        LIZ.LJJIIJZLJL();
        ArrayList arrayList = new ArrayList();
        Collection collection = response.data;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        R r = response.extra;
        C28618BLa.LIZJ(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C28618BLa.LIZIZ((FeedItem) it.next());
        }
        return new OSZ(arrayList, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDhS10S1100000_5(String str, String str2, Map<String, String> map) {
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }
}
