package X;

import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1PT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PT extends AbstractC09790Zz {
    public final C0MB<C29602Bja> LJ;

    public C1PT() {
        super(0);
        this.LJ = new C0MB<>();
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(LiveDialogStatusChannel.class, this, new IDqS416S0100000(this, 191));
        }
    }
}
