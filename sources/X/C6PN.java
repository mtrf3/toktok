package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6PN, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6PN<T extends StickerModel> {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C159816Oz LJ;
    public final C160056Px LJFF;
    public final Object LJI;

    public abstract C6OX LIZ(StickerModel stickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner);

    public abstract StickerModel LIZJ(StickerModel stickerModel, int i);

    public abstract EnumC157656Gr LIZLLL();

    public abstract void LJ(C6QO c6qo, C6PX c6px, String str, InterfaceC88472Yns interfaceC88472Yns);

    public Object LIZIZ() {
        return this.LJI;
    }

    public C6PN(Context context, FrameLayout stickerContainer, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, C159816Oz stickerConfig, C160056Px stickerObjectContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = stickerHigherContainer;
        this.LIZLLL = lifecycleOwner;
        this.LJ = stickerConfig;
        this.LJFF = stickerObjectContainer;
        this.LJI = new Object();
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 1061));
    }
}
