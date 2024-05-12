package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.manager.PublishLandingNearbyHelper$removeInsertAwemeFromKevaWhenVideoPlay$1", f = "PublishLandingNearbyHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JDb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48795JDb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48795JDb(Aweme aweme, String str, InterfaceC67352kd<? super C48795JDb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C48795JDb(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NearbyInfo nearbyInfo = this.LJLIL.nearbyInfo;
        if (nearbyInfo != null) {
            str = nearbyInfo.getEventTrack();
        } else {
            str = null;
        }
        C78685UuP.LJJLIIIJILLIZJL(str, linkedHashMap);
        if (linkedHashMap.containsKey("is_insert_personal_video") && o.LJ(linkedHashMap.get("is_insert_personal_video"), "1")) {
            String str2 = this.LJLILLLLZI;
            List LJLIIIL = ORY.LJLIIIL(LJ6.LIZIZ());
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJLIIIL).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!ujb.o.LJJJLIIL((String) next, str2, false)) {
                    arrayList.add(next);
                }
            }
            String[] array = (String[]) arrayList.toArray(new String[0]);
            o.LJIIIZ(array, "array");
            LJ6.LIZ.storeStringArray("publish_landing_nearby_insert_awemes", array);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
