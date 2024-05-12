package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BAK {
    public final Object LIZ;

    public /* synthetic */ BAK(ViewStub viewStub) {
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.a0m);
            viewStub.setInflatedId(R.id.gud);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.tools.music.view.CommerceMusicLegalLayout");
            this.LIZ = inflate;
            return;
        }
        this.LIZ = viewStub.findViewById(R.id.gud);
    }

    public final void LIZ(String str, String str2) {
        ((java.util.Map) this.LIZ).put(str, str2);
    }
}
