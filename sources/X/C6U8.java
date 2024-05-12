package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6U8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6U8<T extends StickerModel> {
    public InteractStickerStruct LIZ;
    public T LIZIZ;
    public C6UF<?> LIZJ;
    public C6UA LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, (C6U8<StickerModel>) 799));

    public abstract C6UF<?> LIZ();

    public abstract T LIZJ(InteractStickerStruct interactStickerStruct);

    public final C6UA LIZIZ() {
        C6UA c6ua = this.LIZLLL;
        if (c6ua != null) {
            return c6ua;
        }
        o.LJIJI("interactStickerContainerCommonParam");
        throw null;
    }
}
