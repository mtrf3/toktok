package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4Kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107584Kc {
    public final IMContact LIZ;
    public final SharePackage LIZIZ;
    public final C33R<EnumC107604Ke> LIZJ;
    public final InterfaceC70422pa LIZLLL;
    public final Context LJ;
    public final SharePanelViewModel LJFF;
    public final C107724Kq LJI;
    public XKQ LJII;

    public C107584Kc(IMContact iMContact, SharePackage sharePackage, C33R c33r, Context context, SharePanelViewModel sharePanelViewModel, C107724Kq c107724Kq) {
        C107574Kb c107574Kb = C107574Kb.LJLIL;
        o.LJIIIZ(sharePanelViewModel, "sharePanelViewModel");
        this.LIZ = iMContact;
        this.LIZIZ = sharePackage;
        this.LIZJ = c33r;
        this.LIZLLL = c107574Kb;
        this.LJ = context;
        this.LJFF = sharePanelViewModel;
        this.LJI = c107724Kq;
    }
}
