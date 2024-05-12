package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.livesdk.dataChannel.BGMDismissVolumeBarEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0hK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14340hK {
    public final C0KV LIZ;
    public final BGMSongListViewModel LIZIZ;
    public int LIZJ = -1;
    public final List<C33511Tf> LIZLLL = new ArrayList();
    public boolean LJ = true;

    public static void LIZ(C0KT c0kt) {
        ImageView imageView;
        if (c0kt != null) {
            View view = c0kt.LJI;
            if (view != null) {
                View findViewById = view.findViewById(R.id.kyq);
                if (findViewById != null) {
                    findViewById.setAlpha(0.9f);
                }
                if (c0kt == null) {
                    return;
                }
            }
            View view2 = c0kt.LJI;
            if (view2 == null || (imageView = (ImageView) view2.findViewById(R.id.kyk)) == null) {
                return;
            }
            imageView.setSelected(true);
        }
    }

    public static void LIZIZ(C0KT c0kt) {
        ImageView imageView;
        View findViewById;
        View view = c0kt.LJI;
        if (view != null && (findViewById = view.findViewById(R.id.kyq)) != null) {
            findViewById.setAlpha(0.5f);
        }
        View view2 = c0kt.LJI;
        if (view2 == null || (imageView = (ImageView) view2.findViewById(R.id.kyk)) == null) {
            return;
        }
        imageView.setSelected(false);
    }

    public C14340hK(C0KV c0kv, final DataChannel dataChannel, BGMSongListViewModel bGMSongListViewModel) {
        this.LIZ = c0kv;
        this.LIZIZ = bGMSongListViewModel;
        c0kv.setSelectedTabIndicatorGravity(0);
        c0kv.LIZ(new C0KN() { // from class: X.1TZ
            @Override // X.C0KN
            public final void LIZ() {
            }

            @Override // X.C0KN
            public final void LIZIZ(C0KT c0kt) {
                int i;
                DataChannel dataChannel2 = DataChannel.this;
                if (dataChannel2 != null) {
                    dataChannel2.pv0(BGMDismissVolumeBarEvent.class);
                }
                this.getClass();
                C14340hK.LIZ(c0kt);
                if (c0kt != null) {
                    i = c0kt.LJFF;
                } else {
                    i = 0;
                }
                C14340hK c14340hK = this;
                BGMSongListViewModel bGMSongListViewModel2 = c14340hK.LIZIZ;
                bGMSongListViewModel2.LJLL = i;
                bGMSongListViewModel2.LJLLILLLL = ((C33511Tf) ListProtector.get(c14340hK.LIZLLL, i)).LJLILLLLZI;
                C14340hK c14340hK2 = this;
                if (!c14340hK2.LJ) {
                    DataChannel dataChannel3 = DataChannel.this;
                    long j = ((C33511Tf) ListProtector.get(c14340hK2.LIZLLL, i)).LJLILLLLZI;
                    String tab = ((C33511Tf) ListProtector.get(this.LIZLLL, i)).LJLIL;
                    o.LJIIIZ(tab, "tab");
                    BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_tab_click");
                    LIZ.LJIILLIIL(dataChannel3);
                    LIZ.LJIJJ(Long.valueOf(j), "collection_id");
                    LIZ.LJIJJ(tab, "tab");
                    LIZ.LJJIIJZLJL();
                }
                this.LJ = false;
            }

            @Override // X.C0KN
            public final void LIZJ(C0KT c0kt) {
                this.getClass();
                C14340hK.LIZIZ(c0kt);
            }
        });
    }
}
