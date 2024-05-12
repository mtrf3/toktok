package X;

import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.internal.o;

/* renamed from: X.8Lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209838Lj extends AbstractC65781Prl implements InterfaceC88473Ynt<FeedBottomButtonContainer, C43I<? extends Integer>, C43I<? extends C70012ov>, C76800UCe> {
    public static final C209838Lj LJLIL = new C209838Lj();

    public C209838Lj() {
        super(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(FeedBottomButtonContainer feedBottomButtonContainer, C43I<? extends Integer> c43i, C43I<? extends C70012ov> c43i2) {
        boolean z;
        C70012ov c70012ov;
        FeedBottomButtonContainer selectSubscribe = feedBottomButtonContainer;
        C43I<? extends C70012ov> c43i3 = c43i2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i3 != null && (c70012ov = (C70012ov) c43i3.LIZ) != null) {
            z = c70012ov.LJLJJL;
        } else {
            z = false;
        }
        if (c43i != null || z) {
            selectSubscribe.p4().LIZJ();
        }
        return C76800UCe.LIZ;
    }
}
