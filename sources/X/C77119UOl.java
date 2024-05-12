package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UOl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77119UOl implements InterfaceC174346so {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static boolean LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    public static final String LJIIJ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 10 ? i != 16 ? i != 17 ? "other" : "armies_fall_back" : "open_message_sei_fallback" : "open_message" : "cohost_start_battleinfo" : "room_enter_expired" : "room_enter_battleinfo" : "room_enter";
    }

    public static final String LJ() {
        return (String) C60394Nn4.LIZJ.invoke();
    }

    public static void LJIJI() {
        if (!"main".equals(C16880lQ.LLLLIIIILLL().getName())) {
            return;
        }
        RunnableC39751Fit LIZJ2 = RunnableC39751Fit.LIZJ();
        if (LIZJ2.LJLIL != null) {
            synchronized (RunnableC39751Fit.LJLLI) {
                MessageQueue messageQueue = LIZJ2.LJLJLJ;
                if (messageQueue != null) {
                    synchronized (messageQueue) {
                        Iterator it = ((ArrayList) LIZJ2.LJLJI).iterator();
                        while (it.hasNext()) {
                            Message message = (Message) it.next();
                            if (message.obj != null && message.arg2 == 9527) {
                                Message obtain = Message.obtain(message);
                                obtain.arg2 = 9528;
                                message.what = -message.what;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Handle pending message ");
                                LIZ2.append(obtain.what);
                                X1D.LIZIZ(LIZ2);
                                C39749Fir.LIZ();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("Success handle delay message ");
                                LIZ3.append(obtain.what);
                                LIZ3.append("!");
                                X1D.LIZIZ(LIZ3);
                                C39749Fir.LIZ();
                                ((Handler) EWB.LIZJ()).dispatchMessage(obtain);
                            }
                        }
                    }
                    ((ArrayList) LIZJ2.LJLJI).clear();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException("Must call start(Application context) first!!!");
    }

    public static final int LIZIZ(float f) {
        return O6R.LJJIIZ((float) Math.ceil(f));
    }

    public static void LIZJ(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static final void LJI(List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it.next();
            HashMap<String, String> metaData = TEVideoUtils.getMetaData(videoSegment.originPath);
            if (metaData == null || (str = metaData.get("LvMetaInfo")) == null) {
                str = "";
            }
            videoSegment.mDescription = str;
        }
    }

    public static Activity LJIIIZ(Context context) {
        while (context instanceof ContextWrapper) {
            try {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } catch (Exception e) {
                C77117UOj.LJIIZILJ(e);
                return null;
            }
        }
        return null;
    }

    public static String LJIIJJI(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                char[] cArr = LIZ;
                stringBuffer.append(cArr[(b & 240) >> 4]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static int LJIILIIL(Context context) {
        DisplayMetrics displayMetrics;
        Display defaultDisplay;
        int i = LIZLLL;
        if (i != 0) {
            return i;
        }
        if (context == null) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            LIZJ = point.x;
            LIZLLL = point.y;
        }
        if ((LIZJ == 0 || LIZLLL == 0) && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
            LIZJ = displayMetrics.widthPixels;
            LIZLLL = displayMetrics.heightPixels;
        }
        return LIZLLL;
    }

    public static int LJIILJJIL(Context context) {
        DisplayMetrics displayMetrics;
        Display defaultDisplay;
        int i = LIZJ;
        if (i != 0) {
            return i;
        }
        if (context == null) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            LIZJ = point.x;
            LIZLLL = point.y;
        }
        if ((LIZJ == 0 || LIZLLL == 0) && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
            LIZJ = displayMetrics.widthPixels;
            LIZLLL = displayMetrics.heightPixels;
        }
        return LIZJ;
    }

    public static boolean LJIILLIIL(String str) {
        if (str == null || !PatternProtector.compile("(https?|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str).find()) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LJIILJJIL == null) {
            c54293LSn.LJIILJJIL = new C36821Ecj<>("share_url_short_white_list", new HashSet());
        }
        java.util.Set<String> LIZ2 = c54293LSn.LJIILJJIL.LIZ();
        if (LIZ2.isEmpty()) {
            IDeepLinkService LIZ3 = DeepLinkServiceImpl.LIZ();
            if (!C37208Eiy.LIZ.contains(parse.getHost()) && !LIZ3.LJIJ(parse) && !LIZ3.LJIILIIL(parse.getHost(), parse.getPath())) {
                return false;
            }
            return true;
        }
        return LIZ2.contains(parse.getHost());
    }

    public static void LIZLLL(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(KMP.LJ("at index ", i2));
            }
        }
    }

    public static final void LJFF(C26227ARb c26227ARb, View view) {
        o.LJIIIZ(view, "view");
        c26227ARb.LJIIJJI = new C238249Wq(view);
    }

    public static final CV6 LJIIIIZZ(Rank rank, boolean z) {
        User user = rank.user;
        if (user != null) {
            return new CV6(user, rank.score, rank.rank, rank.gapDescription, rank.userRestrictionLevel, z);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static Object LJIIL(Context context, Class cls) {
        Context LLLLL;
        if (context == null || (LLLLL = C16880lQ.LLLLL(context)) == null || !cls.isInterface() || !InterfaceC68532Qv2.class.equals(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C58250Mta.LIZ;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null && (obj instanceof EKP)) {
            return obj;
        }
        EKP ekp = new EKP(LLLLL);
        concurrentHashMap.put(cls, ekp);
        return ekp;
    }

    public static final int LJIIZILJ(long j, List list) {
        if (list == null || !list.contains(Long.valueOf(j))) {
            return 0;
        }
        return 1;
    }

    public static C73390SrC LJIJ(AbstractC73672Svk abstractC73672Svk, String str) {
        o.LJIIIZ(abstractC73672Svk, "<this>");
        return AbstractC73672Svk.LJIIJ(new C25573A1x(abstractC73672Svk, str, null));
    }

    public static void LJJIIZ(RectF rectF, float f) {
        float width = rectF.width();
        float height = rectF.height();
        float f2 = ((f * width) - width) / 2.0f;
        float f3 = ((f * height) - height) / 2.0f;
        rectF.left -= f2;
        rectF.top -= f3;
        rectF.right += f2;
        rectF.bottom += f3;
    }

    public static final OSZ LJJIJ(Object obj, Object obj2) {
        return new OSZ(obj, obj2);
    }

    public static final void LIZ(Appendable appendable, Object obj, InterfaceC88472Yns interfaceC88472Yns) {
        if (interfaceC88472Yns != null) {
            ((StringBuilder) appendable).append((CharSequence) interfaceC88472Yns.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            ((StringBuilder) appendable).append((CharSequence) obj);
        } else if (obj instanceof Character) {
            ((StringBuilder) appendable).append(((Character) obj).charValue());
        } else {
            ((StringBuilder) appendable).append((CharSequence) String.valueOf(obj));
        }
    }

    public static final void LJIL(C76786UBq c76786UBq, C76758UAo c76758UAo, int i) {
        o.LJIIIZ(c76786UBq, "<this>");
        C76786UBq.LIZJ(c76786UBq, c76758UAo.LJLJI.toString(), EnumC76760UAq.ROOM.toString(), c76758UAo.LJLIL, i);
    }

    public static final void LJJ(C76786UBq c76786UBq, UAS record, int i) {
        EnumC76760UAq enumC76760UAq;
        o.LJIIIZ(c76786UBq, "<this>");
        o.LJIIIZ(record, "record");
        String u94 = record.LJIIIZ.toString();
        if (record.LJII) {
            enumC76760UAq = EnumC76760UAq.LINKED;
        } else {
            enumC76760UAq = EnumC76760UAq.LINKING;
        }
        C76786UBq.LIZJ(c76786UBq, u94, enumC76760UAq.toString(), record.LIZIZ(), i);
    }

    public static boolean LJIILL(float f, float f2, RectF rectF, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return rectF.contains(f, f2);
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d = -f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        float f4 = f - centerX;
        float f5 = f2 - centerY;
        return rectF.contains(((f4 * cos) + centerX) - (f5 * sin), (f4 * sin) + (f5 * cos) + centerY);
    }

    public static PointF LJJIII(PointF pointF, float f, float f2, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return pointF;
        }
        double d = f3;
        float cos = (float) (((Math.cos(d) * (pointF.x - f)) - (Math.sin(d) * (pointF.y - f2))) + f);
        float cos2 = (float) ((Math.cos(d) * (pointF.y - f2)) + (Math.sin(d) * (pointF.x - f)) + f2);
        pointF.set(cos, cos2);
        return new PointF(cos, cos2);
    }

    public static void LJJIIJ(Point point, float f, float f2, float f3) {
        double d = f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        int i = point.x;
        float LIZIZ2 = C06420Na.LIZIZ(i, f, cos, f);
        int i2 = point.y;
        point.set((int) (LIZIZ2 - ((i2 - f2) * sin)), (int) C06420Na.LIZIZ(i, f, sin, C06420Na.LIZIZ(i2, f2, cos, f2)));
    }

    public static void LJJIIJZLJL(float f, float f2, RectF rectF, float f3) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d = f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        float f4 = centerX - f;
        float f5 = centerY - f2;
        rectF.offset((((f4 * cos) + f) - (f5 * sin)) - centerX, ((f4 * sin) + ((f5 * cos) + f2)) - centerY);
    }

    public static final AutoCutThemeData LJII(CutsameDataItem cutsameDataItem, C63A source, int i, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        Music music;
        String str;
        MusicModel convertToMusicModel;
        String localThumbPath;
        String str2;
        MusicModel convertToMusicModel2;
        UrlModel coverMedium;
        List<String> urlList;
        MusicBuzModel musicBuzModel;
        String str3;
        MusicModel convertToMusicModel3;
        MusicModel convertToMusicModel4;
        o.LJIIIZ(cutsameDataItem, "<this>");
        o.LJIIIZ(source, "source");
        String str4 = null;
        String str5 = "";
        if (cutsameDataItem.LJII() == EnumC43998HOo.CUT_SAME) {
            str = cutsameDataItem.iconUrl;
            if (str == null) {
                str = "";
            }
            str2 = cutsameDataItem.title;
        } else if (cutsameDataItem.LJII() != EnumC43998HOo.DESIGNER_FIXED_TEMPLATE && cutsameDataItem.LJII() != EnumC43998HOo.ALGORITHM_TEMPLATE && cutsameDataItem.LJII() != EnumC43998HOo.AUTOCUT_TEMPLATE) {
            str = "";
            str2 = "";
        } else {
            Music music2 = cutsameDataItem.music;
            if ((music2 == null || (coverMedium = music2.getCoverMedium()) == null || (urlList = coverMedium.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null) && ((music = cutsameDataItem.music) == null || (convertToMusicModel = music.convertToMusicModel()) == null || (localThumbPath = convertToMusicModel.getLocalThumbPath()) == null || (str = new File(localThumbPath).toURI().toURL().toString()) == null)) {
                str = "";
            }
            Music music3 = cutsameDataItem.music;
            if (music3 == null || (convertToMusicModel2 = music3.convertToMusicModel()) == null || (str2 = convertToMusicModel2.getName()) == null) {
                str2 = "";
            }
        }
        Music music4 = cutsameDataItem.music;
        if (music4 != null && (convertToMusicModel4 = music4.convertToMusicModel()) != null) {
            if (interfaceC88472Yns != null) {
                musicBuzModel = (MusicBuzModel) interfaceC88472Yns.invoke(convertToMusicModel4);
            } else {
                musicBuzModel = null;
            }
        } else {
            musicBuzModel = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<String> arrayList = cutsameDataItem.ursList;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(it.next());
            }
        }
        int ordinal = source.ordinal();
        String str6 = cutsameDataItem.templateId;
        if (str6 == null) {
            str6 = "";
        }
        int value = cutsameDataItem.LJII().getValue();
        AuthorInfo authorInfo = cutsameDataItem.author;
        if (authorInfo != null) {
            str3 = authorInfo.nickname;
        } else {
            str3 = null;
        }
        String str7 = cutsameDataItem.templateUrl;
        if (str7 != null) {
            str5 = str7;
        }
        String str8 = cutsameDataItem.templateData;
        Music music5 = cutsameDataItem.music;
        if (music5 != null && (convertToMusicModel3 = music5.convertToMusicModel()) != null) {
            str4 = convertToMusicModel3.getMusicId();
        }
        return new AutoCutThemeData(ordinal, i, str6, value, str3, str5, str8, str4, str, str2, musicBuzModel, z, cutsameDataItem.templateGroupId, linkedHashSet);
    }

    public static final void LJJII(C76786UBq c76786UBq, UAS uas, JSONObject jSONObject, long j, long j2) {
        EnumC76760UAq enumC76760UAq;
        o.LJIIIZ(c76786UBq, "<this>");
        String u94 = uas.LJIIIZ.toString();
        if (uas.LJII) {
            enumC76760UAq = EnumC76760UAq.LINKED;
        } else {
            enumC76760UAq = EnumC76760UAq.LINKING;
        }
        C76786UBq.LJFF(c76786UBq, u94, enumC76760UAq.toString(), uas.LJIIJ, uas.LIZIZ(), jSONObject, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (0 != 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJJIIZI(int r6, java.lang.Object r7, X.InterfaceC13460fu r8, X.C13640gC r9, int r10) {
        /*
            java.lang.String r0 = "typeface"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "font"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "requestedWeight"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L14
            return r7
        L14:
            r2 = 0
            r3 = 1
            if (r6 != r3) goto L48
        L18:
            X.0gC r0 = r8.LIZ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r9)
            if (r0 != 0) goto L4f
            X.0gC r1 = X.C13640gC.LJLJJI
            int r0 = r9.compareTo(r1)
            if (r0 < 0) goto L4f
            X.0gC r0 = r8.LIZ()
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L4f
            r5 = 1
        L35:
            if (r6 != r3) goto L41
        L37:
            int r0 = r8.LIZJ()
            if (r10 != r0) goto L51
        L3d:
            r4 = 0
            if (r5 != 0) goto L52
            return r7
        L41:
            r1 = 0
            r0 = 3
            if (r1 != 0) goto L37
            if (r6 != r0) goto L3d
            goto L37
        L48:
            r1 = 0
            r0 = 2
            if (r1 != 0) goto L18
            if (r6 != r0) goto L4f
            goto L18
        L4f:
            r5 = 0
            goto L35
        L51:
            r4 = 1
        L52:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L74
            if (r4 == 0) goto L6b
            if (r10 != r3) goto L6b
            if (r5 == 0) goto L72
            r2 = 3
        L5f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r7, r2)
        L65:
            java.lang.String r0 = "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L6b:
            r0 = 0
            if (r5 == 0) goto L70
            r2 = 1
            goto L5f
        L70:
            if (r0 == 0) goto L5f
        L72:
            r2 = 2
            goto L5f
        L74:
            if (r5 == 0) goto L8b
            int r1 = r9.LJLIL
        L78:
            if (r4 == 0) goto L84
            if (r10 != r3) goto L7d
        L7c:
            r2 = 1
        L7d:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r1 = X.C13430fr.LIZ(r7, r1, r2)
            goto L65
        L84:
            int r0 = r8.LIZJ()
            if (r0 != r3) goto L7d
            goto L7c
        L8b:
            X.0gC r0 = r8.LIZ()
            int r1 = r0.LJLIL
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77119UOl.LJJIIZI(int, java.lang.Object, X.0fu, X.0gC, int):java.lang.Object");
    }

    public static final void LJIJJ(C76786UBq c76786UBq, C76758UAo c76758UAo, JSONObject recordExtra, String str, JSONObject jSONObject, long j, long j2) {
        o.LJIIIZ(c76786UBq, "<this>");
        o.LJIIIZ(recordExtra, "recordExtra");
        String u94 = c76758UAo.LJLJI.toString();
        EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
        c76786UBq.LIZIZ(j, j2, u94, enumC76760UAq.toString(), c76758UAo.LJLIL, str, jSONObject);
        c76786UBq.LJII(c76758UAo.LJLJI.toString(), enumC76760UAq.toString(), c76758UAo.LJLIL, recordExtra);
    }

    public static final void LJIJJLI(C76786UBq c76786UBq, UAS uas, JSONObject jSONObject, String str, JSONObject jSONObject2, long j, long j2) {
        EnumC76760UAq enumC76760UAq;
        EnumC76760UAq enumC76760UAq2;
        o.LJIIIZ(c76786UBq, "<this>");
        String u94 = uas.LJIIIZ.toString();
        if (uas.LJII) {
            enumC76760UAq = EnumC76760UAq.LINKED;
        } else {
            enumC76760UAq = EnumC76760UAq.LINKING;
        }
        c76786UBq.LIZIZ(j, j2, u94, enumC76760UAq.toString(), uas.LIZIZ(), str, jSONObject2);
        String u942 = uas.LJIIIZ.toString();
        if (uas.LJII) {
            enumC76760UAq2 = EnumC76760UAq.LINKED;
        } else {
            enumC76760UAq2 = EnumC76760UAq.LINKING;
        }
        c76786UBq.LJII(u942, enumC76760UAq2.toString(), uas.LIZIZ(), jSONObject);
    }

    public static final void LJJI(C76786UBq c76786UBq, C76758UAo c76758UAo, JSONObject recordExtra, String str, JSONObject jSONObject, long j, long j2) {
        o.LJIIIZ(c76786UBq, "<this>");
        o.LJIIIZ(recordExtra, "recordExtra");
        String u94 = c76758UAo.LJLJI.toString();
        EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
        c76786UBq.LJ(j, j2, u94, enumC76760UAq.toString(), c76758UAo.LJLIL, str, jSONObject);
        c76786UBq.LJII(c76758UAo.LJLJI.toString(), enumC76760UAq.toString(), c76758UAo.LJLIL, recordExtra);
    }

    public static final void LJJIFFI(C76786UBq c76786UBq, UAS uas, JSONObject recordExtra, String str, JSONObject jSONObject, long j, long j2) {
        EnumC76760UAq enumC76760UAq;
        EnumC76760UAq enumC76760UAq2;
        o.LJIIIZ(c76786UBq, "<this>");
        o.LJIIIZ(recordExtra, "recordExtra");
        String u94 = uas.LJIIIZ.toString();
        if (uas.LJII) {
            enumC76760UAq = EnumC76760UAq.LINKED;
        } else {
            enumC76760UAq = EnumC76760UAq.LINKING;
        }
        c76786UBq.LJ(j, j2, u94, enumC76760UAq.toString(), uas.LIZIZ(), str, jSONObject);
        String u942 = uas.LJIIIZ.toString();
        if (uas.LJII) {
            enumC76760UAq2 = EnumC76760UAq.LINKED;
        } else {
            enumC76760UAq2 = EnumC76760UAq.LINKING;
        }
        c76786UBq.LJII(u942, enumC76760UAq2.toString(), uas.LIZIZ(), recordExtra);
    }
}
