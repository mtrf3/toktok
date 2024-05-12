package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85353Wp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(final int i, final String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update user info: remainRetry=");
        LIZ2.append(i);
        LIZ2.append(", uid=");
        LIZ2.append(str);
        C34B.LJI("InboxDMAvatarLoadHelper", X1D.LIZIZ(LIZ2));
        if (str != null && str.length() > 0 && 1 != 0) {
            C80533Eb.LJIIJJI(str, null, true, new C3EU() { // from class: X.3Ty
                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    boolean z;
                    o.LJIIIZ(result, "result");
                    C2U8.LIZ(new C3LP(result.getUid()));
                    if (((Number) C84673Tz.LIZ.getValue()).intValue() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("get user info success: limit enable, remainRetry=");
                        LIZ3.append(i);
                        LIZ3.append(", uid=");
                        C48690J9a.LJIIL(LIZ3, str, LIZ3, "InboxDMAvatarLoadHelper");
                        C89553fL.LIZ.add(result.getUid());
                        return;
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("get user info success: remainRetry=");
                    LIZ4.append(i);
                    LIZ4.append(", uid=");
                    C48690J9a.LJIIL(LIZ4, str, LIZ4, "InboxDMAvatarLoadHelper");
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                    int i2 = i;
                    if (i2 > 0) {
                        C85353Wp.LIZJ(i2 - 1, str);
                    }
                }
            });
        }
    }

    public static void LIZ(SmartAvatarImageView smartAvatarImageView, int i, UrlModel urlModel, String uid) {
        o.LJIIIZ(uid, "uid");
        boolean z = true;
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("user has no avatar, uid=");
            LIZ2.append(uid);
            C34B.LJI("InboxDMAvatarLoadHelper", X1D.LIZIZ(LIZ2));
            W5F LJ = W5U.LJ(R.raw.icon_color_default_avatar);
            LJ.LJJIIJ = smartAvatarImageView;
            LJ.LIZLLL(new C85363Wq(uid, 1, true));
            return;
        }
        ImageUrlModel LJ2 = C78939UyV.LJ(urlModel);
        List<String> list = LJ2.mUrls;
        if (list == null || list.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("urls is empty, uid=");
            LIZ3.append(uid);
            C34B.LJI("InboxDMAvatarLoadHelper", X1D.LIZIZ(LIZ3));
        } else {
            Object obj = ListProtector.get(LJ2.mUrls, 0);
            o.LJIIIIZZ(obj, "urls[0]");
            z = C89553fL.LJFF((String) obj, uid, true);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("is image expired: ");
        LIZ4.append(z);
        LIZ4.append(", uid=");
        LIZ4.append(uid);
        C34B.LJI("InboxDMAvatarLoadHelper", X1D.LIZIZ(LIZ4));
        if (!z) {
            LIZIZ(i, 3, smartAvatarImageView, LJ2, uid);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C111444Yy(urlModel, uid, LJ2, smartAvatarImageView, i, null), 3);
        }
    }

    public static void LIZIZ(int i, int i2, InterfaceC85013Vh interfaceC85013Vh, ImageUrlModel imageUrlModel, String str) {
        W5F LJII = W5U.LJII(imageUrlModel);
        LJII.LJJIIJ = interfaceC85013Vh;
        LJII.LJIILL = R.raw.icon_color_default_avatar;
        LJII.LJII = i;
        LJII.LJIIIIZZ = i;
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        LJII.LIZLLL(new C85363Wq(str, i2, false));
    }
}
