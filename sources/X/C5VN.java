package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.jvm.internal.o;

/* renamed from: X.5VN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VN extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public final /* synthetic */ VideoSegment LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<OSZ<Boolean, String>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5VN(VideoSegment videoSegment, long j, C84654XKg c84654XKg) {
        super(2);
        this.LJLIL = videoSegment;
        this.LJLILLLLZI = j;
        this.LJLJI = c84654XKg;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String outputPath) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(outputPath, "outputPath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("compress single video,input:");
        LIZ.append(this.LJLIL.LJII(false));
        LIZ.append(",result:");
        LIZ.append(booleanValue);
        LIZ.append(",cost:");
        LIZ.append(System.currentTimeMillis() - this.LJLILLLLZI);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        C78966Uyw.LJJL(new OSZ(Boolean.valueOf(booleanValue), outputPath), this.LJLJI);
        return C76800UCe.LIZ;
    }
}
