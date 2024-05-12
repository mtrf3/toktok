package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ob9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62203Ob9 {
    public final Activity LIZ;
    public AvatarPresenter LIZIZ;
    public C62206ObC LIZJ;

    public AbstractC62203Ob9(Activity activity) {
        this.LIZ = activity;
    }

    public final boolean LIZ(int i, int i2, Intent intent, boolean z, boolean z2) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        C86184Xs4 headUploadHelper;
        switch (i) {
            case 10002:
                if (intent == null) {
                    C31626Cb8.LIZ(((C62202Ob8) this).LIZLLL, 0, "Unrecognized request code", 4);
                    return false;
                }
                if (intent.getBooleanExtra("retake", false)) {
                    AvatarPresenter avatarPresenter = this.LIZIZ;
                    if (avatarPresenter != null && (headUploadHelper = avatarPresenter.getHeadUploadHelper()) != null) {
                        headUploadHelper.LJIIL(0);
                    }
                    return true;
                }
                android.net.Uri data = intent.getData();
                if (data != null) {
                    str = data.getPath();
                } else {
                    str = null;
                }
                if (z2) {
                    Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                    if (LLJJIJI != null) {
                        obj3 = C16880lQ.LLJJIII(LLJJIJI, "path");
                    } else {
                        obj3 = null;
                    }
                    o.LJII(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                    UrlModel urlModel = (UrlModel) obj3;
                    List<String> urlList = urlModel.getUrlList();
                    o.LJIIIIZZ(urlList, "avatarData.urlList");
                    String str2 = (String) ORZ.LJLLLL(urlList);
                    String uri = urlModel.getUri();
                    CompletionBlock<InterfaceC62204ObA> completionBlock = ((C62202Ob8) this).LIZLLL;
                    XBaseModel LIZJ = ED5.LIZJ(InterfaceC62204ObA.class, null);
                    InterfaceC62204ObA interfaceC62204ObA = (InterfaceC62204ObA) LIZJ;
                    interfaceC62204ObA.setUri(uri);
                    interfaceC62204ObA.setUrl(str2);
                    interfaceC62204ObA.setTempFilePath(str);
                    completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
                    return true;
                }
                Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
                if (LLJJIJI2 != null) {
                    obj = C16880lQ.LLJJIII(LLJJIJI2, "url");
                } else {
                    obj = null;
                }
                String valueOf = String.valueOf(obj);
                Bundle LLJJIJI3 = C16880lQ.LLJJIJI(intent);
                if (LLJJIJI3 != null) {
                    obj2 = C16880lQ.LLJJIII(LLJJIJI3, "uri");
                } else {
                    obj2 = null;
                }
                String valueOf2 = String.valueOf(obj2);
                CompletionBlock<InterfaceC62204ObA> completionBlock2 = ((C62202Ob8) this).LIZLLL;
                XBaseModel LIZJ2 = ED5.LIZJ(InterfaceC62204ObA.class, null);
                InterfaceC62204ObA interfaceC62204ObA2 = (InterfaceC62204ObA) LIZJ2;
                interfaceC62204ObA2.setUri(valueOf2);
                interfaceC62204ObA2.setUrl(valueOf);
                interfaceC62204ObA2.setTempFilePath(str);
                completionBlock2.onSuccess((XBaseResultModel) LIZJ2, "");
                return true;
            case 10003:
            case 10004:
                if (intent == null) {
                    intent = new Intent();
                }
                Bundle LJI = C255199zv.LJI(((RBX) HG3.LJIILL()).getCurUser(), "click_save", "photo", "video");
                LJI.putBoolean("extra_need_update_avatar", z2);
                intent.putExtra("extras_info", LJI);
                if (!z) {
                    Activity activity = this.LIZ;
                    if (activity instanceof CrossPlatformActivity) {
                        o.LJII(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
                        ((CrossPlatformActivity) activity).LJLIL.LJIILJJIL(this.LIZJ);
                    }
                }
                AvatarPresenter avatarPresenter2 = this.LIZIZ;
                if (avatarPresenter2 != null && avatarPresenter2.onActivityResult(i, i2, intent)) {
                    return true;
                }
                return false;
            default:
                C31626Cb8.LIZ(((C62202Ob8) this).LIZLLL, 0, "Unrecognized request code", 4);
                return false;
        }
    }
}
