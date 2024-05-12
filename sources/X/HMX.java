package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.MediaModelUtils$covert2MediaModels$1$1$1", f = "MediaModelUtils.kt", l = {42, LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HMX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super MediaModel>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ HMK LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMX(String str, int i, HMK hmk, InterfaceC67352kd<? super HMX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = hmk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HMX(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            String str = this.LJLILLLLZI;
            long j = this.LJLJI;
            this.LJLIL = 1;
            if (str == null || str.length() == 0) {
                obj2 = null;
            } else {
                obj2 = XKX.LJI(C78613UtF.LIZJ, new C5WX(j, str, null), this);
            }
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        MediaModel mediaModel = (MediaModel) obj2;
        if (mediaModel == null) {
            return null;
        }
        HMK hmk = this.LJLJJI;
        this.LJLIL = 2;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
        AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(c84654XKg, mediaModel, 52);
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(c84654XKg, 336);
        hmk.getClass();
        if (mediaModel.LJI()) {
            if (hmk.LIZIZ == null) {
                HMO hmo = new HMO(hmk.LIZ);
                hmo.LIZLLL = "enter_from_multi";
                hmk.LIZIZ = hmo;
            }
            HMO hmo2 = hmk.LIZIZ;
            if (hmo2 != null) {
                HMW.LIZIZ(hmo2, mediaModel, C42117Gfx.LJ(), 1000L, -1L, false, false, new AqS138S0200000_7(aqS154S0200000_7, mediaModel, 36), new AqS138S0200000_7(aqS157S0100000_7, mediaModel, 37), 48);
            }
        } else {
            double d = mediaModel.width;
            double d2 = mediaModel.height;
            if (d > d2 * 2.4d || d2 > d * 2.4d) {
                C41995Gdz.LIZ(0, 1);
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("errorCode", -9);
                c6bk.LIZ.put("errorMsg", "");
                C43882HKc.LIZLLL(1, "aweme_movie_import_error_rate", c6bk.LJ(), true);
                aqS157S0100000_7.invoke();
            } else {
                C60903NvH.LJIIJJI().LJIIZILJ().updateMediaTypeCache(mediaModel.fileLocalUriPath);
                C60903NvH.LJIIJJI().LJIIZILJ().cacheImageSize(mediaModel.fileLocalUriPath);
                aqS154S0200000_7.invoke();
            }
        }
        obj2 = c84654XKg.LIZ();
        if (obj2 == enumC58928NAu) {
            return enumC58928NAu;
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super MediaModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
