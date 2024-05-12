package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGiftPannelAvatarShowSwitchSetting;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Cbj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31663Cbj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ImageModel imageModel, InterfaceC31664Cbk interfaceC31664Cbk, File fileDir, Integer num, Integer num2, Boolean bool, Boolean bool2, String str) {
        List<String> urls;
        o.LJIIIZ(fileDir, "fileDir");
        if (imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty()) {
            new IllegalArgumentException();
            interfaceC31664Cbk.onFail();
            return;
        }
        String str2 = (String) ListProtector.get(imageModel.getUrls(), 0);
        String scheme = UriProtector.parse(str2).getScheme();
        String host = UriProtector.parse(str2).getHost();
        String path = UriProtector.parse(str2).getPath();
        if (path != null && ujb.o.LJJJLIIL(path, "//", false)) {
            path = path.substring(1);
            o.LJIIIIZZ(path, "this as java.lang.String).substring(startIndex)");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(scheme);
        LIZ2.append("://");
        LIZ2.append(host);
        LIZ2.append(path);
        String url = X1D.LIZIZ(LIZ2);
        o.LJIIIIZZ(url, "url");
        String substring = url.substring(s.LJJLIIIJLLLLLLLZ(url, '/', 0, 6) + 1);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        if (UserLevelGiftPannelAvatarShowSwitchSetting.INSTANCE.getValue()) {
            url = (String) ListProtector.get(imageModel.getUrls(), 0);
        }
        File file = new File(fileDir, i0.LJFF(substring, ".png"));
        if (file.exists()) {
            interfaceC31664Cbk.LIZIZ(BitmapUtils.decodeBitmap(file));
            Boolean bool3 = Boolean.TRUE;
            if (!o.LJ(bool2, bool3) || num2 == null || num2.intValue() != 8) {
                return;
            }
            C28274B7u.LIZIZ(bool3, bool, num, (String) ListProtector.get(imageModel.getUrls(), 0), str);
            return;
        }
        if (o.LJ(bool2, Boolean.TRUE) && num2 != null && num2.intValue() == 8) {
            C28274B7u.LIZIZ(Boolean.FALSE, bool, num, (String) ListProtector.get(imageModel.getUrls(), 0), str);
        }
        W5I.LIZ().LJFF(W5P.LIZLLL(UriProtector.parse(url)).LIZ(), null).LJ(new C31667Cbn(imageModel, interfaceC31664Cbk, fileDir, bool, num, str, substring), FT1.LIZ());
    }
}
