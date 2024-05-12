package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoTagAreaContainerAbility;
import kotlin.jvm.internal.AqS153S0100000_3;

/* renamed from: X.8Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211248Qu {
    public final VideoViewCell LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public TagLayout LJFF;
    public C29701Eo LJI;
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1666));

    public final FeedInfoTagAreaContainerAbility LIZ() {
        return (FeedInfoTagAreaContainerAbility) this.LJII.getValue();
    }

    public C211248Qu(VideoViewCell videoViewCell) {
        this.LIZ = videoViewCell;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        if (r6 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L5
            X.C72083SQt.LJLJI(r6)
        L5:
            r4 = 0
            if (r6 == 0) goto Lf1
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r2 = r6.videoLabels
        La:
            r3 = 1
            if (r6 == 0) goto L7b
            boolean r0 = r6.isAd()
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L31
            boolean r0 = r0.isRightStyle()
            if (r0 != 0) goto L31
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r0 = r0.getLabel()
            if (r0 == 0) goto L31
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)
            r6.textVideoLabels = r0
        L31:
            boolean r0 = r6.isAd()
            if (r0 != r3) goto L7b
            boolean r0 = X.C63081OpJ.LLJLLIL(r6)
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.base.ui.TagLayout r1 = r5.LJFF
            if (r1 != 0) goto L75
        L41:
            com.ss.android.ugc.feed.platform.container.info.FeedInfoTagAreaContainerAbility r1 = r5.LIZ()
            if (r1 == 0) goto L54
            com.ss.android.ugc.aweme.base.ui.TagLayout r0 = r5.LJFF
            if (r0 == 0) goto L51
            boolean r0 = r0.LJLJJLL
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L51:
            r1.ov(r4)
        L54:
            com.ss.android.ugc.feed.platform.container.info.FeedInfoTagAreaContainerAbility r0 = r5.LIZ()
            if (r0 == 0) goto L5d
            r0.dj(r6)
        L5d:
            com.ss.android.ugc.aweme.base.ui.TagLayout r4 = r5.LJFF
            if (r4 == 0) goto L6f
            boolean r0 = r4.LJLJJL
            if (r0 != r3) goto L6f
            Y.IDCListenerS10S0101000 r2 = new Y.IDCListenerS10S0101000
            r1 = 2
            r0 = 6
            r2.<init>(r1, r4, r0)
            X.C16880lQ.LJJJJLL(r4, r2)
        L6f:
            com.ss.android.ugc.aweme.base.ui.TagLayout r0 = r5.LJFF
            X.C253039wR.LIZIZ(r0)
            return
        L75:
            r0 = 8
            r1.setVisibility(r0)
            goto L41
        L7b:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = X.C38354F3m.LIZJ(r7, r0)
            java.lang.String r1 = "homepage_familiar"
            if (r0 == 0) goto Lb2
            if (r6 == 0) goto Lb2
            boolean r0 = r6.isAd()
            if (r0 != 0) goto Lb2
        L8d:
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r0 = r6.getRelationLabel()
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r0 = r6.getRelationLabel()
            if (r0 == 0) goto La8
            int r0 = r0.getType()
            if (r0 != 0) goto La8
            boolean r0 = android.text.TextUtils.equals(r7, r1)
            if (r0 == 0) goto La8
            r6.setRelationLabel(r4)
        La8:
            com.ss.android.ugc.aweme.base.ui.TagLayout r1 = r5.LJFF
            if (r1 == 0) goto L41
            X.8Qr r0 = com.ss.android.ugc.aweme.base.ui.TagLayout.LJLJLJ
            r1.LIZIZ(r6, r2, r0)
            goto L41
        Lb2:
            boolean r0 = android.text.TextUtils.equals(r7, r1)
            if (r0 != 0) goto Lc9
            if (r6 == 0) goto Lc1
            boolean r0 = X.C63081OpJ.LJLIL(r6)
            if (r0 != r3) goto Lc1
            goto L8d
        Lc1:
            java.lang.String r0 = "challenge"
            boolean r0 = android.text.TextUtils.equals(r7, r0)
            if (r0 == 0) goto Lcc
        Lc9:
            if (r6 == 0) goto La8
            goto L8d
        Lcc:
            com.ss.android.ugc.aweme.base.ui.TagLayout r1 = r5.LJFF
            if (r1 == 0) goto Ld5
            X.8Qr r0 = com.ss.android.ugc.aweme.base.ui.TagLayout.LJLJLJ
            r1.LIZ(r6, r2, r0)
        Ld5:
            boolean r0 = X.C99W.LIZ
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.base.ui.TagLayout r2 = r5.LJFF
            if (r2 == 0) goto L41
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 30
            X.OUP.LJJJJLI(r2, r1, r4, r4, r0)
            goto L41
        Lf1:
            r2 = r4
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C211248Qu.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
