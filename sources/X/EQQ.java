package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffectWithError$2", f = "MobileEffectUploader.kt", l = {SubscriptionExpireRemindHourSetting.DEFAULT, 89}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super MobileEffectResponse>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UploadableMobileEffect LJLJI;
    public final /* synthetic */ C36370EPe LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Integer LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ UploadImageConfig LJLJLLL;
    public final /* synthetic */ UploadImageConfig LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQQ(UploadableMobileEffect uploadableMobileEffect, C36370EPe c36370EPe, String str, Integer num, String str2, String str3, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC67352kd<? super EQQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = uploadableMobileEffect;
        this.LJLJJI = c36370EPe;
        this.LJLJJL = str;
        this.LJLJJLL = num;
        this.LJLJL = str2;
        this.LJLJLJ = str3;
        this.LJLJLLL = uploadImageConfig;
        this.LJLL = uploadImageConfig2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        EQQ eqq = new EQQ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
        eqq.LJLILLLLZI = obj;
        return eqq;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super MobileEffectResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
