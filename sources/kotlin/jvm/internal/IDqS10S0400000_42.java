package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C43I;
import X.C76800UCe;
import X.C93906aYQ;
import X.C93983aZf;
import X.C94952apI;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.K55;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes34.dex */
public class IDqS10S0400000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(IDqS10S0400000_42 iDqS10S0400000_42, Object obj) {
        C94952apI setState = (C94952apI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C94952apI.LIZ(setState, null, null, new C43I(new C93983aZf((TT2DSPSongInfo) iDqS10S0400000_42.l0, (DspPlaylist) iDqS10S0400000_42.l1, new IDqS179S0200000_42((MusicDspSheetViewModel) iDqS10S0400000_42.l2, (MusicDspSheetViewModel) iDqS10S0400000_42.l3, (InterfaceC65784Pro<C76800UCe>) 3))), null, null, 27);
    }

    public static final Object invoke$1(IDqS10S0400000_42 iDqS10S0400000_42, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.tsj, new IDqS31S0300000_42((C93906aYQ) iDqS10S0400000_42.l0, (C93906aYQ) iDqS10S0400000_42.l1, (HashMap<String, String>) iDqS10S0400000_42.l2, (ActivityC45651qj) 1));
        actionGroup.LJIIIIZZ(R.string.tsi, new IDqS31S0300000_42((C93906aYQ) iDqS10S0400000_42.l0, (C93906aYQ) iDqS10S0400000_42.l1, (HashMap<String, String>) iDqS10S0400000_42.l3, (K55) 2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS10S0400000_42(C93906aYQ c93906aYQ, C93906aYQ c93906aYQ2, HashMap<String, String> hashMap, ActivityC45651qj activityC45651qj, K55 k55) {
        super(1);
        this.$t = k55;
        this.l0 = c93906aYQ;
        this.l1 = c93906aYQ2;
        this.l2 = hashMap;
        this.l3 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS10S0400000_42(TT2DSPSongInfo tT2DSPSongInfo, TT2DSPSongInfo tT2DSPSongInfo2, DspPlaylist dspPlaylist, MusicDspSheetViewModel musicDspSheetViewModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = tT2DSPSongInfo;
        this.l1 = tT2DSPSongInfo2;
        this.l2 = dspPlaylist;
        this.l3 = musicDspSheetViewModel;
    }
}
