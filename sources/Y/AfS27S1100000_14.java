package Y;

import X.C44329HaX;
import X.C61328O5c;
import X.C73849Syb;
import X.H7B;
import X.ID0;
import X.InterfaceC64592gB;
import X.JBR;
import X.ORZ;
import X.V3N;
import X.WYJ;
import X.WYK;
import X.WYM;
import X.WYN;
import X.X1D;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendStickerResponse;

/* loaded from: classes15.dex */
public class AfS27S1100000_14 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS27S1100000_14 afS27S1100000_14, Object obj) {
        Effect effect = (Effect) ORZ.LJLLLL(((RecommendStickerResponse) obj).recommendStickerList);
        if (effect != null) {
            ((WYM) afS27S1100000_14.l1).getClass();
            if (!ID0.LJII(effect) && !ID0.LJIIJJI(effect) && !V3N.LJIILLIIL(effect) && !C44329HaX.LIZ(effect) && !V3N.LJJII(effect) && !V3N.LJJI(effect)) {
                ((WYM) afS27S1100000_14.l1).LIZIZ.onNext(new WYJ(effect));
                return;
            }
        }
        C73849Syb<WYN> c73849Syb = ((WYM) afS27S1100000_14.l1).LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Id ");
        c73849Syb.onNext(new WYK(new Throwable(JBR.LJFF(LIZ, afS27S1100000_14.s0, " music can't find a sticker to recommend", LIZ))));
    }

    public static final void accept$1(AfS27S1100000_14 afS27S1100000_14, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Id ");
        Throwable th = new Throwable(C61328O5c.LIZLLL(LIZ, afS27S1100000_14.s0, " music recommend fail response ", (Throwable) obj, LIZ));
        H7B.LIZLLL(th);
        ((WYM) afS27S1100000_14.l1).LIZIZ.onNext(new WYK(th));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS27S1100000_14(X.WYM r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS27S1100000_14.<init>(X.WYM, java.lang.String, int):void");
    }
}
