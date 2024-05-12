package X;

import Y.ACListenerS22S0100000_2;
import Y.ALAdapterS1S0200000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS22S0310000_2;
import kotlin.jvm.internal.AqS35S0210000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.58D */
/* loaded from: classes3.dex */
public final class C58D extends C48295IxP {
    public static final C1299458c Companion = new Object() { // from class: X.58c
    };
    public final String TAG;
    public java.util.Map<Integer, View> _$_findViewCache;
    public final C29S activity;
    public final C5H3 blackSlotHint$delegate;
    public C1280250s curSubTrackState;
    public Drawable disableOriginalVoiceIcon;
    public C58E dropTrack;
    public boolean enableEffectTinyScroller;
    public Drawable enableOriginalVoiceIcon;
    public boolean enableTinyScroller;
    public final ValueAnimator firstAnim;
    public C58Q innerListener;
    public boolean isActive;
    public boolean isCoverMode;
    public final C5H3 isMenuHierarchyUXOpt$delegate;
    public final C5H3 isRTL$delegate;
    public boolean isRecording;
    public long lastSeekTimeStamp;
    public InterfaceC1281151b mobEvent;
    public C1301258u multiTrackAdapter;
    public InterfaceC88472Yns<? super String, C76800UCe> onDropClick;
    public InterfaceC65784Pro<C76800UCe> onFingerAndTrackStop;
    public long recordPosition;
    public double scale;
    public C1279550l selectState;
    public java.util.Map<String, Integer> subTrackStateBeforeSort;
    public long timestamp;
    public TrackPanelActionListener trackPanelActionListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C58D(Context context, C29S activity) {
        this(context, activity, null, 0, 12, null);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C58D(Context context, C29S activity, AttributeSet attributeSet) {
        this(context, activity, attributeSet, 0, 8, null);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(activity, "activity");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final OSZ<Integer, Integer> getFirstTransitionLocation() {
        C76800UCe c76800UCe;
        ImageView firstTransitionView$editor_trackpanel_release;
        int[] iArr = new int[2];
        C1297357h c1297357h = (C1297357h) _$_findCachedViewById(R.id.gp3);
        if (c1297357h != null && (firstTransitionView$editor_trackpanel_release = c1297357h.getFirstTransitionView$editor_trackpanel_release()) != null) {
            firstTransitionView$editor_trackpanel_release.getLocationInWindow(iArr);
            c76800UCe = C76800UCe.LIZ;
        } else {
            c76800UCe = null;
        }
        if (c76800UCe == null) {
            return new OSZ<>(0, 0);
        }
        return new OSZ<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public final void release() {
        this.trackPanelActionListener = null;
    }

    public final void show() {
        setVisibility(0);
    }

    public final void stopRecordAudio() {
    }

    private final C58N getBlackSlotHint() {
        return (C58N) this.blackSlotHint$delegate.getValue();
    }

    private final void initListener() {
        if (AnonymousClass504.LIZLLL) {
            _$_findCachedViewById(R.id.evq).setLayerType(2, null);
        }
        C140545fO.LIZ(_$_findCachedViewById(R.id.evq), 1000L, new AqS168S0100000_2(this, 358));
        ((AbstractC1304059w) _$_findCachedViewById(R.id.dmw)).setMustUpdateScrollXListener(new AqS168S0100000_2(this, 359));
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.bxs), new ACListenerS22S0100000_2(this, 77));
        ((AbstractC1304059w) _$_findCachedViewById(R.id.dmw)).setScrollChangeListener(new AqS184S0100000_2(this, 53));
        final AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 361);
        ((C1303959v) _$_findCachedViewById(R.id.jca)).setFingerAndTrackStopListener(new AqS152S0100000_2(this, 619));
        ((C1303959v) _$_findCachedViewById(R.id.jca)).setFingerStopListener(new AqS168S0100000_2(aqS168S0100000_2, 360));
        C1303959v c1303959v = (C1303959v) _$_findCachedViewById(R.id.jca);
        c1303959v.LJLLI.add(new InterfaceC1299658e() { // from class: X.58L
            @Override // X.InterfaceC1299658e
            public final void LIZ(C5AF state, int i) {
                C58Q innerListener;
                o.LJIIIZ(state, "state");
                if (state == C5AF.IDLE) {
                    aqS168S0100000_2.invoke(Integer.valueOf(i));
                    C58Q innerListener2 = this.getInnerListener();
                    if (innerListener2 != null) {
                        C58Y.LIZ(innerListener2, i, false, true, 2);
                        return;
                    }
                    return;
                }
                if (state != C5AF.DRAGGING || (innerListener = this.getInnerListener()) == null) {
                    return;
                }
                C58Y.LIZ(innerListener, i, true, false, 4);
            }
        });
        _$_findCachedViewById(R.id.edj).setOnTouchListener(new View.OnTouchListener() { // from class: X.58W
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.58b] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.58R] */
    private final void initSubTrack() {
        ?? r6 = new InterfaceC1299858g() { // from class: X.58b
            @Override // X.InterfaceC1299858g
            public final void pause() {
            }
        };
        ?? r7 = new C5C0() { // from class: X.58R
            @Override // X.C5C0
            public final void LIZ() {
            }

            @Override // X.C5C0
            public final NLETrackSlot LIZIZ() {
                TrackPanelActionListener trackPanelActionListener = C58D.this.getTrackPanelActionListener();
                if (trackPanelActionListener != null) {
                    return trackPanelActionListener.getSelectedKeyframe();
                }
                return null;
            }
        };
        C29S c29s = this.activity;
        C1303859u subTrackGroup = (C1303859u) _$_findCachedViewById(R.id.kn7);
        o.LJIIIIZZ(subTrackGroup, "subTrackGroup");
        C1303959v scrollContainer = (C1303959v) _$_findCachedViewById(R.id.jca);
        o.LJIIIIZZ(scrollContainer, "scrollContainer");
        setMultiTrackAdapter(new C1301258u(c29s, this, subTrackGroup, scrollContainer, r6, r7));
    }

    private final boolean isFirstTransitionVisibleOnScreen() {
        boolean z;
        C1297357h c1297357h;
        boolean z2;
        EnumC127354zD enumC127354zD;
        ImageView firstTransitionView$editor_trackpanel_release;
        Rect rect = new Rect();
        C1297357h c1297357h2 = (C1297357h) _$_findCachedViewById(R.id.gp3);
        if (c1297357h2 != null && (firstTransitionView$editor_trackpanel_release = c1297357h2.getFirstTransitionView$editor_trackpanel_release()) != null) {
            z = firstTransitionView$editor_trackpanel_release.getGlobalVisibleRect(rect);
        } else {
            z = false;
        }
        C1297357h c1297357h3 = (C1297357h) _$_findCachedViewById(R.id.gp3);
        if ((c1297357h3 != null && c1297357h3.getSelectIndex() == 0) || ((c1297357h = (C1297357h) _$_findCachedViewById(R.id.gp3)) != null && c1297357h.getSelectIndex() == 1)) {
            C1297357h c1297357h4 = (C1297357h) _$_findCachedViewById(R.id.gp3);
            if (c1297357h4 != null) {
                enumC127354zD = c1297357h4.getSelectedTrackStyle();
            } else {
                enumC127354zD = null;
            }
            if (enumC127354zD == EnumC127354zD.CLIP) {
                z2 = true;
                if (!z && !z2) {
                    return true;
                }
            }
        }
        z2 = false;
        return !z ? false : false;
    }

    private final boolean isMenuHierarchyUXOpt() {
        return ((Boolean) this.isMenuHierarchyUXOpt$delegate.getValue()).booleanValue();
    }

    public final long getKeyframeTimeRange() {
        return (C1300758p.LIZIZ / C1300758p.LIZIZ()) * ((float) 1000);
    }

    public final C1301258u getMultiTrackAdapter() {
        C1301258u c1301258u = this.multiTrackAdapter;
        if (c1301258u != null) {
            return c1301258u;
        }
        o.LJIJI("multiTrackAdapter");
        throw null;
    }

    public final void hide() {
        setVisibility(8);
    }

    public final boolean isRTL() {
        return ((Boolean) this.isRTL$delegate.getValue()).booleanValue();
    }

    private final void initCustomUI() {
        Drawable drawable;
        Drawable drawable2;
        float f;
        int LIZ;
        int LIZ2;
        Integer valueOf;
        ImageView ivAdd = (ImageView) _$_findCachedViewById(R.id.evq);
        o.LJIIIIZZ(ivAdd, "ivAdd");
        C58G LJ = C1291054w.LJ();
        Integer num = LJ.LJFF;
        if (num != null) {
            ivAdd.setBackground(C04270Et.LIZIZ(ivAdd.getContext(), num.intValue()));
        }
        Drawable drawable3 = LJ.LJI;
        if (drawable3 != null) {
            ivAdd.setImageDrawable(drawable3);
        }
        if (LJ.LJJJLL) {
            ivAdd.setElevation(C134855Qz.LIZ(6.0f));
            ivAdd.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "resources");
        C58G LJ2 = C1291054w.LJ();
        Integer num2 = LJ2.LJJIIZ;
        Integer num3 = null;
        if (num2 == null ? (drawable = LJ2.LJJIIZI) == null : (drawable = resources.getDrawable(num2.intValue())) == null) {
            drawable = C04270Et.LIZIZ(getContext(), R.drawable.awj);
        }
        this.enableOriginalVoiceIcon = drawable;
        Resources resources2 = getResources();
        o.LJIIIIZZ(resources2, "resources");
        C58G LJ3 = C1291054w.LJ();
        Integer num4 = LJ3.LJJIJ;
        if (num4 == null ? (drawable2 = LJ3.LJJIJIIJI) == null : (drawable2 = resources2.getDrawable(num4.intValue())) == null) {
            drawable2 = C04270Et.LIZIZ(getContext(), R.drawable.awi);
        }
        this.disableOriginalVoiceIcon = drawable2;
        if (!C1291054w.LJ().LJJIZ) {
            ((TextView) _$_findCachedViewById(R.id.lwt)).setText("");
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.lwt).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = C134845Qy.LIZ(20.0f);
            marginLayoutParams.height = C134845Qy.LIZ(20.0f);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            marginLayoutParams.setMarginStart(((C134845Qy.LIZJ(context) / 2) - marginLayoutParams.width) - C134845Qy.LIZ(32.0f));
            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.evq).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (C1291054w.LJ().LJII != null) {
                num3 = Integer.valueOf(C134855Qz.LIZ(r0.intValue()));
            }
            if (num3 != null) {
                LIZ = num3.intValue();
            } else {
                LIZ = C134845Qy.LIZ(24.0f);
            }
            marginLayoutParams2.width = LIZ;
            if (C1291054w.LJ().LJII != null && (valueOf = Integer.valueOf(C134855Qz.LIZ(r0.intValue()))) != null) {
                LIZ2 = valueOf.intValue();
            } else {
                LIZ2 = C134845Qy.LIZ(24.0f);
            }
            marginLayoutParams2.height = LIZ2;
            marginLayoutParams2.setMarginEnd(C134845Qy.LIZ(11.0f));
        }
        if (C1291054w.LJ().LJIJ != null) {
            _$_findCachedViewById(R.id.dmw).getLayoutParams().height = C134845Qy.LIZ(r0.intValue());
        }
        View iv_time = _$_findCachedViewById(R.id.fbd);
        o.LJIIIIZZ(iv_time, "iv_time");
        changeTopMargin(iv_time, C1291054w.LJ().LJJJJJL);
        View iv_time2 = _$_findCachedViewById(R.id.fbd);
        o.LJIIIIZZ(iv_time2, "iv_time");
        changeBottomMargin(iv_time2, C1291054w.LJ().LJJJJLL);
        _$_findCachedViewById(R.id.gqa).setVisibility(0);
        _$_findCachedViewById(R.id.l3e).setVisibility(0);
        _$_findCachedViewById(R.id.crc).setVisibility(0);
        Integer num5 = C1291054w.LJ().LJIIIZ;
        if (num5 != null) {
            ((C59X) _$_findCachedViewById(R.id.l3f)).setColor(num5.intValue());
        }
        Integer num6 = C1291054w.LJ().LJIIJJI;
        if (num6 != null) {
            ((C59X) _$_findCachedViewById(R.id.crd)).setColor(num6.intValue());
        }
        Integer num7 = C1291054w.LJ().LJIIL;
        if (num7 != null) {
            ((C59X) _$_findCachedViewById(R.id.gqb)).setColor(num7.intValue());
        }
        if (C1291054w.LJ().LJJJLL) {
            f = 1.5f;
        } else {
            f = 1.0f;
        }
        int LIZ3 = C134845Qy.LIZ(f);
        _$_findCachedViewById(R.id.l3f).setLayoutParams(new FrameLayout.LayoutParams(-1, LIZ3));
        _$_findCachedViewById(R.id.gqb).setLayoutParams(new FrameLayout.LayoutParams(-1, LIZ3));
        _$_findCachedViewById(R.id.crd).setLayoutParams(new FrameLayout.LayoutParams(-1, LIZ3));
    }

    private final void initOriginUI() {
        _$_findCachedViewById(R.id.jca).setBackgroundColor(0);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.dmw).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = C134845Qy.LIZ(20.0f);
        _$_findCachedViewById(R.id.dmw).setLayoutParams(marginLayoutParams);
        _$_findCachedViewById(R.id.l7o).setVisibility(8);
        ((ImageView) _$_findCachedViewById(R.id.evq)).setVisibility(8);
        _$_findCachedViewById(R.id.lwt).setVisibility(4);
        _$_findCachedViewById(R.id.fbd).setVisibility(4);
    }

    public final void cancelClipAnim() {
        Animation animation;
        C1302559h c1302559h = (C1302559h) findViewById(R.id.b_o);
        if (c1302559h != null && (animation = c1302559h.LJLZ) != null) {
            animation.cancel();
        }
    }

    public final InterfaceC88472Yns<View, C76800UCe> getOnClickNullAudioTrack() {
        return ((C1303859u) _$_findCachedViewById(R.id.kn7)).getOnClickNullAudioTrack();
    }

    public final InterfaceC88472Yns<View, C76800UCe> getOnClickNullEffectTrack() {
        return ((C1303859u) _$_findCachedViewById(R.id.kn7)).getOnClickNullEffectTrack();
    }

    public final InterfaceC88473Ynt<NLETrackSlot, View, MotionEvent, Boolean> getOnShouldInterceptSlotClickEvent() {
        return ((C1303859u) _$_findCachedViewById(R.id.kn7)).getOnShouldInterceptSlotClickEvent();
    }

    public final long getTrackPanelTimeStamp() {
        return ((long) Math.ceil(((C1303959v) _$_findCachedViewById(R.id.jca)).getRealScrollX() / C1300758p.LIZIZ())) * 1000;
    }

    public final int getTrackScrollX() {
        return ((C1303959v) _$_findCachedViewById(R.id.jca)).getRealScrollX();
    }

    public final void hideCoverGroup() {
        ((ImageView) _$_findCachedViewById(R.id.bxs)).setVisibility(8);
        _$_findCachedViewById(R.id.by4).setVisibility(8);
    }

    public final void hideDraggingMask() {
        _$_findCachedViewById(R.id.ch3).setVisibility(4);
        _$_findCachedViewById(R.id.edj).setVisibility(8);
        _$_findCachedViewById(R.id.fbd).setAlpha(1.0f);
    }

    public final void hideStickPoint() {
        getMultiTrackAdapter().getClass();
        ((ArrayList) getMultiTrackAdapter().LJIJI).clear();
        C1301258u multiTrackAdapter = getMultiTrackAdapter();
        multiTrackAdapter.LJIILLIIL(multiTrackAdapter.LJIIJJI, null);
    }

    public final void refreshVideoFramesIfNeeded() {
        C1297357h c1297357h = (C1297357h) _$_findCachedViewById(R.id.gp3);
        c1297357h.getClass();
        C2ND.LIZIZ(new AqS152S0100000_2(c1297357h, 44), 0L);
    }

    public final void scrollToTrackEnd() {
        int desireMaxScrollX = ((AbstractC1304059w) _$_findCachedViewById(R.id.dmw)).getDesireMaxScrollX();
        C1303959v c1303959v = (C1303959v) _$_findCachedViewById(R.id.jca);
        if (isRTL()) {
            desireMaxScrollX = -desireMaxScrollX;
        }
        c1303959v.LJJLL(desireMaxScrollX);
    }

    public final void showCoverGroup() {
        ((ImageView) _$_findCachedViewById(R.id.bxs)).setVisibility(0);
        _$_findCachedViewById(R.id.by4).setVisibility(0);
    }

    public final void showDraggingMask() {
        _$_findCachedViewById(R.id.ch3).setVisibility(0);
        _$_findCachedViewById(R.id.edj).setVisibility(0);
        _$_findCachedViewById(R.id.fbd).setAlpha(0.8f);
    }

    public final void unSelectTransition() {
        C1297357h c1297357h = (C1297357h) _$_findCachedViewById(R.id.gp3);
        if (c1297357h.LJ(c1297357h.LJLLI)) {
            C59L c59l = (C59L) ListProtector.get(c1297357h.LJLILLLLZI, c1297357h.LJLLI);
            ImageView imageView = c59l.LLIIJLIL;
            if (imageView != null) {
                imageView.setSelected(false);
            }
            c59l.LJIILJJIL(false);
        }
        c1297357h.LJLLI = -1;
    }

    public final void updateLineTrackScale() {
        _$_findCachedViewById(R.id.l3e).requestLayout();
        _$_findCachedViewById(R.id.l3f).invalidate();
        _$_findCachedViewById(R.id.gqa).requestLayout();
        _$_findCachedViewById(R.id.gqb).invalidate();
        _$_findCachedViewById(R.id.kgc).requestLayout();
        _$_findCachedViewById(R.id.kgd).invalidate();
    }

    public final long getCurTimeStamp() {
        return this.timestamp;
    }

    public final boolean getEnableEffectTinyScroller$editor_trackpanel_release() {
        return this.enableEffectTinyScroller;
    }

    public final boolean getEnableTinyScroller$editor_trackpanel_release() {
        return this.enableTinyScroller;
    }

    public final ValueAnimator getFirstAnim() {
        return this.firstAnim;
    }

    public final C58Q getInnerListener() {
        return this.innerListener;
    }

    public final InterfaceC1281151b getMobEvent() {
        return this.mobEvent;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnDropClick() {
        return this.onDropClick;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnFingerAndTrackStop() {
        return this.onFingerAndTrackStop;
    }

    public final double getScale() {
        return this.scale;
    }

    public final TrackPanelActionListener getTrackPanelActionListener() {
        return this.trackPanelActionListener;
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    private final void changeTopMargin(float f) {
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.dmw).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = C134845Qy.LIZ(f);
        _$_findCachedViewById(R.id.dmw).setLayoutParams(marginLayoutParams);
    }

    private final void initDropTrack(long j) {
        try {
            View inflate = ((ViewStub) _$_findCachedViewById(R.id.kmb)).inflate();
            C5A4 c5a4 = (C5A4) inflate.findViewById(R.id.cho);
            C58E c58e = (C58E) inflate.findViewById(R.id.hq9);
            c58e.getTrackLine().setLineColor(getResources().getColor(C1291054w.LJ().LJJJJL));
            long j2 = j / 1000;
            c5a4.LJLJJLL = j2;
            c5a4.LJLJL = (int) (((float) j2) * c5a4.LJLJLLL);
            c5a4.LJLJLJ = 0;
            c5a4.scrollTo(((C5A3) _$_findCachedViewById(R.id.dmw)).getScrollX(), 0);
            c5a4.setMustUpdateScrollXListener(new AqS168S0100000_2(c58e, 356));
            c58e.setOnDropClick(new AqS168S0100000_2(this, 357));
            c58e.LIZ();
            this.dropTrack = c58e;
        } catch (Exception unused) {
        }
    }

    private final void setDropVisibility(TrackState trackState) {
        if (trackState == TrackState.PIP) {
            C58E c58e = this.dropTrack;
            if (c58e != null) {
                c58e.setDropGroupVisibility(8);
            }
            C58E c58e2 = this.dropTrack;
            if (c58e2 != null) {
                c58e2.setPipTrackVisibility(8);
                return;
            }
            return;
        }
        if (trackState != TrackState.NORMAL) {
            C58E c58e3 = this.dropTrack;
            if (c58e3 != null) {
                c58e3.setDropGroupVisibility(8);
            }
            C58E c58e4 = this.dropTrack;
            if (c58e4 != null) {
                c58e4.setPipTrackVisibility(0);
                return;
            }
            return;
        }
        C58E c58e5 = this.dropTrack;
        if (c58e5 != null) {
            c58e5.setDropGroupVisibility(0);
        }
        C58E c58e6 = this.dropTrack;
        if (c58e6 == null) {
            return;
        }
        c58e6.setPipTrackVisibility(0);
    }

    public final void adjustAnimation(NLEVideoAnimation nLEVideoAnimation) {
        C1297357h c1297357h = (C1297357h) _$_findCachedViewById(R.id.gp3);
        int selectIndex = ((C1297357h) _$_findCachedViewById(R.id.gp3)).getSelectIndex();
        if (c1297357h.LJ(selectIndex)) {
            ((C59L) ListProtector.get(c1297357h.LJLILLLLZI, selectIndex)).setVideoAnimMask(nLEVideoAnimation);
        }
    }

    public final boolean checkFirstTransitionVisibleInSafeArea(int i) {
        int i2;
        ImageView firstTransitionView$editor_trackpanel_release;
        if (!isFirstTransitionVisibleOnScreen()) {
            return false;
        }
        int intValue = getFirstTransitionLocation().getFirst().intValue();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LIZJ = C134845Qy.LIZJ(context);
        C1297357h c1297357h = (C1297357h) _$_findCachedViewById(R.id.gp3);
        if (c1297357h != null && (firstTransitionView$editor_trackpanel_release = c1297357h.getFirstTransitionView$editor_trackpanel_release()) != null) {
            i2 = firstTransitionView$editor_trackpanel_release.getWidth();
        } else {
            i2 = 0;
        }
        if (intValue <= i || (LIZJ - intValue) - i2 <= i) {
            return false;
        }
        return true;
    }

    public final void disableOnTouchScroller(boolean z) {
        ((C1303959v) _$_findCachedViewById(R.id.jca)).LLD = z;
    }

    public final void enableMainTrackClickable(boolean z) {
        ((C1297357h) _$_findCachedViewById(R.id.gp3)).LIZ(z);
        ((C1297357h) _$_findCachedViewById(R.id.gp3)).LJLLLL = z;
    }

    public final void enableMainTrackShowTips(boolean z) {
        ((C1297357h) _$_findCachedViewById(R.id.gp3)).LJLLLLLL = z;
    }

    public final void enableMainTrackTransitionClickable(boolean z) {
        C1297357h c1297357h = (C1297357h) _$_findCachedViewById(R.id.gp3);
        Iterator it = ((ArrayList) c1297357h.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ImageView transition = ((C59L) it.next()).getTransition();
            if (transition != null) {
                transition.setClickable(z);
            }
        }
        c1297357h.LLIIIILZ = z;
    }

    public final void enableTrackPanelButton(boolean z) {
        _$_findCachedViewById(R.id.evq).setClickable(z);
        _$_findCachedViewById(R.id.lwt).setClickable(z);
        ((C1297357h) _$_findCachedViewById(R.id.gp3)).LIZ(z);
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).getClipHelper().getClass();
    }

    public final void enableTransitionIcon(boolean z) {
        ((C1297357h) _$_findCachedViewById(R.id.gp3)).setEnableTransition$editor_trackpanel_release(z);
    }

    public final void init(LayoutInflater inflater) {
        o.LJIIIZ(inflater, "inflater");
        C16880lQ.LLLLIILL(inflater, R.layout.ctl, this, true);
        C1300758p.LIZ = 1000;
        ((C1303959v) _$_findCachedViewById(R.id.jca)).setTimelineScale(C1300758p.LIZIZ());
        initSubTrack();
        initListener();
        initCustomUI();
        if (AnonymousClass504.LIZLLL) {
            setHasFixSize(true);
        }
    }

    public final void scrollAudioTrack(boolean z) {
        if (z) {
            ((C1303859u) _$_findCachedViewById(R.id.kn7)).LLIIIILZ = true;
            NLETrackSlot nLETrackSlot = this.selectState.LIZJ;
            if (nLETrackSlot != null) {
                C1303859u c1303859u = (C1303859u) _$_findCachedViewById(R.id.kn7);
                c1303859u.getClass();
                int LJI = c1303859u.LJI(nLETrackSlot);
                if (LJI >= 0) {
                    int LIZ = (C0EH.LIZ(c1303859u.LLF, c1303859u.LLFF, LJI, c1303859u.getPaddingTop()) - c1303859u.getScrollY()) - c1303859u.getPaddingTop();
                    if (LIZ != 0) {
                        c1303859u.LJIILLIIL(LIZ);
                    }
                }
                if (c1303859u.getScrollY() > c1303859u.getMaxScrollY()) {
                    c1303859u.LJIILLIIL(c1303859u.getScrollY() - c1303859u.getMaxScrollY());
                }
            }
            ((C1303859u) _$_findCachedViewById(R.id.kn7)).LJFF(true);
            return;
        }
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).LLIIIILZ = false;
        NLETrackSlot nLETrackSlot2 = this.selectState.LIZJ;
        if (nLETrackSlot2 != null) {
            C1303859u c1303859u2 = (C1303859u) _$_findCachedViewById(R.id.kn7);
            c1303859u2.getClass();
            c1303859u2.LJIIL(c1303859u2.LJI(nLETrackSlot2));
        }
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).LJFF(false);
    }

    public final void setAudioCollectionClickListener(InterfaceC88472Yns<? super View, C76800UCe> onClick) {
        o.LJIIIZ(onClick, "onClick");
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setOnClickAudioCollectionTrack$editor_trackpanel_release(onClick);
    }

    public final void setAudioCollectionLabelPainter(InterfaceC1293655w labelPainter) {
        o.LJIIIZ(labelPainter, "labelPainter");
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setAudioCollectionLabelPainter$editor_trackpanel_release(labelPainter);
    }

    public final void setAudioCollectionWaveCalStrategy(InterfaceC88472Yns<? super ArrayList<Float>, Float> waveStrategy) {
        o.LJIIIZ(waveStrategy, "waveStrategy");
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setAudioCollectionCalStrategy$editor_trackpanel_release(waveStrategy);
    }

    public final void setAudioSoulPainter(C5BJ audioPainter) {
        o.LJIIIZ(audioPainter, "audioPainter");
        getMultiTrackAdapter().LJIJ.LJJIJIIJIL = audioPainter;
        getMultiTrackAdapter().LJIILL.LJIIJJI = audioPainter;
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setAudioCollectionWavePainter$editor_trackpanel_release(audioPainter);
    }

    public final void setCanMoveOutOfMainVideo(boolean z) {
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setCanMoveOutOfMainVideo(z);
    }

    public final void setCoverImage(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        C5CG c5cg = C5CG.LIZ;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        ImageView cover_image = (ImageView) _$_findCachedViewById(R.id.bxs);
        o.LJIIIIZZ(cover_image, "cover_image");
        C5CV c5cv = new C5CV();
        c5cv.LIZ(ImageView.ScaleType.CENTER_CROP);
        c5cg.LIZJ(context, bitmap, cover_image, new C5CW(c5cv));
    }

    public final void setDragOnVerticalAbility(boolean z) {
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setDragOnVerticalAbility(z);
    }

    public final void setDragState(boolean z) {
        if (z) {
            _$_findCachedViewById(R.id.fbd).setVisibility(4);
            _$_findCachedViewById(R.id.kn7).setVisibility(4);
            C58E c58e = this.dropTrack;
            if (c58e != null) {
                c58e.setVisibility(4);
            }
            this.subTrackStateBeforeSort.put("music_tiny_key", Integer.valueOf(_$_findCachedViewById(R.id.gqa).getVisibility()));
            this.subTrackStateBeforeSort.put("text_tiny_key", Integer.valueOf(_$_findCachedViewById(R.id.l3e).getVisibility()));
            this.subTrackStateBeforeSort.put("effect_tiny_key", Integer.valueOf(_$_findCachedViewById(R.id.crc).getVisibility()));
            _$_findCachedViewById(R.id.gqa).setVisibility(4);
            _$_findCachedViewById(R.id.l3e).setVisibility(4);
            _$_findCachedViewById(R.id.crc).setVisibility(4);
            _$_findCachedViewById(R.id.l7o).setVisibility(4);
            setMainTrackBtnVisibility(false);
            _$_findCachedViewById(R.id.ch1).setVisibility(0);
            ((ViewGroup) _$_findCachedViewById(R.id.jca)).setClipChildren(false);
            return;
        }
        _$_findCachedViewById(R.id.ch1).setVisibility(8);
        _$_findCachedViewById(R.id.l7o).setVisibility(0);
        setMainTrackBtnVisibility(true);
        _$_findCachedViewById(R.id.fbd).setVisibility(0);
        _$_findCachedViewById(R.id.kn7).setVisibility(0);
        C58E c58e2 = this.dropTrack;
        if (c58e2 != null) {
            c58e2.setVisibility(0);
        }
        Integer num = this.subTrackStateBeforeSort.get("music_tiny_key");
        if (num != null) {
            _$_findCachedViewById(R.id.gqa).setVisibility(num.intValue());
        }
        Integer num2 = this.subTrackStateBeforeSort.get("text_tiny_key");
        if (num2 != null) {
            _$_findCachedViewById(R.id.l3e).setVisibility(num2.intValue());
        }
        Integer num3 = this.subTrackStateBeforeSort.get("effect_tiny_key");
        if (num3 != null) {
            _$_findCachedViewById(R.id.crc).setVisibility(num3.intValue());
        }
        ((ViewGroup) _$_findCachedViewById(R.id.jca)).setClipChildren(true);
    }

    public final void setEnableEffectTinyScroller$editor_trackpanel_release(boolean z) {
        this.enableEffectTinyScroller = z;
    }

    public final void setEnableTinyScroller$editor_trackpanel_release(boolean z) {
        this.enableTinyScroller = z;
    }

    public final void setFingerUpAfterMovedListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        ((C1303959v) _$_findCachedViewById(R.id.jca)).setFingerUpAfterMovedListener(listener);
    }

    public final void setHorizontalFlingListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        ((C1303959v) _$_findCachedViewById(R.id.jca)).setHorizontalFlingListener(interfaceC88472Yns);
    }

    public final void setInnerListener(C58Q c58q) {
        this.innerListener = c58q;
    }

    public final void setIsCoverMode(boolean z) {
        this.isCoverMode = z;
        ((C1297357h) _$_findCachedViewById(R.id.gp3)).setIsCoverMode(z);
    }

    public final void setMainTrackBtnVisibility(boolean z) {
        int i;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.evq);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.lwt);
        if (!z) {
            i2 = 4;
        }
        _$_findCachedViewById.setVisibility(i2);
    }

    public final void setMobEvent(InterfaceC1281151b interfaceC1281151b) {
        this.mobEvent = interfaceC1281151b;
    }

    public final void setMultiTrackAdapter(C1301258u c1301258u) {
        o.LJIIIZ(c1301258u, "<set-?>");
        this.multiTrackAdapter = c1301258u;
    }

    public final void setMusicLineColor(int i) {
        ((C59X) _$_findCachedViewById(R.id.gqb)).setColor(i);
    }

    public final void setMuteEnable(boolean z) {
        float f;
        ((TextView) _$_findCachedViewById(R.id.lwt)).setEnabled(z);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.lwt);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        _$_findCachedViewById.setAlpha(f);
    }

    public final void setMuteState(boolean z) {
        Drawable drawable;
        int i;
        if (z) {
            drawable = this.disableOriginalVoiceIcon;
        } else {
            drawable = this.enableOriginalVoiceIcon;
            if (drawable == null) {
                return;
            }
        }
        if (C1291054w.LJ().LJJIZ) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.lwt);
            Context context = getContext();
            if (z) {
                i = R.string.dg1;
            } else {
                i = R.string.jby;
            }
            textView.setText(context.getString(i));
            ((TextView) _$_findCachedViewById(R.id.lwt)).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            return;
        }
        _$_findCachedViewById(R.id.lwt).setBackground(drawable);
    }

    public final void setNullAudioTrackPainter(InterfaceC130955Bz nullAudioTrackPainter) {
        o.LJIIIZ(nullAudioTrackPainter, "nullAudioTrackPainter");
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setNullAudioTrackPainter(nullAudioTrackPainter);
    }

    public final void setNullEffectTrackPainter(InterfaceC130955Bz nullEffectTrackPainter) {
        o.LJIIIZ(nullEffectTrackPainter, "nullEffectTrackPainter");
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setNullEffectTrackPainter(nullEffectTrackPainter);
    }

    public final void setOnClickNullAudioTrack(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setOnClickNullAudioTrack(interfaceC88472Yns);
    }

    public final void setOnClickNullEffectTrack(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setOnClickNullEffectTrack(interfaceC88472Yns);
    }

    public final void setOnDropClick(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.onDropClick = interfaceC88472Yns;
    }

    public final void setOnFingerAndTrackStop(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.onFingerAndTrackStop = interfaceC65784Pro;
    }

    public final void setOnShouldInterceptSlotClickEvent(InterfaceC88473Ynt<? super NLETrackSlot, ? super View, ? super MotionEvent, Boolean> interfaceC88473Ynt) {
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setOnShouldInterceptSlotClickEvent(interfaceC88473Ynt);
    }

    public final void setPipDropClickable(boolean z) {
        C58E c58e = this.dropTrack;
        if (c58e != null) {
            c58e.setPipDropViewClickable(z);
        }
    }

    public final void setPipDropVisibility(boolean z) {
        if (z) {
            C58E c58e = this.dropTrack;
            if (c58e != null) {
                c58e.setDropGroupVisibility(0);
            }
            C58E c58e2 = this.dropTrack;
            if (c58e2 != null) {
                c58e2.setPipTrackVisibility(0);
                return;
            }
            return;
        }
        C58E c58e3 = this.dropTrack;
        if (c58e3 != null) {
            c58e3.setDropGroupVisibility(8);
        }
        C58E c58e4 = this.dropTrack;
        if (c58e4 == null) {
            return;
        }
        c58e4.setPipTrackVisibility(8);
    }

    public final void setPlayHeadLength(int i) {
        if (i < 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.fbd).getLayoutParams();
        layoutParams.height = i;
        _$_findCachedViewById(R.id.fbd).setLayoutParams(layoutParams);
    }

    public final void setRecording(boolean z) {
        this.isRecording = z;
    }

    public final void setSelectState(C1279550l state) {
        o.LJIIIZ(state, "state");
        this.selectState = state;
        if (state.LIZIZ == null || state.LIZJ == null) {
            ((C1303859u) _$_findCachedViewById(R.id.kn7)).LJIILIIL(false);
        } else {
            if (state.LIZ) {
                ((C1303859u) _$_findCachedViewById(R.id.kn7)).LJIILIIL(false);
                return;
            }
            C1303859u subTrackGroup = (C1303859u) _$_findCachedViewById(R.id.kn7);
            o.LJIIIIZZ(subTrackGroup, "subTrackGroup");
            subTrackGroup.LJIILJJIL(state.LIZJ, state.LJ);
        }
    }

    public final void setStickerLineColor(int i) {
        ((C59W) _$_findCachedViewById(R.id.kgd)).setLineColor(i);
    }

    public final void setSubTrackGroupRecording(boolean z) {
        int scrollY;
        int maxScrollY;
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setRecordingAudio$editor_trackpanel_release(z);
        if (!z && (scrollY = _$_findCachedViewById(R.id.kn7).getScrollY()) > (maxScrollY = ((AbstractC1304059w) _$_findCachedViewById(R.id.kn7)).getMaxScrollY())) {
            ((C1303859u) _$_findCachedViewById(R.id.kn7)).LJIILLIIL(scrollY - maxScrollY);
        }
    }

    public final void setSubTrackPadding(int i) {
        View subTrackGroup = _$_findCachedViewById(R.id.kn7);
        o.LJIIIIZZ(subTrackGroup, "subTrackGroup");
        changeTopPadding(subTrackGroup, i);
    }

    public final void setTextLineColor(int i) {
        ((C59X) _$_findCachedViewById(R.id.l3f)).setColor(i);
    }

    public final void setTimeLinePainter(C55M timePaint) {
        o.LJIIIZ(timePaint, "timePaint");
        ((C1300858q) _$_findCachedViewById(R.id.l7n)).setTimeLinePaint(timePaint);
    }

    public final void setTrackDragEventListener(C5AH eventListener) {
        o.LJIIIZ(eventListener, "eventListener");
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setTrackDragEventListener$editor_trackpanel_release(eventListener);
    }

    public final void setTrackPanelActionListener(TrackPanelActionListener trackPanelActionListener) {
        this.trackPanelActionListener = trackPanelActionListener;
    }

    public final void setTrackSlotLabelPainter(C5AI labelPainter) {
        o.LJIIIZ(labelPainter, "labelPainter");
        getMultiTrackAdapter().LJIILIIL = labelPainter;
    }

    public final void showOrHideNullAudioTrack(boolean z) {
        C1303859u c1303859u = (C1303859u) _$_findCachedViewById(R.id.kn7);
        if (z) {
            c1303859u.LJLLILLLL.setVisibility(0);
        } else {
            c1303859u.LJLLILLLL.setVisibility(8);
        }
    }

    public final void showOrHideNullEffectTrack(boolean z) {
        C1303859u c1303859u = (C1303859u) _$_findCachedViewById(R.id.kn7);
        if (z) {
            c1303859u.LJLLJ.setVisibility(0);
        } else {
            c1303859u.LJLLJ.setVisibility(8);
        }
    }

    public final void switchUIState(C1280250s state) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        o.LJIIIZ(state, "state");
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.dmw).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        if (isMenuHierarchyUXOpt()) {
            C1301258u multiTrackAdapter = getMultiTrackAdapter();
            multiTrackAdapter.getClass();
            TrackState trackState = state.LJLIL;
            TrackState trackState2 = TrackState.NORMAL;
            if (trackState == trackState2) {
                multiTrackAdapter.LIZ.setItemHeight$editor_trackpanel_release(C134845Qy.LIZ(24.0f));
            } else {
                multiTrackAdapter.LIZ.setItemHeight$editor_trackpanel_release(C134845Qy.LIZ(34.0f));
            }
            C1303859u c1303859u = (C1303859u) _$_findCachedViewById(R.id.kn7);
            if (state.LJLIL != trackState2) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1303859u.setEnableDrag$editor_trackpanel_release(z2);
        }
        if (state.LJLILLLLZI != this.curSubTrackState.LJLILLLLZI) {
            this.firstAnim.removeAllUpdateListeners();
            C16880lQ.LJLJL(this.firstAnim);
            this.firstAnim.setFloatValues((i / Resources.getSystem().getDisplayMetrics().density) + 0.5f, state.LJLILLLLZI);
            this.firstAnim.addUpdateListener(new AUListenerS91S0100000_2(this, 27));
            this.firstAnim.start();
        }
        TrackState trackState3 = state.LJLIL;
        TrackState trackState4 = TrackState.PIP;
        if (trackState3 == trackState4 && this.curSubTrackState.LJLIL != trackState4) {
            showPipTrackAnim(_$_findCachedViewById(R.id.dmw).getHeight() + C134845Qy.LIZ(state.LJLJJI) + C134845Qy.LIZ(state.LJLJI), C134845Qy.LIZ(state.LJLILLLLZI) - i);
        } else {
            C1280250s c1280250s = this.curSubTrackState;
            if (c1280250s.LJLIL == trackState4 && trackState3 != trackState4) {
                if (c1280250s.LJLJJLL) {
                    C58Q c58q = this.innerListener;
                    if (c58q != null) {
                        c58q.LIZLLL();
                    }
                } else {
                    hidePipTrackAnim(_$_findCachedViewById(R.id.dmw).getHeight() + C134845Qy.LIZ(state.LJLJJI) + C134845Qy.LIZ(state.LJLJI), C134845Qy.LIZ(state.LJLILLLLZI) - i);
                }
            }
        }
        int i4 = 8;
        if (this.enableTinyScroller) {
            C58E c58e = this.dropTrack;
            if (c58e != null) {
                changeBottomMargin(c58e, state.LJLJJI);
            }
            setDropVisibility(state.LJLIL);
        } else if (isMenuHierarchyUXOpt()) {
            C58E c58e2 = this.dropTrack;
            if (c58e2 != null) {
                changeBottomMargin(c58e2, state.LJLJJI);
            }
            setDropVisibility(state.LJLIL);
        } else {
            C58E c58e3 = this.dropTrack;
            if (c58e3 != null) {
                c58e3.setDropGroupVisibility(8);
            }
            C58E c58e4 = this.dropTrack;
            if (c58e4 != null) {
                c58e4.setPipTrackVisibility(8);
            }
        }
        View subTrackGroup = _$_findCachedViewById(R.id.kn7);
        o.LJIIIIZZ(subTrackGroup, "subTrackGroup");
        changeTopMargin(subTrackGroup, state.LJLJI);
        if (this.enableTinyScroller) {
            if (this.enableEffectTinyScroller) {
                View effectTinyScroller = _$_findCachedViewById(R.id.crc);
                o.LJIIIIZZ(effectTinyScroller, "effectTinyScroller");
                changeBottomMargin(effectTinyScroller, state.LJLJJL);
            }
            switch (C1279950p.LIZ[state.LJLIL.ordinal()]) {
                case 1:
                    if (isMenuHierarchyUXOpt()) {
                        _$_findCachedViewById(R.id.l3e).setVisibility(8);
                        _$_findCachedViewById(R.id.crc).setVisibility(8);
                    } else {
                        _$_findCachedViewById(R.id.l3e).setVisibility(0);
                        View _$_findCachedViewById = _$_findCachedViewById(R.id.crc);
                        if (this.enableEffectTinyScroller) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        _$_findCachedViewById.setVisibility(i3);
                    }
                    _$_findCachedViewById(R.id.gqa).setVisibility(8);
                    break;
                case 2:
                    _$_findCachedViewById(R.id.gqa).setVisibility(8);
                    _$_findCachedViewById(R.id.l3e).setVisibility(0);
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.crc);
                    if (this.enableEffectTinyScroller) {
                        i4 = 0;
                    }
                    _$_findCachedViewById2.setVisibility(i4);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    _$_findCachedViewById(R.id.gqa).setVisibility(0);
                    View _$_findCachedViewById3 = _$_findCachedViewById(R.id.crc);
                    if (this.enableEffectTinyScroller) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    _$_findCachedViewById3.setVisibility(i2);
                    TrackState trackState5 = state.LJLIL;
                    if (trackState5 == trackState4) {
                        _$_findCachedViewById(R.id.l3e).setVisibility(0);
                        break;
                    } else if (trackState5 == TrackState.TEXT) {
                        _$_findCachedViewById(R.id.l3e).setVisibility(8);
                        break;
                    }
                    break;
                case 8:
                    _$_findCachedViewById(R.id.gqa).setVisibility(0);
                    _$_findCachedViewById(R.id.l3e).setVisibility(0);
                    _$_findCachedViewById(R.id.crc).setVisibility(8);
                    break;
            }
        } else {
            _$_findCachedViewById(R.id.gqa).setVisibility(8);
            _$_findCachedViewById(R.id.l3e).setVisibility(8);
            _$_findCachedViewById(R.id.crc).setVisibility(8);
        }
        if (state.LJLIL == TrackState.AUDIORECORD) {
            _$_findCachedViewById(R.id.kn7).setScrollY(0);
        }
        this.curSubTrackState = state;
        C1303859u c1303859u2 = (C1303859u) _$_findCachedViewById(R.id.kn7);
        TrackState state2 = state.LJLIL;
        c1303859u2.getClass();
        o.LJIIIZ(state2, "state");
        c1303859u2.LLIILII = state2;
        for (Map.Entry entry : ((LinkedHashMap) c1303859u2.LLIIIJ).entrySet()) {
            entry.getKey();
            C5A5 c5a5 = ((C1301058s) entry.getValue()).LJLILLLLZI;
            if (c5a5 instanceof C130675Ax) {
                C130545Ak c130545Ak = ((C130675Ax) c5a5).LJLJJI;
                if (state2 == TrackState.NORMAL) {
                    z = true;
                } else {
                    z = false;
                }
                c130545Ak.setCurrentInRootState(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tryRefreshLimitBg(long r13) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58D.tryRefreshLimitBg(long):void");
    }

    public final void updatePlayState(PlayPositionState playState) {
        o.LJIIIZ(playState, "playState");
        updatePlayState(playState, false);
    }

    public final void updateRecordWavePoint(List<Float> recordWavePoints) {
        o.LJIIIZ(recordWavePoints, "recordWavePoints");
        C1301258u multiTrackAdapter = getMultiTrackAdapter();
        multiTrackAdapter.getClass();
        C1302459g c1302459g = multiTrackAdapter.LJIJ;
        c1302459g.getClass();
        c1302459g.LJJIJL = recordWavePoints;
        c1302459g.LJIIJJI = c1302459g.LJIILIIL() * recordWavePoints.size() * 30;
    }

    private final void hidePipTrackAnim(float f, int i) {
        float height = C59W.LJLJJLL / _$_findCachedViewById(R.id.kn7).getHeight();
        float height2 = (getHeight() - _$_findCachedViewById(R.id.dmw).getBottom()) - i;
        C1303859u c1303859u = (C1303859u) _$_findCachedViewById(R.id.kn7);
        o.LJIIIIZZ(c1303859u, "this");
        C58J c58j = new C58J(c1303859u);
        c58j.LJ = height;
        c58j.LIZJ = -(((height2 - (height2 * height)) / 2) + f);
        c58j.LJI = 342L;
        c58j.LJIIIIZZ = new C58T();
        c58j.LJIIIZ = new ALAdapterS1S0200000_2(this, c1303859u, 9);
        c58j.LIZ();
    }

    private final void showPipTrackAnim(float f, int i) {
        float height = C59W.LJLJJLL / _$_findCachedViewById(R.id.kn7).getHeight();
        float height2 = (getHeight() - _$_findCachedViewById(R.id.dmw).getBottom()) - i;
        C1303859u c1303859u = (C1303859u) _$_findCachedViewById(R.id.kn7);
        c1303859u.LJ().setTranslationY(-(((height2 - (height2 * height)) / 2) + f));
        c1303859u.LJ().setScaleY(height);
        C58J c58j = new C58J(c1303859u);
        c58j.LJ = 1.0f;
        c58j.LIZJ = 0.0f;
        c58j.LJI = 342L;
        c58j.LJIIIIZZ = new C58T();
        c58j.LJIIIZ = null;
        c58j.LIZ();
    }

    public final void changeBottomMargin(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.bottomMargin != C134845Qy.LIZ(f)) {
            marginLayoutParams.bottomMargin = C134845Qy.LIZ(f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void changeTopMargin(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != C134845Qy.LIZ(f)) {
            marginLayoutParams.topMargin = C134845Qy.LIZ(f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void changeTopPadding(View view, int i) {
        o.LJIIIZ(view, "<this>");
        V2B.LJIILL(view, 0, C134845Qy.LIZ(i), 0, 0);
    }

    public final void setActive(boolean z, boolean z2) {
        this.isActive = z;
        if (!z && z2) {
            ((C1303959v) _$_findCachedViewById(R.id.jca)).LJJLL(0);
        }
    }

    public final void setPlayHeadWidth(float f, float f2) {
        C1301859a c1301859a = (C1301859a) _$_findCachedViewById(R.id.fbd);
        c1301859a.setPlayHeadWidth(f);
        c1301859a.setGapWidth(f2);
        c1301859a.invalidate();
    }

    public final void setStickPoint(List<Long> stickPointList, Integer num) {
        o.LJIIIZ(stickPointList, "stickPointList");
        getMultiTrackAdapter().getClass();
        ((ArrayList) getMultiTrackAdapter().LJIJI).clear();
        ((ArrayList) getMultiTrackAdapter().LJIJI).addAll(stickPointList);
        C1301258u multiTrackAdapter = getMultiTrackAdapter();
        multiTrackAdapter.LJIILLIIL(multiTrackAdapter.LJIIJJI, null);
    }

    public final void setSubTrackState(List<C1280750x> trackList, NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(trackList, "trackList");
        C1301258u multiTrackAdapter = getMultiTrackAdapter();
        multiTrackAdapter.getClass();
        multiTrackAdapter.LJIIJJI.clear();
        multiTrackAdapter.LJIIJJI.addAll(trackList);
        if (multiTrackAdapter.LJFF) {
            multiTrackAdapter.LJFF = false;
            multiTrackAdapter.LIZ.setAdapter(multiTrackAdapter);
        }
        multiTrackAdapter.LJIILJJIL.LJFF = false;
        multiTrackAdapter.LJIILL.LJFF = false;
        multiTrackAdapter.LJIJ.LJFF = false;
        multiTrackAdapter.LJIILLIIL(multiTrackAdapter.LJIIJJI, nLETrackSlot);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) multiTrackAdapter.LJI).entrySet()) {
            Object key = entry.getKey();
            C1301058s c1301058s = (C1301058s) entry.getValue();
            Iterator<C1280750x> it = multiTrackAdapter.LJIIJJI.iterator();
            while (it.hasNext()) {
                C1280750x next = it.next();
                if (next.LIZ == c1301058s.LJLIL && next.LIZJ == EnumC123864ta.VIDEO) {
                    linkedHashMap.put(key, c1301058s);
                }
            }
        }
        C1301358v c1301358v = multiTrackAdapter.LJIILJJIL;
        c1301358v.getClass();
        C59D c59d = c1301358v.LJIILIIL;
        c59d.getClass();
        c59d.LIZLLL.clear();
        c59d.LIZLLL.putAll(linkedHashMap);
        FrameCacheViewModel.jv0(c1301358v.LJIIL);
    }

    public final void setTimeState(long j, long j2) {
        long j3 = 1000;
        long j4 = j / j3;
        ((C1300858q) _$_findCachedViewById(R.id.l7n)).setDurationTime(j4);
        C58N blackSlotHint = getBlackSlotHint();
        long j5 = j2 / j3;
        blackSlotHint.LIZLLL = j5;
        blackSlotHint.LIZJ = j4;
        ((C1303959v) _$_findCachedViewById(R.id.jca)).LJJZZI(j4);
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setMainVideoDuration(j5);
        ((C1303859u) _$_findCachedViewById(R.id.kn7)).setTotalVideoDuration(j4);
        if (this.timestamp > j4) {
            updatePlayState(new PlayPositionState(j, false, false, 6, null));
        }
    }

    public final void startRecordAudio(long j, int i) {
        this.isRecording = true;
        this.recordPosition = j;
    }

    public final void updatePlayState(PlayPositionState playState, boolean z) {
        o.LJIIIZ(playState, "playState");
        if (!this.isActive) {
            return;
        }
        C2ND.LIZIZ(new AqS35S0210000_2(this, playState, z, 5), 0L);
    }

    public final void updateScale(float f, boolean z) {
        C2ND.LIZIZ(new C58H(this, f, z), 0L);
    }

    public final void setDropTrack(List<C1280750x> tracks, InterfaceC1300258k frameGet, long j) {
        o.LJIIIZ(tracks, "tracks");
        o.LJIIIZ(frameGet, "frameGet");
        if (this.dropTrack == null) {
            initDropTrack(j);
        }
        C58E c58e = this.dropTrack;
        if (c58e != null) {
            c58e.LJLJI = tracks;
            C1299958h c1299958h = c58e.LJLIL;
            c1299958h.getClass();
            c1299958h.removeAllViews();
            c1299958h.LJLILLLLZI = tracks;
            c1299958h.LJLJI.clear();
            ((ArrayList) c1299958h.LJLIL).clear();
            for (C1280750x c1280750x : c1299958h.LJLILLLLZI) {
                if (c1280750x.LIZJ == EnumC123864ta.VIDEO) {
                    for (NLETrackSlot nLETrackSlot : c1280750x.LIZLLL) {
                        Context context = c1299958h.getContext();
                        o.LJIIIIZZ(context, "context");
                        C1300058i c1300058i = new C1300058i(context, c1280750x.LIZ, nLETrackSlot, frameGet, c1299958h.LJLJL);
                        ((ArrayList) c1299958h.LJLIL).add(c1300058i);
                        int startTime = (int) (nLETrackSlot.getStartTime() / 1000);
                        List<C1300058i> list = c1299958h.LJLJI.get(startTime);
                        if (list == null) {
                            list = new ArrayList<>();
                            c1299958h.LJLJI.put(startTime, list);
                        }
                        list.add(c1300058i);
                        c1299958h.addView(c1300058i.LIZ(), new FrameLayout.LayoutParams(C1300058i.LJIIJ, C1300058i.LJIIJJI));
                    }
                }
            }
            c58e.LJLILLLLZI.setTrackList(tracks);
            c58e.requestLayout();
        }
    }

    public final void updatePlayStateSmoothly(PlayPositionState playState, boolean z, InterfaceC65784Pro<C76800UCe> done) {
        o.LJIIIZ(playState, "playState");
        o.LJIIIZ(done, "done");
        if (!this.isActive) {
            return;
        }
        C2ND.LIZIZ(new AqS22S0310000_2(this, (C58D) playState, (PlayPositionState) done, (InterfaceC65784Pro<C76800UCe>) z, true), 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58D(Context context, C29S activity, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(activity, "activity");
        this._$_findViewCache = new LinkedHashMap();
        this.activity = activity;
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        C58Z.LIZ = LLLLL;
        this.TAG = "TrackPanel";
        this.isActive = true;
        this.scale = 1.0d;
        this.selectState = new C1279550l(false, null, null, null, null, null, false, false, false, 510);
        this.curSubTrackState = new C1280250s(TrackState.NORMAL, 0.0f, 0.0f, 0.0f);
        this.subTrackStateBeforeSort = new LinkedHashMap();
        this.isRTL$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(context, 620));
        this.isMenuHierarchyUXOpt$delegate = C221108m2.LIZIZ(AnonymousClass565.LJLIL);
        C58K c58k = new C58K();
        c58k.setInterpolator(new C58T());
        c58k.setDuration(342L);
        this.firstAnim = c58k;
        this.enableTinyScroller = true;
        this.enableEffectTinyScroller = true;
        this.blackSlotHint$delegate = C221108m2.LIZIZ(C58P.LJLIL);
    }

    public static /* synthetic */ void setPlayHeadWidth$default(C58D c58d, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        c58d.setPlayHeadWidth(f, f2);
    }

    public static /* synthetic */ void setSubTrackState$default(C58D c58d, List list, NLETrackSlot nLETrackSlot, int i, Object obj) {
        if ((i & 2) != 0) {
            nLETrackSlot = null;
        }
        c58d.setSubTrackState(list, nLETrackSlot);
    }

    public static /* synthetic */ void updateScale$default(C58D c58d, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c58d.updateScale(f, z);
    }

    public /* synthetic */ C58D(Context context, C29S c29s, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c29s, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    public static /* synthetic */ void updatePlayStateSmoothly$default(C58D c58d, PlayPositionState playPositionState, boolean z, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c58d.updatePlayStateSmoothly(playPositionState, z, interfaceC65784Pro);
    }
}
