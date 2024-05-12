package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AiM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26978AiM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, HashMap hashMap) {
        TuxSheet LIZIZ;
        FragmentManager supportFragmentManager;
        float f;
        o.LJIIIZ(context, "context");
        android.net.Uri parse = UriProtector.parse(str);
        String queryParameter = UriProtector.getQueryParameter(parse, "title_text");
        String str2 = "";
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = UriProtector.getQueryParameter(parse, "main_text");
        if (queryParameter2 != null) {
            str2 = queryParameter2;
        }
        String queryParameter3 = UriProtector.getQueryParameter(parse, "intro_name");
        if (queryParameter3 == null) {
            queryParameter3 = null;
        }
        float f2 = 0.73f;
        int i = 0;
        try {
            String queryParameter4 = UriProtector.getQueryParameter(parse, "sheet_height_ratio");
            if (queryParameter4 != null) {
                f = CastFloatProtector.parseFloat(queryParameter4);
            } else {
                f = 0.73f;
            }
            String queryParameter5 = UriProtector.getQueryParameter(parse, "adaptive_height");
            if (queryParameter5 != null) {
                i = CastIntegerProtector.parseInt(queryParameter5);
            }
            f2 = f;
        } catch (Exception unused) {
        }
        if (hashMap != null) {
            hashMap.put("page_name", "intro_sheet");
            if (queryParameter3 != null) {
                hashMap.put("sub_page_name", queryParameter3);
            }
        }
        C76542zS.LIZJ("tiktokec_enter_page", new AqS170S0100000_4(hashMap, (HashMap<String, Object>) 1135));
        if (i == 1) {
            LIZIZ = C26968AiC.LIZ(C26968AiC.LIZJ(context, R.attr.go, str2), queryParameter, new IDqS429S0100000_4(hashMap, (HashMap<String, Object>) 14));
        } else {
            LIZIZ = C26968AiC.LIZIZ(C26968AiC.LIZJ(context, R.attr.go, str2), queryParameter, f2, new IDqS429S0100000_4(hashMap, (HashMap<String, Object>) 15));
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            C26968AiC.LJFF(LIZIZ, supportFragmentManager, "IntroSheet", null, 8);
        }
    }
}
