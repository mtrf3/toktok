package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZM implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ VerticalMusicView LJLIL;

    public XZM(VerticalMusicView verticalMusicView) {
        this.LJLIL = verticalMusicView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.LJLIL.LJLILLLLZI.V9()) {
            VerticalMusicView verticalMusicView = this.LJLIL;
            if (verticalMusicView.LLJJJJJIL) {
                verticalMusicView.LLJJJJJIL = false;
                C149795uJ c149795uJ = verticalMusicView.LJLLILLLL;
                if (c149795uJ != null) {
                    c149795uJ.LIZLLL = 1.0f;
                    verticalMusicView.LLJILJIL = false;
                    XZH xzh = verticalMusicView.LJLJL;
                    if (xzh != null) {
                        xzh.LJIILJJIL.Z9(1.0f);
                        return;
                    } else {
                        o.LJIJI("params");
                        throw null;
                    }
                }
                o.LJIJI("originSoundParams");
                throw null;
            }
        }
        VerticalMusicView verticalMusicView2 = this.LJLIL;
        C149795uJ c149795uJ2 = verticalMusicView2.LJLLILLLL;
        if (c149795uJ2 != null) {
            c149795uJ2.LIZIZ = z;
            if (z) {
                XZH xzh2 = verticalMusicView2.LJLJL;
                if (xzh2 != null) {
                    XZN xzn = xzh2.LJIILJJIL;
                    if (c149795uJ2.LIZLLL == 0.0f) {
                        c149795uJ2.LIZLLL = 1.0f;
                    }
                    xzn.Z9(c149795uJ2.LIZLLL);
                    if (verticalMusicView2.LJLILLLLZI.V9()) {
                        xzn.Q9();
                    }
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            } else {
                XZH xzh3 = verticalMusicView2.LJLJL;
                if (xzh3 != null) {
                    xzh3.LJIILJJIL.Z9(0.0f);
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            VerticalMusicView verticalMusicView3 = this.LJLIL;
            if (!verticalMusicView3.LLJILJIL) {
                XZH xzh4 = verticalMusicView3.LJLJL;
                if (xzh4 != null) {
                    xzh4.LJIILL.LIZLLL(z);
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            this.LJLIL.LLJILJIL = false;
            return;
        }
        o.LJIJI("originSoundParams");
        throw null;
    }
}
