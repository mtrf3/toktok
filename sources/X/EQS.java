package X;

import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectApiModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MyEffectsResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TemplateEffectsService;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchSubmittedEffects$2", f = "MyEffectsViewModel.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends MobileEffect>>, Object> {
    public int LJLIL;
    public final /* synthetic */ MyEffectsViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQS(MyEffectsViewModel myEffectsViewModel, InterfaceC67352kd<? super EQS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = myEffectsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EQS(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        MyEffectsResponse myEffectsResponse;
        int i;
        List<MobileEffectApiModel> list;
        File effectDir;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        String str = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                TemplateEffectsService templateEffectsService = this.LJLILLLLZI.LL;
                this.LJLIL = 1;
                String LIZLLL = EF7.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getAPI().applicationService.appVersion");
                obj = templateEffectsService.getMyEffects(LIZLLL, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            myEffectsResponse = (MyEffectsResponse) obj;
        } catch (Throwable unused) {
            myEffectsResponse = null;
        }
        StringBuilder sb = new StringBuilder("Load myEffect list: ");
        int i3 = -1;
        if (myEffectsResponse != null) {
            i = myEffectsResponse.status_code;
        } else {
            i = -1;
        }
        sb.append(i);
        sb.append(", ");
        if (myEffectsResponse != null) {
            i3 = myEffectsResponse.error_code;
        }
        sb.append(i3);
        C15280iq.LJ("DiyProp", sb.toString());
        if (myEffectsResponse != null) {
            list = myEffectsResponse.effects;
        } else {
            list = null;
        }
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (MobileEffectApiModel mobileEffect : list) {
            MobileEffect.Companion.getClass();
            o.LJIIIZ(mobileEffect, "mobileEffect");
            arrayList.add(new MobileEffect(mobileEffect.effect, mobileEffect.moderationStatus, mobileEffect.templateInfo));
        }
        EffectConfiguration LJIJJ = this.LJLILLLLZI.LJLJLLL.LJJJJLL().LJI().LJIJJ();
        if (LJIJJ != null && (effectDir = LJIJJ.getEffectDir()) != null) {
            str = effectDir.getAbsolutePath();
        }
        if (str != null) {
            EffectUtils.setEffectField(str, "create", arrayList);
        }
        return arrayList;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends MobileEffect>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
