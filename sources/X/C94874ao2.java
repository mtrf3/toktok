package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlatformListResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$getDspPlatformList$1$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ao2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94874ao2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends TT2DSPPlatformInfo>>, Object> {
    public final /* synthetic */ XGX<C94480ahg> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94874ao2(XGX<C94480ahg> xgx, InterfaceC67352kd<? super C94874ao2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94874ao2(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        DspPlatformListResponse dspPlatformListResponse;
        List<TT2DSPPlatformInfo> list;
        Object obj2;
        C141335gf.LIZJ(obj);
        XGX<C94480ahg> xgx = this.LJLIL;
        DspPlatform dspPlatform = null;
        if (!(xgx instanceof XGW) || (dspPlatformListResponse = ((C94480ahg) ((XGW) xgx).LJ).LIZ) == null || (list = dspPlatformListResponse.platformList) == null || list.isEmpty()) {
            return null;
        }
        List<TT2DSPPlatformInfo> list2 = dspPlatformListResponse.platformList;
        o.LJIIIZ(list2, "list");
        ArrayList arrayList = (ArrayList) C93920aYe.LIZ;
        arrayList.clear();
        arrayList.addAll(list2);
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (((TT2DSPPlatformInfo) obj2).getPlatformSelectedByUser()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        TT2DSPPlatformInfo tT2DSPPlatformInfo = (TT2DSPPlatformInfo) obj2;
        if (tT2DSPPlatformInfo != null) {
            dspPlatform = DspPlatform.Companion.from(Integer.valueOf(tT2DSPPlatformInfo.getDspPlatform()));
        }
        C93920aYe.LIZIZ = dspPlatform;
        C2U8.LIZ(new C94392agG());
        return dspPlatformListResponse.platformList;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends TT2DSPPlatformInfo>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
