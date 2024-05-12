package X;

import Y.IDCListenerS160S0100000_7;
import android.content.Context;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.ICu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46240ICu implements TII {
    public final Context LIZ;
    public final LiveEvent<Boolean> LIZIZ;
    public final ShortVideoContext LIZJ;
    public final InterfaceC88472Yns<InterfaceC46243ICx<?>, C76800UCe> LIZLLL;
    public InterfaceC46243ICx LJ;

    @Override // X.TII
    public final <T> TIH LIZ(InterfaceC46243ICx<T> request) {
        o.LJIIIZ(request, "request");
        if (!o.LJ(this.LJ, request) && (request instanceof TID) && (request.LIZIZ() == EnumC44267HYx.UI_CLICK || request.LIZIZ() == EnumC44267HYx.UI_GALLERY)) {
            Effect effect = ((TID) request).LIZIZ;
            if (!V3N.LJIILLIIL(effect)) {
                return new TIH(false, null);
            }
            if (o.LJ(this.LIZIZ.LIZJ(), Boolean.TRUE)) {
                if (this.LIZJ.cameraComponentModel.mDurings.isEmpty()) {
                    return new TIH(false, null);
                }
                OSZ[] oszArr = new OSZ[3];
                oszArr[0] = new OSZ("prop_id", effect.getEffectId());
                oszArr[1] = new OSZ("creation_id", this.LIZJ.LJI());
                String str = this.LIZJ.shootWay;
                if (str == null) {
                    str = "";
                }
                oszArr[2] = new OSZ("shoot_way", str);
                HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr);
                Context context = this.LIZ;
                C170066lu c170066lu = new C170066lu(context);
                c170066lu.LIZ = context.getString(R.string.tim);
                c170066lu.LIZIZ = context.getString(R.string.til);
                IDCListenerS160S0100000_7 iDCListenerS160S0100000_7 = new IDCListenerS160S0100000_7(LJJJLZIJ, 8);
                c170066lu.LIZLLL = context.getString(R.string.cg_);
                c170066lu.LJFF = iDCListenerS160S0100000_7;
                DialogInterfaceOnClickListenerC46242ICw dialogInterfaceOnClickListenerC46242ICw = new DialogInterfaceOnClickListenerC46242ICw(LJJJLZIJ, this, request);
                c170066lu.LIZJ = context.getString(R.string.dt6);
                c170066lu.LJ = dialogInterfaceOnClickListenerC46242ICw;
                new C172106pC(c170066lu).LIZ();
                return new TIH(true, "effect_control_sticker");
            }
        }
        return new TIH(false, null);
    }

    public C46240ICu(ActivityC45651qj context, LiveEvent stickerViewVisibilityEvent, ShortVideoContext shortVideoContext, AqS173S0100000_7 aqS173S0100000_7) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerViewVisibilityEvent, "stickerViewVisibilityEvent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = context;
        this.LIZIZ = stickerViewVisibilityEvent;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = aqS173S0100000_7;
    }
}
