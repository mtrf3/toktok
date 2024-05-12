package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler$loadViewWithCreatorInformation$1$1$1", f = "EffectInfoStickerHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.TFc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74328TFc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ EffectInfoStickerHandler LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ InterfaceC74334TFi LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74328TFc(EffectInfoStickerHandler effectInfoStickerHandler, Effect effect, InterfaceC74334TFi interfaceC74334TFi, InterfaceC67352kd<? super C74328TFc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = effectInfoStickerHandler;
        this.LJLILLLLZI = effect;
        this.LJLJI = interfaceC74334TFi;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74328TFc(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String nickname;
        C141335gf.LIZJ(obj);
        if (C2311895m.LIZJ()) {
            EffectInfoStickerHandler effectInfoStickerHandler = this.LJLIL;
            Effect effect = this.LJLILLLLZI;
            InterfaceC74334TFi interfaceC74334TFi = this.LJLJI;
            ConstraintLayout constraintLayout = effectInfoStickerHandler.LJLILLLLZI;
            if (constraintLayout != null && interfaceC74334TFi != null && (nickname = interfaceC74334TFi.getNickname()) != null) {
                if (constraintLayout.findViewById(R.id.fme).getVisibility() == 0 && o.LJ(effect, effectInfoStickerHandler.LJFF().LLLLL().LLJJIJIIJIL())) {
                    View findViewById = constraintLayout.findViewById(R.id.fm8);
                    o.LJIIIIZZ(findViewById, "showCreatorNameInCardVie…ambda$8$lambda$7$lambda$5");
                    C26338AVi.LJI(findViewById, 0, Integer.valueOf((int) C74275TDb.LIZ(4.0f)), 0, 0, false, 16);
                    TextView textView = (TextView) constraintLayout.findViewById(R.id.flv);
                    textView.setText(nickname);
                    textView.setVisibility(0);
                    ((ImageView) constraintLayout.findViewById(R.id.fha)).setVisibility(0);
                }
                C16880lQ.LJIL(constraintLayout, new C74329TFd(effectInfoStickerHandler, effect, nickname, interfaceC74334TFi));
            }
        } else {
            EffectInfoStickerHandler effectInfoStickerHandler2 = this.LJLIL;
            Effect effect2 = this.LJLILLLLZI;
            InterfaceC74334TFi interfaceC74334TFi2 = this.LJLJI;
            IDH LLLF = effectInfoStickerHandler2.LJFF().LLLF();
            if (LLLF != null) {
                List<String> list = null;
                if (interfaceC74334TFi2 != null) {
                    str = interfaceC74334TFi2.getNickname();
                    UrlModel avatarMedium = interfaceC74334TFi2.getAvatarMedium();
                    if (avatarMedium != null) {
                        list = avatarMedium.getUrlList();
                    }
                } else {
                    str = null;
                }
                LLLF.n4(str, list, new AqS101S0300000_12(effectInfoStickerHandler2, effect2, interfaceC74334TFi2, 3));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
