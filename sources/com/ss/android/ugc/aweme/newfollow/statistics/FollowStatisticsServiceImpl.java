package com.ss.android.ugc.aweme.newfollow.statistics;

import com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService;

/* loaded from: classes4.dex */
public class FollowStatisticsServiceImpl implements IFollowStatisticsService {
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    @Override // com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r8, com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L3
        L2:
            return
        L3:
            X.7qh r2 = new X.7qh
            r2.<init>()
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r2.LIZ
            java.lang.String r5 = "enter_from"
            java.lang.String r4 = "homepage_follow"
            r0.put(r5, r4)
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r2.LIZ
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click"
            r3.put(r1, r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r2.LIZ
            java.lang.String r0 = "reply_to_comment_id"
            r1.put(r0, r8)
            java.lang.String r3 = X.C227768wm.LJIIZILJ(r9)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r2.LIZ
            java.lang.String r0 = "request_id"
            r1.put(r0, r3)
            int r0 = r9.getAwemeType()
            r6 = 13
            if (r0 != r6) goto Lc7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.getForwardItem()
            if (r0 != 0) goto Lc8
            r0 = -1
        L3b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r2.LIZ
            java.lang.String r0 = "is_photo"
            r1.put(r0, r3)
            int r0 = r9.getAwemeType()
            if (r0 != r6) goto L98
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r2.LIZ
            java.lang.String r1 = "page_type"
            java.lang.String r0 = "list"
            r3.put(r1, r0)
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r2.LIZ
            java.lang.String r1 = "is_reposted"
            java.lang.String r0 = "1"
            r3.put(r1, r0)
            java.lang.String r3 = r9.getForwardCommentId()
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r2.LIZ
            java.lang.String r0 = "repost_comment_id"
            r1.put(r0, r3)
            java.lang.String r1 = "from_group_id"
            java.lang.String r0 = r9.getFromGroupId()
            r2.LIZLLL(r1, r0)
            java.lang.String r0 = r9.getForwardGroupId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L85
            java.lang.String r1 = "forward_group_id"
            java.lang.String r0 = r9.getForwardGroupId()
            r2.LIZLLL(r1, r0)
        L85:
            java.lang.String r0 = r9.getForwardUserId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L98
            java.lang.String r1 = "forward_user_id"
            java.lang.String r0 = r9.getForwardUserId()
            r2.LIZLLL(r1, r0)
        L98:
            org.json.JSONObject r2 = r2.LJ()
            java.lang.String r3 = "comment"
            com.ss.android.ugc.aweme.common.MobClick r1 = X.C1I1.LIZLLL(r3, r4)
            java.lang.String r0 = r9.getAid()
            r1.setValue(r0)
            r1.setJsonObject(r2)
            X.FMX.onEvent(r1)
            X.7au r2 = new X.7au
            r2.<init>()
            r2.LJIIIZ(r5, r4)
            java.lang.String r1 = r9.getAid()
            java.lang.String r0 = "group_id"
            r2.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.LIZ
            X.FMX.LJIIL(r3, r0)
            goto L2
        Lc7:
            r0 = r9
        Lc8:
            int r1 = r0.getAwemeType()
            r0 = 2
            if (r1 != r0) goto Ld2
            r0 = 1
            goto L3b
        Ld2:
            r0 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.statistics.FollowStatisticsServiceImpl.LIZ(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
