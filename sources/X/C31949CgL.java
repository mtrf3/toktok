package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import defpackage.b1;
import java.util.Locale;

/* renamed from: X.CgL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31949CgL {
    public static volatile C31949CgL LIZ;

    public static C31949CgL LIZ() {
        if (LIZ == null) {
            synchronized (C31949CgL.class) {
                if (LIZ == null) {
                    LIZ = new C31949CgL();
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ(O5Z o5z) {
        Context context = o5z.getContext();
        String LIZJ = C31947CgJ.LIZJ(context, o5z);
        if (LIZJ == null) {
            LIZJ = "";
        }
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (context != null) {
            locale = context.getResources().getConfiguration().locale;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (!TextUtils.isEmpty(LIZJ) && iHostAppContext != null) {
            StringBuilder LIZJ2 = b1.LIZJ(LIZJ, " ");
            LIZJ2.append(iHostAppContext.appName());
            LIZJ2.append("_");
            LIZJ2.append(iHostAppContext.getVersionCode());
            LIZJ2.append(" AppVersion/");
            LIZJ2.append(iHostAppContext.getVersionCode());
            LIZJ2.append(" JsSdk/2.0 NetType/");
            LIZJ2.append(C16880lQ.LLJILJILJ(iHostAppContext.context()).toUpperCase());
            LIZJ2.append(" Channel/");
            LIZJ2.append(iHostAppContext.getChannel());
            LIZJ2.append(" ByteLocale/");
            LIZJ2.append(locale.toString());
            LIZJ2.append(" Webcast_ByteLocale/");
            LIZJ2.append(C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale()));
            LIZJ2.append(" Region/");
            LIZJ2.append(C04520Fs.LIZJ());
            LIZJ2.append(" App/");
            LIZJ2.append(iHostAppContext.appName());
            LIZJ2.append(" WebcastSDK/");
            LIZJ2.append(C30443Bx9.LIZ());
            LIZJ = X1D.LIZIZ(LIZJ2);
        }
        if (!TextUtils.isEmpty(LIZJ)) {
            C16880lQ.LLZL(o5z.getSettings(), LIZJ);
        }
    }
}
