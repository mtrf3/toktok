package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C113554cx;
import X.C188727au;
import X.FMX;
import X.KJA;
import X.KJC;
import X.OSZ;
import X.XVF;
import X.Z9N;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ChooseMusicFragment extends BaseChooseMusicFragment {
    public static final /* synthetic */ int LLILZIL = 0;
    public TuxIconView LLILLJJLI;
    public boolean LLILLL;
    public final Map<Integer, View> LLILZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLILZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment
    public final void vl(int i) {
        if (!Z9N.LIZIZ.LJL()) {
            return;
        }
        if (i == 8 || i == 4) {
            this.LLILLL = false;
            return;
        }
        if (i != 0 || this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C188727au c188727au = new C188727au();
        String str = XVF.LIZ;
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_from_second", "discover_search_box_right");
        c188727au.LJIIIZ("creation_id", XVF.LJ);
        c188727au.LJIIIZ("is_song_recog", "1");
        FMX.LJIIL("voice_button_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.nds);
        if (!Z9N.LIZIZ.LJL()) {
            return;
        }
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        KJC kjc = KJC.LIZIZ;
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        KJA kja = new KJA(this);
        OSZ[] oszArr = new OSZ[3];
        String str = XVF.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("enter_from", str);
        oszArr[1] = new OSZ("enter_from_second", "discover_search_box_right");
        String str3 = XVF.LJ;
        if (str3 != null) {
            str2 = str3;
        }
        oszArr[2] = new OSZ("creation_id", str2);
        kjc.initVoiceButton(tuxIconView2, this, kja, C113554cx.LJJJLZIJ(oszArr));
        if (Dl()) {
            return;
        }
        vl(0);
    }
}
