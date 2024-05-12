package X;

import Y.ACListenerS35S0100000_15;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushCategory;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xmk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85854Xmk extends AEG implements InterfaceC85949XoH {
    public final PushCategory LJLJJL;
    public final ACListenerS35S0100000_15 LJLJJLL;

    @Override // X.InterfaceC85949XoH
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC85949XoH
    public final void LJ(Context context) {
    }

    @Override // X.AEG
    /* renamed from: LJIIJJI */
    public final AEB LJIIIIZZ() {
        ACListenerS35S0100000_15 aCListenerS35S0100000_15;
        String LJIILIIL = LJIILIIL(C85940Xo8.LIZIZ.LIZLLL("friends_only_push"));
        if (this.LJLJJL.categoryTips.length() > 0) {
            aCListenerS35S0100000_15 = this.LJLJJLL;
        } else {
            aCListenerS35S0100000_15 = null;
        }
        return new AEB(LJIILIIL, true, false, false, false, null, null, null, null, null, aCListenerS35S0100000_15, 12284);
    }

    @Override // X.AEG, X.AG6
    public final /* bridge */ /* synthetic */ AEB LJIIIIZZ() {
        return LJIIIIZZ();
    }

    public C85854Xmk(PushCategory pushCategory) {
        super(null);
        this.LJLJJL = pushCategory;
        this.LJLJJLL = new ACListenerS35S0100000_15(this, 197);
    }

    public final String LJIILIIL(int i) {
        HashMap<String, Boolean> hashMap = C85919Xnn.LIZ;
        if ((!hashMap.containsKey("friends_only_push") || o.LJ(hashMap.get("friends_only_push"), Boolean.TRUE)) && this.LJLJJL.LIZ && i == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" · ");
            LIZ.append(C86V.LJFF(R.string.t6l));
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            return JBR.LJFF(LIZ2, this.LJLJJL.categoryTitle, LIZIZ, LIZ2);
        }
        return this.LJLJJL.categoryTitle;
    }

    @Override // X.InterfaceC85949XoH
    public final void LIZLLL(int i, String otherItemId) {
        o.LJIIIZ(otherItemId, "otherItemId");
        if (o.LJ(otherItemId, "friends_only_push")) {
            LJIIL(LJIILIIL(i));
        }
    }
}
