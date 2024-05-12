package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.AlgorithmConfig;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Effect;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredModelNames$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63602ea extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ Gson LJLIL;
    public final /* synthetic */ Config LJLILLLLZI;
    public final /* synthetic */ AlgorithmConfig LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63602ea(Gson gson, Config config, AlgorithmConfig algorithmConfig, InterfaceC67352kd<? super C63602ea> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = gson;
        this.LJLILLLLZI = config;
        this.LJLJI = algorithmConfig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63602ea(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        java.util.Map LJJJLIIL;
        java.util.Map LJJJLIIL2;
        C141335gf.LIZJ(obj);
        Gson gson = this.LJLIL;
        Config config = this.LJLILLLLZI;
        AlgorithmConfig algorithmConfig = this.LJLJI;
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(config, "config");
        Effect effect = config.effect;
        if (effect == null || (LJJJLIIL = effect.modelNames) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        if (algorithmConfig == null || (LJJJLIIL2 = algorithmConfig.modelNames) == null) {
            LJJJLIIL2 = C113554cx.LJJJLIIL();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        J8W.LIZLLL(linkedHashMap, LJJJLIIL);
        J8W.LIZLLL(linkedHashMap, LJJJLIIL2);
        if (linkedHashMap.isEmpty()) {
            return "";
        }
        String json = GsonProtectorUtils.toJson(gson, linkedHashMap);
        o.LJIIIIZZ(json, "{\n        gson.toJson(resultMap)\n    }");
        return json;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
