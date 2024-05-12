package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Nyn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61121Nyn extends AbstractC43299Gz1 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        o.LJIIIZ(type, "type");
        C39359FcZ c39359FcZ = SparkContext.Companion;
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        Aweme aweme = null;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        c39359FcZ.getClass();
        C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str);
        FMX.onEventV3("disney100_card_dislike");
        if (LIZIZ != null) {
            aweme = (Aweme) LIZIZ.LIZIZ(Aweme.class);
        }
        C2U8.LIZ(new C55045Liz("homepage_hot", aweme, "FUNCTION_FROM_NOT_INTERESTED"));
        C25170yn.LIZ(new C09170Xp("feed"), "disney100").LIZJ("last_show", Long.MAX_VALUE);
    }
}
