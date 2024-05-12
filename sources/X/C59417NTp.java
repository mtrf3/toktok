package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.response.BaseResponse;
import com.ss.android.ugc.aweme.live.response.Extra;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.NTp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59417NTp implements InterfaceC36621EYv<BaseResponse<Room, Extra>> {
    public final /* synthetic */ IAdSceneService LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ User LJLJJL;
    public final /* synthetic */ InterfaceC59418NTq LJLJJLL;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<BaseResponse<Room, Extra>> interfaceC37276Ek4, Throwable th) {
        NT2 LIZJ;
        AM0.LIZ = false;
        XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C64292fh(this.LJLJI, null), 3);
        IAdSceneService iAdSceneService = this.LJLIL;
        if (iAdSceneService != null && (LIZJ = iAdSceneService.LIZJ()) != null) {
            LIZJ.LJJIJ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI);
        }
        Context context = this.LJLJI;
        Aweme aweme = this.LJLILLLLZI;
        NN1.LJJJJI(context, "live_show_failed", aweme, NN1.LJIIIZ(context, aweme));
        C58704N2e.LIZLLL("draw_ad", "live_show_failed", this.LJLILLLLZI.getAwemeRawAd()).LJII();
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<BaseResponse<Room, Extra>> interfaceC37276Ek4, C64797Pbt<BaseResponse<Room, Extra>> c64797Pbt) {
        AwemeSplashInfo awemeSplashInfo;
        boolean z;
        String webUrl;
        BaseResponse<Room, Extra> baseResponse;
        Room room;
        BaseResponse<Room, Extra> baseResponse2;
        Room room2;
        C86393XvR LJJIJIL;
        EnterRoomConfig LJJJJLI;
        Room room3;
        NT2 LIZJ;
        AM0.LIZ = false;
        AwemeRawAd awemeRawAd = this.LJLILLLLZI.getAwemeRawAd();
        Long l = null;
        if (awemeRawAd != null) {
            awemeSplashInfo = awemeRawAd.getSplashInfo();
        } else {
            awemeSplashInfo = null;
        }
        if (awemeSplashInfo != null) {
            awemeSplashInfo.hasUpdateLiving = true;
        }
        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (baseResponse = c64797Pbt.LIZIZ) != null && (room = baseResponse.data) != null && room.getId() > 0 && (baseResponse2 = c64797Pbt.LIZIZ) != null && (room2 = baseResponse2.data) != null && room2.getStatus() == 2) {
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL == null || (LJJIJIL = LJJJLL.LJJIJIL()) == null || (LJJJJLI = LJJIJIL.LJJJJLI(c64797Pbt.LIZIZ.data)) == null) {
                return;
            }
            User author = this.LJLILLLLZI.getAuthor();
            if (author != null) {
                BaseResponse<Room, Extra> baseResponse3 = c64797Pbt.LIZIZ;
                if (baseResponse3 != null && (room3 = baseResponse3.data) != null) {
                    l = Long.valueOf(room3.getId());
                }
                author.roomId = l.longValue();
            }
            Aweme aweme = this.LJLILLLLZI;
            int i = this.LJLJJI;
            if (aweme != null) {
                C59411NTj.LIZIZ.LIZLLL(aweme, LJJJJLI, i);
            }
            LiveOuterService.LJJJLL().LJIILL().LJIIZILJ(this.LJLJI, this.LJLJJL, LJJJJLI);
            IAdSceneService iAdSceneService = this.LJLIL;
            if (iAdSceneService != null && (LIZJ = iAdSceneService.LIZJ()) != null) {
                LIZJ.LJJIJ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI);
            }
            C59411NTj.LIZIZ.LJIIIIZZ();
            return;
        }
        User author2 = this.LJLILLLLZI.getAuthor();
        if (author2 != null) {
            author2.roomId = 0L;
        }
        if (this.LJLJJI != 42) {
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C64302fi(this.LJLJI, null), 3);
        }
        this.LJLJJLL.LIZ();
        Context context = this.LJLJI;
        Aweme aweme2 = this.LJLILLLLZI;
        NN1.LJJJJI(context, "live_show_failed", aweme2, NN1.LJIIIZ(context, aweme2));
        C58704N2e.LIZLLL("draw_ad", "live_show_failed", this.LJLILLLLZI.getAwemeRawAd()).LJII();
        C2U8.LIZ(new C56252Ir(this.LJLILLLLZI.getAid(), this.LJLJJI));
        int i2 = this.LJLJJI;
        if (i2 == 2 || i2 == 1) {
            AwemeRawAd awemeRawAd2 = this.LJLILLLLZI.getAwemeRawAd();
            if (awemeRawAd2 == null || (webUrl = awemeRawAd2.getWebUrl()) == null || webUrl.length() == 0) {
                C2U8.LIZ(new C2J4(this.LJLILLLLZI.getAid()));
            }
        }
    }

    public C59417NTp(IAdSceneService iAdSceneService, Aweme aweme, Context context, int i, User user, InterfaceC59418NTq interfaceC59418NTq) {
        this.LJLIL = iAdSceneService;
        this.LJLILLLLZI = aweme;
        this.LJLJI = context;
        this.LJLJJI = i;
        this.LJLJJL = user;
        this.LJLJJLL = interfaceC59418NTq;
    }
}
