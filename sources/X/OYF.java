package X;

import Y.IDeS155S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OYF {
    public static android.net.Uri LJFF(String str) {
        return LJ(EF7.LIZIZ(), str);
    }

    public static final String LJI(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            return (String) ORZ.LJLLLL(urlList);
        }
        return null;
    }

    public static final String LIZ(Bundle bundle, String str) {
        if (bundle == null) {
            return str;
        }
        EZQ ezq = new EZQ(str);
        java.util.Set<String> keySet = bundle.keySet();
        o.LJIIIIZZ(keySet, "keySet");
        for (String str2 : keySet) {
            ezq.LIZJ(str2, bundle.getString(str2));
        }
        return ezq.LIZLLL();
    }

    public static final android.net.Uri LJ(Context context, String str) {
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(context, "context");
        android.net.Uri pathToUri = O18.LIZ(context, new File(str));
        o.LJIIIIZZ(pathToUri, "pathToUri");
        return pathToUri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    public static final String LIZJ(InterfaceC62225ObV channel, String str, String itemType) {
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(itemType, "itemType");
        o.LJIIIZ(channel, "channel");
        String channel2 = channel.key();
        o.LJIIIZ(channel2, "channel");
        if (AV1.LJIIJJI() || str.length() == 0) {
            return str;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = str;
        c68322mC2.element = C78866UxK.LJIIJJI(itemType, str, channel2);
        XKX.LJ(MBB.INSTANCE, new C66752jf(c68322mC, itemType, channel2, c68322mC2, true, null));
        Object obj = c68322mC.element;
        if (!C78857UxB.LJJJIL((String) obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        return (String) c68322mC2.element;
    }

    public static final AbstractC73635Sv9 LIZLLL(InterfaceC62225ObV channel, String str, String itemType) {
        AbstractC73635Sv9<String> LJJLIIIJLLLLLLLZ;
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(itemType, "itemType");
        o.LJIIIZ(channel, "channel");
        String channel2 = channel.key();
        o.LJIIIZ(channel2, "channel");
        if (AV1.LJIIJJI() || str.length() == 0) {
            return AbstractC73635Sv9.LJ(new OYG(str));
        }
        String LJIIJJI = C78866UxK.LJIIJJI(itemType, str, channel2);
        if (TextUtils.isEmpty(LJIIJJI)) {
            LJJLIIIJLLLLLLLZ = null;
        } else {
            LJJLIIIJLLLLLLLZ = C4LD.LIZIZ.LJJLIIIJLLLLLLLZ(itemType, channel2, LJIIJJI);
        }
        o.LJIIIIZZ(LJJLIIIJLLLLLLLZ, "getShortShareUrlObservab…emType, channel, longUrl)");
        return LJJLIIIJLLLLLLLZ;
    }

    public static final void LJII(Context context, TokenCert tokenCert, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Activity LJIIIIZZ;
        String[] strArr;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tokenCert, "tokenCert");
        if (context instanceof Activity) {
            LJIIIIZZ = (Activity) context;
        } else {
            LJIIIIZZ = C84763XOl.LJIIIIZZ();
        }
        if (LJIIIIZZ == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            C61099NyR.LIZIZ.LIZIZ(LJIIIIZZ, tokenCert).LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new IDeS155S0200000_7(LJIIIIZZ, interfaceC65784Pro, 1));
        }
    }
}
