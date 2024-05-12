package Y;

import X.AbstractC55363Lo7;
import X.ActivityC45651qj;
import X.C139825eE;
import X.C182397Dv;
import X.C191387fC;
import X.C191427fG;
import X.C2063988d;
import X.C2064488i;
import X.C211628Sg;
import X.C45804HyK;
import X.C47261Igj;
import X.C76800UCe;
import X.C7GH;
import X.C8DU;
import X.HG3;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.InterfaceC88471Ynr;
import X.L10;
import X.M89;
import X.RBX;
import X.WHL;
import Y.IDDListenerS101S0200000_3;
import Y.IDDListenerS143S0100000_3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragmentV2;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.map.assem.PoiDynamicMapAssem;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS7S0400000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        int i2;
        User author;
        final String str;
        Context context = (Context) this.l0;
        Aweme aweme = (Aweme) this.l1;
        final String eventType = ((M89) this.l2).getEventType();
        o.LJI(eventType);
        int pageType = ((M89) this.l2).getPageType();
        o.LJIIIZ(context, "context");
        if (!C7GH.LIZLLL()) {
            C182397Dv.LIZ(context, 0, "did not enableVideoViewFeature");
        } else {
            String str2 = null;
            if (!C7GH.LJI()) {
                IAccountUserService LJIILL = HG3.LJIILL();
                if (aweme != null) {
                    str2 = aweme.getAuthorUid();
                }
                boolean isMe = ((RBX) LJIILL).isMe(str2);
                if (o.LJ(eventType, "personal_homepage") && ((pageType == 1000 || pageType == 40) && isMe && C7GH.LJIIJ(aweme) && C7GH.LJ(aweme) > 0)) {
                    i2 = 1;
                    i = 1;
                } else {
                    i2 = 0;
                    i = 0;
                }
                if ((o.LJ(eventType, "homepage_friends") || o.LJ(eventType, "others_homepage")) && !isMe && aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 2) {
                    i = i2 + 2;
                    i2 = 1;
                }
                if (!C7GH.LIZIZ()) {
                    i += 4;
                } else if (i2 != 0) {
                    if (PopupManager.LJFF()) {
                        return;
                    }
                    final ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                    o.LJI(LJJIFFI);
                    if (aweme == null || (str = aweme.getAid()) == null) {
                        str = "";
                    }
                    PopupManager.LJIIL(new AbstractC55363Lo7(LJJIFFI, eventType, str) { // from class: X.7Hs
                        public final ActivityC45651qj LJLIL;
                        public final String LJLILLLLZI;
                        public final String LJLJI;
                        public final int LJLJJI = 380;

                        @Override // X.InterfaceC55641Lsb
                        public final C54082LKk getPopupContext() {
                            ActivityC45651qj activityC45651qj = this.LJLIL;
                            return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
                        }

                        @Override // X.InterfaceC56321M8n
                        public final int getPriority() {
                            return this.LJLJJI;
                        }

                        @Override // X.M72
                        public final void LIZLLL(C54082LKk context2, M78 wrapper) {
                            o.LJIIIZ(context2, "context");
                            o.LJIIIZ(wrapper, "wrapper");
                            if (((Number) C183437Hv.LIZ.getValue()).intValue() == 2) {
                                ActivityC45651qj context3 = this.LJLIL;
                                String enterFrom = this.LJLILLLLZI;
                                String aid = this.LJLJI;
                                IDDListenerS143S0100000_3 iDDListenerS143S0100000_3 = new IDDListenerS143S0100000_3(wrapper, 5);
                                o.LJIIIZ(context3, "context");
                                o.LJIIIZ(enterFrom, "enterFrom");
                                o.LJIIIZ(aid, "aid");
                                VideoViewHistoryAuthorizationFragmentV2 videoViewHistoryAuthorizationFragmentV2 = new VideoViewHistoryAuthorizationFragmentV2();
                                Bundle bundle = new Bundle();
                                bundle.putString("page_type", enterFrom);
                                bundle.putBoolean("is_auto_pop", true);
                                bundle.putString("aid", aid);
                                videoViewHistoryAuthorizationFragmentV2.setArguments(bundle);
                                ASL asl = new ASL();
                                TuxSheet tuxSheet = asl.LIZ;
                                tuxSheet.LJLLILLLL = videoViewHistoryAuthorizationFragmentV2;
                                tuxSheet.LJZI = false;
                                tuxSheet.LJLILLLLZI = new IDDListenerS101S0200000_3(iDDListenerS143S0100000_3, videoViewHistoryAuthorizationFragmentV2, 1);
                                asl.LJI(0);
                                C1DG.LJII(context3, "context.supportFragmentManager", asl.LIZ, "VideoViewHistoryPopV2");
                            } else {
                                C182397Dv.LIZIZ(this.LJLIL, this.LJLILLLLZI, true, this.LJLJI, new IDDListenerS143S0100000_3(wrapper, 4));
                            }
                            int intValue = ((Number) C183417Ht.LIZ.getValue()).intValue();
                            C7GH.LIZ = false;
                            C7EJ.LIZJ(C7GH.LJFF("local_pop_up_show_frequency"), Integer.valueOf(intValue));
                        }

                        {
                            this.LJLIL = LJJIFFI;
                            this.LJLILLLLZI = eventType;
                            this.LJLJI = str;
                        }
                    });
                    return;
                }
            } else {
                i = 0;
            }
            C182397Dv.LIZ(context, Integer.valueOf(i), "did not open ");
        }
        if (L10.LIZ()) {
            ((InterfaceC65784Pro) this.l3).invoke();
        }
    }

    public final void LIZ$1() {
        Double d;
        new C191387fC();
        Context context = ((PoiDynamicMapAssem) this.l0).getContext();
        C8DU c8du = (C8DU) this.l1;
        C191427fG c191427fG = (C191427fG) this.l2;
        Double latMax = ((DynamicMapParams) this.l3).getLatMax();
        Double latMin = ((DynamicMapParams) this.l3).getLatMin();
        Double lngMax = ((DynamicMapParams) this.l3).getLngMax();
        Double lngMin = ((DynamicMapParams) this.l3).getLngMin();
        if (((DynamicMapParams) this.l3).getDefaultZoomLevel() != null) {
            d = Double.valueOf(r0.intValue());
        } else {
            d = null;
        }
        C191387fC.LIZ(context, c8du, c191427fG, latMax, latMin, lngMax, lngMin, d, C47261Igj.LJJIJ((C191427fG) this.l2), new AqS134S0200000_3((PoiDynamicMapAssem) this.l0, (C8DU) this.l1, 128), new AqS153S0100000_3((PoiDynamicMapAssem) this.l0, 775));
    }

    public final void LIZ$2() {
        InterfaceC82683Wch interfaceC82683Wch;
        InterfaceC82683Wch interfaceC82683Wch2 = ((C2063988d) this.l0).LIZJ;
        if (interfaceC82683Wch2 != null && interfaceC82683Wch2.isShowing()) {
            return;
        }
        C2063988d c2063988d = (C2063988d) this.l0;
        C139825eE c139825eE = new C139825eE((ActivityC45651qj) this.l1);
        String string = ((ActivityC45651qj) this.l1).getString(R.string.jjs);
        o.LJIIIIZZ(string, "context.getString(R.string.photoEdu_FYP_tooltip)");
        c139825eE.LIZJ = string;
        c139825eE.LIZIZ((View) this.l2);
        c139825eE.LIZ.LJII = 5000L;
        c139825eE.LJI(WHL.TOP);
        c139825eE.LJII(new AqS150S0200000_3((InterfaceC65784Pro) this.l3, (InterfaceC65784Pro<C76800UCe>) this.l0, (C2063988d) 100));
        c139825eE.LJIIJ(new ACListenerS23S0100000_3((C2063988d) this.l0, 320), true);
        c139825eE.LJ(C2064488i.LJLIL);
        c2063988d.LIZJ = c139825eE.LIZJ();
        if (!((ActivityC45651qj) this.l1).isFinishing() && (interfaceC82683Wch = ((C2063988d) this.l0).LIZJ) != null) {
            interfaceC82683Wch.show();
        }
    }

    public static final void run$0(ARunnableS7S0400000_3 aRunnableS7S0400000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0400000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0400000_3 aRunnableS7S0400000_3) {
        boolean LIZ;
        try {
            ValueAnimator valueAnimator = (ValueAnimator) aRunnableS7S0400000_3.l0;
            if (valueAnimator != null) {
                valueAnimator.addListener(new IDAListenerS4S0300000_3((FeedAvatarDefaultAssem) aRunnableS7S0400000_3.l1, (Aweme) aRunnableS7S0400000_3.l2, (FollowStatus) aRunnableS7S0400000_3.l3, 0));
                valueAnimator.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S0400000_3 aRunnableS7S0400000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0400000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S0400000_3 aRunnableS7S0400000_3) {
        boolean LIZ;
        try {
            C211628Sg c211628Sg = ((InteractAreaComponent) aRunnableS7S0400000_3.l0).LLFZ;
            if (c211628Sg != null) {
                c211628Sg.LJIJ((ComponentPriorityProtocol) aRunnableS7S0400000_3.l1, new AqS185S0100000_3((InterfaceC88471Ynr) aRunnableS7S0400000_3.l3, (InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe>) 125), (Boolean) aRunnableS7S0400000_3.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S0400000_3 aRunnableS7S0400000_3) {
        boolean LIZ;
        try {
            ValueAnimator onFollowStatusChange$lambda$18$lambda$17 = (ValueAnimator) aRunnableS7S0400000_3.l0;
            o.LJIIIIZZ(onFollowStatusChange$lambda$18$lambda$17, "onFollowStatusChange$lambda$18$lambda$17");
            onFollowStatusChange$lambda$18$lambda$17.addListener(new IDAListenerS4S0300000_3((FeedAvatarDefaultAssem) aRunnableS7S0400000_3.l1, (Aweme) aRunnableS7S0400000_3.l2, (FollowStatus) aRunnableS7S0400000_3.l3, 4));
            onFollowStatusChange$lambda$18$lambda$17.start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S0400000_3 aRunnableS7S0400000_3) {
        boolean LIZ;
        try {
            aRunnableS7S0400000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0400000_3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
