package lh3;

import X.C40197Fq5;
import X.VNU;
import com.bytedance.android.live.gift.GiftService;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.LynxDragListUIView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDaS84S0000000_6 extends C40197Fq5 {
    public final int $t;

    @Override // X.C40197Fq5
    public final LynxUI<?> LIZLLL(VNU vnu) {
        switch (this.$t) {
            case 0:
                return LIZLLL$0(this, vnu);
            case 1:
                return LIZLLL$1(this, vnu);
            default:
                return super.LIZLLL(vnu);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDaS84S0000000_6(int r5) {
        /*
            r4 = this;
            r4.$t = r5
            switch(r5) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r4
            r3 = 0
            java.lang.String r2 = "list"
            r1 = r3
        La:
            r0.<init>(r2, r3, r1)
            return
        Le:
            r0 = r4
            r3 = 0
            java.lang.String r2 = "x-audio-livecore"
            r1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: lh3.IDaS84S0000000_6.<init>(int):void");
    }

    public static final LynxUI LIZLLL$0(IDaS84S0000000_6 iDaS84S0000000_6, VNU context) {
        o.LJIIIZ(context, "context");
        return GiftService.LJLILLLLZI.getLynxAudioLiveView(context);
    }

    public static final LynxUI LIZLLL$1(IDaS84S0000000_6 iDaS84S0000000_6, VNU vnu) {
        return new LynxDragListUIView(vnu);
    }
}
