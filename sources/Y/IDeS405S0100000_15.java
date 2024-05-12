package Y;

import X.C164906da;
import X.EnumC61598OFm;
import X.InterfaceC61107NyZ;
import X.UF2;
import X.Y5K;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment;
import ij2.a;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDeS405S0100000_15 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(IDeS405S0100000_15 iDeS405S0100000_15) {
    }

    public static final void LIZ$1(IDeS405S0100000_15 iDeS405S0100000_15) {
    }

    public static final void LIZ$2(IDeS405S0100000_15 iDeS405S0100000_15) {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c164906daArr);
                return;
            case 1:
                LIZIZ$1(this, c164906daArr);
                return;
            case 2:
                LIZIZ$2(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public IDeS405S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDeS405S0100000_15 iDeS405S0100000_15, C164906da... c164906daArr) {
        if (c164906daArr.length != 0 && c164906daArr[0].LIZIZ == EnumC61598OFm.GRANTED) {
            ((LocalMusicFragment) iDeS405S0100000_15.l0).Ll();
        }
    }

    public static final void LIZIZ$1(IDeS405S0100000_15 iDeS405S0100000_15, C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            int i = UF2.LIZIZ[c164906da.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        a aVar = a.LJIJ;
                        long currentTimeMillis = System.currentTimeMillis();
                        aVar.getClass();
                        a.LJIIJJI(currentTimeMillis, "cancel", "ocr_camera_request_permission");
                        ((Y5K) iDeS405S0100000_15.l0).LLIZLLLIL();
                        ((Y5K) iDeS405S0100000_15.l0).LJLLL = true;
                    }
                } else {
                    a aVar2 = a.LJIJ;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    aVar2.getClass();
                    a.LJIIJJI(currentTimeMillis2, "cancel", "ocr_camera_request_permission");
                    ((Y5K) iDeS405S0100000_15.l0).LLIZLLLIL();
                    ((Y5K) iDeS405S0100000_15.l0).LJLLL = true;
                }
            } else {
                a aVar3 = a.LJIJ;
                long currentTimeMillis3 = System.currentTimeMillis();
                aVar3.getClass();
                a.LJIIJJI(currentTimeMillis3, "ok", "ocr_camera_request_permission");
                ((Y5K) iDeS405S0100000_15.l0).LLIIIZ().LIZJ();
                ((Y5K) iDeS405S0100000_15.l0).LJLLL = false;
            }
        }
    }

    public static final void LIZIZ$2(IDeS405S0100000_15 iDeS405S0100000_15, C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            int i = UF2.LIZ[c164906da.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        a aVar = a.LJIJ;
                        long currentTimeMillis = System.currentTimeMillis();
                        aVar.getClass();
                        a.LJIIJJI(currentTimeMillis, "cancel", "ocr_album_request_permission");
                        ((Y5K) iDeS405S0100000_15.l0).LLJILLL();
                    }
                } else {
                    a aVar2 = a.LJIJ;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    aVar2.getClass();
                    a.LJIIJJI(currentTimeMillis2, "cancel", "ocr_album_request_permission");
                    ((Y5K) iDeS405S0100000_15.l0).LLJILLL();
                }
            } else {
                a aVar3 = a.LJIJ;
                long currentTimeMillis3 = System.currentTimeMillis();
                aVar3.getClass();
                a.LJIIJJI(currentTimeMillis3, "ok", "ocr_album_request_permission");
                ((Y5K) iDeS405S0100000_15.l0).LLII();
            }
        }
    }
}
