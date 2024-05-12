package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.google.android.play.core.appupdate.u;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.9oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC248159oZ extends DialogC254049y4 implements InterfaceC72822Si2 {
    public boolean LJLJI;
    public final Activity LJLJJI;
    public final C248089oS LJLJJL;

    public final void LIZ() {
        C248019oL c248019oL = (C248019oL) C95J.LIZ(4);
        if (c248019oL != null && c248019oL.LIZIZ()) {
            Activity activity = this.LJLJJI;
            o.LJIIIZ(activity, "activity");
            if (!activity.isFinishing() && !isShowing()) {
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/touchpoint/ui/popup/ResizableDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-774386526686604557")).LIZ) {
                    show();
                }
                InterfaceC248189oc interfaceC248189oc = this.LJLJJL.LIZIZ;
                if (interfaceC248189oc != null) {
                    interfaceC248189oc.onShow();
                }
                String decode = URLDecoder.decode(this.LJLJJL.LIZJ, "UTF-8");
                o.LJIIIIZZ(decode, "URLDecoder.decode(config.actionLink, \"UTF-8\")");
                C247779nx.LIZ(decode, "dialog");
            }
            InterfaceC248189oc interfaceC248189oc2 = this.LJLJJL.LIZIZ;
            if (interfaceC248189oc2 != null) {
                interfaceC248189oc2.LIZ();
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing()) {
            C72818Shy.LJII("referral_popup_show", this);
            C72818Shy.LJII("referral_popup_closed", this);
            C72818Shy.LJII("referral_popup_present_page", this);
            C72818Shy.LJII("referral_popup_click", this);
            C72818Shy.LJII("referral_popup_resource_load_failed", this);
            InterfaceC248189oc interfaceC248189oc = this.LJLJJL.LIZIZ;
            if (interfaceC248189oc != null) {
                interfaceC248189oc.onDismiss();
            }
            super.dismiss();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.8f);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String LJJIJIL;
        String LJJIJIL2;
        String LJJIJIL3;
        String LJJIJIL4;
        InterfaceC248189oc interfaceC248189oc;
        String LJJIJIL5;
        String str;
        String str2 = null;
        try {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            String str3 = "";
            if (interfaceC78280Uns == null) {
                LJJIJIL = null;
            } else {
                LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "touchpointId", "");
            }
            if (!o.LJ(LJJIJIL, String.valueOf(4))) {
                return;
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str = abstractC247499nV.LJIIJ();
                } else {
                    str = null;
                }
                linkedHashMap.put("region", str);
                linkedHashMap.put("event", c199097rd.LJLIL);
                interfaceC247459nR.LIZIZ("lynx_dialog_event", linkedHashMap);
            }
            if (o.LJ("referral_popup_closed", c199097rd.LJLIL)) {
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null && (LJJIJIL5 = u.LJJIJIL(interfaceC78280Uns2, "type", "")) != null) {
                    str3 = LJJIJIL5;
                }
                if (o.LJ(str3, "close") && (interfaceC248189oc = this.LJLJJL.LIZIZ) != null) {
                    interfaceC248189oc.LIZIZ();
                }
                dismiss();
                return;
            }
            if (o.LJ("referral_popup_present_page", c199097rd.LJLIL)) {
                InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns3 != null && (LJJIJIL4 = u.LJJIJIL(interfaceC78280Uns3, "url", "")) != null) {
                    str3 = LJJIJIL4;
                }
                if (str3.length() > 0) {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    C250729si.LIZ(context, str3, "sparkDialog", null, false);
                    return;
                }
                return;
            }
            if (o.LJ("referral_popup_show", c199097rd.LJLIL)) {
                if (!this.LJLJJL.LIZLLL) {
                    LIZ();
                    return;
                }
                return;
            }
            if (o.LJ("referral_popup_click", c199097rd.LJLIL)) {
                InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns4 != null && (LJJIJIL3 = u.LJJIJIL(interfaceC78280Uns4, "type", "")) != null) {
                    str3 = LJJIJIL3;
                }
                InterfaceC248189oc interfaceC248189oc2 = this.LJLJJL.LIZIZ;
                if (interfaceC248189oc2 != null) {
                    interfaceC248189oc2.onClick(str3);
                    return;
                }
                return;
            }
            if (o.LJ("referral_popup_resource_load_failed", c199097rd.LJLIL)) {
                InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns5 != null && (LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns5, "error_msg", "")) != null) {
                    str3 = LJJIJIL2;
                }
                InterfaceC248189oc interfaceC248189oc3 = this.LJLJJL.LIZIZ;
                if (interfaceC248189oc3 != null) {
                    interfaceC248189oc3.LIZJ(str3);
                }
            }
        } catch (Exception e) {
            InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
            if (interfaceC247459nR2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV2 != null) {
                    str2 = abstractC247499nV2.LJIIJ();
                }
                linkedHashMap2.put("region", str2);
                linkedHashMap2.put("event", e.toString());
                interfaceC247459nR2.LIZIZ("lynx_dialog_event", linkedHashMap2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC248159oZ(Activity mActivity, C248089oS c248089oS) {
        super(mActivity);
        o.LJIIIZ(mActivity, "mActivity");
        this.LJLJJI = mActivity;
        this.LJLJJL = c248089oS;
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_show", this, uuid);
        String uuid2 = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid2, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_closed", this, uuid2);
        String uuid3 = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid3, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_present_page", this, uuid3);
        String uuid4 = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid4, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_click", this, uuid4);
        String uuid5 = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid5, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_resource_load_failed", this, uuid5);
        FrameLayout frameLayout = new FrameLayout(mActivity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setLayoutParams(layoutParams);
        setContentView(frameLayout);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        AbstractC60800Ntc abstractC60800Ntc = new AbstractC60800Ntc() { // from class: X.9oa
            @Override // X.AbstractC60673NrZ
            public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(url, "url");
            }

            @Override // X.AbstractC60673NrZ
            public final void LJJJJJ(InterfaceC60761Nsz view) {
                o.LJIIIZ(view, "view");
                DialogC248159oZ dialogC248159oZ = DialogC248159oZ.this;
                if (!dialogC248159oZ.LJLJI && dialogC248159oZ.LJLJJL.LIZLLL) {
                    dialogC248159oZ.LIZ();
                }
            }

            @Override // X.AbstractC60673NrZ
            public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(url, "url");
                DialogC248159oZ dialogC248159oZ = DialogC248159oZ.this;
                dialogC248159oZ.LJLJI = true;
                InterfaceC248189oc interfaceC248189oc = dialogC248159oZ.LJLJJL.LIZIZ;
                if (interfaceC248189oc != null) {
                    interfaceC248189oc.LIZJ(c60704Ns4.LIZIZ);
                }
                DialogC248159oZ.this.dismiss();
            }
        };
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(c248089oS.LIZ);
        sparkContext.LJIL(abstractC60800Ntc);
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(mActivity, sparkContext));
        LIZ.setLayoutParams(layoutParams);
        frameLayout.addView(LIZ);
        LIZ.LIZIZ();
    }
}
