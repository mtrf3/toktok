package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OP4 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(OP5.LJLIL);

    public static int LIZ() {
        try {
            String LIZIZ = C9X3.LIZ.LIZIZ("tns_filter_keyword_limit", CardStruct.IStatusCode.DEFAULT);
            o.LJIIIIZZ(LIZIZ, "instance().get(\"tns_filter_keyword_limit\", \"0\")");
            int parseInt = CastIntegerProtector.parseInt(LIZIZ);
            if (parseInt <= 0) {
                return 100;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean LIZIZ(Aweme aweme) {
        List<TextExtraStruct> textExtra;
        if (aweme == null || (textExtra = aweme.getTextExtra()) == null) {
            return false;
        }
        for (TextExtraStruct textExtraStruct : textExtra) {
            if (textExtraStruct.getType() == 1) {
                String[] LIZ2 = C52189Ke1.LIZ();
                String hashTagName = textExtraStruct.getHashTagName();
                o.LJIIIIZZ(hashTagName, "it.hashTagName");
                String lowerCase = hashTagName.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!ORY.LJJIJIIJIL(lowerCase, LIZ2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LIZLLL(int i) {
        C9X3.LIZ.LIZJ(String.valueOf(i), "tns_filter_keyword_count");
    }

    public static OP1 LIZJ(Context context, Aweme aweme, InterfaceC88472Yns dismiss, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(dismiss, "dismiss");
        Activity LIZ2 = C27740Aue.LIZ(context);
        o.LJIIIIZZ(LIZ2, "getActivity(context)");
        OP1 op1 = new OP1(LIZ2, dismiss, z);
        op1.setMAweme(aweme);
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        o.LJIIIIZZ(textExtra, "aweme.textExtra");
        ArrayList arrayList = new ArrayList();
        for (TextExtraStruct textExtraStruct : textExtra) {
            TextExtraStruct textExtraStruct2 = textExtraStruct;
            if (textExtraStruct2.getType() == 1) {
                String[] LIZ3 = C52189Ke1.LIZ();
                String hashTagName = textExtraStruct2.getHashTagName();
                o.LJIIIIZZ(hashTagName, "it.hashTagName");
                String lowerCase = hashTagName.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!ORY.LJJIJIIJIL(lowerCase, LIZ3)) {
                    arrayList.add(textExtraStruct);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TextExtraStruct) it.next()).getHashTagName());
        }
        OP6 mAdapter = op1.getMAdapter();
        mAdapter.getClass();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            ((ArrayList) mAdapter.LJLILLLLZI).add(new OP3(QZZ.LIZIZ('#', str), 2));
        }
        op1.LIZ(R.id.e32).post(new ARunnableS46S0100000_10(op1, 126));
        return op1;
    }
}
