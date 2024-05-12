package Y;

import X.AnonymousClass195;
import X.C15380j0;
import X.C29306Beo;
import X.C2B2;
import X.C40891j3;
import X.C77800Ug8;
import X.C79057V0z;
import X.XKX;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDCListenerS370S0100000 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            case 2:
                onFocusChange$2(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS370S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(IDCListenerS370S0100000 iDCListenerS370S0100000, View view, boolean z) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) iDCListenerS370S0100000.l0;
        View.OnFocusChangeListener onFocusChangeListener = anonymousClass195.LLIIJLIL;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(anonymousClass195, z);
        }
    }

    public static final void onFocusChange$1(IDCListenerS370S0100000 iDCListenerS370S0100000, View view, boolean z) {
        if (z) {
            ((C40891j3) iDCListenerS370S0100000.l0).LJFF(R.id.amo).setOnFocusChangeListener(null);
            ((C40891j3) iDCListenerS370S0100000.l0).LJFF(R.id.amo).postDelayed(new IDRunnableS85S0100000((C40891j3) iDCListenerS370S0100000.l0, 46), 100L);
        }
    }

    public static final void onFocusChange$2(IDCListenerS370S0100000 iDCListenerS370S0100000, View view, boolean z) {
        KaraokeLibraryFragment karaokeLibraryFragment = (KaraokeLibraryFragment) iDCListenerS370S0100000.l0;
        karaokeLibraryFragment.getClass();
        if (z) {
            Context LIZLLL = C15380j0.LIZLLL();
            LiveEditText liveEditText = karaokeLibraryFragment.LJLIL;
            if (liveEditText != null) {
                C79057V0z.LJJJJZ(LIZLLL, liveEditText);
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(karaokeLibraryFragment), null, null, new C2B2(karaokeLibraryFragment, null), 3);
            } else {
                o.LJIJI("searchBox");
                throw null;
            }
        } else {
            Context LIZLLL2 = C15380j0.LIZLLL();
            LiveEditText liveEditText2 = karaokeLibraryFragment.LJLIL;
            if (liveEditText2 != null) {
                C79057V0z.LJJIIJZLJL(LIZLLL2, liveEditText2);
            } else {
                o.LJIJI("searchBox");
                throw null;
            }
        }
        DataChannel dataChannel = ((KaraokeLibraryFragment) iDCListenerS370S0100000.l0).LJLLL;
        if (C29306Beo.LJIIJ(dataChannel)) {
            C77800Ug8.LJ("livesdk_live_karaoke_search_click", dataChannel);
        }
    }
}
