package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.gamora.editor.text.TextModeBackgroundSettings;
import defpackage.a1;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OI2 {
    public static final String LIZ;
    public static final List<TextModeBackgroundSettings.BackgroundItem> LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static String LIZLLL;
    public static Integer LJ;

    static {
        C62822Ol8 c62822Ol8 = TextModeBackgroundSettings.LIZIZ;
        String str = ((TextModeBackgroundSettings.TextModeBackgroundConfig) c62822Ol8.getValue()).channelName;
        if (str == null) {
            str = "";
        }
        LIZ = str;
        LIZIZ = ((TextModeBackgroundSettings.TextModeBackgroundConfig) c62822Ol8.getValue()).items;
        LIZJ = C221108m2.LIZIZ(OI5.LJLIL);
    }

    public static Keva LJIIIIZZ() {
        return (Keva) LIZJ.getValue();
    }

    public static boolean LJIIIZ() {
        String LIZJ2;
        List<TextModeBackgroundSettings.BackgroundItem> list;
        String str = LIZ;
        if (str.length() != 0 && (LIZJ2 = O3U.LIZJ(C38943FQd.LIZ(), str)) != null && LIZJ2.length() != 0 && (list = LIZIZ) != null && !list.isEmpty()) {
            for (TextModeBackgroundSettings.BackgroundItem backgroundItem : list) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZJ2);
                LIZ2.append(File.separator);
                LIZ2.append(backgroundItem.backgroundFileName);
                if (new File(X1D.LIZIZ(LIZ2)).exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZ() {
        String LIZJ2 = O3U.LIZJ(C38943FQd.LIZ(), LIZ);
        if (LIZJ2 != null && C1B6.LIZIZ(LIZJ2)) {
            return true;
        }
        return false;
    }

    public static void LIZJ() {
        C61520OCm LJII;
        String LIZ2 = C38943FQd.LIZ();
        String str = LIZ;
        if (!C78685UuP.LJJJZ(O3U.LIZJ(LIZ2, str)) && (LJII = O3U.LJII(LIZ2)) != null) {
            java.util.Map<String, List<CheckRequestBodyModel.TargetChannel>> LJJIIZI = C51029K0z.LJJIIZI(new OSZ(LIZ2, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(str))));
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            LJII.LIZ(null, LJJIIZI, optionCheckUpdateParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJ() {
        if (System.currentTimeMillis() - LJIIIIZZ().getLong("text_last_load_time", 0L) < 259200000) {
            return;
        }
        LJIIIIZZ().storeLong("text_last_load_time", System.currentTimeMillis());
        Forest LIZ2 = C39914FlW.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, 0 == true ? 1 : 0);
        requestParams.setChannel(((TextModeBackgroundSettings.TextModeBackgroundConfig) TextModeBackgroundSettings.LIZIZ.getValue()).channelName);
        requestParams.setBundle("main.png");
        LIZ2.fetchResourceAsync("", requestParams, OI4.LJLIL);
    }

    public static ImageUrlModel LIZIZ(C147665qs c147665qs) {
        String str = c147665qs.LIZLLL;
        if (str == null || str.length() == 0) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("file://");
        LIZ2.append(c147665qs.LIZLLL);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("file://");
        LIZ3.append(c147665qs.LIZLLL);
        return new ImageUrlModel(LIZIZ2, C47261Igj.LJJIJ(X1D.LIZIZ(LIZ3)));
    }

    public static String LJ(Context context, CreativeInfo creativeInfo) {
        o.LJIIIZ(context, "context");
        File LJIILL = C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILL(creativeInfo, EnumC43649HBd.PHOTO, "textmode_main.png", true);
        InputStream open = context.getResources().getAssets().open("textmode_main.png");
        o.LJIIIIZZ(open, "context.resources.assets…DE_BUILD_IN_IMPORT_IMAGE)");
        C78966Uyw.LJJJJZ(LJIILL);
        C38485F8n.LLLI(LJIILL, C62848OlY.LJFF(open));
        open.close();
        String absolutePath = LJIILL.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "genPublicPath.absolutePath");
        return absolutePath;
    }

    public static C147665qs LJFF(CreativeInfo creativeInfo, String str) {
        boolean z;
        String str2;
        int i;
        String str3;
        int i2;
        TextModeBackgroundSettings.BackgroundItem backgroundItem;
        TextModeBackgroundSettings.BackgroundItem backgroundItem2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = LJIIIIZZ().getString("background_name", null);
        }
        List<TextModeBackgroundSettings.BackgroundItem> list = LIZIZ;
        int LJI = LJI(str, list);
        String LIZJ2 = O3U.LIZJ(C38943FQd.LIZ(), LIZ);
        o.LJIIIIZZ(LIZJ2, "getChannelPath(geckoAccessKey, channelName)");
        if (list == null || (backgroundItem2 = (TextModeBackgroundSettings.BackgroundItem) ORZ.LJLLLLLL(LJI, list)) == null || (str2 = backgroundItem2.backgroundFileName) == null) {
            str2 = "";
        }
        C147665qs LIZLLL2 = LIZLLL(LJI, str2, LIZJ2);
        int i3 = LJI + 1;
        if (list != null) {
            i = list.size();
        } else {
            i = 1;
        }
        int i4 = i3 % i;
        while (true) {
            if (LIZLLL2 == null) {
                if (i4 != LJI) {
                    List<TextModeBackgroundSettings.BackgroundItem> list2 = LIZIZ;
                    if (list2 == null || (backgroundItem = (TextModeBackgroundSettings.BackgroundItem) ORZ.LJLLLLLL(i4, list2)) == null || (str3 = backgroundItem.backgroundFileName) == null) {
                        str3 = "";
                    }
                    LIZLLL2 = LIZLLL(i4, str3, LIZJ2);
                    int i5 = i4 + 1;
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 1;
                    }
                    i4 = i5 % i2;
                } else {
                    LIZLLL2 = new C147665qs("textmode_main.png", LJ(C5L7.LIZ(), creativeInfo), -1, null);
                    break;
                }
            } else {
                break;
            }
        }
        LJIIIIZZ().storeString("background_name", LIZLLL2.LIZ);
        return LIZLLL2;
    }

    public static int LJI(String str, List list) {
        if (str == null || str.length() == 0 || list == null) {
            return 0;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(((TextModeBackgroundSettings.BackgroundItem) it.next()).backgroundFileName, str)) {
                if (i <= -1) {
                    return 0;
                }
                return i;
            }
            i++;
        }
        return 0;
    }

    public static C147665qs LJII(CreativeInfo creativeInfo, String str) {
        int i;
        String str2;
        int i2;
        String str3;
        TextModeBackgroundSettings.BackgroundItem backgroundItem;
        TextModeBackgroundSettings.BackgroundItem backgroundItem2;
        List<TextModeBackgroundSettings.BackgroundItem> list = LIZIZ;
        int LJI = LJI(str, list);
        int i3 = LJI + 1;
        if (list != null) {
            i = list.size();
        } else {
            i = 1;
        }
        int i4 = i3 % i;
        String LIZJ2 = O3U.LIZJ(C38943FQd.LIZ(), LIZ);
        o.LJIIIIZZ(LIZJ2, "getChannelPath(geckoAccessKey, channelName)");
        if (list == null || (backgroundItem2 = (TextModeBackgroundSettings.BackgroundItem) ORZ.LJLLLLLL(i4, list)) == null || (str2 = backgroundItem2.backgroundFileName) == null) {
            str2 = "";
        }
        C147665qs LIZLLL2 = LIZLLL(i4, str2, LIZJ2);
        while (true) {
            if (LIZLLL2 == null) {
                if (i4 != LJI) {
                    int i5 = i4 + 1;
                    List<TextModeBackgroundSettings.BackgroundItem> list2 = LIZIZ;
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 1;
                    }
                    i4 = i5 % i2;
                    if (list2 == null || (backgroundItem = (TextModeBackgroundSettings.BackgroundItem) ORZ.LJLLLLLL(i4, list2)) == null || (str3 = backgroundItem.backgroundFileName) == null) {
                        str3 = "";
                    }
                    LIZLLL2 = LIZLLL(i4, str3, LIZJ2);
                } else {
                    LIZLLL2 = new C147665qs("textmode_main.png", LJ(C5L7.LIZ(), creativeInfo), -1, null);
                    break;
                }
            } else {
                break;
            }
        }
        LJIIIIZZ().storeString("background_name", LIZLLL2.LIZ);
        return LIZLLL2;
    }

    public static C147665qs LIZLLL(int i, String str, String str2) {
        int i2;
        List<TextModeBackgroundSettings.BackgroundItem> list;
        TextModeBackgroundSettings.BackgroundItem backgroundItem;
        List<TextModeBackgroundSettings.BackgroundItem> list2;
        TextModeBackgroundSettings.BackgroundItem backgroundItem2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2);
        String str3 = File.separator;
        File file = new File(JBR.LJFF(LIZ2, str3, str, LIZ2));
        if (!file.exists() || file.isDirectory()) {
            return null;
        }
        String LJ2 = a1.LJ(str2, str3, str);
        try {
            list2 = LIZIZ;
        } catch (IllegalArgumentException unused) {
        }
        if (list2 != null && (backgroundItem2 = (TextModeBackgroundSettings.BackgroundItem) ORZ.LJLLLLLL(i, list2)) != null) {
            i2 = Color.parseColor(backgroundItem2.textColor);
            StringBuilder LIZJ2 = C278817o.LIZJ(str2);
            LIZJ2.append(File.separator);
            list = LIZIZ;
            if (list != null || (backgroundItem = (TextModeBackgroundSettings.BackgroundItem) ORZ.LJLLLLLL(i, list)) == null || (r0 = backgroundItem.buttonIconName) == null) {
                String str4 = "";
            }
            LIZJ2.append(str4);
            return new C147665qs(str, LJ2, i2, LIZJ2.toString());
        }
        i2 = -1;
        StringBuilder LIZJ22 = C278817o.LIZJ(str2);
        LIZJ22.append(File.separator);
        list = LIZIZ;
        if (list != null) {
        }
        String str42 = "";
        LIZJ22.append(str42);
        return new C147665qs(str, LJ2, i2, LIZJ22.toString());
    }
}
