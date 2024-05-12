package com.bytedance.android.live.broadcast.interruption;

import X.ActivityC45651qj;
import X.AnonymousClass130;
import X.C1O1;
import X.C221108m2;
import X.C22940vC;
import X.C28998BZq;
import X.C29306Beo;
import X.C46971sr;
import X.C46981ss;
import X.C47071t1;
import X.C62822Ol8;
import X.CFX;
import X.EnumC266912z;
import X.InterfaceC30405BwX;
import X.InterfaceC30442Bx8;
import X.InterfaceC40159FpT;
import Y.IDcS169S0100000;
import android.content.DialogInterface;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcast.interruption.PreviewMultiDeviceInterruptGuide;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import com.bytedance.android.livesdk.livesetting.game.ProcessExitGuideData;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class PreviewMultiDeviceInterruptGuide implements GenericLifecycleObserver, InterfaceC30405BwX {
    public LiveDialog LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public C22940vC LJLJI;
    public SparkContext LJLJJI;
    public final Boolean LJLJJL;
    public final String LJLJJLL;
    public final List<ProcessExitGuideData> LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume(lifecycleOwner);
        }
    }

    public final long LIZ() {
        if (this.LJLJLJ) {
            return ((Number) this.LJLL.getValue()).longValue();
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r1.booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 30) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI.mv0(X.C29044Baa.class);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r0 = r0.creator;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        r0 = r0.roomContinue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r0.intValue() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r1 = com.bytedance.android.livesdk.util.GlobalContext.getApplicationContext();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "getApplicationContext()");
        r8 = X.C1O1.LJII(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r8 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r0 = r10.LJLJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r6 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r6.hasNext() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        r5 = r6.next();
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        r3 = r0.brand;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r2 = android.os.Build.BRAND;
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "BRAND");
        r1 = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "ENGLISH");
        r1 = r2.toLowerCase(r1);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "this as java.lang.String).toLowerCase(locale)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, r1) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        r1 = r7.exitReasonList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r1 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        r0 = r7.exitDescriptionList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        r1 = (java.util.ArrayList) X.ORZ.LLJJIII(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r1.isEmpty() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        r3 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r3.hasNext() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        r2 = (X.OSZ) r3.next();
        r0 = (java.lang.Integer) r2.getFirst();
        r1 = r8.getReason();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        if (r0.intValue() != r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2.getSecond(), r8.getDescription()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0100, code lost:
    
        r10.LJLJLJ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        r0 = X.C61878OQg.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00af, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0043, code lost:
    
        if (X.C1O1.LJIIIIZZ() != false) goto L17;
     */
    @Override // X.InterfaceC30405BwX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIJ() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.interruption.PreviewMultiDeviceInterruptGuide.LJJLIIJ():boolean");
    }

    @Override // X.InterfaceC30405BwX
    public final void dismiss() {
        InterfaceC40159FpT LJIILL;
        LiveDialog liveDialog = this.LJLIL;
        if (liveDialog != null) {
            liveDialog.dismiss();
        }
        SparkContext sparkContext = this.LJLJJI;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        this.LJLJI = null;
    }

    @Override // X.InterfaceC30405BwX
    public final LiveDialog getDialog() {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Boolean bool = null;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        LiveDialog liveDialog = this.LJLIL;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return this.LJLIL;
        }
        if (this.LJLJI == null) {
            this.LJLJI = new C22940vC();
        }
        Boolean LIZJ = InterfaceC30442Bx8.V0.LIZJ();
        o.LJIIIIZZ(LIZJ, "GAME_LIVE_INTERRUPTION_GUIDE_NO_SHOW.value");
        if (LIZJ.booleanValue() && C1O1.LJIIIIZZ()) {
            valueOf = Integer.valueOf(R.string.jxb);
            valueOf2 = Integer.valueOf(R.string.jx9);
            valueOf3 = Integer.valueOf(R.string.jx_);
            valueOf4 = Integer.valueOf(R.string.jxa);
        } else {
            valueOf = Integer.valueOf(R.string.jxl);
            valueOf2 = Integer.valueOf(R.string.jxi);
            valueOf3 = Integer.valueOf(R.string.jxj);
            valueOf4 = Integer.valueOf(R.string.jxk);
        }
        C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI);
        c47071t1.LIZLLL(new C28998BZq(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "game_live_interrupt_dialog_image.png"));
        c47071t1.LJIILLIIL(valueOf.intValue());
        c47071t1.LJFF(valueOf2.intValue());
        c47071t1.LJIIL(valueOf3.intValue(), new IDcS169S0100000(this, 7));
        c47071t1.LJIIIZ(valueOf4.intValue(), new IDcS169S0100000(this, 8));
        c47071t1.LJIILLIIL = new DialogInterface.OnShowListener() { // from class: X.0JM
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PreviewMultiDeviceInterruptGuide.this.getClass();
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.U0;
                Boolean bool2 = Boolean.FALSE;
                c48459J0d.LIZ(bool2);
                InterfaceC30442Bx8.V0.LIZ(bool2);
                PreviewMultiDeviceInterruptGuide previewMultiDeviceInterruptGuide = PreviewMultiDeviceInterruptGuide.this;
                C22940vC c22940vC = previewMultiDeviceInterruptGuide.LJLJI;
                if (c22940vC != null) {
                    c22940vC.LJIIIIZZ(previewMultiDeviceInterruptGuide.LIZ(), EnumC266912z.GO_LIVE_POPUP, AnonymousClass130.BEFORE_LIVE);
                }
            }
        };
        c47071t1.LJIILJJIL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        this.LJLIL = LIZ;
        return LIZ;
    }

    public PreviewMultiDeviceInterruptGuide(Fragment fragment) {
        boolean z;
        o.LJIIIZ(fragment, "fragment");
        this.LJLILLLLZI = fragment.mo49getActivity();
        this.LJLJLLL = C221108m2.LIZIZ(C46971sr.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C46981ss.LJLIL);
        MultiDeviceInterruptGuideData data = MultiDeviceInterruptGuideSetting.INSTANCE.getData();
        Integer num = data.enable;
        if (num == null || num.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = Boolean.valueOf(z);
        this.LJLJJLL = data.guideUrl;
        this.LJLJL = data.processExitGuideList;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume(LifecycleOwner owner) {
        Boolean bool;
        o.LJIIIZ(owner, "owner");
        LiveDialog liveDialog = this.LJLIL;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && !this.LJLJLJ && C1O1.LJIIJ()) {
            C22940vC c22940vC = this.LJLJI;
            if (c22940vC != null) {
                c22940vC.LJI(LIZ(), EnumC266912z.GO_LIVE_POPUP, AnonymousClass130.BEFORE_LIVE);
            }
            dismiss();
        }
    }
}
