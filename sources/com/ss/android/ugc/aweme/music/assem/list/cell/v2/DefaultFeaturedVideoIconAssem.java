package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C240719cZ;
import X.C44384HbQ;
import X.C7MY;
import X.C8XO;
import X.EnumC240989d0;
import X.KL2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultFeaturedVideoIconAssem extends ReusedUISlotAssem<DefaultFeaturedVideoIconAssem> implements C8XO<C240719cZ> {
    public TuxIconView LLFF;
    public TuxIconView LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6_;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultFeaturedVideoIconAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void q4(C240719cZ item) {
        o.LJIIIZ(item, "item");
        n4(C44384HbQ.LLILLJJLI(item.LJLIL.getPinnedVideoStatus()));
    }

    public final void n4(EnumC240989d0 pinnedVideoStatus) {
        o.LJIIIZ(pinnedVideoStatus, "pinnedVideoStatus");
        if (pinnedVideoStatus == EnumC240989d0.NOT_ALLOWED_SHOWN) {
            TuxIconView tuxIconView = this.LLFF;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TuxIconView tuxIconView2 = this.LLFFF;
            if (tuxIconView2 == null) {
                return;
            }
            tuxIconView2.setVisibility(8);
            return;
        }
        if (pinnedVideoStatus == EnumC240989d0.HAS_PINNED) {
            TuxIconView tuxIconView3 = this.LLFFF;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(8);
            }
        } else {
            TuxIconView tuxIconView4 = this.LLFFF;
            if (tuxIconView4 != null) {
                tuxIconView4.setVisibility(0);
            }
        }
        TuxIconView tuxIconView5 = this.LLFF;
        if (tuxIconView5 == null) {
            return;
        }
        tuxIconView5.setVisibility(0);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.gqw);
        if (tuxIconView != null) {
            int LIZIZ = C7MY.LIZIZ(10);
            int i = -LIZIZ;
            KL2.LJII(tuxIconView, i, i, LIZIZ, LIZIZ);
        } else {
            tuxIconView = null;
        }
        this.LLFF = tuxIconView;
        this.LLFFF = (TuxIconView) view.findViewById(R.id.gr7);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
