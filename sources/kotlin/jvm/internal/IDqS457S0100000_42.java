package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC94370afu;
import X.C76800UCe;
import X.C94062aaw;
import X.InterfaceC65784Pro;
import X.InterfaceC88474Ynu;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.ArrayList;

/* loaded from: classes34.dex */
public class IDqS457S0100000_42 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS457S0100000_42(AbstractC94370afu abstractC94370afu, int i) {
        super(4);
        this.$t = i;
        this.l0 = abstractC94370afu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS457S0100000_42(BehaviourEditFragment behaviourEditFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = behaviourEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS457S0100000_42(MusicDspSheetViewModel musicDspSheetViewModel, int i) {
        super(4);
        this.$t = i;
        this.l0 = musicDspSheetViewModel;
    }

    public static final Object invoke$0(IDqS457S0100000_42 iDqS457S0100000_42, Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        C94062aaw view = (C94062aaw) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj4, "<anonymous parameter 3>");
        ((ArrayList) view.LJLILLLLZI).add(new IDqS15S0101000_42(iDqS457S0100000_42, intValue, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS457S0100000_42 iDqS457S0100000_42, Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        C94062aaw view = (C94062aaw) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj4, "<anonymous parameter 3>");
        ((ArrayList) view.LJLILLLLZI).add(new IDqS15S0101000_42(iDqS457S0100000_42, intValue, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS457S0100000_42 iDqS457S0100000_42, Object obj, Object obj2, Object obj3, Object obj4) {
        TT2DSPSongInfo dspSongInfo = (TT2DSPSongInfo) obj;
        DspPlaylist dspPlaylist = (DspPlaylist) obj2;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) obj3;
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) obj4;
        o.LJIIIZ(dspSongInfo, "dspSongInfo");
        o.LJIIIZ(dspPlaylist, "dspPlaylist");
        MusicDspSheetViewModel musicDspSheetViewModel = (MusicDspSheetViewModel) iDqS457S0100000_42.l0;
        if (!musicDspSheetViewModel.LJLILLLLZI) {
            musicDspSheetViewModel.LJLILLLLZI = true;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
            MusicDspSheetViewModel musicDspSheetViewModel2 = (MusicDspSheetViewModel) iDqS457S0100000_42.l0;
            musicDspSheetViewModel2.setState(new IDqS10S0400000_42(dspSongInfo, (TT2DSPSongInfo) dspPlaylist, (DspPlaylist) musicDspSheetViewModel2, (MusicDspSheetViewModel) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0));
        }
        return C76800UCe.LIZ;
    }
}
