package X;

import java.util.List;

/* renamed from: X.LIe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54024LIe {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZ() {
        if (C54029LIj.LIZIZ.LJJIJL()) {
            return new OSZ(1, "is_top_tab");
        }
        return new OSZ(0, "is_top_tab");
    }

    public static void LIZIZ(String str, String str2) {
        FMX.LJIILL("refresh_homepage_friends", new OSZ("homepage_friends", "enter_from"), new OSZ(str, "enter_method"), new OSZ(str2, "result"), LIZ());
    }

    public static void LIZLLL(int i, boolean z) {
        FMX.LJIILL("friends_empty_page_show", new OSZ("homepage_friends", "enter_from"), new OSZ(Integer.valueOf(i), "is_first_page"), new OSZ(Integer.valueOf(z ? 1 : 0), "has_more"), LIZ());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(X.ActivityC45651qj r1, java.lang.String r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "fragmentTag"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            if (r3 != 0) goto L10
            int r0 = r2.hashCode()
            switch(r0) {
                case -1525083535: goto L6e;
                case -1382453013: goto L62;
                case -1309089240: goto L59;
                case 2223327: goto L35;
                case 2614219: goto L29;
                case 712199613: goto L1d;
                case 1055811561: goto L11;
                default: goto Le;
            }
        Le:
            java.lang.String r3 = "homepage_hot"
        L10:
            return r3
        L11:
            java.lang.String r0 = "DISCOVER"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            goto Le
        L1a:
            java.lang.String r3 = "discovery"
            goto L10
        L1d:
            java.lang.String r0 = "SHOP_MALL"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L26
            goto Le
        L26:
            java.lang.String r3 = "homepage_shop_mall"
            goto L10
        L29:
            java.lang.String r0 = "USER"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            goto Le
        L32:
            java.lang.String r3 = "personal_homepage"
            goto L10
        L35:
            java.lang.String r0 = "HOME"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3e
            goto Le
        L3e:
            if (r1 != 0) goto L41
            goto Le
        L41:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C116694i1.LIZ(r1)
            androidx.fragment.app.Fragment r1 = r0.Ja(r2)
            boolean r0 = r1 instanceof X.InterfaceC54054LJi
            if (r0 == 0) goto Le
            X.LJi r1 = (X.InterfaceC54054LJi) r1
            if (r1 != 0) goto L52
            goto Le
        L52:
            boolean r0 = r1.Oe()
            if (r0 == 0) goto L77
            goto Le
        L59:
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8f
            goto Le
        L62:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6b
            goto Le
        L6b:
            java.lang.String r3 = "notification_page"
            goto L10
        L6e:
            java.lang.String r0 = "Following"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7d
            goto Le
        L77:
            boolean r0 = r1.lj()
            if (r0 == 0) goto L80
        L7d:
            java.lang.String r3 = "homepage_follow"
            goto L10
        L80:
            boolean r0 = r1.uk()
            if (r0 == 0) goto L89
            java.lang.String r3 = "homepage_popular"
            goto L10
        L89:
            boolean r0 = r1.K2()
            if (r0 == 0) goto Le
        L8f:
            java.lang.String r3 = "homepage_friends"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54024LIe.LJ(X.1qj, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void LIZJ(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List list, String str2, int i11, boolean z) {
        int i12 = i + i2;
        int i13 = i6 + i7;
        int i14 = i4 + i5;
        C188727au LJIIIIZZ = JBR.LJIIIIZZ("enter_from", "homepage_friends", "request_id", str);
        LJIIIIZZ.LIZLLL(i12, "item_forecast");
        LJIIIIZZ.LIZLLL(i, "item_forecast_story");
        LJIIIIZZ.LIZLLL(i2, "item_forecast_normal");
        LJIIIIZZ.LIZLLL(i13, "item_actual_mutual");
        LJIIIIZZ.LIZLLL(i6, "item_actual_mutual_story");
        LJIIIIZZ.LIZLLL(i7, "item_actual_mutual_normal");
        LJIIIIZZ.LIZLLL(i14, "item_actual_single");
        LJIIIIZZ.LIZLLL(i4, "item_actual_single_story");
        LJIIIIZZ.LIZLLL(i5, "item_actual_single_normal");
        LJIIIIZZ.LIZLLL((i12 - i13) - i14, "red_dot_actual_mutual_single_gap");
        LJIIIIZZ.LJI("red_dot_request_id", str2);
        LJIIIIZZ.LIZLLL(i11, "has_finished_sort_actual");
        if (C54029LIj.LIZIZ.LJJIJL()) {
            LJIIIIZZ.LIZLLL(1, "is_top_tab");
        } else {
            LJIIIIZZ.LIZLLL(0, "is_top_tab");
        }
        if (z) {
            LJIIIIZZ.LIZLLL(i3, "item_actual");
            LJIIIIZZ.LIZLLL(i8, "item_actual_not_follow");
            LJIIIIZZ.LIZLLL(i9 + i10, "item_unread_history");
            LJIIIIZZ.LIZLLL(i9, "item_unread_history_story");
            LJIIIIZZ.LIZLLL(i10, "item_unread_history_normal");
            LJIIIIZZ.LIZLLL(i12 - i3, "item_diff");
            LJIIIIZZ.LJFF(list, "rec_item_red_dot_id_list");
        }
        FMX.LJIIL("item_refresh_amount", LJIIIIZZ.LIZ);
    }
}
