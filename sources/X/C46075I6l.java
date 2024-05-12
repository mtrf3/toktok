package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import kotlin.jvm.internal.o;

/* renamed from: X.I6l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46075I6l extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C46066I6c LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46075I6l(boolean z, C46066I6c c46066I6c, boolean z2, boolean z3) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = c46066I6c;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        I7L LLLLLL;
        if (this.LJLIL && (LLLLLL = this.LJLILLLLZI.LLLLLL()) != null) {
            DialogC135575Tt dialogC135575Tt = LLLLLL.LIZ;
            if (dialogC135575Tt != null && dialogC135575Tt.isShowing()) {
                DialogC135575Tt dialogC135575Tt2 = LLLLLL.LIZ;
                o.LJI(dialogC135575Tt2);
                dialogC135575Tt2.dismiss();
            }
            LLLLLL.LIZJ.removeCallbacksAndMessages(null);
        }
        AlertDialogC45239HpD LLLLLJLJLL = this.LJLILLLLZI.LLLLLJLJLL();
        if (LLLLLJLJLL != null) {
            V1B.LJLILLLLZI(LLLLLJLJLL);
        }
        if (this.LJLJI) {
            I7S.LIZ(this.LJLILLLLZI.LLF(), -1L, null, 6);
        }
        if (!this.LJLJJI) {
            AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(this.LJLILLLLZI.LLIL);
            if (LJIJ != null) {
                C46066I6c c46066I6c = this.LJLILLLLZI;
                IVideoLengthChecker LJ = VideoLengthChecker.LJ();
                VideoPublishEditModel LJLIIL = c46066I6c.LJLIIL();
                InterfaceC143655kP LJLJJLL = c46066I6c.LJLJJLL();
                WMH wmh = c46066I6c.LLIL;
                o.LJII(wmh, "null cannot be cast to non-null type com.ss.android.ugc.gamora.editor.rootscene.IEditRootScene");
                LJ.LIZJ(LJIJ, LJLIIL, LJLJJLL, (C6F2) wmh);
            }
            this.LJLILLLLZI.LJJLIIJ().Nv0(-1);
        }
        return C76800UCe.LIZ;
    }
}
