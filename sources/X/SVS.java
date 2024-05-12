package X;

import com.ss.android.ugc.aweme.music.assem.MusicStatusAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SVS extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SVS LJLIL = new SVS();

    public SVS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(MusicStatusAssem.class);
        uiSlotAssem.LJIIIZ = new MusicStatusAssem();
        uiSlotAssem.LJI = R.id.gu2;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZLLL;
        return C76800UCe.LIZ;
    }
}
