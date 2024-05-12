package com.ss.android.ugc.aweme.live.livehostimpl;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C27606AsU;
import X.C29S;
import X.C3C5;
import X.C46579IPv;
import X.C72818Shy;
import X.C73062Slu;
import X.C73063Slv;
import X.C76052yf;
import X.C76800UCe;
import X.C78473Uqz;
import X.C78528Urs;
import X.C90903hW;
import X.CCJ;
import X.IPX;
import X.IPZ;
import X.IWF;
import X.InterfaceC73068Sm0;
import X.JIS;
import X.JIT;
import X.JIU;
import X.SK0;
import X.SY4;
import X.X1D;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EducationVideoPlayerDialogFragment extends DialogFragment {
    public C46579IPv LJLIL;
    public C73062Slu LJLILLLLZI;
    public C73063Slv LJLJI;
    public ConstraintLayout LJLJJI;
    public SK0 LJLJJL;
    public int LJLJL;
    public int LJLJLJ;
    public SK0 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public Video LJLLILLLL;
    public JIT LJLLJ;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public String LJLJJLL = "";
    public final EducationVideoPlayerDialogFragment$observer$1 LJLLL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.livehostimpl.EducationVideoPlayerDialogFragment$observer$1
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
            C73062Slu c73062Slu = EducationVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73062Slu != null) {
                c73062Slu.LJFF(true);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            C73062Slu c73062Slu = EducationVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73062Slu != null) {
                c73062Slu.post(new ARunnableS44S0100000_8(c73062Slu, 25));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            InterfaceC73068Sm0 interfaceC73068Sm0;
            C73062Slu c73062Slu = EducationVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73062Slu != null && (interfaceC73068Sm0 = c73062Slu.LJLJJLL) != null) {
                interfaceC73068Sm0.stop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            LiveOuterService.LJJJLL().LJJJIL();
            C78473Uqz.LIZIZ(false);
            C73062Slu c73062Slu = EducationVideoPlayerDialogFragment.this.LJLILLLLZI;
            if (c73062Slu != null) {
                c73062Slu.LJII();
            }
        }
    };

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LJLIL = null;
        C73062Slu c73062Slu = this.LJLILLLLZI;
        if (c73062Slu != null) {
            c73062Slu.LJFF(true);
        }
        this.LJLILLLLZI = null;
        super.onDestroy();
        getLifecycle().removeObserver(this.LJLLL);
    }

    public final void vl() {
        Boolean bool;
        boolean z;
        long j;
        long j2;
        JSONObject jSONObject = new JSONObject();
        C46579IPv c46579IPv = this.LJLIL;
        Long l = null;
        if (c46579IPv != null) {
            bool = Boolean.valueOf(c46579IPv.LJIJI);
        } else {
            bool = null;
        }
        if (IPZ.LIZ == IPX.PLAYER_PAUSE) {
            z = true;
        } else {
            z = false;
        }
        C46579IPv c46579IPv2 = this.LJLIL;
        long j3 = 0;
        if (c46579IPv2 != null) {
            IWF iwf = c46579IPv2.LJII;
            if (iwf != null) {
                j2 = iwf.getCurrentPosition();
            } else {
                j2 = 0;
            }
            l = Long.valueOf(j2);
        }
        jSONObject.put("is_mute", bool);
        jSONObject.put("is_pause", z);
        if (l != null) {
            j = l.longValue() / 1000;
        } else {
            j = 0;
        }
        jSONObject.put("position", j);
        if (l != null) {
            j3 = l.longValue() / 1000;
        }
        jSONObject.put("current_position", j3);
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), "video_full_screen_close"));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Boolean bool;
        boolean z;
        Object obj;
        long j;
        super.dismiss();
        JSONObject jSONObject = new JSONObject();
        C46579IPv c46579IPv = this.LJLIL;
        Long l = null;
        if (c46579IPv != null) {
            bool = Boolean.valueOf(c46579IPv.LJIJI);
        } else {
            bool = null;
        }
        if (IPZ.LIZ == IPX.PLAYER_PAUSE) {
            z = true;
        } else {
            z = false;
        }
        C46579IPv c46579IPv2 = this.LJLIL;
        long j2 = 0;
        if (c46579IPv2 != null) {
            IWF iwf = c46579IPv2.LJII;
            if (iwf != null) {
                j = iwf.getCurrentPosition();
            } else {
                j = 0;
            }
            l = Long.valueOf(j);
        }
        jSONObject.put("is_mute", bool);
        jSONObject.put("is_pause", z);
        Video video = this.LJLLILLLL;
        if (video != null) {
            obj = Integer.valueOf(video.getVideoLength());
        } else if (l != null) {
            obj = Long.valueOf(l.longValue() / 1000);
        } else {
            obj = 0;
        }
        jSONObject.put("position", obj);
        if (l != null) {
            j2 = l.longValue() / 1000;
        }
        jSONObject.put("current_position", j2);
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), "anchor_subscribe_play_intro_video_change"));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.Holo.Light);
        getLifecycle().addObserver(this.LJLLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Window window;
        C73063Slv c73063Slv;
        ConstraintLayout constraintLayout;
        SK0 sk0;
        ImageView imageView;
        SK0 sk02;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = (C73062Slu) view.findViewById(com.zhiliaoapp.musically.R.id.cr8);
        if (getArguments() == null) {
            dismiss();
        } else {
            C73062Slu c73062Slu = this.LJLILLLLZI;
            if (c73062Slu != null) {
                this.LJLIL = new C46579IPv(c73062Slu);
            }
            Video video = new Video();
            Bundle arguments = getArguments();
            o.LJI(arguments);
            this.LJLJL = arguments.getInt("videoLength");
            Bundle arguments2 = getArguments();
            SK0 sk03 = null;
            if (arguments2 == null || (str = arguments2.getString("videoUrl")) == null) {
                str = "";
            }
            this.LJLJJLL = str;
            if (this.LJLJL == 0 || ujb.o.LJJJJJL(str)) {
                dismiss();
            } else {
                LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("subscription_education_video_");
                LIZ.append(this.LJLJJLL);
                localVideoUrlModel.setSourceId(X1D.LIZIZ(LIZ));
                localVideoUrlModel.setUrlList(new ArrayList());
                localVideoUrlModel.getUrlList().add(this.LJLJJLL);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("subscription_education_video_");
                LIZ2.append(this.LJLJJLL);
                localVideoUrlModel.setUrlKey(X1D.LIZIZ(LIZ2));
                video.setPlayAddr(localVideoUrlModel);
                Bundle arguments3 = getArguments();
                o.LJI(arguments3);
                this.LJLJLJ = arguments3.getInt("position");
                Bundle arguments4 = getArguments();
                o.LJI(arguments4);
                this.LJLL = arguments4.getBoolean("isMute");
                Bundle arguments5 = getArguments();
                o.LJI(arguments5);
                this.LJLLI = arguments5.getBoolean("isPause");
                Bundle arguments6 = getArguments();
                o.LJI(arguments6);
                arguments6.getBoolean("isAutoPlay");
                video.setVideoLength(this.LJLJL);
                video.setPlayAddrBytevc1(video.getPlayAddr());
                C46579IPv c46579IPv = this.LJLIL;
                if (c46579IPv != null) {
                    c46579IPv.LJFF = video;
                }
                new C27606AsU();
                C27606AsU c27606AsU = new C27606AsU();
                c27606AsU.LIZ = this.LJLIL;
                ActivityC45651qj mo49getActivity = mo49getActivity();
                o.LJI(mo49getActivity);
                c27606AsU.LIZJ = mo49getActivity.getWindow();
                c27606AsU.LJ = Integer.valueOf(this.LJLJL);
                Dialog dialog = getDialog();
                if (dialog != null) {
                    window = dialog.getWindow();
                } else {
                    window = null;
                }
                c27606AsU.LIZJ = window;
                C73062Slu c73062Slu2 = this.LJLILLLLZI;
                if (c73062Slu2 != null) {
                    c73062Slu2.setParams(c27606AsU);
                }
                C73062Slu c73062Slu3 = this.LJLILLLLZI;
                if (c73062Slu3 != null) {
                    c73063Slv = (C73063Slv) c73062Slu3.findViewById(com.zhiliaoapp.musically.R.id.hso);
                } else {
                    c73063Slv = null;
                }
                this.LJLJI = c73063Slv;
                if (c73063Slv != null) {
                    constraintLayout = (ConstraintLayout) c73063Slv.findViewById(com.zhiliaoapp.musically.R.id.nk);
                } else {
                    constraintLayout = null;
                }
                this.LJLJJI = constraintLayout;
                if (constraintLayout != null) {
                    sk0 = (SK0) constraintLayout.findViewById(com.zhiliaoapp.musically.R.id.k4s);
                } else {
                    sk0 = null;
                }
                this.LJLJLLL = sk0;
                ConstraintLayout constraintLayout2 = this.LJLJJI;
                if (constraintLayout2 != null) {
                    imageView = (ImageView) constraintLayout2.findViewById(com.zhiliaoapp.musically.R.id.dp9);
                } else {
                    imageView = null;
                }
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                C73062Slu c73062Slu4 = this.LJLILLLLZI;
                if (c73062Slu4 != null) {
                    ((ImageView) c73062Slu4.LJ(com.zhiliaoapp.musically.R.id.k4s)).setVisibility(0);
                }
                C73063Slv c73063Slv2 = this.LJLJI;
                if (c73063Slv2 != null) {
                    c73063Slv2.findViewById(com.zhiliaoapp.musically.R.id.l7z);
                }
                C73063Slv c73063Slv3 = this.LJLJI;
                if (c73063Slv3 != null) {
                    sk03 = (SK0) c73063Slv3.findViewById(com.zhiliaoapp.musically.R.id.hro);
                }
                this.LJLJJL = sk03;
                C46579IPv c46579IPv2 = this.LJLIL;
                if (c46579IPv2 != null) {
                    c46579IPv2.LJIIZILJ = new JIS(this, video);
                    c46579IPv2.LJIILIIL = this.LJLLI;
                }
                if (this.LJLL && (sk02 = this.LJLJLLL) != null) {
                    sk02.callOnClick();
                }
                C46579IPv c46579IPv3 = this.LJLIL;
                if (c46579IPv3 != null) {
                    c46579IPv3.LJIILJJIL = this.LJLL;
                }
                float f = ((this.LJLJLJ * 1.0f) / this.LJLJL) * 1000;
                C73062Slu c73062Slu5 = this.LJLILLLLZI;
                if (c73062Slu5 != null) {
                    c73062Slu5.LJIILIIL(f);
                }
                SK0 sk04 = this.LJLJJL;
                if (sk04 != null) {
                    sk04.setVisibility(0);
                }
                C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.dxb), new ACListenerS28S0100000_8(this, 1));
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.k2h).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                SK0 sk05 = this.LJLJLLL;
                o.LJI(sk05);
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(16, 0, 16, sk05.getLayoutParams().height);
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.dxb).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = 59;
                marginLayoutParams.leftMargin = 21;
                if (CCJ.LIZ(getContext())) {
                    ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.k2h).getLayoutParams();
                    o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams3).gravity = 83;
                    ViewGroup.LayoutParams layoutParams4 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.dxb).getLayoutParams();
                    o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams4).gravity = 53;
                    marginLayoutParams.rightMargin = 21;
                }
                ((TextView) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.k2h)).setText(C15380j0.LJIILJJIL(com.zhiliaoapp.musically.R.string.mmg));
                _$_findCachedViewById(com.zhiliaoapp.musically.R.id.k2h).setVisibility(8);
                C16880lQ.LJJIZ((SY4) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.k2h), new ACListenerS28S0100000_8(this, 2));
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new JIU(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        View LLLLIILL = C16880lQ.LLLLIILL(mo49getActivity.getLayoutInflater(), com.zhiliaoapp.musically.R.layout.br4, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "activity!!.layoutInflate…          false\n        )");
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
