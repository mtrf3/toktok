package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class LSD {
    public static final C62822Ol8 LIZ;

    static {
        new LinkedHashSet();
        LIZ = C221108m2.LIZIZ(C54257LRd.LJLIL);
    }

    public static WhatsAppCodeItem LIZ(String str) {
        List list;
        String LJJJJZ;
        String LJJJJZ2;
        Object obj = null;
        if (str == null || (list = (List) LIZ.getValue()) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            boolean z = false;
            try {
                String callingCode = ((WhatsAppCodeItem) next).getCallingCode();
                o.LJIIIIZZ(callingCode, "it.callingCode");
                LJJJJZ = ujb.o.LJJJJZ(s.LJZI(callingCode).toString(), "+", "", false);
                LJJJJZ2 = ujb.o.LJJJJZ(s.LJZI(str).toString(), "+", "", false);
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(LJJJJZ)) {
                z = TextUtils.equals(LJJJJZ, LJJJJZ2);
                if (z) {
                    obj = next;
                    break;
                }
            }
        }
        return (WhatsAppCodeItem) obj;
    }

    public static final boolean LIZIZ(String str) {
        Boolean whatsappFirst;
        try {
            WhatsAppCodeItem LIZ2 = LIZ(str);
            if (LIZ2 != null && (whatsappFirst = LIZ2.getWhatsappFirst()) != null) {
                return whatsappFirst.booleanValue();
            }
        } catch (Exception unused) {
        }
        return true;
    }
}
