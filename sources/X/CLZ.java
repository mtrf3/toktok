package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CLZ extends AbstractC31176CLk {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        InterfaceC31166CLa interfaceC31166CLa = (InterfaceC31166CLa) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String uid = interfaceC31166CLa.getUid();
        if (TextUtils.isEmpty(uid)) {
            AbstractC31179CLn.LJII(this, c37356ElM, type);
            return;
        }
        String title = interfaceC31166CLa.getTitle();
        String desc = interfaceC31166CLa.getDesc();
        String url = interfaceC31166CLa.getUrl();
        String innerUrl = interfaceC31166CLa.getInnerUrl();
        String thirdPartyDesc = interfaceC31166CLa.getThirdPartyDesc();
        String coverUrl = interfaceC31166CLa.getCoverUrl();
        C29929Bor c29929Bor = new C29929Bor();
        c29929Bor.LJIIJ = url;
        c29929Bor.LJIIJJI = title;
        c29929Bor.LJIIL = desc;
        c29929Bor.LIZLLL = CastLongProtector.parseLong(uid);
        c29929Bor.LJJJ = innerUrl;
        c29929Bor.LIZIZ("third_party_desc", thirdPartyDesc);
        c29929Bor.LIZIZ("thumb_url", coverUrl);
        BNI un0 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        c29929Bor.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
        C29930Bos c29930Bos = new C29930Bos(c29929Bor);
        C31174CLi c31174CLi = new C31174CLi(this, c37356ElM, type);
        C29338BfK c29338BfK = (C29338BfK) un0;
        c29338BfK.getClass();
        c29930Bos.LIZIZ();
        c29338BfK.LIZ.shareSubInvitation(activity, c29930Bos, c31174CLi);
    }
}
