package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes16.dex */
public final class XGB<D> extends AbstractC65781Prl implements InterfaceC88471Ynr<D, Boolean, List<? extends IMotaCache>> {
    public final /* synthetic */ InterfaceC88473Ynt<String, InterfaceC199277rv, Boolean, List<IMotaCache>> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public XGB(InterfaceC88473Ynt<? super String, ? super InterfaceC199277rv, ? super Boolean, ? extends List<? extends IMotaCache>> interfaceC88473Ynt, String str) {
        super(2);
        this.LJLIL = interfaceC88473Ynt;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends IMotaCache> invoke(Object data, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(data, "data");
        return this.LJLIL.invoke(this.LJLILLLLZI, data, Boolean.valueOf(booleanValue));
    }
}
