package X;

import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9PB, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9PB {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(User user, List list) {
        int i;
        boolean z;
        boolean z2;
        IProfileMusicTabService LJIJJLI;
        Boolean valueOf;
        j LJJIJ;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProfileComponents profileComponents = (ProfileComponents) it.next();
                String str = profileComponents.componentId;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1893890292:
                            if (!str.equals("profile_tab_ecommerce_showcase")) {
                                break;
                            } else {
                                i = 12;
                                break;
                            }
                        case -1648586267:
                            if (!str.equals("profile_tab_music")) {
                                break;
                            } else {
                                m mVar = profileComponents.bizData;
                                if (mVar != null && (LJJIJ = mVar.LJJIJ("show_artist_playlist")) != null) {
                                    z = LJJIJ.LJFF();
                                } else {
                                    z = false;
                                }
                                if (user != null && (LJIJJLI = ProfileMusicTabService.LJIJJLI()) != null && (valueOf = Boolean.valueOf(LJIJJLI.LJIJI(user))) != null) {
                                    z2 = valueOf.booleanValue();
                                } else {
                                    z2 = false;
                                }
                                if (!z && !z2) {
                                    break;
                                } else {
                                    i = 3;
                                    break;
                                }
                            }
                            break;
                        case -1175660221:
                            if (!str.equals("profile_tab_private")) {
                                break;
                            } else {
                                i = 10;
                                break;
                            }
                        case -745958441:
                            if (!str.equals("profile_tab_like")) {
                                break;
                            } else {
                                i = 2;
                                break;
                            }
                        case -53914142:
                            if (!str.equals("profile_tab_ecommerce_store")) {
                                break;
                            } else {
                                i = 14;
                                break;
                            }
                        case 124554716:
                            if (!str.equals("profile_tab_favorite")) {
                                break;
                            } else {
                                i = 6;
                                break;
                            }
                        case 190156241:
                            if (!str.equals("profile_tab_effect")) {
                                break;
                            } else {
                                i = 4;
                                break;
                            }
                        case 561719699:
                            if (!str.equals("profile_tab_repost")) {
                                break;
                            } else {
                                i = 15;
                                break;
                            }
                        case 600411254:
                            if (!str.equals("profile_tab_public_post")) {
                                break;
                            } else {
                                i = 0;
                                break;
                            }
                        case 772937582:
                            if (!str.equals("profile_tab_business_page")) {
                                break;
                            } else {
                                i = 17;
                                break;
                            }
                        case 1605609247:
                            if (str.equals("profile_tab_sticker_store") && !IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJIIJ() && !LFH.LIZIZ.LIZLLL().block().LJ()) {
                                i = 16;
                                break;
                            }
                            break;
                    }
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0);
            arrayList.add(2);
        }
        return arrayList;
    }
}
