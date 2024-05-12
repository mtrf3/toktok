package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C62846OlW;
import X.C78765Uvh;
import X.C81156VtA;
import X.HT5;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UnifyMETStickerFeedPanel extends StickerFeedPanel {
    public List<? extends NewFaceStickerBean> LLJZ;
    public View LLJZIJLIL;
    public C62846OlW LLL;
    public C81156VtA LLLF;

    public final void LLILLIZIL() {
        NewFaceStickerBean LLILII = LLILII();
        if (LLILII == null) {
            return;
        }
        C62846OlW c62846OlW = this.LLL;
        if (c62846OlW != null) {
            C78765Uvh.LJFF(c62846OlW, LLILII.iconUrl);
            C81156VtA c81156VtA = this.LLLF;
            if (c81156VtA != null) {
                LLIL(c81156VtA, LLILII.name);
                HT5.LIZJ(LLILII.isFavorite);
                this.LLJZ = null;
                return;
            }
            o.LJIJI("marqueeTextView");
            throw null;
        }
        o.LJIJI("icon");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILLJJLI() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r6.LLILII()
            if (r0 != 0) goto L7
            return
        L7:
            com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo r2 = r0.mobileEffectTemplate
            if (r2 == 0) goto Lac
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getCurrentAweme()
            if (r0 == 0) goto Lac
            java.util.List r0 = r0.getAnchors()
            if (r0 == 0) goto Lac
            java.util.Iterator r3 = r0.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r4 = r3.next()
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r4
            if (r4 == 0) goto L1b
            r5 = 0
            com.google.gson.o r0 = new com.google.gson.o     // Catch: java.lang.Exception -> L4c
            r0.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = r4.getExtra()     // Catch: java.lang.Exception -> L4c
            com.google.gson.j r0 = com.google.gson.o.LIZ(r0)     // Catch: java.lang.Exception -> L4c
            com.google.gson.m r1 = r0.LJIIZILJ()     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "parent_template_id"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L56
            java.lang.String r1 = r0.LJJIFFI()     // Catch: java.lang.Exception -> L4c
            goto L57
        L48:
            r6.LLILLIZIL()
            goto L90
        L4c:
            r0 = move-exception
            java.lang.String r1 = "Unify MET:"
            java.lang.String r0 = r0.getMessage()
            X.C15280iq.LIZJ(r1, r0)
        L56:
            r1 = r5
        L57:
            java.lang.String r0 = r2.getTemplateId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getThumbnail()
            if (r0 == 0) goto L74
            java.util.List r3 = r0.getUrlList()
            r1 = 0
            if (r3 == 0) goto L74
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L91
        L74:
            X.VtA r1 = r6.LLLF
            if (r1 == 0) goto La0
            java.lang.String r0 = r4.getKeyword()
            r6.LLIL(r1, r0)
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r1 = new com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean
            r1.<init>()
            java.lang.String r0 = r4.getId()
            r1.id = r0
            java.util.List r0 = X.C47261Igj.LJJIJ(r1)
            r6.LLJZ = r0
        L90:
            return
        L91:
            X.OlW r2 = r6.LLL
            if (r2 == 0) goto La6
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0 = -1
            X.C78765Uvh.LJIIIZ(r2, r1, r0, r0)
            goto L74
        La0:
            java.lang.String r0 = "marqueeTextView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        La6:
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        Lac:
            r6.LLILLIZIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.UnifyMETStickerFeedPanel.LLILLJJLI():void");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageSelected() {
        super.onPageSelected();
        LLILLJJLI();
    }

    public UnifyMETStickerFeedPanel(Bundle bundle) {
        super(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel, com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
        if (this.activity != null && MSAdaptionService.LJIIL().LJI(this.activity)) {
            Activity activity = this.activity;
            C16880lQ.LLZILL(Toast.makeText(activity, activity.getString(R.string.f1i), 0));
        } else {
            List list = this.LLJZ;
            if (list == null) {
                list = this.LLJLIL;
            }
            LLILIL(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel, com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alu, relativeLayout, false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …ottom, parentView, false)");
        View findViewById = LLLLIILL.findViewById(R.id.khz);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.sticker_icon_bg)");
        this.LLJZIJLIL = findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.khy);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.sticker_icon)");
        this.LLL = (C62846OlW) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.d81);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.feed_marquee_desc)");
        this.LLLF = (C81156VtA) findViewById3;
        LLILLJJLI();
        return LLLLIILL;
    }
}
