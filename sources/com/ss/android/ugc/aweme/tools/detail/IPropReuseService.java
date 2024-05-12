package com.ss.android.ugc.aweme.tools.detail;

import X.AbstractC51036K1g;
import X.C55515LqZ;
import X.C74181T9l;
import X.M89;
import X.MIP;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.prop.fragment.EffectDiscoverAwemeListFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public interface IPropReuseService {
    MIP LIZ();

    boolean LIZIZ(Aweme aweme);

    NewFaceStickerListBean LIZJ(String str);

    C55515LqZ LIZLLL(AbstractC51036K1g abstractC51036K1g, M89 m89);

    void LJ(Activity activity, ArrayList arrayList, Music music, String str, String str2, int i, boolean z, String str3, String str4, String str5, String str6, boolean z2, boolean z3);

    void LJFF(Context context, List<String> list, C74181T9l c74181T9l, boolean z);

    EffectDiscoverAwemeListFragment LJI(Bundle bundle);

    Class<? extends Activity> LJII();

    void LJIIIIZZ(Activity activity, ArrayList<NewFaceStickerBean> arrayList, Music music, String str, String str2, String str3, int i);

    String LJIIIZ(Context context);
}
