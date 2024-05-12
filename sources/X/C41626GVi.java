package X;

import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GVi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41626GVi extends C41627GVj {
    public static final java.util.Map<String, List<InterfaceC41631GVn>> LJLLILLLL = new LinkedHashMap();
    public final String LJLL;
    public final GOW LJLLI;

    @Override // X.C41627GVj
    public final void LIZ(boolean z) {
        GUQ LIZ = this.LJLLI.LIZ(this.LJLILLLLZI);
        if (LIZ == null) {
            C41629GVl.LIZ(this.LJLL);
            super.LIZ(z);
            return;
        }
        if (!z) {
            java.util.Map<String, List<InterfaceC41631GVn>> map = LJLLILLLL;
            String str = this.LJLL;
            if (str == null) {
                str = "";
            }
            List list = (List) ((LinkedHashMap) map).get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GUH.LJJ((InterfaceC41605GUn) it.next());
                }
            }
            C41629GVl.LIZ(this.LJLL);
            return;
        }
        GUH.LJJ(this);
        LIZLLL(LIZ.LJLJJL.LIZ, new AqS173S0100000_7(this, 326));
    }

    public final OSJ<Integer, Integer, Float> LJFF(float f) {
        StoryGroupPublishModel storyGroupPublishModel = this.LJLJI.storyGroupPublishModel;
        if (storyGroupPublishModel != null) {
            float f2 = 1.0f / storyGroupPublishModel.scheduleCount;
            return new OSJ<>(Integer.valueOf(storyGroupPublishModel.childCount), Integer.valueOf(storyGroupPublishModel.childIndex + 1), Float.valueOf((f * f2) + (storyGroupPublishModel.scheduleIndex * f2 * 100)));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C41627GVj, X.InterfaceC41605GUn
    public final void U9(int i, boolean z) {
        OSJ<Integer, Integer, Float> LJFF = LJFF(i);
        if (LJFF.getThird().floatValue() < this.LJLJLJ) {
            this.LJLJJL.LIZIZ.setValue(new OSJ<>(LJFF.getFirst(), LJFF.getSecond(), Float.valueOf(this.LJLJLJ)));
        } else {
            this.LJLJJL.LIZIZ.setValue(LJFF);
            this.LJLJL = (int) LJFF.getThird().floatValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41626GVi(InterfaceC41630GVm interfaceC41630GVm, String str, PublishModel publishModel, String str2) {
        super(interfaceC41630GVm, str, publishModel);
        GOV gov = GOV.LIZ;
        this.LJLL = str2;
        this.LJLLI = gov;
        if (o.LJ(str, ((IAVPublishService) this.LJLJJLL.getValue()).getCurrentPublishTaskId())) {
            C41625GVh c41625GVh = this.LJLJJL;
            c41625GVh.LIZIZ.setValue(LJFF(0.0f));
        }
    }
}
