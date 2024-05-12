package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.keva.Keva;
import com.google.gson.s;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickerStruct;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickersResponseBody;
import java.util.List;

/* renamed from: X.2to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73042to {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C73062tq.LJLIL);

    public static InterfaceC73052tp LIZ() {
        InterfaceC73052tp interfaceC73052tp;
        Long l;
        List<SuggestedStickerStruct> list;
        String string = ((Keva) LIZ.getValue()).getString("suggested_stickers_response", "");
        if (string == null || string.length() == 0) {
            return C73082ts.LIZ;
        }
        try {
            SuggestedStickersResponseBody suggestedStickersResponseBody = (SuggestedStickersResponseBody) C62070OXq.LIZ(SuggestedStickersResponseBody.class, string);
            long LIZJ = NetworkService.LJI().LIZJ();
            if (suggestedStickersResponseBody == null || (l = suggestedStickersResponseBody.expiry) == null || l.longValue() < LIZJ || (list = suggestedStickersResponseBody.stickers) == null) {
                interfaceC73052tp = C73082ts.LIZ;
            } else {
                interfaceC73052tp = new C59712Vz(list);
            }
            return interfaceC73052tp;
        } catch (s unused) {
            return C73082ts.LIZ;
        }
    }
}
