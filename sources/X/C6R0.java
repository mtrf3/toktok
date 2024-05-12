package X;

import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Locale;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6R0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6R0 extends FrameLayout {
    public C1NS<C6R1> LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public InterfaceC159886Pg LJLJI;
    public C6RA LJLJJI;
    public TuxTextView LJLJJL;
    public ViewOnTouchListenerC82857WfV LJLJJLL;
    public TuxIconView LJLJL;
    public ImageView LJLJLJ;
    public ImageView LJLJLLL;
    public CutMultiVideoViewModel LJLL;
    public WFB LJLLI;

    public final void LIZ() {
        C1NS<C6R1> c1ns = this.LJLIL;
        if (c1ns != null) {
            LiveState<V> LIZ = c1ns.LIZ(new TBT() { // from class: X.6RB
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C6R1) obj).LIZJ);
                }
            });
            LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
            if (lifecycleOwner == null) {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
            LIZ.LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 664));
            C1NS<C6R1> c1ns2 = this.LJLIL;
            if (c1ns2 != null) {
                LiveState<V> LIZ2 = c1ns2.LIZ(new TBT() { // from class: X.6R5
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Float.valueOf(((C6R1) obj).LJ);
                    }
                });
                C1NS<C6R1> c1ns3 = this.LJLIL;
                if (c1ns3 != null) {
                    C08590Vj c08590Vj = new C08590Vj(LIZ2, c1ns3.LIZ(new TBT() { // from class: X.6R6
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Float.valueOf(((C6R1) obj).LJFF);
                        }
                    }));
                    LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
                    if (lifecycleOwner2 != null) {
                        C08590Vj.LIZ(c08590Vj, lifecycleOwner2, new AqS184S0100000_2(this, 97));
                        C1NS<C6R1> c1ns4 = this.LJLIL;
                        if (c1ns4 != null) {
                            LiveState<V> LIZ3 = c1ns4.LIZ(new TBT() { // from class: X.6RJ
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C6R1) obj).LIZLLL;
                                }
                            });
                            LifecycleOwner lifecycleOwner3 = this.LJLILLLLZI;
                            if (lifecycleOwner3 == null) {
                                o.LJIJI("lifecycleOwner");
                                throw null;
                            }
                            LIZ3.LJIIIIZZ(lifecycleOwner3, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 665));
                            C1NS<C6R1> c1ns5 = this.LJLIL;
                            if (c1ns5 != null) {
                                LiveState<V> LIZ4 = c1ns5.LIZ(new TBT() { // from class: X.6R8
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return Boolean.valueOf(((C6R1) obj).LIZIZ);
                                    }
                                });
                                LifecycleOwner lifecycleOwner4 = this.LJLILLLLZI;
                                if (lifecycleOwner4 == null) {
                                    o.LJIJI("lifecycleOwner");
                                    throw null;
                                }
                                LIZ4.LJIIIIZZ(lifecycleOwner4, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 666));
                                C1NS<C6R1> c1ns6 = this.LJLIL;
                                if (c1ns6 != null) {
                                    LiveState<V> LIZ5 = c1ns6.LIZ(new TBT() { // from class: X.6RD
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return Boolean.valueOf(((C6R1) obj).LJI);
                                        }
                                    });
                                    LifecycleOwner lifecycleOwner5 = this.LJLILLLLZI;
                                    if (lifecycleOwner5 == null) {
                                        o.LJIJI("lifecycleOwner");
                                        throw null;
                                    }
                                    LIZ5.LJIIIIZZ(lifecycleOwner5, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 662));
                                    C1NS<C6R1> c1ns7 = this.LJLIL;
                                    if (c1ns7 != null) {
                                        LiveState<V> LIZ6 = c1ns7.LIZ(new TBT() { // from class: X.6RE
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Integer.valueOf(((C6R1) obj).LJII);
                                            }
                                        });
                                        LifecycleOwner lifecycleOwner6 = this.LJLILLLLZI;
                                        if (lifecycleOwner6 == null) {
                                            o.LJIJI("lifecycleOwner");
                                            throw null;
                                        }
                                        LIZ6.LJIIIIZZ(lifecycleOwner6, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 663));
                                        VideoEditViewModel videoEditViewModel = getVideoEditView().getVideoEditViewModel();
                                        MutableLiveData<Void> mutableLiveData = videoEditViewModel.LJLJJLL;
                                        LifecycleOwner lifecycleOwner7 = this.LJLILLLLZI;
                                        if (lifecycleOwner7 != null) {
                                            mutableLiveData.observe(lifecycleOwner7, new AObserverS70S0100000_2(this, 334));
                                            MutableLiveData<Void> mutableLiveData2 = videoEditViewModel.LJLJLJ;
                                            LifecycleOwner lifecycleOwner8 = this.LJLILLLLZI;
                                            if (lifecycleOwner8 != null) {
                                                mutableLiveData2.observe(lifecycleOwner8, new AObserverS70S0100000_2(this, 335));
                                                MutableLiveData<Void> mutableLiveData3 = videoEditViewModel.LJLJJL;
                                                LifecycleOwner lifecycleOwner9 = this.LJLILLLLZI;
                                                if (lifecycleOwner9 != null) {
                                                    mutableLiveData3.observe(lifecycleOwner9, new AObserverS70S0100000_2(this, 336));
                                                    MutableLiveData<Void> mutableLiveData4 = videoEditViewModel.LJLJL;
                                                    LifecycleOwner lifecycleOwner10 = this.LJLILLLLZI;
                                                    if (lifecycleOwner10 != null) {
                                                        mutableLiveData4.observe(lifecycleOwner10, new AObserverS70S0100000_2(this, 337));
                                                        MutableLiveData<Void> mutableLiveData5 = videoEditViewModel.LJLJLLL;
                                                        LifecycleOwner lifecycleOwner11 = this.LJLILLLLZI;
                                                        if (lifecycleOwner11 != null) {
                                                            mutableLiveData5.observe(lifecycleOwner11, new AObserverS70S0100000_2(this, 338));
                                                            MutableLiveData<Void> mutableLiveData6 = videoEditViewModel.LJLL;
                                                            LifecycleOwner lifecycleOwner12 = this.LJLILLLLZI;
                                                            if (lifecycleOwner12 != null) {
                                                                mutableLiveData6.observe(lifecycleOwner12, new AObserverS70S0100000_2(this, 339));
                                                                MutableLiveData<Long> mutableLiveData7 = videoEditViewModel.LJLJJI;
                                                                LifecycleOwner lifecycleOwner13 = this.LJLILLLLZI;
                                                                if (lifecycleOwner13 != null) {
                                                                    mutableLiveData7.observe(lifecycleOwner13, new AObserverS70S0100000_2(this, 340));
                                                                    MutableLiveData<Boolean> mutableLiveData8 = videoEditViewModel.LJLILLLLZI;
                                                                    LifecycleOwner lifecycleOwner14 = this.LJLILLLLZI;
                                                                    if (lifecycleOwner14 != null) {
                                                                        mutableLiveData8.observe(lifecycleOwner14, new AObserverS70S0100000_2(this, 341));
                                                                        return;
                                                                    } else {
                                                                        o.LJIJI("lifecycleOwner");
                                                                        throw null;
                                                                    }
                                                                }
                                                                o.LJIJI("lifecycleOwner");
                                                                throw null;
                                                            }
                                                            o.LJIJI("lifecycleOwner");
                                                            throw null;
                                                        }
                                                        o.LJIJI("lifecycleOwner");
                                                        throw null;
                                                    }
                                                    o.LJIJI("lifecycleOwner");
                                                    throw null;
                                                }
                                                o.LJIJI("lifecycleOwner");
                                                throw null;
                                            }
                                            o.LJIJI("lifecycleOwner");
                                            throw null;
                                        }
                                        o.LJIJI("lifecycleOwner");
                                        throw null;
                                    }
                                    o.LJIJI("stateContainer");
                                    throw null;
                                }
                                o.LJIJI("stateContainer");
                                throw null;
                            }
                            o.LJIJI("stateContainer");
                            throw null;
                        }
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                o.LJIJI("stateContainer");
                throw null;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        boolean z;
        String string;
        C1NS<C6R1> c1ns = this.LJLIL;
        if (c1ns != null) {
            C6R1 c6r1 = c1ns.LJ;
            float f = c6r1.LJ;
            float f2 = c6r1.LJFF;
            if (o.LJ(c6r1.LIZLLL, Boolean.TRUE)) {
                string = getContext().getResources().getString(R.string.s3l);
                o.LJIIIIZZ(string, "context.resources.getStr…icker_to_set_it_duration)");
            } else {
                float f3 = (f2 - f) / 1000;
                int i = 0;
                if (0.99f * f3 < 0.1d) {
                    z = true;
                } else {
                    z = false;
                }
                String LIZIZ = C63144OqK.LIZIZ(new Object[]{Float.valueOf(f3)}, 1, Locale.getDefault(), "%.1f", "format(locale, format, *args)");
                string = getContext().getResources().getString(R.string.hhg, LIZIZ);
                o.LJIIIIZZ(string, "context.resources.getStr…ith_seconds, boxDuration)");
                if (z) {
                    SpannableString spannableString = new SpannableString(string);
                    int LJJLIIIJL = s.LJJLIIIJL(string, LIZIZ, 0, false, 6);
                    int length = LIZIZ.length() + s.LJJLIIIJL(string, LIZIZ, 0, false, 6);
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
                    if (LJJLIIIJL > 0) {
                        i = LJJLIIIJL;
                    }
                    if (!TextUtils.isEmpty(spannableString) && i <= length && i < spannableString.length() && length <= spannableString.length()) {
                        spannableString.setSpan(new ForegroundColorSpan(LJIIIIZZ), i, length, 17);
                    }
                    string = spannableString;
                }
            }
            TuxTextView tuxTextView = this.LJLJJL;
            if (tuxTextView != null) {
                tuxTextView.setText(string);
                return;
            } else {
                o.LJIJI("selectedTextView");
                throw null;
            }
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public final ImageView getCancelButton() {
        ImageView imageView = this.LJLJLLL;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("cancelButton");
        throw null;
    }

    public final CutMultiVideoViewModel getMultiVideoVideoModel() {
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLL;
        if (cutMultiVideoViewModel != null) {
            return cutMultiVideoViewModel;
        }
        o.LJIJI("multiVideoVideoModel");
        throw null;
    }

    public final TuxIconView getPlayButton() {
        TuxIconView tuxIconView = this.LJLJL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("playButton");
        throw null;
    }

    public final ImageView getSaveButton() {
        ImageView imageView = this.LJLJLJ;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("saveButton");
        throw null;
    }

    public final ViewOnTouchListenerC82857WfV getVideoEditView() {
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJJLL;
        if (viewOnTouchListenerC82857WfV != null) {
            return viewOnTouchListenerC82857WfV;
        }
        o.LJIJI("videoEditView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6R0(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
    }

    public final void LIZIZ(int i) {
        InterfaceC159886Pg interfaceC159886Pg = this.LJLJI;
        if (interfaceC159886Pg != null) {
            interfaceC159886Pg.LIZIZ().LLJJJIL(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
        } else {
            o.LJIJI("editService");
            throw null;
        }
    }

    public final void setCancelButton(ImageView imageView) {
        o.LJIIIZ(imageView, "<set-?>");
        this.LJLJLLL = imageView;
    }

    public final void setMultiVideoVideoModel(CutMultiVideoViewModel cutMultiVideoViewModel) {
        o.LJIIIZ(cutMultiVideoViewModel, "<set-?>");
        this.LJLL = cutMultiVideoViewModel;
    }

    public final void setPlayButton(TuxIconView tuxIconView) {
        o.LJIIIZ(tuxIconView, "<set-?>");
        this.LJLJL = tuxIconView;
    }

    public final void setSaveButton(ImageView imageView) {
        o.LJIIIZ(imageView, "<set-?>");
        this.LJLJLJ = imageView;
    }

    public final void setVideoEditView(ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV) {
        o.LJIIIZ(viewOnTouchListenerC82857WfV, "<set-?>");
        this.LJLJJLL = viewOnTouchListenerC82857WfV;
    }
}
