package X;

import com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TEL implements IFetchEffectListByIdsListener {
    public final /* synthetic */ AqS143S0200000_12 LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
    }

    public TEL(AqS143S0200000_12 aqS143S0200000_12) {
        this.LIZ = aqS143S0200000_12;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        boolean z;
        List<Effect> arrayList;
        EffectListResponse effectListResponse2 = effectListResponse;
        o.LJI(effectListResponse2);
        List<Effect> list = effectListResponse2.getData();
        ((OriginalStickerViewModel) this.LIZ.l0).LJLJJL.setValue(TEN.NONE);
        OriginalStickerViewModel originalStickerViewModel = (OriginalStickerViewModel) this.LIZ.l0;
        if (originalStickerViewModel.LJLZ == 0) {
            z = true;
        } else {
            z = false;
        }
        List<Effect> value = originalStickerViewModel.LJLILLLLZI.getValue();
        if (value != null) {
            arrayList = ORZ.LLJILJILJ(value);
        } else {
            arrayList = new ArrayList<>();
        }
        if (z) {
            arrayList.clear();
        } else if (list.size() > 10) {
            list = list.subList(0, 10);
        }
        OriginalStickerViewModel originalStickerViewModel2 = (OriginalStickerViewModel) this.LIZ.l0;
        originalStickerViewModel2.getClass();
        o.LJIIIZ(list, "list");
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            arrayList2.add(originalStickerViewModel2.LJZI);
        }
        for (Effect effect : list) {
            if (!o.LJ(effect.getEffect_id(), originalStickerViewModel2.LJZI.getEffect_id())) {
                arrayList2.add(effect);
            }
        }
        arrayList.addAll(arrayList2);
        ((OriginalStickerViewModel) this.LIZ.l0).LJLILLLLZI.setValue(arrayList);
        ((OriginalStickerViewModel) this.LIZ.l0).kv0(arrayList);
        ((OriginalStickerViewModel) this.LIZ.l0).LJLZ++;
    }
}
