package com.ss.android.ugc.aweme.feed.assem.music;

import X.C16880lQ;
import X.C30581Hy;
import X.C33Q;
import X.C40010Fn4;
import X.C54333LUb;
import X.C54838Lfe;
import X.C63081OpJ;
import X.C72231SWl;
import X.L4E;
import X.LFH;
import X.SWI;
import Y.ARunnableS48S0100000_12;
import android.os.Handler;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import defpackage.e1;

/* loaded from: classes13.dex */
public final class VideoMusicTitleVM extends FeedBaseViewModel<C72231SWl> {
    public boolean LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C72231SWl(0);
    }

    public final boolean nv0() {
        if (e1.LIZ(31744, "anim_opt", true, false) || LFH.LIZIZ.LIZLLL().LJIIJ().LJI()) {
            return true;
        }
        return false;
    }

    public final void ov0() {
        if (!this.LJLJLLL || nv0()) {
            return;
        }
        if (!L4E.LIZ.needFixMarqueeAnim) {
            this.LJLJLLL = false;
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 38));
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 39));
        }
    }

    public final void pv0() {
        if (this.LJLJLLL || nv0() || C40010Fn4.LIZJ().LIZLLL() || C54333LUb.LIZJ) {
            return;
        }
        if (!L4E.LIZ.needFixMarqueeAnim) {
            this.LJLJLLL = true;
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 88));
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 89));
        }
    }

    public final void qv0() {
        if (!this.LJLJLLL || nv0()) {
            return;
        }
        if (!L4E.LIZ.needFixMarqueeAnim) {
            this.LJLJLLL = false;
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 40));
        } else {
            if (!this.LJLJLLL) {
                return;
            }
            this.LJLJLLL = false;
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 41));
        }
    }

    public final boolean lv0() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == 3) {
            return true;
        }
        return false;
    }

    public final boolean mv0() {
        Aweme aweme;
        Aweme aweme2;
        VideoItemParams gv0 = gv0();
        Aweme aweme3 = null;
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        if (!C63081OpJ.LJJZZIII(aweme)) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null) {
                aweme3 = gv02.getAweme();
            }
            if (!C63081OpJ.LJLLJ(aweme3)) {
                return false;
            }
        }
        VideoItemParams gv03 = gv0();
        if (gv03 == null || (aweme2 = gv03.getAweme()) == null || !aweme2.isWithPromotionalMusic()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r0.isScheduleVideo() == true) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C72231SWl iv0(X.C72231SWl r12, com.ss.android.ugc.aweme.feed.model.VideoItemParams r13) {
        /*
            r11 = this;
            r2 = r12
            X.SWl r2 = (X.C72231SWl) r2
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            com.ss.android.ugc.aweme.music.model.Music r3 = X.C57245MdN.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            r1 = 0
            if (r0 == 0) goto L4c
            boolean r0 = r0.isScheduleVideo()
            r4 = 1
            if (r0 != r4) goto L4c
        L23:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            r9 = 0
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r0.getAwemeRawAd()
        L2e:
            boolean r0 = X.C53208KuS.LIZ()
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            boolean r0 = r11.kv0(r0, r1)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
        L40:
            r10 = 56
            r6 = 0
            r7 = r6
            r8 = r6
            X.SWl r0 = X.C72231SWl.LIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L4a:
            r5 = r9
            goto L2e
        L4c:
            r4 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM.iv0(X.33Q, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.33Q");
    }

    public final boolean kv0(Aweme aweme, boolean z) {
        String str;
        String str2;
        VideoItemParams gv0 = gv0();
        Music music = null;
        if (gv0 != null) {
            str = gv0.mEventType;
        } else {
            str = null;
        }
        if (!C30581Hy.LJIL(str)) {
            return false;
        }
        if ((aweme != null && aweme.isAd()) || C54838Lfe.LJJI(aweme)) {
            return false;
        }
        if (aweme != null && aweme.isPhotoMode()) {
            return false;
        }
        SWI swi = SWI.LIZIZ;
        if (aweme != null) {
            str2 = aweme.getAid();
            music = aweme.getMusic();
        } else {
            str2 = null;
        }
        if (!swi.LJIILL(music, str2, z)) {
            return false;
        }
        return true;
    }
}
