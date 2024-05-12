package com.ss.android.ugc.feed.platform.cell;

import X.KUK;
import X.X1D;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.clearmode.ExitClearModeAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class BaseCellPlaceHolderComponent extends BaseCellContentComponent<BaseCellPlaceHolderComponent> implements KUK {
    public final String LL;

    public BaseCellPlaceHolderComponent() {
        this(0);
    }

    public boolean b4() {
        return this instanceof ExitClearModeAssem;
    }

    @Override // X.C8XO
    /* renamed from: c4, reason: merged with bridge method [inline-methods] */
    public void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append(this.LL);
        return X1D.LIZIZ(LIZ);
    }

    public BaseCellPlaceHolderComponent(String viewTag) {
        o.LJIIIZ(viewTag, "viewTag");
        new LinkedHashMap();
        this.LL = viewTag;
    }

    public /* synthetic */ BaseCellPlaceHolderComponent(int i) {
        this("");
    }
}
