package X;

import com.ss.android.sdk.webview.di.IMainServiceForJsb;
import com.ss.android.ugc.aweme.services.MainServiceForJsb;
import java.util.HashMap;

/* renamed from: X.Ios, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47766Ios {
    public static C47766Ios LIZIZ;
    public Object LIZ;

    public static IMainServiceForJsb LIZ() {
        if (LIZIZ == null) {
            synchronized (C47766Ios.class) {
                if (LIZIZ == null) {
                    IMainServiceForJsb createIMainServiceForJsbbyMonsterPlugin = MainServiceForJsb.createIMainServiceForJsbbyMonsterPlugin(false);
                    if (createIMainServiceForJsbbyMonsterPlugin != null) {
                        C47766Ios c47766Ios = new C47766Ios(createIMainServiceForJsbbyMonsterPlugin);
                        LIZIZ = c47766Ios;
                        c47766Ios.LIZ = createIMainServiceForJsbbyMonsterPlugin;
                    } else {
                        throw new IllegalStateException("Please add serviceImpl for IMainServiceForJsb");
                    }
                }
            }
        }
        return (IMainServiceForJsb) LIZIZ.LIZ;
    }

    public /* synthetic */ C47766Ios() {
        this.LIZ = new HashMap();
    }

    public /* synthetic */ C47766Ios(Object obj) {
        this.LIZ = obj;
    }

    public final void LIZIZ(C47752Ioe c47752Ioe, C47751Iod c47751Iod) {
        HashMap hashMap = new HashMap();
        C60903NvH.LJJIJ(c47751Iod.LIZIZ, "setds_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJLJL, "surface_set_time", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LIZJ, "ps_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJ, "pt", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJI, "at", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJIFFI, "prepare_start_time", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJFF, "formater_create_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIIIIZZ, "demuxer_begin_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJLIIIJL, "tran_ct", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJLIL, "a_tran_ct", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJLIIIJLLLLLLLZ, "tran_ft", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJLJ, "a_tran_ft", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJI, "avformat_open_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJII, "demuxer_create_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIIIZ, "dec_create_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIIJ, "outlet_create_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJII, "prepare_end_time", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LLJILJIL, "dns_start_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJ, "a_dns_start_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LLJILJILJ, "dns_end_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJLIIJ, "a_dns_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIILJJIL, "v_dec_start_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIILIIL, "a_dec_start_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIILLIIL, "v_dec_opened_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIILL, "a_dec_opened_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJLJI, "video_device_start_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJLJJI, "video_device_opened_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJLJJL, "audio_device_start_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJLJJLL, "audio_device_opened_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJLJLI, "re_f_videoframet", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJLL, "re_f_audioframet", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJZ, "de_f_videoframet", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJJZZI, "de_f_audioframet", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIIJJI, "v_render_f_t", hashMap);
        C60903NvH.LJJIJ(c47751Iod.LJIIL, "a_render_f_t", hashMap);
        ((java.util.Map) this.LIZ).put("req_phase", Integer.valueOf(c47751Iod.LLJJIII));
        ((java.util.Map) this.LIZ).put("req_phase_cost", hashMap);
        ((java.util.Map) this.LIZ).put("hw", Integer.valueOf(c47752Ioe.LJJIII));
        ((java.util.Map) this.LIZ).put("hw_user", Integer.valueOf(c47752Ioe.LJJIIJ));
    }
}
