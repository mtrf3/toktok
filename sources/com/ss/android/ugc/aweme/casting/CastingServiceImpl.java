package com.ss.android.ugc.aweme.casting;

import X.C00F;
import X.C1HQ;
import X.C221108m2;
import X.C2NU;
import X.C4HD;
import X.C61878OQg;
import X.C62822Ol8;
import X.C71042qa;
import X.C71082qe;
import X.C772831o;
import X.C77800Ug8;
import X.C779434c;
import X.C780434m;
import X.C780534n;
import X.C78688UuS;
import X.C85323Wm;
import X.EE1;
import X.InterfaceC62486Ofi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.casting.api.ICastingService;
import com.ss.android.ugc.aweme.casting.api.IPlaybackControlService;
import com.ss.android.ugc.aweme.casting.plugin.CastingPluginInitTask;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CastingServiceImpl implements ICastingService {
    public static final Keva LJI = Keva.getRepo("CastingService_share");
    public boolean LIZJ;
    public boolean LIZLLL;
    public final String LIZ = "is_casting";
    public final String LIZIZ = "casting_session_id";
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C780434m.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C780534n.LJLIL);

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final IPlaybackControlService LIZ() {
        return (IPlaybackControlService) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final ICastingPlayerService LIZLLL() {
        return (ICastingPlayerService) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LJIILJJIL() {
        C779434c c779434c;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null) {
            return c779434c.LJII();
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean isConnected() {
        C779434c c779434c;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null) {
            return c779434c.LJIIIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIIZ() {
        if (!C4HD.LIZ()) {
            return;
        }
        Keva keva = LJI;
        keva.storeLong("KEY_LAST_SHOW", System.currentTimeMillis());
        keva.storeInt("KEY_SHOW_COUNT", keva.getInt("KEY_SHOW_COUNT", 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final EE1 LJIIJ() {
        if (C4HD.LIZ() && C00F.LIZ(31744, 0, "casting_aab_launch_task", true) == 1) {
            return new CastingPluginInitTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LJ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIIIIZZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIILIIL() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LIZJ(boolean z) {
        this.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIJJI(boolean z) {
        this.LIZLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIIL(Aweme aweme) {
        C71082qe c71082qe;
        if (!C4HD.LIZ() || !C2NU.LIZ.LIZJ() || !C78688UuS.LJJJJJ(aweme) || (c71082qe = C71042qa.LIZIZ) == null) {
            return false;
        }
        C779434c c779434c = c71082qe.LIZIZ;
        if (c779434c != null) {
            List<ServiceInfo> value = c779434c.LJFF.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            if (value.isEmpty()) {
                return false;
            }
        }
        Keva keva = LJI;
        if (System.currentTimeMillis() - keva.getLong("KEY_LAST_SHOW", 0L) < 86400000 || keva.getInt("KEY_SHOW_COUNT", 0) >= 5) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final InterfaceC62486Ofi LJII(final Aweme aweme, final String str) {
        o.LJIIIZ(aweme, "aweme");
        if (!C4HD.LIZ() || !C2NU.LIZ.LIZJ()) {
            return null;
        }
        return new InterfaceC62486Ofi(aweme, str) { // from class: X.34u
            public final Aweme LJLIL;
            public final String LJLILLLLZI;

            @Override // X.InterfaceC62486Ofi
            public final void LJ() {
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJFF() {
                return R.raw.icon_tv;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJIJ() {
                return R.raw.icon_tv_fill;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJJI() {
                return true;
            }

            @Override // X.InterfaceC62486Ofi
            public final String LJJIFFI() {
                return "";
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJJIIJZLJL() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final String key() {
                return "casting";
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJJII() {
                C779434c c779434c;
                C71082qe c71082qe = C71042qa.LIZIZ;
                if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null && c779434c.LJIIIZ()) {
                    return R.string.t5_;
                }
                return R.string.t59;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean enable() {
                return C78688UuS.LJJJJJ(this.LJLIL);
            }

            @Override // X.InterfaceC62486Ofi
            public final int LIZ() {
                return C62485Ofh.LIZIZ();
            }

            @Override // X.InterfaceC62486Ofi
            public final EnumC41317GJl LJIILIIL() {
                return EnumC41317GJl.ShareButton;
            }

            @Override // X.InterfaceC62486Ofi
            public final EnumC26273ASv LJIILLIIL() {
                return EnumC26273ASv.NORMAL;
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJIIIZ(TextView textView) {
                C62485Ofh.LJ(this, textView);
            }

            @Override // X.InterfaceC62486Ofi
            public final void onClick(View view) {
                o.LJIIIZ(view, "view");
            }

            {
                o.LJIIIZ(aweme, "aweme");
                this.LJLIL = aweme;
                this.LJLILLLLZI = str;
            }

            @Override // X.InterfaceC62486Ofi
            public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
            }

            @Override // X.InterfaceC62486Ofi
            public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                C34L c34l;
                ServiceInfo value;
                String str2;
                o.LJIIIZ(context, "context");
                o.LJIIIZ(sharePackage, "sharePackage");
                Boolean bool = null;
                Boolean bool2 = null;
                String str3 = null;
                if (!C78688UuS.LJJJJJ(this.LJLIL)) {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        C26045AKb c26045AKb = new C26045AKb(LJIIIIZZ);
                        c26045AKb.LJIIIIZZ(R.string.t5a);
                        c26045AKb.LJI(R.attr.eb);
                        c26045AKb.LIZLLL(3000L);
                        c26045AKb.LJIIJ();
                    }
                    String groupId = this.LJLIL.getGroupId();
                    String authorUid = this.LJLIL.getAuthorUid();
                    String str4 = this.LJLILLLLZI;
                    C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
                    if (c88545Yp3 != null) {
                        bool2 = Boolean.valueOf(c88545Yp3.LJIILIIL());
                    }
                    C779934h.LIZIZ(str4, "casting_not_supported_for_this_video", groupId, authorUid, bool2);
                    return;
                }
                C71082qe c71082qe = C71042qa.LIZIZ;
                if (c71082qe != null && (value = c71082qe.LIZIZ.LJIIIIZZ.getValue()) != null) {
                    Aweme aweme2 = c71082qe.LIZJ.LIZIZ;
                    if (aweme2 != null) {
                        str2 = aweme2.getGroupId();
                    } else {
                        str2 = null;
                    }
                    Aweme aweme3 = c71082qe.LIZJ.LIZIZ;
                    if (aweme3 != null) {
                        str3 = aweme3.getAuthorUid();
                    }
                    String str5 = this.LJLILLLLZI;
                    boolean z = c71082qe.LIZJ.LJ;
                    String str6 = value.name;
                    if (str6 == null) {
                        str6 = "";
                    }
                    C779634e.LIZ(str5, str2, str3, z, str6, c71082qe.LIZIZ.LJIIIIZZ(), "share_panel");
                    c71082qe.LIZIZ.LJI(value);
                    return;
                }
                V5H.LIZJ(context, this.LJLIL);
                C71082qe c71082qe2 = C71042qa.LIZIZ;
                if (c71082qe2 != null && (c34l = c71082qe2.LIZJ) != null) {
                    c34l.LJIIIIZZ(this.LJLIL.getAid());
                }
                String groupId2 = this.LJLIL.getGroupId();
                String authorUid2 = this.LJLIL.getAuthorUid();
                String str7 = this.LJLILLLLZI;
                C88545Yp3 c88545Yp32 = C88545Yp3.LIZIZ;
                if (c88545Yp32 != null) {
                    bool = Boolean.valueOf(c88545Yp32.LJIILIIL());
                }
                C779934h.LIZIZ(str7, "select_device_bottom_card", groupId2, authorUid2, bool);
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                C62485Ofh.LIZJ(context, baseSharePackage, this);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
            @Override // X.InterfaceC62486Ofi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIII(android.content.Context r11, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r12) {
                /*
                    r10 = this;
                    X.2qe r0 = X.C71042qa.LIZIZ
                    r1 = 1
                    r8 = 0
                    if (r0 == 0) goto Lba
                    X.34c r0 = r0.LIZIZ
                    if (r0 == 0) goto Lba
                    boolean r0 = r0.LJIIIZ()
                    r0 = r0 ^ 1
                    if (r0 != r1) goto Lba
                    java.lang.String r2 = X.C62468OfQ.LJIIJ
                    r4 = -1
                    r9 = 0
                    if (r2 == 0) goto Lca
                    java.lang.String r1 = "["
                    java.lang.String r0 = "]"
                    java.lang.String r2 = ujb.s.LJL(r1, r0, r2)
                    int r0 = r2.length()
                    if (r0 <= 0) goto Lc6
                    java.lang.String r0 = ", "
                    java.lang.String[] r1 = new java.lang.String[]{r0}
                    r0 = 6
                    java.util.List r1 = ujb.s.LJLJJL(r2, r1, r8, r0)
                    java.lang.String[] r0 = new java.lang.String[r8]
                    java.lang.Object[] r3 = r1.toArray(r0)
                    java.lang.String[] r3 = (java.lang.String[]) r3
                    if (r3 == 0) goto Lc6
                L3b:
                    int r2 = r3.length
                L3c:
                    if (r8 >= r2) goto Lca
                    r1 = r3[r8]
                    java.lang.String r0 = "casting"
                    boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
                    if (r0 == 0) goto Lc2
                    if (r8 == r4) goto L4c
                    int r8 = r8 + 1
                L4c:
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.LJLIL
                    if (r0 == 0) goto Lc0
                    java.lang.String r6 = r0.getGroupId()
                L54:
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.LJLIL
                    if (r0 == 0) goto Lbe
                    java.lang.String r5 = r0.getAuthorUid()
                L5c:
                    java.lang.String r1 = r10.LJLILLLLZI
                    X.Yp3 r0 = X.C88545Yp3.LIZIZ
                    if (r0 == 0) goto L6a
                    boolean r0 = r0.LJIILIIL()
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
                L6a:
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.LJLIL
                    boolean r7 = X.C78688UuS.LJJJJJ(r0)
                    X.3Wm r4 = X.C772831o.LIZ()
                    java.lang.String r0 = "eventSender"
                    kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                    org.json.JSONObject r3 = new org.json.JSONObject
                    r3.<init>()
                    java.lang.String r2 = ""
                    if (r1 != 0) goto L83
                    r1 = r2
                L83:
                    java.lang.String r0 = "enter_from"
                    r3.put(r0, r1)
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.o.LJ(r9, r0)
                    if (r0 == 0) goto Lbb
                    java.lang.String r1 = "tv_icon"
                L92:
                    java.lang.String r0 = "click_from"
                    r3.put(r0, r1)
                    java.lang.String r0 = "casting_button_location"
                    r3.put(r0, r8)
                    java.lang.String r1 = "video_is_castable"
                    java.lang.String r0 = java.lang.String.valueOf(r7)
                    r3.put(r1, r0)
                    if (r6 != 0) goto La8
                    r6 = r2
                La8:
                    java.lang.String r0 = "group_id"
                    r3.put(r0, r6)
                    if (r5 != 0) goto Lb0
                    r5 = r2
                Lb0:
                    java.lang.String r0 = "author_id"
                    r3.put(r0, r5)
                    java.lang.String r0 = "casting_share_panel_show"
                    r4.LIZ(r0, r3)
                Lba:
                    return
                Lbb:
                    java.lang.String r1 = "share_icon"
                    goto L92
                Lbe:
                    r5 = r9
                    goto L5c
                Lc0:
                    r6 = r9
                    goto L54
                Lc2:
                    int r8 = r8 + 1
                    goto L3c
                Lc6:
                    java.lang.String[] r3 = new java.lang.String[r8]
                    goto L3b
                Lca:
                    r8 = -1
                    goto L4c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C781234u.LJJIII(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJIIZILJ(ImageView imageView, View view, int i) {
                C62485Ofh.LIZLLL(imageView, view);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJFF(String str, String str2, String str3) {
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "eventSender");
        if (str == null) {
            str = "";
        }
        LIZ2.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("group_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("author_id", str3);
        LIZ.LIZIZ("casting_pulse_show", LIZ2);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJI(String str, String str2, String str3) {
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "eventSender");
        if (str == null) {
            str = "";
        }
        LIZ2.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("group_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("author_id", str3);
        LIZ.LIZIZ("casting_click_pulse", LIZ2);
    }
}
