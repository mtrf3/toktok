package X;

import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.PlayFullSongAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ZwW, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91556ZwW extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C91556ZwW LJLIL = new C91556ZwW();

    public C91556ZwW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LJI = C212518Vr.LIZJ;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(PlayFullSongAssem.class);
        reusedUiContentAssem.LIZJ = new PlayFullSongAssem();
        reusedUiContentAssem.LIZLLL = R.id.nfj;
        reusedUiContentAssem.LJ = R.layout.az;
        reusedUiContentAssem.LIZLLL(C8VK.LAZY);
        return C76800UCe.LIZ;
    }
}
