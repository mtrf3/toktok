package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62307Ocp extends AbstractC62304Ocm {
    public final String LJLIL;

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.whatsapp";
    }

    @Override // X.InterfaceC62225ObV
    public String key() {
        return "whatsapp";
    }

    @Override // X.InterfaceC62225ObV
    public String label() {
        String str = this.LJLIL;
        if (str == null) {
            return "WhatsApp";
        }
        return str;
    }

    public C62307Ocp(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC62225ObV
    public Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.gd, LJJL);
            if (LJIIIZ != null) {
                i = LJIIIZ.intValue();
            } else {
                i = 0;
            }
            c2068389v.LIZ = i;
            return c2068389v.LIZ(LJJL);
        }
        return null;
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        String LIZJ = content.LIZJ("whatsapp_target_phone_number", "");
        if (!TextUtils.isEmpty(LIZJ)) {
            if (!LIZ(context, content)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.whatsapp");
            StringBuilder LIZIZ = C25620zW.LIZIZ("https://wa.me/", LIZJ, "?text=");
            LIZIZ.append(AbstractC62223ObT.LJIJI(content));
            intent.setData(UriProtector.parse(X1D.LIZIZ(LIZIZ)));
            C16880lQ.LIZJ(context, intent);
            return true;
        }
        if (content.LIZJ("image", "").length() == 0) {
            return super.LJI(content, context, interfaceC62573Oh7);
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("image/*");
        intent2.setPackage("com.whatsapp");
        intent2.putExtra("android.intent.extra.STREAM", UriProtector.parse(content.LIZJ("image", "")));
        intent2.putExtra("android.intent.extra.TEXT", AbstractC62223ObT.LJIJI(content));
        intent2.addFlags(268435456);
        intent2.addFlags(64);
        return LJIJJ(context, intent2);
    }
}
