package X;

import com.ss.ugc.live.sdk.message.data.PayloadItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YLy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87246YLy {
    public static final /* synthetic */ int LIZ = 0;

    public static final long LIZ(PayloadItem payloadItem) {
        List<C87247YLz> headers;
        C87247YLz c87247YLz;
        String str;
        Long LJJIZ;
        if (payloadItem != null && (headers = payloadItem.getHeaders()) != null) {
            Iterator<C87247YLz> it = headers.iterator();
            while (true) {
                if (it.hasNext()) {
                    c87247YLz = it.next();
                    if (o.LJ(c87247YLz.LIZ, "enter_uniq_id")) {
                        break;
                    }
                } else {
                    c87247YLz = null;
                    break;
                }
            }
            C87247YLz c87247YLz2 = c87247YLz;
            if (c87247YLz2 != null && (str = c87247YLz2.LIZIZ) != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                return LJJIZ.longValue();
            }
        }
        return 0L;
    }

    public static final String LIZIZ(PayloadItem payloadItem) {
        List<C87247YLz> headers;
        C87247YLz c87247YLz;
        if (payloadItem == null || (headers = payloadItem.getHeaders()) == null) {
            return null;
        }
        Iterator<C87247YLz> it = headers.iterator();
        while (true) {
            if (it.hasNext()) {
                c87247YLz = it.next();
                if (o.LJ(c87247YLz.LIZ, "im_cursor")) {
                    break;
                }
            } else {
                c87247YLz = null;
                break;
            }
        }
        C87247YLz c87247YLz2 = c87247YLz;
        if (c87247YLz2 == null) {
            return null;
        }
        return c87247YLz2.LIZIZ;
    }

    public static final long LIZJ(PayloadItem payloadItem) {
        List<C87247YLz> headers;
        C87247YLz c87247YLz;
        String str;
        Long LJJIZ;
        if (payloadItem != null && (headers = payloadItem.getHeaders()) != null) {
            Iterator<C87247YLz> it = headers.iterator();
            while (true) {
                if (it.hasNext()) {
                    c87247YLz = it.next();
                    if (o.LJ(c87247YLz.LIZ, "room_id")) {
                        break;
                    }
                } else {
                    c87247YLz = null;
                    break;
                }
            }
            C87247YLz c87247YLz2 = c87247YLz;
            if (c87247YLz2 != null && (str = c87247YLz2.LIZIZ) != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                return LJJIZ.longValue();
            }
        }
        return 0L;
    }
}
