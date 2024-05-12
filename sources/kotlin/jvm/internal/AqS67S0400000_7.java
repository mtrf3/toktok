package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C142625ik;
import X.C1M5;
import X.C42898GsY;
import X.C44701HgX;
import X.C76800UCe;
import X.GX0;
import X.H9V;
import X.H9Z;
import X.HPU;
import X.HZV;
import X.InterfaceC65784Pro;
import X.V16;
import X.W5G;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import defpackage.e1;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS67S0400000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS67S0400000_7 aqS67S0400000_7) {
        if (((RecordConfig) aqS67S0400000_7.l0).getReshootConfig().getEnableReshoot()) {
            ((HPU) aqS67S0400000_7.l1).LIZJ((Context) aqS67S0400000_7.l2, (Intent) aqS67S0400000_7.l3, ((RecordConfig) aqS67S0400000_7.l0).getKeepChallenges(), ((RecordConfig) aqS67S0400000_7.l0).getReshootConfig());
        } else {
            ((HPU) aqS67S0400000_7.l1).LIZIZ((Context) aqS67S0400000_7.l2, (Intent) aqS67S0400000_7.l3, ((RecordConfig) aqS67S0400000_7.l0).getKeepChallenges());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS67S0400000_7 aqS67S0400000_7) {
        EffectTextModel effectTextModel = ((VideoPublishEditModel) aqS67S0400000_7.l0).getCoverPublishModel().getEffectTextModel();
        Bitmap bitmap = (Bitmap) aqS67S0400000_7.l1;
        o.LJI(bitmap);
        Bitmap mergeCoverText = effectTextModel.mergeCoverText(bitmap);
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS67S0400000_7.l2;
        if (activityC45651qj != null) {
            ((W5G) aqS67S0400000_7.l3).setImageDrawable(new C1M5(activityC45651qj.getResources(), mergeCoverText));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS67S0400000_7 aqS67S0400000_7) {
        if (V16.LJJIJIIJI(((H9V) aqS67S0400000_7.l0).LIZ.LIZIZ) && !C44701HgX.LJIIJJI(((H9V) aqS67S0400000_7.l0).LIZ.LIZIZ.creativeModel)) {
            boolean z = true;
            if (e1.LIZ(31744, "studio_upload_single_photo_land_story", true, true)) {
                Intent intent = (Intent) aqS67S0400000_7.l1;
                ((H9Z) aqS67S0400000_7.l2).getClass();
                intent.putExtra("extra_nows_data", new NowsShootModel(3, null, null, null, null, new NowsExtra(null, "single_upload_image", null, C142625ik.LIZIZ, 0, 0, false, null, null, null, null, null, false, null, null, null, null, 0, null, null, false, 2097141, null), null, null, null, null, false, 0L, null, 8158, null));
                Intent intent2 = (Intent) aqS67S0400000_7.l1;
                if (!GX0.LIZ() || o.LJ(((H9V) aqS67S0400000_7.l0).LIZ.LIZIZ.shootWay, "now")) {
                    z = false;
                }
                intent2.putExtra("extra_is_now_story_combine", z);
                HZV.LIZ().LJIIIZ((ActivityC45651qj) aqS67S0400000_7.l3, 12349, (Intent) aqS67S0400000_7.l1);
                return C76800UCe.LIZ;
            }
        }
        HZV.LIZ().LJJ((ActivityC45651qj) aqS67S0400000_7.l3, (Intent) aqS67S0400000_7.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0393, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.ss.android.ugc.aweme.topic.movie.IMovieTokService] */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.ss.android.ugc.aweme.topic.book.IBookTokService] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v14, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.OQg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS67S0400000_7 r26) {
        /*
            Method dump skipped, instructions count: 2913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS67S0400000_7.invoke$3(kotlin.jvm.internal.AqS67S0400000_7):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0400000_7(H9V h9v, Intent intent, H9Z h9z, ActivityC45651qj activityC45651qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = h9v;
        this.l1 = intent;
        this.l2 = h9z;
        this.l3 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS67S0400000_7(View view, View view2, C42898GsY c42898GsY, AnchorPublishStruct anchorPublishStruct, List<AnchorPublishStruct> list) {
        super(0);
        this.$t = list;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = c42898GsY;
        this.l3 = anchorPublishStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0400000_7(RecordConfig recordConfig, HPU hpu, Context context, Intent intent, int i) {
        super(0);
        this.$t = i;
        this.l0 = recordConfig;
        this.l1 = hpu;
        this.l2 = context;
        this.l3 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S0400000_7(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, ActivityC45651qj activityC45651qj, W5G w5g, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = bitmap;
        this.l2 = activityC45651qj;
        this.l3 = w5g;
    }
}
