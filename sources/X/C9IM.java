package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9IM, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IM extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ I18nMyProfileFragmentV3 LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ ProfileUser LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9IM(I18nMyProfileFragmentV3 i18nMyProfileFragmentV3, View view, long j, ProfileUser profileUser) {
        super(1);
        this.LJLIL = i18nMyProfileFragmentV3;
        this.LJLILLLLZI = view;
        this.LJLJI = j;
        this.LJLJJI = profileUser;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        I18nMyProfileFragmentV3 i18nMyProfileFragmentV3 = this.LJLIL;
        assemble.mv0(i18nMyProfileFragmentV3, new C9IO(this.LJLJJI, i18nMyProfileFragmentV3));
        I18nMyProfileFragmentV3 i18nMyProfileFragmentV32 = this.LJLIL;
        assemble.wv0(i18nMyProfileFragmentV32, new AqS170S0100000_4(i18nMyProfileFragmentV32, 617));
        assemble.wv0(this.LJLIL, new AqS170S0100000_4(this.LJLILLLLZI, 618));
        I18nMyProfileFragmentV3 i18nMyProfileFragmentV33 = this.LJLIL;
        View view = this.LJLILLLLZI;
        i18nMyProfileFragmentV33.getClass();
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        int LIZIZ = C7MY.LIZIZ(4);
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        View findViewById = view.findViewById(R.id.iuq);
        C119324mG c119324mG = (C119324mG) view.findViewById(R.id.mz2);
        View findViewById2 = view.findViewById(R.id.y1);
        if (findViewById != null) {
            C26338AVi.LJI(findViewById, null, Integer.valueOf(LJJIIZ), null, null, false, 29);
        }
        if (c119324mG != null) {
            C26338AVi.LJIIIZ(c119324mG, null, Integer.valueOf(LIZIZ), null, null, 29);
            c119324mG.setExpectedEmptyHeightPx(LJJIIZ);
        }
        if (findViewById2 != null) {
            C26338AVi.LJIIIZ(findViewById2, Integer.valueOf(LJJIIZ2), null, Integer.valueOf(LJJIIZ2), null, 26);
        }
        C237259Sv.LJIIIIZZ(System.currentTimeMillis() - this.LJLJI);
        return C76800UCe.LIZ;
    }
}
