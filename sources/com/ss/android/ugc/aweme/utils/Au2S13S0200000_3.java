package com.ss.android.ugc.aweme.utils;

import X.ActivityC45651qj;
import X.C192487gy;
import X.C44498HdG;
import X.C51029K0z;
import X.C55723Ltv;
import X.C73969T1h;
import X.C78999UzT;
import X.C7E7;
import X.FMX;
import X.OSZ;
import X.T16;
import X.TAT;
import Y.AfS52S0200000_3;
import Y.AfS55S0100000_3;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagAssem;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.share.ShareDependService;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class Au2S13S0200000_3 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (r1 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(com.ss.android.ugc.aweme.utils.Au2S13S0200000_3 r7, android.view.View r8) {
        /*
            if (r8 == 0) goto Lf1
            java.lang.Object r0 = r7.l0
            X.7Dy r0 = (X.C182427Dy) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.LJLILLLLZI
            r4 = 0
            java.lang.String r6 = ""
            if (r5 == 0) goto L9e
            java.util.List r0 = r5.getAnchors()
            if (r0 == 0) goto L9e
            java.util.List r0 = r5.getAnchors()
            java.lang.String r3 = "anchors"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L9e
            java.util.List r0 = r5.getAnchors()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            java.util.Iterator r2 = r0.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r0
            int r1 = r0.getType()
            X.Gt8 r0 = X.EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE
            int r0 = r0.getTYPE()
            if (r1 != r0) goto L2f
            java.util.List r0 = r5.getAnchors()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            java.util.Iterator r3 = r0.iterator()
        L52:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r0
            int r1 = r0.getType()
            X.Gt8 r0 = X.EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE
            int r0 = r0.getTYPE()
            if (r1 != r0) goto L52
        L6b:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r2 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r2
            if (r2 == 0) goto L75
            java.lang.String r0 = r2.getExtra()
            if (r0 != 0) goto L79
        L75:
            r0 = r6
            goto L79
        L77:
            r2 = 0
            goto L6b
        L79:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8c
            r1.<init>(r0)     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = "author_id"
            java.lang.Object r0 = r1.opt(r0)     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L8c
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L8c
            if (r1 != 0) goto L8d
        L8c:
            r1 = r6
        L8d:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L9e
            r4 = 1
        L9e:
            java.lang.String r0 = "click_privacy_setting_video"
            X.C7E7.LIZ = r0
            java.lang.Object r0 = r7.l0
            X.7Dy r0 = (X.C182427Dy) r0
            X.M89 r0 = r0.LJLJI
            if (r0 == 0) goto Lb0
            java.lang.String r0 = r0.getEventType()
            if (r0 != 0) goto Lb1
        Lb0:
            r0 = r6
        Lb1:
            X.C7E7.LIZIZ = r0
            java.lang.String r0 = "post"
            X.C7E7.LIZJ = r0
            X.C7E7.LIZLLL = r4
            X.C7E7.LIZ()
            java.lang.Object r0 = r7.l0
            X.7Dy r0 = (X.C182427Dy) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.LJLILLLLZI
            if (r4 == 0) goto Lf1
            X.HdG r0 = com.ss.android.ugc.aweme.share.ShareDependService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.share.ShareDependService r2 = X.C44498HdG.LIZ()
            java.lang.Object r0 = r7.l1
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            android.content.Context r3 = r0.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r5 = ""
            java.lang.Object r0 = r7.l0
            X.7Dy r0 = (X.C182427Dy) r0
            X.M89 r0 = r0.LJLJI
            if (r0 == 0) goto Lea
            java.lang.String r0 = r0.getEventType()
            if (r0 != 0) goto Lf2
        Lea:
            java.lang.String r7 = "bottom_bar"
            java.lang.String r8 = ""
            r2.LJIL(r3, r4, r5, r6, r7, r8)
        Lf1:
            return
        Lf2:
            r6 = r0
            goto Lea
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S13S0200000_3.LIZ$0(com.ss.android.ugc.aweme.utils.Au2S13S0200000_3, android.view.View):void");
    }

    public static final void LIZ$1(Au2S13S0200000_3 au2S13S0200000_3, View view) {
        if (view != null) {
            C7E7.LIZ = "click_privacy_setting_video";
            String eventType = ((StoryMixedFeedDetailPanel) au2S13S0200000_3.l0).param.getEventType();
            o.LJI(eventType);
            C7E7.LIZIZ = eventType;
            C7E7.LIZJ = "story";
            C7E7.LIZ();
            Aweme currentPlayAweme = ((StoryMixedFeedDetailPanel) au2S13S0200000_3.l0).getCurrentPlayAweme();
            if (currentPlayAweme != null) {
                ShareDependService.LIZ.getClass();
                ShareDependService LIZ = C44498HdG.LIZ();
                Context context = ((TuxTextView) au2S13S0200000_3.l1).getContext();
                o.LJIIIIZZ(context, "context");
                String eventType2 = ((StoryMixedFeedDetailPanel) au2S13S0200000_3.l0).param.getEventType();
                if (eventType2 == null) {
                    eventType2 = "";
                }
                LIZ.LJIL(context, currentPlayAweme, "", eventType2, "bottom_bar", "");
            }
        }
    }

    public static final void LIZ$2(Au2S13S0200000_3 au2S13S0200000_3, View view) {
        FMX.LJIILL("delete_collection_confirm", new OSZ("collection_video", "enter_from"), new OSZ(((CollectionContentFragment) au2S13S0200000_3.l0).LJLJJI, "collection_id"));
        CollectionManageRequest collectionManageRequest = new CollectionManageRequest(2, ((CollectionContentFragment) au2S13S0200000_3.l0).LJLJJI, null, null, null, null, null, null, null, 508, null);
        C78999UzT.LJFF(new C192487gy().LIZJ.LJJJIL(collectionManageRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3((CollectionContentFragment) au2S13S0200000_3.l0, collectionManageRequest, 4), new AfS55S0100000_3((ActivityC45651qj) au2S13S0200000_3.l1, 15)), ((CollectionContentFragment) au2S13S0200000_3.l0).Kl());
    }

    public static final void LIZ$3(Au2S13S0200000_3 au2S13S0200000_3, View view) {
        if (view != null) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) au2S13S0200000_3.l0;
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL((FeedStoryTagAssem) au2S13S0200000_3.l1)).mEventType;
            o.LJIIIIZZ(str, "item.eventType");
            c55723Ltv.LJIIL(activityC45651qj, str, ((VideoItemParams) C51029K0z.LJIILLIIL((FeedStoryTagAssem) au2S13S0200000_3.l1)).getAweme());
        }
    }

    public static final void LIZ$4(Au2S13S0200000_3 au2S13S0200000_3, View view) {
        if (view != null) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) au2S13S0200000_3.l0;
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL((FeedStoryTagAssemV2) au2S13S0200000_3.l1)).mEventType;
            o.LJIIIIZZ(str, "item.eventType");
            c55723Ltv.LJIIL(activityC45651qj, str, ((VideoItemParams) C51029K0z.LJIILLIIL((FeedStoryTagAssemV2) au2S13S0200000_3.l1)).getAweme());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S13S0200000_3(ActivityC45651qj activityC45651qj, CollectionContentFragment collectionContentFragment, int i) {
        super(500L);
        this.$t = i;
        this.l0 = collectionContentFragment;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S13S0200000_3(Object obj, Object obj2, int i) {
        super(1700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S13S0200000_3(Object obj, Object obj2, int i, int i2) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
