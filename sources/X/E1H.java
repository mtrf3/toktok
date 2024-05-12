package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.FriendsPostExp;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E1H extends AbstractC65781Prl implements InterfaceC65784Pro<FriendsPostExp.MetaData> {
    public static final E1H LJLIL = new E1H();

    public E1H() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final FriendsPostExp.MetaData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        FriendsPostExp.MetaData metaData = FriendsPostExp.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "friend_post_in_app_push", 31744, FriendsPostExp.MetaData.class, metaData);
        if (LJIJ != 0) {
            metaData = LJIJ;
        }
        o.LJIIIIZZ(metaData, "ABManager.getInstance().…p::class.java) ?: DEFAULT");
        return metaData;
    }
}
