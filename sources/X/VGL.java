package X;

import android.opengl.GLES30;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class VGL extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ByteBuffer LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VGL(int i, int i2, ByteBuffer byteBuffer) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = byteBuffer;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        GLES30.glReadPixels(0, 0, this.LJLIL, this.LJLILLLLZI, 6408, 5121, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
