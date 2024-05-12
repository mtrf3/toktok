package Y;

import X.ARV;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C62011OVj;
import X.C62016OVo;
import X.C62387Oe7;
import X.C62468OfQ;
import X.C62876Om0;
import X.C81239VuV;
import X.EF7;
import X.InterfaceC28729BPh;
import X.InterfaceC62474OfW;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.campaign.ShareCampaignFragment;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class IDDListenerS104S0200000_10 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS104S0200000_10 iDDListenerS104S0200000_10, DialogInterface dialogInterface) {
        InterfaceC62474OfW interfaceC62474OfW;
        C62387Oe7 c62387Oe7 = ((ShareCampaignFragment) iDDListenerS104S0200000_10.l0).LJLJI;
        if (c62387Oe7 != null) {
            BaseSharePackage baseSharePackage = c62387Oe7.LJIIJ;
            if (baseSharePackage != null && (interfaceC62474OfW = c62387Oe7.LJIILIIL) != null) {
                interfaceC62474OfW.LJ((ActivityC45651qj) iDDListenerS104S0200000_10.l1, baseSharePackage);
            }
            ShareCampaignFragment shareCampaignFragment = (ShareCampaignFragment) iDDListenerS104S0200000_10.l0;
            C62468OfQ.LIZIZ(shareCampaignFragment.LJLJJLL, shareCampaignFragment.LJLJI);
        }
    }

    public static final void onDismiss$1(IDDListenerS104S0200000_10 iDDListenerS104S0200000_10, DialogInterface dialogInterface) {
        boolean isChecked = ((ARV) iDDListenerS104S0200000_10.l0).isChecked();
        int progress = ((C81239VuV) iDDListenerS104S0200000_10.l1).getProgress();
        C62016OVo.LIZ().storeBoolean("keva_key_enable_double_tap_pause_video", isChecked);
        C62016OVo.LIZ().storeInt("keva_key_wallpaper_sound_slider_progress", progress);
        if (C62011OVj.LJI()) {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enablePauseVideo", isChecked);
            jSONObject.put("soundProgress", progress);
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …ess)\n        }.toString()");
            bundle.putString("wallpaper_preferences", jSONObject2);
            try {
                EF7.LIZIZ().getContentResolver().call(InterfaceC28729BPh.LIZIZ, "update_preferences", "", bundle);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        Context LIZIZ = EF7.LIZIZ();
        if (C62011OVj.LJFF(LIZIZ, LIZIZ.getPackageName())) {
            Intent intent = new Intent();
            intent.setClass(LIZIZ, AmeLiveWallpaper.class);
            intent.putExtra("action", "action_update_volume");
            C16880lQ.LLLL(LIZIZ, intent);
        }
    }

    public static final void onDismiss$2(IDDListenerS104S0200000_10 iDDListenerS104S0200000_10, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS104S0200000_10.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C62876Om0) iDDListenerS104S0200000_10.l1).LJI.reset();
    }

    public static final void onDismiss$3(IDDListenerS104S0200000_10 iDDListenerS104S0200000_10, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS104S0200000_10.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C62876Om0) iDDListenerS104S0200000_10.l1).LJI.reset();
    }

    public IDDListenerS104S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
