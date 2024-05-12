package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Y0b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86677Y0b extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, Boolean, C76800UCe> {
    public static final C86677Y0b LJLIL = new C86677Y0b();

    public C86677Y0b() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, Boolean bool) {
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C86675Xzz c86675Xzz = selectSubscribe.LLIIIILZ;
        if (c86675Xzz != null) {
            Y1D LIZJ = c86675Xzz.LIZJ();
            LIZJ.LJ.LIZIZ(booleanValue, LIZJ.LIZJ, LIZJ.LIZ, LIZJ.LIZIZ);
        }
        return C76800UCe.LIZ;
    }
}
