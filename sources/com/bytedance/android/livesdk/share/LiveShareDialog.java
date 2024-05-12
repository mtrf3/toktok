package com.bytedance.android.livesdk.share;

import X.BNI;
import X.BY6;
import X.C15380j0;
import X.C29338BfK;
import X.C29930Bos;
import X.CN1;
import X.InterfaceC29882Bo6;
import X.InterfaceC62096OYq;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveShareDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJJL = 0;
    public C29930Bos LJLILLLLZI;
    public InterfaceC62096OYq LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public boolean LJLIL = true;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28507BGt createParams() {
        /*
            r7 = this;
            X.Bos r0 = r7.LJLILLLLZI
            r6 = 1
            if (r0 == 0) goto L83
            boolean r0 = r0.LJJIL
        L7:
            r7.LJLIL = r0
            if (r0 == 0) goto L6f
            r2 = 2131887505(0x7f120591, float:1.9409619E38)
            if (r0 != r6) goto L73
            r4 = 80
        L12:
            boolean r0 = r7.LJLIL
            r3 = -1
            if (r0 != r6) goto L60
            r5 = -1
        L18:
            boolean r0 = r7.LJLIL
            if (r0 != r6) goto L5d
        L1c:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "share dialog createParams , isPortrait = "
            r1.append(r0)
            boolean r0 = r7.LJLIL
            r1.append(r0)
            java.lang.String r0 = ", share params = "
            r1.append(r0)
            X.Bos r0 = r7.LJLILLLLZI
            r1.append(r0)
            java.lang.String r0 = " , data channel = "
            r1.append(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.dataChannel
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "LiveShareDialog"
            X.C0NB.LIZIZ(r0, r1)
            X.BGt r1 = new X.BGt
            r0 = 2131563268(0x7f0d1304, float:1.8751988E38)
            r1.<init>(r0)
            r1.LIZJ = r2
            r1.LJII = r4
            r1.LJIIIZ = r5
            r1.LJIIJ = r3
            return r1
        L5d:
            if (r0 != 0) goto L85
            goto L1c
        L60:
            if (r0 != 0) goto L8b
            android.content.Context r1 = r7.getContext()
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r0 = X.B9K.LIZ(r1, r0)
            int r5 = (int) r0
            goto L18
        L6f:
            r2 = 2131887550(0x7f1205be, float:1.940971E38)
            goto L75
        L73:
            if (r0 != 0) goto L91
        L75:
            android.content.Context r0 = r7.getContext()
            boolean r0 = X.CCJ.LIZ(r0)
            if (r0 == 0) goto L81
            r4 = 3
            goto L12
        L81:
            r4 = 5
            goto L12
        L83:
            r0 = 1
            goto L7
        L85:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L8b:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L91:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.share.LiveShareDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        return new BY6(R.layout.cw7);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final Dialog newDialog(Bundle bundle) {
        if (this.LJLILLLLZI == null || this.LJLJI == null) {
            return super.newDialog(bundle);
        }
        BNI un0 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
        return ((C29338BfK) un0).LIZ.getShareDialog(mo49getActivity(), this.LJLILLLLZI, this.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public static final LiveShareDialog vl(C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        LiveShareDialog liveShareDialog = new LiveShareDialog();
        liveShareDialog.LJLILLLLZI = c29930Bos;
        liveShareDialog.LJLJI = interfaceC62096OYq;
        return liveShareDialog;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Dialog dialog;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.LJLIL || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(C15380j0.LIZIZ(R.color.yi));
    }
}
