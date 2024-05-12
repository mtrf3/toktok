package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import java.util.HashSet;

/* loaded from: classes14.dex */
public final class TVD extends TVG {
    public static final C62822Ol8 LJJI = C221108m2.LIZIZ(TVF.LJLIL);
    public boolean LIZ;
    public int LIZIZ;
    public TU2 LIZJ;
    public boolean LJ;
    public String LJFF;
    public boolean LJII;
    public boolean LJIIIZ;
    public volatile MultiLiveAnchorPanelSettings LJIIJ;
    public int LJIIJJI;
    public int LJIILIIL;
    public InterfaceC74605TPt LJIILL;
    public int LJIILLIIL;
    public long LJIJ;
    public long LJIJI;
    public String LJIJJ;
    public String LJJ;
    public long LIZLLL = System.currentTimeMillis();
    public final HashSet<String> LJI = new HashSet<>();
    public boolean LJIIIIZZ = true;
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(TVE.LJLIL);
    public EnumC74778TWk LJIILJJIL = EnumC74778TWk.FLOATING;
    public int LJIIZILJ = -1;
    public int LJIJJLI = -1;
    public final HashSet<Long> LJIL = new HashSet<>();

    public final String LIZ() {
        int i = this.LJIJJLI;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return LiveGiftNewGifterBadgeSetting.DEFAULT;
                }
            } else {
                return "audio";
            }
        }
        return "video";
    }

    public final void LIZJ(long j) {
        int LIZIZ = TTV.LIZIZ(j);
        this.LJIIZILJ = LIZIZ;
        this.LJIJ = LIZIZ;
        if (LIZIZ != -1 && LIZIZ != 0) {
            this.LJIJJLI = LIZIZ;
        }
    }
}
