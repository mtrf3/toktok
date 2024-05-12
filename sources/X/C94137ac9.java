package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.InputDspPlaylistSheetFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.ac9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94137ac9 implements InterfaceC26019AJb {
    public final /* synthetic */ InputDspPlaylistSheetFragment LJLIL;

    public C94137ac9(InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment) {
        this.LJLIL = inputDspPlaylistSheetFragment;
    }

    @Override // X.InterfaceC26019AJb
    public final void LJJIIZI(int i, CharSequence charSequence) {
        String str;
        boolean z;
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment = this.LJLIL;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        inputDspPlaylistSheetFragment.LJLJLLL = str;
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment2 = this.LJLIL;
        C6J7 c6j7 = inputDspPlaylistSheetFragment2.LJLLJ;
        if (c6j7 != null) {
            c6j7.LJJIIZI(i, inputDspPlaylistSheetFragment2.LJLJLLL);
        }
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment3 = this.LJLIL;
        boolean z2 = false;
        if (inputDspPlaylistSheetFragment3.LJLJLLL.length() > i) {
            z = true;
        } else {
            z = false;
        }
        inputDspPlaylistSheetFragment3.LJLL = z;
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment4 = this.LJLIL;
        C26021AJd c26021AJd = inputDspPlaylistSheetFragment4.LJLLILLLL;
        if (c26021AJd != null) {
            c26021AJd.LJI(inputDspPlaylistSheetFragment4.LJLL);
        }
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment5 = this.LJLIL;
        C26018AJa c26018AJa = inputDspPlaylistSheetFragment5.LJLLI;
        if (c26018AJa != null) {
            c26018AJa.LJFF(inputDspPlaylistSheetFragment5.LJLL);
        }
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment6 = this.LJLIL;
        SY4 sy4 = (SY4) inputDspPlaylistSheetFragment6._$_findCachedViewById(R.id.kpl);
        if (inputDspPlaylistSheetFragment6.LJLJLLL.length() > 0 && !inputDspPlaylistSheetFragment6.LJLL) {
            z2 = true;
        }
        sy4.setEnabled(z2);
    }
}
