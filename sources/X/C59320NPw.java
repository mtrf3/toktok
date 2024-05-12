package X;

import android.graphics.drawable.GradientDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

@InterfaceC55644Lse(service = {InterfaceC59245NMz.class})
/* renamed from: X.NPw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59320NPw implements InterfaceC59245NMz {
    public final InterfaceC59326NQc LJLIL;

    @Override // X.InterfaceC59245NMz
    public final void hide() {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        NQ2 LJFF = this.LJLIL.LJFF();
        if ((LJFF instanceof NQ1) && LJFF != null) {
            Aweme aweme = this.LJLIL.getAweme();
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                awemeRawAd2.setAnimationType(3);
            }
            LJFF.LJIIZILJ();
            Aweme aweme2 = this.LJLIL.getAweme();
            if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                return;
            }
            awemeRawAd.setAnimationType(-1);
        }
    }

    @Override // X.InterfaceC59245NMz
    public final void show() {
        AwemeRawAd awemeRawAd;
        int i;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        Aweme aweme = this.LJLIL.getAweme();
        if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
            awemeRawAd3.setShowButtonSeconds(0);
            awemeRawAd3.setShowButtonColorSeconds(0);
        }
        NQ2 LJFF = this.LJLIL.LJFF();
        if ((LJFF instanceof NQ1) && LJFF != null) {
            Aweme aweme2 = this.LJLIL.getAweme();
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null) {
                awemeRawAd2.setAnimationType(3);
            }
            LJFF.LIZJ(this.LJLIL.getAweme(), this.LJLIL.LLI());
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (L2J.LIZ()) {
                i = 5;
            } else {
                i = 2;
            }
            gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
            gradientDrawable.setColor(NPC.LIZIZ(this.LJLIL.getContext(), this.LJLIL.getAweme()));
            LJFF.setBackground(gradientDrawable);
            LJFF.LJIILJJIL();
        }
        Aweme aweme3 = this.LJLIL.getAweme();
        if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null) {
            return;
        }
        awemeRawAd.setAnimationType(-1);
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        for (Class<? extends InterfaceC41034G8o<? extends Object>> classKey : C59367NRr.LIZ(this)) {
            C59403NTb<InterfaceC41034G8o<? extends Object>> c59403NTb = C59367NRr.LIZIZ;
            c59403NTb.getClass();
            o.LJIIIZ(classKey, "classKey");
            c59403NTb.LIZJ.put(classKey, c59403NTb.LIZ.invoke(this));
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59326NQc L9() {
        return this.LJLIL;
    }

    public C59320NPw(NQC nqc) {
        this.LJLIL = nqc;
    }
}
