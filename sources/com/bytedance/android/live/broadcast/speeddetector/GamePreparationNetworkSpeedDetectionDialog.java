package com.bytedance.android.live.broadcast.speeddetector;

import X.C0K5;
import X.C0KB;
import X.C0KL;
import X.C0NB;
import X.C0TO;
import X.C0TP;
import X.C0W0;
import X.C0W5;
import X.C12770en;
import X.C15380j0;
import X.C16880lQ;
import X.C23010vJ;
import X.C29306Beo;
import X.C2A7;
import X.C30161Gi;
import X.C30171Gj;
import X.C30922CBq;
import X.C47121t6;
import X.C51029K0z;
import X.C73411SrX;
import X.C78496UrM;
import X.OUP;
import Y.IDCListenerS135S0100000;
import Y.IDRunnableS85S0100000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedDetectionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.GamePreparationManualSpeedTestStartEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GamePreparationNetworkSpeedDetectionDialog extends LiveSheetFragment {
    public AnimatorSet LLD;
    public Animator LLF;
    public C73411SrX LLFF;
    public C47121t6 LLFFF;
    public AppCompatImageView LLFII;
    public C47121t6 LLFZ;
    public C2A7 LLI;
    public C2A7 LLIFFJFJJ;
    public C0K5 LLII;
    public final Handler LLIIII;
    public long LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public final C0KL LLIIIZ;
    public C0TO LLIIJI;

    public GamePreparationNetworkSpeedDetectionDialog() {
        new LinkedHashMap();
        this.LLIIII = new Handler(C16880lQ.LLJJJJ());
        this.LLIIIL = -1;
        C0KL c0kl = new C0KL();
        c0kl.LIZIZ = C15380j0.LJIILJJIL(R.string.olp);
        c0kl.LIZJ = false;
        c0kl.LIZLLL = new IDCListenerS135S0100000(this, 37);
        this.LLIIIZ = c0kl;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.oli));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C30161Gi(R.attr.asm, new IDCListenerS135S0100000(this, 34)));
        c0kb.LJ = arrayList;
        c0kb.LIZLLL = this.LLIIIZ;
        return c0kb;
    }

    public final void Nl() {
        AnimatorSet animatorSet = this.LLD;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLD = null;
        Animator animator = this.LLF;
        if (animator != null) {
            animator.cancel();
        }
        this.LLF = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GamePreparationNetworkSpeedDetectionDialogAlive.class, Boolean.FALSE);
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationNetworkSpeedDetectionDialog", "onDestroy()");
        }
        Nl();
        C73411SrX c73411SrX = this.LLFF;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C0TO c0to = this.LLIIJI;
        if (c0to != null && !c0to.LIZLLL()) {
            PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
            if (quality == null || (str = quality.sdkKey) == null) {
                str = "";
            }
            OUP.LJJIZ((System.currentTimeMillis() - this.LLIIIILZ) / 1000, "cancelled", "exit_test_page", str, "");
        }
        C0TO c0to2 = this.LLIIJI;
        if (c0to2 != null) {
            C0W0 c0w0 = C0W0.DisconnectTypeManuallyDetectionCloseDialog;
            c0to2.LIZ(c0w0.getCode(), c0w0.getMessage());
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        sheetOptions.cornerRadius = C15380j0.LIZ(12.0f);
        return sheetOptions;
    }

    public final void Ml(long j) {
        final String str;
        C0K5 c0k5 = this.LLII;
        if (c0k5 != null) {
            c0k5.LIZLLL();
        }
        C2A7 c2a7 = this.LLIFFJFJJ;
        if (c2a7 != null) {
            c2a7.setEnabled(false);
        }
        C47121t6 c47121t6 = this.LLFZ;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.om3, "-"));
        }
        C12770en.LIZJ("during_testing");
        C30171Gj c30171Gj = this.LJLJJLL;
        if (c30171Gj != null) {
            c30171Gj.setEndTextButtonEnable(false);
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.pv0(GamePreparationManualSpeedTestStartEvent.class);
        }
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        this.LLIIIILZ = System.currentTimeMillis();
        C0TO c0to = this.LLIIJI;
        if (c0to != null) {
            c0to.LIZIZ();
        }
        C0TO c0to2 = new C0TO();
        this.LLIIJI = c0to2;
        c0to2.LJ(C0TP.SCENE_TIKTOK_GAME_LIVE_MANUAL, new C0W5() { // from class: X.1K0
            /* JADX WARN: Code restructure failed: missing block: B:71:0x006c, code lost:
            
                if (r8 != null) goto L24;
             */
            @Override // X.C0W5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(long r30, long r32) {
                /*
                    Method dump skipped, instructions count: 483
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1K0.LIZ(long, long):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x0022, code lost:
            
                if (r5 != null) goto L10;
             */
            @Override // X.C0W5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(int r11, java.lang.String r12) {
                /*
                    r10 = this;
                    java.lang.String r0 = "message"
                    kotlin.jvm.internal.o.LJIIIZ(r12, r0)
                    long r4 = java.lang.System.currentTimeMillis()
                    X.0W0 r0 = X.C0W0.DisconnectTypeManuallyDetectionClickCancel
                    int r0 = r0.getCode()
                    r3 = 0
                    r2 = 1
                    if (r11 != r0) goto L93
                L13:
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    X.0TO r5 = r0.LLIIJI
                    java.lang.String r4 = ""
                    if (r5 == 0) goto L21
                    X.1l1 r0 = r5.LIZ
                    java.lang.String r1 = r0.LIZJ
                    if (r1 != 0) goto L24
                L21:
                    r1 = r4
                    if (r5 == 0) goto L2a
                L24:
                    java.lang.String r0 = r5.LIZJ()
                    if (r0 != 0) goto L91
                L2a:
                    java.lang.String r0 = "manual"
                    X.C1JD.LJJIJ(r11, r1, r4, r12, r0)
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    boolean r0 = r0.isHidden()
                    if (r0 != 0) goto L3f
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    boolean r0 = r0.isDetached()
                    if (r0 == 0) goto L40
                L3f:
                    return
                L40:
                    boolean r0 = X.C30922CBq.LIZIZ
                    if (r0 == 0) goto L61
                    java.lang.StringBuilder r1 = X.X1D.LIZ()
                    java.lang.String r0 = "onDetectFailure. errorCode="
                    r1.append(r0)
                    r1.append(r11)
                    java.lang.String r0 = ", message="
                    r1.append(r0)
                    r1.append(r12)
                    java.lang.String r1 = X.X1D.LIZIZ(r1)
                    java.lang.String r0 = "NetworkSpeedDetectionDialog"
                    X.C0NB.LJ(r0, r1)
                L61:
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    X.SrX r0 = r0.LLFF
                    if (r0 == 0) goto L6a
                    r0.dispose()
                L6a:
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    r0.Nl()
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    X.0K5 r0 = r0.LLII
                    if (r0 != 0) goto L8d
                L75:
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    X.0K5 r0 = r0.LLII
                    if (r0 == 0) goto L7e
                    r0.LJ()
                L7e:
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    X.1Gj r0 = r0.LJLJJLL
                    if (r0 == 0) goto L87
                    r0.setEndTextButtonEnable(r2)
                L87:
                    java.lang.String r0 = "testing_problem"
                    X.C12770en.LIZJ(r0)
                    goto L3f
                L8d:
                    r0.setVisibility(r3)
                    goto L75
                L91:
                    r4 = r0
                    goto L2a
                L93:
                    X.0W0 r0 = X.C0W0.DisconnectTypeManuallyDetectionCloseDialog
                    int r0 = r0.getCode()
                    if (r11 != r0) goto L9d
                    goto L13
                L9d:
                    com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog r0 = com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog.this
                    long r0 = r0.LLIIIILZ
                    long r4 = r4 - r0
                    r0 = 1000(0x3e8, float:1.401E-42)
                    long r0 = (long) r0
                    long r4 = r4 / r0
                    java.lang.String r6 = "failed"
                    java.lang.String r7 = ""
                    java.lang.String r8 = r2
                    java.lang.String r9 = ""
                    X.OUP.LJJIZ(r4, r6, r7, r8, r9)
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1K0.LIZIZ(int, java.lang.String):void");
            }
        });
        this.LLIIII.postDelayed(new IDRunnableS85S0100000(this, 58), j);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GamePreparationNetworkSpeedDetectionDialogAlive.class, Boolean.TRUE);
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationNetworkSpeedDetectionDialog", "onCreate()");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("enter_from");
        } else {
            i = -1;
        }
        this.LLIIIL = i;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cx_, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }

    public final void Ol(long j, boolean z) {
        C47121t6 c47121t6 = this.LLFFF;
        if (c47121t6 != null) {
            C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(45.0f), c47121t6);
        }
        if (z) {
            C47121t6 c47121t62 = this.LLFFF;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setText(C15380j0.LJIILJJIL(R.string.olx));
            return;
        }
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(C15380j0.LJIILL(R.string.olw, Long.valueOf(j)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
        if (!C29306Beo.LJIJJLI(sb)) {
            return;
        }
        int indexOf = sb.indexOf(String.valueOf(j), 0);
        if (indexOf > 0 && String.valueOf(j).length() + indexOf <= sb.length()) {
            C23010vJ.LJFF(spannableStringBuilder, indexOf, String.valueOf(j).length() + indexOf, 33, 600);
        }
        C47121t6 c47121t63 = this.LLFFF;
        if (c47121t63 == null) {
            return;
        }
        c47121t63.setText(spannableStringBuilder);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AppCompatImageView appCompatImageView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, GamePreparationPageDestroyEvent.class, new IDqS416S0100000(this, 156));
        }
        C0K5 c0k5 = (C0K5) view.findViewById(R.id.i1e);
        this.LLII = c0k5;
        if (c0k5 != null) {
            c0k5.setVisibility(0);
        }
        this.LLFFF = (C47121t6) view.findViewById(R.id.lnt);
        this.LLFZ = (C47121t6) view.findViewById(R.id.lny);
        this.LLI = (C2A7) view.findViewById(R.id.ay4);
        C0K5 c0k52 = this.LLII;
        C2A7 c2a7 = null;
        if (c0k52 != null) {
            appCompatImageView = (AppCompatImageView) c0k52.findViewById(R.id.lnw);
        } else {
            appCompatImageView = null;
        }
        this.LLFII = appCompatImageView;
        Ml(500L);
        C0K5 c0k53 = this.LLII;
        if (c0k53 != null) {
            c2a7 = (C2A7) c0k53.findViewById(R.id.lns);
        }
        this.LLIFFJFJJ = c2a7;
        if (c2a7 != null) {
            c2a7.setEnabled(false);
        }
        C2A7 c2a72 = this.LLIFFJFJJ;
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new IDCListenerS135S0100000(this, 35));
        }
        C2A7 c2a73 = this.LLI;
        if (c2a73 != null) {
            C16880lQ.LJJIII(c2a73, new IDCListenerS135S0100000(this, 36));
        }
    }
}
