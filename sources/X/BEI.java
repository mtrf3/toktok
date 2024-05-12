package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BEI implements InterfaceC28456BEu {
    public final /* synthetic */ ModeratorListFragmentSheet LJLIL;

    @Override // X.InterfaceC28456BEu
    public final void Ti(long j, boolean z) {
    }

    @Override // X.InterfaceC28456BEu
    public final void Ze(Exception exc) {
    }

    public BEI(ModeratorListFragmentSheet moderatorListFragmentSheet) {
        this.LJLIL = moderatorListFragmentSheet;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Integer, O] */
    @Override // X.InterfaceC28456BEu
    public final void of(AdminUserBean adminUserBean, Exception exc) {
        String str;
        if (exc != null || adminUserBean == null) {
            C238749Yo c238749Yo = this.LJLIL.LLF;
            if (c238749Yo != null) {
                if (c238749Yo.getItemCount() == 0) {
                    ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZJ();
                }
                BPP.LIZJ(this.LJLIL.getContext(), exc);
                return;
            }
            o.LJIJI("adminAdapter");
            throw null;
        }
        if (!C79004UzY.LJJIFFI(adminUserBean.LIZ)) {
            ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZ();
            ModeratorListFragmentSheet moderatorListFragmentSheet = this.LJLIL;
            moderatorListFragmentSheet.LLD = adminUserBean.mMaxCount;
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(moderatorListFragmentSheet);
            if (LJIILIIL != null) {
                ((C32537Cpp) LJIILIIL.gv0(C28395BCl.class)).LIZ = Integer.valueOf(this.LJLIL.LLD);
            }
            C238749Yo c238749Yo2 = this.LJLIL.LLF;
            if (c238749Yo2 != null) {
                c238749Yo2.setData(adminUserBean.LIZ);
                ModeratorListFragmentSheet moderatorListFragmentSheet2 = this.LJLIL;
                List<BFC> list = adminUserBean.LIZ;
                o.LJIIIIZZ(list, "userBean.userList");
                moderatorListFragmentSheet2.getClass();
                DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(moderatorListFragmentSheet2);
                if (LJIILIIL2 != null) {
                    LJIILIIL2.rv0(ModeratorListChannel.class, list);
                }
                if (this.LJLIL.Ol() && this.LJLIL.Nl().size() > this.LJLIL.LLD) {
                    C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.H;
                    Boolean LIZJ = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ, "FIRST_TIME_SHOW_MAX_MODE…R_NUM_CHANGE_DIALOG.value");
                    if (LIZJ.booleanValue()) {
                        ModeratorListFragmentSheet moderatorListFragmentSheet3 = this.LJLIL;
                        int size = moderatorListFragmentSheet3.Nl().size();
                        C47071t1 c47071t1 = new C47071t1(moderatorListFragmentSheet3.getContext());
                        c47071t1.LJIILLIIL(R.string.mx6);
                        c47071t1.LJFF(R.string.mx5);
                        c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.njj), OAC.LJLIL);
                        c47071t1.LJIILL = false;
                        LiveDialog LIZ = c47071t1.LIZ();
                        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-8819573013417433783")).LIZ) {
                            LIZ.show();
                        }
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_moderator_page_first_popup");
                        LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(moderatorListFragmentSheet3));
                        if (C29306Beo.LJJI()) {
                            str = "live_take_page";
                        } else {
                            str = "live_take_detail";
                        }
                        C0JT.LIZJ(LIZ2, str, "event_page", size, "moderator_number");
                        c48459J0d.LIZ(Boolean.FALSE);
                    }
                }
                ModeratorListFragmentSheet moderatorListFragmentSheet4 = this.LJLIL;
                moderatorListFragmentSheet4.Pl(moderatorListFragmentSheet4.Nl().size());
                return;
            }
            o.LJIJI("adminAdapter");
            throw null;
        }
        ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZIZ();
        ModeratorListFragmentSheet moderatorListFragmentSheet5 = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        moderatorListFragmentSheet5.getClass();
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(moderatorListFragmentSheet5);
        if (LJIILIIL3 != null) {
            LJIILIIL3.rv0(ModeratorListChannel.class, arrayList);
        }
        this.LJLIL.Pl(0);
    }
}
