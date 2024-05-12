package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Nj6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60148Nj6 {
    public final XU2 LIZ;
    public final C84868XSm LIZIZ;
    public final Context LIZJ;
    public final InterfaceC60149Nj7 LIZLLL;

    public C60148Nj6(Context context, InterfaceC60149Nj7 listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZJ = context;
        this.LIZLLL = listener;
        this.LIZ = new XU2("music_detail_page_ai_recommend_music");
        this.LIZIZ = new C84868XSm(context, "commercial_music_recommend", true, true, true);
    }
}
