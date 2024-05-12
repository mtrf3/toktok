package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6H4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6H4 {
    public static final void LIZLLL(StickerNewEngineModel stickerNewEngineModel) {
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        for (EnumC157656Gr enumC157656Gr : EnumC157656Gr.values()) {
            LIZJ(stickerNewEngineModel, enumC157656Gr);
        }
    }

    public static final List<StickerModel> LJ(StickerNewEngineModel stickerNewEngineModel) {
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(stickerNewEngineModel.addYoursStickerModels);
        arrayList.addAll(stickerNewEngineModel.textStickerModels);
        return arrayList;
    }

    public static final boolean LJFF(StickerNewEngineModel stickerNewEngineModel) {
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        return !stickerNewEngineModel.addYoursStickerModels.isEmpty();
    }

    public static final boolean LJI(StickerNewEngineModel stickerNewEngineModel) {
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        if ((!stickerNewEngineModel.addYoursStickerModels.isEmpty()) || (!stickerNewEngineModel.textStickerModels.isEmpty())) {
            return true;
        }
        return false;
    }

    public static final void LIZ(StickerNewEngineModel stickerNewEngineModel, StickerModel stickerModel) {
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        o.LJIIIZ(stickerModel, "stickerModel");
        if (stickerModel instanceof AddYoursStickerModel) {
            LIZIZ(stickerNewEngineModel, stickerModel);
            stickerNewEngineModel.addYoursStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof TextStickerModel) {
            Iterator<TextStickerModel> it = stickerNewEngineModel.textStickerModels.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().getId() == stickerModel.getId()) {
                    if (i >= 0) {
                        ListProtector.set(stickerNewEngineModel.textStickerModels, i, stickerModel);
                        return;
                    }
                } else {
                    i++;
                }
            }
            stickerNewEngineModel.textStickerModels.add(stickerModel);
            return;
        }
        if (!(stickerModel instanceof AICaptionTagStickerModel)) {
            return;
        }
        LIZIZ(stickerNewEngineModel, stickerModel);
        stickerNewEngineModel.aiCaptionTagStickers.add(stickerModel);
    }

    public static final void LIZIZ(StickerNewEngineModel stickerNewEngineModel, StickerModel stickerModel) {
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        o.LJIIIZ(stickerModel, "stickerModel");
        AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(stickerModel, 481);
        int i = C6H0.LIZ[stickerModel.getStickerType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJII(aqS168S0100000_2, stickerNewEngineModel.aiCaptionTagStickers);
                return;
            }
            LJII(aqS168S0100000_2, stickerNewEngineModel.textStickerModels);
            return;
        }
        LJII(aqS168S0100000_2, stickerNewEngineModel.addYoursStickerModels);
    }

    public static final void LIZJ(StickerNewEngineModel stickerNewEngineModel, EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        o.LJIIIZ(stickerType, "stickerType");
        int i = C6H0.LIZ[stickerType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                stickerNewEngineModel.aiCaptionTagStickers.clear();
                return;
            }
            stickerNewEngineModel.textStickerModels.clear();
            return;
        }
        stickerNewEngineModel.addYoursStickerModels.clear();
    }

    public static final void LJII(final InterfaceC88472Yns filter, List list) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(filter, "filter");
        if (Build.VERSION.SDK_INT >= 24) {
            list.removeIf(new Predicate(filter) { // from class: X.6HA
                public final /* synthetic */ InterfaceC88472Yns LIZ;

                {
                    o.LJIIIZ(filter, "function");
                    this.LIZ = filter;
                }

                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) this.LIZ.invoke(obj)).booleanValue();
                }
            });
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) filter.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }
}
