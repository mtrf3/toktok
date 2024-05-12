package X;

import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Wy5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84009Wy5 extends AbstractC65781Prl implements InterfaceC88472Yns<C87278YNe, C76800UCe> {
    public final /* synthetic */ float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84009Wy5(float f) {
        super(1);
        this.LJLIL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C87278YNe c87278YNe) {
        C87278YNe it = c87278YNe;
        o.LJIIIZ(it, "it");
        float f = 1024;
        int i = (int) (this.LJLIL * 4 * f * f);
        VEVideoEncodeSettings vEVideoEncodeSettings = it.LIZIZ;
        vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        vEVideoEncodeSettings.bps = i;
        return C76800UCe.LIZ;
    }
}
