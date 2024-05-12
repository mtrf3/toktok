package Y;

import X.ActivityC45651qj;
import X.C188727au;
import X.C26227ARb;
import X.C35N;
import X.C41306GJa;
import X.C41453GOr;
import X.C41459GOx;
import X.C42738Gpy;
import X.C42739Gpz;
import X.C78915Uy7;
import X.C85144XbI;
import X.FMX;
import X.G9D;
import X.GJZ;
import X.H7R;
import X.InterfaceC42726Gpm;
import X.ORY;
import X.UC0;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACListenerS33S0300000_7 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS33S0300000_7 aCListenerS33S0300000_7, View view) {
        int i;
        ActivityC45651qj mo49getActivity = ((Fragment) aCListenerS33S0300000_7.l0).mo49getActivity();
        boolean LIZIZ = C41453GOr.LIZIZ((VideoPublishEditModel) aCListenerS33S0300000_7.l1);
        CommerceToolsTcmModel commerceToolsTcmModel = (CommerceToolsTcmModel) aCListenerS33S0300000_7.l2;
        boolean LIZ = C41453GOr.LIZ((VideoPublishEditModel) aCListenerS33S0300000_7.l1);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS33S0300000_7.l1;
        if (videoPublishEditModel != null) {
            i = H7R.LJI(videoPublishEditModel);
        } else {
            i = -1;
        }
        C41459GOx.LIZ(mo49getActivity, LIZIZ, commerceToolsTcmModel, LIZ, "edit", i);
        FMX.onEventV3("ttcm_edit_page_click_disclosure");
    }

    public static final void onClick$1(ACListenerS33S0300000_7 aCListenerS33S0300000_7, View view) {
        int i;
        String str;
        int i2;
        MutableLiveData<Boolean> mutableLiveData = ((CommonSettingItemStatus) aCListenerS33S0300000_7.l0)._checked;
        Boolean value = mutableLiveData.getValue();
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(Boolean.valueOf(!o.LJ(value, bool)));
        if (view instanceof C35N) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            Boolean value2 = ((CommonSettingItemStatus) aCListenerS33S0300000_7.l0)._checked.getValue();
            if (value2 != null) {
                if (value2.booleanValue()) {
                    i2 = R.string.p7j;
                } else {
                    i2 = R.string.p7g;
                }
                creativeToastBuilder.messageRes(i2);
                C78915Uy7.LJJIJ(view, 2026, creativeToastBuilder);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        BaseShortVideoContext baseShortVideoContext = (BaseShortVideoContext) aCListenerS33S0300000_7.l1;
        if (o.LJ(((CommonSettingItemStatus) aCListenerS33S0300000_7.l0)._checked.getValue(), bool)) {
            i = 0;
        } else {
            i = 3;
        }
        baseShortVideoContext.commentSetting = i;
        int i3 = ((BaseShortVideoContext) aCListenerS33S0300000_7.l1).commentSetting;
        if (ORY.LJJIJIIJIL(Integer.valueOf(i3), new Integer[]{0, 3})) {
            G9D.LIZIZ = i3;
            G9D.LIZ.storeInt("privacy_setting_comment", i3);
        }
        HashMap hashMap = (HashMap) aCListenerS33S0300000_7.l2;
        if (hashMap == null) {
            return;
        }
        if (o.LJ(((CommonSettingItemStatus) aCListenerS33S0300000_7.l0)._checked.getValue(), bool)) {
            str = "off";
        } else {
            str = "on";
        }
        hashMap.put("to_status", str);
        FMX.LJIIL("disable_comment", (HashMap) aCListenerS33S0300000_7.l2);
    }

    public static final void onClick$2(ACListenerS33S0300000_7 aCListenerS33S0300000_7, View view) {
        ((C42739Gpz) aCListenerS33S0300000_7.l0).LJLJJI.setChecked(true);
        LiveEventModule liveEventModule = (LiveEventModule) aCListenerS33S0300000_7.l1;
        liveEventModule.LIZ = true;
        InterfaceC42726Gpm interfaceC42726Gpm = ((C42738Gpy) aCListenerS33S0300000_7.l2).LIZIZ;
        if (interfaceC42726Gpm != null) {
            interfaceC42726Gpm.LJJJIL(liveEventModule);
        }
    }

    public static final void onClick$3(ACListenerS33S0300000_7 aCListenerS33S0300000_7, View view) {
        String enterFrom = ((GJZ) aCListenerS33S0300000_7.l0).LJLILLLLZI.getEnterFrom();
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LJFF = C85144XbI.LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("authorized_logins_click", LJFF.LIZ);
        Context context = ((C41306GJa) aCListenerS33S0300000_7.l1).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C26227ARb c26227ARb = new C26227ARb(context);
        Context context2 = ((C41306GJa) aCListenerS33S0300000_7.l1).itemView.getContext();
        Object[] objArr = new Object[1];
        String device_name = ((Device) aCListenerS33S0300000_7.l2).getDevice_name();
        if (device_name == null) {
            device_name = "";
        }
        objArr[0] = device_name;
        c26227ARb.LIZIZ(context2.getString(R.string.q18, objArr));
        UC0.LIZJ(c26227ARb, new AqS111S0300000_7((C41306GJa) aCListenerS33S0300000_7.l1, (GJZ) aCListenerS33S0300000_7.l0, (Device) aCListenerS33S0300000_7.l2, 13));
        c26227ARb.LJI().LIZLLL();
    }

    public ACListenerS33S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
