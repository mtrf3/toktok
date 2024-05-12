package X;

import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import kotlin.jvm.internal.o;

/* renamed from: X.7hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C193047hs extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C193047hs(Object obj) {
        super(3, obj, C193027hq.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        C193027hq c193027hq = (C193027hq) this.receiver;
        c193027hq.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean booleanValue = bool.booleanValue();
            if (p2 == EnumC84576XHg.Mutation && booleanValue) {
                if (o.LJ(p0, c193027hq.LJLILLLLZI)) {
                    C191997gB c191997gB = c193027hq.LJLJJLL;
                    if (c191997gB != null) {
                        c191997gB.invoke();
                    }
                    c193027hq.LJLJJL = p0;
                }
                c193027hq.LJLJJLL = null;
                AwemeCollectionAgent.LJIILLIIL().LIZJ(c193027hq.LJLJJI);
            }
        }
        return C76800UCe.LIZ;
    }
}
