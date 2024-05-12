package X;

import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tnm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75726Tnm {
    public static final /* synthetic */ int LJI = 0;
    public DataChannel LIZ;
    public FrameLayout LIZIZ;
    public InterfaceC75871Tq7 LIZJ;
    public final AqS179S0100000_13 LIZLLL = new AqS179S0100000_13(this, 428);
    public final AqS179S0100000_13 LJ = new AqS179S0100000_13(this, 426);
    public final AqS179S0100000_13 LJFF = new AqS179S0100000_13(this, 427);

    public final C76116Tu4 LIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout != null) {
            return (C76116Tu4) frameLayout.findViewWithTag(linkMicId);
        }
        return null;
    }
}
