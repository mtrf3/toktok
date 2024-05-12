package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJX {
    public int LIZ;
    public boolean LIZIZ;
    public DataChannel LIZJ;
    public RecyclerView LIZLLL;

    public final void LIZ(boolean z) {
        if (this.LIZIZ != z) {
            if (z) {
                this.LIZ = 0;
            } else {
                RecyclerView recyclerView = this.LIZLLL;
                if (recyclerView != null) {
                    if (C16310kV.LIZLLL(recyclerView) != 1 ? this.LIZ > 0 : this.LIZ < 0) {
                        BZI LIZ = C28787BRn.LIZ("livesdk_quick_comment_right_slide");
                        LIZ.LJIILLIIL(this.LIZJ);
                        LIZ.LJJIIJZLJL();
                    }
                } else {
                    o.LJIJI("mRecyclerView");
                    throw null;
                }
            }
            this.LIZIZ = z;
        }
    }
}
