package Y;

import X.C31012CFc;
import X.C74824TYe;
import X.C75297Tgr;
import X.EnumC75310Th4;
import X.InterfaceC64592gB;
import X.J7I;
import X.OSZ;
import X.U7F;
import X.U7W;
import X.UA9;
import X.UC0;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS1S1201100_13 implements InterfaceC64592gB {
    public final int $t;
    public int i3;
    public long j4;
    public Object l1;
    public Object l2;
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

    public static final void accept$0(AfS1S1201100_13 afS1S1201100_13, Object obj) {
        long LIZIZ = C31012CFc.LIZIZ() - afS1S1201100_13.j4;
        String str = ((BaseResponse) obj).LIZIZ;
        o.LJIIIIZZ(str, "it.logId");
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "update_setting", str, afS1S1201100_13.s0);
        MultiLiveAnchorSettingDialogContract$AbsView multiLiveAnchorSettingDialogContract$AbsView = (MultiLiveAnchorSettingDialogContract$AbsView) ((C75297Tgr) afS1S1201100_13.l1).LJLILLLLZI;
        if (multiLiveAnchorSettingDialogContract$AbsView != null) {
            multiLiveAnchorSettingDialogContract$AbsView.wl(afS1S1201100_13.i3, (EnumC75310Th4) afS1S1201100_13.l2);
        }
    }

    public static final void accept$1(AfS1S1201100_13 afS1S1201100_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        String str2 = "";
        if (LJIJ == null) {
            LJIJ = "";
        }
        UA9.LJJIIZ(afS1S1201100_13.i3, afS1S1201100_13.j4, C31012CFc.LIZIZ(), (U7F) afS1S1201100_13.l1, afS1S1201100_13.s0, null, LJIJ, LJIILL, false);
        U7F u7f = (U7F) afS1S1201100_13.l1;
        U7W u7w = u7f.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS1S1201100_13.j4;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 != null) {
            str2 = LJIJ2;
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        if (((PermitApplyData) afS1S1201100_13.l2).getPermitStatus() == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7f, "permit_apply", LIZIZ, str2, LJIILJJIL, new OSZ("permit_status", str), false, afS1S1201100_13.s0, 64);
    }

    public AfS1S1201100_13(long j, String str, Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.j4 = j;
        this.s0 = str;
        this.l1 = obj;
        this.i3 = i;
        this.l2 = obj2;
    }
}
