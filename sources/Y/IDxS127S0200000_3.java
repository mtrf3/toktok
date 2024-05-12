package Y;

import X.C1DF;
import X.C201667vm;
import X.C201687vo;
import X.C201697vp;
import X.C2U8;
import X.C38333F2r;
import X.C5S1;
import X.C63081OpJ;
import X.C8JF;
import X.EF7;
import X.IWF;
import X.InterfaceC116954iR;
import X.InterfaceC46330IGg;
import X.InterfaceC92693kP;
import X.NQH;
import X.OUP;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDxS127S0200000_3 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$0(IDxS127S0200000_3 iDxS127S0200000_3) {
    }

    public static final void onComplete$1(IDxS127S0200000_3 iDxS127S0200000_3) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                onError$1(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public static final void onError$0(IDxS127S0200000_3 iDxS127S0200000_3, Throwable e) {
        String errorMsg;
        o.LJIIIZ(e, "e");
        if (e instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) e;
            if (TextUtils.isEmpty(c38333F2r.getErrorMsg())) {
                errorMsg = ((Context) iDxS127S0200000_3.l1).getString(R.string.imc);
            } else {
                errorMsg = c38333F2r.getErrorMsg();
            }
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(errorMsg);
            c5s1.LJ();
            Object rawResponse = c38333F2r.getRawResponse();
            o.LJII(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            String str = ((BaseResponse) rawResponse).extra.logid;
            o.LJIIIIZZ(str, "e.rawResponse as BaseResponse).extra.logid");
            Object rawResponse2 = c38333F2r.getRawResponse();
            o.LJII(rawResponse2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            CancelVideoMaskApi.LIZIZ(str, String.valueOf(((BaseResponse) rawResponse2).status_code));
            return;
        }
        C5S1 c5s12 = new C5S1(EF7.LIZIZ());
        c5s12.LIZJ(R.string.imc);
        c5s12.LJ();
        CancelVideoMaskApi.LIZ(1);
    }

    public static final void onError$1(IDxS127S0200000_3 iDxS127S0200000_3, Throwable e) {
        o.LJIIIZ(e, "e");
        String str = "";
        if (e instanceof C38333F2r) {
            MutableLiveData<String> mutableLiveData = ((PostModeContainerViewModel) iDxS127S0200000_3.l1).LLII;
            C38333F2r c38333F2r = (C38333F2r) e;
            String errorMsg = c38333F2r.getErrorMsg();
            if (errorMsg != null) {
                str = errorMsg;
            }
            mutableLiveData.setValue(str);
            Object rawResponse = c38333F2r.getRawResponse();
            o.LJII(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            String str2 = ((BaseResponse) rawResponse).extra.logid;
            o.LJIIIIZZ(str2, "e.rawResponse as BaseResponse).extra.logid");
            Object rawResponse2 = c38333F2r.getRawResponse();
            o.LJII(rawResponse2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            CancelVideoMaskApi.LIZIZ(str2, String.valueOf(((BaseResponse) rawResponse2).status_code));
            return;
        }
        ((PostModeContainerViewModel) iDxS127S0200000_3.l1).LLII.setValue("");
        CancelVideoMaskApi.LIZ(1);
    }

    public static final void onNext$0(IDxS127S0200000_3 iDxS127S0200000_3, Object obj) {
        Aweme aweme;
        String str;
        boolean z;
        Audio audio;
        String str2;
        BaseResponse t = (BaseResponse) obj;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0) {
            ((ReportVideoMaskVM) iDxS127S0200000_3.l0).setState(C201687vo.LJLIL);
            VideoItemParams gv0 = ((ReportVideoMaskVM) iDxS127S0200000_3.l0).gv0();
            Video video = null;
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            if (aweme != null && aweme.isAd()) {
                if (C63081OpJ.LJLJI(aweme)) {
                    NQH LIZ = C201697vp.LIZ();
                    if (LIZ != null) {
                        LIZ.LJJJJLI();
                    }
                } else {
                    IWF.LJJLIIIIJ().LIZIZ();
                }
            } else {
                InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
                String LJJJJIZL = LJJLIIIIJ.LJJJJIZL();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (ujb.o.LJJJJIZL(LJJJJIZL, str, true)) {
                    if ((aweme != null && OUP.LJJIII(aweme)) || C1DF.LJJIII(aweme)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (aweme != null) {
                        video = aweme.getVideo();
                        audio = aweme.getAudio();
                    } else {
                        audio = null;
                    }
                    LJJLIIIIJ.LJIJI(video, audio, z, true);
                }
            }
            if (aweme == null || (str2 = aweme.getAid()) == null) {
                str2 = "";
            }
            C2U8.LIZ(new C8JF(false, str2, false));
            C2U8.LIZ(new C201667vm(false));
            CancelVideoMaskApi.LIZ(0);
            return;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = t.extra;
        if (serverTimeExtra == null) {
            return;
        }
        String str3 = serverTimeExtra.logid;
        o.LJIIIIZZ(str3, "t.extra.logid");
        CancelVideoMaskApi.LIZIZ(str3, String.valueOf(t.status_code));
    }

    public static final void onNext$1(IDxS127S0200000_3 iDxS127S0200000_3, Object obj) {
        BaseResponse t = (BaseResponse) obj;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0) {
            ((Aweme) iDxS127S0200000_3.l0).setReportMaskInfo(new VideoMaskInfo(null, null, null, null, null, null, null, null, null, 511, null));
            AwemeService.LIZ().R1((Aweme) iDxS127S0200000_3.l0);
            ((PostModeContainerViewModel) iDxS127S0200000_3.l1).LLI.setValue(new VideoMaskInfo(null, null, null, null, null, null, null, null, null, 511, null));
            C2U8.LIZ(new C201667vm(false));
            CancelVideoMaskApi.LIZ(0);
            return;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = t.extra;
        if (serverTimeExtra == null) {
            return;
        }
        String str = serverTimeExtra.logid;
        o.LJIIIIZZ(str, "t.extra.logid");
        CancelVideoMaskApi.LIZIZ(str, String.valueOf(t.status_code));
    }

    public IDxS127S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
