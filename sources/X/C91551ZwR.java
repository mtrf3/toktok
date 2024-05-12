package X;

import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.lyric.LyricSlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ZwR, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91551ZwR extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final C91551ZwR LJLIL = new C91551ZwR();

    public C91551ZwR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LJ = C212518Vr.LIZJ;
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(LyricSlotAssem.class);
        reusedUiSlotAssem.LIZJ = new LyricSlotAssem();
        reusedUiSlotAssem.LIZLLL = R.id.gst;
        reusedUiSlotAssem.LIZLLL(C8VK.LAZY);
        return C76800UCe.LIZ;
    }
}
