package com.ss.android.ugc.feed.platform.cell.component.playerview;

import X.C221108m2;
import X.C221888nI;
import X.C223038p9;
import X.C224238r5;
import X.C2K0;
import X.C51029K0z;
import X.C55096Ljo;
import X.C62822Ol8;
import X.InterfaceC55102Lju;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class CellPlayerViewComponent extends BaseCellContentComponent implements CellPlayerViewAbility, InterfaceC55102Lju {
    public final C62822Ol8 LL;

    @Override // X.C8XO
    /* renamed from: b4, reason: merged with bridge method [inline-methods] */
    public void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    public C2K0 provideAbility(String str) {
        if (str.hashCode() != 1059232495) {
            return null;
        }
        return this;
    }

    public CellPlayerViewComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(C221888nI.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewAbility
    public final C223038p9 cB() {
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return new C223038p9(context, aweme, (C224238r5) this.LL.getValue(), aweme.getOcrLocation(), (ViewGroup) getContainerView(), (CellAdaptionComponentAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), CellAdaptionComponentAbility.class, null));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }
}
