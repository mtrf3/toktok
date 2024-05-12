package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.jvm.internal.o;

/* renamed from: X.5VO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VO extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public final /* synthetic */ C43544H7c LJLIL;
    public final /* synthetic */ VideoSegment LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC67352kd<OSZ<Boolean, String>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5VO(C43544H7c c43544H7c, VideoSegment videoSegment, long j, C84654XKg c84654XKg) {
        super(2);
        this.LJLIL = c43544H7c;
        this.LJLILLLLZI = videoSegment;
        this.LJLJI = j;
        this.LJLJJI = c84654XKg;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String outputPath) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(outputPath, "outputPath");
        C43544H7c c43544H7c = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("compress single video,input:");
        LIZ.append(this.LJLILLLLZI.LJII(false));
        LIZ.append(",result:");
        LIZ.append(booleanValue);
        LIZ.append(",cost:");
        LIZ.append(System.currentTimeMillis() - this.LJLJI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c43544H7c.getClass();
        C43544H7c.LJIILIIL(LIZIZ);
        C78966Uyw.LJJL(new OSZ(Boolean.valueOf(booleanValue), outputPath), this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
