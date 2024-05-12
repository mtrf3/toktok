package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1547165j;
import X.C76800UCe;
import X.C82454WXq;
import X.C83146WkA;
import X.I4A;
import X.InterfaceC65784Pro;
import X.WYW;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public class AqS69S0110000_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS69S0110000_14 aqS69S0110000_14) {
        if (!aqS69S0110000_14.z1) {
            ViewGroup viewGroup = ((C82454WXq) aqS69S0110000_14.l0).LJLJJLL;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                C1547165j c1547165j = ((C82454WXq) aqS69S0110000_14.l0).LJLJJI;
                if (c1547165j != null) {
                    c1547165j.setVisibility(8);
                    ViewGroup viewGroup2 = ((C82454WXq) aqS69S0110000_14.l0).LJLJJLL;
                    if (viewGroup2 != null) {
                        viewGroup2.setAlpha(1.0f);
                        C1547165j c1547165j2 = ((C82454WXq) aqS69S0110000_14.l0).LJLJJI;
                        if (c1547165j2 != null) {
                            c1547165j2.setAlpha(1.0f);
                            ((C82454WXq) aqS69S0110000_14.l0).getUiActions().LJLJJL.invoke();
                        } else {
                            o.LJIJI("innerBorder");
                            throw null;
                        }
                    } else {
                        o.LJIJI("placeholderLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("innerBorder");
                    throw null;
                }
            } else {
                o.LJIJI("placeholderLayout");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS69S0110000_14 aqS69S0110000_14) {
        return new I4A(((WYW) aqS69S0110000_14.l0).getDiContainer(), ((WYW) aqS69S0110000_14.l0).getStickerApiComponent(), ((WYW) aqS69S0110000_14.l0).getShortVideoContext(), true, !aqS69S0110000_14.z1, true, null, true);
    }

    public static final Object invoke$2(AqS69S0110000_14 aqS69S0110000_14) {
        if (aqS69S0110000_14.z1) {
            ((C83146WkA) aqS69S0110000_14.l0).LJIILIIL.setValue(0);
        } else {
            ((C83146WkA) aqS69S0110000_14.l0).LJIILIIL.setValue(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS69S0110000_14 aqS69S0110000_14) {
        if (aqS69S0110000_14.z1) {
            FavoriteSticker favoriteSticker = (FavoriteSticker) aqS69S0110000_14.l0;
            favoriteSticker.LJLLLLLL.setImageDrawable(favoriteSticker.LJLILLLLZI);
            FavoriteSticker favoriteSticker2 = (FavoriteSticker) aqS69S0110000_14.l0;
            favoriteSticker2.LJLJJL.setText(favoriteSticker2.LJLLI.getString(R.string.rnf));
        } else {
            FavoriteSticker favoriteSticker3 = (FavoriteSticker) aqS69S0110000_14.l0;
            favoriteSticker3.LJLLLLLL.setImageDrawable(favoriteSticker3.LJLJI);
            FavoriteSticker favoriteSticker4 = (FavoriteSticker) aqS69S0110000_14.l0;
            favoriteSticker4.LJLJJL.setText(favoriteSticker4.LJLLI.getString(R.string.rnd));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0110000_14(WYW wyw, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = wyw;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0110000_14(C83146WkA c83146WkA, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83146WkA;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0110000_14(FavoriteSticker favoriteSticker, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = favoriteSticker;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0110000_14(boolean z, C82454WXq c82454WXq, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c82454WXq;
    }
}
