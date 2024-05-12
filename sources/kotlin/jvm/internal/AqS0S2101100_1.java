package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C184237Kx;
import X.C184247Ky;
import X.C184257Kz;
import X.C234899Jt;
import X.C4LX;
import X.C76800UCe;
import X.C7L0;
import X.C7L1;
import X.C88023cs;
import X.C88963eO;
import X.InterfaceC88472Yns;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.fragment.StickerSetDetailFragment;

/* loaded from: classes2.dex */
public class AqS0S2101100_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public long j4;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS0S2101100_1 aqS0S2101100_1, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        StickerSetDetailFragment stickerSetDetailFragment = (StickerSetDetailFragment) aqS0S2101100_1.l2;
        assemble.mv0(stickerSetDetailFragment, new AqS0S2101100_1(aqS0S2101100_1.i3, aqS0S2101100_1.j4, stickerSetDetailFragment, aqS0S2101100_1.s0, aqS0S2101100_1.s1, 1));
        if (C88963eO.LJFF()) {
            assemble.wv0((StickerSetDetailFragment) aqS0S2101100_1.l2, C184237Kx.LJLIL);
            assemble.wv0((StickerSetDetailFragment) aqS0S2101100_1.l2, C184247Ky.LJLIL);
        } else {
            assemble.wv0((StickerSetDetailFragment) aqS0S2101100_1.l2, C184257Kz.LJLIL);
        }
        assemble.wv0((StickerSetDetailFragment) aqS0S2101100_1.l2, C7L0.LJLIL);
        assemble.wv0((StickerSetDetailFragment) aqS0S2101100_1.l2, C7L1.LJLIL);
        assemble.wv0((StickerSetDetailFragment) aqS0S2101100_1.l2, C234899Jt.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2101100_1 aqS0S2101100_1, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        long j = aqS0S2101100_1.j4;
        hierarchyData.LIZ = new C88023cs(aqS0S2101100_1.i3, aqS0S2101100_1.s0, aqS0S2101100_1.s1, ((StickerSetDetailFragment) aqS0S2101100_1.l2).LJLJJLL, j);
        hierarchyData.LIZIZ = "sticker_set_detail_config";
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS0S2101100_1(int r3, long r4, com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.fragment.StickerSetDetailFragment r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            switch(r9) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.j4 = r4
            r1.i3 = r3
            r1.s0 = r7
            r1.l2 = r6
            r1.s1 = r8
            r0 = 1
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.l2 = r6
            r1.j4 = r4
            r1.i3 = r3
            r1.s0 = r7
            r1.s1 = r8
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS0S2101100_1.<init>(int, long, com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.fragment.StickerSetDetailFragment, java.lang.String, java.lang.String, int):void");
    }
}
