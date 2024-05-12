package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WkK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83156WkK {
    public final /* synthetic */ C83167WkV LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final BeautyCategoryExtra LIZ() {
        String abGroup = String.valueOf(this.LIZ.LIZJ);
        String panelType = ILU.ALL.getFlag();
        boolean z = false;
        o.LJIIIZ(abGroup, "abGroup");
        o.LJIIIZ(panelType, "panelType");
        boolean z2 = true;
        return new BeautyCategoryExtra(abGroup, z2, z2, z, panelType, z, z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 16256, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EffectCategoryResponse LIZIZ() {
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, 1, 0 == true ? 1 : 0);
        effectCategoryResponse.setId("-10000");
        String string = this.LIZ.LIZIZ.getResources().getString(R.string.c58);
        o.LJIIIIZZ(string, "context.resources.getStr….string.beauty_musically)");
        effectCategoryResponse.setName(string);
        return effectCategoryResponse;
    }

    public final List<C83162WkQ> LIZJ() {
        int i;
        C83167WkV c83167WkV = this.LIZ;
        c83167WkV.getClass();
        ArrayList arrayList = new ArrayList();
        if (!o.LJ(c83167WkV.LIZLLL, "") && !o.LJ(c83167WkV.LJ, "")) {
            if (c83167WkV.LJFF) {
                i = 35;
            } else {
                i = 60;
            }
            arrayList.add(new C83162WkQ(R.drawable.b5q, "-1000", "-1000", C29822Bn8.LIZ(c83167WkV.LIZIZ, R.string.byi, "context.resources.getStr…ng.av_beauty_smooth_skin)"), c83167WkV.LIZLLL, i, "Smooth_ALL"));
            if (!c83167WkV.LJFF) {
                arrayList.add(new C83162WkQ(R.drawable.b5r, "-1001", "-1001", C29822Bn8.LIZ(c83167WkV.LIZIZ, R.string.byh, "context.resources.getStr…string.av_beauty_reshape)"), c83167WkV.LJ, 40, "Face_ALL"));
                arrayList.add(new C83162WkQ(R.drawable.b5n, "-1002", "-1002", C29822Bn8.LIZ(c83167WkV.LIZIZ, R.string.byd, "context.resources.getStr…string.av_beauty_big_eye)"), c83167WkV.LJ, 30, "Eye_ALL"));
            }
        }
        return arrayList;
    }

    public C83156WkK(C83167WkV c83167WkV) {
        this.LIZ = c83167WkV;
    }
}
