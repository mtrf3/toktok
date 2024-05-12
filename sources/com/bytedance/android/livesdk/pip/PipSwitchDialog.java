package com.bytedance.android.livesdk.pip;

import X.BY6;
import X.BZI;
import X.C15380j0;
import X.C162476Zf;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C30184Bsy;
import X.C40210FqI;
import X.C48459J0d;
import X.InterfaceC29882Bo6;
import X.InterfaceC30442Bx8;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PipSwitchDialog extends LiveDialogFragment implements View.OnClickListener {
    public static final String LJLILLLLZI = C16880lQ.LJLLJ(PipSwitchDialog.class);
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        return new BY6(R.layout.dg3);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        int i2;
        int LIZ;
        boolean LJIILLIIL = C15380j0.LJIILLIIL();
        if (LJIILLIIL) {
            i = R.style.rr;
            i2 = 80;
        } else {
            i = R.style.rs;
            i2 = 5;
        }
        int i3 = -1;
        if (LJIILLIIL) {
            LIZ = -1;
            if (LJIILLIIL) {
                i3 = -2;
            } else if (LJIILLIIL) {
                throw new C162476Zf();
            }
        } else {
            LIZ = C15380j0.LIZ(490.0f);
        }
        C28507BGt c28507BGt = new C28507BGt(R.layout.dg3);
        c28507BGt.LIZJ = i;
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = i2;
        c28507BGt.LJIIIZ = LIZ;
        c28507BGt.LJIIJ = i3;
        return c28507BGt;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl() {
        /*
            r9 = this;
            android.content.Context r0 = r9.getContext()
            X.C30184Bsy.LJ(r0)
            r0 = 2131373004(0x7f0a2bcc, float:1.8366087E38)
            android.view.View r7 = r9._$_findCachedViewById(r0)
            android.content.Context r0 = r9.getContext()
            boolean r0 = X.C28329B9x.LIZIZ(r0)
            java.lang.String r8 = "room_id"
            r1 = 0
            r3 = 1
            r2 = 0
            if (r0 == 0) goto Lfe
            boolean r0 = X.C30184Bsy.LIZJ()
            if (r0 == 0) goto Lfe
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r0 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.0Mx r6 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.watch.IWatchLiveService r6 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r6
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto Lfb
            long r4 = r0.getLong(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L39:
            boolean r0 = r6.Rb(r0)
            if (r0 != 0) goto Lfe
            r0 = 1
        L40:
            X.C29306Beo.LJJLIIIJJI(r7, r0)
            boolean r0 = X.C30184Bsy.LIZLLL()
            r4 = 2131372106(0x7f0a284a, float:1.8364266E38)
            r5 = 2131362784(0x7f0a03e0, float:1.8345358E38)
            r6 = 2131373005(0x7f0a2bcd, float:1.836609E38)
            if (r0 == 0) goto Lb0
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r0 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.0Mx r7 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.watch.IWatchLiveService r7 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r7
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L68
            long r0 = r0.getLong(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L68:
            boolean r0 = r7.Rb(r1)
            if (r0 != 0) goto Lb0
            android.content.Context r0 = r9.getContext()
            boolean r0 = X.C28329B9x.LIZIZ(r0)
            if (r0 == 0) goto L94
            android.view.View r0 = r9._$_findCachedViewById(r6)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
            android.view.View r0 = r9._$_findCachedViewById(r5)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            android.view.View r0 = r9._$_findCachedViewById(r4)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
        L93:
            return
        L94:
            android.view.View r0 = r9._$_findCachedViewById(r6)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            android.view.View r0 = r9._$_findCachedViewById(r5)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            android.view.View r0 = r9._$_findCachedViewById(r4)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
            goto L93
        Lb0:
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.LLJJJJLIIL
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_BG_AUDIO_PLAY_OPEN.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto Ldf
            android.view.View r0 = r9._$_findCachedViewById(r6)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            android.view.View r0 = r9._$_findCachedViewById(r5)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
            android.view.View r0 = r9._$_findCachedViewById(r4)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            goto L93
        Ldf:
            android.view.View r0 = r9._$_findCachedViewById(r6)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            android.view.View r0 = r9._$_findCachedViewById(r5)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            android.view.View r0 = r9._$_findCachedViewById(r4)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
            goto L93
        Lfb:
            r0 = r1
            goto L39
        Lfe:
            r0 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.pip.PipSwitchDialog.vl():void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLJJJJJIL;
        Boolean bool = Boolean.TRUE;
        c48459J0d.LIZ(bool);
        BZI LIZ = C28787BRn.LIZ("livesdk_background_player_switch");
        LIZ.LJIIZILJ();
        if (o.LJ(view, _$_findCachedViewById(R.id.hq_))) {
            InterfaceC30442Bx8.LLJJJJ.LIZ(bool);
            InterfaceC30442Bx8.LLJJJJLIIL.LIZ(bool);
            Context context = getContext();
            o.LJI(context);
            if (!C30184Bsy.LIZ(context)) {
                Context context2 = getContext();
                if (Build.VERSION.SDK_INT >= 28) {
                    C40210FqI.LJII(context2, "android.settings.PICTURE_IN_PICTURE_SETTINGS");
                } else {
                    C40210FqI.LJI(context2);
                }
                dismissAllowingStateLoss();
            }
            LIZ.LJIJJ("pip", "select_type");
        } else if (o.LJ(view, _$_findCachedViewById(R.id.a_8))) {
            InterfaceC30442Bx8.LLJJJJ.LIZ(Boolean.FALSE);
            InterfaceC30442Bx8.LLJJJJLIIL.LIZ(bool);
            LIZ.LJIJJ("audio", "select_type");
        } else if (o.LJ(view, _$_findCachedViewById(R.id.h2z))) {
            C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.LLJJJJ;
            Boolean bool2 = Boolean.FALSE;
            c48459J0d2.LIZ(bool2);
            InterfaceC30442Bx8.LLJJJJLIIL.LIZ(bool2);
            LIZ.LJIJJ(LiveGiftNewGifterBadgeSetting.DEFAULT, "select_type");
        }
        LIZ.LJJIIJZLJL();
        vl();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("enter_from", "unknown");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.hq_), this);
        _$_findCachedViewById(R.id.hqa).setClickable(false);
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.a_8), this);
        _$_findCachedViewById(R.id.a_c).setClickable(false);
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.h2z), this);
        _$_findCachedViewById(R.id.h30).setClickable(false);
        vl();
        if (!C15380j0.LJIILLIIL()) {
            _$_findCachedViewById(R.id.gbi).setBackgroundResource(R.drawable.cgr);
        }
    }
}
