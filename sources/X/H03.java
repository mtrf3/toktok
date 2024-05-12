package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H03 extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, AbstractImageUploader.ImageUploadInfo, C76800UCe> {
    public final /* synthetic */ H00 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H03(H00 h00, long j) {
        super(2);
        this.LJLIL = h00;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        int intValue = num.intValue();
        o.LJIIIZ(imageUploadInfo, "<anonymous parameter 1>");
        H00 h00 = this.LJLIL;
        C43366H0g.LIZ(h00.LJIILLIIL, new C43338Gze(h00, intValue, this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
