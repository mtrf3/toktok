package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.GoQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42642GoQ extends AbstractC43040Guq {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC43031Guh interfaceC43031Guh = (InterfaceC43031Guh) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String itemID = interfaceC43031Guh.getItemID();
        String musicID = interfaceC43031Guh.getMusicID();
        PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
        C42622Go6.LJIIIZ(itemID, musicID);
    }
}
