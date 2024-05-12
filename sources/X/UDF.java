package X;

import Y.IDCListenerS164S0100000_13;
import Y.IDCListenerS287S0100000_13;
import android.app.Activity;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDF extends AbstractC61106NyY {
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ DataChannel LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.AbstractC61106NyY
    public final void LIZ(C61101NyT c61101NyT, String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        Activity activity = this.LIZIZ;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.keh);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_bl…uthorization_popup_title)");
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.keg);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_bl…authorization_popup_desc)");
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.kef);
        o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_bl…authorization_popup_btn2)");
        String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.kee);
        o.LJIIIIZZ(LJIILJJIL4, "getString(R.string.pm_bl…authorization_popup_btn1)");
        UDG udg = new UDG(c61101NyT, this.LIZLLL);
        C77437UaH c77437UaH = new C77437UaH(activity);
        c77437UaH.LIZJ = LJIILJJIL;
        c77437UaH.LJI = LJIILJJIL2;
        c77437UaH.LJFF(new IDCListenerS164S0100000_13(udg, 8), LJIILJJIL3, false);
        c77437UaH.LIZLLL(UDH.LJLIL, LJIILJJIL4, false);
        c77437UaH.LJJIIZ = UDI.LJLIL;
        c77437UaH.LJJII = false;
        c77437UaH.LJJIIZI = new IDCListenerS287S0100000_13(udg, 0);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-8470801384235646992")).LIZ) {
            LIZ.show();
        }
        DataChannel dataChannel = this.LIZJ;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_nearby_devices_popup_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ("video_live", "live_type");
        LIZ2.LJIJJ("multi_guest", "toast_type");
        LIZ2.LJJIIJZLJL();
    }

    public UDF(Activity activity, DataChannel dataChannel, AqS160S0200000_13 aqS160S0200000_13) {
        this.LIZIZ = activity;
        this.LIZJ = dataChannel;
        this.LIZLLL = aqS160S0200000_13;
    }
}
