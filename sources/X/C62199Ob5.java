package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import kotlin.jvm.internal.o;

/* renamed from: X.Ob5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62199Ob5 extends AbstractC62201Ob7 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC62200Ob6 interfaceC62200Ob6 = (InterfaceC62200Ob6) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        boolean z = false;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "Context not provided in host", 4);
            return;
        }
        Activity LIZ = C37925EuX.LIZ(context);
        if (LIZ == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "Context not provided in host", 4);
            return;
        }
        String sourceType = interfaceC62200Ob6.getSourceType();
        if (sourceType == null) {
            sourceType = "";
        }
        Boolean isUpdateUserAvatar = interfaceC62200Ob6.isUpdateUserAvatar();
        if (isUpdateUserAvatar != null) {
            z = isUpdateUserAvatar.booleanValue();
        }
        C62202Ob8 c62202Ob8 = new C62202Ob8(LIZ, c37356ElM);
        if (LIZ instanceof SparkActivity) {
            SparkContext sparkContext = ((SparkActivity) LIZ).LJLIL;
            if (sparkContext != null) {
                sparkContext.LJII(InterfaceC60176NjY.class, new C62205ObB(c62202Ob8, z));
            }
        } else if (LIZ instanceof CrossPlatformActivity) {
            c62202Ob8.LIZJ = new C62206ObC(c62202Ob8, z);
            ((CrossPlatformActivity) LIZ).LJLIL.LJFF(c62202Ob8.LIZJ);
        } else {
            C31626Cb8.LIZ(c37356ElM, -1, "This container is not supported", 4);
            return;
        }
        AvatarPresenter avatarPresenter = new AvatarPresenter();
        c62202Ob8.LIZIZ = avatarPresenter;
        avatarPresenter.initHeadUploadHelper(LIZ, null);
        AvatarPresenter avatarPresenter2 = c62202Ob8.LIZIZ;
        if (avatarPresenter2 == null) {
            return;
        }
        avatarPresenter2.onClickAvatarImageByJsb(sourceType);
    }
}
