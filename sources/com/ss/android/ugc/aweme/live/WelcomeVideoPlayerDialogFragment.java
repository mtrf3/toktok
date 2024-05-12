package com.ss.android.ugc.aweme.live;

import X.C15380j0;
import X.C16880lQ;
import X.C27606AsU;
import X.C28507BGt;
import X.C46579IPv;
import X.C47261Igj;
import X.C73043Slb;
import X.C73062Slu;
import X.C73063Slv;
import X.C78473Uqz;
import X.CCJ;
import X.InterfaceC27469AqH;
import X.InterfaceC73068Sm0;
import X.JIY;
import X.SK0;
import X.SY4;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.WelcomeVideoLengthSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.WelcomeVideoUrlSetting;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class WelcomeVideoPlayerDialogFragment extends LiveDialogFragment implements InterfaceC27469AqH {
    public C46579IPv LJLJI;
    public C73062Slu LJLJJI;
    public C73063Slv LJLJJL;
    public ConstraintLayout LJLJJLL;
    public int LJLJL;
    public SK0 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final String LJLIL = WelcomeVideoUrlSetting.INSTANCE.getValue();
    public final int LJLILLLLZI = WelcomeVideoLengthSetting.INSTANCE.getValue();
    public final WelcomeVideoPlayerDialogFragment$observer$1 LJLLI = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.WelcomeVideoPlayerDialogFragment$observer$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
                return;
            }
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
            } else if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            C73062Slu c73062Slu = WelcomeVideoPlayerDialogFragment.this.LJLJJI;
            if (c73062Slu != null) {
                c73062Slu.LJFF(true);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            C73062Slu c73062Slu = WelcomeVideoPlayerDialogFragment.this.LJLJJI;
            if (c73062Slu != null) {
                c73062Slu.post(new ARunnableS44S0100000_8(c73062Slu, 24));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            InterfaceC73068Sm0 interfaceC73068Sm0;
            C73062Slu c73062Slu = WelcomeVideoPlayerDialogFragment.this.LJLJJI;
            if (c73062Slu != null && (interfaceC73068Sm0 = c73062Slu.LJLJJLL) != null) {
                interfaceC73068Sm0.stop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            LiveOuterService.LJJJLL().LJJJIL();
            C78473Uqz.LIZIZ(false);
            C73062Slu c73062Slu = WelcomeVideoPlayerDialogFragment.this.LJLJJI;
            if (c73062Slu != null) {
                c73062Slu.LJII();
            }
        }
    };

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LJLJI = null;
        C73062Slu c73062Slu = this.LJLJJI;
        if (c73062Slu != null) {
            c73062Slu.LJFF(true);
        }
        this.LJLJJI = null;
        super.onDestroy();
        getLifecycle().removeObserver(this.LJLLI);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.br6);
        c28507BGt.LIZIZ = 1;
        c28507BGt.LJII = 80;
        c28507BGt.LIZJ = R.style.ab0;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        dismissAllowingStateLoss();
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().addObserver(this.LJLLI);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(super.…InstanceState), activity)");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        C73063Slv c73063Slv;
        ConstraintLayout constraintLayout;
        ImageView imageView;
        SK0 sk0;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = (C73062Slu) view.findViewById(R.id.nil);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        this.LJLJL = arguments.getInt("position");
        Bundle arguments2 = getArguments();
        o.LJI(arguments2);
        this.LJLJLLL = arguments2.getBoolean("isMute");
        Bundle arguments3 = getArguments();
        o.LJI(arguments3);
        this.LJLL = arguments3.getBoolean("isPause");
        C73062Slu welcome_tux_player_view = (C73062Slu) _$_findCachedViewById(R.id.nil);
        o.LJIIIIZZ(welcome_tux_player_view, "welcome_tux_player_view");
        C46579IPv c46579IPv = new C46579IPv(welcome_tux_player_view);
        Video video = new Video();
        video.setVideoLength(this.LJLILLLLZI);
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
        localVideoUrlModel.setSourceId(this.LJLIL);
        localVideoUrlModel.setUrlList(C47261Igj.LJJIJIL(this.LJLIL));
        localVideoUrlModel.setUrlKey(this.LJLIL);
        video.setPlayAddr(localVideoUrlModel);
        c46579IPv.LJFF = video;
        c46579IPv.LJIIZILJ = new JIY(this);
        c46579IPv.LJIILIIL = this.LJLL;
        if (this.LJLJLLL && (sk0 = this.LJLJLJ) != null) {
            sk0.callOnClick();
        }
        c46579IPv.LJIILJJIL = this.LJLJLLL;
        this.LJLJI = c46579IPv;
        int LJIIL = C15380j0.LJIIL();
        int i = (LJIIL * 1080) / 720;
        C73062Slu c73062Slu = this.LJLJJI;
        SK0 sk02 = null;
        if (c73062Slu != null) {
            new C27606AsU();
            C27606AsU c27606AsU = new C27606AsU();
            c27606AsU.LIZ = this.LJLJI;
            c27606AsU.LJ = Integer.valueOf(this.LJLILLLLZI);
            Dialog dialog = getDialog();
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            c27606AsU.LIZJ = window;
            c27606AsU.LIZLLL = new C73043Slb(LJIIL, i);
            c73062Slu.setParams(c27606AsU);
        }
        C73062Slu c73062Slu2 = this.LJLJJI;
        if (c73062Slu2 != null) {
            c73063Slv = (C73063Slv) c73062Slu2.findViewById(R.id.hso);
        } else {
            c73063Slv = null;
        }
        this.LJLJJL = c73063Slv;
        if (c73063Slv != null) {
            constraintLayout = (ConstraintLayout) c73063Slv.findViewById(R.id.nk);
        } else {
            constraintLayout = null;
        }
        this.LJLJJLL = constraintLayout;
        if (constraintLayout != null) {
            sk02 = (SK0) constraintLayout.findViewById(R.id.k4s);
        }
        this.LJLJLJ = sk02;
        ConstraintLayout constraintLayout2 = this.LJLJJLL;
        if (constraintLayout2 != null && (imageView = (ImageView) constraintLayout2.findViewById(R.id.dp9)) != null) {
            imageView.setVisibility(8);
        }
        C73062Slu c73062Slu3 = this.LJLJJI;
        if (c73062Slu3 != null) {
            ((ImageView) c73062Slu3.LJ(R.id.k4s)).setVisibility(0);
        }
        C73063Slv c73063Slv2 = this.LJLJJL;
        if (c73063Slv2 != null) {
            c73063Slv2.findViewById(R.id.l7z);
        }
        float f = ((this.LJLJL * 1.0f) / this.LJLILLLLZI) * 100 * 1000;
        C73062Slu c73062Slu4 = this.LJLJJI;
        if (c73062Slu4 != null) {
            c73062Slu4.LJIILIIL(f);
        }
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.k2h).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        SK0 sk03 = this.LJLJLJ;
        o.LJI(sk03);
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(16, 0, 16, sk03.getLayoutParams().height);
        ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.dxb).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = 59;
        marginLayoutParams.leftMargin = 21;
        if (CCJ.LIZ(getContext())) {
            ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById(R.id.k2h).getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 8388691;
            ViewGroup.LayoutParams layoutParams4 = _$_findCachedViewById(R.id.dxb).getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 8388661;
            marginLayoutParams.rightMargin = 21;
        }
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.dxb), new ACListenerS28S0100000_8(this, 16));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.k2h), new ACListenerS28S0100000_8(this, 17));
    }
}
