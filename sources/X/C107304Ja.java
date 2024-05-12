package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107304Ja {
    public static final InterfaceC1042947l LIZ(String str, boolean z) {
        boolean z2;
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        if (o.LJ(str, "now_invite")) {
            if (z) {
                return null;
            }
            C65776Prg LIZ = C65352Pkq.LIZ(C107344Je.class);
            if (o.LJ(LIZ, C65352Pkq.LIZ(C107314Jb.class))) {
                return new InterfaceC1042947l() { // from class: X.4Jb
                    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C107324Jc.LJLIL);

                    @Override // X.InterfaceC1042947l
                    public final boolean LIZ(Context context, ActionLinkComponent actionLinkComponent) {
                        String str2;
                        String str3;
                        o.LJIIIZ(actionLinkComponent, "actionLinkComponent");
                        Iterator<String> it = actionLinkComponent.data.iterator();
                        while (true) {
                            str2 = null;
                            if (it.hasNext()) {
                                str3 = it.next();
                                if (str3.length() > 0) {
                                    break;
                                }
                            } else {
                                str3 = null;
                                break;
                            }
                        }
                        String str4 = str3;
                        if (str4 != null) {
                            str2 = ujb.o.LJJJJZI(str4, "poi/detail", "poi/map", false);
                        }
                        if (C78685UuP.LJJJZ(str2)) {
                            return ((C1049449y) this.LIZ.getValue()).LIZ(context, new ActionLinkComponent(C47261Igj.LJJIJ(str2), ActionLinkType.DEEP_LINK));
                        }
                        return ((C1049449y) this.LIZ.getValue()).LIZ(context, actionLinkComponent);
                    }
                };
            }
            if (o.LJ(LIZ, C65352Pkq.LIZ(C107344Je.class))) {
                return new InterfaceC1042947l() { // from class: X.4Je
                    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C107334Jd.LJLIL);

                    @Override // X.InterfaceC1042947l
                    public final boolean LIZ(Context context, ActionLinkComponent actionLinkComponent) {
                        String str2;
                        IMUser LJFF;
                        o.LJIIIZ(actionLinkComponent, "actionLinkComponent");
                        Iterator<String> it = actionLinkComponent.data.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                str2 = it.next();
                                if (str2.length() > 0) {
                                    break;
                                }
                            } else {
                                str2 = null;
                                break;
                            }
                        }
                        String str3 = str2;
                        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str3), "uid");
                        if (queryParameter != null && (LJFF = C80533Eb.LJFF(queryParameter, null)) != null) {
                            C38281F0r c38281F0r = new C38281F0r(str3);
                            c38281F0r.LIZLLL("nickname", LJFF.getNickName());
                            c38281F0r.LIZLLL("avatar", C78765Uvh.LJIIL(LJFF.getAvatarMedium()));
                            return ((C1049449y) this.LIZ.getValue()).LIZ(context, new ActionLinkComponent(C47261Igj.LJJIJ(c38281F0r.LJ()), ActionLinkType.DEEP_LINK));
                        }
                        return ((C1049449y) this.LIZ.getValue()).LIZ(context, actionLinkComponent);
                    }
                };
            }
            throw new IllegalArgumentException();
        }
        if (!o.LJ(str, "point_of_interest") || !PoiServiceImpl.LIZIZ().LJJJJZI()) {
            return null;
        }
        C65776Prg LIZ2 = C65352Pkq.LIZ(C107314Jb.class);
        if (o.LJ(LIZ2, C65352Pkq.LIZ(C107314Jb.class))) {
            return new InterfaceC1042947l() { // from class: X.4Jb
                public final C62822Ol8 LIZ = C221108m2.LIZIZ(C107324Jc.LJLIL);

                @Override // X.InterfaceC1042947l
                public final boolean LIZ(Context context, ActionLinkComponent actionLinkComponent) {
                    String str2;
                    String str3;
                    o.LJIIIZ(actionLinkComponent, "actionLinkComponent");
                    Iterator<String> it = actionLinkComponent.data.iterator();
                    while (true) {
                        str2 = null;
                        if (it.hasNext()) {
                            str3 = it.next();
                            if (str3.length() > 0) {
                                break;
                            }
                        } else {
                            str3 = null;
                            break;
                        }
                    }
                    String str4 = str3;
                    if (str4 != null) {
                        str2 = ujb.o.LJJJJZI(str4, "poi/detail", "poi/map", false);
                    }
                    if (C78685UuP.LJJJZ(str2)) {
                        return ((C1049449y) this.LIZ.getValue()).LIZ(context, new ActionLinkComponent(C47261Igj.LJJIJ(str2), ActionLinkType.DEEP_LINK));
                    }
                    return ((C1049449y) this.LIZ.getValue()).LIZ(context, actionLinkComponent);
                }
            };
        }
        if (o.LJ(LIZ2, C65352Pkq.LIZ(C107344Je.class))) {
            return new InterfaceC1042947l() { // from class: X.4Je
                public final C62822Ol8 LIZ = C221108m2.LIZIZ(C107334Jd.LJLIL);

                @Override // X.InterfaceC1042947l
                public final boolean LIZ(Context context, ActionLinkComponent actionLinkComponent) {
                    String str2;
                    IMUser LJFF;
                    o.LJIIIZ(actionLinkComponent, "actionLinkComponent");
                    Iterator<String> it = actionLinkComponent.data.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str2 = it.next();
                            if (str2.length() > 0) {
                                break;
                            }
                        } else {
                            str2 = null;
                            break;
                        }
                    }
                    String str3 = str2;
                    String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str3), "uid");
                    if (queryParameter != null && (LJFF = C80533Eb.LJFF(queryParameter, null)) != null) {
                        C38281F0r c38281F0r = new C38281F0r(str3);
                        c38281F0r.LIZLLL("nickname", LJFF.getNickName());
                        c38281F0r.LIZLLL("avatar", C78765Uvh.LJIIL(LJFF.getAvatarMedium()));
                        return ((C1049449y) this.LIZ.getValue()).LIZ(context, new ActionLinkComponent(C47261Igj.LJJIJ(c38281F0r.LJ()), ActionLinkType.DEEP_LINK));
                    }
                    return ((C1049449y) this.LIZ.getValue()).LIZ(context, actionLinkComponent);
                }
            };
        }
        throw new IllegalArgumentException();
    }

    public static final int LIZIZ(String str, boolean z) {
        boolean z2;
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return -1;
        }
        switch (str.hashCode()) {
            case -2091181238:
                if (!str.equals("paid_series")) {
                    return -1;
                }
                return R.raw.icon_tiktok_logo;
            case -1741312354:
                if (!str.equals("collection")) {
                    return -1;
                }
                if (z) {
                    return R.raw.icon_favorites_collection;
                }
                return R.raw.icon_2pt_favorites_collection;
            case -84391837:
                if (!str.equals("point_of_interest")) {
                    return -1;
                }
                if (z) {
                    return R.raw.icon_map_pin;
                }
                return R.raw.icon_large_map_pin;
            case 1879474642:
                if (!str.equals("playlist")) {
                    return -1;
                }
                if (z) {
                    return R.raw.icon_playlist;
                }
                return R.raw.icon_2pt_playlist;
            default:
                return -1;
        }
    }
}
