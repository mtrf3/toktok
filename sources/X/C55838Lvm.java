package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.Lvm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55838Lvm extends M56 {
    public final String LIZ = "follow_card_push_publish";

    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "detail";
    }

    public static void LJIIIZ(Intent intent) {
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        intent.putExtra("tab", LGE.FOLLOW.getValue());
        intent.putExtra("extra_push_flag", 1);
    }

    public static void LJII(Intent intent, android.net.Uri uri) {
        String queryParameter = UriProtector.getQueryParameter(uri, "insert_relation");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            intent.putExtra("is_show_follow_btn_on_bottom_for_maf", true);
            intent.putExtra("insert_relation", queryParameter);
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "id");
            if (LLJJIJIIJIL != null) {
                FeedInsertRelationManager.INSTANCE.put(LLJJIJIIJIL, queryParameter);
            }
        }
    }

    public static void LJIIIIZZ(int i, Intent intent) {
        int LIZ = C52931Kpz.LIZ();
        if (LIZ != 1 && LIZ != 2) {
            if (LIZ != 3 && LIZ != 4) {
                return;
            }
            if (i == 1) {
                LJIIIZ(intent);
                return;
            }
            if (i != 2) {
                return;
            }
            if (C53295Kvr.LIZIZ()) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "Following");
                intent.putExtra("extra_push_flag", 1);
            }
            if (FriendsTabTopExperiment.LIZIZ()) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                intent.putExtra("tab", LGE.FRIENDS.getValue());
                intent.putExtra("extra_push_flag", 2);
                return;
            } else if (!DR0.LIZ()) {
                LJIIIZ(intent);
                return;
            } else {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
                intent.putExtra("extra_push_flag", 2);
                return;
            }
        }
        if (i != 1 && i != 2) {
            return;
        }
        LJIIIZ(intent);
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        if (!ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "aweme/detail/", false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(host);
            LIZ2.append(path);
            if (!ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ2), "tuwen/detail/", false)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(host);
                LIZ3.append(path);
                if (!ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ3), "story/detail/", false)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        boolean z2;
        String queryParameter;
        String queryParameter2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        Intent intent = new Intent(activity, (Class<?>) DetailActivity.class);
        if (C37093Eh7.LIZJ(uri, "utm_campaign", "client_share") || C37093Eh7.LIZJ(uri, "utm_campaign", "client_scan_code")) {
            z2 = true;
            intent.putExtra("share_expose_sharer", true);
            String queryParameter3 = UriProtector.getQueryParameter(uri, "story_uid");
            if (queryParameter3 == null && (queryParameter = UriProtector.getQueryParameter(uri, "params_url")) != null) {
                queryParameter3 = UriProtector.getQueryParameter(UriProtector.parse(queryParameter), "story_uid");
            }
            intent.putExtra("userid", queryParameter3);
        } else {
            z2 = false;
        }
        String queryParameter4 = UriProtector.getQueryParameter(uri, "enter_from");
        if (z2) {
            queryParameter2 = "STORY_ENTRANCE_DEFAULT";
        } else {
            queryParameter2 = UriProtector.getQueryParameter(uri, "video_from");
        }
        String queryParameter5 = UriProtector.getQueryParameter(uri, "story_type");
        if (o.LJ(queryParameter5, "1") && z2) {
            intent.putExtra("is_from_story_client_share", true);
        }
        String queryParameter6 = UriProtector.getQueryParameter(uri, "refer");
        if (z2) {
            queryParameter6 = "web";
        } else if (((queryParameter6 == null || queryParameter6.length() == 0) && (queryParameter6 = UriProtector.getQueryParameter(uri, "label")) == null) || queryParameter6.length() == 0) {
            queryParameter6 = "notification_page";
        }
        C189517cB LIZ = C55723Ltv.LIZIZ.LJIIZILJ().LIZ(uri);
        intent.putExtra("id", uri.getLastPathSegment());
        intent.putExtra("video_from", queryParameter2);
        intent.putExtra("refer", queryParameter6);
        intent.putExtra("enter_from", queryParameter4);
        intent.putExtra("story type", queryParameter5);
        intent.putExtra("Story_insert_user_wrapper", LIZ);
        intent.setData(uri);
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() && !z2) {
            String queryParameter7 = UriProtector.getQueryParameter(uri, "push_id");
            if (queryParameter7 != null) {
                intent.putExtra("id", queryParameter7);
            }
            intent.putExtra("video_from", "STORY_ENTRANCE_DEFAULT");
        }
        String queryParameter8 = UriProtector.getQueryParameter(uri, "commentId");
        if (!TextUtils.isEmpty(queryParameter8)) {
            intent.putExtra("cid", queryParameter8);
        }
        if (C61017Nx7.LIZ().LIZIZ()) {
            C16880lQ.LIZIZ(activity, intent);
            return;
        }
        Intent LJIJI = C51029K0z.LJIJI(activity);
        LJIJI.putExtra("extra_from_deeplink", true);
        activity.startActivities(new Intent[]{LJIJI, intent});
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    @Override // X.M56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent LIZ(android.app.Activity r26, android.net.Uri r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55838Lvm.LIZ(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
    }
}
