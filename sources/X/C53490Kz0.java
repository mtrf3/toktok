package X;

import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Kz0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53490Kz0 extends AbstractC65781Prl implements InterfaceC88472Yns<C53489Kyz, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C53471Kyh LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53490Kz0(boolean z, C53471Kyh c53471Kyh, boolean z2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = c53471Kyh;
        this.LJLJI = z2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C53489Kyz avatarViewData) {
        Drawable drawable;
        TuxIconView tuxIconView;
        o.LJIIIZ(avatarViewData, "avatarViewData");
        View view = avatarViewData.LJLILLLLZI;
        Context context = avatarViewData.LJLJJI;
        View view2 = avatarViewData.LJLJI;
        if (this.LJLIL) {
            this.LJLILLLLZI.getClass();
            drawable = C53491Kz1.LIZ;
            if (drawable == null) {
                drawable = C04270Et.LIZIZ(context, R.drawable.c78);
                if (drawable != null) {
                    C53491Kz1.LIZ = drawable;
                }
                drawable = null;
            }
        } else {
            this.LJLILLLLZI.getClass();
            drawable = C53491Kz1.LIZIZ;
            if (drawable == null) {
                drawable = C04270Et.LIZIZ(context, R.drawable.c7_);
                if (drawable != null) {
                    C53491Kz1.LIZIZ = drawable;
                }
                drawable = null;
            }
        }
        if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null) {
            tuxIconView.setImageDrawable(drawable);
        }
        if (this.LJLJI) {
            C16880lQ.LJIIJ(new ACListenerS44S0200000_9(context, this.LJLILLLLZI, 41), view2);
        } else {
            C16880lQ.LJIIJ(null, view2);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(C53489Kyz c53489Kyz) {
        invoke2(c53489Kyz);
        return C76800UCe.LIZ;
    }
}
