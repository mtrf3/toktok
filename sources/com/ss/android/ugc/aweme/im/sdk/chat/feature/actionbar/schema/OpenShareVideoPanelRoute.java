package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema;

import X.ASL;
import X.AbstractC91523iW;
import X.ActivityC45651qj;
import X.C1DG;
import X.C249109q6;
import X.C32I;
import X.C45804HyK;
import X.C47261Igj;
import X.ORZ;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class OpenShareVideoPanelRoute extends AbstractC91523iW {
    @Override // X.AbstractC91523iW
    public List<String> getParamsList() {
        return C47261Igj.LJJIJIIJI("conversation_id", "panel_type");
    }

    @Override // X.AbstractC91523iW
    public boolean doAction(Context context, String str, Bundle bundle) {
        ActivityC45651qj LJJIFFI;
        String param;
        String param2;
        o.LJIIIZ(bundle, "bundle");
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (param = getParam("conversation_id")) == null || (param2 = getParam("panel_type")) == null) {
            return false;
        }
        List LLJI = ORZ.LLJI(s.LJLJJL(param2, new String[]{","}, 0, 6));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it.next())));
        }
        float f = LJJIFFI.getResources().getDisplayMetrics().heightPixels;
        ASL LIZ = C249109q6.LIZ(2);
        LIZ.LIZJ((int) (0.75f * f), (int) (f * 0.9f));
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJZL = true;
        Bundle bundle2 = new Bundle();
        bundle2.putIntArray("panel_type_list", ORZ.LLJ(arrayList));
        bundle2.putString("conversation_id", param);
        ShareVideoPanelFragment shareVideoPanelFragment = new ShareVideoPanelFragment();
        shareVideoPanelFragment.setArguments(bundle2);
        TuxSheet tuxSheet2 = LIZ.LIZ;
        tuxSheet2.LJLLILLLL = shareVideoPanelFragment;
        C1DG.LJII(LJJIFFI, "activity.supportFragmentManager", tuxSheet2, "share_video_panel");
        return true;
    }
}
