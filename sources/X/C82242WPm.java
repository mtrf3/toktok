package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WPm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82242WPm extends C82241WPl {
    public final /* synthetic */ C82247WPr LJIIIIZZ;

    @Override // X.C82241WPl
    public final void LJIJ(List<EffectCategoryResponse> tabDataList) {
        float f;
        o.LJIIIZ(tabDataList, "tabDataList");
        C80695Vlj setTabModeWithTabContent = this.LJI;
        int size = this.LIZIZ.size() + tabDataList.size();
        ArrayList arrayList = new ArrayList(C32I.LJJL(tabDataList, 10));
        Iterator<EffectCategoryResponse> it = tabDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        o.LJIIIZ(setTabModeWithTabContent, "$this$setTabModeWithTabContent");
        C78897Uxp.LJJJJZ(setTabModeWithTabContent, size);
        if (!C77413UZt.LJIILL(arrayList)) {
            Paint paint = new Paint();
            Context context = setTabModeWithTabContent.getContext();
            o.LJIIIIZZ(context, "context");
            paint.setTextSize(C74275TDb.LIZIZ(context, 15.0f));
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str != null) {
                    f = paint.measureText(str);
                } else {
                    f = 0.0f;
                }
                if (f > i) {
                    i = (int) f;
                }
            }
            float f2 = i;
            Context context2 = setTabModeWithTabContent.getContext();
            o.LJIIIIZZ(context2, "context");
            if (f2 > C74275TDb.LIZIZ(context2, 50.0f) && size > 2) {
                setTabModeWithTabContent.setTabMode(0);
            }
        }
        super.LJIJ(tabDataList);
    }

    @Override // X.C82241WPl
    public final THN LJIILJJIL(Context context, EffectCategoryResponse tabData) {
        o.LJIIIZ(tabData, "tabData");
        THN LJIILJJIL = super.LJIILJJIL(context, tabData);
        InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns = this.LJIIIIZZ.LJIILL.LJFF.LJFF;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LJIILJJIL);
        }
        return LJIILJJIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82242WPm(C82247WPr c82247WPr, C74473TKr c74473TKr, C80695Vlj c80695Vlj, InterfaceC82245WPp interfaceC82245WPp) {
        super(c74473TKr, c80695Vlj, interfaceC82245WPp);
        this.LJIIIIZZ = c82247WPr;
    }
}
