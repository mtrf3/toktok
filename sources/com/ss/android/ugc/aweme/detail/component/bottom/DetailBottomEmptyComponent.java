package com.ss.android.ugc.aweme.detail.component.bottom;

import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class DetailBottomEmptyComponent extends BasePanelUIComponent implements IDetailBottomProtocol {
    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View K2(ViewGroup viewGroup) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void h1() {
    }

    public DetailBottomEmptyComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IDetailBottomProtocol.class, C47261Igj.LJJIJIL(this));
    }
}
