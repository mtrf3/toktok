package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15070iV;
import X.C16880lQ;
import X.C169946li;
import X.C170156m3;
import X.C29S;
import X.C39579Fg7;
import X.C3C5;
import X.C60903NvH;
import X.C76800UCe;
import X.C78915Uy7;
import X.C90903hW;
import X.EnumC82528WaC;
import X.SFS;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnTouchListenerC82857WfV;
import Y.ACListenerS30S0101000_13;
import Y.AObserverS58S0101000_2;
import Y.AObserverS60S0101000_5;
import Y.ARunnableS38S0100000_2;
import Y.IDHandlerS15S0100000_2;
import Y.IDLListenerS190S0100000_2;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class Video2GifCutFragment extends Fragment {
    public static final double LJLLL;
    public static final /* synthetic */ int LJLLLL = 0;
    public TextureView LJLIL;
    public ImageView LJLILLLLZI;
    public FrameLayout LJLJI;
    public ViewOnTouchListenerC82857WfV LJLJJI;
    public TextView LJLJJL;
    public boolean LJLJJLL;
    public MediaPlayerModule LJLJL;
    public CutMultiVideoViewModel LJLJLJ;
    public VideoEditViewModel LJLJLLL;
    public VideoShare2GifEditContext LJLL;
    public final AObserverS58S0101000_2 LJLLI = new AObserverS58S0101000_2(1, this, 2);
    public final IDHandlerS15S0100000_2 LJLLILLLL = new IDHandlerS15S0100000_2(this, C16880lQ.LLJJJJ(), 0);
    public final ARunnableS38S0100000_2 LJLLJ = new ARunnableS38S0100000_2(this, 44);

    public final void wl() {
        String str;
        C15070iV<Long, Long> singleVideoPlayBoundary;
        Long l;
        if (this.LJLJJI != null) {
            str = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.LJLJJI.getSelectedTime())});
        } else {
            str = "";
        }
        this.LJLJJL.setText(getString(R.string.ia4, str));
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJJI;
        if (viewOnTouchListenerC82857WfV != null && (singleVideoPlayBoundary = viewOnTouchListenerC82857WfV.getSingleVideoPlayBoundary()) != null && (l = singleVideoPlayBoundary.LIZ) != null && singleVideoPlayBoundary.LIZIZ != null) {
            this.LJLL.inPoint = l.longValue();
            this.LJLL.outPoint = singleVideoPlayBoundary.LIZIZ.longValue();
        }
    }

    static {
        C60903NvH.LJIIJJI().LJIJ();
        LJLLL = EnumC82528WaC.FAST.value();
    }

    public final void vl() {
        if (mo49getActivity() != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.jt1);
            C78915Uy7.LJJIJIIJI(this, 1016, creativeToastBuilder);
            mo49getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo49getActivity() == null) {
            vl();
            return;
        }
        this.LJLJLJ = (CutMultiVideoViewModel) ViewModelProviders.of(mo49getActivity()).get(CutMultiVideoViewModel.class);
        this.LJLJLLL = (VideoEditViewModel) ViewModelProviders.of(mo49getActivity()).get(VideoEditViewModel.class);
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getArguments().getParcelable("extra_edit_context");
        this.LJLL = videoShare2GifEditContext;
        if (videoShare2GifEditContext != null) {
            return;
        }
        vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LJLIL = (TextureView) view.findViewById(R.id.l60);
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.hrq);
        this.LJLJI = (FrameLayout) view.findViewById(R.id.dhu);
        this.LJLJJI = (ViewOnTouchListenerC82857WfV) view.findViewById(R.id.n5k);
        this.LJLJJL = (TextView) view.findViewById(R.id.mnh);
        this.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0101000_13(4, this, 3)));
        this.LJLIL.setClipToOutline(true);
        TextureView textureView = this.LJLIL;
        final int LJI = SFS.LJI(8.0d);
        textureView.setOutlineProvider(new ViewOutlineProvider(LJI) { // from class: X.7ft
            public final int LIZ;

            {
                this.LIZ = LJI;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), this.LIZ);
            }
        });
        FrameLayout frameLayout = this.LJLJI;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 4));
        }
        this.LJLJJI.setMinVideoLength(2000L);
        this.LJLJJI.setMaxVideoLength(LivePlayEnforceIntervalSetting.DEFAULT);
        if (!this.LJLJJI.LJFF(mo49getActivity(), ViewModelProviders.of(mo49getActivity()), this.LJLJLJ, this.LJLL.videoPath) && mo49getActivity() != null) {
            mo49getActivity().finish();
            return;
        }
        VideoEditViewModel videoEditViewModel = this.LJLJLLL;
        if (videoEditViewModel != null) {
            videoEditViewModel.LJLILLLLZI.observe(this, new AObserverS58S0101000_2(2, this, 3));
            this.LJLJLLL.LJLJJI.observe(this, new AObserverS58S0101000_2(2, this, 4));
            this.LJLJLLL.LJLJI.observe(this, new AObserverS58S0101000_2(4, this, 5));
            this.LJLJLLL.LJLJJL.observe(this, new AObserverS58S0101000_2(3, this, 16));
            this.LJLJLLL.LJLJJLL.observe(this, new AObserverS58S0101000_2(3, this, 6));
            this.LJLJLLL.LJLLI.observe(this, new AObserverS60S0101000_5(7, this, 0));
        }
        try {
            String LJIIZILJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIIZILJ();
            C39579Fg7.LJIJJLI(LJIIZILJ);
            C169946li c169946li = new C169946li(LJIIZILJ, this.LJLIL);
            C170156m3 c170156m3 = new C170156m3();
            c170156m3.LIZJ = true;
            c170156m3.LIZ = (float) LJLLL;
            c170156m3.LIZIZ = 0.0f;
            c170156m3.LIZLLL = this.LJLJJI.getMaxCutDuration();
            MediaPlayerModule mediaPlayerModule = new MediaPlayerModule(c169946li, c170156m3);
            this.LJLJL = mediaPlayerModule;
            mediaPlayerModule.LJLIL = this.LJLL.videoPath;
            mediaPlayerModule.LJLJLJ.observe(this, this.LJLLI);
            MediaPlayerModule mediaPlayerModule2 = this.LJLJL;
            TextureView textureView2 = this.LJLIL;
            mediaPlayerModule2.getClass();
            mediaPlayerModule2.LJLJL = textureView2.getSurfaceTextureListener();
            textureView2.setSurfaceTextureListener(mediaPlayerModule2);
            getLifecycle().addObserver(this.LJLJL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            vl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axk, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
