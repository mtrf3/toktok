package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I6q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46080I6q implements C5HC {
    public final /* synthetic */ AbstractC46064I6a LJLIL;

    public C46080I6q(AbstractC46064I6a abstractC46064I6a) {
        this.LJLIL = abstractC46064I6a;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        Integer editState = this.LJLIL.LJJLIIJ().Ov0().getEditState();
        if (editState == null || editState.intValue() != 2) {
            this.LJLIL.LJJLIIIJL(false);
            return true;
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLIL.LLIIIJ;
        if (cutMultiVideoViewModel != null) {
            cutMultiVideoViewModel.LJLJLLL.setValue(null);
            return true;
        }
        o.LJIJI("cutMultiVideoViewModel");
        throw null;
    }
}
