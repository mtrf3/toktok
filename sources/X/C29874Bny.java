package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import java.util.HashSet;

/* renamed from: X.Bny, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29874Bny implements InterfaceC65784Pro {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        java.util.Set<DialogFragment> set;
        switch (this.LJLIL) {
            case 0:
                C29867Bnr c29867Bnr = (C29867Bnr) this.LJLILLLLZI;
                Object obj = this.LJLJI;
                c29867Bnr.LJLLI.rv0(ToolBarShareVisibleChannel.class, Boolean.FALSE);
                C14A c14a = AnonymousClass149.LIZ;
                if (obj != null && (set = c14a.LIZIZ) != null) {
                    ((HashSet) set).remove(obj);
                }
                return C76800UCe.LIZ;
            default:
                HZV.LIZ().LJIIJJI((Context) this.LJLILLLLZI, (Intent) this.LJLJI);
                return null;
        }
    }

    public /* synthetic */ C29874Bny(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
