package Y;

import X.C34G;
import X.FMX;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.GPSPermissionCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public class IDCListenerS157S0100000_3 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS157S0100000_3(Aweme aweme, int i) {
        this.$t = i;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.l0 = aweme;
                return;
            case 3:
            default:
                this.l0 = aweme;
                return;
        }
    }

    public IDCListenerS157S0100000_3(GPSPermissionCell gPSPermissionCell, int i) {
        this.$t = i;
        this.l0 = gPSPermissionCell;
    }

    public static final void onClick$0(IDCListenerS157S0100000_3 iDCListenerS157S0100000_3, DialogInterface dialogInterface, int i) {
        C34G.LIZJ("system_location_setting_off_result", "click_gps_never", 1, new AqS169S0100000_3((GPSPermissionCell) iDCListenerS157S0100000_3.l0, 99));
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    public static final void onClick$1(IDCListenerS157S0100000_3 iDCListenerS157S0100000_3, DialogInterface dialogInterface, int i) {
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(((Aweme) iDCListenerS157S0100000_3.l0).getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$2(IDCListenerS157S0100000_3 iDCListenerS157S0100000_3, DialogInterface dialogInterface, int i) {
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(((Aweme) iDCListenerS157S0100000_3.l0).getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$3(IDCListenerS157S0100000_3 iDCListenerS157S0100000_3, DialogInterface dialogInterface, int i) {
        Aweme aweme = (Aweme) iDCListenerS157S0100000_3.l0;
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(aweme.getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$4(IDCListenerS157S0100000_3 iDCListenerS157S0100000_3, DialogInterface dialogInterface, int i) {
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(((Aweme) iDCListenerS157S0100000_3.l0).getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$5(IDCListenerS157S0100000_3 iDCListenerS157S0100000_3, DialogInterface dialogInterface, int i) {
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(((Aweme) iDCListenerS157S0100000_3.l0).getAid());
        FMX.onEvent(mobClick);
    }
}
