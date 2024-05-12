package X;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.HashMap;

/* renamed from: X.8IM, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8IM extends FrameLayout implements C8IG {
    public C7GB LJLIL;
    public float LJLILLLLZI;
    public double LJLJI;
    public boolean LJLJJI;

    public String LIZ(C188727au c188727au) {
        return "click_list";
    }

    public boolean LJII(C188727au c188727au) {
        return false;
    }

    public boolean LJIIIIZZ() {
        return false;
    }

    public void LJIIIZ() {
        this.LJLJJI = true;
    }

    public HashMap<String, String> getShowContentInfo() {
        return new HashMap<>();
    }

    public final C7GB getDisplayCommodityCard() {
        return this.LJLIL;
    }

    public final double getMDuration() {
        return this.LJLJI;
    }

    public final boolean getMHasFinished() {
        return this.LJLJJI;
    }

    public final float getMProgress() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8IM(Context context) {
        super(context);
        a1.LJFF(context, "context");
    }

    public void LJFF(double d) {
        this.LJLJI = d;
    }

    public void LJI(float f) {
        this.LJLILLLLZI = f;
    }

    public void setCommodityCardMethod(C7G9 c7g9) {
        this.LJLIL = c7g9;
    }

    public final void setDisplayCommodityCard(C7GB c7gb) {
        this.LJLIL = c7gb;
    }

    public final void setMDuration(double d) {
        this.LJLJI = d;
    }

    public final void setMHasFinished(boolean z) {
        this.LJLJJI = z;
    }

    public final void setMProgress(float f) {
        this.LJLILLLLZI = f;
    }
}
