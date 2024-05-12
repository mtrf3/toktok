package com.ss.android.ugc.aweme.feed.assem.videocomment;

import X.C04270Et;
import X.C202677xP;
import X.C33Q;
import X.C7OR;
import X.FKM;
import X.R3A;
import X.SY9;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCommentVM extends FeedBaseViewModel<C7OR> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7OR(0);
    }

    public static Drawable mv0() {
        boolean LJII = R3A.LJII();
        AwemeHostApplication LIZ = FKM.LIZ();
        o.LJI(LIZ);
        Drawable LIZIZ = C04270Et.LIZIZ(LIZ, R.drawable.bo2);
        if (C202677xP.LIZIZ()) {
            AwemeHostApplication LIZ2 = FKM.LIZ();
            o.LJI(LIZ2);
            LIZIZ = new SY9(LIZ2, R.raw.icon_color_comment_shadow_alt_1);
        }
        if (LJII) {
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r1 == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String kv0(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r5 = 0
            if (r7 == 0) goto L19
            X.6uY r0 = com.ss.android.ugc.aweme.comment.services.CommentService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            boolean r0 = r0.LJIILLIIL(r7)
            if (r0 != 0) goto L19
            boolean r0 = X.C63081OpJ.LJLJLLL(r7)
            if (r0 == 0) goto L2d
        L19:
            r3 = 0
        L1b:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L76
            X.6uY r0 = com.ss.android.ugc.aweme.comment.services.CommentService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            java.lang.String r0 = r0.LJI(r7)
            return r0
        L2d:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r7.getStatistics()
            if (r0 == 0) goto L52
            long r3 = r0.getCommentCount()
        L37:
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            com.ss.android.ugc.aweme.commercialize.model.CommentStruct r2 = r0.LJJJLIIL(r7)
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r7.getStatistics()
            if (r0 == 0) goto L50
            long r0 = r0.getCommentCount()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L4d:
            if (r0 != 0) goto L55
            goto L19
        L50:
            r0 = 0
            goto L4d
        L52:
            r3 = 0
            goto L37
        L55:
            if (r2 != 0) goto L70
            com.ss.android.ugc.aweme.commercialize.model.CommentStruct r0 = r7.getAdCommentStruct()
            if (r0 == 0) goto L1b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L70
            com.ss.android.ugc.aweme.commercialize.model.CommentStruct r0 = r7.getAdCommentStruct()
            if (r0 == 0) goto L74
            boolean r1 = r0.showAsDefault()
            r0 = 1
            if (r1 != r0) goto L74
        L6e:
            if (r0 == 0) goto L1b
        L70:
            r0 = 1
            long r3 = r3 + r0
            goto L1b
        L74:
            r0 = 0
            goto L6e
        L76:
            java.lang.String r1 = X.C77123UOp.LJJIIJ(r3)     // Catch: java.lang.Exception -> L80
            java.lang.String r0 = "{\n            I18nUiKit.…t(commentCount)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L80
            goto L86
        L80:
            r0 = move-exception
            X.C36922EeM.LJFF(r0)
            java.lang.String r1 = "0"
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM.kv0(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r3 <= r6.getEndTime()) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int lv0(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r8 = 0
            r5 = 1
            if (r9 == 0) goto L65
            boolean r0 = r9.isAd()
            if (r0 != r5) goto L65
            r0 = 1
        Lb:
            r7 = 4
            if (r0 != 0) goto L16
            if (r9 == 0) goto L1f
            com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct r6 = r9.getActivityPendant()
            if (r6 != 0) goto L38
        L16:
            if (r9 == 0) goto L1f
            boolean r0 = r9.isCmtSwt()
            if (r0 != r5) goto L31
        L1e:
            r8 = 4
        L1f:
            X.6uY r0 = com.ss.android.ugc.aweme.comment.services.CommentService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            boolean r0 = r0.LJIILLIIL(r9)
            if (r0 == 0) goto L2f
        L2e:
            return r7
        L2f:
            r7 = r8
            goto L2e
        L31:
            boolean r0 = X.C63081OpJ.LJJLIIIJLJLI(r9)
            if (r0 != r5) goto L1f
            goto L1e
        L38:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getImage()
            if (r0 == 0) goto L16
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r5) goto L16
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r3 = r3 / r0
            long r1 = r6.getStartTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L16
            long r1 = r6.getEndTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L16
            goto L1f
        L65:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM.lv0(com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C7OR iv0(X.C7OR r9, com.ss.android.ugc.aweme.feed.model.VideoItemParams r10) {
        /*
            r8 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            android.graphics.drawable.Drawable r2 = mv0()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.getAweme()
            if (r1 == 0) goto L52
            java.lang.String r0 = r1.getAid()
            if (r0 == 0) goto L52
            java.lang.String r1 = r1.getAid()
            java.lang.String r0 = "aweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.HashSet<java.lang.String> r0 = X.C72U.LIZIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L52
            r3 = 0
        L2c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAweme()
            java.lang.String r5 = kv0(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAweme()
            int r6 = lv0(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAweme()
            if (r0 != 0) goto L50
            r7 = 8
        L44:
            java.lang.String r0 = "commentCountText"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.7OR r1 = new X.7OR
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L50:
            r7 = 0
            goto L44
        L52:
            r3 = 8
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM.iv0(X.33Q, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.33Q");
    }
}
