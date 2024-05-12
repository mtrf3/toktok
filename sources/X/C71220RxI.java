package X;

import android.content.Context;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.EcAnchorApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.RefreshShortTouchResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.ShortTouch;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$4", f = "ECDuringLiveBroadcasterWidget.kt", l = {396}, m = "invokeSuspend")
/* renamed from: X.RxI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71220RxI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ IMessage LJLJJI;
    public final /* synthetic */ C71219RxH LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71220RxI(String str, String str2, IMessage iMessage, C71219RxH c71219RxH, InterfaceC67352kd<? super C71220RxI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = iMessage;
        this.LJLJJL = c71219RxH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71220RxI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        Integer num;
        long j;
        RefreshShortTouchResponse refreshShortTouchResponse;
        List<ShortTouch> list2;
        android.net.Uri uri;
        String str;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            C74952wt c74952wt = EcAnchorApi.LIZ;
            String str2 = this.LJLILLLLZI;
            String str3 = this.LJLJI;
            ShortItemRefreshEntity shortItemRefreshEntity = ((ECShortItemRefreshMessage) this.LJLJJI).entity;
            if (shortItemRefreshEntity != null) {
                list = shortItemRefreshEntity.refreshItems;
            } else {
                list = null;
            }
            C71219RxH c71219RxH = this.LJLJJL;
            if (shortItemRefreshEntity != null) {
                num = new Integer(shortItemRefreshEntity.interval);
            } else {
                num = null;
            }
            int intValue = ((Number) this.LJLJJL.LJZI.getValue()).intValue();
            c71219RxH.getClass();
            if (num != null) {
                j = num.intValue();
            } else {
                j = 0;
            }
            long LJIJI = C78842Uww.LJIJI(V0Q.Default, new UIW(0L, j)) + intValue;
            this.LJLIL = 1;
            obj2 = c74952wt.LIZJ(str2, str3, list, LJIJI, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj2;
        if (baseResponse != null && (refreshShortTouchResponse = (RefreshShortTouchResponse) baseResponse.getData()) != null && (list2 = refreshShortTouchResponse.shortTouchItems) != null) {
            C71219RxH c71219RxH2 = this.LJLJJL;
            for (ShortTouch shortTouch : list2) {
                IShortTouchService LJI = LiveOuterService.LJJJLL().LJJIJIL().LJI();
                Context context = c71219RxH2.LJLJJL;
                UOS uos = UOS.NAME;
                String valueOf = String.valueOf(shortTouch.name);
                android.net.Uri parse = UriProtector.parse(shortTouch.uri);
                o.LJIIIIZZ(parse, "parse(shortTouch.uri)");
                String valueOf2 = String.valueOf(shortTouch.name);
                ShortTouchPreviewSetting shortTouchPreviewSetting = shortTouch.previewSetting;
                if (shortTouchPreviewSetting != null && shortTouchPreviewSetting.previewSchema != null) {
                    if (shortTouchPreviewSetting != null) {
                        str = shortTouchPreviewSetting.previewSchema;
                    } else {
                        str = null;
                    }
                    uri = UriProtector.parse(str);
                } else {
                    uri = null;
                }
                LJI.vn0(context, uos, valueOf, parse, valueOf2, false, uri, Boolean.TRUE);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
