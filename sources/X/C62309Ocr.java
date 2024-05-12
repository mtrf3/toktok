package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62309Ocr extends AbstractC62223ObT {
    @Override // X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "facebook_story";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.f8, LJJL);
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
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("video/mp4");
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("video/mp4");
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
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        String LIZJ = content.LIZJ("media_type", "");
        String LIZJ2 = content.LIZJ("content_url", "video/*");
        String LIZJ3 = content.LIZJ("fb_app_id", "");
        if (!TextUtils.isEmpty(LIZJ)) {
            intent.setType(LIZJ);
        }
        if (!TextUtils.isEmpty(LIZJ3)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", LIZJ3);
        }
        if (!TextUtils.isEmpty(LIZJ2)) {
            intent.putExtra("content_url", LIZJ2);
        }
        intent.setDataAndType(uri, LIZJ);
        intent.setFlags(1);
        return LJIJJ(context, intent);
    }
}
