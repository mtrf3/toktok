package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Tnu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75734Tnu implements UC4 {
    public final /* synthetic */ U65 LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.UC4
    public final void LIZ(DslLayout dslLayout) {
        o.LJIIIZ(dslLayout, "dslLayout");
        this.LIZ.LJFF().LJII(dslLayout);
        if (this.LIZ.LJLILLLLZI == 2) {
            String str = "";
            for (Map.Entry<String, Layout> entry : dslLayout.getData().entrySet()) {
                String key = entry.getKey();
                if (o.LJ(entry.getValue().getLayoutId(), this.LIZIZ)) {
                    MultiCohostAreaExpandSetting multiCohostAreaExpandSetting = MultiCohostAreaExpandSetting.INSTANCE;
                    if (!o.LJ(multiCohostAreaExpandSetting.getLastCohostLayoutId(), this.LIZIZ)) {
                        multiCohostAreaExpandSetting.setLastCohostLayoutId(this.LIZIZ);
                    }
                    str = key;
                }
            }
            this.LIZ.LJFF().LJJLIIIJJI(str, false);
        }
    }

    public C75734Tnu(U65 u65, String str) {
        this.LIZ = u65;
        this.LIZIZ = str;
    }
}
