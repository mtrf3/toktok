package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.AlgorithmConfig;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Content;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Node;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredRequirements$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63582eY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super java.util.Map<String, ? extends Boolean>>, Object> {
    public final /* synthetic */ Config LJLIL;
    public final /* synthetic */ AlgorithmConfig LJLILLLLZI;
    public final /* synthetic */ Content LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63582eY(Config config, AlgorithmConfig algorithmConfig, Content content, InterfaceC67352kd<? super C63582eY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = config;
        this.LJLILLLLZI = algorithmConfig;
        this.LJLJI = content;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63582eY(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        java.util.Map<String, Boolean> map;
        java.util.Set<Map.Entry<String, Boolean>> entrySet;
        List<Node> list;
        Effect effect;
        java.util.Map<String, Boolean> map2;
        java.util.Set<Map.Entry<String, Boolean>> entrySet2;
        C141335gf.LIZJ(obj);
        Config config = this.LJLIL;
        AlgorithmConfig algorithmConfig = this.LJLILLLLZI;
        Content content = this.LJLJI;
        ArrayList arrayList = new ArrayList();
        if (config != null && (effect = config.effect) != null && (map2 = effect.requirement) != null && (entrySet2 = map2.entrySet()) != null) {
            for (Map.Entry<String, Boolean> entry : entrySet2) {
                o.LJIIIZ(entry, "<this>");
                arrayList.add(new OSZ(entry.getKey(), entry.getValue()));
            }
        }
        if (algorithmConfig != null && (list = algorithmConfig.nodes) != null) {
            Iterator<Node> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OSZ(it.next().type, Boolean.TRUE));
            }
        }
        if (content != null && (map = content.requirement) != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry<String, Boolean> entry2 : entrySet) {
                o.LJIIIZ(entry2, "<this>");
                arrayList.add(new OSZ(entry2.getKey(), entry2.getValue()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz = (OSZ) it2.next();
            Boolean bool = (Boolean) linkedHashMap.get(osz.getFirst());
            boolean z2 = false;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Object first = osz.getFirst();
            if (z || ((Boolean) osz.getSecond()).booleanValue()) {
                z2 = true;
            }
            linkedHashMap.put(first, Boolean.valueOf(z2));
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super java.util.Map<String, ? extends Boolean>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
