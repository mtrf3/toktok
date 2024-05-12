package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C240639cR;
import X.C240719cZ;
import X.C26338AVi;
import X.C78983UzD;
import X.C79045V0n;
import X.C8XO;
import X.T28;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DefaultBackgroundAssem extends ReusedUISlotAssem<DefaultBackgroundAssem> implements C8XO<C240719cZ> {
    public View LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        return R.layout.c67;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public DefaultBackgroundAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        m4(item.LJLILLLLZI);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    public void m4(C240639cR musicItemModel) {
        Integer LJI;
        o.LJIIIZ(musicItemModel, "musicItemModel");
        if (musicItemModel.LJLJI) {
            C78983UzD.LJJLIIIJL(Y3());
            int i = 0;
            C26338AVi.LJI(Y3(), 0, 0, 0, 0, false, 16);
            View view = this.LLFF;
            if (view == null) {
                return;
            }
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            Context context = getContext();
            if (context != null && (LJI = C79045V0n.LJI(R.attr.cv, context)) != null) {
                i = LJI.intValue();
            }
            LIZIZ.setColor(i);
            view.setBackground(LIZIZ);
            return;
        }
        C78983UzD.LJJIL(Y3());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = view.findViewById(R.id.gqp);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
