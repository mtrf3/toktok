package X;

import android.view.View;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1EZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EZ implements C0KN {
    public final DataChannel LIZ;
    public final boolean LIZIZ;
    public final KaraokeViewModel LIZJ;
    public boolean LIZLLL = true;

    @Override // X.C0KN
    public final void LIZ() {
    }

    @Override // X.C0KN
    public final void LIZIZ(C0KT c0kt) {
        Object obj;
        int i;
        KaraokeViewModel karaokeViewModel;
        if (c0kt != null) {
            obj = c0kt.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            boolean z = false;
            if (this.LIZIZ) {
                if (!this.LIZLLL) {
                    DataChannel dataChannel = this.LIZ;
                    BZI LIZ = C28787BRn.LIZ("livesdk_live_karaoke_tab_change");
                    LIZ.LJIILLIIL(dataChannel);
                    LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIIJ(dataChannel))) ? 1 : 0), "is_anchor");
                    LIZ.LJIJJ(Long.valueOf(longValue), "collection_id");
                    LIZ.LJJIIJZLJL();
                }
                if (this.LIZLLL && (karaokeViewModel = this.LIZJ) != null && c0kt.LJFF == karaokeViewModel.LJLJLLL) {
                    this.LIZLLL = false;
                    return;
                }
                return;
            }
            if (longValue == -999) {
                C21180sM.LIZLLL(this.LIZ, EnumC21150sJ.QUEUE, false);
                return;
            }
            if (longValue != -998) {
                return;
            }
            KaraokeViewModel karaokeViewModel2 = this.LIZJ;
            if (karaokeViewModel2 != null) {
                i = (int) karaokeViewModel2.LJLJLJ.LIZLLL;
            } else {
                i = 0;
            }
            DataChannel dataChannel2 = this.LIZ;
            EnumC21150sJ enumC21150sJ = EnumC21150sJ.REQUESTS;
            if (i > 0) {
                z = true;
            }
            C21180sM.LIZLLL(dataChannel2, enumC21150sJ, z);
        }
    }

    @Override // X.C0KN
    public final void LIZJ(C0KT c0kt) {
        View findViewById;
        View findViewById2;
        View view = c0kt.LJI;
        View view2 = null;
        if (view != null && (findViewById2 = view.findViewById(R.id.kyz)) != null) {
            findViewById2.setAlpha(0.5f);
        }
        View view3 = c0kt.LJI;
        if (view3 != null && (findViewById = view3.findViewById(R.id.kyk)) != null) {
            findViewById.setSelected(false);
        }
        View view4 = c0kt.LJI;
        if (view4 != null) {
            view2 = view4.findViewById(R.id.kym);
        }
        C29306Beo.LJIIIZ(view2);
    }

    public C1EZ(DataChannel dataChannel, boolean z, KaraokeViewModel karaokeViewModel) {
        this.LIZ = dataChannel;
        this.LIZIZ = z;
        this.LIZJ = karaokeViewModel;
    }
}
