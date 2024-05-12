package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62308Ocq extends AbstractC62223ObT {
    @Override // X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "instagram_story";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Stories";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.fg, LJJL);
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

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        C62224ObU c62224ObU = new C62224ObU("", null);
        if (C224878s7.LIZ(context, "com.instagram.android") && LIZ(context, c62224ObU)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/*");
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return LJIJJLI(content, context, content.LIZIZ);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return LJIJJLI(content, context, content.LIZIZ);
    }

    public final boolean LJIJJLI(AbstractC62625Ohx content, Context context, android.net.Uri uri) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uri, "uri");
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        String LIZJ = content.LIZJ("media_type", "video/*");
        String LIZJ2 = content.LIZJ("content_url", "");
        if (!TextUtils.isEmpty(LIZJ)) {
            intent.setType(LIZJ);
        }
        if (!TextUtils.isEmpty(LIZJ2)) {
            intent.putExtra("content_url", LIZJ2);
        }
        intent.setDataAndType(uri, LIZJ);
        intent.setFlags(1);
        return LJIJJ(context, intent);
    }
}
