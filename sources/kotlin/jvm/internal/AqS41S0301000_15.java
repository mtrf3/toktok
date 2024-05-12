package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C162476Zf;
import X.C26045AKb;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.XUQ;
import X.XW2;
import X.XW7;
import X.XZC;
import X.XZE;
import X.XZH;
import X.XZO;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class AqS41S0301000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS41S0301000_15 aqS41S0301000_15) {
        VerticalMusicView verticalMusicView = (VerticalMusicView) aqS41S0301000_15.l0;
        int i = aqS41S0301000_15.i3;
        MusicModel musicModel = (MusicModel) aqS41S0301000_15.l1;
        XW2 xw2 = (XW2) aqS41S0301000_15.l2;
        if (i == -10) {
            verticalMusicView.LJJJJ(musicModel, true);
        } else {
            verticalMusicView.LJJIIZI(i, musicModel, xw2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS41S0301000_15 aqS41S0301000_15) {
        XZC xzc;
        XZE xze = ((VerticalMusicView) aqS41S0301000_15.l0).LJLJI;
        if (xze != null) {
            C26045AKb c26045AKb = new C26045AKb(xze);
            c26045AKb.LJIIIIZZ(R.string.jsx);
            c26045AKb.LJIIJ();
        }
        XZH xzh = ((VerticalMusicView) aqS41S0301000_15.l0).LJLJL;
        if (xzh != null) {
            if (!xzh.LJIIL) {
                String stringValue = ((XW2) aqS41S0301000_15.l1).getStringValue();
                XZH xzh2 = ((VerticalMusicView) aqS41S0301000_15.l0).LJLJL;
                if (xzh2 != null) {
                    XZO xzo = xzh2.LJIILL;
                    MusicModel musicModel = (MusicModel) aqS41S0301000_15.l2;
                    int i = aqS41S0301000_15.i3;
                    if (i == -10) {
                        i = 0;
                    }
                    xzo.LJFF(i, musicModel, stringValue, null);
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            VerticalMusicView verticalMusicView = (VerticalMusicView) aqS41S0301000_15.l0;
            int i2 = XW7.LIZ[((XW2) aqS41S0301000_15.l1).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        xzc = ((VerticalMusicView) aqS41S0301000_15.l0).LLJJ;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    xzc = ((VerticalMusicView) aqS41S0301000_15.l0).LLJILJILJ;
                }
            } else {
                xzc = ((VerticalMusicView) aqS41S0301000_15.l0).LLJILLL;
            }
            verticalMusicView.LJIIIZ(xzc, true);
            return C76800UCe.LIZ;
        }
        o.LJIJI("params");
        throw null;
    }

    public static final Object invoke$2(AqS41S0301000_15 aqS41S0301000_15) {
        VerticalMusicView verticalMusicView = (VerticalMusicView) aqS41S0301000_15.l0;
        XUQ xuq = verticalMusicView.LLIZ;
        if (xuq != null) {
            ((MusicDownloadPlayHelper) xuq).LJLLI = true;
        }
        int i = aqS41S0301000_15.i3;
        MusicModel musicModel = (MusicModel) aqS41S0301000_15.l1;
        XW2 xw2 = (XW2) aqS41S0301000_15.l2;
        if (i == -10) {
            verticalMusicView.LJJJJ(musicModel, true);
        } else {
            verticalMusicView.LJJIIZI(i, musicModel, xw2);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS41S0301000_15(int r3, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4, X.XW2 r5, com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                case 1: goto L5;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r5
            r1.l2 = r4
            r1.i3 = r3
            r0 = 0
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r6
            r1.i3 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS41S0301000_15.<init>(int, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, X.XW2, com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView, int):void");
    }
}
