package X;

import android.graphics.drawable.Animatable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U3v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76583U3v extends C31356CSi {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public Animatable LJLJLJ;

    public final C47061t0 L() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-followView>(...)");
        return (C47061t0) value;
    }

    public final C2A8 M() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-rankNumTextView>(...)");
        return (C2A8) value;
    }

    public final C31470CWs N() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-userBadgeView>(...)");
        return (C31470CWs) value;
    }

    public final ImageView P() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-userImageView>(...)");
        return (ImageView) value;
    }

    public final C73116Smm Q() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-userImageViewBorder>(...)");
        return (C73116Smm) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76583U3v(ViewGroup parent) {
        super(R.layout.df2, parent);
        o.LJIIIZ(parent, "parent");
        this.LJLIL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 305));
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 308));
        this.LJLJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 309));
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 310));
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 306));
        this.LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 304));
        this.LJLJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 307));
    }
}
