package X;

import Y.IDxS306S0100000_5;
import android.content.Context;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* renamed from: X.BOx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28719BOx implements InterfaceC73463SsN<C28467BFf<CoverImageModel>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C28720BOy LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLILLLLZI.LIZLLL(th);
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "error_code", "1");
        C05630Jz.LJI(jSONObject, "error_msg", th.toString());
        C0K2.LJIIIIZZ("ttlive_upload_cover_all", 1, jSONObject);
        C0K2.LJIIIIZZ("ttlive_upload_cover_error", 1, jSONObject);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI.LJFF.LIZ(interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(C28467BFf<CoverImageModel> c28467BFf) {
        CoverImageModel coverImageModel = c28467BFf.data;
        coverImageModel.LIZ = this.LJLIL;
        C28720BOy c28720BOy = this.LJLILLLLZI;
        c28720BOy.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_upload_cover_success");
        LIZ.LJJIFFI(c28720BOy.LIZJ());
        LIZ.LJJIIJZLJL();
        c28720BOy.LIZLLL.LIZ();
        Context context = c28720BOy.LIZJ;
        C30868C9o.LJFF(context, context.getString(R.string.swa));
        C1EW.LIZ(C28718BOw.LIZ().LIZ().updateRoomInfo(c28720BOy.LIZ, coverImageModel.uri)).LIZ(new IDxS306S0100000_5(c28720BOy, 5));
        C0K2.LJIIIIZZ("ttlive_upload_cover_all", 0, null);
    }

    public C28719BOx(C28720BOy c28720BOy, String str) {
        this.LJLILLLLZI = c28720BOy;
        this.LJLIL = str;
    }
}
