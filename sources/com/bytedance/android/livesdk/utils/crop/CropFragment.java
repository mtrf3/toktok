package com.bytedance.android.livesdk.utils.crop;

import X.ActivityC45651qj;
import X.B9K;
import X.C0K2;
import X.C10A;
import X.C16880lQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C47121t6;
import X.C51029K0z;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.UGT;
import X.UGV;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDCListenerS259S0100000_13;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.SwitchCameraChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CropFragment extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLLL = 0;
    public Uri LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJJLL;
    public InterfaceC65784Pro<C76800UCe> LJLJL;
    public UGT LJLJLJ;
    public LiveIconView LJLJLLL;
    public C47121t6 LJLL;
    public LiveIconView LJLLI;
    public C47121t6 LJLLILLLL;
    public C47121t6 LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public float LJLJJI = 1.0f;
    public long LJLJJL = Long.MIN_VALUE;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d3n);
        c28507BGt.LIZJ = R.style.aca;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 3;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        ActivityC45651qj mo49getActivity;
        if (this.LJLJI && (mo49getActivity = mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLJJL == Long.MIN_VALUE) {
            return;
        }
        C0K2.LJIIIZ(0, SystemClock.elapsedRealtime() - this.LJLJJL, "ttlive_crop_fragment_all");
        this.LJLJJL = Long.MIN_VALUE;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        super.onStart();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window2 = mo49getActivity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            decorView2.setBackgroundResource(0);
        }
        if (LiveCoverCameraSetting.INSTANCE.enable() && C29306Beo.LIZIZ(getContext()) != null) {
            C61713OJx LIZ = C61712OJw.LIZ(this);
            LIZ.LIZIZ(false, false);
            LIZ.LIZIZ.LJIIL();
            LIZ.LJFF(-16777216);
            LIZ.LIZIZ.LJII(false);
            LIZ.LIZJ();
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(SwitchCameraChannel.class, Boolean.FALSE);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = (Uri) arguments.getParcelable("arg_origin_uri");
            this.LJLILLLLZI = arguments.getString("arg_origin_path");
            float f = arguments.getFloat("arg_width_to_height_ratio", this.LJLJJI);
            this.LJLJJI = f;
            if (f <= 0.0f) {
                this.LJLJJI = 1.0f;
            }
            this.LJLJI = arguments.getBoolean("arg_is_for_live_cover");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(SwitchCameraChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJLJ = (UGT) view.findViewById(R.id.bzy);
        this.LJLJLLL = (LiveIconView) view.findViewById(R.id.m1c);
        this.LJLL = (C47121t6) view.findViewById(R.id.m1f);
        this.LJLLI = (LiveIconView) view.findViewById(R.id.m2u);
        this.LJLLILLLL = (C47121t6) view.findViewById(R.id.m3t);
        this.LJLLJ = (C47121t6) view.findViewById(R.id.mij);
        UGT ugt = this.LJLJLJ;
        if (ugt != null) {
            float f = this.LJLJJI;
            UGV ugv = ugt.LJLJI;
            if (ugv != null) {
                boolean z = false;
                ugv.LJLJJL = 0;
                if (f == 0.0f) {
                    z = true;
                }
                float f2 = 1.0f;
                if (!z) {
                    f2 = 1.0f / f;
                }
                ugv.LJLJJLL = f2;
                ugv.LJLJJI = (int) B9K.LIZ(ugv.getContext(), UGT.LJLJJLL);
                ugv.addOnLayoutChangeListener(new IDCListenerS259S0100000_13(ugt, 4));
                ugv.postDelayed(new ARunnableS49S0100000_13(ugt, 151), 1000L);
                String str = this.LJLILLLLZI;
                if (str != null) {
                    ugt.setOriginPath(str);
                } else {
                    ugt.setOriginUri(this.LJLIL);
                }
            } else {
                o.LJIJI("mCoverWindow");
                throw null;
            }
        }
        if (LiveCoverCameraSetting.INSTANCE.enable()) {
            C29306Beo.LJJLJLI(this.LJLLILLLL);
            C29306Beo.LJJLJLI(this.LJLL);
            C29306Beo.LJJLJLI(this.LJLLJ);
            C29306Beo.LJI(this.LJLJLLL);
            C29306Beo.LJI(this.LJLLI);
            if (this.LJLJI) {
                C47121t6 c47121t6 = this.LJLL;
                if (c47121t6 != null) {
                    c47121t6.setText(getString(R.string.kg3));
                }
                C47121t6 c47121t62 = this.LJLL;
                if (c47121t62 != null) {
                    C16880lQ.LJJIIZ(c47121t62, new ACListenerS33S0100000_13(this, 93));
                }
                C47121t6 c47121t63 = this.LJLLJ;
                if (c47121t63 != null) {
                    C16880lQ.LJJIIZ(c47121t63, new ACListenerS33S0100000_13(this, 94));
                    return;
                }
                return;
            }
            C47121t6 c47121t64 = this.LJLL;
            if (c47121t64 != null) {
                c47121t64.setText(getString(R.string.kfz));
            }
            C47121t6 c47121t65 = this.LJLL;
            if (c47121t65 != null) {
                C16880lQ.LJJIIZ(c47121t65, new ACListenerS33S0100000_13(this, 95));
            }
            C47121t6 c47121t66 = this.LJLLJ;
            if (c47121t66 == null) {
                return;
            }
            C16880lQ.LJJIIZ(c47121t66, new ACListenerS33S0100000_13(this, 96));
            return;
        }
        C29306Beo.LJI(this.LJLLILLLL);
        C29306Beo.LJI(this.LJLL);
        C29306Beo.LJI(this.LJLLJ);
        C29306Beo.LJJLJLI(this.LJLJLLL);
        C29306Beo.LJJLJLI(this.LJLLI);
        LiveIconView liveIconView = this.LJLJLLL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 97));
        }
        LiveIconView liveIconView2 = this.LJLLI;
        if (liveIconView2 == null) {
            return;
        }
        C16880lQ.LJJII(liveIconView2, new ACListenerS33S0100000_13(this, 98));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        this.LJLJJL = SystemClock.elapsedRealtime();
        super.show(manager, str);
    }
}
