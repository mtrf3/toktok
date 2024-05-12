package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;

/* renamed from: X.HMt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43951HMt implements IAVInfoService.IFilterMedia<Integer> {
    public final /* synthetic */ ArrayList<MusicModel> LIZ;

    public C43951HMt(ArrayList<MusicModel> arrayList) {
        this.LIZ = arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia
    public final boolean filter(Integer num) {
        int duration = ((MusicModel) ListProtector.get(this.LIZ, num.intValue())).getDuration();
        if (duration >= 1000 && duration <= 1200000) {
            return true;
        }
        return false;
    }
}
