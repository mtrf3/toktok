package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Link;
import fjb.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredFeatures$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63632ed extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends String>>, Object> {
    public final /* synthetic */ Config LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63632ed(Config config, InterfaceC67352kd<? super C63632ed> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = config;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63632ed(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        List<Link> list2;
        C141335gf.LIZJ(obj);
        Config config = this.LJLIL;
        o.LJIIIZ(config, "config");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Effect effect = config.effect;
        if (effect != null && (list2 = effect.links) != null) {
            for (Link link : list2) {
                String str = link.type;
                if (str != null) {
                    linkedHashSet.add(str);
                }
                if (link.rawType != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("OLD_ENGINE_");
                    LIZ.append(link.rawType);
                    linkedHashSet.add(X1D.LIZIZ(LIZ));
                }
            }
        }
        Effect effect2 = config.effect;
        if (effect2 != null) {
            list = effect2.bgms;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            linkedHashSet.add("bgm");
        }
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (new OJD("^AR(V\\d+)?$").containsMatchIn((String) it.next())) {
                    linkedHashSet.add("AR");
                    break;
                }
            }
        }
        return ORZ.LLJI(linkedHashSet);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
