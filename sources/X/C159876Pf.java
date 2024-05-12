package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.6Pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159876Pf {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final C6O5 LIZLLL;
    public final C159866Pe LJ;
    public final LifecycleOwner LJFF;
    public C6PX LJI;
    public C6PW LJII;

    public C159876Pf(Context context, FrameLayout stickerContainer, FrameLayout stickerHigherContainer, C6O5 textFontService, C159866Pe stickerComponentManager, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(textFontService, "textFontService");
        o.LJIIIZ(stickerComponentManager, "stickerComponentManager");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = stickerHigherContainer;
        this.LIZLLL = textFontService;
        this.LJ = stickerComponentManager;
        this.LJFF = lifecycleOwner;
    }
}
