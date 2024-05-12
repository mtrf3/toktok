package X;

import Y.ACListenerS46S0200000_12;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.model.AudienceRoomTasksResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.google.gson.Gson;
import com.google.gson.internal.c;
import com.google.gson.internal.n;
import com.google.gson.j;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;

/* renamed from: X.SlO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73030SlO implements JIT, n, InterfaceC48038ItG, C0K7 {
    public static String LJLIL = "";
    public static String LJLILLLLZI = "";
    public static final C73030SlO LJLJI = new C73030SlO();
    public static final C73030SlO LJLJJI = new C73030SlO();

    @Override // X.JIT
    public void LIZ(String str) {
    }

    @Override // X.JIT
    public void LIZJ() {
    }

    @Override // X.JIT
    public void LIZLLL() {
    }

    public static String LJIIIZ() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "hashtag_multi_language_and_emoji", true) == 0) {
            z = true;
        }
        if (z) {
            if (TextUtils.isEmpty(LJLIL)) {
                return "#([\\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]|[\\uFF61-\\uFF9F\\uFFE8-\\uFFEE\\uFF10-\\uFF19\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u3040-\\u309F\\u30A0-\\u30FF\\uFF01-\\uFF5E\\uFFE0-\\uFFE5]|(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?]))+";
            }
            return LJLIL;
        }
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("new_hashtag_regex", "");
        o.LJIIIIZZ(LJI, "getInstance().getStringV…RegexSetting::class.java)");
        if (!TextUtils.isEmpty(LJI) && TextUtils.isEmpty(LJLILLLLZI)) {
            LJLILLLLZI = "#($newHashTagRegexSetting)+";
        }
        if (TextUtils.isEmpty(LJLILLLLZI)) {
            if (TextUtils.isEmpty(LJLIL)) {
                return "#([\\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]|[\\uFF61-\\uFF9F\\uFFE8-\\uFFEE\\uFF10-\\uFF19\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u3040-\\u309F\\u30A0-\\u30FF\\uFF01-\\uFF5E\\uFFE0-\\uFFE5]|(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?]))+";
            }
            return LJLIL;
        }
        return LJLILLLLZI;
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new LinkedHashMap();
    }

    public static boolean LJFF(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIZ());
        LIZ.append("$");
        return PatternProtector.compile(X1D.LIZIZ(LIZ)).matcher(str).find();
    }

    public static ArrayList LJII(String str) {
        Matcher matcher = PatternProtector.compile(LJIIIZ()).matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static int LJIIIIZZ(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return LJ(c.LJLILLLLZI, i, c.LJLJI);
        }
        if (7000 <= i && i < 14000) {
            return LJ(T2R.LJLILLLLZI, i - 7000, T2R.LJLJI);
        }
        return LJ(C44384HbQ.LJLJJLL, i - 14000, C44384HbQ.LJLJL);
    }

    public static void LJIIJJI(C73031SlP c73031SlP) {
        Context context = c73031SlP.LIZ;
        if (context != null) {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.uf, C16880lQ.LLZIL(context), null);
            o.LJIIIIZZ(LLLZIIL, "LayoutInflater.from(cont…ayout_reset_dialog, null)");
            View findViewById = LLLZIIL.findViewById(R.id.mo6);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_title)");
            TextView textView = (TextView) findViewById;
            View findViewById2 = LLLZIIL.findViewById(R.id.m2v);
            o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_content)");
            TextView textView2 = (TextView) findViewById2;
            View findViewById3 = LLLZIIL.findViewById(R.id.m_q);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.tv_left)");
            TextView textView3 = (TextView) findViewById3;
            View findViewById4 = LLLZIIL.findViewById(R.id.mi6);
            o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.tv_right)");
            TextView textView4 = (TextView) findViewById4;
            AlertDialog dialog = new AlertDialog.Builder(context).setCancelable(false).setView(LLLZIIL).show();
            o.LJIIIIZZ(dialog, "dialog");
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(C74275TDb.LJ(context) - ((int) C74275TDb.LIZIZ(context, 80.0f)), window.getAttributes().height);
            }
            textView.setText(c73031SlP.LIZIZ);
            textView2.setText(c73031SlP.LIZJ);
            textView3.setText(c73031SlP.LJ);
            textView4.setText(c73031SlP.LIZLLL);
            C16880lQ.LJIJI(textView3, new ACListenerS46S0200000_12(dialog, c73031SlP, 16));
            C16880lQ.LJIJI(textView4, new ACListenerS46S0200000_12(dialog, c73031SlP, 17));
        }
    }

    public static String LJIIL(char c) {
        if (19968 <= c) {
            if (c <= 40869 && LJIIIIZZ(c) > 0) {
                return C1DH.LJLJLJ[LJIIIIZZ(c)];
            }
        } else if (12295 == c) {
            return "LING";
        }
        return String.valueOf(c);
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        return new OSZ(GsonProtectorUtils.fromJson(new Gson(), (j) it.data, AudienceRoomTasksResponse.class), it);
    }

    public static C41529GRp LIZIZ(String str, String str2) {
        if (str2 == null || str == null) {
            return new C41529GRp("", 0, 0);
        }
        C41529GRp c41529GRp = new C41529GRp();
        String LJ = a1.LJ("#", str2, " ");
        int length = str.length();
        c41529GRp.LIZ = length;
        c41529GRp.LIZJ = LJ;
        c41529GRp.LIZIZ = LJ.length() + length;
        return c41529GRp;
    }

    public static final void LJIIJ(C58985NCz c58985NCz, int i) {
        GradientDrawable gradientDrawable;
        o.LJIIIZ(c58985NCz, "<this>");
        View view = c58985NCz.LJLLLL;
        if (view != null) {
            Drawable background = view.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(i);
            }
            view.setBackground(view.getBackground());
        }
    }

    public static short LJ(byte[] bArr, int i, byte[] bArr2) {
        short s = (short) (bArr2[i] & 255);
        if ((bArr[i / 8] & C1DH.LJLJL[i % 8]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
