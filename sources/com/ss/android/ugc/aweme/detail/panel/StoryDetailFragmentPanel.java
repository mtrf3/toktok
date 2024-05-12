package com.ss.android.ugc.aweme.detail.panel;

import X.C174046sK;
import X.C182407Dw;
import X.C2068389v;
import X.C38354F3m;
import X.C56702Kk;
import X.C73305Spp;
import X.C73306Spq;
import X.M89;
import X.QD3;
import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public abstract class StoryDetailFragmentPanel extends DetailFragmentPanel {
    public boolean LLJJJIL;
    public boolean LLJJJJ;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC178126yu
    public final void LIZ() {
        this.LLJJJJ = true;
        loopCurrentStory();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC178126yu
    public final void LIZIZ() {
        this.LLJJJJ = false;
        restoreStoryPlayMode();
    }

    public void LLIIJLIL() {
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final Aweme LJJLJ() {
        return getCurrentPlayAweme();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJLL() {
        super.LJLL();
        this.mViewPager.post(new ARunnableS39S0100000_3(this, 35));
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC224378rJ
    public final void VC() {
        if (!isViewValid() || getContext() == null) {
            return;
        }
        String string = getContext().getString(R.string.g81);
        o.LJIIIIZZ(string, "context.getString(R.stri…are_story_unavail_header)");
        String string2 = getContext().getString(R.string.g7y);
        o.LJIIIIZZ(string2, "context.getString(R.stri…share_story_expired_body)");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_2pt_twinkle_star;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        C73305Spp IK = this.pageStateAbility.IK();
        if (IK != null) {
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73306Spq.LJFF = string;
            c73306Spq.LJI = string2;
            c73306Spq.LJII = new AqS169S0100000_3(this, 104);
            IK.setStatus(c73306Spq);
            IK.setVisibility(0);
        }
        this.LLI.setVisibility(8);
    }

    public StoryDetailFragmentPanel(M89 m89) {
        super(m89);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void onCommentEvent(C174046sK c174046sK) {
        Integer valueOf;
        String str = null;
        if (c174046sK == null || (valueOf = Integer.valueOf(c174046sK.LJLIL)) == null) {
            return;
        }
        if (valueOf.intValue() != 3 && valueOf.intValue() != 4 && valueOf.intValue() != 8) {
            return;
        }
        Object obj = c174046sK.LJLILLLLZI;
        if (!(obj instanceof Object[])) {
            return;
        }
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 2) {
            return;
        }
        Aweme currentPlayAweme = getCurrentPlayAweme();
        if (currentPlayAweme != null) {
            str = currentPlayAweme.getAid();
        }
        C38354F3m.LIZJ(str, (String) objArr[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onCommentListPageDialogEvent(C56702Kk event) {
        o.LJIIIZ(event, "event");
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (event.LJLILLLLZI != activity.hashCode()) {
            return;
        }
        if (event.LJLIL == 1) {
            this.LLJJJIL = true;
            loopCurrentStory();
        } else {
            this.LLJJJIL = false;
            restoreStoryPlayMode();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onViewerListAuthPageEvent(C182407Dw c182407Dw) {
        if (c182407Dw == null) {
            return;
        }
        if (c182407Dw.LJLIL == 1) {
            loopCurrentStory();
        } else {
            if (this.LLJJJIL || this.LLJJJJ) {
                return;
            }
            restoreStoryPlayMode();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r3.equals("story_widget_extension_large") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a5, code lost:
    
        if (X.C211998Tr.LIZ() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r3.equals("story_widget_extension_small") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r3.equals("homepage_follow") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r3.equals("homepage_friends") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r3.equals("follow_request") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r3.equals("others_homepage") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r3.equals("chat_list") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r3.equals("notification_page") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r3.equals("story_archive") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0030, code lost:
    
        if (X.C2304092m.LIZ() != false) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            androidx.fragment.app.Fragment r0 = r5.getFragment()
            if (r0 == 0) goto L40
            X.1qj r4 = r0.mo49getActivity()
            if (r4 == 0) goto L40
            java.lang.String r3 = r5.getEventType()
            r2 = 0
            r1 = 1
            if (r3 == 0) goto L1e
            int r0 = r3.hashCode()
            switch(r0) {
                case -1728833078: goto L5a;
                case -1722027114: goto L63;
                case -1572049565: goto L99;
                case -1271119582: goto L6c;
                case -667094460: goto L75;
                case 505517057: goto L7e;
                case 809483594: goto L87;
                case 1619864869: goto L90;
                case 1837742968: goto La8;
                default: goto L1e;
            }
        L1e:
            X.Ol8 r0 = X.C211998Tr.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r1) goto L33
            boolean r0 = X.C2304092m.LIZ()
            if (r0 == 0) goto L33
        L32:
            r2 = 1
        L33:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = X.C84193Sd.LIZ(r4)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LJLJJLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r0)
        L40:
            X.M89 r0 = r5.param
            java.lang.String r0 = r0.getFrom()
            boolean r0 = X.C77123UOp.LJJIJIIJIL(r0)
            if (r0 == 0) goto L59
            X.VnM r2 = r5.getViewPager()
            Y.IDiS267S0100000_3 r1 = new Y.IDiS267S0100000_3
            r0 = 1
            r1.<init>(r5, r0)
            r2.LJI(r1)
        L59:
            return
        L5a:
            java.lang.String r0 = "story_widget_extension_large"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto L1e
        L63:
            java.lang.String r0 = "story_widget_extension_small"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto L1e
        L6c:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto L1e
        L75:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto L1e
        L7e:
            java.lang.String r0 = "follow_request"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto L1e
        L87:
            java.lang.String r0 = "others_homepage"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto L1e
        L90:
            java.lang.String r0 = "chat_list"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto L1e
        L99:
            java.lang.String r0 = "notification_page"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1e
        La1:
            boolean r0 = X.C211998Tr.LIZ()
            if (r0 != 0) goto L33
            goto L32
        La8:
            java.lang.String r0 = "story_archive"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L32
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.StoryDetailFragmentPanel.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
