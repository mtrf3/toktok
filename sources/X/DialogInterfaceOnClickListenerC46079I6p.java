package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;

/* renamed from: X.I6p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnClickListenerC46079I6p implements DialogInterface.OnClickListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ AbstractC46064I6a LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    public DialogInterfaceOnClickListenerC46079I6p(boolean z, AbstractC46064I6a abstractC46064I6a, boolean z2, boolean z3, boolean z4, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = z;
        this.LJLILLLLZI = abstractC46064I6a;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC166716gV LLIIIL;
        if (this.LJLIL) {
            this.LJLILLLLZI.LLIL();
        }
        if (this.LJLJI) {
            this.LJLILLLLZI.LLIIIILZ();
        }
        if (this.LJLILLLLZI.LJLIIL().isDisableOriginalSound()) {
            this.LJLILLLLZI.LJLIIL().resetVolume();
        }
        if (this.LJLJJI && (LLIIIL = this.LJLILLLLZI.LLIIIL()) != null) {
            LLIIIL.Hy();
        }
        if (this.LJLJJL) {
            AudioRecorderParam audioRecorderParam = this.LJLILLLLZI.LJLIIL().veAudioRecorderParam;
            if (audioRecorderParam != null) {
                AbstractC46064I6a abstractC46064I6a = this.LJLILLLLZI;
                audioRecorderParam.setNeedDel(true);
                C78847Ux1.LJIIJJI(abstractC46064I6a.LJLJJLL(), audioRecorderParam);
            }
            this.LJLILLLLZI.LJJJJLI();
        }
        this.LJLJJLL.invoke();
    }
}
