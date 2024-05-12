package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenCheckDirectionalityCountSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CPg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31276CPg extends CQO<MemberMessage> {
    public boolean LJIL;
    public CU2 LJJ;
    public final int LJJI;
    public int LJJIFFI;

    @Override // X.CQO, X.CQL, X.CRD
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.CQL, X.CRD
    public final long LJJIJL() {
        return 3000L;
    }

    @Override // X.CQL
    public final boolean LJLJL() {
        return false;
    }

    @Override // X.CQL
    public final boolean LJZ() {
        return true;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        if (((MemberMessage) this.LJIJJLI).action == 1) {
            return R.drawable.d2s;
        }
        return R.drawable.d2a;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJJJIL() {
        if (this.LJIIJJI.LIZIZ() != 2) {
            return false;
        }
        CQQ cqq = this.LJIIJJI;
        if (cqq.LJFF) {
            if (cqq.LJIJ != CRY.Main || LJJZ()) {
                return false;
            }
            return true;
        }
        return this.LIZJ;
    }

    @Override // X.CQL, X.InterfaceC31381CTh
    public final CU2 LJJLI() {
        if (this.LJJ == null) {
            this.LJJ = new CU2();
        }
        return this.LJJ;
    }

    @Override // X.CQL
    public CharSequence LJJZZIII() {
        int i;
        int i2;
        MemberMessage memberMessage = (MemberMessage) this.LJIJJLI;
        switch (memberMessage.action) {
            case 1:
                if (LLII() || LLIFFJFJJ() || ((MemberMessage) this.LJIJJLI).isTopUser) {
                    if (((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90() == null) {
                        i = 0;
                        i2 = 0;
                    } else {
                        i = R.color.aao;
                        i2 = R.color.a8j;
                    }
                    return CPR.LIZLLL(((MemberMessage) this.LJIJJLI).user, "  ", LLFII(), i, i2, this);
                }
                return LJLLLL();
            case 2:
            case 7:
            default:
                User user = memberMessage.user;
                String LLFF = LLFF(memberMessage);
                ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
                ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
                return CPR.LIZLLL(user, "  ", LLFF, R.color.a58, R.color.a5_, this);
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                User user2 = getUser();
                String LLFF2 = LLFF((MemberMessage) this.LJIJJLI);
                ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
                SpannableString spannableString = new SpannableString(LLFF2);
                spannableString.setSpan(new C30778C6c(CPR.LIZ(R.color.a8f), user2), 0, spannableString.length(), 18);
                return spannableString;
            case 8:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Top");
                LIZ.append(((MemberMessage) this.LJIJJLI).topUserNo);
                String LIZIZ = X1D.LIZIZ(LIZ);
                String LLFF3 = LLFF((MemberMessage) this.LJIJJLI);
                if (CCJ.LIZ(C15380j0.LIZLLL())) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZIZ = C0H1.LIZJ(LIZ2, ((MemberMessage) this.LJIJJLI).topUserNo, "Top", LIZ2);
                    StringBuffer stringBuffer = new StringBuffer(LLFF3);
                    stringBuffer.reverse();
                    LLFF3 = stringBuffer.toString();
                }
                String[] split = LLFF3.split(LIZIZ);
                if (split[0].length() == LLFF3.length()) {
                    return CXJ.LIZ;
                }
                SpannableString spannableString2 = new SpannableString(LLFF3);
                ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
                int LIZ3 = CPR.LIZ(R.color.a8f);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(LIZ3);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(LIZ3);
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(LIZ3);
                spannableString2.setSpan(foregroundColorSpan2, 0, split[0].length(), 18);
                spannableString2.setSpan(foregroundColorSpan, split[0].length(), LIZIZ.length() + split[0].length(), 18);
                spannableString2.setSpan(foregroundColorSpan3, LIZIZ.length() + split[0].length(), LLFF3.length(), 18);
                spannableString2.setSpan(new C30778C6c(LIZ3, getUser()), 0, spannableString2.length(), 18);
                return spannableString2;
        }
    }

    @Override // X.CQL
    public final boolean LJLJLLL() {
        if (((MemberMessage) this.LJIJJLI).action == 1) {
            return true;
        }
        return false;
    }

    @Override // X.CQL
    public final boolean LJZI() {
        if (((MemberMessage) this.LJIJJLI).action != 1) {
            return false;
        }
        if ((!LJLJJL() && this.LJIJJLI.baseMessage.foldType == 0) || (((MemberMessage) this.LJIJJLI).displayStyle == 2 && LJLJJL())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((MemberMessage) this.LJIJJLI).user;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJIJ() {
        if (LJJJJ() && ((MemberMessage) this.LJIJJLI).displayStyle == 1 && this.LJIIJJI.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void LJJLL() {
        if (LJJJIL() && this.LJIIL.LIZ <= 1 && this.LJIIJJI.LJFF) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_wave_show");
            LIZ.LJIILLIIL(this.LJIIJJI.LJIIIIZZ);
            LIZ.LJIJJ(Long.valueOf(LJLILLLLZI()), "to_user_id");
            LIZ.LJIJJ(Long.valueOf(getMessageId()), "msg_id");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // X.CQO, X.CQL
    public final Text LJLI() {
        if (LJLJJL()) {
            MESSAGE message = this.LJIJJLI;
            if (((MemberMessage) message).anchorDisplayText != null) {
                return ((MemberMessage) message).anchorDisplayText;
            }
        }
        return super.LJLI();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[SYNTHETIC] */
    @Override // X.CQL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJLJLJ() {
        /*
            r9 = this;
            java.lang.CharSequence r7 = r9.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r8 = 0
            if (r0 == 0) goto Lc
            return r8
        Lc:
            X.CQQ r0 = r9.LJIIJJI
            int r0 = r0.LIZIZ()
            r6 = 2
            r5 = 1
            if (r0 != r6) goto L57
            r4 = 1
            int r1 = r7.length()
            int r0 = r9.LJJI
            if (r1 < r0) goto L58
            int r0 = r9.LJJIFFI
            if (r0 != 0) goto L43
            r3 = 0
            r2 = 0
            r1 = 0
        L26:
            int r0 = r7.length()
            if (r3 >= r0) goto L4f
            char r0 = r7.charAt(r3)
            byte r0 = java.lang.Character.getDirectionality(r0)
            if (r0 == 0) goto L4d
            if (r0 == r5) goto L4b
            if (r0 == r6) goto L4b
            switch(r0) {
                case 14: goto L4d;
                case 15: goto L4d;
                case 16: goto L4b;
                case 17: goto L4b;
                default: goto L3d;
            }
        L3d:
            if (r2 == 0) goto L48
        L3f:
            if (r1 == 0) goto L48
        L41:
            r9.LJJIFFI = r6
        L43:
            int r0 = r9.LJJIFFI
            if (r0 != r6) goto L58
        L47:
            return r8
        L48:
            int r3 = r3 + 1
            goto L26
        L4b:
            r1 = 1
            goto L3d
        L4d:
            r2 = 1
            goto L3f
        L4f:
            if (r2 == 0) goto L54
            if (r1 == 0) goto L54
            goto L41
        L54:
            r9.LJJIFFI = r5
            goto L43
        L57:
            r4 = 0
        L58:
            r8 = r4
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31276CPg.LJLJLJ():boolean");
    }

    public final String LLFII() {
        if (LLII()) {
            return C15380j0.LJIILL(R.string.k03, "");
        }
        if (LLIFFJFJJ()) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mh4);
            if (((MemberMessage) this.LJIJJLI).isTopUser) {
                return C15380j0.LJIILL(R.string.sxr, Long.valueOf(r1.topUserNo), LJIILJJIL);
            }
            return LJIILJJIL;
        }
        return LLFF((MemberMessage) this.LJIJJLI);
    }

    public final boolean LLIFFJFJJ() {
        if (LJLJJL()) {
            MESSAGE message = this.LJIJJLI;
            if (((MemberMessage) message).action == 1 && (((TextUtils.equals(((MemberMessage) message).clientEnterSource, "live_merge-live_cover") && TextUtils.equals(((MemberMessage) this.LJIJJLI).clientLiveReason, "hour")) || TextUtils.equals(((MemberMessage) this.LJIJJLI).clientEnterSource, "live_detail-hourly_rank")) && TextUtils.equals(((MemberMessage) this.LJIJJLI).clientEnterType, "click"))) {
                return true;
            }
        }
        return false;
    }

    public final boolean LLII() {
        if (LJLJJL() && TextUtils.equals(((MemberMessage) this.LJIJJLI).clientEnterType, "click") && ((TextUtils.equals(((MemberMessage) this.LJIJJLI).clientEnterSource, "live_merge-live_cover") && TextUtils.equals(((MemberMessage) this.LJIJJLI).clientLiveReason, "week")) || TextUtils.equals(((MemberMessage) this.LJIJJLI).clientEnterSource, "live_detail-weekly_rank") || TextUtils.equals(((MemberMessage) this.LJIJJLI).clientEnterSource, "live_detail-weekly_rank_notice") || (TextUtils.equals(((MemberMessage) this.LJIJJLI).clientEnterSource, "homepage_hot-live_cell") && TextUtils.equals(((MemberMessage) this.LJIJJLI).clientLiveReason, "week")))) {
            return true;
        }
        return false;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        super.onAttach();
        MemberMessage memberMessage = (MemberMessage) this.LJIJJLI;
        if (memberMessage.action == 1 && !TextUtils.isEmpty(memberMessage.userShareType)) {
            if (LJLJJL()) {
                if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_anchor_share_enter_message_show")) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_anchor_share_enter_message_show");
                    LIZ.LJIIZILJ();
                    LIZ.LJIJJ(memberMessage.userShareType, "user_share_type");
                    LIZ.LJJIIJZLJL();
                }
            } else if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_share_enter_message_audience_show")) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_share_enter_message_audience_show");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(memberMessage.userShareType, "user_share_type");
                LIZ2.LJJIIJZLJL();
            }
        }
        if (this.LJIIJJI.LJIILJJIL && !this.LJIL && memberMessage.action == 1 && memberMessage.displayStyle != 0 && LJLJJL() && getUser() != null) {
            if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_live_vip_enter_message_show")) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_live_vip_enter_message_show");
                LIZ3.LJIILLIIL(this.LJIIJJI.LJIIIIZZ);
                LIZ3.LJ(Long.valueOf(this.LJIIJJI.LJIILLIIL));
                LIZ3.LJJIII(Long.valueOf(this.LJIIJJI.LJIIJJI));
                LIZ3.LJIJJ(Long.valueOf(getUser().getId()), "vip_user_id");
                LIZ3.LJJIIJZLJL();
            }
            this.LJIL = true;
        }
    }

    public C31276CPg(MemberMessage memberMessage) {
        super(memberMessage);
        this.LJJI = LivePublicScreenCheckDirectionalityCountSetting.INSTANCE.getValue();
        this.LJJIFFI = 0;
    }

    public static String LLFF(MemberMessage memberMessage) {
        String LIZ;
        String LIZ2;
        String LIZ3;
        String str = "";
        if (memberMessage == null) {
            return "";
        }
        User user = memberMessage.operator;
        if (user == null) {
            LIZ = "";
        } else {
            LIZ = C05170If.LIZ(user);
        }
        User user2 = memberMessage.user;
        switch (memberMessage.action) {
            case 1:
                if (memberMessage.isTopUser) {
                    return LLFZ(R.string.sxr, Long.valueOf(memberMessage.topUserNo), LLFFF(memberMessage));
                }
                return LLFFF(memberMessage);
            case 2:
                if (memberMessage.isTopUser) {
                    return LLFZ(R.string.sxs, Long.valueOf(memberMessage.topUserNo));
                }
                return LLFZ(R.string.sy4, new Object[0]);
            case 3:
                if (LLI(memberMessage)) {
                    if (user2 == null) {
                        return "";
                    }
                    return LLFZ(R.string.sy_, C05170If.LIZ(user2), LIZ);
                }
                if (user2 == null) {
                    return "";
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(C05170If.LIZ(user2));
                LIZ4.append(LLFZ(R.string.sy9, new Object[0]));
                return X1D.LIZIZ(LIZ4);
            case 4:
                if (LLI(memberMessage)) {
                    if (user2 == null) {
                        return "";
                    }
                    return LLFZ(R.string.syb, C05170If.LIZ(user2), LIZ);
                }
                if (user2 == null) {
                    return "";
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(C05170If.LIZ(user2));
                LIZ5.append(LLFZ(R.string.sya, new Object[0]));
                return X1D.LIZIZ(LIZ5);
            case 5:
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(C05170If.LIZ(user2));
                LIZ6.append(" ");
                LIZ6.append(LLFZ(R.string.sy7, new Object[0]));
                return X1D.LIZIZ(LIZ6);
            case 6:
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append(C05170If.LIZ(user2));
                LIZ7.append(" ");
                LIZ7.append(LLFZ(R.string.sxy, new Object[0]));
                return X1D.LIZIZ(LIZ7);
            case 8:
                if (memberMessage.topUserNo > 0) {
                    if (memberMessage.setToAdmin) {
                        return LLFZ(R.string.sxx, C05170If.LIZ(user2), Long.valueOf(memberMessage.topUserNo));
                    }
                    return LLFZ(R.string.sxw, C05170If.LIZ(user2), Long.valueOf(memberMessage.topUserNo));
                }
            case 7:
            default:
                return "";
            case 9:
                Object[] objArr = new Object[2];
                if (user2 == null) {
                    LIZ2 = "";
                } else {
                    LIZ2 = C05170If.LIZ(user2);
                }
                objArr[0] = LIZ2;
                User user3 = memberMessage.operator;
                if (user3 != null) {
                    str = C05170If.LIZ(user3);
                }
                objArr[1] = str;
                return LLFZ(R.string.sy_, objArr);
            case 10:
                Object[] objArr2 = new Object[2];
                if (user2 == null) {
                    LIZ3 = "";
                } else {
                    LIZ3 = C05170If.LIZ(user2);
                }
                objArr2[0] = LIZ3;
                User user4 = memberMessage.operator;
                if (user4 != null) {
                    str = C05170If.LIZ(user4);
                }
                objArr2[1] = str;
                return LLFZ(R.string.syb, objArr2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                if (LLI(memberMessage)) {
                    if (user2 == null) {
                        return "";
                    }
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append(C05170If.LIZ(user2));
                    LIZ8.append(LLFZ(R.string.sy2, new Object[0]));
                    return X1D.LIZIZ(LIZ8);
                }
                if (user2 == null) {
                    return "";
                }
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append(C05170If.LIZ(user2));
                LIZ9.append(LLFZ(R.string.sy1, new Object[0]));
                return X1D.LIZIZ(LIZ9);
        }
    }

    public static String LLFFF(MemberMessage memberMessage) {
        if (memberMessage.actionDescription == null) {
            if (memberMessage.action != 1) {
                memberMessage.actionDescription = "";
            } else {
                memberMessage.actionDescription = LLFZ(R.string.sy0, new Object[0]);
            }
        }
        return memberMessage.actionDescription;
    }

    public static boolean LLI(MemberMessage memberMessage) {
        User user = memberMessage.operator;
        if (user != null && user.getUserAttr() != null && memberMessage.operator.getUserAttr().isSuperAdmin) {
            return true;
        }
        return false;
    }

    @Override // X.CQL, X.InterfaceC31341CRt
    public final void LJIILLIIL(CQQ cqq) {
        super.LJIILLIIL(cqq);
        if (LLIFFJFJJ() || LLII()) {
            MemberMessage memberMessage = (MemberMessage) this.LJIJJLI;
            memberMessage.LJLIL = true;
            memberMessage.LJLILLLLZI = false;
        } else {
            MemberMessage memberMessage2 = (MemberMessage) this.LJIJJLI;
            memberMessage2.LJLIL = false;
            memberMessage2.LJLILLLLZI = true;
        }
    }

    @Override // X.CQL, X.CXK
    public final CharSequence LJJJLZIJ(User user) {
        if (this.LJIIJJI.LIZIZ() == 2) {
            return C78840Uwu.LJJIJLIJ(this.LJIIIIZZ, C05170If.LIZ(user));
        }
        return super.LJJJLZIJ(user);
    }

    @Override // X.CQL
    public final void LJLLI(BadgeStruct badgeStruct) {
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJ(LJLILLLLZI(), "comment_area_system_message", LJLJJL());
        }
    }

    @Override // X.CQL
    public final void LJLLILLLL(BadgeStruct badgeStruct) {
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJFF(LJLILLLLZI(), "comment_area_system_message", LJLJJL());
        }
    }

    public static String LLFZ(int i, Object... objArr) {
        Context LIZLLL = C15380j0.LIZLLL();
        if (objArr.length > 0) {
            return LIZLLL.getResources().getString(i, objArr);
        }
        return LIZLLL.getResources().getString(i);
    }

    @Override // X.CQL
    public final void LJLLLLLL(int i, User user) {
        C29775BmN.LIZ(i, user);
    }
}
