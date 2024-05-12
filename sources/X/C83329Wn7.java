package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Wn7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83329Wn7 extends TBS implements InterfaceC88472Yns<ComposerNode, C76800UCe> {
    public C83329Wn7(C83328Wn6 c83328Wn6) {
        super(1, c83328Wn6, C83328Wn6.class, "doOnClick", "doOnClick(Lcom/ss/android/ugc/effectmanager/effect/model/ComposerNode;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ComposerNode composerNode) {
        ComposerNode p0 = composerNode;
        o.LJIIIZ(p0, "p0");
        C83328Wn6 c83328Wn6 = (C83328Wn6) this.receiver;
        if (c83328Wn6.LJLJLJ.contains(p0)) {
            c83328Wn6.LJLJLJ.remove(p0);
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
        } else if (ujb.o.LJJJJIZL(p0.UI_name, "clear", true)) {
            c83328Wn6.LJIILIIL();
            c83328Wn6.LJLJJL.k();
        } else {
            c83328Wn6.LJLJJI.fetchEffect(p0.effect, new C83330Wn8(c83328Wn6, p0));
        }
        return C76800UCe.LIZ;
    }
}
