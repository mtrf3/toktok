package X;

import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76987UJj extends ElementSpecImpl {
    public final LayeredElementContext LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    public final void LIZ() {
        boolean z = this.LJLJI | this.LJLILLLLZI;
        if (!o.LJ(Boolean.valueOf(z), this.LJLIL.getDataChannel().kv0(PublicScreenShrinkChannel.class))) {
            this.LJLIL.getDataChannel().rv0(PublicScreenShrinkChannel.class, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76987UJj(LayeredElementContext layeredElementContext) {
        super(R.id.eqi);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext;
        if (C29306Beo.LJIIL(layeredElementContext.getDataChannel())) {
            addSceneObserver(new C76989UJl(this));
        }
    }
}
