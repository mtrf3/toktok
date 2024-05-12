package com.ss.android.ugc.aweme.share.core.protocol;

import X.C65776Prg;
import X.InterfaceC99233ux;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* loaded from: classes11.dex */
public abstract class ShareConfiguration<T extends BaseSharePackage> implements InterfaceC99233ux {
    public abstract CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage);

    public abstract String LIZJ();

    public abstract C65776Prg LIZLLL();

    public abstract ShareChannelProtocol LJ(BaseSharePackage baseSharePackage);

    public abstract SharePanelLogicProtocol LJFF(BaseSharePackage baseSharePackage);

    public abstract ShareTitleProtocol LJI(BaseSharePackage baseSharePackage);

    public abstract SheetActionProtocol LJII(BaseSharePackage baseSharePackage);
}
