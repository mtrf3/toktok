package X;

import Y.ACListenerS25S0100000_5;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.moderator.ModeratorListFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BEH implements InterfaceC28456BEu {
    public final /* synthetic */ ModeratorListFragment LJLIL;

    @Override // X.InterfaceC28456BEu
    public final void Ti(long j, boolean z) {
    }

    @Override // X.InterfaceC28456BEu
    public final void Ze(Exception exc) {
    }

    public BEH(ModeratorListFragment moderatorListFragment) {
        this.LJLIL = moderatorListFragment;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Integer, O] */
    @Override // X.InterfaceC28456BEu
    public final void of(AdminUserBean adminUserBean, Exception exc) {
        String str;
        if (this.LJLIL.isViewValid()) {
            if (exc != null || adminUserBean == null) {
                C238749Yo c238749Yo = this.LJLIL.LJLJI;
                if (c238749Yo != null) {
                    if (c238749Yo.getItemCount() == 0) {
                        ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZJ();
                    }
                    BPP.LIZJ(this.LJLIL.getContext(), exc);
                    return;
                }
                o.LJIJI("mAdminAdapter");
                throw null;
            }
            if (!C79004UzY.LJJIFFI(adminUserBean.LIZ)) {
                ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZ();
                ModeratorListFragment moderatorListFragment = this.LJLIL;
                moderatorListFragment.LJLIL = adminUserBean.mMaxCount;
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(moderatorListFragment);
                if (LJIILIIL != null) {
                    ((C32537Cpp) LJIILIIL.gv0(C28395BCl.class)).LIZ = Integer.valueOf(this.LJLIL.LJLIL);
                }
                C238749Yo c238749Yo2 = this.LJLIL.LJLJI;
                if (c238749Yo2 != null) {
                    c238749Yo2.setData(adminUserBean.LIZ);
                    ModeratorListFragment moderatorListFragment2 = this.LJLIL;
                    List<BFC> list = adminUserBean.LIZ;
                    o.LJIIIIZZ(list, "userBean.userList");
                    moderatorListFragment2.getClass();
                    DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(moderatorListFragment2);
                    if (LJIILIIL2 != null) {
                        LJIILIIL2.rv0(ModeratorListChannel.class, list);
                    }
                    if (this.LJLIL.wl()) {
                        ModeratorListFragment moderatorListFragment3 = this.LJLIL;
                        moderatorListFragment3.getClass();
                        if (C29306Beo.LJJII(C51029K0z.LJIILIIL(moderatorListFragment3))) {
                            C29306Beo.LJIIIZ(moderatorListFragment3._$_findCachedViewById(R.id.aun));
                        } else {
                            C29306Beo.LJJLJLI(moderatorListFragment3._$_findCachedViewById(R.id.aun));
                        }
                        C16880lQ.LJIILJJIL((FrameLayout) moderatorListFragment3._$_findCachedViewById(R.id.aun), new ACListenerS25S0100000_5(moderatorListFragment3, 335));
                        if (this.LJLIL.xl().size() > this.LJLIL.LJLIL) {
                            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.H;
                            Boolean LIZJ = c48459J0d.LIZJ();
                            o.LJIIIIZZ(LIZJ, "FIRST_TIME_SHOW_MAX_MODE…R_NUM_CHANGE_DIALOG.value");
                            if (LIZJ.booleanValue()) {
                                ModeratorListFragment moderatorListFragment4 = this.LJLIL;
                                int size = moderatorListFragment4.xl().size();
                                C47071t1 c47071t1 = new C47071t1(moderatorListFragment4.getContext());
                                c47071t1.LJIILLIIL(R.string.mx6);
                                c47071t1.LJFF(R.string.mx5);
                                c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.njj), C78685UuP.LJLIL);
                                c47071t1.LJIILL = false;
                                LiveDialog LIZ = c47071t1.LIZ();
                                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-2276607373124294218")).LIZ) {
                                    LIZ.show();
                                }
                                BZI LIZ2 = C28787BRn.LIZ("livesdk_moderator_page_first_popup");
                                LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(moderatorListFragment4));
                                if (C29306Beo.LJJI()) {
                                    str = "live_take_page";
                                } else {
                                    str = "live_take_detail";
                                }
                                C0JT.LIZJ(LIZ2, str, "event_page", size, "moderator_number");
                                c48459J0d.LIZ(Boolean.FALSE);
                            }
                        }
                    }
                    ModeratorListFragment moderatorListFragment5 = this.LJLIL;
                    moderatorListFragment5.Al(moderatorListFragment5.xl().size());
                    return;
                }
                o.LJIJI("mAdminAdapter");
                throw null;
            }
            ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZIZ();
            ModeratorListFragment moderatorListFragment6 = this.LJLIL;
            ArrayList arrayList = new ArrayList();
            moderatorListFragment6.getClass();
            DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(moderatorListFragment6);
            if (LJIILIIL3 != null) {
                LJIILIIL3.rv0(ModeratorListChannel.class, arrayList);
            }
            this.LJLIL.Al(0);
        }
    }
}
