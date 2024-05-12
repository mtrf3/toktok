package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.google.android.play.core.appupdate.u;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.9oY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC248149oY extends DialogC254049y4 implements InterfaceC72822Si2 {
    public boolean LJLJI;
    public boolean LJLJJI;
    public final C248089oS LJLJJL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing()) {
            if (this.LJLJJI) {
                C72818Shy.LJII("referral_popup_closed", this);
                C72818Shy.LJII("referral_popup_present_page", this);
                C72818Shy.LJII("referral_popup_click", this);
                C72818Shy.LJII("referral_popup_resource_load_failed", this);
            }
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
            if (!o.LJ(LJJIJIL, String.valueOf(30))) {
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

    public DialogC248149oY(Activity activity, C248089oS c248089oS) {
        super(activity);
        this.LJLJJL = c248089oS;
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_closed", this, uuid);
        String uuid2 = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid2, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_present_page", this, uuid2);
        String uuid3 = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid3, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_click", this, uuid3);
        String uuid4 = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid4, "UUID.randomUUID().toString()");
        C72818Shy.LJFF("referral_popup_resource_load_failed", this, uuid4);
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setLayoutParams(layoutParams);
        setContentView(frameLayout);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        AbstractC60800Ntc abstractC60800Ntc = new AbstractC60800Ntc() { // from class: X.9ob
            @Override // X.AbstractC60673NrZ
            public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(url, "url");
            }

            @Override // X.AbstractC60673NrZ
            public final void LJJJJJ(InterfaceC60761Nsz view) {
                InterfaceC248189oc interfaceC248189oc;
                o.LJIIIZ(view, "view");
                DialogC248149oY dialogC248149oY = DialogC248149oY.this;
                if (!dialogC248149oY.LJLJI && (interfaceC248189oc = dialogC248149oY.LJLJJL.LIZIZ) != null) {
                    interfaceC248189oc.LIZ();
                }
            }

            @Override // X.AbstractC60673NrZ
            public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(url, "url");
                DialogC248149oY dialogC248149oY = DialogC248149oY.this;
                dialogC248149oY.LJLJI = true;
                InterfaceC248189oc interfaceC248189oc = dialogC248149oY.LJLJJL.LIZIZ;
                if (interfaceC248189oc != null) {
                    interfaceC248189oc.LIZJ(c60704Ns4.LIZIZ);
                }
            }
        };
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(c248089oS.LIZ);
        sparkContext.LJIL(abstractC60800Ntc);
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(activity, sparkContext));
        LIZ.setLayoutParams(layoutParams);
        frameLayout.addView(LIZ);
        LIZ.LIZIZ();
    }
}
