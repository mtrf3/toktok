package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.N6x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58827N6x implements ISearchAdMainService {
    public static final C58827N6x LIZIZ = new C58827N6x();
    public final /* synthetic */ ISearchAdMainService LIZ = SearchAdMainService.LJIIJJI();

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final JMC LIZIZ(JMB jmb) {
        return this.LIZ.LIZIZ(jmb);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZJ(context);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJFF(String str, String str2, InterfaceC64592gB<NewLiveRoomStruct> interfaceC64592gB, InterfaceC64592gB<Throwable> interfaceC64592gB2) {
        this.LIZ.LJFF(str, str2, interfaceC64592gB, interfaceC64592gB2);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJI(View adview, Context context, Aweme aweme, InterfaceC65784Pro<Long> interfaceC65784Pro, InterfaceC65784Pro<Long> interfaceC65784Pro2, boolean z) {
        o.LJIIIZ(adview, "adview");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LJI(adview, context, aweme, interfaceC65784Pro, interfaceC65784Pro2, z);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final NIW LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final NIP LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJIIIZ(Context context) {
        this.LIZ.LJIIIZ(context);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final N69 LJIIJ(NBG nbg) {
        return this.LIZ.LJIIJ(nbg);
    }
}
