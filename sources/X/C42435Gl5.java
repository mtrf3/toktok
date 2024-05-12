package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.vesdk.VEUtils;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startChangeBanMusic$1", f = "RecordServiceBaseImpl.kt", l = {513, 525, 568}, m = "invokeSuspend")
/* renamed from: X.Gl5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42435Gl5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ HPU LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ ChangeBanMusicConfig LJLJJI;
    public final /* synthetic */ IRecordService.UICallback LJLJJL;
    public final /* synthetic */ Aweme LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42435Gl5(HPU hpu, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, IRecordService.UICallback uICallback, Aweme aweme, String str, InterfaceC67352kd<? super C42435Gl5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = hpu;
        this.LJLJI = activity;
        this.LJLJJI = changeBanMusicConfig;
        this.LJLJJL = uICallback;
        this.LJLJJLL = aweme;
        this.LJLJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42435Gl5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception unused) {
            XIF xif = EXT.LIZ;
            C42434Gl4 c42434Gl4 = new C42434Gl4(this.LJLJJL, this.LJLJI, null);
            this.LJLIL = 3;
            if (XKX.LJI(xif, c42434Gl4, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            HPU hpu = this.LJLILLLLZI;
            Activity activity = this.LJLJI;
            C42436Gl6 c42436Gl6 = new C42436Gl6(this.LJLJJI.getOutputDir(), this.LJLJJI.getOriginVideo(), this.LJLJJI.getWavPath(), this.LJLJJI.getMp4Path());
            this.LJLIL = 1;
            obj = hpu.LJ(activity, c42436Gl6, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LJLJJI.getMp4Path());
        if (videoFileInfo != null) {
            XIF xif2 = EXT.LIZ;
            C42433Gl3 c42433Gl3 = new C42433Gl3(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJI, this.LJLJJI, videoFileInfo, null);
            this.LJLIL = 2;
            if (XKX.LJI(xif2, c42433Gl3, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        throw new Exception("videoInfo fail");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
