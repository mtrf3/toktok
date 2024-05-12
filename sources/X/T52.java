package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T52 implements InterfaceC43690HCs {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ CommerceSticker LIZIZ;

    @Override // X.InterfaceC43690HCs
    public final void LIZ(String str) {
        InterfaceC74078T5m LIZ = C59854NeM.LIZ();
        if (LIZ != null) {
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "context");
            this.LIZIZ.getId();
            LIZ.LJ(context, str, null, null);
        }
    }

    public T52(View view, CommerceSticker commerceSticker) {
        this.LIZ = view;
        this.LIZIZ = commerceSticker;
    }
}
