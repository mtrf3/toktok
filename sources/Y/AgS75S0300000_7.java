package Y;

import X.AbstractC44912Hjw;
import X.C10I;
import X.C10K;
import X.C1I0;
import X.C220858ld;
import X.C41306GJa;
import X.C41809Gaz;
import X.C43756HFg;
import X.C43758HFi;
import X.C44066HRe;
import X.C44913Hjx;
import X.C44927HkB;
import X.C76800UCe;
import X.C78996UzQ;
import X.C82544WaS;
import X.C85144XbI;
import X.EnumC44070HRi;
import X.GJZ;
import X.HG5;
import X.HG7;
import X.HGA;
import X.HGJ;
import X.HGN;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public class AgS75S0300000_7 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS75S0300000_7 agS75S0300000_7, C10K c10k) {
        if (!c10k.LJIILJJIL() && !c10k.LJIIL()) {
            OriginalSoundUploadService originalSoundUploadService = (OriginalSoundUploadService) agS75S0300000_7.l0;
            HGJ hgj = (HGJ) agS75S0300000_7.l1;
            HG5 hg5 = (HG5) agS75S0300000_7.l2;
            originalSoundUploadService.getClass();
            OriginalSoundUploadService.LIZJ(hgj, hg5);
        } else if (c10k.LJIILJJIL()) {
            if ((c10k.LJIIJ() instanceof IllegalStateException) && c10k.LJIIJ().getMessage() != null) {
                String message = c10k.LJIIJ().getMessage();
                o.LJI(message);
                if (ujb.o.LJJJLIIL(message, "file error", false)) {
                    OriginalSoundUploadService originalSoundUploadService2 = (OriginalSoundUploadService) agS75S0300000_7.l0;
                    HGJ hgj2 = (HGJ) agS75S0300000_7.l1;
                    HG5 hg52 = (HG5) agS75S0300000_7.l2;
                    originalSoundUploadService2.getClass();
                    OriginalSoundUploadService.LIZJ(hgj2, hg52);
                }
            }
            Exception LJIIJ = c10k.LJIIJ();
            o.LJIIIIZZ(LJIIJ, "it.error");
            throw LJIIJ;
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS75S0300000_7 agS75S0300000_7, C10K c10k) {
        Integer num;
        String str;
        ((GJZ) agS75S0300000_7.l0).LJLILLLLZI.LJIJ();
        if (!C82544WaS.LJ(c10k)) {
            ((GJZ) agS75S0300000_7.l0).LJLILLLLZI.LIZ(null, "");
            C85144XbI.LIZ(((GJZ) agS75S0300000_7.l0).LJLILLLLZI.getEnterFrom(), false);
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            AuthDeviceResponse.Data data = authDeviceResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            AuthDeviceResponse.Data data2 = authDeviceResponse.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            ((GJZ) agS75S0300000_7.l0).LJLILLLLZI.LIZ(num, str);
            C85144XbI.LIZ(((GJZ) agS75S0300000_7.l0).LJLILLLLZI.getEnterFrom(), false);
            return null;
        }
        ((GJZ) agS75S0300000_7.l0).LJLIL.remove((Device) agS75S0300000_7.l1);
        ((GJZ) agS75S0300000_7.l0).notifyItemRemoved(((C41306GJa) agS75S0300000_7.l2).getAdapterPosition());
        if (((GJZ) agS75S0300000_7.l0).LJLIL.isEmpty()) {
            ((GJZ) agS75S0300000_7.l0).LJLILLLLZI.LIZIZ();
        }
        C85144XbI.LIZ(((GJZ) agS75S0300000_7.l0).LJLILLLLZI.getEnterFrom(), true);
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS75S0300000_7 agS75S0300000_7, C10K c10k) {
        C44066HRe c44066HRe = (C44066HRe) agS75S0300000_7.l0;
        Activity activity = (Activity) agS75S0300000_7.l1;
        Aweme aweme = (Aweme) agS75S0300000_7.l2;
        c44066HRe.getClass();
        if (c10k.LJIILJJIL() || c10k.LJIIL()) {
            String string = activity.getResources().getString(R.string.imh);
            if (c44066HRe.LJIIJJI != null) {
                c44066HRe.LJIIIIZZ(string, EnumC44070HRi.SERVER_CHECK_DENY);
                c44066HRe.LIZ();
                c44066HRe.LJIIL.onFailed();
            }
        } else if (!((CheckDuetReactPermissionResponse) c10k.LJIIJJI()).allowCurrent) {
            String str = ((CheckDuetReactPermissionResponse) c10k.LJIIJJI()).reason;
            if (TextUtils.isEmpty(str)) {
                str = activity.getResources().getString(R.string.bkg);
            }
            IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
            if (aweme.getVideo().getVideoLength() > shortVideoConfig.maxConsumerDuetOrStitchVideoTime() || (C78996UzQ.LJJIIZI(aweme) && aweme.getVideo().getVideoLength() > shortVideoConfig.extendedDuetOrStitchTime())) {
                str = shortVideoConfig.getErrorHintWhenDisableDuetOrStitch(1);
            }
            if (c44066HRe.LJIIJJI != null) {
                c44066HRe.LJIIIIZZ(str, EnumC44070HRi.SERVER_CHECK_DENY);
                c44066HRe.LIZ();
                c44066HRe.LJIIL.onFailed();
            }
        } else if (!C220858ld.LIZ(c44066HRe.LJIILL)) {
            C10K.LIZJ(new ACallableS110S0100000_7(c44066HRe, 31)).LJ(new AgS124S0100000_7(c44066HRe, 20), C10K.LJIIIIZZ, null);
        } else {
            c44066HRe.LJIIIZ();
        }
        return null;
    }

    public static final Object then$3(AgS75S0300000_7 agS75S0300000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            return C10K.LJIIIIZZ(c10k.LJIIJ());
        }
        C43756HFg c43756HFg = (C43756HFg) agS75S0300000_7.l0;
        HG7 hg7 = (HG7) agS75S0300000_7.l1;
        VideoPublishEditModel videoPublishEditModel = ((C41809Gaz) agS75S0300000_7.l2).LJFF;
        if (videoPublishEditModel != null) {
            c43756HFg.getClass();
            n nVar = new n();
            C10K.LIZ(new ACallableS56S0300000_7(videoPublishEditModel, hg7, nVar, 10));
            return nVar.LIZ;
        }
        o.LJIJI("editModel");
        throw null;
    }

    public static final Object then$4(AgS75S0300000_7 agS75S0300000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            return C10K.LJIIIIZZ(c10k.LJIIJ());
        }
        C43756HFg c43756HFg = (C43756HFg) agS75S0300000_7.l0;
        HG7 hg7 = (HG7) agS75S0300000_7.l1;
        VideoPublishEditModel videoPublishEditModel = ((C41809Gaz) agS75S0300000_7.l2).LJFF;
        if (videoPublishEditModel != null) {
            c43756HFg.getClass();
            n nVar = new n();
            C10K.LIZ(new ACallableS56S0300000_7(hg7, videoPublishEditModel, nVar, 9));
            return nVar.LIZ;
        }
        o.LJIJI("editModel");
        throw null;
    }

    public static final Object then$5(AgS75S0300000_7 agS75S0300000_7, C10K c10k) {
        if (C82544WaS.LJ(c10k)) {
            C44927HkB.LIZ((Activity) agS75S0300000_7.l0, TokenCert.Companion.with("bpea-request_download_aweme_storage_permission"), new AqS96S0300000_7((Activity) agS75S0300000_7.l0, (AbstractC44912Hjw) agS75S0300000_7.l1, (C44913Hjx) agS75S0300000_7.l2, 27));
            return null;
        }
        return null;
    }

    public static final Object then$6(AgS75S0300000_7 agS75S0300000_7, C10K c10k) {
        VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) agS75S0300000_7.l0;
        HGN hgn = (HGN) agS75S0300000_7.l1;
        C43758HFi c43758HFi = (C43758HFi) agS75S0300000_7.l2;
        videoFramesUploadService.getClass();
        if (c10k.LJIILJJIL()) {
            C1I0.LIZIZ().LIZLLL("extract_frame", c10k.LJIIJ());
            return null;
        }
        Iterator it = ((ArrayList) hgn.LIZ).iterator();
        while (it.hasNext()) {
            VideoFramesUploadService.LIZ((HGA) it.next(), c43758HFi);
        }
        return null;
    }

    public AgS75S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
