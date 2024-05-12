package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HmJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45059HmJ {
    public final C45060HmK LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final InterfaceC88472Yns<C44716Hgm, C76800UCe> LIZJ;
    public String LIZLLL;
    public final C44716Hgm LJ;
    public EnumC45067HmR LJFF = EnumC45067HmR.NONE;
    public long LJI = -1;

    public final void LIZJ() {
        boolean z;
        EnumC45067HmR enumC45067HmR = this.LJFF;
        EnumC45067HmR enumC45067HmR2 = EnumC45067HmR.SUCCESS;
        if (enumC45067HmR == enumC45067HmR2 || enumC45067HmR == EnumC45067HmR.CANCEL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleSuccess: already result. status=");
            LIZ.append(this.LJFF);
            X1D.LIZIZ(LIZ);
            return;
        }
        C44716Hgm c44716Hgm = this.LJ;
        boolean z2 = true;
        if (c44716Hgm.LIZJ != EnumC43998HOo.CUT_SAME.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (c44716Hgm.LIZIZ(z, true)) {
            long LIZLLL = C45049Hm9.LIZLLL(this.LJI);
            C45060HmK c45060HmK = this.LIZ;
            List<AutoCutMediaModel> list = c45060HmK.LIZLLL;
            String str = c45060HmK.LJII;
            String str2 = c45060HmK.LJI;
            AutoCutThemeData autoCutThemeData = c45060HmK.LIZIZ;
            int i = autoCutThemeData.templateType;
            String str3 = autoCutThemeData.templateId;
            String str4 = autoCutThemeData.templateGroupId;
            String str5 = autoCutThemeData.musicId;
            String str6 = autoCutThemeData.templateData;
            if (str6 != null) {
                if (str6.length() <= 0) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            C45049Hm9.LJIL(true, 0, Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT), null, LIZLLL, list, str, str2, i, str3, z2, str4, str5);
            o.LJIIIZ(enumC45067HmR2, "<set-?>");
            this.LJFF = enumC45067HmR2;
            this.LIZJ.invoke(this.LJ);
        }
    }

    public final void LIZ(AVMusic aVMusic) {
        IAnotherMusicService musicService = C78934UyQ.LJLIL.getMusicService();
        C78934UyQ.LJLIL.getApplicationService().getClass();
        AwemeHostApplication LIZ = FKM.LIZ();
        o.LJIIIIZZ(LIZ, "getAPI().applicationService.application");
        musicService.LJIILL(LIZ, aVMusic, 0, false, new C45065HmP(this));
    }

    public C45059HmJ(C45060HmK c45060HmK, AqS154S0200000_7 aqS154S0200000_7, AqS138S0200000_7 aqS138S0200000_7) {
        this.LIZ = c45060HmK;
        this.LIZIZ = aqS154S0200000_7;
        this.LIZJ = aqS138S0200000_7;
        this.LJ = new C44716Hgm(c45060HmK.LIZ.getSecond(), c45060HmK.LIZ.getFirst().intValue(), 0, null, null, null, 0L, null, null, null, null, 8188);
    }

    public final void LIZIZ(Integer num, Integer num2, String str) {
        int i;
        boolean z = false;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        long LIZLLL = C45049Hm9.LIZLLL(this.LJI);
        C45060HmK c45060HmK = this.LIZ;
        List<AutoCutMediaModel> list = c45060HmK.LIZLLL;
        String str2 = c45060HmK.LJII;
        String str3 = c45060HmK.LJI;
        AutoCutThemeData autoCutThemeData = c45060HmK.LIZIZ;
        int i2 = autoCutThemeData.templateType;
        String str4 = autoCutThemeData.templateId;
        String str5 = autoCutThemeData.templateGroupId;
        String str6 = autoCutThemeData.musicId;
        String str7 = autoCutThemeData.templateData;
        if (str7 != null && str7.length() > 0) {
            z = true;
        }
        C45049Hm9.LJIL(false, i, num2, str, LIZLLL, list, str2, str3, i2, str4, z, str5, str6);
        C5OG.LIZJ(new AqS157S0100000_7(this, 593));
    }
}
