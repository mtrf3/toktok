package com.ss.android.ugc.aweme.detail.component.biz;

import X.C17N;
import X.C221108m2;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C62822Ol8;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class StoryBottomPlaceHolderComponent extends BasePanelComponent implements IDetailBottomProtocol {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 104));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void h1() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IDetailBottomProtocol.class, C47261Igj.LJJIJIL(this));
        C17N.LJJIIJZLJL((View) this.LJLIL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View K2(ViewGroup viewGroup) {
        return (View) this.LJLIL.getValue();
    }
}
