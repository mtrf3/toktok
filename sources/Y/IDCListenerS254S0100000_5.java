package Y;

import X.B4Q;
import X.B9K;
import X.BZI;
import X.C28394BCk;
import X.C28787BRn;
import X.C29674Bkk;
import X.C31093CIf;
import X.C73943T0h;
import X.C76800UCe;
import X.KL2;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.publicscreen.impl.widget.GreetingAnimWidget;
import com.bytedance.android.livesdk.broadcast.PreviewMoreYData;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewMoreWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.LiveInputProgressEvent;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentUseSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCListenerS254S0100000_5 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 9:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS254S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ConstraintProperty constraintPropertyById;
        View view2;
        if (view == null) {
            return;
        }
        LayeredElementContext layeredElementContext = ((GreetingAnimWidget) iDCListenerS254S0100000_5.l0).getLayeredElementContext();
        C76800UCe c76800UCe = null;
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.gi_)) != null && (view2 = constraintPropertyById.getView()) != null && view2.getTop() > 0 && constraintPropertyById != null) {
            view.setPivotY(constraintPropertyById.getView().getTop() - i2);
            c76800UCe = C76800UCe.LIZ;
        }
        if (c76800UCe == null) {
            view.setPivotY(view.getHeight() / 2.0f);
        }
        view.setPivotX(view.getWidth() / 2.0f);
        View view3 = ((GreetingAnimWidget) iDCListenerS254S0100000_5.l0).getView();
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(iDCListenerS254S0100000_5);
        }
    }

    public static final void onLayoutChange$1(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        PreviewMoreWidget previewMoreWidget = (PreviewMoreWidget) iDCListenerS254S0100000_5.l0;
        if (!previewMoreWidget.LJLJI) {
            previewMoreWidget.dataChannel.rv0(PreviewMoreYData.class, Integer.valueOf(i2));
        }
    }

    public static final void onLayoutChange$2(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = ((LiveBroadcastFragment) iDCListenerS254S0100000_5.l0)._$_findCachedViewById(R.id.eq3).getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (layoutParams.width == i9 && layoutParams.height == i10) {
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        ((LiveBroadcastFragment) iDCListenerS254S0100000_5.l0)._$_findCachedViewById(R.id.eq3).requestLayout();
    }

    public static final void onLayoutChange$3(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) iDCListenerS254S0100000_5.l0;
        ViewGroup.LayoutParams layoutParams = livePlayFragment.LLJ.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (layoutParams.width == i9 && layoutParams.height == i10) {
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        livePlayFragment.LLJ.requestLayout();
    }

    public static final void onLayoutChange$4(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) iDCListenerS254S0100000_5.l0;
        View view2 = liveEmojiInputDialogFragment.LLIIIILZ;
        if (view2 != null) {
            C31093CIf c31093CIf = liveEmojiInputDialogFragment.LLIIJLIL;
            if (c31093CIf != null && liveEmojiInputDialogFragment.LJLJJI != null) {
                c31093CIf.LIZIZ = liveEmojiInputDialogFragment.Dl();
                liveEmojiInputDialogFragment.LJLJJI.qv0(LiveInputProgressEvent.class, liveEmojiInputDialogFragment.LLIIJLIL);
                return;
            }
            B4Q b4q = liveEmojiInputDialogFragment.LLIIJI;
            if (b4q == null) {
                return;
            }
            b4q.LIZJ = view2.getMeasuredHeight();
            C73943T0h.LIZ().LIZIZ(liveEmojiInputDialogFragment.LLIIJI);
        }
    }

    public static final void onLayoutChange$5(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = ((TryModeBroadcastFragment) iDCListenerS254S0100000_5.l0)._$_findCachedViewById(R.id.eq3).getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (layoutParams.width == i9 && layoutParams.height == i10) {
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        ((TryModeBroadcastFragment) iDCListenerS254S0100000_5.l0)._$_findCachedViewById(R.id.eq3).requestLayout();
    }

    public static final void onLayoutChange$6(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CommentWidget commentWidget = (CommentWidget) iDCListenerS254S0100000_5.l0;
        int i9 = i3 - i;
        if (i9 < ((int) B9K.LIZ(commentWidget.context, 76.0f)) && commentWidget.LLJJIJIL != 1) {
            boolean z = commentWidget.LLIIL;
            try {
                if (commentWidget.dataChannel.kv0(C28394BCk.class) != null) {
                    long longValue = ((Long) commentWidget.dataChannel.kv0(C28394BCk.class)).longValue();
                    BZI LIZ = C28787BRn.LIZ("livesdk_comment_box_widthcheck");
                    LIZ.LJIILLIIL(commentWidget.dataChannel);
                    LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_click_available");
                    LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - longValue), "watch_duration");
                    LIZ.LJJIIJZLJL();
                }
            } catch (Exception unused) {
            }
            commentWidget.LLJJIJIL = 1;
        } else if (i9 >= ((int) B9K.LIZ(commentWidget.context, 76.0f)) && commentWidget.LLJJIJIL != 2) {
            commentWidget.LLJJIJIL = 2;
        }
        if (LiveCommentUseSetting.INSTANCE.useCurSetting()) {
            if (i > B9K.LIZ(commentWidget.context, 90.0f) && commentWidget.LLJJJ != 2) {
                commentWidget.LLJJJ = 2;
            } else {
                commentWidget.LLJJJ = 1;
            }
        }
    }

    public static final void onLayoutChange$7(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        CommentWidget commentWidget = (CommentWidget) iDCListenerS254S0100000_5.l0;
        commentWidget.getClass();
        if (!LiveCommentUseSetting.INSTANCE.useCurSetting() || commentWidget.LLJJJ == 2) {
            z = true;
        } else {
            z = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - commentWidget.LLIZ >= 500) {
            commentWidget.LLIZ = elapsedRealtime;
            if (z) {
                int i9 = i3 - i;
                LiveCommentWidthOptSetting liveCommentWidthOptSetting = LiveCommentWidthOptSetting.INSTANCE;
                if (liveCommentWidthOptSetting.isStrategySecond()) {
                    if (i9 < ((int) B9K.LIZ(commentWidget.context, 76.0f)) && commentWidget.LLJJIJIIJIL != 1 && (linearLayout = commentWidget.LJLIL) != null && linearLayout.getVisibility() != 0) {
                        LinearLayout linearLayout2 = commentWidget.LJLIL;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                        FrameLayout frameLayout2 = commentWidget.LJLJJI;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(8);
                        }
                        commentWidget.dataChannel.rv0(CommentCompressOnSmallEvent.class, 1);
                        commentWidget.LLJJIJIIJIL = 1;
                        return;
                    }
                    if (i9 < ((int) B9K.LIZ(commentWidget.context, 76.0f)) || commentWidget.LLJJIJIIJIL == 2 || (frameLayout = commentWidget.LJLJJI) == null || frameLayout.getVisibility() == 0) {
                        return;
                    }
                    LinearLayout linearLayout3 = commentWidget.LJLIL;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    FrameLayout frameLayout3 = commentWidget.LJLJJI;
                    if (frameLayout3 != null) {
                        frameLayout3.setVisibility(0);
                    }
                    commentWidget.dataChannel.rv0(CommentCompressOnSmallEvent.class, 0);
                    commentWidget.LLJJIJIIJIL = 2;
                    return;
                }
                if (!liveCommentWidthOptSetting.isStrategyFirst()) {
                    return;
                }
                float f = i9;
                if (f < ((int) B9K.LIZ(commentWidget.context, commentWidget.LLJJJIL)) && commentWidget.LLJJIJIIJIL != 1) {
                    commentWidget.LLJJIJIIJIL = 1;
                    commentWidget.LLJJJIL = 120.0f;
                    commentWidget.dataChannel.rv0(CommentCompressOnSmallEvent.class, 1);
                    commentWidget.LJLJJL.setText(commentWidget.context.getResources().getString(R.string.t0l));
                    return;
                }
                if (f < ((int) B9K.LIZ(commentWidget.context, commentWidget.LLJJJIL)) || commentWidget.LLJJIJIIJIL == 2) {
                    return;
                }
                commentWidget.LLJJIJIIJIL = 2;
                commentWidget.LLJJJIL = 76.0f;
                commentWidget.dataChannel.rv0(CommentCompressOnSmallEvent.class, 0);
                commentWidget.LJLJJL.setText(commentWidget.context.getResources().getString(R.string.mg6));
            }
        }
    }

    public static final void onLayoutChange$8(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(v, "v");
        View view = ((C29674Bkk) iDCListenerS254S0100000_5.l0).LJLJLJ;
        if (view != null) {
            view.removeOnLayoutChangeListener(iDCListenerS254S0100000_5);
            C29674Bkk c29674Bkk = (C29674Bkk) iDCListenerS254S0100000_5.l0;
            int[] iArr = c29674Bkk.LJLL;
            View view2 = c29674Bkk.LJLJLJ;
            if (view2 != null) {
                iArr[1] = view2.getTop() - ((int) KL2.LIZJ(((C29674Bkk) iDCListenerS254S0100000_5.l0).getContext(), 1.0f));
                C29674Bkk c29674Bkk2 = (C29674Bkk) iDCListenerS254S0100000_5.l0;
                View view3 = c29674Bkk2.LJLJL;
                if (view3 != null) {
                    c29674Bkk2.LJLLI = view3.getBottom();
                    ((C29674Bkk) iDCListenerS254S0100000_5.l0).LJJLJLI(false);
                    return;
                } else {
                    o.LJIJI("deleteRegionV");
                    throw null;
                }
            }
            o.LJIJI("bottomRegionV");
            throw null;
        }
        o.LJIJI("bottomRegionV");
        throw null;
    }

    public static final void onLayoutChange$9(IDCListenerS254S0100000_5 iDCListenerS254S0100000_5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = ((VoiceChatBroadcastInteractionFragment) iDCListenerS254S0100000_5.l0)._$_findCachedViewById(R.id.eq3).getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (layoutParams.width == i9 && layoutParams.height == i10) {
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        ((VoiceChatBroadcastInteractionFragment) iDCListenerS254S0100000_5.l0)._$_findCachedViewById(R.id.eq3).requestLayout();
    }
}
