package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E8O<T, R> implements InterfaceC48038ItG<OSZ<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {
    public static final E8O LJLIL = new E8O();

    @Override // X.InterfaceC48038ItG
    public final List<? extends InfoStickerEffect> apply(OSZ<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> osz) {
        OSZ<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> osz2 = osz;
        o.LJIIIZ(osz2, "<name for destructuring parameter 0>");
        return osz2.getFirst();
    }
}
