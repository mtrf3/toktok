package X;

import Y.ACListenerS47S0200000_13;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostEnableNewInvitationPanelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListReserveStyleBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.EnableCoHostDetailedDisableReasonSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TrR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75953TrR extends C78948Uye {
    public static final C75953TrR LJLJJLL = new C75953TrR();

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0266, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(X.InterfaceC75959TrX r16, X.C75981Trt r17) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75953TrR.LJIL(X.TrX, X.Trt):void");
    }

    public static void LJJ(InterfaceC75959TrX viewHolder, C75981Trt data) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String LJIILJJIL;
        String LJIILJJIL2;
        C2A7 LIZIZ;
        OptPairInfo optPairInfo;
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(data, "data");
        RivalExtraInfo rivalExtraInfo = data.LJLJJI;
        boolean z5 = true;
        if (rivalExtraInfo != null && rivalExtraInfo.showPlayType == 2 && (data.LJLJL || !((IInteractService) CN1.LIZ(IInteractService.class)).ta0())) {
            C2A7 LIZIZ2 = viewHolder.LIZIZ();
            if (LIZIZ2 == null) {
                return;
            }
            LIZIZ2.setVisibility(8);
            return;
        }
        C2A7 LIZIZ3 = viewHolder.LIZIZ();
        if (LIZIZ3 != null) {
            LIZIZ3.setVisibility(0);
        }
        RivalExtraInfo rivalExtraInfo2 = data.LJLJJI;
        if (rivalExtraInfo2 != null) {
            z = C78596Usy.LJIIIZ(rivalExtraInfo2);
        } else {
            z = true;
        }
        RivalExtraInfo rivalExtraInfo3 = data.LJLJJI;
        if (rivalExtraInfo3 != null && rivalExtraInfo3.showPlayType == EnumC75767ToR.PLAYTYPE_APPLY.value) {
            z2 = true;
        } else {
            z2 = false;
        }
        C75883TqJ LJJZ = C8E.LIZLLL().LJJZ(data.LJLIL.getOwnerUserId(), z2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateInviteBtn, ownerUserId = ");
        LIZ.append(data.LJLIL.getOwnerUserId());
        LIZ.append(" coHostUser = ");
        LIZ.append(LJJZ);
        C0NB.LJIIIZ("MultiHostLinkViewDelegate", X1D.LIZIZ(LIZ));
        long LLI = C8E.LIZLLL().LLI(data.LJLIL.getOwnerUserId());
        if (LJJZ != null) {
            z3 = LJJZ.LJ();
        } else {
            z3 = false;
        }
        if (data.LJLJL || !((IInteractService) CN1.LIZ(IInteractService.class)).ta0() || !C74726TUk.LIZ()) {
            if (z3 && LLI > 0) {
                EnumC75958TrW enumC75958TrW = EnumC75958TrW.INVITING;
                viewHolder.LJJJLZIJ(enumC75958TrW);
                o.LJIIIZ(enumC75958TrW, "<set-?>");
                data.LJLLILLLL = enumC75958TrW;
            } else if (data.LJLLI) {
                viewHolder.LJJJLZIJ(EnumC75958TrW.NORMAL);
            } else {
                RivalExtraInfo rivalExtraInfo4 = data.LJLJJI;
                if (rivalExtraInfo4 != null && (optPairInfo = rivalExtraInfo4.optPairInfo) != null && optPairInfo.optPairStatus == 1) {
                    viewHolder.LJJJLZIJ(EnumC75958TrW.OFFLINE);
                } else if (z) {
                    viewHolder.LJJJLZIJ(EnumC75958TrW.NORMAL);
                } else if (rivalExtraInfo4 != null && (!EnableCoHostDetailedDisableReasonSetting.INSTANCE.getValue() ? rivalExtraInfo4.inviteBlockReason == 7 : rivalExtraInfo4.detailBlockReason == 305)) {
                    viewHolder.LJJJLZIJ(EnumC75958TrW.MATURETHEME);
                } else {
                    viewHolder.LJJJLZIJ(EnumC75958TrW.UNAVAILABLE);
                }
            }
        } else {
            viewHolder.LJJJLZIJ(EnumC75958TrW.UNAVAILABLE);
        }
        RivalExtraInfo rivalExtraInfo5 = data.LJLJJI;
        if (rivalExtraInfo5 != null && rivalExtraInfo5.showPlayType == EnumC75767ToR.PLAYTYPE_APPLY.value) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i = C75956TrU.LIZ[viewHolder.LLLLL().ordinal()];
        int i2 = R.style.abv;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    if (i == 5 && (LIZIZ = viewHolder.LIZIZ()) != null) {
                        LIZIZ.LJJLL(R.style.a35);
                        LIZIZ.setEnabled(false);
                        LIZIZ.setText(C15380j0.LJIILJJIL(R.string.kfu));
                    }
                } else {
                    C2A7 LIZIZ4 = viewHolder.LIZIZ();
                    if (LIZIZ4 != null) {
                        LIZIZ4.LJJLL(R.style.a2y);
                        LIZIZ4.setEnabled(true);
                        if (z4) {
                            LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kjy);
                        } else {
                            LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kfu);
                        }
                        LIZIZ4.setText(LJIILJJIL2);
                    }
                }
            } else {
                C2A7 LIZIZ5 = viewHolder.LIZIZ();
                if (LIZIZ5 != null) {
                    EnumC75614Tly enumC75614Tly = data.LJLJI;
                    if (enumC75614Tly != EnumC75614Tly.BEST_TEAMMATE_INVITE) {
                        if (enumC75614Tly == EnumC75614Tly.RESERVED_INVITE || enumC75614Tly == EnumC75614Tly.PAIRING_ON_RESERVE_INVITE) {
                            if (CoHostEnableNewInvitationPanelSetting.INSTANCE.isEnable()) {
                                if (CoHostInviteListReserveStyleBugfixSetting.isEnable() && viewHolder.LLLLL() == EnumC75958TrW.UNAVAILABLE) {
                                    i2 = R.style.ac2;
                                } else {
                                    i2 = R.style.ac1;
                                }
                            } else if (viewHolder.LLLLL() == EnumC75958TrW.UNAVAILABLE) {
                                i2 = R.style.acs;
                            } else {
                                i2 = R.style.a2x;
                            }
                        } else if (CoHostEnableNewInvitationPanelSetting.INSTANCE.isEnable()) {
                            i2 = R.style.abx;
                        } else {
                            i2 = R.style.a35;
                        }
                    }
                    LIZIZ5.LJJLL(i2);
                    if (viewHolder.LLLLL() != EnumC75958TrW.NORMAL && data.LJLJI != EnumC75614Tly.RESERVED_INVITE) {
                        z5 = false;
                    }
                    LIZIZ5.setEnabled(z5);
                    if (z4) {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.kjy);
                    } else {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.kfu);
                    }
                    LIZIZ5.setText(LJIILJJIL);
                }
            }
        } else {
            C2A7 LIZIZ6 = viewHolder.LIZIZ();
            if (LIZIZ6 != null) {
                long LLI2 = C8E.LIZLLL().LLI(data.LJLIL.getOwnerUserId());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateBtnByState, ownerUserId = ");
                LIZ2.append(data.LJLIL.getOwnerUserId());
                LIZ2.append(" time = ");
                LIZ2.append(LLI2);
                C0NB.LJIIIZ("MultiHostLinkViewDelegate", X1D.LIZIZ(LIZ2));
                EnumC75614Tly enumC75614Tly2 = data.LJLJI;
                if (enumC75614Tly2 != EnumC75614Tly.BEST_TEAMMATE_INVITE) {
                    if (enumC75614Tly2 == EnumC75614Tly.RESERVED_INVITE || enumC75614Tly2 == EnumC75614Tly.PAIRING_ON_RESERVE_INVITE) {
                        if (CoHostEnableNewInvitationPanelSetting.INSTANCE.isEnable()) {
                            i2 = R.style.ac0;
                        } else {
                            i2 = R.style.a39;
                        }
                    } else if (CoHostEnableNewInvitationPanelSetting.INSTANCE.isEnable()) {
                        i2 = R.style.abw;
                    } else {
                        i2 = R.style.a3d;
                    }
                }
                LIZIZ6.LJJLL(i2);
                LIZIZ6.setEnabled(true);
                LIZIZ6.setText(BML.LIZ(C15380j0.LJIILJJIL(R.string.kho), Long.valueOf(LLI2)));
            }
        }
        if (C30922CBq.LIZIZ) {
            User owner = data.LJLIL.getOwner();
            EnumC75958TrW LLLLL = viewHolder.LLLLL();
            C2A7 LIZIZ7 = viewHolder.LIZIZ();
            if (LIZIZ7 != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(C05170If.LIZ(owner));
                LIZ3.append(",state:");
                LIZ3.append(LLLLL.getIndex());
                LIZIZ7.setTag(X1D.LIZIZ(LIZ3));
            }
        }
        C2A7 LIZIZ8 = viewHolder.LIZIZ();
        if (LIZIZ8 == null) {
            return;
        }
        C16880lQ.LJJIII(LIZIZ8, new ACListenerS47S0200000_13(viewHolder, data, 59));
    }

    @Override // X.C78948Uye
    public final /* bridge */ /* synthetic */ void LJIJI(InterfaceC75966Tre interfaceC75966Tre, InterfaceC28306B9a interfaceC28306B9a, int i) {
        LJJ((InterfaceC75959TrX) interfaceC75966Tre, (C75981Trt) interfaceC28306B9a);
    }
}
