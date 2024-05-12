package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickersResponseBody;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.2tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73022tm implements InterfaceC70422pa, InterfaceC72972th {
    public static final C73022tm LJLIL = new C73022tm();
    public static final XIA LJLILLLLZI = C78613UtF.LIZJ;
    public static final XLM LJLJI = V8H.LIZ(new Object() { // from class: X.2tv
    });

    public static int LJFF() {
        new Object() { // from class: X.2tr
        }.getClass();
        FFL.LJIIIZ().getClass();
        return FFL.LJIIJ(31744, 0, "tt_im_display_suggested_stickers_in_chat_page_display_count", true);
    }

    @Override // X.InterfaceC72972th
    public final InterfaceC59692Vx LIZ() {
        LJLJI.setValue(C73102tu.LIZ);
        return null;
    }

    @Override // X.InterfaceC72972th
    public final C76800UCe LIZLLL() {
        LJLJI.setValue(C73092tt.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC72972th
    public final int LJ() {
        return EnumC72992tj.CONVERSATION_PROPERTY_TYPES_SUGGESTED_STICKERS.getValue();
    }

    @Override // X.InterfaceC72972th
    public final Object LIZJ() {
        boolean z;
        InterfaceC73052tp LIZ = C73042to.LIZ();
        if (LIZ instanceof C59712Vz) {
            LJLJI.setValue(new C59702Vy(((C59712Vz) LIZ).LIZ));
            z = false;
        } else if (o.LJ(LIZ, C73082ts.LIZ)) {
            z = true;
        } else {
            throw new C162476Zf();
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return LJLILLLLZI;
    }

    public static void LJI(TiktokV1ImInboxDataGetResponse tiktokV1ImInboxDataGetResponse) {
        Object obj;
        SuggestedStickersResponseBody suggestedStickersResponseBody;
        XLM xlm = LJLJI;
        if (tiktokV1ImInboxDataGetResponse != null && (suggestedStickersResponseBody = tiktokV1ImInboxDataGetResponse.suggestedStickers) != null) {
            if (suggestedStickersResponseBody.expiry == null || suggestedStickersResponseBody.stickers == null) {
                obj = C73092tt.LIZ;
            } else {
                XKX.LIZLLL(LJLIL, null, null, new C73032tn(suggestedStickersResponseBody, null), 3);
                obj = new C59702Vy(suggestedStickersResponseBody.stickers);
            }
        } else {
            obj = C73092tt.LIZ;
        }
        xlm.setValue(obj);
    }

    @Override // X.InterfaceC72972th
    public final Object LIZIZ(TiktokV1ImInboxDataGetResponse tiktokV1ImInboxDataGetResponse, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        LJI(tiktokV1ImInboxDataGetResponse);
        return C76800UCe.LIZ;
    }
}
