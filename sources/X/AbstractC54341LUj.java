package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.LUj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54341LUj<T> extends AbstractC54344LUm {
    public static final C54343LUl Companion = new C54343LUl();
    public Context context;
    public T customResult;
    public String enterFrom = "";
    public HashMap<String, Object> globalParams;
    public boolean isAsync;
    public boolean isFromNotification;
    public android.net.Uri originalUri;
    public android.net.Uri terminalPrefixUri;

    public abstract OSZ<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap, M5X m5x);

    public ArrayList<Integer> getFlags() {
        return null;
    }

    public final boolean isAsyncAction() {
        return false;
    }

    public final boolean needIntercept() {
        return false;
    }

    public final HashMap<String, Object> getGlobalParams() {
        HashMap<String, Object> hashMap = this.globalParams;
        if (hashMap != null) {
            return hashMap;
        }
        o.LJIJI("globalParams");
        throw null;
    }

    public final android.net.Uri getOriginalUri() {
        android.net.Uri uri = this.originalUri;
        if (uri != null) {
            return uri;
        }
        o.LJIJI("originalUri");
        throw null;
    }

    public final android.net.Uri getTerminalPrefixUri() {
        android.net.Uri uri = this.terminalPrefixUri;
        if (uri != null) {
            return uri;
        }
        o.LJIJI("terminalPrefixUri");
        throw null;
    }

    public String getTargetPageName() {
        return C38758FJa.LIZ(getTerminalPrefixUri());
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final T getResult() {
        return this.customResult;
    }

    public final boolean isAsync() {
        return this.isAsync;
    }

    public final boolean isFromNotification() {
        return this.isFromNotification;
    }

    private final void parseParams(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey("is_from_notification")) {
            Object obj = hashMap.get("is_from_notification");
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
            this.isFromNotification = ((Boolean) obj).booleanValue();
        }
        if (hashMap.containsKey("enter_from")) {
            Object obj2 = hashMap.get("enter_from");
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
            this.enterFrom = (String) obj2;
        }
        if (hashMap.containsKey("is_async_render_fact")) {
            Object obj3 = hashMap.get("is_async_render_fact");
            o.LJII(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            this.isAsync = ((Boolean) obj3).booleanValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preRunBlock(X.InterfaceC67352kd<? super T> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C54342LUk
            if (r0 == 0) goto L35
            r5 = r7
            X.LUk r5 = (X.C54342LUk) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L3b
            X.C141335gf.LIZJ(r1)
        L21:
            return r3
        L22:
            X.C141335gf.LIZJ(r1)
            X.XIC r1 = X.C78613UtF.LIZ
            X.LPw r0 = new X.LPw
            r0.<init>(r6, r3)
            r5.LJLJI = r2
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r5)
            if (r0 != r4) goto L21
            return r4
        L35:
            X.LUk r5 = new X.LUk
            r5.<init>(r6, r7)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54341LUj.preRunBlock(X.2kd):java.lang.Object");
    }

    public final void setAsync(boolean z) {
        this.isAsync = z;
    }

    public final void setEnterFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterFrom = str;
    }

    public final void setFromNotification(boolean z) {
        this.isFromNotification = z;
    }

    public final void setGlobalParams(HashMap<String, Object> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.globalParams = hashMap;
    }

    public final void setOriginalUri(android.net.Uri uri) {
        o.LJIIIZ(uri, "<set-?>");
        this.originalUri = uri;
    }

    public final void setTerminalPrefixUri(android.net.Uri uri) {
        o.LJIIIZ(uri, "<set-?>");
        this.terminalPrefixUri = uri;
    }

    private final void handleOpen(String str, Context context, boolean z, M5X m5x) {
        String substring;
        if (!needIntercept()) {
            onActionPreHandleFinish();
            OSZ<String, HashMap<String, Object>> buildInnerUrl = buildInnerUrl(str, C38586FCk.LIZ(UriProtector.parse(str).getEncodedQuery()), m5x);
            String first = buildInnerUrl.getFirst();
            HashMap<String, Object> second = buildInnerUrl.getSecond();
            second.putAll(getGlobalParams());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(first);
            LIZ.append('?');
            StringBuilder sb = new StringBuilder();
            second.entrySet();
            for (Map.Entry<String, Object> entry : second.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                sb.append(key);
                sb.append("=");
                sb.append(value);
                sb.append("&");
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "urlParams.toString()");
            if (TextUtils.isEmpty(sb2)) {
                substring = "";
            } else {
                substring = sb2.substring(0, sb2.length() - 1);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LIZ.append(substring);
            X1D.LIZIZ(LIZ);
            android.net.Uri parse = UriProtector.parse(first);
            o.LJIIIIZZ(parse, "parse(finalRoutePrefix)");
            setTerminalPrefixUri(parse);
            String targetPage = getTargetPageName();
            o.LJIIIZ(targetPage, "targetPage");
            C56235M5f.LJI = targetPage;
            C56235M5f.LJFF("TerminalNode");
            if (z) {
                C56235M5f.LIZLLL(LiveNetAdaptiveHurryTimeSetting.DEFAULT, getOriginalUri(), "Transfer");
                return;
            } else if (doRealOpen(context, first, second, getFlags())) {
                C56235M5f.LIZLLL(LiveNetAdaptiveHurryTimeSetting.DEFAULT, getOriginalUri(), "Transfer");
                return;
            } else {
                C56235M5f.LIZLLL(3002, getOriginalUri(), "Transfer");
                return;
            }
        }
        onActionPreHandleFinish();
        onActionIntercept();
        C56235M5f.LJFF("TerminalNode");
        C56235M5f.LIZLLL(LiveNetAdaptiveHurryTimeSetting.DEFAULT, getOriginalUri(), "Transfer");
    }

    public final void open(Context context, String str, HashMap<String, Object> globalParams, M5X deepLinkData) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(globalParams, "globalParams");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        onActionStart();
        this.context = context;
        setGlobalParams(globalParams);
        android.net.Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(url)");
        setOriginalUri(parse);
        setTerminalPrefixUri(getOriginalUri());
        parseParams(globalParams);
        if (str != null) {
            if (isAsyncAction()) {
                XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C54226LPy(this, str, context, deepLinkData, null), 3);
            } else {
                handleOpen(str, context, this.isAsync, deepLinkData);
            }
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            LJIJJ.finish();
        }
    }

    public final void handleOpenWithAsyncResult(String str, Context context, boolean z, T t, M5X m5x) {
        handleOpen(str, context, z, m5x);
    }
}
