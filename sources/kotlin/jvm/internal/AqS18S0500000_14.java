package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0I6;
import X.C34071DYt;
import X.C34072DYu;
import X.C74275TDb;
import X.C76732zl;
import X.C76800UCe;
import X.C81975WFf;
import X.C82064WIq;
import X.C82222WOs;
import X.C82622Wbi;
import X.InterfaceC65784Pro;
import X.InterfaceC73033SlR;
import X.InterfaceC82199WNv;
import X.InterfaceC83144Wk8;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.SY9;
import X.V16;
import X.WID;
import X.WMH;
import X.WSY;
import Y.AObjectS42S0400000_14;
import android.app.Activity;
import android.graphics.drawable.LayerDrawable;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public class AqS18S0500000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AqS18S0500000_14 aqS18S0500000_14, Object obj) {
        aqS18S0500000_14.invoke$0((C0I6) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(InterfaceC82199WNv it) {
        o.LJIIIZ(it, "it");
        InterfaceC82199WNv interfaceC82199WNv = it;
        ShortVideoContext shortVideoContext = ((C82064WIq) this.l0).LJ;
        if (shortVideoContext != null) {
            if (V16.LJJLIIIJJI(shortVideoContext)) {
                ShortVideoContext shortVideoContext2 = ((C82064WIq) this.l0).LJ;
                if (shortVideoContext2 != null) {
                    String musicPath = shortVideoContext2.getMusicPath();
                    if (musicPath != null && musicPath.length() > 0) {
                        ((C76732zl) this.l1).element = 4;
                        C81975WFf LJIILL = ((WID) this.l2).LJIILL();
                        LJIILL.LJLJI = R.raw.icon_mic_slash_fill;
                        LJIILL.LJLJJI = R.attr.e7;
                        LJIILL.LJLJLLL = false;
                        C82064WIq c82064WIq = (C82064WIq) this.l0;
                        C82622Wbi c82622Wbi = (C82622Wbi) this.l3;
                        c82064WIq.getClass();
                        C82064WIq.LJII(c82622Wbi, LJIILL);
                    }
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            }
            interfaceC82199WNv.lD().LIZLLL((LifecycleOwner) this.l4, new AObjectS42S0400000_14((C82064WIq) this.l0, (C76732zl) this.l1, (C82622Wbi) this.l3, (WID) this.l2, 4));
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public static final Object invoke$0(AqS18S0500000_14 aqS18S0500000_14, Object obj) {
        C82222WOs it = (C82222WOs) obj;
        o.LJIIIZ(it, "it");
        Activity activity = ((WMH) aqS18S0500000_14.l0).mActivity;
        if (activity != null) {
            SY9 sy9 = new SY9(activity, R.raw.icon_2pt_beauty_beauty);
            sy9.LJ(-1);
            sy9.LJI((int) C74275TDb.LIZIZ(activity, 32.0f));
            sy9.LIZLLL((int) C74275TDb.LIZIZ(activity, 32.0f));
            LayerDrawable layerDrawable = new LayerDrawable(new SY9[]{sy9, new SY9(activity, R.raw.icon_color_right_bottom_checkbox)});
            it.LJIIJ = new OSZ<>(Integer.valueOf(R.string.c50), sy9);
            it.LJIIIZ = new OSZ<>(Integer.valueOf(R.string.c51), layerDrawable);
        }
        it.LJII = C34072DYu.LIZ;
        it.LJIIIIZZ = C34071DYt.LIZ;
        WSY wsy = (WSY) aqS18S0500000_14.l1;
        o.LJIIIZ(wsy, "<set-?>");
        it.LIZIZ = wsy;
        it.LIZJ = (InterfaceC73033SlR) aqS18S0500000_14.l2;
        it.LIZLLL = (InterfaceC65784Pro) aqS18S0500000_14.l3;
        it.LJ = (InterfaceC88472Yns) aqS18S0500000_14.l4;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0500000_14(C82064WIq c82064WIq, C76732zl c76732zl, WID wid, C82622Wbi c82622Wbi, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = c82064WIq;
        this.l1 = c76732zl;
        this.l2 = wid;
        this.l3 = c82622Wbi;
        this.l4 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS18S0500000_14(WMH wmh, WMH wmh2, WSY wsy, InterfaceC73033SlR interfaceC73033SlR, InterfaceC65784Pro<Integer> interfaceC65784Pro, InterfaceC88472Yns<? super InterfaceC83144Wk8, ? extends InterfaceC83144Wk8> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = wmh;
        this.l1 = wmh2;
        this.l2 = wsy;
        this.l3 = interfaceC73033SlR;
        this.l4 = interfaceC65784Pro;
    }
}
