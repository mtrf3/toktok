package com.bytedance.android.livesdk.chatroom.view;

import X.ActivityC45651qj;
import X.C0NB;
import X.C0TL;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C276516r;
import X.C29401Dk;
import X.C29651BkN;
import X.C29656BkS;
import X.C29659BkV;
import X.C29670Bkg;
import X.C29S;
import X.C2A3;
import X.C30868C9o;
import X.C30872C9s;
import X.C3C5;
import X.C51029K0z;
import X.C64698PaI;
import X.C73943T0h;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS374S0100000_5;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class StickerEditFragment extends DialogFragment {
    public LiveEditText LJLIL;
    public C2A3 LJLILLLLZI;
    public C30872C9s LJLJI;
    public Room LJLJJI;
    public C29656BkS LJLJJL;
    public String LJLJJLL;
    public DataChannel LJLJLJ;
    public RoomSticker LJLJLLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLL;
    public InterfaceC65784Pro<C76800UCe> LJLLI;
    public String LJLLJ;
    public long LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public Integer LJLJL = 0;
    public final C29659BkV LJLLILLLL = new C29659BkV(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLL;
        Integer valueOf = Integer.valueOf(R.id.l5l);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.l5l)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        this.LJLL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LiveEditText liveEditText = this.LJLIL;
        if (liveEditText != null) {
            liveEditText.post(new ARunnableS41S0100000_5(this, 134));
        }
        LiveEditText liveEditText2 = this.LJLIL;
        if (liveEditText2 == null) {
            return;
        }
        liveEditText2.setOnFocusChangeListener(new IDCListenerS374S0100000_5(this, 1));
    }

    public final void vl() {
        try {
            dismissAllowingStateLoss();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        this.LJLJLJ = LJIILIIL;
        Integer num = null;
        if (LJIILIIL != null) {
            room = (Room) LJIILIIL.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJI = room;
        Bundle arguments = getArguments();
        if (arguments != null) {
            num = Integer.valueOf(arguments.getInt("build_dialog"));
        }
        this.LJLJL = num;
        setCancelable(true);
        setStyle(1, R.style.acz);
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.ov0(this, LinkCrossRoomStateChangeEvent.class, new C29651BkN(this));
        }
        C73943T0h.LIZ().LJ(C29670Bkg.class).LJJJJZI(new AfS57S0100000_5(this, 79));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(32);
            window.setSoftInputMode(3);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public final void wl(Throwable th) {
        boolean z = true;
        if (!(th instanceof TimeoutException) && !(th instanceof C0TL)) {
            z = th instanceof C64698PaI;
        }
        if (z) {
            C30868C9o.LJI(getString(R.string.o7g));
            C29656BkS c29656BkS = this.LJLJJL;
            if (c29656BkS != null) {
                c29656BkS.LJLLI(4);
                return;
            }
            return;
        }
        if (th instanceof C29401Dk) {
            if (((C276516r) th).getErrorCode() != 4003107) {
                return;
            }
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.o7d));
            C29656BkS c29656BkS2 = this.LJLJJL;
            if (c29656BkS2 == null) {
                return;
            }
            c29656BkS2.LJLLI(4);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error message:");
        LIZ.append(th);
        C0NB.LIZ(X1D.LIZIZ(LIZ));
    }

    public final void xl(boolean z) {
        if (z) {
            ((LiveIconView) _$_findCachedViewById(R.id.l5l)).setIconTint(C259910h.LIZJ(R.attr.bnt, _$_findCachedViewById(R.id.l5l)));
        } else {
            ((LiveIconView) _$_findCachedViewById(R.id.l5l)).setIconTint(C259910h.LIZJ(R.attr.bnd, _$_findCachedViewById(R.id.l5l)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.view.StickerEditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dj6, viewGroup, false);
        this.LJLIL = (LiveEditText) LLLLIILL.findViewById(R.id.l5g);
        View findViewById = LLLLIILL.findViewById(R.id.cpv);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.edit_text_hint)");
        this.LJLILLLLZI = (C2A3) findViewById;
        LiveEditText liveEditText = this.LJLIL;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(this.LJLLILLLL);
        }
        C30872C9s c30872C9s = (C30872C9s) LLLLIILL.findViewById(R.id.nbu);
        this.LJLJI = c30872C9s;
        if (c30872C9s != null) {
            c30872C9s.setActivity(mo49getActivity());
        }
        C30872C9s c30872C9s2 = this.LJLJI;
        if (c30872C9s2 != null) {
            c30872C9s2.setShowStatusBar(true);
        }
        LLLLIILL.findViewById(R.id.khm);
        ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.l5l);
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS25S0100000_5(this, 133));
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
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
