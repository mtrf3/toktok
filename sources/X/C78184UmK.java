package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.gift.render.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UmK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78184UmK extends AbstractC77382UYo<java.util.Map<C32449CoP, ? extends C78183UmJ>> {
    public final List<C32449CoP> LIZIZ;
    public InterfaceC88472Yns<? super java.util.Map<C32449CoP, C78183UmJ>, C76800UCe> LIZJ;
    public InterfaceC88472Yns<? super C78163Ulz, C76800UCe> LIZLLL;
    public java.util.Map<C32449CoP, C78183UmJ> LJ;

    @Override // X.InterfaceC77384UYq
    public final /* bridge */ /* synthetic */ Object getResult() {
        return this.LJ;
    }

    public C78184UmK(List<C32449CoP> list) {
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC77384UYq
    public final void LIZ(InterfaceC88472Yns<? super java.util.Map<C32449CoP, C78183UmJ>, C76800UCe> resolve, InterfaceC88472Yns<? super C78163Ulz, C76800UCe> reject) {
        InterfaceC88472Yns<C32449CoP, InterfaceC77384UYq<String>> interfaceC88472Yns;
        InterfaceC77384UYq<String> invoke;
        o.LJIIIZ(resolve, "resolve");
        o.LJIIIZ(reject, "reject");
        this.LIZJ = resolve;
        this.LIZLLL = reject;
        List<C32449CoP> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (C32449CoP c32449CoP : list) {
            Effect effect = c32449CoP.LIZ;
            if (effect != null && effect.LIZ().resourceType == AssetsModel.RESOURCE_TYPE_MP4) {
                C32224Ckm c32224Ckm = C32231Ckt.LIZ;
                if (c32224Ckm != null && (interfaceC88472Yns = c32224Ckm.LJII) != null && (invoke = interfaceC88472Yns.invoke(c32449CoP)) != null) {
                    arrayList.add(new OSZ(invoke, c32449CoP));
                } else {
                    throw new IllegalStateException("can't find gift downloader when play combination gift");
                }
            }
        }
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = arrayList.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            InterfaceC77384UYq interfaceC77384UYq = (InterfaceC77384UYq) osz.getFirst();
            C32449CoP c32449CoP2 = (C32449CoP) osz.getSecond();
            interfaceC77384UYq.LIZ(new AqS58S0400000_13(c76732zl, (C76732zl) linkedHashMap, (java.util.Map<C32449CoP, C78183UmJ>) c32449CoP2, (C32449CoP) this, (C78184UmK) 11), new AqS58S0400000_13(c76732zl, (C76732zl) linkedHashMap, (java.util.Map<C32449CoP, C78183UmJ>) c32449CoP2, (C32449CoP) this, (C78184UmK) 12));
        }
    }
}
