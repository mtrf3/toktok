package Y;

import X.AbstractC55082Lja;
import X.AnonymousClass818;
import X.C0AB;
import X.C16970lZ;
import X.C174596tD;
import X.C176996x5;
import X.C177326xc;
import X.C1799274i;
import X.C214368bA;
import X.C221018lt;
import X.C222198nn;
import X.C222938oz;
import X.C222978p3;
import X.C224748ru;
import X.C2MA;
import X.C70657RoD;
import X.C72O;
import X.C80796VnM;
import X.C82I;
import X.C82L;
import X.C82N;
import X.C8NS;
import X.EF7;
import X.EnumC177726yG;
import X.O8Z;
import X.ORZ;
import X.V16;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionViewPagerComponent;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS6S0201000_3 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Context context = ((ReusedUISlotAssem) this.l0).getContext();
        o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
        View v = C16970lZ.LIZLLL((Activity) context, this.i2);
        ((ReusedUISlotAssem) this.l0).setContainerView((View) this.l1);
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) this.l0;
        o.LJIIIIZZ(v, "v");
        reusedUISlotAssem.getClass();
        reusedUISlotAssem.LJZL = v;
        if (C214368bA.LJIILLIIL) {
            if (((ReusedUISlotAssem) this.l0).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                ((ReusedUISlotAssem) this.l0).M3(v);
            }
        } else {
            ((ReusedUISlotAssem) this.l0).M3(v);
        }
        ((Handler) ((ReusedUISlotAssem) this.l0).LJZI.getValue()).post(new ARunnableS14S0300000_3((View) this.l1, v, (ReusedUISlotAssem) this.l0, 0));
    }

    public final void LIZ$1() {
        VideoBaseCell videoBaseCell;
        boolean booleanValue;
        C222938oz c222938oz = (C222938oz) this.l0;
        C80796VnM viewPager = ((StoryMixedFeedDetailPanel) this.l1).getViewPager();
        o.LJIIIIZZ(viewPager, "viewPager");
        int i = this.i2;
        c222938oz.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preloading view of type ");
        LIZ.append(i);
        C221018lt.LIZ("PreCreateAdapter", X1D.LIZIZ(LIZ));
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = c222938oz.LLI.get(i);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            c222938oz.LLI.put(i, concurrentLinkedQueue);
        }
        View LJJIJIL = c222938oz.LJJIJIL(i, 0, 0, viewPager);
        if (C222978p3.LIZ().preCreateCellAssemEnabled) {
            C2MA LJJJI = AbstractC55082Lja.LJJJI(LJJIJIL);
            if ((LJJJI instanceof VideoViewCell) && (videoBaseCell = (VideoBaseCell) LJJJI) != null) {
                C221018lt.LIZ("PreCreateAdapter", "pre create assems");
                try {
                    VideoItemParams videoItemParams = new VideoItemParams();
                    Aweme aweme = new Aweme();
                    aweme.setAid("FAKE_DETAIL_AWEME");
                    videoItemParams.setAweme(aweme);
                    videoItemParams.setEventType(c222938oz.LJLL.eventType);
                    videoBaseCell.LJLJLLL(0, videoItemParams);
                } finally {
                    if (booleanValue) {
                    }
                }
            }
        }
        concurrentLinkedQueue.offer(LJJIJIL);
    }

    public final void LIZ$2() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        int i = rect.left;
        int i2 = this.i2;
        rect.left = i - i2;
        rect.top -= i2;
        rect.right += i2;
        rect.bottom += i2;
        TouchDelegate touchDelegate = ((View) this.l1).getTouchDelegate();
        if (touchDelegate == null) {
            touchDelegate = new TouchDelegate(rect, (View) this.l0);
        }
        ((View) this.l1).setTouchDelegate(touchDelegate);
    }

    public final void LIZ$3() {
        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ORZ.LJLLLLLL(this.i2, ((C82L) this.l0).LJLLILLLL);
        if (photoModeImageUrlModel != null) {
            C82N c82n = (C82N) this.l1;
            int i = this.i2;
            C82L c82l = (C82L) this.l0;
            if (c82n != null) {
                c82n.LIZ(new C82I(i, photoModeImageUrlModel, c82l.LJLJJLL.Ig()));
            }
            AnonymousClass818 anonymousClass818 = c82l.LJLLLLLL;
            if (anonymousClass818 != null) {
                View findViewById = c82n.LIZ.findViewById(R.id.bmz);
                o.LJIIIIZZ(findViewById, "holder.itemView.findView…e_carousel_tag_container)");
                anonymousClass818.z70(i, (FrameLayout) findViewById);
            }
        }
    }

    public static final void run$0(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        boolean LIZ;
        try {
            aRunnableS6S0201000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        boolean LIZ;
        try {
            aRunnableS6S0201000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        boolean LIZ;
        try {
            aRunnableS6S0201000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        boolean LIZ;
        try {
            if (((FeedCollectionViewPagerComponent) aRunnableS6S0201000_3.l0).k4().getParent() != null) {
                FeedCollectionViewPagerComponent feedCollectionViewPagerComponent = (FeedCollectionViewPagerComponent) aRunnableS6S0201000_3.l0;
                if (feedCollectionViewPagerComponent.LLII) {
                    C2MA curViewHolder = feedCollectionViewPagerComponent.getCurViewHolder();
                    if (curViewHolder != null) {
                        curViewHolder.l8(aRunnableS6S0201000_3.i2);
                    }
                    C222198nn.LIZ((Aweme) aRunnableS6S0201000_3.l1, new AqS169S0100000_3((FeedCollectionViewPagerComponent) aRunnableS6S0201000_3.l0, 694));
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        boolean LIZ;
        try {
            C8NS.LJII((Context) aRunnableS6S0201000_3.l0, (Aweme) aRunnableS6S0201000_3.l1, aRunnableS6S0201000_3.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        switch (aRunnableS6S0201000_3.i2) {
            case 0:
                CommentListFragment commentListFragment = (CommentListFragment) aRunnableS6S0201000_3.l0;
                commentListFragment.LLIIZ.LLIIIILZ((C0AB) aRunnableS6S0201000_3.l1);
                return;
            default:
                AwemeRawAd awemeRawAd = (AwemeRawAd) aRunnableS6S0201000_3.l0;
                Object obj = aRunnableS6S0201000_3.l1;
                if (awemeRawAd == null || obj == null) {
                    return;
                }
                O8Z.LIZ("show", awemeRawAd.getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
                return;
        }
    }

    public static final void run$6(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        int i;
        Context LIZIZ;
        WrapLinearLayoutManager wrapLinearLayoutManager;
        WrapLinearLayoutManager wrapLinearLayoutManager2;
        CommentListFragment commentListFragment = (CommentListFragment) aRunnableS6S0201000_3.l0;
        int i2 = aRunnableS6S0201000_3.i2;
        Comment comment = (Comment) aRunnableS6S0201000_3.l1;
        if (commentListFragment.isShowing() && (wrapLinearLayoutManager2 = commentListFragment.LLIIZ) != null) {
            wrapLinearLayoutManager2.LLILL();
            i = commentListFragment.LLIIZ.LLILLIZIL();
        } else {
            i = -1;
        }
        if (i < i2 && (wrapLinearLayoutManager = commentListFragment.LLIIZ) != null) {
            wrapLinearLayoutManager.LJFF(Math.max(0, i2 - 1), -commentListFragment.LJLIL);
        }
        if (commentListFragment.LJLILLLLZI.showReplyWithInsertCid() && !V16.LJJIIZ(comment)) {
            if (C72O.LIZ()) {
                commentListFragment.LJLJJL = comment;
                if (commentListFragment.LLJILLL != null && !V16.LJJIJL(comment)) {
                    CommonCommentKeyboard commonCommentKeyboard = commentListFragment.LLJILLL;
                    Comment comment2 = commentListFragment.LJLJJL;
                    Boolean valueOf = Boolean.valueOf(commentListFragment.LJLILLLLZI.isNeedShowReplyPanel());
                    commonCommentKeyboard.getClass();
                    commonCommentKeyboard.H3(new AqS92S0300000_3(commonCommentKeyboard, comment2, valueOf, 7));
                }
            } else {
                commentListFragment.LJLJJLL = comment;
                CommonCommentKeyboard commonCommentKeyboard2 = commentListFragment.LLJILLL;
                if (commonCommentKeyboard2 != null) {
                    commonCommentKeyboard2.H3(new AqS92S0300000_3(commonCommentKeyboard2, comment, Boolean.valueOf(commentListFragment.LJLILLLLZI.isNeedShowReplyPanel()), 7));
                }
            }
            if (commentListFragment.getContext() != null) {
                LIZIZ = commentListFragment.getContext();
            } else {
                LIZIZ = EF7.LIZIZ();
            }
            if (C72O.LIZ()) {
                C174596tD.LJIIIIZZ = EnumC177726yG.REPLY_COMMENT;
                C174596tD.LJIIIZ = Boolean.FALSE;
                C174596tD c174596tD = commentListFragment.LLJJJJ;
                if (c174596tD != null) {
                    c174596tD.LIZIZ(commentListFragment.LJLJI, commentListFragment.LJLILLLLZI.getEnterFrom());
                }
            } else {
                C177326xc c177326xc = commentListFragment.LLJJJIL;
                if (c177326xc != null) {
                    c177326xc.LIZIZ();
                }
            }
            C224748ru c224748ru = commentListFragment.LJLZ;
            if (c224748ru != null) {
                c224748ru.setHint(LIZIZ.getString(R.string.gzy, C1799274i.LJ(comment.getUser(), commentListFragment.LJLILLLLZI.getEventType())));
                commentListFragment.LJLZ.setEllipsize(TextUtils.TruncateAt.END);
                C176996x5 c176996x5 = commentListFragment.LLIZ;
                C224748ru c224748ru2 = commentListFragment.LJLZ;
                if (c224748ru2 != null) {
                    if (((CopyOnWriteArrayList) c176996x5.LLIIIJ).contains(c224748ru2)) {
                        CharSequence hint = c224748ru2.getHint();
                        Iterator it = ((CopyOnWriteArrayList) c176996x5.LLIIIJ).iterator();
                        while (it.hasNext()) {
                            TextView textView = (TextView) it.next();
                            if (textView != c224748ru2 && !C70657RoD.LJII(textView.getHint(), hint)) {
                                textView.setHint(hint);
                            }
                        }
                    }
                } else {
                    c176996x5.getClass();
                }
            }
            TuxIconView tuxIconView = commentListFragment.LLD;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
        }
    }

    public static final void run$7(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        boolean LIZ;
        try {
            Context context = ((FeedPhotoSlideAssem) aRunnableS6S0201000_3.l0).getContext();
            if (context != null) {
                Aweme it = (Aweme) aRunnableS6S0201000_3.l1;
                int i = aRunnableS6S0201000_3.i2;
                o.LJIIIIZZ(it, "it");
                C8NS.LJII(context, it, i);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS6S0201000_3 aRunnableS6S0201000_3) {
        boolean LIZ;
        try {
            aRunnableS6S0201000_3.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S0201000_3(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
