package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0JW;
import X.C0JX;
import X.C15380j0;
import X.C47071t1;
import X.C47121t6;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import Y.IDcS169S0100000;
import android.content.Context;
import com.bytedance.android.live.broadcast.mirror.GameCastWiredFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class IDqS19S0101000 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS19S0101000 iDqS19S0101000) {
        String LJIILJJIL;
        if (((GameCastWiredFragment) iDqS19S0101000.l0).isAdded() && ((GameCastWiredFragment) iDqS19S0101000.l0).getContext() != null) {
            C0JX.LJIIIIZZ(((GameCastWiredFragment) iDqS19S0101000.l0).getContext());
            GameCastWiredFragment gameCastWiredFragment = (GameCastWiredFragment) iDqS19S0101000.l0;
            gameCastWiredFragment.LJLILLLLZI = false;
            C47121t6 c47121t6 = gameCastWiredFragment.LJLJL;
            if (c47121t6 != null) {
                C0JW c0jw = C0JW.LIZ;
                Context context = gameCastWiredFragment.getContext();
                int i = iDqS19S0101000.i1;
                c0jw.getClass();
                if (context == null) {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.la7);
                } else if (i != 4001 && i != 14004001) {
                    switch (i) {
                        case 12300001:
                            LJIILJJIL = C15380j0.LJIILJJIL(R.string.la5);
                            break;
                        case 12300002:
                        case 12300003:
                        case 12300004:
                        case 12300005:
                        case 12300006:
                            LJIILJJIL = C15380j0.LJIILJJIL(R.string.la4);
                            break;
                        default:
                            LJIILJJIL = C15380j0.LJIILJJIL(R.string.la7);
                            break;
                    }
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.la6);
                }
                c47121t6.setText(LJIILJJIL);
            }
            ((GameCastWiredFragment) iDqS19S0101000.l0).vl();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS19S0101000 iDqS19S0101000) {
        String LJIILJJIL;
        String LJIILJJIL2;
        if (((GameCastWiredFragment) iDqS19S0101000.l0).isAdded() && ((GameCastWiredFragment) iDqS19S0101000.l0).getContext() != null) {
            GameCastWiredFragment gameCastWiredFragment = (GameCastWiredFragment) iDqS19S0101000.l0;
            Context context = gameCastWiredFragment.getContext();
            int i = iDqS19S0101000.i1;
            if (!gameCastWiredFragment.LJLIL) {
                C0JW c0jw = C0JW.LIZ;
                IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(gameCastWiredFragment, 41);
                c0jw.getClass();
                if (context != null) {
                    if (i != 401) {
                        if (i != 406) {
                            LJIILJJIL = C15380j0.LJIILJJIL(R.string.la2);
                            LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.la1);
                        } else {
                            LJIILJJIL = C15380j0.LJIILJJIL(R.string.l_w);
                            LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.l_v);
                        }
                    } else {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.la0);
                        LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.l_z);
                    }
                    C47071t1 c47071t1 = new C47071t1(context);
                    c47071t1.LIZJ = LJIILJJIL;
                    c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.l_r), new IDcS169S0100000(iDqS420S0100000, 12));
                    c47071t1.LJII(LJIILJJIL2);
                    C0JW.LIZIZ(c47071t1.LIZ());
                }
                gameCastWiredFragment.LJLIL = true;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS19S0101000(GameCastWiredFragment gameCastWiredFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = gameCastWiredFragment;
        this.i1 = i;
    }
}
