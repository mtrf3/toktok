package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class N7P extends N7Q {
    public static Bitmap LJII(N7R n7r) {
        if (C78685UuP.LJJJZ(n7r.getShortcutIconPath())) {
            return BitmapFactory.decodeFile(n7r.getShortcutIconPath());
        }
        String shortcutIconData = n7r.getShortcutIconData();
        if (C78685UuP.LJJJZ(shortcutIconData)) {
            try {
                byte[] decode = Base64.decode((String) ListProtector.get(s.LJLJJL(shortcutIconData, new String[]{","}, 0, 6), 1), 0);
                o.LJIIIIZZ(decode, "decode(imageBase64.split(\",\")[1], Base64.DEFAULT)");
                return BitmapFactory.decodeByteArray(decode, 0, decode.length);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Object LIZ;
        N7R n7r = (N7R) xBaseParamModel;
        o.LJIIIZ(type, "type");
        IShortcutService LJIIJ = TiktokShortcutManager.LJIIJ();
        if (LJIIJ.LJII() && Build.VERSION.SDK_INT >= 26) {
            try {
                Bitmap LJII = LJII(n7r);
                if (LJII == null) {
                    C31626Cb8.LIZ(c37356ElM, 0, "iconBitmap is null", 4);
                } else {
                    String shortcutLabel = n7r.getShortcutLabel();
                    String shortcutId = n7r.getShortcutId();
                    Icon createWithBitmap = Icon.createWithBitmap(LJII);
                    o.LJIIIIZZ(createWithBitmap, "createWithBitmap(iconBitmap)");
                    LJIIJ.LJI(new N2A(shortcutLabel, shortcutId, createWithBitmap, n7r.getRouteUrls(), 0, n7r.getShortcutNeedLogin(), null, n7r.getShortcutRouteAction()));
                    c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(N7S.class, null), "");
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl == null) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            C31626Cb8.LIZ(c37356ElM, 0, C03090Af.LIZJ(LIZ2, "throw an exception, exception info is ", m10exceptionOrNullimpl, LIZ2), 4);
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "shortcut is not supported", 4);
    }
}
