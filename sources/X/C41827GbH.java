package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.services.story.forward.ForwardResult;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult;
import kotlin.jvm.internal.o;

/* renamed from: X.GbH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41827GbH extends AbstractC65781Prl implements InterfaceC88472Yns<ForwardResult, C76800UCe> {
    public static final C41827GbH LJLIL = new C41827GbH();

    public C41827GbH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ForwardResult forwardResult) {
        ForwardResult it = forwardResult;
        o.LJIIIZ(it, "it");
        QuickForwardResult quickForwardResult = (QuickForwardResult) it;
        C41826GbG LIZJ = C41825GbF.LIZJ(quickForwardResult.getCreationId());
        if (LIZJ != null) {
            SmartImageView smartImageView = LIZJ.LIZJ;
            if (smartImageView != null) {
                smartImageView.setImageBitmap(quickForwardResult.getCoverBitmap());
            }
            LIZJ.LIZ = quickForwardResult;
        }
        return C76800UCe.LIZ;
    }
}
