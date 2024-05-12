package X;

import Y.ARunnableS43S0100000_7;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TCq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC74264TCq extends C73365Sqn<Effect> implements View.OnClickListener {
    public T44 LJLJJL;
    public ObjectAnimator LJLJJLL;
    public final W5G LJLJL;
    public final ImageView LJLJLJ;
    public final ImageView LJLJLLL;
    public final InterfaceC74265TCr LJLL;
    public final TEZ LJLLI;
    public final TEF LJLLILLLL;
    public T4I<Effect> LJLLJ;

    public final void P() {
        ObjectAnimator objectAnimator = this.LJLJJLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LJLJLJ.setRotation(0.0f);
        ImageView imageView = this.LJLJLJ;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        imageView.setImageDrawable(C04270Et.LIZIZ(itemView.getContext(), R.drawable.vu));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition;
        DATA data = this.LJLIL;
        if (data == 0 || -1 == (adapterPosition = getAdapterPosition())) {
            return;
        }
        this.LJLLJ.fX(new TE8(data, adapterPosition, this.LJLILLLLZI, false, false, null, null, new AqS162S0100000_12(this, 1019), null, 760));
    }

    @Override // X.C73365Sqn
    public final void L(int i, Object obj) {
        List<String> urlList;
        String str;
        Effect data = (Effect) obj;
        o.LJIIIZ(data, "data");
        this.LJLJLLL.setAlpha(0.0f);
        if (ID0.LJJ(data)) {
            UrlModel iconUrl = data.getIconUrl();
            if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
                this.LJLJL.setImageAlpha(128);
                C78764Uvg.LJIIIZ(this.LJLJL, str, -1, -1);
            }
        } else {
            this.LJLJL.setImageResource(R.drawable.b5b);
        }
        this.LJLLILLLL.LIZ(data, new C47261Igj());
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setContentDescription(data.getName());
        int i2 = this.LJLILLLLZI;
        T44 t44 = this.LJLJJL;
        if (t44 == null || !t44.LJJIJIIJIL(data, i2, i)) {
            return;
        }
        this.itemView.post(new ARunnableS43S0100000_7(this, 92));
    }

    @Override // X.C73365Sqn
    public final void N(float f, boolean z) {
        if (z) {
            this.itemView.setOnTouchListener(new ViewOnTouchListenerC170476mZ(f, 100L, this.LJLJL));
        } else {
            this.itemView.setOnTouchListener(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C73365Sqn
    public final void M(Effect effect, TEA state, Integer num) {
        String str;
        Effect data = effect;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        String effectId = data.getEffectId();
        EffectTemplate effectTemplate = (EffectTemplate) this.LJLIL;
        if (effectTemplate != null) {
            str = effectTemplate.getEffectId();
        } else {
            str = null;
        }
        if (!o.LJ(effectId, str)) {
            return;
        }
        int i = TE9.LIZ[state.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        this.LJLJLJ.setVisibility(0);
                        ImageView imageView = this.LJLJLJ;
                        View itemView = this.itemView;
                        o.LJIIIIZZ(itemView, "itemView");
                        imageView.setImageDrawable(C04270Et.LIZIZ(itemView.getContext(), R.drawable.vv));
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJLJ, "rotation", 0.0f, 360.0f);
                        ofFloat.setDuration(800L);
                        ofFloat.setRepeatMode(1);
                        ofFloat.setRepeatCount(-1);
                        ofFloat.start();
                        this.LJLJJLL = ofFloat;
                    }
                } else {
                    P();
                    InterfaceC74265TCr interfaceC74265TCr = this.LJLL;
                    if (interfaceC74265TCr != null && !interfaceC74265TCr.LIZIZ((Effect) this.LJLIL)) {
                        this.LJLJLLL.setAlpha(0.0f);
                        this.LJLJLLL.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else {
                P();
            }
        } else {
            this.LJLJLJ.setVisibility(0);
        }
        if (C78866UxK.LJJJJZI(this.LJLLI, data)) {
            this.LJLJLLL.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            this.LJLJLLL.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC74264TCq(View view, InterfaceC74265TCr interfaceC74265TCr, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel) {
        super(view);
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLL = interfaceC74265TCr;
        this.LJLLI = stickerDataManager;
        this.LJLLILLLL = tagHandler;
        this.LJLLJ = viewModel;
        View findViewById = view.findViewById(R.id.ek1);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.img_sticker_icon)");
        this.LJLJL = (W5G) findViewById;
        View findViewById2 = view.findViewById(R.id.ek3);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.img_sticker_loading)");
        this.LJLJLJ = (ImageView) findViewById2;
        C16880lQ.LJIIJ(this, view);
        View findViewById3 = view.findViewById(R.id.ek0);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.img_sticker_back)");
        this.LJLJLLL = (ImageView) findViewById3;
    }
}
