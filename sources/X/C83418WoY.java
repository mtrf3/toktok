package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WoY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83418WoY extends AbstractC83417WoX {
    public final C62822Ol8 LJI;

    @Override // X.AbstractC83417WoX
    public final String LIZ() {
        return "remove_music";
    }

    @Override // X.AbstractC83417WoX
    public final C83427Woh<?> LIZLLL() {
        return null;
    }

    @Override // X.AbstractC83417WoX
    public final C83467WpL<String, String> LIZJ() {
        return (C83467WpL) this.LJI.getValue();
    }

    @Override // X.AbstractC83417WoX
    public final EnumC83408WoO LIZIZ() {
        return EnumC83408WoO.MUSIC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83418WoY(LifecycleOwner lifecycleOwner, Context context, C82622Wbi diContainer) {
        super(lifecycleOwner, context, diContainer);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJI = C221108m2.LIZIZ(new AqS164S0100000_14(diContainer, 373));
    }
}
