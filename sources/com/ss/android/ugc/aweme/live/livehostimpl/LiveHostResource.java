package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC61537ODd;
import X.C0NB;
import X.C110154Tz;
import X.C113554cx;
import X.C118824lS;
import X.C31061Ju;
import X.C38943FQd;
import X.C47261Igj;
import X.C49616Jdc;
import X.C4VN;
import X.C51029K0z;
import X.C59895Nf1;
import X.C61467OAl;
import X.C61520OCm;
import X.C61532OCy;
import X.C61550ODq;
import X.C61878OQg;
import X.C70657RoD;
import X.C76800UCe;
import X.C78920UyC;
import X.EBC;
import X.InterfaceC88472Yns;
import X.LFH;
import X.O3E;
import X.OC6;
import X.OF3;
import X.OF4;
import X.OIB;
import X.OSZ;
import X.UYR;
import X.X1D;
import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoBaseUrlSetting;
import com.bytedance.android.livesdk.livesetting.model.GeckoLiveGroupOpt;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLiveOpt;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LiveHostResource implements IHostResource {
    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final Map<String, String> eg0() {
        return C113554cx.LJJL(new OSZ("regular", UYR.LIZ(1, true)), new OSZ("medium", UYR.LIZ(2, true)), new OSZ("bold", UYR.LIZ(3, true)));
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final Map<String, String> xv() {
        return C113554cx.LJJL(new OSZ("regular", UYR.LIZ(1, false)), new OSZ("medium", UYR.LIZ(2, false)), new OSZ("bold", UYR.LIZ(3, false)));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final Map<String, Integer> Ql0() {
        HashMap hashMap = new HashMap();
        C59895Nf1.LIZJ(R.raw.icon_2pt_video_quality_360_stroke, hashMap, "liveIconVideQuality360Stroke", R.raw.icon_2pt_video_quality_540_stroke, "liveIconVideQuality540Stroke", R.raw.icon_2pt_video_quality_720_stroke, "liveIconVideQuality720Stroke", R.raw.icon_2pt_video_quality_1080_stroke, "liveIconVideQuality1080Stroke");
        hashMap.put("liveIconVideQualityAutoStroke", Integer.valueOf(R.raw.icon_2pt_video_quality_auto_stroke));
        hashMap.put("liveIconVideQualityOriginStroke", Integer.valueOf(R.raw.icon_2pt_video_quality_origin_stroke));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String d1() {
        return LFH.LIZIZ.LIZLLL().LJIILLIIL().LJJII();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String getAccessKey() {
        OIB oib = OF4.LIZ;
        if (oib != null) {
            return oib.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void l60() {
        C61550ODq c61550ODq;
        if (OF4.LIZJ) {
            return;
        }
        if (OF4.LIZLLL == null) {
            if (OF4.LJFF <= 0 || OF4.LIZIZ) {
                return;
            }
            OF4.LIZLLL();
            OF4.LJFF--;
            return;
        }
        List<String> list = OF4.LJ;
        if (list == null || list.isEmpty() || (c61550ODq = OF4.LIZLLL) == null || !c61550ODq.LIZIZ.get()) {
            return;
        }
        if (c61550ODq.LIZIZ.compareAndSet(true, false)) {
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = c61550ODq.LIZ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            }
            ARunnableS29S0200000_10 aRunnableS29S0200000_10 = c61550ODq.LIZLLL;
            if (aRunnableS29S0200000_10 != null) {
                ((Handler) c61550ODq.LJ.getValue()).removeCallbacks(aRunnableS29S0200000_10);
                c61550ODq.LIZLLL = null;
            }
        }
        C78920UyC.LJI("livesdk_gecko_resource_download_status_change", "continue", "action_type");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final GeckoLiveGroupOpt uF() {
        GeckoLiveOpt geckoLiveOpt = (GeckoLiveOpt) OF3.LIZ.getValue();
        if (geckoLiveOpt != null && geckoLiveOpt.isEnable) {
            GeckoLiveGroupOpt geckoLiveGroupOpt = new GeckoLiveGroupOpt();
            geckoLiveGroupOpt.isEnable = geckoLiveOpt.isEnable;
            geckoLiveGroupOpt.strategy = geckoLiveOpt.strategy;
            List<String> list = geckoLiveOpt.channelList;
            o.LJIIIZ(list, "<set-?>");
            geckoLiveGroupOpt.channelList = list;
            geckoLiveGroupOpt.retryTime = geckoLiveOpt.retryTime;
            geckoLiveGroupOpt.isPause = geckoLiveOpt.isPause;
            return geckoLiveGroupOpt;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean xi() {
        return LFH.LIZIZ.LIZLLL().LJIILLIIL().LJJIJIIJI();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean Sz() {
        C4VN.LIZ();
        return C110154Tz.LIZ(4);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String WK() {
        return C38943FQd.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final List<C31061Ju> vm() {
        C4VN.LIZ();
        List<ImSysEmojiModel> LIZIZ = C110154Tz.LIZIZ(4);
        ArrayList arrayList = new ArrayList();
        if (LIZIZ != null && (!LIZIZ.isEmpty())) {
            for (ImSysEmojiModel imSysEmojiModel : LIZIZ) {
                C31061Ju c31061Ju = new C31061Ju();
                c31061Ju.previewEmoji = imSysEmojiModel.getPreviewEmoji();
                List<String> emojiList = imSysEmojiModel.getEmojiList();
                if (emojiList == null) {
                    emojiList = new ArrayList<>();
                }
                c31061Ju.emojiList.addAll(emojiList);
                c31061Ju.miniSupportSysVersion = imSysEmojiModel.getMiniSupportSysVersion();
                c31061Ju.businessType = imSysEmojiModel.getBusinessType();
                arrayList.add(c31061Ju);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String yg() {
        String LIZIZ = C38943FQd.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getInstance().geckoHost");
        return LIZIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void mo0() {
        OF4.LIZLLL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean Br0(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            OF4.LIZJ();
            OIB oib = OF4.LIZ;
            if (oib != null) {
                str2 = oib.LIZJ;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C38943FQd.LIZLLL();
                return C70657RoD.LJ(str2, str);
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final GeckoXNetImpl Ct(Context context) {
        o.LJIIIZ(context, "context");
        return new GeckoXNetImpl();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final Typeface Hj(int i) {
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = 3;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        Typeface LIZJ = C49616Jdc.LIZIZ().LIZJ(i2);
        o.LJIIIIZZ(LIZJ, "getInstance().getTypeface(mappedTextStyle)");
        return LIZJ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void K00(String channel) {
        String str;
        o.LJIIIZ(channel, "channel");
        OIB oib = OF4.LIZ;
        if (oib != null && (str = oib.LIZJ) != null) {
            C61520OCm LIZ = O3E.LIZ(str);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            optionCheckUpdateParams.setLazyUpdate(true);
            Map<String, List<CheckRequestBodyModel.TargetChannel>> LJJIIZI = C51029K0z.LJJIIZI(new OSZ(str, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(channel))));
            if (LIZ != null) {
                LIZ.LIZ(null, LJJIIZI, optionCheckUpdateParams);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void Te0(String channel) {
        String str;
        o.LJIIIZ(channel, "channel");
        OIB oib = OF4.LIZ;
        if (oib != null && (str = oib.LIZJ) != null) {
            C61520OCm LIZ = O3E.LIZ(str);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            Map<String, List<CheckRequestBodyModel.TargetChannel>> LJJIIZI = C51029K0z.LJJIIZI(new OSZ(str, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(channel))));
            if (LIZ != null) {
                LIZ.LIZ(null, LJJIIZI, optionCheckUpdateParams);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean Ue(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            OF4.LIZJ();
            OIB oib = OF4.LIZ;
            if (oib != null) {
                str2 = oib.LIZJ;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C38943FQd.LIZLLL();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    C61532OCy c61532OCy = EBC.LIZ;
                    c61532OCy.LIZIZ();
                    File rootDirectory = c61532OCy.LJ.getRootDirectory();
                    if (rootDirectory.exists() && rootDirectory.isDirectory()) {
                        String LJJIIJ = C70657RoD.LJJIIJ(str);
                        try {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(File.separator);
                            LIZ.append(str2);
                            File file = new File(rootDirectory, X1D.LIZIZ(LIZ));
                            if (file.exists()) {
                                File file2 = new File(file.getAbsolutePath(), LJJIIJ);
                                if (file2.exists()) {
                                    return C61467OAl.LIZJ(file2);
                                }
                            }
                        } catch (Throwable th) {
                            OC6.LJ("gecko-debug-tag", "deleteChannel:error:", th);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void nr(boolean z) {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns;
        C61550ODq c61550ODq = OF4.LIZLLL;
        if (c61550ODq != null && !c61550ODq.LIZIZ.get()) {
            if (c61550ODq.LIZIZ.compareAndSet(false, true) && (interfaceC88472Yns = c61550ODq.LIZ) != null) {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
            C78920UyC.LJI("livesdk_gecko_resource_download_status_change", "pause", "action_type");
        }
        if (z || OF4.LIZJ) {
            OF4.LJFF = -1;
            OF4.LIZLLL = null;
            OF4.LIZIZ = false;
            OF4.LJI = 0L;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String oI(Context context) {
        String string;
        if (context == null || (string = context.getString(R.string.td_)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void FN(AbstractC61537ODd abstractC61537ODd, String channel) {
        String str;
        o.LJIIIZ(channel, "channel");
        OIB oib = OF4.LIZ;
        if (oib != null && (str = oib.LIZJ) != null) {
            C61520OCm LIZ = O3E.LIZ(str);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            optionCheckUpdateParams.setListener(abstractC61537ODd);
            Map<String, List<CheckRequestBodyModel.TargetChannel>> LJJIIZI = C51029K0z.LJJIIZI(new OSZ(str, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(channel))));
            if (LIZ != null) {
                LIZ.LIZ(null, LJJIIZI, optionCheckUpdateParams);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final File Vw(String channel, String filePath) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(filePath, "filePath");
        try {
            return OF4.LIZIZ(channel, filePath);
        } catch (Exception e) {
            C0NB.LJII(e);
            return null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean h50(Context context, String str) {
        return C118824lS.LIZ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final List<String> hp(String channel, String fileName) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(fileName, "fileName");
        if (TextUtils.isEmpty(channel) || TextUtils.isEmpty(fileName)) {
            return C61878OQg.INSTANCE;
        }
        return TTLiveGeckoBaseUrlSetting.getUrlList(channel, fileName);
    }
}
