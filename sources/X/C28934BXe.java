package X;

import Y.AfS57S0100000_5;
import com.bytedance.android.livesdk.chatroom.api.StickerDonationRetrofitApi;
import defpackage.i0;

/* renamed from: X.BXe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28934BXe extends BY9<InterfaceC28935BXf> {
    public final C73318Sq2 LJLIL = new C73318Sq2();

    @Override // X.BY9
    public final void detachView() {
        super.detachView();
        this.LJLIL.dispose();
        this.LJLIL.LIZLLL();
    }

    public final void LJJJJ(java.util.Map<String, String> map) {
        String LJFF = i0.LJFF("https://api.tiktokv.com", "/tiktok/v1/donation/ngo/list/");
        if (C28949BXt.LIZ()) {
            map.put("organization_type", "PERCENT");
        } else {
            map.put("organization_type", "TILTIFY");
        }
        this.LJLIL.LIZ(C1EW.LIZ(((StickerDonationRetrofitApi) Q7L.LIZIZ(StickerDonationRetrofitApi.class)).fetchStickerDonation(LJFF, map)).LJJJLIIL(new AfS57S0100000_5(this, 63), new AfS57S0100000_5(this, 64)));
    }
}
