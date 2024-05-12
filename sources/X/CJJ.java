package X;

import Y.ACListenerS40S0200000_5;
import Y.ARunnableS16S0300000_5;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJJ extends CJM<EmoteModel> {
    public final InterfaceC28316B9k LJLIL;
    public final CJO LJLILLLLZI;
    public final CJN LJLJI;
    public final C47061t0 LJLJJI;
    public final FrameLayout LJLJJL;
    public boolean LJLJJLL;
    public final Handler LJLJL;

    @Override // X.CJM
    public final void L(int i, Object obj) {
        EmoteModel emote = (EmoteModel) obj;
        o.LJIIIZ(emote, "emote");
        ImageModel imageModel = emote.image;
        if (imageModel != null) {
            Drawable drawable = emote.emoteResource;
            if (drawable != null) {
                this.LJLJJI.setImageDrawable(drawable);
            } else {
                C15620jO.LIZJ(this.LJLJJI, imageModel, null, null, new CJK(i, emote, this), false);
            }
        }
        if (emote.shine && !this.LJLJJLL) {
            this.LJLJL.post(new ARunnableS16S0300000_5(new C76732zl(), this, emote, 14));
        }
        if (!emote.readOnly && emote.inputLimited) {
            this.LJLJJI.setColorFilter(ColorProtector.parseColor("#57ffffff"), PorterDuff.Mode.SRC_ATOP);
        } else {
            this.LJLJJI.setColorFilter((ColorFilter) null);
        }
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(this, emote, 72), this.itemView);
        this.itemView.setOnTouchListener(new CJL(i, emote, this));
    }

    public CJJ(View view, InterfaceC28316B9k interfaceC28316B9k, CJO cjo, CJN cjn) {
        super(view);
        this.LJLIL = interfaceC28316B9k;
        this.LJLILLLLZI = cjo;
        this.LJLJI = cjn;
        View findViewById = view.findViewById(R.id.f2j);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_emote)");
        this.LJLJJI = (C47061t0) findViewById;
        View findViewById2 = view.findViewById(R.id.jwd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.shine)");
        this.LJLJJL = (FrameLayout) findViewById2;
        this.LJLJL = new Handler(C16880lQ.LLJJJJ());
    }
}
