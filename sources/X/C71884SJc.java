package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;
import v82.IDdS503S0100000_12;

/* renamed from: X.SJc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71884SJc extends C29701Eo {
    public final C62847OlX<Object> LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public Bitmap LJLJJI;

    public final synchronized void play() {
        if (this.LJLILLLLZI && this.LJLJI) {
            super.playAnimation();
        }
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C29701Eo
    public final void playAnimation() {
        List<String> urls;
        String str;
        LiveOuterService.LJJJLL().LJJIIZ();
        C71891SJj c71891SJj = C71891SJj.LIZ;
        String LIZ = CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_outside_demand_1");
        String name = this.LJLIL.LIZ;
        o.LJIIIZ(name, "name");
        o.LJ(name, "shortTouchEcommerceLuckyBag");
        c71891SJj.loadGeckoLottie(this, LIZ, "ttlive_lucky_bag.zip", false, new C71887SJf(this));
        ImageModel imageModel = (ImageModel) this.LJLIL.LJ;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && (str = (String) ORZ.LJLLLL(urls)) != null) {
            W5U.LJIIIIZZ(str).LJIIIZ(new IDdS503S0100000_12(this, 3));
        } else {
            this.LJLJI = true;
            play();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71884SJc(Context context, C62847OlX c62847OlX) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLIL = c62847OlX;
        addLottieOnCompositionLoadedListener(new C71883SJb(this));
        setLayoutParams(new ViewGroup.LayoutParams(C17N.LJIILL(c62847OlX.LIZIZ), C17N.LJIILL(c62847OlX.LIZJ)));
    }
}
