package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import fjb.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl$requestLiveCardModelAndStuffData$1", f = "CommercializeLiveServiceImpl.kt", l = {517}, m = "invokeSuspend")
/* renamed from: X.MCz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56437MCz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public AwemeRawAd LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ CommercializeLiveServiceImpl LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56437MCz(Aweme aweme, CommercializeLiveServiceImpl commercializeLiveServiceImpl, InterfaceC67352kd<? super C56437MCz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = aweme;
        this.LJLJJI = commercializeLiveServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56437MCz(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AwemeRawAd awemeRawAd;
        LiveAdCardModel liveAdCardModel;
        int i;
        long j;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Aweme aweme;
        NKM nkm;
        WeakReference<Context> weakReference;
        Context context;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        try {
        } catch (Throwable th) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "request_fail", this.LJLJI.getAwemeRawAd());
            LIZLLL.LIZJ("card", "refer");
            LIZLLL.LIZIZ(String.valueOf(th.getMessage()), "fail_reason");
            LIZLLL.LJI();
        }
        if (i2 != 0) {
            if (i2 == 1) {
                awemeRawAd = this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            awemeRawAd = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd != null) {
                LiveRoomStruct newLiveRoomData = this.LJLJI.getNewLiveRoomData();
                liveAdCardModel = null;
                if (newLiveRoomData != null) {
                    CommercializeLiveServiceImpl commercializeLiveServiceImpl = this.LJLJJI;
                    Aweme aweme2 = this.LJLJI;
                    String valueOf = String.valueOf(newLiveRoomData.id);
                    String uid = newLiveRoomData.owner.getUid();
                    o.LJIIIIZZ(uid, "liveRoomStruct.owner.uid");
                    String secUid = newLiveRoomData.owner.getSecUid();
                    o.LJIIIIZZ(secUid, "liveRoomStruct.owner.secUid");
                    AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        i = awemeRawAd3.getComponentType();
                    } else {
                        i = 0;
                    }
                    AwemeRawAd awemeRawAd4 = aweme2.getAwemeRawAd();
                    if (awemeRawAd4 == null || (creativeId = awemeRawAd4.getCreativeId()) == null) {
                        j = 0;
                    } else {
                        j = creativeId.longValue();
                    }
                    InterfaceC37276Ek4 LJII = commercializeLiveServiceImpl.LJII(i, valueOf, uid, j, secUid);
                    this.LJLIL = awemeRawAd;
                    this.LJLILLLLZI = 1;
                    C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                    LJII.enqueue(new C59322NPy(c84654XKg));
                    obj2 = c84654XKg.LIZ();
                    if (obj2 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                awemeRawAd.setLiveAdCardModel(liveAdCardModel);
            }
            awemeRawAd2 = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd2 != null && awemeRawAd2.getLiveAdCardModel() != null) {
                aweme = this.LJLJI;
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "request_success", aweme.getAwemeRawAd());
                LIZLLL2.LIZJ("card", "refer");
                LIZLLL2.LJI();
                FeedAdServiceImpl.LJJIJLIJ().LJIILJJIL();
                nkm = NKM.LIZ;
                weakReference = NKM.LIZJ;
                if (weakReference != null && (context = weakReference.get()) != null) {
                    nkm.LJIIJJI(context, aweme);
                }
            }
            return C76800UCe.LIZ;
        }
        liveAdCardModel = (LiveAdCardModel) obj2;
        awemeRawAd.setLiveAdCardModel(liveAdCardModel);
        awemeRawAd2 = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            aweme = this.LJLJI;
            C58655N0h LIZLLL22 = C58704N2e.LIZLLL("draw_ad", "request_success", aweme.getAwemeRawAd());
            LIZLLL22.LIZJ("card", "refer");
            LIZLLL22.LJI();
            FeedAdServiceImpl.LJJIJLIJ().LJIILJJIL();
            nkm = NKM.LIZ;
            weakReference = NKM.LIZJ;
            if (weakReference != null) {
                nkm.LJIIJJI(context, aweme);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
