package com.google.gson.internal;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C30783C6h;
import X.C31465CWn;
import X.C32206CkU;
import X.C36758Ebi;
import X.C61099NyR;
import X.EnumC36761Ebl;
import X.InterfaceC36766Ebq;
import X.InterfaceC48038ItG;
import X.InterfaceC65784Pro;
import Y.IDeS404S0100000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.relation.ContactResponse;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes11.dex */
public final class h implements n, InterfaceC36766Ebq, InterfaceC48038ItG {
    public static final char[] LJLIL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final h LJLILLLLZI = new h();

    @Override // X.InterfaceC36766Ebq
    public void LIZIZ() {
    }

    @Override // X.InterfaceC36766Ebq
    public void LIZJ(C36758Ebi request, EnumC36761Ebl hitState) {
        kotlin.jvm.internal.o.LJIIIZ(request, "request");
        kotlin.jvm.internal.o.LJIIIZ(hitState, "hitState");
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new LinkedHashSet();
    }

    public static final boolean LJFF(Context context) {
        boolean LJII;
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                LJII = Settings.canDrawOverlays(context);
            } else {
                LJII = LJII(context);
            }
            return LJII;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean LJII(Context context) {
        Object LLILL = C16880lQ.LLILL(context, "appops");
        kotlin.jvm.internal.o.LJII(LLILL, "null cannot be cast to non-null type android.app.AppOpsManager");
        try {
            Class<?> cls = LLILL.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("checkOp", cls2, cls2, String.class);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            Object invoke = declaredMethod.invoke(LLILL, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName());
            if (!(invoke instanceof Integer)) {
                return false;
            }
            if (((Number) invoke).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String LJIIIIZZ(String str) {
        String str2 = null;
        try {
            byte[] bytes = str.getBytes();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                byte[] digest = messageDigest.digest();
                char[] cArr = new char[32];
                int i = 0;
                for (int i2 = 0; i2 < 16; i2++) {
                    byte b = digest[i2];
                    int i3 = i + 1;
                    char[] cArr2 = LJLIL;
                    cArr[i] = cArr2[(b >>> 4) & 15];
                    i = i3 + 1;
                    cArr[i3] = cArr2[b & 15];
                }
                str2 = new String(cArr);
                return str2;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return str2;
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            return str2;
        }
    }

    public static SpannableStringBuilder LJIIIZ(C31465CWn replacementSpan) {
        kotlin.jvm.internal.o.LJIIIZ(replacementSpan, "replacementSpan");
        SpannableStringBuilder stringBuilder = new SpannableStringBuilder().append((char) 65532);
        kotlin.jvm.internal.o.LJIIIIZZ(stringBuilder, "stringBuilder");
        LJIIJJI(replacementSpan, stringBuilder);
        LIZ(null, null, null, null, stringBuilder, null);
        return stringBuilder;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object contacts) {
        kotlin.jvm.internal.o.LJIIIZ(contacts, "contacts");
        return AbstractC73672Svk.LJJIJIL(new ContactResponse());
    }

    public static final void LJIIJ(ActivityC45651qj context, InterfaceC65784Pro interfaceC65784Pro) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        C61099NyR.LIZIZ.LIZIZ(context, TokenCert.Companion.with("bpea-request_alertwindow_permission_in_setting")).LIZ("android.permission.SYSTEM_ALERT_WINDOW").LIZJ(new IDeS404S0100000_10(interfaceC65784Pro, 4));
    }

    public static final void LJIIJJI(Object obj, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(obj, 0, spannableStringBuilder.length(), 33);
    }

    public static SpannableStringBuilder LIZLLL(AqS155S0100000_5 aqS155S0100000_5, Integer num, CharSequence charSequence, int i) {
        AqS155S0100000_5 aqS155S0100000_52 = aqS155S0100000_5;
        if ((i & 1) != 0) {
            aqS155S0100000_52 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "charSequence");
        SpannableStringBuilder append = new SpannableStringBuilder().append(charSequence);
        kotlin.jvm.internal.o.LJIIIIZZ(append, "SpannableStringBuilder().append(charSequence)");
        LIZ(aqS155S0100000_52, null, null, num, append, null);
        return append;
    }

    public static /* synthetic */ void LJ(InterfaceC65784Pro interfaceC65784Pro, SpannableStringBuilder spannableStringBuilder, List list, int i) {
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        if ((i & 1) != 0) {
            interfaceC65784Pro2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        LIZ(interfaceC65784Pro2, null, null, null, spannableStringBuilder, list);
    }

    public static final void LIZ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, Drawable drawable, Integer num, SpannableStringBuilder stringBuilder, List list) {
        kotlin.jvm.internal.o.LJIIIZ(stringBuilder, "stringBuilder");
        if (interfaceC65784Pro != null || interfaceC65784Pro2 != null) {
            LJIIJJI(new C30783C6h(interfaceC65784Pro, interfaceC65784Pro2), stringBuilder);
        }
        if (drawable != null) {
            LJIIJJI(new C32206CkU(drawable), stringBuilder);
        }
        if (num != null) {
            LJIIJJI(new ForegroundColorSpan(num.intValue()), stringBuilder);
        }
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    LJIIJJI(obj, stringBuilder);
                }
            }
        }
    }
}
