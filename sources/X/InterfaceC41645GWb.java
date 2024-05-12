package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.GWb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC41645GWb {
    void LIZ(Activity activity, Intent intent, boolean z, boolean z2);

    void LIZLLL(Context context, Intent intent, InterfaceC65784Pro interfaceC65784Pro);

    void LJ(Context context, int i, Intent intent);

    void LJI(Activity activity, StitchParams stitchParams, CreativeInfo creativeInfo);

    void LJIIIIZZ(Activity activity, Intent intent);

    void LJIIIZ(Activity activity, int i, Intent intent);

    void LJIIJJI(Context context, Intent intent);

    boolean LJIIL(Context context, Intent intent);

    void LJIILIIL(Activity activity, Intent intent, CreativeInfo creativeInfo);

    Intent LJIILJJIL(Activity activity, Bundle bundle);

    void LJIILL(Activity activity, Bundle bundle, int i, int i2);

    void LJIIZILJ(Context context, Intent intent);

    void LJIJ(Activity activity, int i, Intent intent);

    void LJIJI(Context context, Intent intent, InterfaceC65784Pro interfaceC65784Pro);

    void LJIJJ(Activity activity, Intent intent);

    void LJIJJLI(ActivityC45651qj activityC45651qj, MediaModel mediaModel, CreativeInfo creativeInfo, Effect effect, ShortVideoCommonParams shortVideoCommonParams);

    void LJIL(Activity activity, int i, Intent intent);

    void LJJ(Activity activity, Intent intent);

    void LJJI(Activity activity, Intent intent);

    void LJJII(Context context, Intent intent);
}
