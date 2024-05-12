package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wn8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83330Wn8 implements IFetchEffectListener {
    public final /* synthetic */ C83328Wn6 LIZ;
    public final /* synthetic */ ComposerNode LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        InterfaceC74281TDh value;
        Effect effect2 = effect;
        this.LIZ.LJLJLJ.add(this.LIZIZ);
        C83328Wn6 c83328Wn6 = this.LIZ;
        InterfaceC83192Wku interfaceC83192Wku = c83328Wn6.LJLJJL;
        C65737Pr3 c65737Pr3 = c83328Wn6.LJLJLJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(c65737Pr3, 10));
        Iterator<ComposerNode> it = c65737Pr3.iterator();
        while (it.hasNext()) {
            ComposerNode next = it.next();
            String unzipPath = next.effect.getUnzipPath();
            o.LJI(unzipPath);
            String extra = next.effect.getExtra();
            if (extra == null) {
                extra = "";
            }
            arrayList.add(new ComposerInfo(unzipPath, extra, (String) null, 12));
        }
        interfaceC83192Wku.a(arrayList, 20000);
        InterfaceC45910I0c l = this.LIZ.LJLJJL.l();
        o.LJI(effect2);
        String unzipPath2 = effect2.getUnzipPath();
        o.LJI(unzipPath2);
        String str = this.LIZIZ.tag_name;
        o.LJIIIIZZ(str, "node.tag_name");
        C83328Wn6 c83328Wn62 = this.LIZ;
        float f = this.LIZIZ.default_value;
        c83328Wn62.getClass();
        l.LIZIZ(unzipPath2, str, f / 100.0f).commit();
        C5H3<? extends InterfaceC74281TDh> c5h3 = this.LIZ.LJLL;
        if (c5h3 != null && (value = c5h3.getValue()) != null) {
            ComposerNode composerNode = this.LIZIZ;
            C83328Wn6 c83328Wn63 = this.LIZ;
            c83328Wn63.getClass();
            value.LIZIZ(composerNode, new AqS145S0200000_14(c83328Wn63, composerNode, 48));
        }
    }

    public C83330Wn8(C83328Wn6 c83328Wn6, ComposerNode composerNode) {
        this.LIZ = c83328Wn6;
        this.LIZIZ = composerNode;
    }
}
