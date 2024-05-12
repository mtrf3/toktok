package com.ss.android.ugc.aweme.prop.impl;

import X.AbstractC51036K1g;
import X.C221108m2;
import X.C32I;
import X.C44310HaE;
import X.C44311HaF;
import X.C44350Has;
import X.C45439HsR;
import X.C55515LqZ;
import X.C56536MGu;
import X.C58096Mr6;
import X.C60903NvH;
import X.C62822Ol8;
import X.C74181T9l;
import X.C78685UuP;
import X.C84942XVi;
import X.EF7;
import X.J9P;
import X.M89;
import X.MIP;
import X.OVX;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.ReuseStickerUpdateSP;
import com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.prop.fragment.EffectDiscoverAwemeListFragment;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class PropReuseServiceImpl implements IPropReuseService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(OVX.LJLIL);

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final Class<? extends Activity> LJII() {
        return StickerPropDetailActicity.class;
    }

    public static IPropReuseService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(IPropReuseService.class, false);
        if (LIZ != null) {
            return (IPropReuseService) LIZ;
        }
        if (C58096Mr6.h4 == null) {
            synchronized (IPropReuseService.class) {
                if (C58096Mr6.h4 == null) {
                    C58096Mr6.h4 = new PropReuseServiceImpl();
                }
            }
        }
        return C58096Mr6.h4;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final MIP LIZ() {
        return new MIP();
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getStickerEntranceInfo() != null && !TextUtils.isEmpty(aweme.getStickerEntranceInfo().name)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final NewFaceStickerListBean LIZJ(String stickerIds) {
        o.LJIIIZ(stickerIds, "stickerIds");
        StickerPropApi stickerPropApi = (StickerPropApi) this.LIZ.getValue();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        NewFaceStickerListBean newFaceStickerListBean = stickerPropApi.getStickerDetail(stickerIds, EF7.LIZLLL()).get();
        o.LJIIIIZZ(newFaceStickerListBean, "stickerPropApi\n         …rsion)\n            .get()");
        return newFaceStickerListBean;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final EffectDiscoverAwemeListFragment LJI(Bundle bundle) {
        int i;
        if (o.LJ("from_effect_discover_panel", "from_effect_discover_tab")) {
            i = 35;
        } else if (o.LJ("from_effect_discover_panel", "from_effect_discover_panel")) {
            i = 36;
        } else {
            i = 15;
        }
        C56536MGu c56536MGu = new C56536MGu(null, i);
        EffectDiscoverAwemeListFragment effectDiscoverAwemeListFragment = new EffectDiscoverAwemeListFragment();
        bundle.putInt("detail_aweme_list_type", i);
        bundle.putString("detail_aweme_from", "from_effect_discover_panel");
        bundle.putString("event_label", "sticker_prop_detail");
        bundle.putString("detail_id", "-1");
        effectDiscoverAwemeListFragment.setArguments(bundle);
        effectDiscoverAwemeListFragment.LLILLIZIL = c56536MGu;
        effectDiscoverAwemeListFragment.LLIIJI = true;
        effectDiscoverAwemeListFragment.LLIIJLIL = true;
        return effectDiscoverAwemeListFragment;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final String LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        ReuseStickerUpdateSP reuseStickerUpdateSP = (ReuseStickerUpdateSP) new C44350Has(new C45439HsR()).LIZ(context, ReuseStickerUpdateSP.class);
        String str = "";
        String eid = reuseStickerUpdateSP.getEid("");
        Long valueOf = Long.valueOf(reuseStickerUpdateSP.getTime(0L));
        int vcode = reuseStickerUpdateSP.getVcode(0);
        if (!TextUtils.isEmpty(eid) && valueOf.longValue() != 0 && vcode != 0 && System.currentTimeMillis() - valueOf.longValue() < 86400000 && EF7.LIZJ() > vcode) {
            reuseStickerUpdateSP.setEid("");
            reuseStickerUpdateSP.setTime(0L);
            reuseStickerUpdateSP.setVcode(0);
            str = eid;
        }
        o.LJIIIIZZ(str, "getUpdateTopEffectAndClear(context)");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final C55515LqZ LIZLLL(AbstractC51036K1g abstractC51036K1g, M89 param) {
        o.LJIIIZ(param, "param");
        return new C55515LqZ(abstractC51036K1g, param);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void LJFF(Context context, List<String> stickers, C74181T9l c74181T9l, boolean z) {
        C84942XVi c84942XVi;
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickers, "stickers");
        String str = c74181T9l.LIZIZ;
        if (str == null || str.length() == 0) {
            c84942XVi = new C84942XVi(context, "prop_reuse");
        } else {
            c84942XVi = new C84942XVi(context, c74181T9l.LIZIZ);
        }
        String str2 = c74181T9l.LIZ;
        if (str2 != null && str2.length() != 0) {
            c84942XVi.LJIIJJI = c74181T9l.LIZ;
        }
        boolean z2 = c74181T9l.LJIILJJIL;
        if (z2) {
            c84942XVi.LJJIIZI = z2;
        }
        c84942XVi.LJIIJJI = c74181T9l.LIZ;
        c84942XVi.LJIILLIIL = c74181T9l.LJII;
        c84942XVi.LJIJ = c74181T9l.LJIJJLI;
        c84942XVi.LJIJI = c74181T9l.LJIL;
        c84942XVi.LJIJJ = c74181T9l.LJIIIZ;
        c84942XVi.LJIJJLI = c74181T9l.LJJ;
        Music music = c74181T9l.LIZJ;
        if (music != null) {
            c84942XVi.LJIIJ(music);
        }
        LibraryMaterialInfoSv libraryMaterialInfoSv = c74181T9l.LIZLLL;
        if (libraryMaterialInfoSv != null) {
            c84942XVi.LJJIZ = libraryMaterialInfoSv;
        }
        String str3 = c74181T9l.LJIJI;
        if (str3 != null) {
            c84942XVi.LJJJI = str3;
        }
        c84942XVi.LJJJIL = c74181T9l.LJIJJ;
        c84942XVi.LJJJ = c74181T9l.LJ;
        c84942XVi.LJ = c74181T9l.LJIILL;
        c84942XVi.LJIILJJIL = c74181T9l.LJFF;
        c84942XVi.LJJ = c74181T9l.LJIIZILJ;
        c84942XVi.LJJI = c74181T9l.LJIJ;
        c84942XVi.LJJIIJ = c74181T9l.LJIIL;
        c84942XVi.LJJIII = c74181T9l.LJIIJJI;
        Integer num = c74181T9l.LJIILLIIL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        c84942XVi.LJJIJLIJ = i;
        c84942XVi.LJJIIJZLJL = c74181T9l.LJIILIIL;
        c84942XVi.LJJIIZI = !z;
        String str4 = c74181T9l.LJII;
        if (str4 != null && s.LJJJLZIJ(str4, "trending", false)) {
            c84942XVi.LJJJJIZL = true;
        }
        c84942XVi.LIZLLL(z, new ArrayList(stickers), c74181T9l.LJIIJ, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void LJIIIIZZ(Activity activity, ArrayList<NewFaceStickerBean> arrayList, Music music, String str, String str2, String str3, int i) {
        if (arrayList.isEmpty() || CommerceLockStickerServiceImpl.LIZJ().LIZIZ(activity, (NewFaceStickerBean) ListProtector.get(arrayList, 0), "prop_collection")) {
            return;
        }
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().needLoginBeforeRecord()) {
            J9P.LIZIZ(activity, "prop_page", "prop_reuse_icon", null, null);
            return;
        }
        C84942XVi c84942XVi = new C84942XVi(activity, "profile_prop");
        c84942XVi.LJIILJJIL = "prop_auto";
        c84942XVi.LJIILLIIL = str;
        c84942XVi.LJJ = new C44311HaF(str, str2, str3);
        if (music != null) {
            c84942XVi.LJIIJ(music);
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator<NewFaceStickerBean> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().id);
        }
        c84942XVi.LJIIIIZZ(new ArrayList(arrayList2), "profile_prop", "reuse", false, i, false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IPropReuseService
    public final void LJ(Activity activity, ArrayList arrayList, Music music, String enterFrom, String str, int i, boolean z, String str2, String str3, String str4, String editEffectUID, boolean z2, boolean z3) {
        String str5;
        String str6 = str4;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(editEffectUID, "editEffectUID");
        if (arrayList.isEmpty() || CommerceLockStickerServiceImpl.LIZJ().LIZIZ(activity, (NewFaceStickerBean) ListProtector.get(arrayList, 0), "prop_page")) {
            return;
        }
        String str7 = null;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().needLoginBeforeRecord()) {
            J9P.LIZIZ(activity, str2, "prop_reuse_icon", null, null);
            return;
        }
        C84942XVi c84942XVi = new C84942XVi(activity, str2);
        c84942XVi.LJIILJJIL = "prop_auto";
        c84942XVi.LJ = "";
        String str8 = "video_button";
        if (o.LJ(str2, "friends_effect")) {
            str5 = "video_button";
        } else {
            str5 = null;
        }
        c84942XVi.LJIJJ = str5;
        if (o.LJ(str2, "friends_effect")) {
            str7 = str3;
        }
        c84942XVi.LJJJI = str7;
        c84942XVi.LJJJIL = true;
        c84942XVi.LJIJJLI = editEffectUID;
        if (C78685UuP.LJJJZ(enterFrom)) {
            str6 = enterFrom;
        }
        c84942XVi.LJIILLIIL = str6;
        if (!o.LJ(str2, "friends_effect")) {
            str8 = "prop_feed";
        }
        c84942XVi.LJIIZILJ = str8;
        c84942XVi.LJJ = new C44310HaE(str2, enterFrom, str, str3, z2, z3);
        c84942XVi.LJJJJ = 17;
        if (music != null) {
            c84942XVi.LJIIJ(music);
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((NewFaceStickerBean) it.next()).id);
        }
        c84942XVi.LJIIIIZZ(new ArrayList(arrayList2), str2, "reuse", false, i, z);
    }
}
