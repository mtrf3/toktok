package X;

import android.net.Uri;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKD implements InterfaceC31687Cc7 {
    public final /* synthetic */ OKJ LIZ;

    public OKD(OKJ okj) {
        this.LIZ = okj;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        ActivityC45651qj context;
        String str2;
        MutableLiveData<Boolean> mutableLiveData;
        String uid;
        A72 a72 = this.LIZ.LJLJI;
        if (a72 != null && (context = a72.getContext()) != null) {
            OKJ okj = this.LIZ;
            String str3 = "";
            String LIZJ = C31461Li.LIZJ("live_ba_leads_gen_schema", "", "getInstance().getStringV…chemaSetting::class.java)");
            if (LIZJ.length() == 0) {
                C78983UzD.LJIILL("Leads gen's schema is null before live");
                return;
            }
            Uri.Builder appendQueryParameter = UriProtector.parse(LIZJ).buildUpon().appendQueryParameter("room_id", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("enter_from", "before_live");
            User user = okj.LJLJLJ;
            if (user == null || (str2 = user.getUid()) == null) {
                str2 = "";
            }
            String builder = appendQueryParameter.appendQueryParameter("ba_uid", str2).toString();
            o.LJIIIIZZ(builder, "parse(schema).buildUpon(…              .toString()");
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(builder);
            sparkContext.LJJIIJ("container_bg_color", "00000000");
            c40342FsQ.getClass();
            C40342FsQ.LIZ(context, sparkContext).LIZIZ();
            int i = okj.LJLJJL.getInt("before_report_click_event_times", 0);
            User user2 = okj.LJLJLJ;
            if (user2 != null && (uid = user2.getUid()) != null) {
                str3 = uid;
            }
            NIJ.LIZIZ(i, !okj.LJLJLLL ? 1 : 0, CardStruct.IStatusCode.DEFAULT, str3, str);
            okj.LJLJJL.storeInt("before_report_click_event_times", i + 1);
            if (i != 0) {
                return;
            }
            okj.LJLJJL.storeInt("leads_gen_before_live_icon_display_times", 6);
            IIconSlot.SlotViewModel slotViewModel = okj.LJLJJI;
            if (slotViewModel == null || (mutableLiveData = slotViewModel.LJLJJL) == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.FALSE);
        }
    }
}
