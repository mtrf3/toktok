package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XGD<S> extends XI6<S> {
    public final C64962gm LJLJI;

    public abstract Object LJIILL(Object obj);

    public XGD(C65776Prg c65776Prg) {
        super(c65776Prg);
        this.LJLJI = C48841JEv.LIZ(C78613UtF.LIZJ);
    }

    public final <D extends InterfaceC199277rv, M extends XGE<D>> void LJIILIIL(String id, M m, D d, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr2, InterfaceC88472Yns<? super C57355Mf9<D>, C57355Mf9<D>> interfaceC88472Yns, InterfaceC88473Ynt<? super String, ? super InterfaceC199277rv, ? super Boolean, ? extends List<? extends IMotaCache>> converter) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(converter, "converter");
        XKX.LIZLLL(this.LJLJI, null, null, new XGF(m, id, d, interfaceC88472Yns, converter, this, interfaceC88471Ynr, interfaceC88471Ynr2, null), 3);
    }
}
