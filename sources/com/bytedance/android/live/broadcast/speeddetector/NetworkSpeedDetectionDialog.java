package com.bytedance.android.live.broadcast.speeddetector;

import X.C0K5;
import X.C0TO;
import X.C0TP;
import X.C0W0;
import X.C0W5;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C29494Bhq;
import X.C2A7;
import X.C47121t6;
import X.CN1;
import X.OUP;
import Y.IDCListenerS135S0100000;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class NetworkSpeedDetectionDialog extends LiveDialogFragment {
    public C2A7 LJLIL;
    public ImageView LJLILLLLZI;
    public C0TO LJLJI;
    public C0K5 LJLJJI;
    public C2A7 LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public C2A7 LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0t);
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJIIJ = C15380j0.LIZ(319.0f);
        c28507BGt.LJII = 80;
        return c28507BGt;
    }

    public final void vl() {
        final String str;
        C0K5 c0k5 = this.LJLJJI;
        if (c0k5 != null) {
            c0k5.setVisibility(0);
        }
        C0K5 c0k52 = this.LJLJJI;
        if (c0k52 != null) {
            c0k52.LJFF();
        }
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        this.LJLLI = System.currentTimeMillis();
        C0TO c0to = this.LJLJI;
        if (c0to != null) {
            c0to.LIZIZ();
        }
        C0TO c0to2 = new C0TO();
        this.LJLJI = c0to2;
        c0to2.LJ(C0TP.SCENE_TIKTOK_GAME_LIVE_MANUAL, new C0W5() { // from class: X.1GP
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0076, code lost:
            
                if (r2 != null) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
            
                if (r2 != null) goto L59;
             */
            @Override // X.C0W5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(long r22, long r24) {
                /*
                    Method dump skipped, instructions count: 419
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1GP.LIZ(long, long):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:36:0x0021, code lost:
            
                if (r4 != null) goto L10;
             */
            @Override // X.C0W5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(int r13, java.lang.String r14) {
                /*
                    r12 = this;
                    java.lang.String r0 = "message"
                    kotlin.jvm.internal.o.LJIIIZ(r14, r0)
                    long r6 = java.lang.System.currentTimeMillis()
                    X.0W0 r5 = X.C0W0.DisconnectTypeManuallyDetectionClickCancel
                    int r0 = r5.getCode()
                    r2 = 0
                    if (r13 != r0) goto L87
                L12:
                    com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog.this
                    X.0TO r4 = r0.LJLJI
                    java.lang.String r3 = ""
                    if (r4 == 0) goto L20
                    X.1l1 r0 = r4.LIZ
                    java.lang.String r1 = r0.LIZJ
                    if (r1 != 0) goto L23
                L20:
                    r1 = r3
                    if (r4 == 0) goto L29
                L23:
                    java.lang.String r0 = r4.LIZJ()
                    if (r0 != 0) goto L85
                L29:
                    java.lang.String r0 = "manual"
                    X.C1JD.LJJIJ(r13, r1, r3, r14, r0)
                    com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog.this
                    boolean r0 = r0.isHidden()
                    if (r0 != 0) goto L3c
                    com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog.this
                    boolean r0 = r0.isViewValid
                    if (r0 != 0) goto L3d
                L3c:
                    return
                L3d:
                    boolean r0 = X.C30922CBq.LIZIZ
                    if (r0 == 0) goto L5e
                    java.lang.StringBuilder r1 = X.X1D.LIZ()
                    java.lang.String r0 = "onDetectFailure. errorCode="
                    r1.append(r0)
                    r1.append(r13)
                    java.lang.String r0 = ", message="
                    r1.append(r0)
                    r1.append(r14)
                    java.lang.String r1 = X.X1D.LIZIZ(r1)
                    java.lang.String r0 = "NetworkSpeedDetectionDialog"
                    X.C0NB.LJ(r0, r1)
                L5e:
                    int r0 = r5.getCode()
                    if (r13 != r0) goto L71
                    com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog.this
                    X.0K5 r1 = r0.LJLJJI
                    if (r1 != 0) goto L6b
                    goto L3c
                L6b:
                    r0 = 8
                    r1.setVisibility(r0)
                    goto L3c
                L71:
                    com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog.this
                    X.0K5 r0 = r0.LJLJJI
                    if (r0 != 0) goto L81
                L77:
                    com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog.this
                    X.0K5 r0 = r0.LJLJJI
                    if (r0 == 0) goto L3c
                    r0.LJ()
                    goto L3c
                L81:
                    r0.setVisibility(r2)
                    goto L77
                L85:
                    r3 = r0
                    goto L29
                L87:
                    X.0W0 r0 = X.C0W0.DisconnectTypeManuallyDetectionCloseDialog
                    int r0 = r0.getCode()
                    if (r13 != r0) goto L90
                    goto L12
                L90:
                    com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog.this
                    long r0 = r0.LJLLI
                    long r6 = r6 - r0
                    r0 = 1000(0x3e8, float:1.401E-42)
                    long r0 = (long) r0
                    long r6 = r6 / r0
                    java.lang.String r8 = "failed"
                    java.lang.String r9 = ""
                    java.lang.String r10 = r2
                    java.lang.String r11 = ""
                    X.OUP.LJJIZ(r6, r8, r9, r10, r11)
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1GP.LIZIZ(int, java.lang.String):void");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LJLL = true;
        super.onCancel(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        boolean z;
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        IDefinitionService iDefinitionService;
        String str;
        o.LJIIIZ(dialog, "dialog");
        C0TO c0to = this.LJLJI;
        if (c0to != null && !c0to.LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
            if (quality == null || (str = quality.sdkKey) == null) {
                str = "";
            }
            OUP.LJJIZ((System.currentTimeMillis() - this.LJLLI) / 1000, "cancelled", "exit_test_page", str, "");
        }
        C0TO c0to2 = this.LJLJI;
        if (c0to2 != null) {
            C0W0 c0w0 = C0W0.DisconnectTypeManuallyDetectionCloseDialog;
            c0to2.LIZ(c0w0.getCode(), c0w0.getMessage());
        }
        if (!this.LJLL && (dataChannel = this.dataChannel) != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class)) != null) {
            iDefinitionService.bT(fragmentManager, true);
        }
        super.onDismiss(dialog);
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
        C2A7 c2a7;
        C47121t6 c47121t6;
        C47121t6 c47121t62;
        C47121t6 c47121t63;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (C2A7) view.findViewById(R.id.lo5);
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.lo3);
        C0K5 c0k5 = (C0K5) view.findViewById(R.id.k__);
        this.LJLJJI = c0k5;
        C2A7 c2a72 = null;
        if (c0k5 != null) {
            c2a7 = (C2A7) c0k5.findViewById(R.id.lo4);
        } else {
            c2a7 = null;
        }
        this.LJLJJL = c2a7;
        C0K5 c0k52 = this.LJLJJI;
        if (c0k52 != null) {
            c47121t6 = (C47121t6) c0k52.findViewById(R.id.mkx);
        } else {
            c47121t6 = null;
        }
        this.LJLJJLL = c47121t6;
        C0K5 c0k53 = this.LJLJJI;
        if (c0k53 != null) {
            c47121t62 = (C47121t6) c0k53.findViewById(R.id.mkw);
        } else {
            c47121t62 = null;
        }
        this.LJLJL = c47121t62;
        C0K5 c0k54 = this.LJLJJI;
        if (c0k54 != null) {
            c47121t63 = (C47121t6) c0k54.findViewById(R.id.mkt);
        } else {
            c47121t63 = null;
        }
        this.LJLJLJ = c47121t63;
        C0K5 c0k55 = this.LJLJJI;
        if (c0k55 != null) {
            c2a72 = (C2A7) c0k55.findViewById(R.id.azd);
        }
        this.LJLJLLL = c2a72;
        C2A7 c2a73 = this.LJLJJL;
        if (c2a73 != null) {
            C16880lQ.LJJIII(c2a73, new IDCListenerS135S0100000(this, 39));
        }
        C2A7 c2a74 = this.LJLJLLL;
        if (c2a74 != null) {
            C16880lQ.LJJIII(c2a74, new IDCListenerS135S0100000(this, 40));
        }
        C2A7 c2a75 = this.LJLIL;
        if (c2a75 != null) {
            C16880lQ.LJJIII(c2a75, new IDCListenerS135S0100000(this, 41));
        }
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new IDCListenerS135S0100000(this, 42));
        }
    }
}
