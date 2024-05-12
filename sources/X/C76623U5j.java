package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.U5j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76623U5j<T> implements InterfaceC64592gB {
    public final /* synthetic */ U7T LJLIL;
    public final /* synthetic */ LinkUser LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ OnLineMicInfo LJLJJI;
    public final /* synthetic */ LayoutDSLConfig LJLJJL;
    public final /* synthetic */ LinkLayerMessage LJLJJLL;
    public final /* synthetic */ LinkUser LJLJL;

    public C76623U5j(U7T u7t, LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, LinkLayerMessage linkLayerMessage, LinkUser linkUser2) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = linkUser;
        this.LJLJI = i;
        this.LJLJJI = onLineMicInfo;
        this.LJLJJL = layoutDSLConfig;
        this.LJLJJLL = linkLayerMessage;
        this.LJLJL = linkUser2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        U7T u7t = this.LJLIL;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = this.LJLILLLLZI;
        int i = this.LJLJI;
        OnLineMicInfo onLineMicInfo = this.LJLJJI;
        LayoutDSLConfig layoutDSLConfig = this.LJLJJL;
        LinkLayerMessage linkLayerMessage = this.LJLJJLL;
        LinkUser linkUser2 = this.LJLJL;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LLD(u7t, new PermitApplyMessage(linkUser, i, onLineMicInfo, layoutDSLConfig, U7V.LJIILL(linkLayerMessage, null), linkUser2));
        }
    }
}
