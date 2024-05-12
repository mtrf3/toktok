package X;

import Y.ARunnableS13S0100100_5;
import Y.AfS4S0100100_5;
import Y.AfS57S0100000_5;
import com.bytedance.android.livesdk.api.LiveCaptchaCheckApi;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Bsa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30160Bsa implements InterfaceC78991UzL {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C30159BsZ LJLJJI;

    @Override // X.InterfaceC78991UzL
    public final void LIZJ() {
        final long j = this.LJLIL;
        final String str = this.LJLILLLLZI;
        final long j2 = this.LJLJI;
        C15610jN.LIZIZ(new Runnable() { // from class: X.Bsb
            @Override // java.lang.Runnable
            public final void run() {
                C30160Bsa c30160Bsa = C30160Bsa.this;
                long j3 = j;
                String str2 = str;
                long j4 = j2;
                C30159BsZ c30159BsZ = c30160Bsa.LJLJJI;
                if (!c30159BsZ.LJLJLLL) {
                    ((IHostUser) CN1.LIZ(IHostUser.class)).popCaptchaV2(c30159BsZ.LJLIL.mo49getActivity(), str2, new C30160Bsa(c30159BsZ, j3, str2, j4));
                }
            }
        });
        if (!this.LJLJJI.LJLJL) {
            BZI LIZ = C28787BRn.LIZ("livesdk_captcha_popup_result");
            LIZ.LJIILLIIL(this.LJLJJI.LJLJJL);
            LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() / 1000) - this.LJLJJI.LJLJJI.getCreateTime()), "duration_after_live_take");
            LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() - this.LJLJJI.LJLL.longValue()) / 1000), "duration_after_popup");
            LIZ.LJIJJ("fail", "result");
            UFE.LIZIZ(2, LIZ, "failure_reason");
        }
    }

    @Override // X.InterfaceC78991UzL
    public final void LJFF() {
    }

    @Override // X.InterfaceC78991UzL
    public final void LJI() {
        this.LJLJJI.LJLL = Long.valueOf(System.currentTimeMillis());
        long j = this.LJLJI;
        if (j != 0) {
            C30326BvG.LIZJ(new ARunnableS13S0100100_5(j, this, 4), null, 1000L);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_captcha_popup_test_show");
        LIZ.LJIILLIIL(this.LJLJJI.LJLJJL);
        LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() / 1000) - this.LJLJJI.LJLJJI.getCreateTime()), "duration_after_live_take");
        LIZ.LJJIIJZLJL();
        AbstractC73672Svk.LJJLIIIJLJLI(this.LJLJI, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJLIIL(new AfS4S0100100_5(this.LJLIL, this, 12), BTJ.LIZ);
    }

    @Override // X.InterfaceC78991UzL
    public final void onSuccess() {
        this.LJLJJI.LJLJJL.rv0(CaptchaLivePauseTimeChannel.class, 0L);
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((LiveCaptchaCheckApi) C65814PsI.LIZJ(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(this.LJLIL, this.LJLJJI.LJLJJI.getId(), false)).LJII(BTJ.LIZIZ(this.LJLJJI.LJLIL)).LJJJJZI(new AfS57S0100000_5(this, 212));
        if (!this.LJLJJI.LJLJLJ) {
            BZI LIZ = C28787BRn.LIZ("livesdk_captcha_popup_result");
            LIZ.LJIILLIIL(this.LJLJJI.LJLJJL);
            LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() / 1000) - this.LJLJJI.LJLJJI.getCreateTime()), "duration_after_live_take");
            LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() - this.LJLJJI.LJLL.longValue()) / 1000), "duration_after_popup");
            LIZ.LJIJJ("success", "result");
            LIZ.LJJIIJZLJL();
        }
    }

    public C30160Bsa(C30159BsZ c30159BsZ, long j, String str, long j2) {
        this.LJLJJI = c30159BsZ;
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = j2;
    }
}
