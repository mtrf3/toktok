package com.bytedance.android.live.effect.karaoke.view;

import X.AnonymousClass064;
import X.BZI;
import X.C03510Bv;
import X.C04590Fz;
import X.C10A;
import X.C15380j0;
import X.C15G;
import X.C15I;
import X.C15J;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C21210sP;
import X.C221108m2;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C47191tD;
import X.C47201tE;
import X.C47211tF;
import X.C47221tG;
import X.C538329j;
import X.C538429k;
import X.C62822Ol8;
import X.C78983UzD;
import X.EnumC07540Ri;
import X.XKX;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.karaoke.view.KaraokeContainerDialog;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokeContainerDialog extends LiveDialogFragment implements C15G {
    public static final /* synthetic */ int LJLLI = 0;
    public KaraokeViewModel LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ConstraintLayout LJLJL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C47211tF.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C47221tG.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C47191tD.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C47201tE.LJLIL);
    public final long LJLJLLL = System.currentTimeMillis();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d9x);
        C78983UzD.LJIILIIL(c28507BGt);
        c28507BGt.LJ = false;
        return c28507BGt;
    }

    public final KaraokeLibraryFragment vl() {
        return (KaraokeLibraryFragment) this.LJLJI.getValue();
    }

    public final AnonymousClass064 wl() {
        return (AnonymousClass064) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        DataChannel dataChannel = this.dataChannel;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJLLL;
        if (C29306Beo.LJIIJ(dataChannel)) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_karaoke_panel_use_time");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIJJ(Long.valueOf(currentTimeMillis / 1000), "use_time");
            LIZ.LJJIIJZLJL();
        }
    }

    public final void xl(long j) {
        int i;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIJ(vl(), null, R.id.fdi);
        LIZ.LJIIIZ(vl());
        KaraokePlayListFragment karaokePlayListFragment = (KaraokePlayListFragment) this.LJLIL.getValue();
        karaokePlayListFragment.getClass();
        if (j == -999) {
            i = 0;
        } else {
            i = 1;
        }
        karaokePlayListFragment.LJLJJL = i;
        LIZ.LJIIIIZZ(R.id.fdi, 1, karaokePlayListFragment, "KaraokePlayListFragment");
        LIZ.LJIIIZ(vl());
        LIZ.LJFF = 4097;
        LIZ.LJI();
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        int i2 = i;
        if (z) {
            int LJIIJJI = C15380j0.LJIIJJI();
            View view = this.LJLJJLL;
            if (view != null) {
                int height = view.getHeight();
                int LIZ = C15380j0.LIZ(100.0f);
                int i3 = LJIIJJI - height;
                if (i3 - i2 < LIZ) {
                    i2 = i3 - LIZ;
                }
                ConstraintLayout constraintLayout = this.LJLJL;
                if (constraintLayout != null) {
                    C03510Bv.LIZ(constraintLayout, null);
                    wl().LJIIIZ(R.id.fdi, 4, 0, 4, i2);
                    AnonymousClass064 wl = wl();
                    ConstraintLayout constraintLayout2 = this.LJLJL;
                    if (constraintLayout2 != null) {
                        wl.LIZIZ(constraintLayout2);
                        return;
                    } else {
                        o.LJIJI("rootView");
                        throw null;
                    }
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("containerView");
            throw null;
        }
        ConstraintLayout constraintLayout3 = this.LJLJL;
        if (constraintLayout3 != null) {
            C03510Bv.LIZ(constraintLayout3, null);
            wl().LJIIIZ(R.id.fdi, 4, 0, 4, 0);
            AnonymousClass064 wl2 = wl();
            ConstraintLayout constraintLayout4 = this.LJLJL;
            if (constraintLayout4 != null) {
                wl2.LIZIZ(constraintLayout4);
                return;
            } else {
                o.LJIJI("rootView");
                throw null;
            }
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        EnumC07540Ri enumC07540Ri;
        View view2;
        FrameLayout frameLayout;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0Ko
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4 && keyEvent.getAction() == 1) {
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(KaraokeContainerDialog.this), null, null, new C2AR(KaraokeContainerDialog.this, null), 3);
                        return true;
                    }
                    return false;
                }
            });
        }
        View findViewById = view.findViewById(R.id.cc0);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.dismiss_view)");
        this.LJLJJL = findViewById;
        View findViewById2 = view.findViewById(R.id.fdi);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.karaoke_container)");
        this.LJLJJLL = findViewById2;
        C29306Beo.LJJLIIIJJIZ(-1, (int) (C15380j0.LJIIJJI() * 0.6f), findViewById2);
        View findViewById3 = view.findViewById(R.id.j83);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.root_view)");
        this.LJLJL = (ConstraintLayout) findViewById3;
        View view3 = this.LJLJJL;
        if (view3 != null) {
            C29306Beo.LJJJLL(view3, 500L, new IDqS416S0100000(this, 54));
            this.LJLJJI = C21210sP.LIZJ(this.dataChannel);
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C538329j(this, null), 3);
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("default_page");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof EnumC07540Ri) || (enumC07540Ri = (EnumC07540Ri) serializable) == null) {
                enumC07540Ri = EnumC07540Ri.LIBRARY;
            }
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C538429k(this, enumC07540Ri, null), 3);
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                view2 = window.getDecorView();
            } else {
                view2 = null;
            }
            if ((view2 instanceof FrameLayout) && (frameLayout = (FrameLayout) view2) != null) {
                new C04590Fz(frameLayout, this, this.LJLJJI);
            }
            C15I c15i = new C15I();
            c15i.LIZ = this;
            c15i.LIZIZ = view;
            new C15J(this, view, c15i.LIZJ);
            AnonymousClass064 wl = wl();
            ConstraintLayout constraintLayout = this.LJLJL;
            if (constraintLayout != null) {
                wl.LJII(constraintLayout);
                C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.0Kp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                    }
                }, view.findViewById(R.id.fdi));
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.lv0(this, LiveEndDismissDialogEvent.class, new IDqS416S0100000(this, 55));
                    return;
                }
                return;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("dismissView");
        throw null;
    }
}
