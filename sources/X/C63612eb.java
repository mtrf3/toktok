package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.TiktokEffectHouse;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredSdkExtra$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63612eb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ Gson LJLIL;
    public final /* synthetic */ Config LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63612eb(Gson gson, Config config, java.util.Map<String, ? extends Object> map, java.util.Map<String, ? extends Object> map2, InterfaceC67352kd<? super C63612eb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = gson;
        this.LJLILLLLZI = config;
        this.LJLJI = map;
        this.LJLJJI = map2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63612eb(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        TiktokEffectHouse tiktokEffectHouse;
        C141335gf.LIZJ(obj);
        Gson gson = this.LJLIL;
        Config config = this.LJLILLLLZI;
        java.util.Map<String, Object> map = this.LJLJI;
        java.util.Map<String, Object> map2 = this.LJLJJI;
        o.LJIIIZ(gson, "gson");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (config != null && (tiktokEffectHouse = config.tiktokEffectHouse) != null) {
            str = tiktokEffectHouse.toolVersion;
        } else {
            str = null;
        }
        linkedHashMap.put("isEHEffect", Boolean.valueOf(C78685UuP.LJJJZ(str)));
        if (map2 != null) {
            linkedHashMap.put("triggerJson", map2);
        }
        String json = GsonProtectorUtils.toJson(gson, linkedHashMap);
        o.LJIIIIZZ(json, "gson.toJson(sdkExtra)");
        return json;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
