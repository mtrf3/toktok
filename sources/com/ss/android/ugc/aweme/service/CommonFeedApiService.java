package com.ss.android.ugc.aweme.service;

import X.C00F;
import X.C16880lQ;
import X.C174826ta;
import X.C1808377v;
import X.C1808477w;
import X.C188727au;
import X.C224238r5;
import X.C2MY;
import X.C38354F3m;
import X.C47261Igj;
import X.C48236IwS;
import X.C57092Lx;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C72083SQt;
import X.C76V;
import X.C777333h;
import X.C78598Ut0;
import X.C8W0;
import X.EU0;
import X.FW1;
import X.FW5;
import X.HG3;
import X.IG3;
import X.InterfaceC65350Pko;
import X.JHM;
import X.JYH;
import X.RBX;
import X.RBY;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.assem.mainactivityobserver.CommonFeedActivityAssem;
import com.ss.android.ugc.aweme.feed.assem.music.artistprofile.ArtistProfileTuxSheetFragment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class CommonFeedApiService implements ICommonFeedApiService {
    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LIZLLL() {
        C2MY.LIZ().getClass();
        C777333h.LIZ();
        IG3.LJ();
        JYH.LIZIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJI() {
        C2MY.LIZ().getClass();
        C777333h.LIZ();
        IG3.LJ();
        JYH.LIZIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIIIZ() {
        C2MY.LIZ().getClass();
        C777333h.LIZ();
        IG3.LJ();
        JYH.LIZIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final InterfaceC65350Pko<? extends C8W0> LJIL() {
        return C65352Pkq.LIZ(CommonFeedActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJIIZI() {
        C2MY.LIZ().getClass();
        C777333h.LIZ();
        IG3.LJ();
        JYH.LIZIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJIJ() {
        C224238r5.LJFF = 0;
        C224238r5.LJI = 0;
        C57092Lx.LIZ.LIZJ = 0;
    }

    public static ICommonFeedApiService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ICommonFeedApiService.class, false);
        if (LIZ != null) {
            return (ICommonFeedApiService) LIZ;
        }
        if (C58096Mr6.S4 == null) {
            synchronized (ICommonFeedApiService.class) {
                if (C58096Mr6.S4 == null) {
                    C58096Mr6.S4 = new CommonFeedApiService();
                }
            }
        }
        return C58096Mr6.S4;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIILIIL() {
        if (C00F.LIZ(31744, 0, "studio_library_mvp", true) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIILJJIL() {
        if (C00F.LIZ(31744, 0, "studio_library_mvp", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIILL() {
        if (e1.LIZ(31744, "allow_3m_to_10m_video_duet_and_stitch_consumer", true, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJ() {
        if (e1.LIZ(31744, "studio_library_on_edit_page", true, false) && ((RBX) HG3.LJIILL()).getCurUser().getAccountType() != 3 && !((RBY) HG3.LJIILL()).isChildrenMode()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJI() {
        return JYH.LIZIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final String LJJIFFI() {
        String str = C72083SQt.LJLILLLLZI;
        o.LJIIIIZZ(str, "getRecentPlayedAwemeId()");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final int LJII() {
        return ECommerceAnchorService.LJJJJI().LJII();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIIJJI() {
        return IG3.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIIL() {
        if (((RBY) HG3.LJIILL()).isChildrenMode() || ((RBX) HG3.LJIILL()).getCurUser().getAccountType() == 3) {
            return false;
        }
        if (C00F.LIZ(31744, 0, "studio_library_mvp", true) != 1 && C00F.LIZ(31744, 0, "studio_library_mvp", true) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIJI() {
        return C174826ta.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJIIJZLJL() {
        if (IG3.LIZIZ() && !IG3.LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJIIZ() {
        return HG3.LJIILL().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJIJIIJI() {
        return C48236IwS.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJII() {
        return FW5.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final Map<String, Object> LIZJ(Aweme aweme) {
        return ECommerceAnchorService.LJJJJI().LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final List<AnchorCommonStruct> LJFF(Aweme aweme) {
        return C47261Igj.LJIL().LJFF(aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIIIIZZ(Aweme aweme) {
        return ECommerceAnchorService.LJJJJI().LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final Fragment LJIIJ(Bundle bundle) {
        ArtistProfileTuxSheetFragment artistProfileTuxSheetFragment = new ArtistProfileTuxSheetFragment();
        artistProfileTuxSheetFragment.setArguments(bundle);
        return artistProfileTuxSheetFragment;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIJ(boolean z) {
        JYH.LIZIZ.LJIIIIZZ(z);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final int LJIJJ(String str) {
        C76V.LIZ().LIZ(str);
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJIII(boolean z) {
        Keva.getRepo("repo_auto_volume").storeBoolean("auto_volume_state", z);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJIIJ(Aweme aweme) {
        if (TextUtils.isEmpty(aweme.getAid())) {
            return;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            C72083SQt.LJLILLLLZI = "";
        } else {
            C72083SQt.LJLILLLLZI = aid;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LIZIZ(Bundle bundle, Aweme aweme) {
        ECommerceAnchorService.LJJJJI().LIZIZ(bundle, aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJ(C188727au c188727au, Aweme aweme) {
        ECommerceAnchorService.LJJJJI().LJ(c188727au, aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIILLIIL(boolean z, Uri uri) {
        String str;
        o.LJIIIZ(uri, "uri");
        if (C78598Ut0.LJIIIIZZ(uri)) {
            C1808377v LIZ = C1808377v.LIZ();
            String str2 = "";
            ArrayList arrayList = new ArrayList();
            String path = uri.getPath();
            if (C78598Ut0.LJIIIIZZ(uri)) {
                if (!C38354F3m.LJ(path) && path.startsWith("/detail/")) {
                    arrayList.add(uri.getLastPathSegment());
                } else if (!C38354F3m.LJ(path) && path.startsWith("/detail_list")) {
                    try {
                        str = UriProtector.getQueryParameter(uri, "gids");
                    } catch (Throwable unused) {
                        str = "";
                    }
                    int i = 0;
                    if (!C38354F3m.LJ(str)) {
                        String[] split = str.split(",");
                        int length = split.length;
                        while (i < length) {
                            arrayList.add(split[i]);
                            i++;
                        }
                    } else {
                        try {
                            str2 = UriProtector.getQueryParameter(uri, "push_params");
                        } catch (Throwable unused2) {
                        }
                        if (!C38354F3m.LJ(str2)) {
                            try {
                                String optString = new JSONObject(str2).optString("gids");
                                if (!C38354F3m.LJ(optString)) {
                                    String[] split2 = optString.split(",");
                                    int length2 = split2.length;
                                    while (i < length2) {
                                        arrayList.add(split2[i]);
                                        i++;
                                    }
                                }
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            } catch (Exception e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                        }
                    }
                }
            }
            LIZ.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!TextUtils.isEmpty(str3)) {
                    C1808477w c1808477w = new C1808477w();
                    c1808477w.LIZ = str3;
                    synchronized (LIZ) {
                        if (!((ArrayList) LIZ.LIZ).contains(c1808477w)) {
                            ((ArrayList) LIZ.LIZ).add(c1808477w);
                        }
                    }
                }
            }
            C1808377v.LIZ().getClass();
            try {
                if (!EU0.LIZ || !z) {
                    return;
                }
                String str4 = "";
                String path2 = uri.getPath();
                if (C78598Ut0.LJIIIIZZ(uri) && !C38354F3m.LJ(path2) && path2.startsWith("/detail/")) {
                    str4 = uri.getLastPathSegment();
                }
                ((FW1) FW1.LJFF.LIZJ()).LIZ(str4);
            } catch (Throwable unused3) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIJJLI(Aweme aweme, JHM event) {
        o.LJIIIZ(event, "event");
        Map<String, Object> LIZJ = ECommerceAnchorService.LJJJJI().LIZJ(aweme);
        if (LIZJ != null) {
            for (Map.Entry<String, Object> entry : LIZJ.entrySet()) {
                event.LIZLLL(entry.getKey(), entry.getValue().toString());
            }
        }
    }
}
