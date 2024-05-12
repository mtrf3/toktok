package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31842Cec extends AbstractC31844Cee {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        InterfaceC31843Ced interfaceC31843Ced = (InterfaceC31843Ced) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C29929Bor c29929Bor = new C29929Bor();
        String coverUrl = interfaceC31843Ced.getCoverUrl();
        String innerUrl = interfaceC31843Ced.getInnerUrl();
        String outerUrl = interfaceC31843Ced.getOuterUrl();
        String title = interfaceC31843Ced.getTitle();
        String titleStarlingKey = interfaceC31843Ced.getTitleStarlingKey();
        List<String> titleStarlingKeyArgs = interfaceC31843Ced.getTitleStarlingKeyArgs();
        String desc = interfaceC31843Ced.getDesc();
        String senderPreviewText = interfaceC31843Ced.getSenderPreviewText();
        String senderPreviewTextStarlingKey = interfaceC31843Ced.getSenderPreviewTextStarlingKey();
        C62819Ol5.LJ(c29929Bor, coverUrl, innerUrl, outerUrl, title, desc, senderPreviewText, interfaceC31843Ced.getReceiverPreviewText(), interfaceC31843Ced.getQuotePreviewText(), titleStarlingKey, titleStarlingKeyArgs, senderPreviewTextStarlingKey, interfaceC31843Ced.getReceiverPreviewTextStarlingKey(), interfaceC31843Ced.getQuotePreviewTextStarlingKey(), interfaceC31843Ced.getOuterTitle(), interfaceC31843Ced.getOuterDescription(), 175104);
        IHostShare iHostShare = (IHostShare) CN1.LIZ(IHostShare.class);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        iHostShare.shareSubscribeLink(activity, new C29930Bos(c29929Bor), new C31840Cea(this, c37356ElM));
    }
}
