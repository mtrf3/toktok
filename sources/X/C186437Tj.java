package X;

import com.ss.android.ugc.aweme.detail.prefab.HeaderAdvanceInfoAssem;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186437Tj extends AbstractC65781Prl implements InterfaceC88472Yns<C8VL, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ MusicDetailFragment LJLJI;
    public final /* synthetic */ MusicDetail LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186437Tj(boolean z, boolean z2, MusicDetailFragment musicDetailFragment, MusicDetail musicDetail) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = musicDetailFragment;
        this.LJLJJI = musicDetail;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8VL c8vl) {
        C8VL c8vl2 = c8vl;
        o.LJIIIZ(c8vl2, "$this$null");
        c8vl2.LIZ = C65352Pkq.LIZ(HeaderAdvanceInfoAssem.class);
        c8vl2.LJIIIIZZ = C212518Vr.LIZJ;
        if (this.LJLIL) {
            c8vl2.LJI("reuse_music_info", C186447Tk.LJLIL);
        }
        if (this.LJLILLLLZI) {
            c8vl2.LJI("pgc_meta_info", new AqS134S0200000_3(this.LJLJI, this.LJLJJI, 264));
        }
        return C76800UCe.LIZ;
    }
}
