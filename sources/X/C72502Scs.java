package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Scs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72502Scs implements InterfaceC228778yP {
    public final /* synthetic */ MufListPageFragment LJLIL;

    @Override // X.InterfaceC228778yP
    public final void onHide() {
        ((K5T) this.LJLIL._$_findCachedViewById(R.id.je_)).getEditTextView().setCursorVisible(false);
        ((K5T) this.LJLIL._$_findCachedViewById(R.id.je_)).getEditTextView().clearFocus();
    }

    @Override // X.InterfaceC228778yP
    public final void onShow() {
        ((K5T) this.LJLIL._$_findCachedViewById(R.id.je_)).getEditTextView().setCursorVisible(true);
    }

    public C72502Scs(MufListPageFragment mufListPageFragment) {
        this.LJLIL = mufListPageFragment;
    }
}
