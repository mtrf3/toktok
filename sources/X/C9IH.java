package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV3;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9IH, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IH extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ I18nUserProfileFragmentV3 LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ ProfileUser LJLJJI;
    public final /* synthetic */ C26175APb LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9IH(I18nUserProfileFragmentV3 i18nUserProfileFragmentV3, View view, long j, ProfileUser profileUser, C26175APb c26175APb) {
        super(1);
        this.LJLIL = i18nUserProfileFragmentV3;
        this.LJLILLLLZI = view;
        this.LJLJI = j;
        this.LJLJJI = profileUser;
        this.LJLJJL = c26175APb;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0(this.LJLIL, new AqS135S0200000_4(this.LJLJJI, this.LJLJJL, 84));
        I18nUserProfileFragmentV3 i18nUserProfileFragmentV3 = this.LJLIL;
        assemble.wv0(i18nUserProfileFragmentV3, new AqS170S0100000_4(i18nUserProfileFragmentV3, 610));
        assemble.wv0(this.LJLIL, new AqS170S0100000_4(this.LJLILLLLZI, 612));
        this.LJLIL.fm(this.LJLILLLLZI);
        C237259Sv.LJIIIIZZ(System.currentTimeMillis() - this.LJLJI);
        return C76800UCe.LIZ;
    }
}
