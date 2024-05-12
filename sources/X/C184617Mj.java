package X;

import android.os.Bundle;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsDetailFragment;
import kotlin.jvm.internal.AqS0S1010000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184617Mj extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ SocialNowsDetailFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C184617Mj(SocialNowsDetailFragment socialNowsDetailFragment) {
        super(1);
        this.LJLIL = socialNowsDetailFragment;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        String str;
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        SocialNowsDetailFragment socialNowsDetailFragment = this.LJLIL;
        assemble.wv0(socialNowsDetailFragment, new AqS134S0200000_3(assemble, socialNowsDetailFragment, 114));
        SocialNowsDetailFragment socialNowsDetailFragment2 = this.LJLIL;
        assemble.mv0(socialNowsDetailFragment2, new AqS169S0100000_3(socialNowsDetailFragment2, 341));
        boolean z = false;
        if (C00F.LIZ(31744, 0, "share_others_now_post_revamp_reflow", true) == 1) {
            Bundle arguments = this.LJLIL.getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("should_back_to_cur_page_after_publish");
            }
            Bundle arguments2 = this.LJLIL.getArguments();
            if (arguments2 != null) {
                str = arguments2.getString("toast_when_start_publish");
            } else {
                str = null;
            }
            assemble.mv0(this.LJLIL, new AqS0S1010000_3(z, str, 0));
        }
        return C76800UCe.LIZ;
    }
}
