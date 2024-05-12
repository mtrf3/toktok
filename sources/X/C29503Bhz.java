package X;

import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bhz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29503Bhz implements InterfaceC75158Tec {
    public final /* synthetic */ LiveProfileDialog LJLIL;
    public final /* synthetic */ User LJLILLLLZI;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
    }

    public C29503Bhz(LiveProfileDialog liveProfileDialog, User user) {
        this.LJLIL = liveProfileDialog;
        this.LJLILLLLZI = user;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        int dimensionPixelSize;
        boolean z;
        BorderInfo LIZ;
        PrivilegeLogExtra privilegeLogExtra;
        Object obj;
        C47061t0 c47061t0 = this.LJLIL.LJLLL;
        if (c47061t0 != null) {
            ViewGroup.LayoutParams layoutParams = c47061t0.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            LiveProfileDialog liveProfileDialog = this.LJLIL;
            C29475BhX c29475BhX = liveProfileDialog.LJLIL;
            if (c29475BhX != null) {
                if (c29475BhX.LIZIZ) {
                    dimensionPixelSize = C81185Vtd.LIZLLL();
                } else {
                    dimensionPixelSize = liveProfileDialog.getResources().getDimensionPixelSize(R.dimen.ad9);
                }
                marginLayoutParams.width = dimensionPixelSize;
                int i3 = dimensionPixelSize / 3;
                marginLayoutParams.height = i3;
                LiveProfileDialog liveProfileDialog2 = this.LJLIL;
                C29475BhX c29475BhX2 = liveProfileDialog2.LJLIL;
                if (c29475BhX2 != null) {
                    if (c29475BhX2.LIZIZ) {
                        marginLayoutParams.topMargin = -((int) (i3 * 0.2f));
                        C47061t0 c47061t02 = liveProfileDialog2.LJLLL;
                        if (c47061t02 != null) {
                            c47061t02.setLayoutParams(marginLayoutParams);
                        } else {
                            o.LJIJI("bgCardSolid");
                            throw null;
                        }
                    } else {
                        marginLayoutParams.height = (int) (i3 * 0.8d);
                        PointF pointF = new PointF(0.0f, 0.6f);
                        C47061t0 c47061t03 = this.LJLIL.LJLLL;
                        if (c47061t03 != null) {
                            c47061t03.getHierarchy().LJIIL(2).LJIILLIIL(pointF);
                        } else {
                            o.LJIJI("bgCardSolid");
                            throw null;
                        }
                    }
                    User user = this.LJLILLLLZI;
                    C29475BhX c29475BhX3 = this.LJLIL.LJLIL;
                    if (c29475BhX3 != null) {
                        long id = c29475BhX3.LJ.getId();
                        C29475BhX c29475BhX4 = this.LJLIL.LJLIL;
                        if (c29475BhX4 != null) {
                            boolean z2 = false;
                            if (id == c29475BhX4.LIZLLL.getOwnerUserId()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_privilege_show", LiveLogMonitorSampleSetting.getSAMPLE_0()) || (LIZ = C29504Bi0.LIZ(user)) == null || (privilegeLogExtra = LIZ.ribbonLogExtra) == null) {
                                return;
                            }
                            if (user.getLiveRoomId() != 0) {
                                z2 = true;
                            }
                            BZI LIZ2 = C28787BRn.LIZ("livesdk_privilege_show");
                            String str2 = "anchor";
                            if (z) {
                                obj = "anchor";
                            } else {
                                obj = "user";
                            }
                            LIZ2.LJIJJ(obj, "user_type");
                            if (!z2) {
                                str2 = "user";
                            }
                            LIZ2.LJIJJ(str2, "to_user_type");
                            LIZ2.LJIJJ("profile_card", "privilege_scenario");
                            LIZ2.LJIJJ("profile_card", "privilege_type");
                            LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
                            LIZ2.LJIJJ(Long.valueOf(user.getId()), "to_user_id");
                            LIZ2.LJIJJ(privilegeLogExtra.privilege_id, "privilege_id");
                            LIZ2.LJIJJ(privilegeLogExtra.privilege_order_id, "privilege_order_id");
                            LIZ2.LJIJJ(privilegeLogExtra.privilege_version, "privilege_version_id");
                            LIZ2.LJIJJ(privilegeLogExtra.data_version, "data_version_id");
                            LIZ2.LJIJJ(Integer.valueOf(BM1.LIZJ), "online_user");
                            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                                LIZ2.LJIIZILJ();
                                LIZ2.LJJIIJZLJL();
                                return;
                            }
                            LIZ2.LJJIJ();
                            BJM bjm = BJM.LJLIL;
                            LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
                            LIZ2.LJIJJ(bjm.LIZJ(), "live_type");
                            LIZ2.LJI();
                            LIZ2.LJJIIZI();
                            return;
                        }
                        o.LJIJI("config");
                        throw null;
                    }
                    o.LJIJI("config");
                    throw null;
                }
                o.LJIJI("config");
                throw null;
            }
            o.LJIJI("config");
            throw null;
        }
        o.LJIJI("bgCardSolid");
        throw null;
    }
}
