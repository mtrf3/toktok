package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7YW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YW {
    public User LIZ;
    public EnumC57119MbL LIZIZ = EnumC57119MbL.NORMAL;
    public boolean LIZJ;
    public java.util.Map<Boolean, Integer> LIZLLL;
    public boolean LJ;
    public LifecycleOwner LJFF;

    public final C7YX LIZ() {
        return new C7YX(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public final void LIZIZ(EnumC57119MbL style) {
        o.LJIIIZ(style, "style");
        this.LIZIZ = style;
    }
}
