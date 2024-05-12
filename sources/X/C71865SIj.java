package X;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView$startPlay$1", f = "ECLynxLiveView.kt", l = {428}, m = "invokeSuspend")
/* renamed from: X.SIj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71865SIj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public LiveRoomStruct LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ECLynxLiveView LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71865SIj(ECLynxLiveView eCLynxLiveView, String str, InterfaceC67352kd<? super C71865SIj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = eCLynxLiveView;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C71865SIj c71865SIj = new C71865SIj(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c71865SIj.LJLJI = obj;
        return c71865SIj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LiveRoomStruct liveRoomStruct;
        long j;
        LiveRoomStruct liveRoomStruct2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                liveRoomStruct2 = this.LJLIL;
                liveRoomStruct = (LiveRoomStruct) this.LJLJI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLJI, C78613UtF.LIZJ, null, new C65192h9(this.LJLJJL, null), 2);
            liveRoomStruct = new LiveRoomStruct();
            String str = this.LJLJJI.LJLJJI;
            if (str != null) {
                j = CastLongProtector.parseLong(str);
            } else {
                j = 0;
            }
            liveRoomStruct.id = j;
            this.LJLJI = liveRoomStruct;
            this.LJLIL = liveRoomStruct;
            this.LJLILLLLZI = 1;
            obj = LIZIZ.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
            liveRoomStruct2 = liveRoomStruct;
        }
        liveRoomStruct2.stream_url = (StreamUrlStruct) obj;
        if (this.LJLJJI.mView.isAttachedToWindow()) {
            this.LJLJJI.LJLLI = true;
            ECLynxLiveView eCLynxLiveView = this.LJLJJI;
            boolean z = eCLynxLiveView.LJLJLLL;
            T mView = eCLynxLiveView.mView;
            o.LJIIIIZZ(mView, "mView");
            C69578RSk c69578RSk = new C69578RSk(z, liveRoomStruct, (FrameLayout) mView);
            this.LJLJJI.LJLLILLLL = SystemClock.elapsedRealtime();
            C71874SIs c71874SIs = (C71874SIs) this.LJLJJI.mView;
            c71874SIs.getClass();
            if (c71874SIs.LJLIL != null) {
                c71874SIs.LJLJJL = Long.valueOf(c69578RSk.LIZIZ.id);
                InterfaceC86353Xun interfaceC86353Xun = c71874SIs.LJLIL;
                if (interfaceC86353Xun == null) {
                    o.LJIJI("livePlayHelper");
                    throw null;
                }
                interfaceC86353Xun.i(c69578RSk.LIZ, c69578RSk.LIZIZ, c69578RSk.LIZJ, false, null);
            }
            ECLynxLiveView eCLynxLiveView2 = this.LJLJJI;
            ((C71874SIs) eCLynxLiveView2.mView).LIZIZ(eCLynxLiveView2.LJLJL, new C71866SIk(eCLynxLiveView2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
