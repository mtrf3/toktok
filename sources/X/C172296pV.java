package X;

import com.bytedance.ies.cutsame.source.api.AfrApi;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import kotlin.jvm.internal.o;

/* renamed from: X.6pV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172296pV extends AbstractC65781Prl implements InterfaceC65784Pro<C172336pZ> {
    public static final C172296pV LJLIL = new C172296pV();

    public C172296pV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C172336pZ invoke() {
        C126944yY c126944yY = C172286pU.LIZ;
        if (c126944yY != null) {
            return new C172336pZ(c126944yY.LIZIZ, (NLEModelDownloader) C172286pU.LIZJ.getValue(), (AfrApi) C172286pU.LIZLLL.getValue());
        }
        o.LJIJI("config");
        throw null;
    }
}
