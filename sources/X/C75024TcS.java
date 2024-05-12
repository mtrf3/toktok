package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TcS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75024TcS implements InterfaceC28471BFj<Integer> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public View LJLIL;
    public C2A7 LJLILLLLZI;
    public DialogC77438UaI LJLJI;
    public DataChannel LJLJJI;
    public IPJ LJLJJL;
    public Context LJLJJLL;
    public C73318Sq2 LJLJL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJLJ;
    public final C31657Cbd LJLJLLL = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");

    static {
        TBT tbt = new TBT(C75024TcS.class, "dataHolder", "getDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
    }

    public final MultiGuestDataHolder LIZ() {
        return (MultiGuestDataHolder) this.LJLJLLL.LIZ(this, LJLL[0]);
    }

    public C75024TcS() {
        C75559Tl5.LIZIZ.LIZLLL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        if (C74776TWi.LJIILJJIL()) {
            C31811Ce7.LIZLLL("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToNoPermission");
            C29306Beo.LJI(this.LJLIL);
            C29306Beo.LJI(this.LJLILLLLZI);
            return;
        }
        if (C75027TcV.LIZ()) {
            C31811Ce7.LIZLLL("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToCancelReverse");
            C29306Beo.LJJLJLI(this.LJLIL);
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            C2A7 c2a7 = this.LJLILLLLZI;
            if (c2a7 != null) {
                c2a7.setText(R.string.khp);
            }
            C2A7 c2a72 = this.LJLILLLLZI;
            if (c2a72 != null) {
                c2a72.LJJLL(R.style.a3a);
                return;
            }
            return;
        }
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num == null) {
            return;
        }
        if (num.intValue() == -1 || num.intValue() == 0) {
            C31811Ce7.LIZLLL("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToIdle");
            C29306Beo.LJJLJLI(this.LJLIL);
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            C2A7 c2a73 = this.LJLILLLLZI;
            if (c2a73 != null) {
                c2a73.setText(R.string.nxv);
            }
            C2A7 c2a74 = this.LJLILLLLZI;
            if (c2a74 == null) {
                return;
            }
            c2a74.LJJLL(R.style.a2z);
            return;
        }
        if (num.intValue() == 1) {
            C31811Ce7.LIZLLL("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToWaiting");
            C29306Beo.LJJLJLI(this.LJLIL);
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            C2A7 c2a75 = this.LJLILLLLZI;
            if (c2a75 != null) {
                c2a75.setText(R.string.jun);
            }
            C2A7 c2a76 = this.LJLILLLLZI;
            if (c2a76 == null) {
                return;
            }
            c2a76.LJJLL(R.style.a3a);
            return;
        }
        if (num.intValue() != 2) {
            return;
        }
        C31811Ce7.LIZLLL("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToOnline");
        C29306Beo.LJI(this.LJLIL);
        C29306Beo.LJI(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC28471BFj
    public final void onChanged(Integer num) {
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "onChanged");
        LIZJ();
    }

    public final void LIZIZ(long j, String str, boolean z) {
        long currentTimeMillis;
        String str2;
        EnumC74778TWk enumC74778TWk;
        MultiGuestDataHolder LIZ;
        MultiGuestDataHolder LIZ2 = LIZ();
        if (LIZ2 != null) {
            currentTimeMillis = LIZ2.LIZ;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        if (z) {
            MultiGuestDataHolder LIZ3 = LIZ();
            if (LIZ3 != null) {
                currentTimeMillis = LIZ3.LIZIZ;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            str2 = "reservation";
        } else {
            str2 = "apply";
        }
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        } else {
            MultiGuestDataHolder LIZ4 = LIZ();
            if (LIZ4 != null) {
                enumC74778TWk = LIZ4.LJJIIZ;
            } else {
                enumC74778TWk = null;
            }
        }
        C75457TjR.LJIJ(enumC74778TWk, str, System.currentTimeMillis() - currentTimeMillis, j, str2, null, 992);
        if (!o.LJ(str, "click") || (LIZ = LIZ()) == null) {
            return;
        }
        LIZ.LIZ = System.currentTimeMillis();
    }
}
