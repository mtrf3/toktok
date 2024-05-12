package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.RegexMatcherOptimizer;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.screenshot.ScreenShotShareMobParam;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.setting.model.ShareConfig;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Uwu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78840Uwu implements InterfaceC48038ItG, InterfaceC59418NTq {
    public static volatile ClassLoader LJLIL;
    public static volatile Thread LJLILLLLZI;
    public static long LJLJI;
    public static C4VR LJLJJI;
    public static final char[] LJLJJL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C78840Uwu LJLJJLL = new C78840Uwu();

    @Override // X.InterfaceC59418NTq
    public void LIZ() {
    }

    public static long LJIILL() {
        if (LJLJI == 0) {
            LJLJI = System.currentTimeMillis();
        }
        return LJLJI;
    }

    public static final boolean LJIL() {
        if (C00F.LIZ(31744, 0, "dm_differentiate_social_avatar_reverse", true) == 1) {
            return false;
        }
        return true;
    }

    public static synchronized ClassLoader LJJJI() {
        ClassLoader classLoader;
        synchronized (C78840Uwu.class) {
            if (LJLIL == null) {
                LJLIL = LJJJIL();
            }
            classLoader = LJLIL;
        }
        return classLoader;
    }

    public static synchronized ClassLoader LJJJIL() {
        synchronized (C78840Uwu.class) {
            ClassLoader classLoader = null;
            if (LJLILLLLZI == null) {
                LJLILLLLZI = LJJJJ();
                if (LJLILLLLZI == null) {
                    return null;
                }
            }
            synchronized (LJLILLLLZI) {
                try {
                    classLoader = LJLILLLLZI.getContextClassLoader();
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Failed to get thread context classloader ".concat(valueOf);
                    }
                }
            }
            return classLoader;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = new X.C39008FSq(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r3.setContextClassLoader(null);
        r3.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r1.length() != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        "Failed to enumerate thread/threadgroup ".concat(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.Thread LJJJJ() {
        /*
            java.lang.Class<X.Uwu> r10 = X.C78840Uwu.class
            monitor-enter(r10)
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()     // Catch: java.lang.Throwable -> L88
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L88
            java.lang.ThreadGroup r9 = r0.getThreadGroup()     // Catch: java.lang.Throwable -> L88
            r7 = 0
            if (r9 != 0) goto L14
            monitor-exit(r10)
            return r7
        L14:
            java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L88
            int r4 = r9.activeGroupCount()     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            java.lang.ThreadGroup[] r3 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            r9.enumerate(r3)     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            r6 = 0
            r2 = 0
        L22:
            if (r2 >= r4) goto L25
            goto L2d
        L25:
            java.lang.ThreadGroup r5 = new java.lang.ThreadGroup     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            java.lang.String r0 = "dynamiteLoader"
            r5.<init>(r9, r0)     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            goto L3b
        L2d:
            r5 = r3[r2]     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            java.lang.String r1 = "dynamiteLoader"
            java.lang.String r0 = r5.getName()     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            boolean r0 = r1.equals(r0)     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            if (r0 == 0) goto L45
        L3b:
            int r4 = r5.activeCount()     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            java.lang.Thread[] r2 = new java.lang.Thread[r4]     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            r5.enumerate(r2)     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            goto L48
        L45:
            int r2 = r2 + 1
            goto L22
        L48:
            if (r6 >= r4) goto L5c
            r3 = r2[r6]     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            java.lang.String r1 = "GmsDynamite"
            java.lang.String r0 = r3.getName()     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            boolean r0 = r1.equals(r0)     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L85
            if (r0 == 0) goto L59
            goto L82
        L59:
            int r6 = r6 + 1
            goto L48
        L5c:
            X.FSq r3 = new X.FSq     // Catch: java.lang.SecurityException -> L6a java.lang.Throwable -> L85
            r3.<init>(r5)     // Catch: java.lang.SecurityException -> L6a java.lang.Throwable -> L85
            r3.setContextClassLoader(r7)     // Catch: java.lang.SecurityException -> L68 java.lang.Throwable -> L85
            r3.start()     // Catch: java.lang.SecurityException -> L68 java.lang.Throwable -> L85
            goto L82
        L68:
            r0 = move-exception
            goto L6f
        L6a:
            r0 = move-exception
            r3 = r7
            goto L6f
        L6d:
            r0 = move-exception
            r3 = r7
        L6f:
            java.lang.String r2 = "Failed to enumerate thread/threadgroup "
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L85
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L82
            r2.concat(r1)     // Catch: java.lang.Throwable -> L85
        L82:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r10)
            return r3
        L85:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78840Uwu.LJJJJ():java.lang.Thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC45601Hv3 LJ(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context instanceof InterfaceC45601Hv3) {
            return (InterfaceC45601Hv3) context;
        }
        if (context instanceof MutableContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof InterfaceC45601Hv3) {
                Object baseContext = contextWrapper.getBaseContext();
                o.LJII(baseContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
                return (InterfaceC45601Hv3) baseContext;
            }
            return null;
        }
        return null;
    }

    public static final void LJFF(C29702BlC c29702BlC) {
        if (!TextUtils.isEmpty("LiveBroadcastBusinessLog")) {
            c29702BlC.LJFF = "LiveBroadcastBusinessLog";
        }
    }

    public static final InterfaceC07790Sh LJII(InterfaceC07790Sh interfaceC07790Sh) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        return C78847Ux1.LJJIIZI(interfaceC07790Sh, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 61439);
    }

    public static final void LJIIIIZZ(C29702BlC c29702BlC) {
        for (Map.Entry<String, String> entry : C28787BRn.LIZ("").LJIILJJIL().entrySet()) {
            if (C29306Beo.LJIJJLI(entry.getKey()) && C29306Beo.LJIJJLI(entry.getValue())) {
                c29702BlC.LIZIZ.put(entry.getKey(), entry.getValue());
            }
        }
        Float valueOf = Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
        if (valueOf == null || Float.isNaN(valueOf.floatValue()) || Float.isInfinite(valueOf.floatValue())) {
            c29702BlC.LIZIZ.put("device_score", Float.valueOf(0.0f));
            c29702BlC.LIZJ.put("device_score", Float.valueOf(0.0f));
        } else {
            c29702BlC.LIZIZ.put("device_score", valueOf);
            c29702BlC.LIZJ.put("device_score", valueOf);
        }
    }

    public static final StringBuilder LJIIJ(JSONObject jSONObject) {
        String str;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                str = JSONObjectProtectorUtils.getString(jSONObject, next);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str = null;
            }
            arrayList.add(new Pair(next, str));
        }
        sb.append(C48189Ivh.LIZJ(arrayList));
        return sb;
    }

    public static final AbstractC42651GoZ LJIIL(View view) {
        o.LJIIIZ(view, "<this>");
        WM7 LJI = C78598Ut0.LJI(view);
        if (LJI != null) {
            return C86793Y4n.LJIJ(LJI);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final int LJIILJJIL(Activity activity) {
        if (activity == null) {
            return 0;
        }
        WindowManager windowManager = activity.getWindowManager();
        o.LJFF(windowManager, "activity.windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        o.LJFF(defaultDisplay, "activity.windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        UC7.LIZLLL("rotation current ", rotation);
        int i = 2;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        return 0;
                    }
                }
            }
            i = 1;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("key", "orientation");
            QN2.LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            C61349O5x.LIZIZ(e);
        }
        return i;
    }

    public static final String LJIIZILJ(Activity activity) {
        if (activity == null) {
            return null;
        }
        Resources resources = activity.getResources();
        o.LJFF(resources, "activity.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('*');
        LIZ.append(i2);
        return X1D.LIZIZ(LIZ);
    }

    public static final Video LJIJJ(InterfaceC82548WaW interfaceC82548WaW) {
        List<String> urlList;
        o.LJIIIZ(interfaceC82548WaW, "<this>");
        Video video = new Video();
        VideoUrlModel LJ = interfaceC82548WaW.LJ();
        if (LJ != null && (urlList = LJ.getUrlList()) != null && !urlList.isEmpty()) {
            List<String> urlList2 = LJ.getUrlList();
            if (C43118Gw6.LIZ()) {
                int size = urlList2.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) ListProtector.get(urlList2, i);
                    if (str != null && str.length() != 0) {
                        try {
                            android.net.Uri parse = UriProtector.parse(str);
                            if (TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "device_type"))) {
                                StringBuilder sb = new StringBuilder(str);
                                if (TextUtils.isEmpty(parse.getQuery())) {
                                    sb.append("?");
                                } else {
                                    sb.append("&");
                                }
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("device_type=");
                                LIZ.append(Build.MODEL);
                                sb.append(X1D.LIZIZ(LIZ));
                                ListProtector.set(urlList2, i, sb.toString());
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        video.setPlayAddr(LJ);
        video.setSourceId(interfaceC82548WaW.LIZIZ());
        return video;
    }

    public static final int LJIJJLI(SearchSugEntity searchSugEntity) {
        if (searchSugEntity.LIZ()) {
            return 1;
        }
        if (searchSugEntity.LIZ == 5) {
            return 5;
        }
        if (LJJIFFI(searchSugEntity)) {
            return 2;
        }
        if (searchSugEntity.LIZ == 3) {
            return 3;
        }
        return 0;
    }

    public static boolean LJJ(String str) {
        try {
            RegexMatcherOptimizer.fix(EF7.LIZIZ());
            Matcher matcher = C118824lS.LIZJ.matcher(str);
            if (matcher.find()) {
                if (str.indexOf(matcher.group()) == 0) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean LJJI(SearchResultParam searchResultParam) {
        if (searchResultParam != null && searchResultParam.getSearchEnterParam() != null && KB1.LJII(KB1.LIZ(searchResultParam.getSearchEnterParam()))) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIFFI(SearchSugEntity searchSugEntity) {
        SugExtraInfo sugExtraInfo;
        if (searchSugEntity == null || (sugExtraInfo = searchSugEntity.sugExtraInfo) == null || !sugExtraInfo.isRichSug()) {
            return false;
        }
        return true;
    }

    public static boolean LJJII(char c) {
        return PatternProtector.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c)).matches();
    }

    public static boolean LJJIII(Aweme aweme) {
        if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 33 || aweme.getAwemeType() == 1 || aweme.getAwemeType() == 12 || aweme.getAwemeType() == 30 || aweme.getAwemeType() == 31 || aweme.getAwemeType() == 34 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 61 || aweme.getAwemeType() == 56 || aweme.getAwemeType() == 55) {
            return true;
        }
        return false;
    }

    public static final C5H3 LJJIIJ(InterfaceC65784Pro interfaceC65784Pro) {
        return C221108m2.LIZ(EnumC221088m0.NONE, interfaceC65784Pro);
    }

    public static String LJJIIJZLJL(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return LJJJ(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final android.net.Uri LJJIIZ(android.net.Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
        for (String str : queryParameterNames) {
            if (!o.LJ(str, "enter_from")) {
                buildUpon.appendQueryParameter(str, UriProtector.getQueryParameter(uri, str));
            } else {
                buildUpon.appendQueryParameter("enter_from", "homepage_hot");
            }
        }
        android.net.Uri replaceUriParameter = buildUpon.build();
        o.LJIIIIZZ(replaceUriParameter, "replaceUriParameter");
        return replaceUriParameter;
    }

    public static final C29321Dc LJJIJ(InterfaceC03740Cs interfaceC03740Cs) {
        o.LJIIIZ(interfaceC03740Cs, "<this>");
        AbstractC538029g abstractC538029g = interfaceC03740Cs.LJIIIIZZ().LJLJJLL;
        o.LJI(abstractC538029g);
        return abstractC538029g.LJLJL;
    }

    public static final C0DR LJJIJIIJI(InterfaceC03740Cs interfaceC03740Cs) {
        o.LJIIIZ(interfaceC03740Cs, "<this>");
        C0DR c0dr = LJJIJ(interfaceC03740Cs).LJLJLJ;
        o.LJI(c0dr);
        return c0dr;
    }

    public static final AbstractC42651GoZ LJJIJIIJIL(View view) {
        o.LJIIIZ(view, "<this>");
        WM7 LJI = C78598Ut0.LJI(view);
        if (LJI != null) {
            AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(LJI);
            if (LJIJ != null) {
                return LJIJ;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static String LJJJ(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= bArr.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (byte b : bArr) {
                    int i3 = b & 255;
                    int i4 = i2 + 1;
                    char[] cArr2 = LJLJJL;
                    cArr[i2] = cArr2[i3 >> 4];
                    i2 = i4 + 1;
                    cArr[i4] = cArr2[i3 & 15];
                }
                return new String(cArr, 0, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        boolean z;
        o.LJIIIZ(it, "it");
        if (it == EnumC74492TLk.PRE_SHOW) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final void LIZIZ(C25710zf c25710zf, C1M3 c1m3) {
        C25710zf<C29321Dc> LJJ = LJJIJ(c1m3).LJJ();
        int i = LJJ.LJLJI;
        if (i > 0) {
            int i2 = i - 1;
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                c25710zf.LIZLLL(c29321DcArr[i2].LLI.LJ);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static final StringBuilder LIZLLL(String url, JSONObject jSONObject) {
        String str;
        o.LJIIJ(url, "url");
        StringBuilder sb = new StringBuilder(url);
        if (s.LJJLIIIJJIZ(url, '?', 0, false, 6) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                str = JSONObjectProtectorUtils.getString(jSONObject, next);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str = null;
            }
            arrayList.add(new Pair(next, str));
        }
        sb.append(C48189Ivh.LIZJ(arrayList));
        return sb;
    }

    public static final InterfaceC07790Sh LJI(InterfaceC07790Sh interfaceC07790Sh, InterfaceC11790dD shape) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(shape, "shape");
        return C78847Ux1.LJJIIZI(interfaceC07790Sh, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, shape, true, 59391);
    }

    public static final CharSequence LJIILIIL(SearchSugEntity entity, Context context) {
        boolean z;
        SpannableString spannableString;
        o.LJIIIZ(entity, "entity");
        if (C52197Ke9.LIZ() || C52195Ke7.LIZ() || C52199KeB.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            String str2 = entity.content;
            List<Position> list = entity.hignLightPositions;
            if (str2 != null) {
                str = str2;
            }
            if (TextUtils.isEmpty(str) || list == null) {
                return new SpannableString(str);
            }
            SpannableString spannableString2 = new SpannableString(str);
            ArrayList arrayList = new ArrayList();
            if (C52199KeB.LIZ()) {
                int i = 0;
                for (Position position : list) {
                    if (position.getBegin() > i) {
                        arrayList.add(new Position(i, position.getBegin() - 1));
                    }
                    i = position.getEnd() + 1;
                }
                if (i < str.length()) {
                    arrayList.add(new Position(i, str.length() - 1));
                }
            } else {
                arrayList.addAll(list);
            }
            boolean z2 = !C52195Ke7.LIZ();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Position position2 = (Position) it.next();
                if (position2 != null) {
                    if (z2) {
                        C72G.LIZ(spannableString2, position2.getBegin(), position2.getEnd() + 1);
                    }
                    int begin = position2.getBegin();
                    int end = position2.getEnd() + 1;
                    int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
                    int max = Math.max(0, begin);
                    if (!TextUtils.isEmpty(spannableString2) && max <= end && max < spannableString2.length() && end <= spannableString2.length()) {
                        spannableString2.setSpan(new ForegroundColorSpan(LJIIIIZZ), max, end, 17);
                    }
                }
            }
            return spannableString2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str3 = entity.content;
        if (str3 != null) {
            str = str3;
        }
        List<Position> list2 = entity.hignLightPositions;
        if (list2 == null) {
            list2 = new ArrayList();
        }
        if (TextUtils.isEmpty(str) || C79004UzY.LJJIFFI(list2)) {
            spannableString = new SpannableString(str);
        } else {
            spannableString = new SpannableString(str);
            for (Position position3 : list2) {
                if (position3 != null) {
                    C72G.LIZ(spannableString, position3.getBegin(), position3.getEnd() + 1);
                }
            }
        }
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence LJIILLIIL(com.ss.android.ugc.aweme.search.model.SearchSugEntity r6, android.view.View r7) {
        /*
            java.lang.String r0 = "entity"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            com.ss.android.ugc.aweme.search.model.SugExtraInfo r0 = r6.sugExtraInfo
            boolean r0 = r0.isVerifiedUser()
            r2 = 33
            r1 = 1
            if (r0 == 0) goto L35
            java.lang.String r0 = " T"
            r3.append(r0)
            X.SJU r5 = new X.SJU
            android.content.Context r4 = r7.getContext()
            r0 = 2131232532(0x7f080714, float:1.8081176E38)
            r5.<init>(r0, r4)
            int r0 = r3.length()
            int r0 = r0 + (-2)
            int r4 = r0 + 1
            int r0 = r3.length()
            r3.setSpan(r5, r4, r0, r2)
        L35:
            android.content.Context r4 = r7.getContext()
            com.ss.android.ugc.aweme.search.model.SugExtraInfo r0 = r6.sugExtraInfo
            if (r0 == 0) goto Lf0
            java.lang.String r6 = r0.getUserRelationType()
        L41:
            if (r4 != 0) goto La3
        L43:
            java.lang.String r6 = ""
        L45:
            int r0 = r6.length()
            if (r0 <= 0) goto La2
            java.lang.String r0 = " · "
            r3.append(r0)
            r3.append(r6)
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            java.lang.String r4 = "itemView.context"
            r0 = 2130968764(0x7f0400bc, float:1.754619E38)
            int r0 = X.C1EU.LIZ(r7, r4, r0)
            r5.<init>(r0)
            int r0 = r3.length()
            int r4 = r0 + (-3)
            int r0 = r6.length()
            int r4 = r4 - r0
            int r0 = r3.length()
            r3.setSpan(r5, r4, r0, r2)
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r1)
            int r4 = r3.length()
            int r0 = r6.length()
            int r4 = r4 - r0
            int r2 = r3.length()
            r0 = 17
            r3.setSpan(r5, r4, r2, r0)
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJJIII(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.<init>(r0)
            r0 = 18
            r3.setSpan(r1, r4, r2, r0)
        La2:
            return r3
        La3:
            if (r6 == 0) goto L43
            int r5 = r6.hashCode()
            r0 = -600094315(0xffffffffdc3b4995, float:-2.108669E17)
            if (r5 == r0) goto Lda
            r0 = 301801488(0x11fd2010, float:3.9936122E-28)
            if (r5 == r0) goto Lc2
            r0 = 765915793(0x2da6f291, float:1.8979736E-11)
            if (r5 == r0) goto Lb9
            goto L43
        Lb9:
            java.lang.String r0 = "following"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lcc
            goto L43
        Lc2:
            java.lang.String r0 = "followed"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lcc
            goto L43
        Lcc:
            r0 = 2131830541(0x7f11270d, float:1.9294082E38)
            java.lang.String r6 = r4.getString(r0)
            java.lang.String r0 = "context.getString(R.string.followed)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            goto L45
        Lda:
            java.lang.String r0 = "friends"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L43
            r0 = 2131828290(0x7f111e42, float:1.9289517E38)
            java.lang.String r6 = r4.getString(r0)
            java.lang.String r0 = "context.getString(R.string.double_follow)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            goto L45
        Lf0:
            r6 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78840Uwu.LJIILLIIL(com.ss.android.ugc.aweme.search.model.SearchSugEntity, android.view.View):java.lang.CharSequence");
    }

    public static final ScreenShotShareMobParam LJIJ(Aweme aweme, String enterFrom) {
        String str;
        Integer num;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (aweme.getAwemeType() == 150) {
            str = "aweme_photo";
        } else {
            str = "aweme";
        }
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        EnumC62617Ohp enumC62617Ohp = (EnumC62617Ohp) ((java.util.Map) ShareConfig.LIZ.getValue()).get(str);
        if (enumC62617Ohp != null) {
            num = Integer.valueOf(enumC62617Ohp.getNum());
        } else {
            num = null;
        }
        return new ScreenShotShareMobParam(enterFrom, aid, String.valueOf(num));
    }

    public static final AbstractC538029g LJJIIZI(InterfaceC03740Cs requireCoordinator, int i) {
        o.LJIIIZ(requireCoordinator, "$this$requireCoordinator");
        AbstractC538029g abstractC538029g = requireCoordinator.LJIIIIZZ().LJLJJLL;
        o.LJI(abstractC538029g);
        if (abstractC538029g.LLD() != requireCoordinator || !C17J.LJJI(i)) {
            return abstractC538029g;
        }
        AbstractC538029g abstractC538029g2 = abstractC538029g.LJLJLJ;
        o.LJI(abstractC538029g2);
        return abstractC538029g2;
    }

    public static final void LJJIJL(C57128MbU c57128MbU, int i) {
        V92 hierarchy;
        if (c57128MbU.getAvatarImageView() != null && (hierarchy = c57128MbU.getAvatarImageView().getHierarchy()) != null) {
            hierarchy.LJIJI(i, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        }
    }

    public static final CharSequence LJJIJLIJ(int i, String str) {
        o.LJIIIZ(str, "<this>");
        if (i <= 0) {
            return "";
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        o.LJIIIIZZ(characterInstance, "getCharacterInstance()");
        characterInstance.setText(str);
        int next = characterInstance.next(i);
        if (next != -1) {
            String substring = str.substring(0, next);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final void LIZJ(StringBuilder sb, String str, String str2) {
        if (str2 == null) {
            return;
        }
        try {
            sb.append("&");
            sb.append(str);
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            if (C61349O5x.LIZ < 3) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static final boolean LJIIIZ(int i, int i2, View view) {
        o.LJIIIZ(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (i < i3 || i > i3 + width || i2 < i4 || i2 > i4 + height) {
            return false;
        }
        return true;
    }

    public static SY9 LJIJI(int i, int i2, Context context) {
        C2068389v c2068389v = new C2068389v();
        if (C202677xP.LIZIZ()) {
            c2068389v.LIZ = R.raw.icon_color_share_shadow_alt_2;
        } else {
            c2068389v.LIZ = R.raw.icon_color_share_shadow;
        }
        c2068389v.LIZIZ = i;
        c2068389v.LIZJ = i2;
        return c2068389v.LIZ(context);
    }

    public static final void LJJIJIL(C57128MbU c57128MbU, double d, double d2) {
        if (c57128MbU.getLiveTagView() != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C17N.LJIILL(d), C17N.LJIILL(d2));
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            c57128MbU.getLiveTagView().setLayoutParams(layoutParams);
        }
    }

    public static final void LJJIL(C235119Kp c235119Kp, String title, Activity activity) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(activity, "activity");
        LJJIZ(c235119Kp, title, new AqS163S0100000_13(activity, 391));
    }

    public static final void LJJIZ(C235119Kp c235119Kp, String title, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(title, "title");
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LJII = C1DD.LIZLLL(R.string.aub, "getApplicationContext().…lityLabels_settings_back)");
        LIZJ.LIZIZ(new AqS160S0100000_10(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 458));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL.LIZJ = title;
        c235119Kp.LIZJ = LIZLLL;
        c235119Kp.LIZLLL = true;
    }

    public static final long LJIIJJI(int i, int i2, boolean z, boolean z2) {
        if (i2 == 0) {
            return C17N.LIZLLL(i, i);
        }
        if (i == 0) {
            if (z) {
                return C17N.LIZLLL(1, 0);
            }
            return C17N.LIZLLL(0, 1);
        }
        if (i == i2) {
            if (z) {
                return C17N.LIZLLL(i2 - 1, i2);
            }
            return C17N.LIZLLL(i2, i2 - 1);
        }
        if (z) {
            if (!z2) {
                return C17N.LIZLLL(i - 1, i);
            }
            return C17N.LIZLLL(i + 1, i);
        }
        if (!z2) {
            return C17N.LIZLLL(i, i + 1);
        }
        return C17N.LIZLLL(i, i - 1);
    }
}
