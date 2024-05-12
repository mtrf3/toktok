package Y;

import X.AnonymousClass636;
import X.C018905p;
import X.C161266Uo;
import X.C16880lQ;
import X.C174836tb;
import X.C181667Ba;
import X.C181677Bb;
import X.C184387Lm;
import X.C184477Lv;
import X.C184487Lw;
import X.C187917Zb;
import X.C198247qG;
import X.C198257qH;
import X.C1JX;
import X.C200847uS;
import X.C201467vS;
import X.C210838Pf;
import X.C212418Vh;
import X.C213188Yg;
import X.C213208Yi;
import X.C36922EeM;
import X.C37179EiV;
import X.C68322mC;
import X.C71799SFv;
import X.C72808Sho;
import X.C79045V0n;
import X.InterfaceC210978Pt;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.J7H;
import X.KL2;
import X.ORZ;
import X.OUP;
import X.SYL;
import X.W5F;
import X.Z9N;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewerListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageTopNavigationAssem;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerFragment;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AObserverS67S0200000_3 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ActivityStatus activityStatus = (ActivityStatus) obj;
        List<InterfaceC57784Mm4> LJII = ((LikeListFragment) aObserverS67S0200000_3.l0).Dl().getState().LJII();
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) aObserverS67S0200000_3.l1;
        Iterator it = ((ArrayList) LJII).iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) it.next();
            if ((interfaceC57784Mm42 instanceof C181667Ba) && o.LJ(((C181667Ba) interfaceC57784Mm42).LJLIL.getUid(), ((C181667Ba) interfaceC57784Mm4).LJLIL.getUid())) {
                if (i < 0 || i >= ((LikeListFragment) aObserverS67S0200000_3.l0).Dl().getState().LJIIIIZZ()) {
                    return;
                }
                C72808Sho<InterfaceC57784Mm4> state = ((LikeListFragment) aObserverS67S0200000_3.l0).Dl().getState();
                InterfaceC57784Mm4 item = (InterfaceC57784Mm4) aObserverS67S0200000_3.l1;
                o.LJIIIIZZ(item, "item");
                state.LJIILL(i, C181667Ba.LIZ((C181667Ba) item, activityStatus, null, 23));
                return;
            }
            i++;
        }
    }

    public static final void onChanged$1(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ActivityStatus activityStatus = (ActivityStatus) obj;
        List<InterfaceC57784Mm4> LJII = ((VideoViewerListFragment) aObserverS67S0200000_3.l0).vl().getState().LJII();
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) aObserverS67S0200000_3.l1;
        Iterator it = ((ArrayList) LJII).iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) it.next();
            if ((interfaceC57784Mm42 instanceof C181677Bb) && o.LJ(((C181677Bb) interfaceC57784Mm42).LJLIL.getUid(), ((C181677Bb) interfaceC57784Mm4).LJLIL.getUid())) {
                if (i < 0 || i >= ((VideoViewerListFragment) aObserverS67S0200000_3.l0).vl().getState().LJIIIIZZ()) {
                    return;
                }
                C72808Sho<InterfaceC57784Mm4> state = ((VideoViewerListFragment) aObserverS67S0200000_3.l0).vl().getState();
                InterfaceC57784Mm4 item = (InterfaceC57784Mm4) aObserverS67S0200000_3.l1;
                o.LJIIIIZZ(item, "item");
                state.LJIILL(i, C181677Bb.LIZ((C181677Bb) item, activityStatus, null, 11));
                return;
            }
            i++;
        }
    }

    public static final void onChanged$10(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) obj;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() == ((C210838Pf) aObserverS67S0200000_3.l0).LIZJ.keySet().size()) {
            C37179EiV.LJFF.postAtFrontOfQueue(new ARunnableS22S0200000_3((InterfaceC210978Pt) aObserverS67S0200000_3.l1, ORZ.LJLJJL(ORZ.LJLL(copyOnWriteArrayList)), 65));
        }
    }

    public static final void onChanged$11(AObserverS67S0200000_3 aObserverS67S0200000_3, Object it) {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aObserverS67S0200000_3.l0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS67S0200000_3.l1;
        o.LJIIIIZZ(it, "it");
        interfaceC88471Ynr.invoke(lifecycleOwner, it);
    }

    public static final void onChanged$12(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        float f;
        C174836tb c174836tb = (C174836tb) aObserverS67S0200000_3.l0;
        View view = (View) aObserverS67S0200000_3.l1;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c174836tb.LJLJI.getLayoutParams();
        Context context = view.getContext();
        if (((Boolean) obj).booleanValue()) {
            f = 90.0f;
        } else {
            f = 54.0f;
        }
        marginLayoutParams.setMarginStart((int) KL2.LIZJ(context, f));
        c174836tb.LJLJI.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r3 <= r0.longValue()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$13(Y.AObserverS67S0200000_3 r5, java.lang.Object r6) {
        /*
            com.ss.android.ugc.aweme.comment.gift.model.GiftStruct r6 = (com.ss.android.ugc.aweme.comment.gift.model.GiftStruct) r6
            com.ss.android.ugc.aweme.setting.services.IVideoGiftService r0 = com.ss.android.ugc.aweme.setting.services.VideoGiftService.LJI()
            boolean r0 = r0.LIZIZ()
            if (r6 == 0) goto L60
            if (r0 != 0) goto L39
            boolean r0 = r6.isFromGiftBag()
            if (r0 != 0) goto L39
            int r0 = r6.getDiamondCount()
            long r3 = (long) r0
            java.lang.Object r0 = r5.l0
            X.71p r0 = (X.C1792171p) r0
            com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel r0 = r0.LIZLLL
            androidx.lifecycle.MutableLiveData r0 = r0.iv0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L31
            r0 = -9223372036854775808
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L31:
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L60
        L39:
            java.lang.Object r1 = r5.l1
            X.SY4 r1 = (X.SY4) r1
            r0 = 1
            r1.setEnabled(r0)
            java.lang.Object r1 = r5.l1
            X.SY4 r1 = (X.SY4) r1
            r0 = 2131231204(0x7f0801e4, float:1.8078482E38)
            r1.setBackgroundResource(r0)
            java.lang.Object r2 = r5.l1
            X.SY4 r2 = (X.SY4) r2
            java.lang.Object r0 = r5.l0
            X.71p r0 = (X.C1792171p) r0
            X.1qj r1 = r0.LIZJ
            r0 = 2131099681(0x7f060021, float:1.7811722E38)
            int r0 = X.C04330Ez.LIZIZ(r1, r0)
            r2.setTextColor(r0)
        L5f:
            return
        L60:
            java.lang.Object r1 = r5.l1
            X.SY4 r1 = (X.SY4) r1
            r0 = 0
            r1.setEnabled(r0)
            java.lang.Object r1 = r5.l1
            X.SY4 r1 = (X.SY4) r1
            r0 = 2131231205(0x7f0801e5, float:1.8078484E38)
            r1.setBackgroundResource(r0)
            java.lang.Object r2 = r5.l1
            X.SY4 r2 = (X.SY4) r2
            java.lang.Object r0 = r5.l0
            X.71p r0 = (X.C1792171p) r0
            X.1qj r1 = r0.LIZJ
            r0 = 2131099729(0x7f060051, float:1.781182E38)
            int r0 = X.C04330Ez.LIZIZ(r1, r0)
            r2.setTextColor(r0)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS67S0200000_3.onChanged$13(Y.AObserverS67S0200000_3, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, X.8Yg] */
    public static final void onChanged$14(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ?? r3 = (C213188Yg) obj;
        if (!o.LJ(r3, ((C68322mC) aObserverS67S0200000_3.l0).element)) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aObserverS67S0200000_3.l1;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(r3.LIZ);
            }
            ((C68322mC) aObserverS67S0200000_3.l0).element = r3;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, X.8Yi] */
    public static final void onChanged$15(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ?? r4 = (C213208Yi) obj;
        if (!o.LJ(r4, ((C68322mC) aObserverS67S0200000_3.l0).element)) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aObserverS67S0200000_3.l1;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(r4.LIZ, r4.LIZIZ);
            }
            ((C68322mC) aObserverS67S0200000_3.l0).element = r4;
        }
    }

    public static final void onChanged$2(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ActivityStatus activityStatus = (ActivityStatus) obj;
        List<InterfaceC57784Mm4> LJII = ((SYL) ((ProfileViewerFragment) aObserverS67S0200000_3.l0)._$_findCachedViewById(R.id.ncu)).getState().LJII();
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) aObserverS67S0200000_3.l1;
        Iterator it = ((ArrayList) LJII).iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) it.next();
            if ((interfaceC57784Mm42 instanceof C187917Zb) && o.LJ(((C187917Zb) interfaceC57784Mm42).LJLIL.user.getUid(), ((C187917Zb) interfaceC57784Mm4).LJLIL.user.getUid())) {
                if (i < 0 || i >= ((SYL) ((ProfileViewerFragment) aObserverS67S0200000_3.l0)._$_findCachedViewById(R.id.ncu)).getState().LJIIIIZZ()) {
                    return;
                }
                C72808Sho<InterfaceC57784Mm4> state = ((SYL) ((ProfileViewerFragment) aObserverS67S0200000_3.l0)._$_findCachedViewById(R.id.ncu)).getState();
                InterfaceC57784Mm4 item = (InterfaceC57784Mm4) aObserverS67S0200000_3.l1;
                o.LJIIIIZZ(item, "item");
                C187917Zb c187917Zb = (C187917Zb) item;
                Boolean bool = null;
                if (activityStatus != null) {
                    bool = Boolean.valueOf(OUP.LJJII(activityStatus, null, null, 3));
                }
                state.LJIILL(i, C187917Zb.LIZ(c187917Zb, null, bool, activityStatus, null, 19));
                return;
            }
            i++;
        }
    }

    public static final void onChanged$3(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        Aweme aweme;
        C198257qH stickerComponent;
        C200847uS c200847uS = ((PostModeDetailFragment) aObserverS67S0200000_3.l0).LJLJL;
        PostModeDetailParams postModeDetailParams = null;
        if (c200847uS != null) {
            aweme = c200847uS.LIZJ;
            postModeDetailParams = c200847uS.LJI;
        } else {
            aweme = null;
        }
        C201467vS.LJIIJJI(aweme, postModeDetailParams, Integer.valueOf(((PostModeDetailParams) aObserverS67S0200000_3.l1).position));
        ((PostModeDetailFragment) aObserverS67S0200000_3.l0).Dl().tv0();
        C212418Vh.LJIIL(((PostModeDetailFragment) aObserverS67S0200000_3.l0).Dl(), new AqS169S0100000_3((PostModeDetailFragment) aObserverS67S0200000_3.l0, 518));
        if (!((PostModeDetailParams) aObserverS67S0200000_3.l1).autoAdvancePausedTillManualResume) {
            ((PostModeDetailFragment) aObserverS67S0200000_3.l0).Dl().lv0();
        }
        C198247qG c198247qG = ((PostModeDetailFragment) aObserverS67S0200000_3.l0).LJLLLL;
        if (c198247qG != null && (stickerComponent = c198247qG.getStickerComponent()) != null) {
            C161266Uo c161266Uo = stickerComponent.LIZJ;
            if (c161266Uo != null) {
                c161266Uo.setVisibility(0);
            }
            C161266Uo c161266Uo2 = stickerComponent.LIZJ;
            if (c161266Uo2 != null) {
                c161266Uo2.post(new ARunnableS39S0100000_3(stickerComponent, UserLevelGeckoUpdateSetting.DEFAULT));
            }
        }
    }

    public static final void onChanged$4(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ((UpvoteVideoAssem) aObserverS67S0200000_3.l0).f5(((UpvoteListViewModel) aObserverS67S0200000_3.l1).LJLIL);
    }

    public static final void onChanged$5(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ((UpvoteVideoAssemNew) aObserverS67S0200000_3.l0).f5(((UpvoteListViewModelNew) aObserverS67S0200000_3.l1).LJLIL);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, X.8Yg] */
    public static final void onChanged$6(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        ?? r3 = (C213188Yg) obj;
        if (!o.LJ(r3, ((C68322mC) aObserverS67S0200000_3.l0).element)) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aObserverS67S0200000_3.l1;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(r3.LIZ);
            }
            ((C68322mC) aObserverS67S0200000_3.l0).element = r3;
        }
    }

    public static final void onChanged$7(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        View view;
        C018905p c018905p;
        User author;
        SmartImageView smartImageView;
        TuxTextView tuxTextView;
        C71799SFv c71799SFv;
        RelationButton relationButton;
        TextView textView;
        ViewStub viewStub;
        Boolean hide = (Boolean) obj;
        View view2 = (View) aObserverS67S0200000_3.l0;
        C184487Lw c184487Lw = (C184487Lw) aObserverS67S0200000_3.l1;
        o.LJIIIIZZ(hide, "hide");
        c184487Lw.LIZJ(hide.booleanValue(), view2);
        if (hide.booleanValue()) {
            View view3 = c184487Lw.LIZJ;
            if (view3 != null) {
                view3.setAlpha(0.0f);
            }
            View view4 = c184487Lw.LIZJ;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            View findViewById = view2.findViewById(R.id.kf_);
            if (findViewById != null) {
                findViewById.setAlpha(0.0f);
            }
            View findViewById2 = view2.findViewById(R.id.kf_);
            if (findViewById2 != null) {
                findViewById2.setVisibility(4);
            }
            View findViewById3 = view2.findViewById(R.id.l_p);
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            if (!C184487Lw.LIZIZ(view2, hide.booleanValue())) {
                C184487Lw.LIZ(view2, true);
                TuxIconView tuxIconView = (TuxIconView) view2.findViewById(R.id.aeu);
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.dj);
                }
            }
            view2.findViewById(R.id.e4d).setBackgroundColor(0);
            return;
        }
        if (c184487Lw.LIZJ == null) {
            ViewGroup viewGroup = c184487Lw.LIZ.LJFF;
            if (viewGroup != null && (viewStub = (ViewStub) viewGroup.findViewById(R.id.i6z)) != null) {
                viewStub.inflate();
            }
            ViewGroup viewGroup2 = c184487Lw.LIZ.LJFF;
            ViewGroup.LayoutParams layoutParams = null;
            if (viewGroup2 != null) {
                view = viewGroup2.findViewById(R.id.i6y);
            } else {
                view = null;
            }
            c184487Lw.LIZJ = view;
            Aweme aweme = c184487Lw.LIZ.LIZJ;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                W5F LJI = C1JX.LJI(author);
                LJI.LJIILIIL(J7H.LIZ(100));
                int LIZJ = (int) KL2.LIZJ(c184487Lw.LIZ.LIZIZ, 28.0f);
                int LIZJ2 = (int) KL2.LIZJ(c184487Lw.LIZ.LIZIZ, 28.0f);
                LJI.LJII = LIZJ;
                LJI.LJIIIIZZ = LIZJ2;
                LJI.LJJIJIIJIL = true;
                View view5 = c184487Lw.LIZJ;
                if (view5 != null) {
                    smartImageView = (SmartImageView) view5.findViewById(R.id.e3q);
                } else {
                    smartImageView = null;
                }
                LJI.LJJIIJ = smartImageView;
                LJI.LJ();
                View view6 = c184487Lw.LIZJ;
                if (view6 != null && (textView = (TextView) view6.findViewById(R.id.e4f)) != null) {
                    textView.setText(author.getNickname());
                }
                View view7 = c184487Lw.LIZJ;
                if (view7 != null && (relationButton = (RelationButton) view7.findViewById(R.id.iuh)) != null) {
                    C184387Lm.LIZ(relationButton, author, c184487Lw.LIZ);
                }
                View view8 = c184487Lw.LIZJ;
                if (view8 != null && (c71799SFv = (C71799SFv) view8.findViewById(R.id.e3q)) != null) {
                    C16880lQ.LJJIL(c71799SFv, new ACListenerS23S0100000_3(c184487Lw, 186));
                }
                View view9 = c184487Lw.LIZJ;
                if (view9 != null && (tuxTextView = (TuxTextView) view9.findViewById(R.id.e4f)) != null) {
                    C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(c184487Lw, 187));
                }
            }
            if (Z9N.LIZIZ.LLILZIL()) {
                View view10 = c184487Lw.LIZJ;
                if (view10 != null) {
                    layoutParams = view10.getLayoutParams();
                }
                if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                    c018905p.endToStart = R.id.f_e;
                    c018905p.endToEnd = -1;
                }
            }
        }
        if (!C184487Lw.LIZIZ(view2, hide.booleanValue())) {
            C184487Lw.LIZ(view2, false);
            TuxIconView tuxIconView2 = (TuxIconView) view2.findViewById(R.id.aeu);
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.d4);
            }
        }
        View findViewById4 = view2.findViewById(R.id.e4d);
        Context context = view2.getContext();
        o.LJIIIIZZ(context, "context");
        findViewById4.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
        View view11 = c184487Lw.LIZJ;
        if (view11 == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view11, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2.findViewById(R.id.kf_), "alpha", 0.0f, 1.0f);
        if (Z9N.LIZIZ.LLILZIL()) {
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2.findViewById(R.id.f_e), "alpha", 0.0f, 1.0f));
        } else {
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        animatorSet.addListener(new ALAdapterS2S0200000_3(view2, c184487Lw, 3));
        animatorSet.start();
    }

    public static final void onChanged$8(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        int i;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        try {
            int[] iArr = new int[2];
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) ((View) aObserverS67S0200000_3.l0).findViewById(R.id.acf);
            if (smartAvatarImageView != null) {
                smartAvatarImageView.getLocationOnScreen(iArr);
            }
            int i2 = iArr[1];
            SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) ((View) aObserverS67S0200000_3.l0).findViewById(R.id.acf);
            if (smartAvatarImageView2 != null) {
                i = smartAvatarImageView2.getHeight();
            } else {
                i = 0;
            }
            int i3 = i2 + (i / 2);
            float f = i3;
            if (f > ((C184477Lv) aObserverS67S0200000_3.l1).LIZ()) {
                if (r3.LIZIZ <= ((C184477Lv) aObserverS67S0200000_3.l1).LIZ()) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) ((View) aObserverS67S0200000_3.l0).findViewById(R.id.dki);
                    if (constraintLayout != null) {
                        constraintLayout.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ((View) aObserverS67S0200000_3.l0).findViewById(R.id.dki);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setEnabled(true);
                    }
                    PostModeContainerViewModel postModeContainerViewModel = ((C184477Lv) aObserverS67S0200000_3.l1).LIZ.LJII;
                    if (postModeContainerViewModel != null && (mutableLiveData2 = postModeContainerViewModel.LLILIL) != null) {
                        mutableLiveData2.setValue(Boolean.TRUE);
                    }
                    ((C184477Lv) aObserverS67S0200000_3.l1).LIZIZ = i3;
                }
            }
            if (f < ((C184477Lv) aObserverS67S0200000_3.l1).LIZ()) {
                if (r3.LIZIZ >= ((C184477Lv) aObserverS67S0200000_3.l1).LIZ()) {
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ((View) aObserverS67S0200000_3.l0).findViewById(R.id.dki);
                    if (constraintLayout3 != null) {
                        constraintLayout3.setAlpha(0.0f);
                    }
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ((View) aObserverS67S0200000_3.l0).findViewById(R.id.dki);
                    if (constraintLayout4 != null) {
                        constraintLayout4.setEnabled(false);
                    }
                    PostModeContainerViewModel postModeContainerViewModel2 = ((C184477Lv) aObserverS67S0200000_3.l1).LIZ.LJII;
                    if (postModeContainerViewModel2 != null && (mutableLiveData = postModeContainerViewModel2.LLILIL) != null) {
                        mutableLiveData.setValue(Boolean.FALSE);
                    }
                }
            }
            ((C184477Lv) aObserverS67S0200000_3.l1).LIZIZ = i3;
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
    }

    public static final void onChanged$9(AObserverS67S0200000_3 aObserverS67S0200000_3, Object obj) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        C018905p c018905p;
        User author;
        SmartImageView smartImageView;
        TuxTextView tuxTextView;
        C71799SFv c71799SFv;
        RelationButton relationButton;
        TextView textView;
        Boolean hideHeader = (Boolean) obj;
        FullPageTopNavigationAssem fullPageTopNavigationAssem = (FullPageTopNavigationAssem) aObserverS67S0200000_3.l0;
        ConstraintLayout headerView = (ConstraintLayout) aObserverS67S0200000_3.l1;
        o.LJIIIIZZ(headerView, "headerView");
        o.LJIIIIZZ(hideHeader, "hideHeader");
        boolean booleanValue = hideHeader.booleanValue();
        fullPageTopNavigationAssem.F3(booleanValue, headerView);
        if (booleanValue) {
            View view2 = fullPageTopNavigationAssem.LJLJJL;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            View view3 = fullPageTopNavigationAssem.LJLJJL;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View findViewById = headerView.findViewById(R.id.kf_);
            if (findViewById != null) {
                findViewById.setAlpha(0.0f);
            }
            View findViewById2 = headerView.findViewById(R.id.kf_);
            if (findViewById2 != null) {
                findViewById2.setVisibility(4);
            }
            View findViewById3 = headerView.findViewById(R.id.l_p);
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            if (!FullPageTopNavigationAssem.E3(headerView, booleanValue)) {
                FullPageTopNavigationAssem.C3(headerView, true);
                TuxIconView tuxIconView = (TuxIconView) headerView.findViewById(R.id.aeu);
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.dj);
                }
            }
            headerView.findViewById(R.id.e4d).setBackgroundColor(0);
            return;
        }
        if (fullPageTopNavigationAssem.LJLJJL == null) {
            ViewStub viewStub = (ViewStub) fullPageTopNavigationAssem._$_findCachedViewById(R.id.i6z);
            if (viewStub != null) {
                viewStub.inflate();
            }
            fullPageTopNavigationAssem.LJLJJL = fullPageTopNavigationAssem.getContainerView().findViewById(R.id.i6y);
            Aweme aweme = fullPageTopNavigationAssem.A3().getAweme();
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                W5F LJI = C1JX.LJI(author);
                LJI.LJIILIIL(J7H.LIZ(100));
                int LIZJ = (int) KL2.LIZJ(fullPageTopNavigationAssem.getContext(), 28.0f);
                int LIZJ2 = (int) KL2.LIZJ(fullPageTopNavigationAssem.getContext(), 28.0f);
                LJI.LJII = LIZJ;
                LJI.LJIIIIZZ = LIZJ2;
                LJI.LJJIJIIJIL = true;
                View view4 = fullPageTopNavigationAssem.LJLJJL;
                if (view4 != null) {
                    smartImageView = (SmartImageView) view4.findViewById(R.id.e3q);
                } else {
                    smartImageView = null;
                }
                LJI.LJJIIJ = smartImageView;
                LJI.LJ();
                View view5 = fullPageTopNavigationAssem.LJLJJL;
                if (view5 != null && (textView = (TextView) view5.findViewById(R.id.e4f)) != null) {
                    textView.setText(author.getNickname());
                }
                View view6 = fullPageTopNavigationAssem.LJLJJL;
                if (view6 != null && (relationButton = (RelationButton) view6.findViewById(R.id.iuh)) != null) {
                    C184387Lm.LIZIZ(relationButton, author, fullPageTopNavigationAssem.A3());
                }
                View view7 = fullPageTopNavigationAssem.LJLJJL;
                if (view7 != null && (c71799SFv = (C71799SFv) view7.findViewById(R.id.e3q)) != null) {
                    C16880lQ.LJJIL(c71799SFv, new ACListenerS23S0100000_3(fullPageTopNavigationAssem, 257));
                }
                View view8 = fullPageTopNavigationAssem.LJLJJL;
                if (view8 != null && (tuxTextView = (TuxTextView) view8.findViewById(R.id.e4f)) != null) {
                    C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(fullPageTopNavigationAssem, 253));
                }
            }
            Z9N z9n = Z9N.LIZIZ;
            if (z9n.LLILZIL()) {
                View view9 = fullPageTopNavigationAssem.LJLJJL;
                if (view9 != null) {
                    layoutParams = view9.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                    c018905p.endToStart = R.id.f_e;
                    c018905p.endToEnd = -1;
                }
            }
            if (fullPageTopNavigationAssem.LJLJJLL == null && (view = fullPageTopNavigationAssem.LJLJJL) != null) {
                fullPageTopNavigationAssem.LJLJJLL = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fullPageTopNavigationAssem._$_findCachedViewById(R.id.kf_), "alpha", 0.0f, 1.0f);
                if (z9n.LLILZIL()) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(fullPageTopNavigationAssem._$_findCachedViewById(R.id.f_e), "alpha", 0.0f, 1.0f);
                    AnimatorSet animatorSet = fullPageTopNavigationAssem.LJLJJLL;
                    if (animatorSet != null) {
                        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                    } else {
                        o.LJIJI("headerAnimatorSet");
                        throw null;
                    }
                } else {
                    AnimatorSet animatorSet2 = fullPageTopNavigationAssem.LJLJJLL;
                    if (animatorSet2 != null) {
                        animatorSet2.playTogether(ofFloat, ofFloat2);
                    } else {
                        o.LJIJI("headerAnimatorSet");
                        throw null;
                    }
                }
                AnimatorSet animatorSet3 = fullPageTopNavigationAssem.LJLJJLL;
                if (animatorSet3 != null) {
                    animatorSet3.addListener(new ALAdapterS2S0100000_3(fullPageTopNavigationAssem, 6));
                } else {
                    o.LJIJI("headerAnimatorSet");
                    throw null;
                }
            }
        }
        if (!FullPageTopNavigationAssem.E3(headerView, booleanValue)) {
            FullPageTopNavigationAssem.C3(headerView, false);
            TuxIconView tuxIconView2 = (TuxIconView) headerView.findViewById(R.id.aeu);
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.d4);
            }
        }
        Context context = headerView.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.cl, context);
        if (LJI2 != null) {
            int intValue = LJI2.intValue();
            View findViewById4 = headerView.findViewById(R.id.e4d);
            if (findViewById4 != null) {
                findViewById4.setBackgroundColor(intValue);
            }
        }
        AnimatorSet animatorSet4 = fullPageTopNavigationAssem.LJLJJLL;
        if (animatorSet4 == null) {
            return;
        }
        animatorSet4.start();
    }

    public AObserverS67S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
