package X;

import android.animation.Animator;
import android.text.TextPaint;
import android.widget.ImageView;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Uk5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78045Uk5 extends C87797Ycz {
    public final /* synthetic */ C78046Uk6 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Runnable LJLJI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJLIL.setAlpha(1.0f);
        float f = 0.0f;
        this.LJLIL.LJLIL.setTranslationY(0.0f);
        this.LJLIL.LJLJJLL.setVisibility(8);
        C78720Uuy LIZ = C15650jR.LIZ().LIZ(((RankListV2Response.Bulletin) ListProtector.get(this.LJLIL.LJLLI, this.LJLILLLLZI)).icon.getUrls());
        LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        int width = this.LJLIL.LJLILLLLZI.getWidth();
        int height = this.LJLIL.LJLILLLLZI.getHeight();
        LIZ.LJ = width;
        LIZ.LJFF = height;
        LIZ.LJIIJJI(this.LJLIL.LJLILLLLZI);
        String obj = CXJ.LJFF(((RankListV2Response.Bulletin) ListProtector.get(this.LJLIL.LJLLI, this.LJLILLLLZI)).content, "").toString();
        this.LJLIL.LJLJI.setText(obj);
        C78046Uk6 c78046Uk6 = this.LJLIL;
        c78046Uk6.LJLJI.setScrollX(c78046Uk6.LIZ());
        C78046Uk6 c78046Uk62 = this.LJLIL;
        c78046Uk62.LJLLILLLL = this.LJLILLLLZI;
        c78046Uk62.LJLJJI.setVisibility(8);
        TextPaint paint = this.LJLIL.LJLJI.getPaint();
        if (paint != null) {
            f = paint.measureText(obj);
        }
        if (f > this.LJLIL.LJLJI.getWidth()) {
            this.LJLIL.LJLJJL.setVisibility(0);
        } else {
            this.LJLIL.LJLJJL.setVisibility(8);
        }
        this.LJLJI.run();
    }

    public C78045Uk5(C78046Uk6 c78046Uk6, int i, Runnable runnable) {
        this.LJLIL = c78046Uk6;
        this.LJLILLLLZI = i;
        this.LJLJI = runnable;
    }
}
