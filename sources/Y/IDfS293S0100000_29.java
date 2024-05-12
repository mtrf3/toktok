package Y;

import X.AbstractC91590Zx4;
import X.C61878OQg;
import X.C76800UCe;
import X.C91247ZrX;
import X.C91382Zti;
import X.C91391Ztr;
import X.C91495ZvX;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.InterfaceC91296ZsK;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.library.net.DSPCollectMusicResponse;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.favpage.FavPlayerViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.mainpage.MainPlayerViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioinfo.FollowViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.List;
import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDfS293S0100000_29 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            default:
                return;
        }
    }

    public IDfS293S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        boolean z;
        List it = (List) obj;
        if (it == null || it.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AbstractC91590Zx4 gv0 = ((BasePlayerViewModel) iDfS293S0100000_29.l0).gv0();
            o.LJIIIIZZ(it, "it");
            gv0.LJIILIIL(it);
            ((BasePlayerViewModel) iDfS293S0100000_29.l0).LJLJJLL.postValue(null);
        }
        ((BasePlayerViewModel) iDfS293S0100000_29.l0).LJLJL.setValue(null);
    }

    public static final void accept$1(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        ((BasePlayerViewModel) iDfS293S0100000_29.l0).LJLJL.setValue(null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("exception: ");
        LIZ.append(((Throwable) obj).getMessage());
        X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r2 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$10(Y.IDfS293S0100000_29 r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse r5 = (com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse) r5
            boolean r0 = X.C91432ZuW.LJLIL
            if (r0 == 0) goto L7
        L6:
            return
        L7:
            java.util.List r0 = r5.getDspList()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L44
            java.util.List r3 = r5.getDspList()
            X.YBM r0 = X.YBM.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.dsp.experiment.DspClipConfig r0 = X.YBM.LIZ()
            int r1 = r0.getDspClipShowStrategy()
            r0 = 6
            r2 = 1
            if (r1 != r0) goto L51
            java.util.Iterator r1 = r3.iterator()
        L2a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.dsp.common.model.DspStruct r0 = (com.ss.android.ugc.aweme.dsp.common.model.DspStruct) r0
            com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct r0 = r0.getDspMusic()
            boolean r0 = r0.getChorusOnly()
            if (r0 != 0) goto L2a
            r2 = 0
            goto L2a
        L42:
            if (r2 != 0) goto L51
        L44:
            r0 = 0
            X.C91237ZrN.LIZJ(r0)
            java.lang.Object r0 = r4.l0
            X.X8W r0 = (X.X8W) r0
            X.C91432ZuW.LIZJ(r0)
            goto L6
        L51:
            X.C91432ZuW.LIZLLL(r5)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS293S0100000_29.accept$10(Y.IDfS293S0100000_29, java.lang.Object):void");
    }

    public static final void accept$11(IDfS293S0100000_29 iDfS293S0100000_29, Object it) {
        ((FavPlayerViewModel) iDfS293S0100000_29.l0).LJLJI.setValue(Boolean.FALSE);
        ((FavPlayerViewModel) iDfS293S0100000_29.l0).LJLJJI.setValue(Boolean.TRUE);
        o.LJIIIIZZ(it, "it");
    }

    public static final void accept$12(IDfS293S0100000_29 iDfS293S0100000_29, Object it) {
        MutableLiveData<Boolean> mutableLiveData = ((MainPlayerViewModel) iDfS293S0100000_29.l0).LJLJI;
        Boolean bool = Boolean.TRUE;
        C91247ZrX.LIZ(mutableLiveData, bool);
        C91247ZrX.LIZ(((MainPlayerViewModel) iDfS293S0100000_29.l0).LJLJJI, bool);
        o.LJIIIIZZ(it, "it");
    }

    public static final void accept$2(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        ((C91382Zti) iDfS293S0100000_29.l0).LIZIZ = false;
    }

    public static final void accept$3(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        ((C91382Zti) iDfS293S0100000_29.l0).LIZIZ = false;
    }

    public static final void accept$4(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        ((C91391Ztr) iDfS293S0100000_29.l0).LIZIZ = false;
    }

    public static final void accept$5(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        ((C91391Ztr) iDfS293S0100000_29.l0).LIZIZ = false;
    }

    public static final void accept$6(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        boolean z;
        List it = (List) obj;
        if (it == null || it.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AbstractC91590Zx4 abstractC91590Zx4 = ((C91495ZvX) iDfS293S0100000_29.l0).LJLJI;
            o.LJIIIIZZ(it, "it");
            abstractC91590Zx4.LJIILIIL(it);
        }
        InterfaceC88472Yns<? super List<? extends InterfaceC91296ZsK>, C76800UCe> interfaceC88472Yns = ((C91495ZvX) iDfS293S0100000_29.l0).LJLJLJ;
        if (interfaceC88472Yns != null) {
            o.LJIIIIZZ(it, "it");
            interfaceC88472Yns.invoke(it);
        }
    }

    public static final void accept$7(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        InterfaceC88472Yns<? super List<? extends InterfaceC91296ZsK>, C76800UCe> interfaceC88472Yns = ((C91495ZvX) iDfS293S0100000_29.l0).LJLJLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(C61878OQg.INSTANCE);
        }
    }

    public static final void accept$8(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        ((FollowViewModel) iDfS293S0100000_29.l0).setState(new IDqS417S0100000_29((FollowStatus) obj, 23));
    }

    public static final void accept$9(IDfS293S0100000_29 iDfS293S0100000_29, Object obj) {
        DSPCollectMusicResponse dSPCollectMusicResponse = (DSPCollectMusicResponse) obj;
        if (dSPCollectMusicResponse.status_code == 0) {
            ((CollectViewModel) iDfS293S0100000_29.l0).setState(new IDqS417S0100000_29(dSPCollectMusicResponse, 25));
        }
    }
}
