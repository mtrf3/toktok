package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;

/* renamed from: X.CPd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31273CPd extends CQK<LiveIntroMessage> implements CSC, CTT {
    public long LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public CharSequence LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public java.util.Map<Long, Long> LJJIJIL;

    @Override // X.CTT
    public final void LJIIJJI() {
        this.LJJIJIIJIL = true;
    }

    @Override // X.CQO, X.CQL, X.CRD
    public final boolean LJJIII() {
        return false;
    }

    @Override // X.CQL, X.CRD
    public final long LJJIJL() {
        return 2000L;
    }

    @Override // X.CTT
    public final boolean LJJJJI() {
        return true;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJJLIIIJL() {
        return true;
    }

    @Override // X.CSC
    public final boolean LJJLIIIJLJLI() {
        return true;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return ((LiveIntroMessage) this.LJIJJLI).content;
    }

    @Override // X.CQK
    public final String LLI() {
        MESSAGE message = this.LJIJJLI;
        if (((LiveIntroMessage) message).content == null) {
            return "";
        }
        return ((LiveIntroMessage) message).content;
    }

    public final String LLIIJLIL() {
        MESSAGE message = this.LJIJJLI;
        if (((LiveIntroMessage) message).introMode != null && ((LiveIntroMessage) message).introMode.intValue() == 1) {
            return "default";
        }
        return "edit";
    }

    @Override // X.CQL, X.CRD
    public final boolean LJIJ() {
        return !LJLIIL().LJFF;
    }

    @Override // X.CQO, X.CQL, X.CRD
    public final boolean LJIJI() {
        return !LJLJJL();
    }

    @Override // X.CSC
    public final CharSequence LJJLIIIJJIZ() {
        return getContent();
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return LJLIIL().LJII;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        CharSequence content = getContent();
        if (content != null) {
            if (LJLJJL()) {
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_room_detail_show");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(content.toString(), "live_info_content");
                LIZ.LJIJJ(LLIIJLIL(), "live_info_type");
                LIZ.LJJIFFI(C29232Bdc.LJIIZILJ(((ISubscribeService) CN1.LIZ(ISubscribeService.class)).ze0()));
                LIZ.LJJIIJZLJL();
                return;
            }
            if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_room_detail_audience_show", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_room_detail_audience_show");
                LIZ2.LJIJJ(content.toString(), "live_info_content");
                LIZ2.LJIJJ(LLIIJLIL(), "live_info_type");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                    LIZ2.LJIIZILJ();
                    LIZ2.LJJIIJZLJL();
                } else {
                    LIZ2.LJJIJ();
                    LIZ2.LJJIIZI();
                }
            }
            this.LJJIIJZLJL = System.currentTimeMillis();
        }
    }

    @Override // X.CTT
    public final boolean LJIILL() {
        return this.LJJIJIIJIL;
    }

    @Override // X.CSC
    public final boolean LJIIZILJ() {
        return this.LJJIIZ;
    }

    @Override // X.CTT
    public final boolean LJJJJLL() {
        return this.LJJIJIIJI;
    }

    @Override // X.CSC
    public final CharSequence LJJJLIIL() {
        return this.LJJIJ;
    }

    @Override // X.CSC
    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LJJIIZI;
    }

    public C31273CPd(LiveIntroMessage liveIntroMessage) {
        super(liveIntroMessage);
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void LJII(boolean z) {
        CharSequence content = getContent();
        if (LJLJJL() || content == null || !UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_room_detail_audience_show_duration")) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_room_detail_audience_show_duration");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(content.toString(), "live_info_content");
        LIZ.LJIJJ(Integer.valueOf((int) (System.currentTimeMillis() - this.LJJIIJZLJL)), "duration");
        LIZ.LJIJJ(LLIIJLIL(), "live_info_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.CQK, X.CQL, X.InterfaceC31341CRt
    public final void LJIILLIIL(CQQ cqq) {
        LLII(((LiveIntroMessage) this.LJIJJLI).badges, cqq, 2);
        super.LJIILLIIL(cqq);
    }

    @Override // X.CSC
    public final void LJJIIJ(boolean z) {
        this.LJJIIZ = z;
    }

    @Override // X.CTT
    public final void LJJIJLIJ(boolean z) {
        this.LJJIJIIJI = z;
    }

    @Override // X.CSC
    public final void LJJIZ(boolean z) {
        this.LJJIIZI = z;
    }

    @Override // X.CQK, X.CQL, X.InterfaceC31341CRt
    public final void LJJJI(CQQ cqq) {
        LLII(((LiveIntroMessage) this.LJIJJLI).badges, cqq, 2);
        super.LJJJI(cqq);
    }

    @Override // X.CSC
    public final void LJJJJL(CharSequence charSequence) {
        this.LJJIJ = charSequence;
    }

    @Override // X.CSC
    public final void LJJL(java.util.Map<Long, Long> map) {
        this.LJJIJIL = map;
    }
}
