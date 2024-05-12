package X;

import com.ss.android.ugc.aweme.innerpush.InnerPushServiceImpl;
import com.ss.android.ugc.aweme.innerpush.api.IInnerPushService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xxy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86550Xxy implements IInnerPushService {
    public static final C86550Xxy LIZIZ = new C86550Xxy();
    public final /* synthetic */ IInnerPushService LIZ;

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZ(boolean z, boolean z2) {
        this.LIZ.LIZ(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LIZJ(C51764KTg localPush) {
        o.LJIIIZ(localPush, "localPush");
        return this.LIZ.LIZJ(localPush);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LIZLLL(boolean z) {
        return this.LIZ.LIZLLL(z);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC55341Lnl LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJI(boolean z, boolean z2) {
        this.LIZ.LJI(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJII(InterfaceC86533Xxh observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZ.LJII(observer);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIIIZZ(InterfaceC86533Xxh observer, int[] iArr) {
        o.LJIIIZ(observer, "observer");
        this.LIZ.LJIIIIZZ(observer, iArr);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIIZ(JSONObject jSONObject) {
        return this.LIZ.LJIIIZ(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIJ(String str) {
        return this.LIZ.LJIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIJJI(InterfaceC86486Xww interfaceC86486Xww) {
        this.LIZ.LJIIJJI(interfaceC86486Xww);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC86486Xww LJIIL(int i) {
        return this.LIZ.LJIIL(i);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIILIIL(EnumC86549Xxx event, InnerPushMessage innerPushMessage, String actionType) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(actionType, "actionType");
        this.LIZ.LJIILIIL(event, innerPushMessage, actionType);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void init() {
        this.LIZ.init();
    }

    public C86550Xxy() {
        IInnerPushService iInnerPushService;
        Object LIZ = C58096Mr6.LIZ(IInnerPushService.class, false);
        if (LIZ != null) {
            iInnerPushService = (IInnerPushService) LIZ;
        } else {
            if (C58096Mr6.y1 == null) {
                synchronized (IInnerPushService.class) {
                    if (C58096Mr6.y1 == null) {
                        C58096Mr6.y1 = new InnerPushServiceImpl();
                    }
                }
            }
            iInnerPushService = C58096Mr6.y1;
        }
        this.LIZ = iInnerPushService;
    }
}
