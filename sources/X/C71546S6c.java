package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardV2Fragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import kotlin.jvm.internal.o;

/* renamed from: X.S6c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71546S6c extends C0CJ {
    public final /* synthetic */ BillboardV2Fragment LJLIL;
    public final /* synthetic */ C71544S6a LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0CJ
    public final void LIZJ(int i) {
        boolean z;
        boolean z2;
        Boolean valueOf;
        String str;
        RootData rootData = this.LJLIL.vl().getState().LJLILLLLZI;
        this.LJLILLLLZI.getClass();
        if (i == 0) {
            z = true;
            valueOf = null;
        } else {
            z = false;
            Boolean bool = ((S6F) this.LJLIL.wl().getState()).LJLILLLLZI;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = true;
            }
            valueOf = Boolean.valueOf(!z2);
        }
        String roomId = rootData.roomId;
        String authorId = rootData.authorId;
        boolean z3 = rootData.isNewUser;
        String L = rootData.L();
        int i2 = rootData.templateEntryType;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        java.util.Map LIZ = S5F.LIZ(roomId, authorId, Integer.valueOf(i2), L, "notice_board_template", z3);
        if (z) {
            str = "templates";
        } else {
            str = "uploads";
        }
        LIZ.put("list_name", str);
        if (valueOf != null) {
            if (valueOf.booleanValue()) {
                LIZ.put("has_photo", 1);
            } else {
                LIZ.put("has_photo", 0);
            }
        }
        b.LJJIJIIJI("livesdk_tiktokec_enter_list", LIZ);
    }

    public C71546S6c(BillboardV2Fragment billboardV2Fragment, C71544S6a c71544S6a) {
        this.LJLIL = billboardV2Fragment;
        this.LJLILLLLZI = c71544S6a;
    }
}
