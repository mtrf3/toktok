package Y;

import X.C145995oB;
import X.C35N;
import X.C43045Guv;
import X.C60903NvH;
import X.C78983UzD;
import X.FMX;
import X.G5K;
import X.G72;
import X.InterfaceC30795C6t;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.util.HashMap;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACListenerS15S1300000_7 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS15S1300000_7 aCListenerS15S1300000_7, View view) {
        G5K g5k = (G5K) aCListenerS15S1300000_7.l1;
        String str = aCListenerS15S1300000_7.s0;
        InterfaceC30795C6t interfaceC30795C6t = (InterfaceC30795C6t) aCListenerS15S1300000_7.l2;
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) aCListenerS15S1300000_7.l3;
        if (g5k.LIZLLL != null) {
            g5k.LIZIZ.setEnable(false);
            g5k.LIZLLL(str, false);
            g5k.LIZJ(interfaceC30795C6t);
            g5k.LIZLLL.LIZ(g5k.LJFF, g5k.LIZ, null, new IDDListenerS102S0200000_7(g5k, onDismissListener, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS15S1300000_7 r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS15S1300000_7.onClick$1(Y.ACListenerS15S1300000_7, android.view.View):void");
    }

    public static final void onClick$2(ACListenerS15S1300000_7 aCListenerS15S1300000_7, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        BaseShortVideoContext baseShortVideoContext = (BaseShortVideoContext) aCListenerS15S1300000_7.l1;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        boolean LJJJJJL = C78983UzD.LJJJJJL((VideoPublishEditModel) baseShortVideoContext);
        if (((CommonSettingItemStatus) aCListenerS15S1300000_7.l2)._isDisabled && LJJJJJL) {
            C43045Guv.LIZLLL(new AqS157S0100000_7(view, 262), 0L);
            return;
        }
        C60903NvH.LJIIJJI().LJJIL().setStitchSettingChanged(true);
        AVPreferences LJJIL = C60903NvH.LJIIJJI().LJJIL();
        Boolean value = ((CommonSettingItemStatus) aCListenerS15S1300000_7.l2)._checked.getValue();
        Boolean bool = Boolean.TRUE;
        LJJIL.setStitchSettingCurrent(o.LJ(value, bool) ? 1 : 0);
        MutableLiveData<Boolean> mutableLiveData = ((CommonSettingItemStatus) aCListenerS15S1300000_7.l2)._checked;
        mutableLiveData.setValue(Boolean.valueOf(true ^ o.LJ(mutableLiveData.getValue(), bool)));
        if (view instanceof C35N) {
            C43045Guv.LIZLLL(new AqS154S0200000_7(view, (CommonSettingItemStatus) aCListenerS15S1300000_7.l2, 38), 0L);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", aCListenerS15S1300000_7.s0);
        c145995oB.LJI("enter_from", "video_post_page");
        if (o.LJ(((CommonSettingItemStatus) aCListenerS15S1300000_7.l2)._checked.getValue(), bool)) {
            str = "on";
        } else {
            str = "off";
        }
        c145995oB.LJI("to_status", str);
        HashMap hashMap = (HashMap) aCListenerS15S1300000_7.l3;
        Object obj = null;
        if (hashMap != null) {
            str2 = (String) hashMap.get("content_type");
        } else {
            str2 = null;
        }
        c145995oB.LJI("content_type", str2);
        HashMap hashMap2 = (HashMap) aCListenerS15S1300000_7.l3;
        if (hashMap2 != null) {
            str3 = (String) hashMap2.get("content_source");
        } else {
            str3 = null;
        }
        c145995oB.LJI("content_source", str3);
        HashMap hashMap3 = (HashMap) aCListenerS15S1300000_7.l3;
        if (hashMap3 != null) {
            str4 = (String) hashMap3.get("shoot_way");
        } else {
            str4 = null;
        }
        c145995oB.LJI("shoot_way", str4);
        BaseShortVideoContext baseShortVideoContext2 = (BaseShortVideoContext) aCListenerS15S1300000_7.l1;
        if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && ((VideoPublishEditModel) baseShortVideoContext2).isStitchMode()) {
            StitchParams stitchParams = ((VideoPublishEditModel) ((BaseShortVideoContext) aCListenerS15S1300000_7.l1)).stitchParams;
            if (stitchParams != null) {
                i = stitchParams.getStitchVideoDuration();
            }
            c145995oB.LIZJ(obj, "stitch_video_duration");
            c145995oB.LIZ(((BaseShortVideoContext) aCListenerS15S1300000_7.l1).getVideoLength(), "creation_duration");
            FMX.LJIIL("click_stitch_control", c145995oB.LIZ);
        }
        i = 0;
        obj = Integer.valueOf(i);
        c145995oB.LIZJ(obj, "stitch_video_duration");
        c145995oB.LIZ(((BaseShortVideoContext) aCListenerS15S1300000_7.l1).getVideoLength(), "creation_duration");
        FMX.LJIIL("click_stitch_control", c145995oB.LIZ);
    }

    public ACListenerS15S1300000_7(G5K g5k, G72 g72, IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, int i) {
        this.$t = i;
        this.l1 = g5k;
        this.s0 = "video_post_page";
        this.l2 = g72;
        this.l3 = iDDListenerS146S0100000_7;
    }

    public ACListenerS15S1300000_7(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
