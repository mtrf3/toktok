package X;

import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;

/* renamed from: X.AJo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26032AJo implements InterfaceC26019AJb {
    public final /* synthetic */ PushOffReasonBottomSheetFragment LJLIL;

    public C26032AJo(PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment) {
        this.LJLIL = pushOffReasonBottomSheetFragment;
    }

    @Override // X.InterfaceC26019AJb
    public final void LJJIIZI(int i, CharSequence charSequence) {
        String str;
        boolean z;
        C45631qh c45631qh;
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = this.LJLIL;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        pushOffReasonBottomSheetFragment.LJLILLLLZI = str;
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment2 = this.LJLIL;
        C6J7 c6j7 = pushOffReasonBottomSheetFragment2.LJLJLLL;
        if (c6j7 != null) {
            c6j7.LJJIIZI(i, pushOffReasonBottomSheetFragment2.LJLILLLLZI);
        }
        if (this.LJLIL.LJLILLLLZI.length() > i) {
            z = true;
        } else {
            z = false;
        }
        C26021AJd c26021AJd = this.LJLIL.LJLJLJ;
        if (c26021AJd != null) {
            c26021AJd.LJI(z);
        }
        C26018AJa c26018AJa = this.LJLIL.LJLL;
        if (c26018AJa != null) {
            c26018AJa.LJFF(z);
        }
        if (z && (c45631qh = this.LJLIL.LJLJL) != null) {
            c45631qh.LJIILLIIL(-c45631qh.getScrollX(), 500 - c45631qh.getScrollY(), false);
        }
        this.LJLIL.vl();
    }
}
