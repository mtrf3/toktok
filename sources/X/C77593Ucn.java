package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.android.live.wallet.IWalletService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ucn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77593Ucn implements InterfaceC38012Evw {
    public final Context LJLIL;
    public final C38049EwX LJLILLLLZI;
    public C38048EwW LJLJI;
    public JSONObject LJLJJI;
    public final C77592Ucm LJLJJL;

    public C77593Ucn(Context context, C38049EwX jsBridge) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(jsBridge, "jsBridge");
        this.LJLIL = context;
        this.LJLILLLLZI = jsBridge;
        this.LJLJJL = new C77592Ucm(this);
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW msg, JSONObject res) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(res, "res");
        this.LJLJI = msg;
        this.LJLJJI = res;
        msg.LJIIJ = false;
        int optInt = msg.LIZLLL.optInt("type");
        int optInt2 = msg.LIZLLL.optInt("photoSide");
        String trackEvents = msg.LIZLLL.opt("trackerDictionary").toString();
        Context context = this.LJLIL;
        InterfaceC77701UeX kYCService = ((IWalletService) CN1.LIZ(IWalletService.class)).getKYCService();
        C77592Ucm kycPhotosCallback = this.LJLJJL;
        kYCService.getClass();
        o.LJIIIZ(context, "context");
        o.LJIIIZ(trackEvents, "trackEvents");
        o.LJIIIZ(kycPhotosCallback, "kycPhotosCallback");
        C77678UeA.LIZIZ.LJIIZILJ(kycPhotosCallback);
        Intent intent = new Intent(context, (Class<?>) KYCCameraActivity.class);
        intent.putExtra("key_kyc_photo_type", optInt);
        intent.putExtra("key_kyc_photo_side", optInt2);
        intent.putExtra("key_kyc_track_events", trackEvents);
        C16880lQ.LIZJ(context, intent);
    }
}
