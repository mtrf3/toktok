package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62304Ocm extends AbstractC62223ObT {
    public abstract String LJJI();

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        String LJJI = LJJI();
        if (TextUtils.isEmpty(LJJI)) {
            return true;
        }
        o.LJI(LJJI);
        return C224878s7.LIZ(context, LJJI);
    }

    @Override // X.InterfaceC62225ObV
    public boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        String LJJI = LJJI();
        if (TextUtils.isEmpty(LJJI)) {
            return true;
        }
        o.LJI(LJJI);
        return C224878s7.LIZ(context, LJJI);
    }

    public final Intent LJIJJLI(Context context, C62224ObU content) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage(LJJI());
        intent.putExtra("android.intent.extra.TEXT", AbstractC62223ObT.LJIJI(content));
        return intent;
    }

    public final Intent LJIL(Context context, C62313Ocv content) {
        Intent intent;
        Object obj;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        String str = "image/*";
        boolean z = false;
        boolean z2 = true;
        if (!content.LJII) {
            intent = new Intent("android.intent.action.SEND");
            String LIZ = C62311Oct.LIZ(content);
            intent.addFlags(1);
            intent.addFlags(2);
            String uri = content.LIZIZ.toString();
            if (uri != null && uri.length() != 0) {
                z2 = false;
            }
            if (z2) {
                str = "";
            } else {
                Locale locale = Locale.getDefault();
                o.LJIIIIZZ(locale, "Locale.getDefault()");
                String lowerCase = uri.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (ujb.o.LJJJJ(lowerCase, ".gif", false)) {
                    str = "image/gif";
                }
            }
            intent.setType(str);
            intent.setPackage(LJJI());
            intent.putExtra("android.intent.extra.STREAM", content.LIZIZ);
            intent.putExtra("android.intent.extra.TEXT", LIZ);
        } else {
            intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.addFlags(1);
            intent.addFlags(2);
            intent.setPackage(LJJI());
            intent.setType("image/*");
            List<String> list = content.LJI;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (list == null || list.isEmpty()) {
                z = true;
            }
            if (!z) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        obj = Boolean.valueOf(arrayList.add(O18.LIZ(context, new File(it.next()))));
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        obj = C76800UCe.LIZ;
                    }
                    arrayList2.add(obj);
                }
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        return intent;
    }

    public final Intent LJJ(Context context, C62314Ocw content) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        String LIZ = C62311Oct.LIZ(content);
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setType("video/*");
        intent.setPackage(LJJI());
        intent.putExtra("android.intent.extra.STREAM", content.LIZIZ);
        intent.putExtra("android.intent.extra.SUBJECT", content.LIZLLL);
        intent.putExtra("android.intent.extra.TEXT", LIZ);
        return intent;
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return LJIJJ(context, LJIJJLI(context, content));
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return LJIJJ(context, LJIL(context, content));
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return LJIJJ(context, LJJ(context, content));
    }
}
