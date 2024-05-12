package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.FullDsl;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import fjb.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.comp.impl.linkcore.dsl.LiveDslManagerV2$handleIO$1", f = "LiveDslManagerV2.kt", l = {185, 192}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UCE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UCC LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCE(UCC ucc, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super UCE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ucc;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UCE(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LJIIIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
            } else {
                StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "handle IO ");
                LIZIZ.append(C16880lQ.LLLLIIIILLL().getName());
                C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZIZ));
                if (LinkMicSdkGeckoDslDownloadSetting.getValue()) {
                    File LJFF = C15510jD.LJFF(CFX.LIZ("tiktok_live_link_mic", "tiktok_live_link_mic"), "dsl.json");
                    if (LJFF == null || !LJFF.exists()) {
                        this.LJLILLLLZI.getClass();
                        InterfaceC06390Mx LIZ = CN1.LIZ(IHostResource.class);
                        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
                        ((IHostResource) LIZ).FN(new UCF(), "tiktok_live_link_mic");
                        LJIIIZ = this.LJLILLLLZI.LJIIIZ();
                    } else {
                        this.LJLILLLLZI.LIZ = UC5.GECKO;
                        LJIIIZ = UCC.LJIIJ(new InputStreamReader(new FileInputStream(LJFF)));
                    }
                } else {
                    LJIIIZ = this.LJLILLLLZI.LJIIIZ();
                }
                FullDsl fullDsl = (FullDsl) C09650Zl.LIZIZ.LJI(LJIIIZ, FullDsl.class);
                if (fullDsl != null) {
                    this.LJLILLLLZI.LJFF(fullDsl);
                }
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C66102ic c66102ic = new C66102ic(this.LJLJI, null);
                this.LJLIL = 1;
                if (XKX.LJI(abstractC78621UtN, c66102ic, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            this.LJLILLLLZI.getClass();
            C32014ChO.LIZJ(UCC.LJIIIIZZ(187), "GsonHelper.get().fromJson FAILED", e.getMessage());
            if (this.LJLILLLLZI.LIZ != UC5.LOCAL) {
                z = false;
            }
            U8K.LIZLLL(z, 10002, e.toString());
            C0K2.LIZ("LinkMic DSL deserialized exception occurs.", e);
            AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
            C66112id c66112id = new C66112id(this.LJLJI, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN2, c66112id, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
