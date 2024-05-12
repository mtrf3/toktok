package X;

import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.nows.interaction.assem.NowLikeAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7AF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AF extends AbstractC65781Prl implements InterfaceC88473Ynt<NowLikeAssem, C43I<? extends Boolean>, C43I<? extends Long>, C76800UCe> {
    public static final C7AF LJLIL = new C7AF();

    public C7AF() {
        super(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(NowLikeAssem nowLikeAssem, C43I<? extends Boolean> c43i, C43I<? extends Long> c43i2) {
        C2068389v c2068389v;
        NowLikeAssem selectSubscribe = nowLikeAssem;
        C43I<? extends Boolean> liked = c43i;
        C43I<? extends Long> count = c43i2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(liked, "liked");
        o.LJIIIZ(count, "count");
        boolean booleanValue = ((Boolean) liked.LIZ).booleanValue();
        long longValue = ((Number) count.LIZ).longValue();
        if (booleanValue) {
            c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_thumbup_shadow_selected;
        } else {
            c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_thumbup_shadow;
        }
        TuxIconView tuxIconView = selectSubscribe.LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c2068389v);
            TuxTextView tuxTextView = selectSubscribe.LLII;
            if (tuxTextView != null) {
                tuxTextView.setText(C77123UOp.LJJIIJ(longValue));
                return C76800UCe.LIZ;
            }
            o.LJIJI("likeCount");
            throw null;
        }
        o.LJIJI("likeIcon");
        throw null;
    }
}
