package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oec, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62418Oec {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static List LIZ(Activity activity) {
        ?? LLILLL;
        Object obj;
        o.LJIIIZ(activity, "activity");
        if (!AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableSaveUploadVideo()) {
            return C61878OQg.INSTANCE;
        }
        List LJJIJIL = C47261Igj.LJJIJIL(EnumC62419Oed.WHATSAPP, EnumC62419Oed.FACEBOOK, EnumC62419Oed.SMS, EnumC62419Oed.MESSENGER, EnumC62419Oed.VK, EnumC62419Oed.LINE, EnumC62419Oed.KAKAOTALK, EnumC62419Oed.ZALO, EnumC62419Oed.LEMON8, EnumC62419Oed.TELEGRAM, EnumC62419Oed.VIBER);
        try {
            List<ShareChannelSettings> silentShareList = C2YJ.LIZIZ.LIZ.getSilentShareList();
            LLILLL = new ArrayList();
            for (ShareChannelSettings shareChannelSettings : silentShareList) {
                Iterator it = LJJIJIL.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (o.LJ(((EnumC62419Oed) obj).getKey(), shareChannelSettings.getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    LLILLL.add(obj);
                }
            }
        } catch (C158056If unused) {
            LLILLL = ORZ.LLILLL(LJJIJIL, 5);
        }
        List LLJILJILJ = ORZ.LLJILJILJ(LLILLL);
        Iterator it2 = ((ArrayList) LLJILJILJ).iterator();
        while (it2.hasNext()) {
            EnumC62419Oed enumC62419Oed = (EnumC62419Oed) it2.next();
            C62281OcP c62281OcP = OYR.LIZ;
            String key = enumC62419Oed.getKey();
            c62281OcP.getClass();
            InterfaceC62225ObV LIZ = C62281OcP.LIZ(activity, key);
            if (LIZ == null || !LIZ.LIZLLL(activity)) {
                it2.remove();
            }
        }
        return LLJILJILJ;
    }
}
