package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Byy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30556Byy extends C31073CHl {
    public final /* synthetic */ View LJLJL;

    public C30556Byy(C0N0 c0n0) {
        this.LJLJL = c0n0;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        View findViewById = this.LJLJL.findViewById(R.id.dje);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        this.LJLJL.findViewById(R.id.dje).setVisibility(8);
    }
}
